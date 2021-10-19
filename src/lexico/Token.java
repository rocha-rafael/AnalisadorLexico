package lexico;

public class Token {
	public static int TK_IDENTIFICADOR = 0;
	public static int TK_NUMERO = 1;
	public static int TK_OPERADOR = 2;
	public static int TK_PONTUACAO = 3;
	public static int TK_ATRIBUICAO = 4;
	
	private int type;
	private String text;
	
	public Token(int type, String text) {
		super();
		this.type = type;
		this.text = text;
	}
	
	public Token() {
		super();
	}
	
	public int getType(){
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public String getText() {
		return text;
	}
	
	public void SetText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Token [type=" + type + ", text = " + text + "]";
	}
}
