package cryptography.ellipticCurvesCryptosystems;

public class Point {
private double x;
private double y;
public Point(double x,double y) {
	this.x=x;
	this.y=y;
}
public void setX(double x) {this.x=x;}
public double getX() {return x;}
public void setY(double y) {this.y=y;}
public double getY() {return y;}
public String toString() {
	return "The point coordinates are: "+"X:"+x+" Y:"+y;
}
}
