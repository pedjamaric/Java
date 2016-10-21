package behavioral;

public class TemplatePattern_Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		TemplatePattern_A template = new TemplatePattern_HTML(1);
		System.out.println();
		template = new TemplatePattern_CSS(1);
	}

}
