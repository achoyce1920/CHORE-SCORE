public class AddUsers {

   private String userName;
   
   public AddUsers(String userName) {
      this.userName = userName;
   }
   
   public AddUsers() {
      userName = "";
   }   
   
   public void setUserName(String userName) {
      this.userName = userName;   
   }
   
   public String getUserName() {
      return userName;
   }
   
   public String toString() {
      return userName + "\n";
   }

}      
  