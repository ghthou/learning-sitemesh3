package com.github.ghthou.learning.sitemesh3;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * @Description 自定义过滤器
 */
public class MySiteMeshFilter extends ConfigurableSiteMeshFilter {

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		//builder.addDecoratorPath("/*", "/decorator.html");
	}
}
