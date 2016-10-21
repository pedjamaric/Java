package behavioral;

public abstract class TemplatePattern_A {

	abstract void method1();
	abstract void method2();
	abstract void method3();

	public TemplatePattern_A(int n) {
		templateMethod(n);
	}

	final void templateMethod(int n) {
		for (int i = 0; i < n; i++) {
			method1();
			method2();
			method3();
		}
	}
}