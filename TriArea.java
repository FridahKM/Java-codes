import java.util.*;

class Triangle{
        
         int height; int base; int opp; 
        // A constructor to initialize the class data members (without parameters)
         Triangle() {
         base= 10;
         height= 15;
         opp = 10;
         }
        //Parameterized constructor
        Triangle(int b,int h,int o) {
         base=b;
         height=h;
         opp =o;

         }
        //using setter
                public void setOpp(int o) {
                        opp = o;
                                        
                }
        //using setter
        public void setBase(int b) {
                base = b;
                                
        }
        //using setter
        public void setHeight(int h) {
                height = h;
                                
        }
        //using getter
                public int getOpp() {
                        return opp;
                                        
                }
        //using getter
        public int getBase() {
                return base;
                                
        }
        //using getter
        public int getHeight() {
                return height;
                                
        }
        public int area(){ 
                return ((getBase()*getHeight())/2);
			}
              
        public int parameter() {
                return (getBase()+getHeight()+getOpp());
                }
}

public class TriArea {

        public static void main(String[] args) {

                Triangle t1 = new Triangle();//Object r4 using constructor with parameters
                 t1.setOpp(3+(int)Math.ceil(Math.random()*25));
                 t1.setBase(10+(int)Math.ceil(Math.random()*45));
                 t1.setHeight(3+(int)Math.ceil(Math.random()*25));
                 System.out.println("The opposite of the triangle is "+t1.getOpp());
                 System.out.println("The base of the triangle is "+t1.getBase());
                 System.out.println("The height of the triangle is "+t1.getHeight());
                 System.out.println("The area of the triangle is "+objectArea(t1));
                 System.out.println("The parameter of the triangle is "+objectParameter(t1));
				 System.out.println("");
				 System.out.println("");
				 System.out.println("");
			Scanner scan =new Scanner(System.in);       
                 Triangle t2 = new Triangle();
                 System.out.println("Enter the value of the Hypotenus");
                 t2.setOpp(scan.nextInt());
                 System.out.println("Enter the value of the Base");
                 t2.setBase(scan.nextInt());
                 System.out.println("Enter the value of the Height");
                 t2.setHeight(scan.nextInt());
                 System.out.println("The opposite of the triangle is "+t2.getOpp());
                 System.out.println("The base of the triangle is "+t2.getBase());
                 System.out.println("The height of the triangle is "+t2.getHeight());
                 System.out.println("The area of the triangle is "+objectArea(t2));
                 System.out.println("The parameter of the triangle is "+objectParameter(t2));

        }
        public static int objectArea(Triangle t){ return t.area(); }
        public static int objectParameter(Triangle p) { return p.parameter();}
        public static Triangle createObject(){
			Triangle t3 = new Triangle();
			t3.setOpp(3+(int)Math.ceil(Math.random()*25));
            t3.setBase(10+(int)Math.ceil(Math.random()*45));
            t3.setHeight(3+(int)Math.ceil(Math.random()*25));
			return t3;
			}
}
