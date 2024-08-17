

package javaapplication2constuctor;
 
public class Constractor{
    double a,b,c,volume,rectangle,h,d,s,circle;
  
    Constractor(double p, double d){
        a = p;
        b = d;
        
    }
    Constractor(double s, double t,double q){
      a=s;
        b=t;
        c=q;  
    }
    void display1(){
          s = 0.5*(a+b+c);
        h = s*(s-a)*(s-b)*(s-c);
        volume = a*b*c;
          System.out.println(Math.sqrt(h));
          System.out.println(volume);
    }
        void display2(){
       d = 0.5*a*b; 
       rectangle = a*b;
       circle = Math.PI * a * a;
        System.out.println(d);
        System.out.println(rectangle);
            System.out.println(circle);
       
    }
   }

