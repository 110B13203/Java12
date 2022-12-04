package class09.sub1;

public class CSphere {
	double radius;
	public CSphere(double r) {
		radius=r;
	}
	public void show() {
		System.out.println("radius:"+radius);
		System.out.println("²yÅéÅé¿n:"+(4*Math.PI*(radius*radius*radius)/3));
	}
}
