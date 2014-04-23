package com.ait.toolkit.messenger.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

/** Message Object */
public class MessageAction extends JsObject {

	public MessageAction() {
		jsObj = JsoHelper.createObject();
	}

	public native void setLabel(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.label = value;
	}-*/;

	public native void setAction(Function callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.action = function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		};
	}-*/;

}
