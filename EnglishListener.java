// Generated from English.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnglishParser}.
 */
public interface EnglishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnglishParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(EnglishParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(EnglishParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#nounphrase}.
	 * @param ctx the parse tree
	 */
	void enterNounphrase(EnglishParser.NounphraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#nounphrase}.
	 * @param ctx the parse tree
	 */
	void exitNounphrase(EnglishParser.NounphraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(EnglishParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(EnglishParser.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#noun}.
	 * @param ctx the parse tree
	 */
	void enterNoun(EnglishParser.NounContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#noun}.
	 * @param ctx the parse tree
	 */
	void exitNoun(EnglishParser.NounContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#verbphrase}.
	 * @param ctx the parse tree
	 */
	void enterVerbphrase(EnglishParser.VerbphraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#verbphrase}.
	 * @param ctx the parse tree
	 */
	void exitVerbphrase(EnglishParser.VerbphraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(EnglishParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(EnglishParser.VerbContext ctx);
}