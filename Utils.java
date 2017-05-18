public class Utils {



public static int getRandomColor(){
   Random rnd = new Random();
   return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
}

}
