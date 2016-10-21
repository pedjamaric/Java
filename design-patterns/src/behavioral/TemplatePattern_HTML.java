package behavioral;

public class TemplatePattern_HTML extends TemplatePattern_A {

	public TemplatePattern_HTML(int n) {
		super(n);
	}

	@Override
	void method1() {
		System.out.println("<html>\n<head>\n<title>Template Pattern by Predrag Maric</title>\n<head>");
	}

	@Override
	void method2() {
		System.out.println("<h1>Behavioral Design - Template Pattern</h1>");
	}

	@Override
	void method3() {
		System.out.println("<body><p>Hello Templete Pattern!</p></body>\n</html>");
	}

}
