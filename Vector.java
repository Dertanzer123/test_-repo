


public class Vector{ 


public static Vector3 crossP(Vector3 in1,Vector3 in2){
return new Vector3(in1.y*in2.z-in1.z*in2.y,in1.z*in2.x-in1.x*in2.z,in1.x*in2.y-in1.y*in2.x);
}
public static Vector3 Vsum(Vector3 in1, Vector3 in2) 
{
return new Vector3(in1.x+in2.x,in1.y+in2.y,in1.z+in2.z);
}

}
class Vector3 {

double x;
double y;
double z;

Vector3(double x,double y,double z)
{
this.x=x;
this.y=y;
this.z=z;
}
public double lenght()
{
return Math.sqrt(x*x+y*y+z*z);
}



}