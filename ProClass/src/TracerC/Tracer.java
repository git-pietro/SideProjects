package TracerC;

public class Tracer {

	private static boolean tracingIsOn;

	static void trace(String word) {

		if (tracingIsOn == true) {
			System.out.println(word);
		} else {
			System.out.println("Tracing is off");
		}

	}

	static void on() {
		tracingIsOn = true;

	}

	static void off() {
		tracingIsOn = false;
	}

	public static void main(String args[]) {

		Tracer.on();
		Tracer.trace("Start");
		int i = 2;
		Tracer.off();
		Tracer.trace("i = " + i);
		// Tracer.trace( "i = %d", i );
		Tracer.on();
		Tracer.trace("End");
	}

}
