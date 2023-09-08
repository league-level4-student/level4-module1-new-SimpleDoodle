package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	StringBuilder backwards = new StringBuilder();
    	backwards.append(unfunkifiedText);
    	backwards.reverse();
        return backwards.toString();

    }
}
