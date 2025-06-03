/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.HashMap
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Gm;
import com.yandex.metrica.impl.ob.Pl;
import com.yandex.metrica.impl.ob.Pm;
import com.yandex.metrica.impl.ob.Qm;
import com.yandex.metrica.impl.ob.Sm;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.c0;
import java.util.HashMap;

public class J
extends c0 {
    private HashMap<a, Integer> q = new HashMap();
    private Sm<String> r;
    private Sm<String> s;
    private Sm<String> t;
    private Sm<byte[]> u;
    private Sm<String> v;
    private Sm<String> w;

    @VisibleForTesting
    public J(@NonNull Pl pl2) {
        this.a(pl2);
    }

    public J(String string2, String string3, int n2, int n3, @NonNull Pl pl2) {
        this.a(pl2);
        this.b = this.h(string2);
        this.a = this.g(string3);
        this.e = n2;
        this.f = n3;
    }

    public J(String string2, String string3, int n2, @NonNull Pl pl2) {
        this(string2, string3, n2, 0, pl2);
    }

    public J(byte[] byArray, @Nullable String string2, int n2, @NonNull Pl pl2) {
        this.a(pl2);
        this.a(byArray);
        this.a = this.g(string2);
        this.e = n2;
    }

    @NonNull
    public static c0 a(@Nullable String string2, @NonNull Pl object) {
        object = new J((Pl)object);
        ((c0)object).e = a1.l.b();
        return super.d(((J)object).v.a(string2));
    }

    private void a(@NonNull Pl pl2) {
        this.r = new Qm(1000, "event name", pl2);
        this.s = new Pm(245760, "event value", pl2);
        this.t = new Pm(1024000, "event extended value", pl2);
        this.u = new Gm(245760, "event value bytes", pl2);
        this.v = new Qm(200, "user profile id", pl2);
        this.w = new Qm(10000, "UserInfo", pl2);
    }

    private void a(@Nullable String string2, @Nullable String string3, a a2) {
        if (com.yandex.metrica.impl.ob.b.b(string2, string3)) {
            this.q.put((Object)a2, (Object)(com.yandex.metrica.impl.ob.b.b(string2).length - com.yandex.metrica.impl.ob.b.b(string3).length));
        } else {
            this.q.remove((Object)a2);
        }
        this.t();
    }

    private String g(@Nullable String string2) {
        String string3 = this.r.a(string2);
        this.a(string2, string3, com.yandex.metrica.impl.ob.J$a.a);
        return string3;
    }

    private String h(String string2) {
        String string3 = this.s.a(string2);
        this.a(string2, string3, com.yandex.metrica.impl.ob.J$a.b);
        return string3;
    }

    public static c0 r() {
        c0 c02 = new c0();
        c02.e = a1.k.b();
        return c02;
    }

    private void t() {
        this.h = 0;
        for (Integer n2 : this.q.values()) {
            int n3 = this.h;
            this.h = n2 + n3;
        }
    }

    public J a(@NonNull HashMap<a, Integer> hashMap) {
        this.q = hashMap;
        return this;
    }

    @Override
    public final c0 a(@Nullable byte[] byArray) {
        byte[] byArray2 = this.u.a(byArray);
        a a2 = com.yandex.metrica.impl.ob.J$a.b;
        if (byArray.length != byArray2.length) {
            this.q.put((Object)a2, (Object)(byArray.length - byArray2.length));
        } else {
            this.q.remove((Object)a2);
        }
        this.t();
        return super.a(byArray2);
    }

    @Override
    public c0 b(String string2) {
        String string3 = this.r.a(string2);
        this.a(string2, string3, com.yandex.metrica.impl.ob.J$a.a);
        this.a = string3;
        return this;
    }

    @Override
    @NonNull
    public c0 d(@Nullable String string2) {
        return super.d(this.v.a(string2));
    }

    @Override
    public c0 e(String string2) {
        String string3 = this.w.a(string2);
        this.a(string2, string3, com.yandex.metrica.impl.ob.J$a.c);
        return super.e(string3);
    }

    @Override
    public c0 f(String string2) {
        String string3 = this.s.a(string2);
        this.a(string2, string3, com.yandex.metrica.impl.ob.J$a.b);
        this.b = string3;
        return this;
    }

    public J i(@NonNull String string2) {
        String string3 = this.t.a(string2);
        this.a(string2, string3, com.yandex.metrica.impl.ob.J$a.b);
        this.b = string3;
        return this;
    }

    @NonNull
    public HashMap<a, Integer> s() {
        return this.q;
    }
}

