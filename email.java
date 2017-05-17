public class email {

  private String subject;
  private String message;
  private String senderName;
  private int color;
  

  public class email(String subject, String message, String senderName, int color){
    this.subject = subject;
    this.message = message;
    this.senderName = senderName;
    this.color = color;
  }
  
  public String getSubject(){
    return subject;
  }
  
  public void setSubject(String subject){
    this.subject = subject;
  }
  
  public String getMessage(){
    return message;
  }
  
  public void setMessage(String message){
    this.message = message;
  }
  
  public String getSenderName(){
    return senderName;
  }
  
  public void setSenderNae(String senderName){
    this.senderName = senderName;
  }
  
  public int getColor(){
    return color;
  }
 
  public void setColor(){
    this.color = color;
  }
}
