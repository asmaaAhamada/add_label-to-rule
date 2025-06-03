// Generated from C:/Users/نو ككككككككككككككككك/IdeaProjects/untitled3/src/antler/HTMLParser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ProgramRoot}
	 * labeled alternative in {@link HTMLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramRoot(HTMLParser.ProgramRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(HTMLParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLStatement(HTMLParser.HTMLStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSSStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSSStatement(HTMLParser.CSSStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(HTMLParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(HTMLParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(HTMLParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationStatement(HTMLParser.FunctionDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclarationStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationStatement(HTMLParser.ClassDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceDeclarationStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclarationStatement(HTMLParser.InterfaceDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectCreationStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCreationStatement(HTMLParser.ObjectCreationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumDeclarationStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclarationStatement(HTMLParser.EnumDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsoleStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleStatement(HTMLParser.ConsoleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatementWrapper}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatementWrapper(HTMLParser.ExpressionStatementWrapperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Returnstatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatement(HTMLParser.ReturnstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Throwstatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowstatement(HTMLParser.ThrowstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectClassStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectClassStatement(HTMLParser.ObjectClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectInterfaceStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInterfaceStatement(HTMLParser.ObjectInterfaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(HTMLParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(HTMLParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Emitstatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitstatement(HTMLParser.EmitstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Thisstatement}
	 * labeled alternative in {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisstatement(HTMLParser.ThisstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Servicedeclaration}
	 * labeled alternative in {@link HTMLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServicedeclaration(HTMLParser.ServicedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Componentdeclaration}
	 * labeled alternative in {@link HTMLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentdeclaration(HTMLParser.ComponentdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Componentdefinition}
	 * labeled alternative in {@link HTMLParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentdefinition(HTMLParser.ComponentdefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProp(HTMLParser.SelectorPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InlineTemplateProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTemplateProp(HTMLParser.InlineTemplatePropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateUrlProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrlProp(HTMLParser.TemplateUrlPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleUrlsProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlsProp(HTMLParser.StyleUrlsPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StylesProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesProp(HTMLParser.StylesPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportsProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsProp(HTMLParser.ImportsPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandaloneProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneProp(HTMLParser.StandalonePropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InjectableDefinition}
	 * labeled alternative in {@link HTMLParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableDefinition(HTMLParser.InjectableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Htmlblock}
	 * labeled alternative in {@link HTMLParser#htmlProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlblock(HTMLParser.HtmlblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Htmlelement}
	 * labeled alternative in {@link HTMLParser#htmlProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlelement(HTMLParser.HtmlelementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosingHtml}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingHtml(HTMLParser.SelfClosingHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenTagOnlyHtml}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTagOnlyHtml(HTMLParser.OpenTagOnlyHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NestedHtml}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedHtml(HTMLParser.NestedHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterpolationContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationContent(HTMLParser.InterpolationContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringContent(HTMLParser.StringContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierContent(HTMLParser.IdentifierContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColonIdentifierContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonIdentifierContent(HTMLParser.ColonIdentifierContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAttribute(HTMLParser.SimpleAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuotedAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedAttribute(HTMLParser.QuotedAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoundAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundAttribute(HTMLParser.BoundAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttribute(HTMLParser.EventAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColonOnlyAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonOnlyAttribute(HTMLParser.ColonOnlyAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBlockWithTag}
	 * labeled alternative in {@link HTMLParser#cssProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlockWithTag(HTMLParser.CssBlockWithTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMultipleRules}
	 * labeled alternative in {@link HTMLParser#cssProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMultipleRules(HTMLParser.CssMultipleRulesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBasicRule}
	 * labeled alternative in {@link HTMLParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBasicRule(HTMLParser.CssBasicRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNestedRule}
	 * labeled alternative in {@link HTMLParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNestedRule(HTMLParser.CssNestedRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPropertyName}
	 * labeled alternative in {@link HTMLParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPropertyName(HTMLParser.CssPropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotSelector}
	 * labeled alternative in {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotSelector(HTMLParser.DotSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HashSelector}
	 * labeled alternative in {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashSelector(HTMLParser.HashSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleSelector}
	 * labeled alternative in {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(HTMLParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportModel}
	 * labeled alternative in {@link HTMLParser#importModelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModel(HTMLParser.ImportModelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportSimple}
	 * labeled alternative in {@link HTMLParser#exportModelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportSimple(HTMLParser.ExportSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportClass}
	 * labeled alternative in {@link HTMLParser#exportModelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportClass(HTMLParser.ExportClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableTyped}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTyped(HTMLParser.VariableTypedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableArrayAssignment}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableArrayAssignment(HTMLParser.VariableArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableThisBinding}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableThisBinding(HTMLParser.VariableThisBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDecorator}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecorator(HTMLParser.VariableDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorDefinition}
	 * labeled alternative in {@link HTMLParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorDefinition(HTMLParser.DecoratorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAssertionExpr}
	 * labeled alternative in {@link HTMLParser#typeAssertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssertionExpr(HTMLParser.TypeAssertionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumDef}
	 * labeled alternative in {@link HTMLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDef(HTMLParser.EnumDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumValues}
	 * labeled alternative in {@link HTMLParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValues(HTMLParser.EnumValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumValueRef}
	 * labeled alternative in {@link HTMLParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueRef(HTMLParser.EnumValueRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link HTMLParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(HTMLParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectClassInstance}
	 * labeled alternative in {@link HTMLParser#objectClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectClassInstance(HTMLParser.ObjectClassInstanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceDef}
	 * labeled alternative in {@link HTMLParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDef(HTMLParser.InterfaceDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectInterfaceInit}
	 * labeled alternative in {@link HTMLParser#objectInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInterfaceInit(HTMLParser.ObjectInterfaceInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectInterfaceProps}
	 * labeled alternative in {@link HTMLParser#objectInterfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInterfaceProps(HTMLParser.ObjectInterfacePropsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionFull}
	 * labeled alternative in {@link HTMLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionFull(HTMLParser.FunctionFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionArrow}
	 * labeled alternative in {@link HTMLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArrow(HTMLParser.FunctionArrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionShorthand}
	 * labeled alternative in {@link HTMLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionShorthand(HTMLParser.FunctionShorthandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamVars}
	 * labeled alternative in {@link HTMLParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamVars(HTMLParser.ParamVarsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamIdentifiers}
	 * labeled alternative in {@link HTMLParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamIdentifiers(HTMLParser.ParamIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamValues}
	 * labeled alternative in {@link HTMLParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamValues(HTMLParser.ParamValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallNormal}
	 * labeled alternative in {@link HTMLParser#callFunctios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallNormal(HTMLParser.CallNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallBacktick}
	 * labeled alternative in {@link HTMLParser#callFunctios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallBacktick(HTMLParser.CallBacktickContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsoleLog}
	 * labeled alternative in {@link HTMLParser#consolDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleLog(HTMLParser.ConsoleLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExpr}
	 * labeled alternative in {@link HTMLParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpr(HTMLParser.ReturnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThrowError}
	 * labeled alternative in {@link HTMLParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowError(HTMLParser.ThrowErrorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link HTMLParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(HTMLParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIdentifier}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIdentifier(HTMLParser.ExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprValue}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprValue(HTMLParser.ExprValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(HTMLParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTrue}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTrue(HTMLParser.ExprTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFalse}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFalse(HTMLParser.ExprFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCall}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCall(HTMLParser.ExprCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVarDecl}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVarDecl(HTMLParser.ExprVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatements}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(HTMLParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisAssignment}
	 * labeled alternative in {@link HTMLParser#thisStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAssignment(HTMLParser.ThisAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmitCall}
	 * labeled alternative in {@link HTMLParser#emitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitCall(HTMLParser.EmitCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralDef}
	 * labeled alternative in {@link HTMLParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralDef(HTMLParser.ObjectLiteralDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectPropertyPair}
	 * labeled alternative in {@link HTMLParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropertyPair(HTMLParser.ObjectPropertyPairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValues}
	 * labeled alternative in {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValues(HTMLParser.ArrayValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayStrings}
	 * labeled alternative in {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayStrings(HTMLParser.ArrayStringsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayOfMaps}
	 * labeled alternative in {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayOfMaps(HTMLParser.ArrayOfMapsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mapliteral}
	 * labeled alternative in {@link HTMLParser#mapLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapliteral(HTMLParser.MapliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tupleliteral}
	 * labeled alternative in {@link HTMLParser#tupleLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleliteral(HTMLParser.TupleliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgForDirective}
	 * labeled alternative in {@link HTMLParser#ngDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForDirective(HTMLParser.NgForDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgIfDirective}
	 * labeled alternative in {@link HTMLParser#ngDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIfDirective(HTMLParser.NgIfDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeNumber}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNumber(HTMLParser.TypeNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeNumberArray}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNumberArray(HTMLParser.TypeNumberArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeString}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeString(HTMLParser.TypeStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBoolean}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBoolean(HTMLParser.TypeBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeGenericArray}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGenericArray(HTMLParser.TypeGenericArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeTuple}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTuple(HTMLParser.TypeTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeEnum}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeEnum(HTMLParser.TypeEnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAny}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAny(HTMLParser.TypeAnyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeVoid}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVoid(HTMLParser.TypeVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCustom}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCustom(HTMLParser.TypeCustomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link HTMLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(HTMLParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignAnyType}
	 * labeled alternative in {@link HTMLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAnyType(HTMLParser.AssignAnyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_type(HTMLParser.Any_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductType}
	 * labeled alternative in {@link HTMLParser#product}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductType(HTMLParser.ProductTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectNew}
	 * labeled alternative in {@link HTMLParser#objectCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectNew(HTMLParser.ObjectNewContext ctx);
}