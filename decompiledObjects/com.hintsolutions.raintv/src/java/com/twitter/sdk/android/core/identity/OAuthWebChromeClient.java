/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ConsoleMessage
 *  android.webkit.WebChromeClient
 *  java.lang.Object
 */
package com.twitter.sdk.android.core.identity;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

class OAuthWebChromeClient
extends WebChromeClient {
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }
}

