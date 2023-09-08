package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		StringBuilder caseSwap = new StringBuilder();
		caseSwap.append(unfunkifiedText);
		for (int i = 0; i < caseSwap.length(); i++) {
			if (i%2==0) {
				caseSwap.setCharAt(i, Character.toLowerCase(caseSwap.charAt(i)));
			}
			else {
				caseSwap.setCharAt(i, Character.toUpperCase(caseSwap.charAt(i)));
			}
		}
		return caseSwap.toString();
	}

}
