/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.concurrent.CancellationException
 */
package q6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import p6.B0;
import p6.S;
import p6.W;
import p6.u0;
import q6.d;

public final class c
extends d
implements S {
    private volatile c _immediate;
    public final Handler q;
    public final String r;
    public final boolean s;
    public final c t;

    public c(Handler handler, String string2) {
        this(handler, string2, false);
    }

    public /* synthetic */ c(Handler handler, String string2, int n8, g g8) {
        if ((n8 & 2) != 0) {
            string2 = null;
        }
        this(handler, string2);
    }

    public c(Handler handler, String string2, boolean bl) {
        c c8;
        c c9 = null;
        super(null);
        this.q = handler;
        this.r = string2;
        this.s = bl;
        if (bl) {
            c9 = this;
        }
        c9 = c8 = (this._immediate = c9);
        if (c8 == null) {
            this._immediate = c9 = new c(handler, string2, true);
        }
        this.t = c9;
    }

    @Override
    public void E(X5.g g8, Runnable runnable) {
        if (!this.q.post(runnable)) {
            this.J(g8, runnable);
        }
    }

    @Override
    public boolean F(X5.g g8) {
        if (this.s && Intrinsics.a((Object)Looper.myLooper(), (Object)this.q.getLooper())) {
            return false;
        }
        return true;
    }

    public final void J(X5.g g8, Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The task was rejected, the handler underlying the dispatcher '");
        stringBuilder.append((Object)this);
        stringBuilder.append("' was closed");
        u0.c(g8, new CancellationException(stringBuilder.toString()));
        W.b().E(g8, runnable);
    }

    public c K() {
        return this.t;
    }

    public boolean equals(Object object) {
        if (object instanceof c && ((c)object).q == this.q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode((Object)this.q);
    }

    @Override
    public String toString() {
        String string2;
        String string3 = string2 = this.I();
        if (string2 == null) {
            string2 = string3 = this.r;
            if (string3 == null) {
                string2 = this.q.toString();
            }
            string3 = string2;
            if (this.s) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(".immediate");
                string3 = string3.toString();
            }
        }
        return string3;
    }
}

