/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.yandex.authsdk.internal;

import com.yandex.authsdk.internal.BrowserLoginActivity;

final class BrowserLoginActivity$$Lambda$1
implements Runnable {
    private final BrowserLoginActivity arg$1;

    private BrowserLoginActivity$$Lambda$1(BrowserLoginActivity browserLoginActivity) {
        this.arg$1 = browserLoginActivity;
    }

    public static Runnable lambdaFactory$(BrowserLoginActivity browserLoginActivity) {
        return new BrowserLoginActivity$$Lambda$1(browserLoginActivity);
    }

    public void run() {
        BrowserLoginActivity.lambda$new$0(this.arg$1);
    }
}

