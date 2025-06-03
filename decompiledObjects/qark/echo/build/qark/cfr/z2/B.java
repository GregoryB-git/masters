/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Set
 */
package z2;

import A2.c;
import A2.i;
import android.util.Log;
import java.util.Set;
import y2.a;
import z2.A;
import z2.L;
import z2.b;
import z2.e;
import z2.x;

public final class B
implements c.c,
L {
    public final a.f a;
    public final b b;
    public i c;
    public Set d;
    public boolean e;
    public final /* synthetic */ e f;

    public B(e e8, a.f f8, b b8) {
        this.f = e8;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = f8;
        this.b = b8;
    }

    @Override
    public final void a(x2.b b8) {
        x x8 = (x)e.A(this.f).get((Object)this.b);
        if (x8 != null) {
            x8.H(b8);
        }
    }

    @Override
    public final void b(x2.b b8) {
        e.r(this.f).post((Runnable)new A(this, b8));
    }

    @Override
    public final void c(i i8, Set set) {
        if (i8 != null && set != null) {
            this.c = i8;
            this.d = set;
            this.h();
            return;
        }
        Log.wtf((String)"GoogleApiManager", (String)"Received null response from onSignInSuccess", (Throwable)new Exception());
        this.a(new x2.b(4));
    }

    public final void h() {
        i i8;
        if (this.e && (i8 = this.c) != null) {
            this.a.o(i8, this.d);
        }
    }
}

