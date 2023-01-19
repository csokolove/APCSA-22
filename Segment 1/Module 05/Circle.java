public class Circle
{

private double radius;

// constructors
// postcondition: the instance variable is initialized
public Circle(double rad)
{

radius = rad;

}

// postcondition: the instance variable is initialized
public Circle(int diameter)
{
 radius = (double)(diameter / 2);
}

 // postcondition: returns the area of this circle, according to the
// formula: area = PI * r^2, where PI is the value of pi (3.1415…),
// r is the radius of the circle, and "^2" means raised to the second power.
// Use the Math class constant to represent the value of pi.
public double area()
{
return (Math.PI * Math.pow(radius, 2);
}

// There may be other instance variables, constructors,
// and methods that are not shown.
}