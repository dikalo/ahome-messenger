package com.ait.toolkit.messenger.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/** Message Object */
public class Message extends JsObject {

	protected Message(JavaScriptObject peer) {
		jsObj = peer;
	}

	public native void show()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.show();
	}-*/;

	public native void hide()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.hide();
	}-*/;

	public native void cancel()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.cancel();
	}-*/;

	public native void update(MessageOptions config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var configPeer = config.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.update(configPeer);
	}-*/;

	public native void on(String event, Function callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.on(event, function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

}
