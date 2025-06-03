/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.CountDownLatch
 */
package O5;

import android.content.Intent;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.concurrent.CountDownLatch;

public final class f
implements Runnable {
    public final /* synthetic */ Intent o;
    public final /* synthetic */ CountDownLatch p;

    public /* synthetic */ f(Intent intent, CountDownLatch countDownLatch) {
        this.o = intent;
        this.p = countDownLatch;
    }

    public final void run() {
        FlutterFirebaseMessagingBackgroundService.j(this.o, this.p);
    }
}

