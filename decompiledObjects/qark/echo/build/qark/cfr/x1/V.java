/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 */
package x1;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.F;

public final class V {
    public final Handler a;
    public final F b;
    public final long c;
    public long d;
    public long e;
    public long f;

    public V(Handler handler, F f8) {
        Intrinsics.checkNotNullParameter(f8, "request");
        this.a = handler;
        this.b = f8;
        this.c = B.A();
    }

    public final void a(long l8) {
        this.d = l8 = this.d + l8;
        if (l8 >= this.e + this.c || l8 >= this.f) {
            this.c();
        }
    }

    public final void b(long l8) {
        this.f += l8;
    }

    public final void c() {
        if (this.d > this.e) {
            this.b.o();
        }
    }
}

