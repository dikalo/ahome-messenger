package com.ait.toolkit.messenger.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 */

public class MessengerOptions extends JsObject {

	public MessengerOptions() {
		jsObj = JsoHelper.createObject();
	}

	/**
	 * Extra classes to be appended to the container. These can be used to configure the active theme. If you'd like the messenger box to be overlayed on the screen, you should
	 * provide the messenger-fixed class along with any of the following positioning classes: messenger-on-bottom, messenger-on-top, messenger-on-left, messenger-on-right. Adding
	 * the top or bottom class along with a left or right will move the messenger dialog into the specified corner.
	 */
	public void setExtraClasses(JsArrayString values) {
		JsoHelper.setAttribute(jsObj, "extraClasses", values);
	}

	/**
	 * The maximum number of messages to show at once
	 */
	public void setMaxMessages(int value) {
		JsoHelper.setAttribute(jsObj, "maxMessages", value);
	}

	/**
	 * Which locations should be tried when inserting the message container into the page. The default is ['body']. It accepts a list to allow you to try a variety of places when
	 * deciding what the optimal location is on any given page. This should generally not need to be changed unless you are inserting the messages into the flow of the document,
	 * rather than using messenger-fixed.
	 */
	public void setParentLocations(JsArrayString values) {
		JsoHelper.setAttribute(jsObj, "parentLocations", values);
	}

	public void setTheme(String value) {
		JsoHelper.setAttribute(jsObj, "theme", value);
	}

	public void setTheme(MessengerTheme value) {
		JsoHelper.setAttribute(jsObj, "theme", value.name().toLowerCase());
	}

	public void setMessageDefaults(JavaScriptObject value) {
		JsoHelper.setAttribute(jsObj, "messageDefaults", value);
	}

}
