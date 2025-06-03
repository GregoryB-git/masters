/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Dd;
import com.yandex.metrica.impl.ob.Kd;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.s;

@Deprecated
public class Fd
extends Dd {
    private static final Kd A;
    private static final Kd B;
    private static final Kd C;
    private static final Kd D;
    private static final Kd E;
    private static final Kd F;
    private static final Kd G;
    @Deprecated
    public static final Kd H;
    @Deprecated
    public static final Kd I;
    private static final Kd J;
    private static final Kd K;
    private static final Kd u;
    private static final Kd v;
    private static final Kd w;
    private static final Kd x;
    private static final Kd y;
    private static final Kd z;
    private Kd f = new Kd(u.b(), this.c());
    private Kd g = new Kd(v.b(), this.c());
    private Kd h = new Kd(w.b(), this.c());
    private Kd i = new Kd(x.b(), this.c());
    private Kd j = new Kd(y.b(), this.c());
    private Kd k = new Kd(z.b(), this.c());
    private Kd l = new Kd(A.b(), this.c());
    private Kd m = new Kd(B.b(), this.c());
    private Kd n = new Kd(C.b(), this.c());
    private Kd o = new Kd(D.b(), this.c());
    private Kd p = new Kd(E.b(), this.c());
    private Kd q = new Kd(F.b(), this.c());
    private Kd r = new Kd(G.b(), this.c());
    private Kd s = new Kd(J.b(), this.c());
    private Kd t = new Kd(K.b(), this.c());

    static {
        u = new Kd("SESSION_SLEEP_START_", null);
        v = new Kd("SESSION_ID_", null);
        w = new Kd("SESSION_COUNTER_ID_", null);
        x = new Kd("SESSION_INIT_TIME_", null);
        y = new Kd("SESSION_ALIVE_TIME_", null);
        z = new Kd("SESSION_IS_ALIVE_REPORT_NEEDED_", null);
        A = new Kd("BG_SESSION_ID_", null);
        B = new Kd("BG_SESSION_SLEEP_START_", null);
        C = new Kd("BG_SESSION_COUNTER_ID_", null);
        D = new Kd("BG_SESSION_INIT_TIME_", null);
        E = new Kd("IDENTITY_SEND_TIME_", null);
        F = new Kd("USER_INFO_", null);
        G = new Kd("REFERRER_", null);
        H = new Kd("APP_ENVIRONMENT", null);
        I = new Kd("APP_ENVIRONMENT_REVISION", null);
        J = new Kd("APP_ENVIRONMENT_", null);
        K = new Kd("APP_ENVIRONMENT_REVISION_", null);
    }

    public Fd(Context context, String string2) {
        super(context, string2);
        this.a(-1);
        this.c(0);
        this.b(0);
    }

    private void a(int n2) {
        com.yandex.metrica.impl.ob.b.a(this.b, this.j.a(), n2);
    }

    private void b(int n2) {
        com.yandex.metrica.impl.ob.b.a(this.b, this.h.a(), n2);
    }

    private void c(int n2) {
        com.yandex.metrica.impl.ob.b.a(this.b, this.f.a(), n2);
    }

    public long a(long l4) {
        String string2 = this.o.a();
        return this.b.getLong(string2, l4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Fd a(s.a a2) {
        Fd fd = this;
        synchronized (fd) {
            this.a(this.s.a(), a2.a);
            this.a(this.t.a(), a2.b);
            return this;
        }
    }

    public Boolean a(boolean bl) {
        return this.b.getBoolean(this.k.a(), bl);
    }

    public long b(long l4) {
        String string2 = this.n.a();
        return this.b.getLong(string2, l4);
    }

    public String b(String string2) {
        return this.b.getString(this.q.a(), null);
    }

    public long c(long l4) {
        String string2 = this.l.a();
        return this.b.getLong(string2, l4);
    }

    public long d(long l4) {
        String string2 = this.m.a();
        return this.b.getLong(string2, l4);
    }

    @Override
    public String d() {
        return "_boundentrypreferences";
    }

    public long e(long l4) {
        String string2 = this.i.a();
        return this.b.getLong(string2, l4);
    }

    public long f(long l4) {
        String string2 = this.h.a();
        return this.b.getLong(string2, l4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public s.a f() {
        Fd fd = this;
        synchronized (fd) {
            if (!this.b.contains(this.s.a())) return null;
            if (!this.b.contains(this.t.a())) return null;
            return new s.a(this.b.getString(this.s.a(), "{}"), this.b.getLong(this.t.a(), 0L));
        }
    }

    public long g(long l4) {
        String string2 = this.g.a();
        return this.b.getLong(string2, l4);
    }

    public boolean g() {
        boolean bl = this.b.contains(this.i.a()) || this.b.contains(this.j.a()) || this.b.contains(this.k.a()) || this.b.contains(this.f.a()) || this.b.contains(this.g.a()) || this.b.contains(this.h.a()) || this.b.contains(this.o.a()) || this.b.contains(this.m.a()) || this.b.contains(this.l.a()) || this.b.contains(this.n.a()) || this.b.contains(this.s.a()) || this.b.contains(this.q.a()) || this.b.contains(this.r.a()) || this.b.contains(this.p.a());
        return bl;
    }

    public long h(long l4) {
        String string2 = this.f.a();
        return this.b.getLong(string2, l4);
    }

    public void h() {
        this.b.edit().remove(this.o.a()).remove(this.n.a()).remove(this.l.a()).remove(this.m.a()).remove(this.i.a()).remove(this.h.a()).remove(this.g.a()).remove(this.f.a()).remove(this.k.a()).remove(this.j.a()).remove(this.q.a()).remove(this.s.a()).remove(this.t.a()).remove(this.r.a()).remove(this.p.a()).apply();
    }

    public long i(long l4) {
        String string2 = this.p.a();
        return this.b.getLong(string2, l4);
    }

    public Fd i() {
        return (Fd)this.a(this.r.a());
    }
}

