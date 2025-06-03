/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package A4;

import A4.e;
import U5.a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import r4.b;
import s4.i;

public final class g
implements a {
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;

    public g(a a8, a a9, a a10, a a11, a a12, a a13, a a14) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
        this.e = a12;
        this.f = a13;
        this.g = a14;
    }

    public static g a(a a8, a a9, a a10, a a11, a a12, a a13, a a14) {
        return new g(a8, a9, a10, a11, a12, a13, a14);
    }

    public static e c(s3.e e8, b b8, i i8, b b9, RemoteConfigManager remoteConfigManager, C4.a a8, SessionManager sessionManager) {
        return new e(e8, b8, i8, b9, remoteConfigManager, a8, sessionManager);
    }

    public e b() {
        return g.c((s3.e)this.a.get(), (b)this.b.get(), (i)this.c.get(), (b)this.d.get(), (RemoteConfigManager)this.e.get(), (C4.a)this.f.get(), (SessionManager)this.g.get());
    }
}

