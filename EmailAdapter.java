public class EmailAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
   
     private Context context;
     private int layout;
     private List<Email> mails;


     public EmailAdapter(Context context , int layout, List<Email> mails){
       this.context = context;
       this.layout = layout;
       this.mails = mails;
     }

     public int getCount() {
       return mails.size();
     }
     public Object getItem(int position) {
       return mails.get(position);
     }

     public long getItemId(int id) {
           return id;
     }

     public int getItemCount() {
           return 0;
     }

      public EmailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(EmailAdapter.ViewHolder holder, int position) {
        holder.bind(mails.get(position),itemClickListener);
    }
   
     
   public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mark;
        public TextView textViewSubject;
        public TextView textViewMessage;
        public Color color;
     
        //constructor
        public ViewHolder(View itemView) {
            super(itemView);
            mark = (TextView) itemView.findViewById(R.id.mark);
            textViewSubject = (TextView) itemView.findViewById(R.id.textViewSubject);
            textViewMessage = (TextView) itemView.findViewById(R.id.textViewMessage);
  
        }

        public void bind(final Email mails, final OnItemClickListener listener){
            //procesar datos o renderizar
            mark.setText(mails.getSenderName());
            textViewSubject.setText(mails.getSUbject());
            //casteando el numero a String
            textViewMessage.setText(mails.getMessage());
            color.setColor(mails.getColor);
            //logica aplicada para la limitacion de la cantidad  en cada elemento fruta
            if(fruits.getCounter() == fruits.MAX_CANTIDAD){
                TextCounter.setTextColor(ContextCompat.getColor(activity,R.color.colorAlert));
                TextCounter.setTypeface(null, Typeface.BOLD);
            }else{
                TextCounter.setTextColor(ContextCompat.getColor(activity,R.color.defaultTextColor));
                TextCounter.setTypeface(null, Typeface.NORMAL);
            }
            //cambia tamaño de las imagenes para que ocupe el tamaño completo
            Picasso.with(activity).load(fruits.getImageBack()).fit().into(imageViewPoster);

            //añadirmos el evento click solo paa cuando pinchen las imagenes
            this.imageViewPoster.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(fruits,getAdapterPosition());
                }
            });
        }

  
}
