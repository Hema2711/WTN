package com.wipro.classandobj;

public class Box {
double Height,Depth,Width;
Box(double height,double depth,double width )
{
	Height=height;
	Depth=depth;
	Width=width;
}
double Volume()
{
	double volume;
		volume=Height*Depth*Width;
		return volume;
	}
public static void main(String[] args) {
	Box b=new Box(10,5.6,2.3);
	System.out.println(b.Volume());
}

}
