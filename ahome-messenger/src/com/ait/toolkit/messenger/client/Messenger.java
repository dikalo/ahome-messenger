package com.ait.toolkit.messenger.client;

import com.ait.toolkit.core.client.CSSUtil;
import com.ait.toolkit.messenger.client.resources.MessengerResources;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

/** Messenger class */
public class Messenger {

	private static final MessengerResources ressources = GWT.create(MessengerResources.class);

	private static final String MESSENGER_THEME_JS_ID = "ahome-messenger-theme-js-id";
	private static final String MESSENGER_JS_ID = "ahome-messenger-js-id";
	private static final String MESSENGER_CSS_ID = "ahome-messenger-css-id";
	private static final String VERSION = "1.4.2";
	private static final String RESOURCE_FOLDER = GWT.getModuleBaseURL() + "ahomeMessenger/";
	private static final String THEME_FOLDER = RESOURCE_FOLDER + VERSION + "/css/";

	private Messenger() {

	}

	static {
		load();
		setTheme(MessengerTheme.FUTURE);
	}

	public static native Message post(String message)/*-{
		var m = $wnd.Messenger().post(message);
		return @com.ait.toolkit.messenger.client.Message::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
	}-*/;

	public static native Message error(String message)/*-{
		var m = $wnd.Messenger().error(message);
		return @com.ait.toolkit.messenger.client.Message::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
	}-*/;

	public static native Message success(String message)/*-{
		var m = $wnd.Messenger().success(message);
		return @com.ait.toolkit.messenger.client.Message::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
	}-*/;

	public static native Message info(String message)/*-{
		var m = $wnd.Messenger().info(message);
		return @com.ait.toolkit.messenger.client.Message::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
	}-*/;

	public static native Message post(MessageOptions config)/*-{
		var peer = config.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var m = $wnd.Messenger().post(peer);
		return @com.ait.toolkit.messenger.client.Message::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
	}-*/;

	public static native void setOptions(MessengerOptions config)/*-{
		var peer = config.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.Messenger.options = peer;
	}-*/;

	public static native void hideAll()/*-{
		var peer = config.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.Messenger().hideAll();
	}-*/;

	public static void load() {
		if (!isLoaded()) {
			if (!isJqueryLoaded()) {
				ScriptInjector.fromString(ressources.jQuery().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
			}
			ScriptInjector.fromString(ressources.messengerMinJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
			CSSUtil.injectStyleSheet(THEME_FOLDER + "messenger.css");
		}
	}

	public static void setTheme(MessengerTheme theme) {
		String cssName = THEME_FOLDER + "messenger-theme-" + theme.name().toLowerCase() + ".css";
		if (theme.equals(MessengerTheme.FLAT)) {
			ScriptInjector.fromString(ressources.themeFlatJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		} else if (theme.equals(MessengerTheme.FUTURE)) {
			ScriptInjector.fromString(ressources.themeFutureJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		}

		CSSUtil.injectStyleSheet(cssName);
	}

	public static native boolean isLoaded()/*-{
		if (typeof $wnd.Messenger === "undefined" || $wnd.Messenger === null) {
			return false;
		}
		return true;
	}-*/;

	public static native boolean isJqueryLoaded()/*-{
		if (typeof $wnd.jQuery === "undefined" || $wnd.jQuery === null) {
			return false;
		}
		return true;
	}-*/;

}
