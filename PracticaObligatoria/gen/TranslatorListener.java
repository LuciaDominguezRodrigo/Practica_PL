// Generated from C:/Users/marco/Documents/GitHub/Practica_PL/PracticaObligatoria/src/Translator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TranslatorParser}.
 */
public interface TranslatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#axioma}.
	 * @param ctx the parse tree
	 */
	void enterAxioma(TranslatorParser.AxiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#axioma}.
	 * @param ctx the parse tree
	 */
	void exitAxioma(TranslatorParser.AxiomaContext ctx);
}