/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.authsdk.internal;

import com.yandex.authsdk.internal.ExternalLoginHandler;
import com.yandex.authsdk.internal.WebViewLoginActivity;

final class WebViewLoginActivity$$Lambda$1
implements ExternalLoginHandler.StateGenerator {
    private static final WebViewLoginActivity$$Lambda$1 instance = new WebViewLoginActivity$$Lambda$1();

    private WebViewLoginActivity$$Lambda$1() {
    }

    public static ExternalLoginHandler.StateGenerator lambdaFactory$() {
        return instance;
    }

    @Override
    public String generate() {
        return WebViewLoginActivity.lambda$onCreate$0();
    }
}

