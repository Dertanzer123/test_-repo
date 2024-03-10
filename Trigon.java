include Vector;
include Vertex;


Trigon{

Vertex v1;
Vertex v2;
Vertex v3;

Vector3 normal;

Trigon (Vertex v1,Vertex v2,Vertex v3){

this.v1=v1;
this.v2=v2;
this.v3=v3;


recalcnorm();

}
public void recalcnorm() 
{
 normal=Vector.crossP(Vsum(v1.position,v2.position.reverse() ) ,Vsum(v1.position,v3.position.reverse()));
}


}