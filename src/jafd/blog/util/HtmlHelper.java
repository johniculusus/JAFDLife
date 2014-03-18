/**
 * @author John Angelo F. Diaz
 * Date Started : March 11, 2014
 */
package jafd.blog.util;

public class HtmlHelper  {
	public final static String DEFAULT_JSTYPE = "text/javascript";
	public final static String DEFAULT_CSSTYPE = "text/css";
	public final static String DEFAULT_CSSREL = "stylesheet";
	
	/**
	 * @param attribute - Common html attributes
	 * @param value - Html attribute value
	 * @return [attribute name]="[attribute value]"
	 */
	private static String getValidHtmlAttibute(String attribute, String value) {
		if (value != null && value.length()>0)
			return " "+attribute+"=\""+value+"\"";
		else
			return "";
	}
	
	private static String getValidType(String jsType) {
		return getValidHtmlAttibute("type", jsType);
	}
	
	private static String getValidCssRel(String cssRel) {
		return getValidHtmlAttibute("rel", cssRel);
	}
	
	private static String getValidSrc(String src) {
		return getValidHtmlAttibute("src", src);
	}
	
	private static String getValidHref(String href) {
		return getValidHtmlAttibute("href", href);
	}
	
	//HEADERS - JS CSS etc
	public static String insertJS(String src) {
		return "<script" + getValidType(DEFAULT_JSTYPE) + getValidSrc(src) + "></script>";
	}
	
	public static String insertCSS(String href) {
		return "<link" + getValidHref(href) + getValidType(DEFAULT_CSSTYPE) + getValidCssRel(DEFAULT_CSSREL) + ">";
	}
	
}
