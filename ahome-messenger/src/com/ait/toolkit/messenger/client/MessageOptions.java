package com.ait.toolkit.messenger.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Configuration Options for the messenger post method
 */

public class MessageOptions extends JsObject {

	public MessageOptions() {
		jsObj = JsoHelper.createObject();
	}

	/**
	 * The text of the message
	 */
	public void setMessage(String value) {
		JsoHelper.setAttribute(jsObj, "message", value);
	}

	/**
	 * info, error or success are understood by the provided themes. You can also pass your own string, and that class will be added.
	 */
	public void setType(String value) {
		JsoHelper.setAttribute(jsObj, "type", value);
	}

	/**
	 * What theme class should be applied to the message? Defaults to the theme set for Messenger in general.
	 */
	public void setTheme(String value) {
		JsoHelper.setAttribute(jsObj, "theme", value);
	}

	/**
	 * What theme class should be applied to the message? Defaults to the theme set for Messenger in general.
	 */
	public void setTheme(MessengerTheme value) {
		JsoHelper.setAttribute(jsObj, "theme", value.name().toLowerCase());
	}

	/**
	 * A unique id. If supplied, only one message with that ID will be shown at a time.
	 */
	public void setId(String value) {
		JsoHelper.setAttribute(jsObj, "id", value);
	}

	/**
	 * Hide the newer message if there is an id collision, as opposed to the older
	 */
	public void setSingleton(boolean value) {
		JsoHelper.setAttribute(jsObj, "singleton", value);
	}

	/**
	 * Action links to put in the message, see the 'Actions' section on this page.
	 */
	public void setActions(JavaScriptObject value) {
		JsoHelper.setAttribute(jsObj, "actions", value);
	}

	/**
	 * Hide the message after the provided number of seconds
	 */
	public void setHideAfter(int value) {
		JsoHelper.setAttribute(jsObj, "hiderAfter", value);
	}

	/**
	 * Should a close button be added to the message?
	 */
	public void setShowCloseButton(boolean value) {
		JsoHelper.setAttribute(jsObj, "showCloseButon", value);
	}

	/**
	 * Specify the text the close button should use (default ×)
	 */
	public void setShowCloseButtonText(String value) {
		JsoHelper.setAttribute(jsObj, "showCloseButonTexf", value);
	}

	public void setErrorMessage(String value) {
		JsoHelper.setAttribute(jsObj, "errorMessage", value);
	}

	public void setSuccesMessage(String value) {
		JsoHelper.setAttribute(jsObj, "sucessMessage", value);
	}

	public void setDeleteAction(MessageAction action) {
		_setAction("delete", action);
	}

	public void setCancelAction(MessageAction action) {
		_setAction("cancel", action);
	}

	public void setRetryAction(MessageAction action) {
		_setAction("retry", action);
	}

	public native void setAction(Function callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.action = function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		};
	}-*/;

	public native void setEvents(MessageEvent value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var eventPeer = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.events = eventPeer;
	}-*/;

	private native void _setAction(String actionType, MessageAction value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var action = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		if (!peer.actions) {
			peer.actions = new $wnd.Object();
		}
		peer.actions[actionType] = action;
	}-*/;

}
