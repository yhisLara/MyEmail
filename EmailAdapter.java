public class EmailAdapter extends BaseAdapter{
   
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
  
}
