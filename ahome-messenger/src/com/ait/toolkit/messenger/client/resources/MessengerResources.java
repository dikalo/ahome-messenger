package com.ait.toolkit.messenger.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface MessengerResources extends ClientBundle {

	@Source("jquery.js")
	TextResource jQuery();

	@Source("messenger-theme-flat.1.4.2.js")
	TextResource themeFlatJs();

	@Source("messenger-theme-future.1.4.2.js")
	TextResource themeFutureJs();

	@Source("messenger.1.4.2.js")
	TextResource messengerJs();

	@Source("messenger.min.1.4.2.js")
	TextResource messengerMinJs();
}
