public class Opps{
      public static void main(String arg[]){
        // Pen pentonics = new Pen();
        // pentonics.setColor("yellow");
        // pentonics.Setthickness(5);
        // pentonics.getColor();
        // pentonics.getThickness();

       // ************STUDENTS CLASS***************

       // WITHOUT PARAMETER
       Students s1 = new Students();

    //    WITH PARAMETER
       Students s2 = new Students(5);

      }
}

// class Pen{
//     private int thickness;
//     private String color;
//     void getThickness(){
//         System.out.println(this.thickness);
//     }
//     void getColor(){
//         System.out.println(this.color);
//     }
//     void Setthickness(int thickness){
//         this.thickness = thickness;
//     }

//     void setColor(String color){
//         this.color = color;
//     }
// }


//  *****************CONTRUCTORS AND TYPES *******************************

class Students{
    int rollno;
    String name;

    Students(){
        System.out.println("CONTRUCTOR WITHOUT PARAMETERS");

    }

    Students(int rollno){
        System.out.println("CONSTRUCTOR WITH PARAMETERS");
    }
}

