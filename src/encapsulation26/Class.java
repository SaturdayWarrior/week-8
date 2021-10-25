package encapsulation26;

public class Class {
    public static class Encapsulation{

        //private variable declared there can only be accessed by public method of class
        private String name;
        private int rollNo;
        private int age;
        // get method for name to  access private variable name
        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name=name;
        }
        //get method for roll number to access privat variable rollNo.
        public int getRollNo(){
            return rollNo;
        }
        public void setRollNo(int rollNo){
            this.rollNo=rollNo;
        }
        //get method for age to access private variable age
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age=age;
        }
    }
        public static class TestEncapsulation {
            public static void main(String[] args) {
                Encapsulation obj = new Encapsulation();
                // setting value of the variable
                obj.setName("Prime");
                obj.setRollNo(19);
                obj.setAge(51);

                //Displaying value of the variable
                System.out.println("Prime's name: " + obj.getName());
                System.out.println("Prime's name: " + obj.getRollNo());
                System.out.println("Prime's name: " + obj.getAge());

                //Direct access of rollNO is not possible due to encapsulation
            }
        }
}


