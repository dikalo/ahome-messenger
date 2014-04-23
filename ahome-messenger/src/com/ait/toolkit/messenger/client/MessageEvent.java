package com.ait.toolkit.messenger.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

/** Message Object */
public class MessageEvent extends JsObject {

	public MessageEvent() {
		jsObj = JsoHelper.createObject();
	}

	public native void addEvent(String event, Function callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer[event] = function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		};
	}-*/;

}
