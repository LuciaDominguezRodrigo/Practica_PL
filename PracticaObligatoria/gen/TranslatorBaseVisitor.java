// Generated from C:/Users/Jorge/Documents/Jorge/URJC/3�/Procesadores de Lenguajes/Practica_PL/PracticaObligatoria/src/Translator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link TranslatorVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class TranslatorBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements TranslatorVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAxioma(TranslatorParser.AxiomaContext ctx) { return visitChildren(ctx); }
}