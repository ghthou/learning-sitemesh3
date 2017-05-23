package com.github.ghthou.learning.sitemesh3;

import org.sitemesh.SiteMeshContext;
import org.sitemesh.content.ContentProperty;
import org.sitemesh.content.tagrules.TagRuleBundle;
import org.sitemesh.content.tagrules.html.ExportTagToContentRule;
import org.sitemesh.tagprocessor.State;

/**
 * @Description 拓展标签类型
 */
public class ExpandTagRuleBundle implements TagRuleBundle {

	@Override
	public void install(State defaultState, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {
		defaultState.addRule("header", new ExportTagToContentRule(siteMeshContext, contentProperty.getChild("header"), false));
		defaultState.addRule("menu", new ExportTagToContentRule(siteMeshContext, contentProperty.getChild("menu"), false));
		defaultState.addRule("footer", new ExportTagToContentRule(siteMeshContext, contentProperty.getChild("footer"), false));
	}

	@Override
	public void cleanUp(State defaultState, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {

	}
}
