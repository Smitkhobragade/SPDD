

public class shape3D {

  //Sphere
  double volume(double rad){
    double vol;
    vol = Math.PI * (4/3) * rad * rad * rad;
    System.out.println("VOL OF SPHERE : "+vol);
    return vol;
  }

  // Cube
  int volume(int side){
    int vol = side * side * side;
    System.out.println("VOL OF CUBE : "+ vol);
    return vol;
  }

  double volume(double l,double b,double h){
    double vol = l*b*h;
    System.out.println("VOL OF CUBOID : "+ vol);
    return vol;
  }
  double volume(double h, double r){
    double vol = Math.PI * r * r * h;
    System.out.println("VOL OF CYLINDER : "+ vol);
    return vol;
  }

}
