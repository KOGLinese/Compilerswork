package main;

import java.io.IOException;

import lexer.Lexer;
import parser.Parser;

public class Main {

	public static void main(String[] args) throws IOException {
	    // TODO Auto-generated method stub
        Lexer lex=new Lexer();
        System.out.println(lex.scan());
	}
}
