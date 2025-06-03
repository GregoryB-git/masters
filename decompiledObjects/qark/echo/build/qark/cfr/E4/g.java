/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package E4;

import E4.a;
import com.google.firebase.perf.session.SessionManager;
import q5.b;

public final class g
implements U5.a {
    public final a a;

    public g(a a8) {
        this.a = a8;
    }

    public static g a(a a8) {
        return new g(a8);
    }

    public static SessionManager c(a a8) {
        return (SessionManager)b.c(a8.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public SessionManager b() {
        return g.c(this.a);
    }
}

