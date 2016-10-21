package behavioral;

public class TemplatePattern_CSS extends TemplatePattern_A {

	public TemplatePattern_CSS(int n) {
		super(n);
	}

	@Override
	void method1() {
		System.out.println("body" + '{' + "\nbackground-color: lightblue;\n" + '}');
	}

	@Override
	void method2() {
		System.out.println("h1" + '{' + "\ncolor: red;\ntext-align: center;\n" + '}');
	}

	@Override
	void method3() {
		System.out.println("p" + '{' + "\nfont-family: helvetica;\nfont-size: 19px;\n" + '}');
	}

}
