/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Set
 */
package z2;

import A2.i;
import android.util.Log;
import java.util.Set;
import x2.b;
import z2.B;
import z2.e;
import z2.x;

public final class A
implements Runnable {
    public final /* synthetic */ b o;
    public final /* synthetic */ B p;

    public A(B b8, b b9) {
        this.p = b8;
        this.o = b9;
    }

    public final void run() {
        Object object = this.p;
        object = (x)e.A(object.f).get((Object)B.e((B)object));
        if (object == null) {
            return;
        }
        if (this.o.i()) {
            B.f(this.p, true);
            if (B.d(this.p).m()) {
                B.g(this.p);
                return;
            }
            try {
                B b8 = this.p;
                B.d(b8).o(null, B.d(b8).e());
                return;
            }
            catch (SecurityException securityException) {
                Log.e((String)"GoogleApiManager", (String)"Failed to get service from broker. ", (Throwable)securityException);
                B.d(this.p).f("Failed to get service from broker.");
                object.G(new b(10), null);
                return;
            }
        }
        object.G(this.o, null);
    }
}

