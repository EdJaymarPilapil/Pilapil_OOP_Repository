package Student;

class Student {
   String first_name = "";
   String middle_name = "";
   String last_name = "";
   String suffix = "";
   
   public String getFirstName(){
      return first_name;
   }
   
   public String getMiddleName(){
      return middle_name;
   }
   
   public String getLastName(){
      return last_name;
   }
   
   public String getSuffix(){
      return suffix;
   }
   
   public void setFirstName(String Fname){
      first_name = Fname;
   }
   
   public void setMiddleName(String Mname){
      middle_name = Mname;
   }

   public void setLastName(String Lname){
      last_name = Lname;
   }
   
   public void setSuffix(String Suffix){
      suffix = Suffix;
   }

   public String getFullName(){
      return first_name + " " + middle_name + " " + last_name + " " + suffix; 
   }



}