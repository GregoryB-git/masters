/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.TimeUnit
 */
package F3;

import E3.f;
import F3.a;
import F3.b;
import F3.e;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c
implements b,
a {
    public final e a;
    public final int b;
    public final TimeUnit c;
    public final Object d = new Object();
    public CountDownLatch e;
    public boolean f = false;

    public c(e e8, int n8, TimeUnit timeUnit) {
        this.a = e8;
        this.b = n8;
        this.c = timeUnit;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(String string2, Bundle bundle) {
        Object object = this.d;
        synchronized (object) {
            try {
                block7 : {
                    f f8 = f.f();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Logging event ");
                    stringBuilder.append(string2);
                    stringBuilder.append(" to Firebase Analytics with params ");
                    stringBuilder.append((Object)bundle);
                    f8.i(stringBuilder.toString());
                    this.e = new CountDownLatch(1);
                    this.f = false;
                    this.a.a(string2, bundle);
                    f.f().i("Awaiting app exception callback from Analytics...");
                    try {
                        if (this.e.await((long)this.b, this.c)) {
                            this.f = true;
                            f.f().i("App exception callback received from Analytics listener.");
                        } else {
                            f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                        }
                        break block7;
                    }
                    catch (InterruptedException interruptedException) {}
                    f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.e = null;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void t(String string2, Bundle bundle) {
        bundle = this.e;
        if (bundle == null) {
            return;
        }
        if ("_ae".equals((Object)string2)) {
            bundle.countDown();
        }
    }
}

