/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  com.yandex.metrica.impl.ob.vl
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.concurrent.CountDownLatch
 */
package com.yandex.metrica.impl.ob;

import android.webkit.WebView;
import com.yandex.metrica.impl.ob.ul;
import com.yandex.metrica.impl.ob.vl;
import java.util.concurrent.CountDownLatch;

class tl
implements Runnable {
    public final vl a;
    public final WebView b;
    public final CountDownLatch c;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public tl(ul ul2, vl vl2, WebView webView, CountDownLatch countDownLatch) {
        this.a = vl2;
        this.b = webView;
        this.c = countDownLatch;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void run() {
        try {
            this.a.h = this.b.getUrl();
            this.a.i = this.b.getOriginalUrl();
            this.c.countDown();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

