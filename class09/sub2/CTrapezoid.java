package class09.sub2;

public class CTrapezoid {
	int upper,base,height;
	public CTrapezoid(int u,int b,int h) {
		upper=u;
		base=b;
		height=h;
	}
	public void show() {
		System.out.println("upper:"+upper);
		System.out.println("base:"+base);
		System.out.println("height:"+height);
		System.out.println("±è§Î­±¿n:"+((double)(upper+base)*height/2));
	}
}
