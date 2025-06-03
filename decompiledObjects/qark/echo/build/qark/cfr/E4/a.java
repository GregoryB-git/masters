/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package E4;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import r4.b;
import s3.e;
import s4.i;

public class a {
    public final e a;
    public final i b;
    public final b c;
    public final b d;

    public a(e e8, i i8, b b8, b b9) {
        this.a = e8;
        this.b = i8;
        this.c = b8;
        this.d = b9;
    }

    public C4.a a() {
        return C4.a.g();
    }

    public e b() {
        return this.a;
    }

    public i c() {
        return this.b;
    }

    public b d() {
        return this.c;
    }

    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    public SessionManager f() {
        return SessionManager.getInstance();
    }

    public b g() {
        return this.d;
    }
}

