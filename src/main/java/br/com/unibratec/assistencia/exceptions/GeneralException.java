package br.com.unibratec.assistencia.exceptions;

import org.omnifaces.util.Messages;

public class GeneralException extends Exception{
	
	/*
	 * Serializa��o gen�rica.
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * Construtor padr�o vazio.
	 */
	public GeneralException(){
	}
	
	/*
	 * Construtor recebendo um Exception e retornando para a classe pai tratar.
	 * @param Exception e
	 */
	public GeneralException(Exception e) {
		super(e);
	}
	
	/*
	 * Construtor recebendo uma String e enviando para o front JSF.
	 * @param String msg
	 */
	public GeneralException(String msg) {
		Messages.addGlobalError(msg);
	}
	
}
