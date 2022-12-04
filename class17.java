
public class class17 {

	public static void main(String[] args) {
		String x="262904713";
		short y=Short.parseShort(x);
		System.out.println(y);
	}

}
/*--------------------------------
Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"262904713" Radix:10
	at java.base/java.lang.Short.parseShort(Short.java:139)
	at java.base/java.lang.Short.parseShort(Short.java:163)
	at class17.main(class17.java:6)
----------------------------------*/