// Generated from Coffee.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoffeeParser}.
 */
public interface CoffeeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoffeeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoffeeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(CoffeeParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(CoffeeParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(CoffeeParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(CoffeeParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#opt_time}.
	 * @param ctx the parse tree
	 */
	void enterOpt_time(CoffeeParser.Opt_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#opt_time}.
	 * @param ctx the parse tree
	 */
	void exitOpt_time(CoffeeParser.Opt_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(CoffeeParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(CoffeeParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#brew}.
	 * @param ctx the parse tree
	 */
	void enterBrew(CoffeeParser.BrewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#brew}.
	 * @param ctx the parse tree
	 */
	void exitBrew(CoffeeParser.BrewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(CoffeeParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(CoffeeParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#flavor}.
	 * @param ctx the parse tree
	 */
	void enterFlavor(CoffeeParser.FlavorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#flavor}.
	 * @param ctx the parse tree
	 */
	void exitFlavor(CoffeeParser.FlavorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#drink}.
	 * @param ctx the parse tree
	 */
	void enterDrink(CoffeeParser.DrinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#drink}.
	 * @param ctx the parse tree
	 */
	void exitDrink(CoffeeParser.DrinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#place}.
	 * @param ctx the parse tree
	 */
	void enterPlace(CoffeeParser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#place}.
	 * @param ctx the parse tree
	 */
	void exitPlace(CoffeeParser.PlaceContext ctx);
}