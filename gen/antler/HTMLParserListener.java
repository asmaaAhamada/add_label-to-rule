// Generated from C:/Users/نو ككككككككككككككككك/IdeaProjects/untitled3/src/antler/HTMLParser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ProgramRoot}
	 * labeled alternative in {@link HTMLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramRoot(HTMLParser.ProgramRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramRoot}
	 * labeled alternative in {@link HTMLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramRoot(HTMLParser.ProgramRootContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HTMLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HTMLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(HTMLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(HTMLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Componentdefinition}
	 * labeled alternative in {@link HTMLParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentdefinition(HTMLParser.ComponentdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Componentdefinition}
	 * labeled alternative in {@link HTMLParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentdefinition(HTMLParser.ComponentdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterSelectorProp(HTMLParser.SelectorPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitSelectorProp(HTMLParser.SelectorPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InlineTemplateProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterInlineTemplateProp(HTMLParser.InlineTemplatePropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InlineTemplateProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitInlineTemplateProp(HTMLParser.InlineTemplatePropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateUrlProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrlProp(HTMLParser.TemplateUrlPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateUrlProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrlProp(HTMLParser.TemplateUrlPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleUrlsProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlsProp(HTMLParser.StyleUrlsPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleUrlsProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlsProp(HTMLParser.StyleUrlsPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StylesProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterStylesProp(HTMLParser.StylesPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StylesProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitStylesProp(HTMLParser.StylesPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportsProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterImportsProp(HTMLParser.ImportsPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportsProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitImportsProp(HTMLParser.ImportsPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandaloneProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneProp(HTMLParser.StandalonePropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandaloneProp}
	 * labeled alternative in {@link HTMLParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneProp(HTMLParser.StandalonePropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InjectableDefinition}
	 * labeled alternative in {@link HTMLParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInjectableDefinition(HTMLParser.InjectableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InjectableDefinition}
	 * labeled alternative in {@link HTMLParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInjectableDefinition(HTMLParser.InjectableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Htmlblock}
	 * labeled alternative in {@link HTMLParser#htmlProgram}.
	 * @param ctx the parse tree
	 */
	void enterHtmlblock(HTMLParser.HtmlblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Htmlblock}
	 * labeled alternative in {@link HTMLParser#htmlProgram}.
	 * @param ctx the parse tree
	 */
	void exitHtmlblock(HTMLParser.HtmlblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Htmlelement}
	 * labeled alternative in {@link HTMLParser#htmlProgram}.
	 * @param ctx the parse tree
	 */
	void enterHtmlelement(HTMLParser.HtmlelementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Htmlelement}
	 * labeled alternative in {@link HTMLParser#htmlProgram}.
	 * @param ctx the parse tree
	 */
	void exitHtmlelement(HTMLParser.HtmlelementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingHtml}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingHtml(HTMLParser.SelfClosingHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingHtml}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingHtml(HTMLParser.SelfClosingHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenTagOnlyHtml}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterOpenTagOnlyHtml(HTMLParser.OpenTagOnlyHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenTagOnlyHtml}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitOpenTagOnlyHtml(HTMLParser.OpenTagOnlyHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedHtml}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterNestedHtml(HTMLParser.NestedHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedHtml}
	 * labeled alternative in {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitNestedHtml(HTMLParser.NestedHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterpolationContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationContent(HTMLParser.InterpolationContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterpolationContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationContent(HTMLParser.InterpolationContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterStringContent(HTMLParser.StringContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitStringContent(HTMLParser.StringContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierContent(HTMLParser.IdentifierContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierContent(HTMLParser.IdentifierContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColonIdentifierContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterColonIdentifierContent(HTMLParser.ColonIdentifierContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColonIdentifierContent}
	 * labeled alternative in {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitColonIdentifierContent(HTMLParser.ColonIdentifierContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAttribute(HTMLParser.SimpleAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAttribute(HTMLParser.SimpleAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QuotedAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterQuotedAttribute(HTMLParser.QuotedAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QuotedAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitQuotedAttribute(HTMLParser.QuotedAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoundAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterBoundAttribute(HTMLParser.BoundAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoundAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitBoundAttribute(HTMLParser.BoundAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterEventAttribute(HTMLParser.EventAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitEventAttribute(HTMLParser.EventAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColonOnlyAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterColonOnlyAttribute(HTMLParser.ColonOnlyAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColonOnlyAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitColonOnlyAttribute(HTMLParser.ColonOnlyAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBlockWithTag}
	 * labeled alternative in {@link HTMLParser#cssProgram}.
	 * @param ctx the parse tree
	 */
	void enterCssBlockWithTag(HTMLParser.CssBlockWithTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBlockWithTag}
	 * labeled alternative in {@link HTMLParser#cssProgram}.
	 * @param ctx the parse tree
	 */
	void exitCssBlockWithTag(HTMLParser.CssBlockWithTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMultipleRules}
	 * labeled alternative in {@link HTMLParser#cssProgram}.
	 * @param ctx the parse tree
	 */
	void enterCssMultipleRules(HTMLParser.CssMultipleRulesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMultipleRules}
	 * labeled alternative in {@link HTMLParser#cssProgram}.
	 * @param ctx the parse tree
	 */
	void exitCssMultipleRules(HTMLParser.CssMultipleRulesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBasicRule}
	 * labeled alternative in {@link HTMLParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssBasicRule(HTMLParser.CssBasicRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBasicRule}
	 * labeled alternative in {@link HTMLParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssBasicRule(HTMLParser.CssBasicRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNestedRule}
	 * labeled alternative in {@link HTMLParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssNestedRule(HTMLParser.CssNestedRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNestedRule}
	 * labeled alternative in {@link HTMLParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssNestedRule(HTMLParser.CssNestedRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssPropertyName}
	 * labeled alternative in {@link HTMLParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterCssPropertyName(HTMLParser.CssPropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssPropertyName}
	 * labeled alternative in {@link HTMLParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitCssPropertyName(HTMLParser.CssPropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotSelector}
	 * labeled alternative in {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterDotSelector(HTMLParser.DotSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotSelector}
	 * labeled alternative in {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitDotSelector(HTMLParser.DotSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HashSelector}
	 * labeled alternative in {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterHashSelector(HTMLParser.HashSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HashSelector}
	 * labeled alternative in {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitHashSelector(HTMLParser.HashSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleSelector}
	 * labeled alternative in {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(HTMLParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleSelector}
	 * labeled alternative in {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(HTMLParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportModel}
	 * labeled alternative in {@link HTMLParser#importModelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportModel(HTMLParser.ImportModelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportModel}
	 * labeled alternative in {@link HTMLParser#importModelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportModel(HTMLParser.ImportModelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportSimple}
	 * labeled alternative in {@link HTMLParser#exportModelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExportSimple(HTMLParser.ExportSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportSimple}
	 * labeled alternative in {@link HTMLParser#exportModelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExportSimple(HTMLParser.ExportSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportClass}
	 * labeled alternative in {@link HTMLParser#exportModelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExportClass(HTMLParser.ExportClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportClass}
	 * labeled alternative in {@link HTMLParser#exportModelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExportClass(HTMLParser.ExportClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableTyped}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableTyped(HTMLParser.VariableTypedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableTyped}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableTyped(HTMLParser.VariableTypedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableArrayAssignment}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayAssignment(HTMLParser.VariableArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableArrayAssignment}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayAssignment(HTMLParser.VariableArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableThisBinding}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableThisBinding(HTMLParser.VariableThisBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableThisBinding}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableThisBinding(HTMLParser.VariableThisBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDecorator}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecorator(HTMLParser.VariableDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDecorator}
	 * labeled alternative in {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecorator(HTMLParser.VariableDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorDefinition}
	 * labeled alternative in {@link HTMLParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorDefinition(HTMLParser.DecoratorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorDefinition}
	 * labeled alternative in {@link HTMLParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorDefinition(HTMLParser.DecoratorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAssertionExpr}
	 * labeled alternative in {@link HTMLParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssertionExpr(HTMLParser.TypeAssertionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAssertionExpr}
	 * labeled alternative in {@link HTMLParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssertionExpr(HTMLParser.TypeAssertionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumDef}
	 * labeled alternative in {@link HTMLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDef(HTMLParser.EnumDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumDef}
	 * labeled alternative in {@link HTMLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDef(HTMLParser.EnumDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumValues}
	 * labeled alternative in {@link HTMLParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumValues(HTMLParser.EnumValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumValues}
	 * labeled alternative in {@link HTMLParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumValues(HTMLParser.EnumValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumValueRef}
	 * labeled alternative in {@link HTMLParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueRef(HTMLParser.EnumValueRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumValueRef}
	 * labeled alternative in {@link HTMLParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueRef(HTMLParser.EnumValueRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link HTMLParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(HTMLParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link HTMLParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(HTMLParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectClassInstance}
	 * labeled alternative in {@link HTMLParser#objectClass}.
	 * @param ctx the parse tree
	 */
	void enterObjectClassInstance(HTMLParser.ObjectClassInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectClassInstance}
	 * labeled alternative in {@link HTMLParser#objectClass}.
	 * @param ctx the parse tree
	 */
	void exitObjectClassInstance(HTMLParser.ObjectClassInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceDef}
	 * labeled alternative in {@link HTMLParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDef(HTMLParser.InterfaceDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceDef}
	 * labeled alternative in {@link HTMLParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDef(HTMLParser.InterfaceDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectInterfaceInit}
	 * labeled alternative in {@link HTMLParser#objectInterface}.
	 * @param ctx the parse tree
	 */
	void enterObjectInterfaceInit(HTMLParser.ObjectInterfaceInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectInterfaceInit}
	 * labeled alternative in {@link HTMLParser#objectInterface}.
	 * @param ctx the parse tree
	 */
	void exitObjectInterfaceInit(HTMLParser.ObjectInterfaceInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectInterfaceProps}
	 * labeled alternative in {@link HTMLParser#objectInterfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterObjectInterfaceProps(HTMLParser.ObjectInterfacePropsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectInterfaceProps}
	 * labeled alternative in {@link HTMLParser#objectInterfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitObjectInterfaceProps(HTMLParser.ObjectInterfacePropsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionFull}
	 * labeled alternative in {@link HTMLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionFull(HTMLParser.FunctionFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionFull}
	 * labeled alternative in {@link HTMLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionFull(HTMLParser.FunctionFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionArrow}
	 * labeled alternative in {@link HTMLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArrow(HTMLParser.FunctionArrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionArrow}
	 * labeled alternative in {@link HTMLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArrow(HTMLParser.FunctionArrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionShorthand}
	 * labeled alternative in {@link HTMLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionShorthand(HTMLParser.FunctionShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionShorthand}
	 * labeled alternative in {@link HTMLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionShorthand(HTMLParser.FunctionShorthandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamVars}
	 * labeled alternative in {@link HTMLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParamVars(HTMLParser.ParamVarsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamVars}
	 * labeled alternative in {@link HTMLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParamVars(HTMLParser.ParamVarsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamIdentifiers}
	 * labeled alternative in {@link HTMLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParamIdentifiers(HTMLParser.ParamIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamIdentifiers}
	 * labeled alternative in {@link HTMLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParamIdentifiers(HTMLParser.ParamIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamValues}
	 * labeled alternative in {@link HTMLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParamValues(HTMLParser.ParamValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamValues}
	 * labeled alternative in {@link HTMLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParamValues(HTMLParser.ParamValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallNormal}
	 * labeled alternative in {@link HTMLParser#callFunctios}.
	 * @param ctx the parse tree
	 */
	void enterCallNormal(HTMLParser.CallNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallNormal}
	 * labeled alternative in {@link HTMLParser#callFunctios}.
	 * @param ctx the parse tree
	 */
	void exitCallNormal(HTMLParser.CallNormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallBacktick}
	 * labeled alternative in {@link HTMLParser#callFunctios}.
	 * @param ctx the parse tree
	 */
	void enterCallBacktick(HTMLParser.CallBacktickContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallBacktick}
	 * labeled alternative in {@link HTMLParser#callFunctios}.
	 * @param ctx the parse tree
	 */
	void exitCallBacktick(HTMLParser.CallBacktickContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConsoleLog}
	 * labeled alternative in {@link HTMLParser#consolDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConsoleLog(HTMLParser.ConsoleLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConsoleLog}
	 * labeled alternative in {@link HTMLParser#consolDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConsoleLog(HTMLParser.ConsoleLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExpr}
	 * labeled alternative in {@link HTMLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(HTMLParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExpr}
	 * labeled alternative in {@link HTMLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(HTMLParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThrowError}
	 * labeled alternative in {@link HTMLParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowError(HTMLParser.ThrowErrorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThrowError}
	 * labeled alternative in {@link HTMLParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowError(HTMLParser.ThrowErrorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link HTMLParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(HTMLParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link HTMLParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(HTMLParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIdentifier}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprIdentifier(HTMLParser.ExprIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIdentifier}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprIdentifier(HTMLParser.ExprIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprValue}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprValue(HTMLParser.ExprValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprValue}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprValue(HTMLParser.ExprValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprString(HTMLParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprString(HTMLParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTrue}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprTrue(HTMLParser.ExprTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTrue}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprTrue(HTMLParser.ExprTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFalse}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFalse(HTMLParser.ExprFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFalse}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFalse(HTMLParser.ExprFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCall}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCall(HTMLParser.ExprCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCall}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCall(HTMLParser.ExprCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVarDecl}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprVarDecl(HTMLParser.ExprVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVarDecl}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprVarDecl(HTMLParser.ExprVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatements}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(HTMLParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatements}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(HTMLParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisAssignment}
	 * labeled alternative in {@link HTMLParser#thisStatement}.
	 * @param ctx the parse tree
	 */
	void enterThisAssignment(HTMLParser.ThisAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisAssignment}
	 * labeled alternative in {@link HTMLParser#thisStatement}.
	 * @param ctx the parse tree
	 */
	void exitThisAssignment(HTMLParser.ThisAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmitCall}
	 * labeled alternative in {@link HTMLParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmitCall(HTMLParser.EmitCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmitCall}
	 * labeled alternative in {@link HTMLParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmitCall(HTMLParser.EmitCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralDef}
	 * labeled alternative in {@link HTMLParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralDef(HTMLParser.ObjectLiteralDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralDef}
	 * labeled alternative in {@link HTMLParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralDef(HTMLParser.ObjectLiteralDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectPropertyPair}
	 * labeled alternative in {@link HTMLParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterObjectPropertyPair(HTMLParser.ObjectPropertyPairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectPropertyPair}
	 * labeled alternative in {@link HTMLParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitObjectPropertyPair(HTMLParser.ObjectPropertyPairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValues}
	 * labeled alternative in {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayValues(HTMLParser.ArrayValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValues}
	 * labeled alternative in {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayValues(HTMLParser.ArrayValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayStrings}
	 * labeled alternative in {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayStrings(HTMLParser.ArrayStringsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayStrings}
	 * labeled alternative in {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayStrings(HTMLParser.ArrayStringsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayOfMaps}
	 * labeled alternative in {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayOfMaps(HTMLParser.ArrayOfMapsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayOfMaps}
	 * labeled alternative in {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayOfMaps(HTMLParser.ArrayOfMapsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mapliteral}
	 * labeled alternative in {@link HTMLParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMapliteral(HTMLParser.MapliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mapliteral}
	 * labeled alternative in {@link HTMLParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMapliteral(HTMLParser.MapliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tupleliteral}
	 * labeled alternative in {@link HTMLParser#tupleLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTupleliteral(HTMLParser.TupleliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tupleliteral}
	 * labeled alternative in {@link HTMLParser#tupleLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTupleliteral(HTMLParser.TupleliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgForDirective}
	 * labeled alternative in {@link HTMLParser#ngDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgForDirective(HTMLParser.NgForDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgForDirective}
	 * labeled alternative in {@link HTMLParser#ngDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgForDirective(HTMLParser.NgForDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgIfDirective}
	 * labeled alternative in {@link HTMLParser#ngDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgIfDirective(HTMLParser.NgIfDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgIfDirective}
	 * labeled alternative in {@link HTMLParser#ngDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgIfDirective(HTMLParser.NgIfDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeNumber}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeNumber(HTMLParser.TypeNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeNumber}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeNumber(HTMLParser.TypeNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeNumberArray}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeNumberArray(HTMLParser.TypeNumberArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeNumberArray}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeNumberArray(HTMLParser.TypeNumberArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeString}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeString(HTMLParser.TypeStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeString}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeString(HTMLParser.TypeStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeBoolean}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBoolean(HTMLParser.TypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeBoolean}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBoolean(HTMLParser.TypeBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeGenericArray}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeGenericArray(HTMLParser.TypeGenericArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeGenericArray}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeGenericArray(HTMLParser.TypeGenericArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeTuple}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeTuple(HTMLParser.TypeTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeTuple}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeTuple(HTMLParser.TypeTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeEnum}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeEnum(HTMLParser.TypeEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeEnum}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeEnum(HTMLParser.TypeEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAny}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeAny(HTMLParser.TypeAnyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAny}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeAny(HTMLParser.TypeAnyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeVoid}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeVoid(HTMLParser.TypeVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeVoid}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeVoid(HTMLParser.TypeVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeCustom}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeCustom(HTMLParser.TypeCustomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeCustom}
	 * labeled alternative in {@link HTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeCustom(HTMLParser.TypeCustomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link HTMLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(HTMLParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link HTMLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(HTMLParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignAnyType}
	 * labeled alternative in {@link HTMLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignAnyType(HTMLParser.AssignAnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignAnyType}
	 * labeled alternative in {@link HTMLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignAnyType(HTMLParser.AssignAnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(HTMLParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(HTMLParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductType}
	 * labeled alternative in {@link HTMLParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProductType(HTMLParser.ProductTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductType}
	 * labeled alternative in {@link HTMLParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProductType(HTMLParser.ProductTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectNew}
	 * labeled alternative in {@link HTMLParser#objectCreation}.
	 * @param ctx the parse tree
	 */
	void enterObjectNew(HTMLParser.ObjectNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectNew}
	 * labeled alternative in {@link HTMLParser#objectCreation}.
	 * @param ctx the parse tree
	 */
	void exitObjectNew(HTMLParser.ObjectNewContext ctx);
}