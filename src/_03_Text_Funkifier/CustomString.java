package _03_Text_Funkifier;

public class CustomString implements TextFunkifier {
	private String unfunkifiedText;

	public CustomString(String unfunkifiedText) {

		this.unfunkifiedText = unfunkifiedText;
		
	}

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		StringBuilder customResult = new StringBuilder();
		customResult.append(unfunkifiedText);
		customResult.trimToSize();
		return unfunkifiedText.trim();
	}

}
