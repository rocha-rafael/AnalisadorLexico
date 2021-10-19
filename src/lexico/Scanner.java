package lexico;

public class Scanner {
	
	private char[] content;
	private int estado;
	private int pos;
	
	public Scanner(String filname) {
		try {
			String txtConteudo;
			txtConteudo = new String(Files.readAllBytes(Paths.get(filname)),StandardCharsets.UTF_8);
			System.out.println("----------- DEBUG -----------");
			System.out.println(txtConteudo);
			System.out.println("--------- FIM DEBUG ---------");
			content = txtConteudo.toCharArray();
			pos = 0;
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public Token nextToken() {
		char currentChar;
	}
		if(isFimArquivo()) {
			return null;
		}
		estado = 0;
		while(true) {
			currentChar = nextChar();
			switch (estado) {
			case 0:  
			}
	}
	
	private boolean isDigit(char c) {
		return c >= '0' && c <= '9';
	}
	
	private boolean isChar(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}
	
	private boolean isOperator(char c) {
		return c == '>' || c == '<' || c == '=' || c == '!';
	}
	
	private boolean isSpace(char c) {
		return c == ' ' || c == '\t' || c == '\n' || c == '\r';
	}
	
	private int nextChar(char c) {
		return content[pos++];
	}
	
	private boolean isFimArquivo1() {
		return pos == content.length;
	}
	
	private void back() {
		pos--;
	}
	
}