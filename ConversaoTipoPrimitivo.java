package fundamentos;

public class ConversaoTipoPrimitivo {
	
	public static void main(String[] args) {
		
		double a = 1; // o java converte implicitamente
		System.out.println(a);
		
		float b = (float) 1.2342342423; // CAST
		System.out.println(b);
		
		int c = 234;
		byte d = (byte) c; // CAST
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // CAST
		System.out.println(f);
	}

}
