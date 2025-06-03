/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.authsdk.internal;

import com.yandex.authsdk.internal.BrowserLoginActivity;
import com.yandex.authsdk.internal.ExternalLoginHandler;

final class BrowserLoginActivity$$Lambda$4
implements ExternalLoginHandler.StateGenerator {
    private static final BrowserLoginActivity$$Lambda$4 instance = new BrowserLoginActivity$$Lambda$4();

    private BrowserLoginActivity$$Lambda$4() {
    }

    public static ExternalLoginHandler.StateGenerator lambdaFactory$() {
        return instance;
    }

    @Override
    public String generate() {
        return BrowserLoginActivity.lambda$onCreate$1();
    }
}

