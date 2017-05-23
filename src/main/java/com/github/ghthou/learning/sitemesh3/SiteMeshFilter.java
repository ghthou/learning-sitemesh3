package com.github.ghthou.learning.sitemesh3;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * @Description 自定义过滤器
 */
public class SiteMeshFilter extends ConfigurableSiteMeshFilter {

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		//builder.addDecoratorPath("/index.html", "/decorators/default.html").addDecoratorPath("/index.jsp", "/decorators/default.jsp").addDecoratorPaths("/multi.jsp", "/decorators/multi_1.jsp", "/decorators/multi_2.jsp", "/decorators/multi_3.jsp").addExcludedPath("/exclude/*");
	}
}
