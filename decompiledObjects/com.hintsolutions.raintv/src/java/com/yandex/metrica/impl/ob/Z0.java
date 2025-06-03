/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.J
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.EnumSet
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.J;
import com.yandex.metrica.impl.ob.Pl;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.c0;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class z0 {
    private static final Set<Integer> a;
    private static final EnumSet<a1> b;
    private static final EnumSet<a1> c;
    private static final EnumSet<a1> d;
    private static final EnumSet<a1> e;
    private static final EnumSet<a1> f;
    private static final EnumSet<a1> g;
    private static final EnumSet<a1> h;
    public static final List<Integer> i;
    public static final List<Integer> j;

    static {
        int n7 = a1.H.b();
        int n8 = a1.L.b();
        int n10 = a1.g.b();
        int n11 = a1.G.b();
        int n12 = a1.E.b();
        int n13 = a1.F.b();
        int n14 = a1.N.b();
        Object object = new HashSet();
        for (int i3 = 0; i3 < 7; ++i3) {
            object.add((Object)(new Integer[]{n7, n8, n10, n11, n12, n13, n14})[i3]);
        }
        a = Collections.unmodifiableSet((Set)object);
        a1 a12 = a1.c;
        a1 a13 = a1.p;
        a1 a14 = a1.z;
        a1 a15 = a1.B;
        a1 a16 = a1.C;
        a1 a17 = a1.O;
        object = a1.q;
        a1 a18 = a1.I;
        a1 a19 = a1.K;
        b = EnumSet.of((Enum)a12, (Enum[])new a1[]{a13, a14, a15, a16, a17, object, a18, a19});
        a1 a110 = a1.i;
        a1 a111 = a1.j;
        a1 a112 = a1.t;
        a13 = a1.d;
        a1 a113 = a1.T;
        c = EnumSet.of((Enum)a110, (Enum[])new a1[]{a111, a112, a12, a13, a113, a14, a1.h, a1.s, a15, a16, a17, object, a18, a19, a1.c0});
        a17 = a1.f;
        a12 = a1.E;
        d = EnumSet.of((Enum)a17, (Enum)a110, (Enum)a111, (Enum)a12);
        a1 a114 = a1.D;
        a112 = a1.F;
        a15 = a1.G;
        a111 = a1.g;
        a1 a115 = a1.H;
        a1 a116 = a1.L;
        a16 = a1.r;
        a17 = a1.J;
        a1 a117 = a1.M;
        a110 = a1.e;
        e = EnumSet.of((Enum)a114, (Enum[])new a1[]{a12, a112, a15, a111, a115, a116, object, a18, a16, a17, a117, a19, a110});
        f = EnumSet.of((Enum)a1.v, (Enum)a1.w, (Enum)a1.x, (Enum)a1.a0);
        g = EnumSet.of((Enum)a110);
        h = EnumSet.of((Enum)object, (Enum)a18, (Enum)a19);
        i = Arrays.asList((Object[])new Integer[]{a13.b(), a1.P.b(), a14.b(), a113.b()});
        j = Arrays.asList((Object[])new Integer[]{a1.X.b()});
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static c0 a() {
        c0 c02 = new c0();
        c02.e = a1.x.b();
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            c02.b = jSONObject.put("stat_sending", (Object)jSONObject2.put("disabled", true)).toString();
            return c02;
        }
        catch (Throwable throwable) {
            return c02;
        }
    }

    public static c0 a(@NonNull String string, @NonNull Pl pl2) {
        return z0.a(string, a1.J, pl2);
    }

    private static c0 a(@Nullable String string, @NonNull a1 a12, @NonNull Pl pl2) {
        a12 = new J("", "", a12.b(), 0, pl2);
        if (string != null) {
            a12.i(string);
        }
        return a12;
    }

    public static c0 a(String string, String string2, boolean bl, @NonNull Pl pl2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"type", (Object)string);
        hashMap.put((Object)"link", (Object)string2);
        hashMap.put((Object)"auto", (Object)bl);
        return new J(Gl.g((Map)hashMap), "", a1.S.b(), 0, pl2);
    }

    public static c0 a(@Nullable String string, @NonNull byte[] byArray, @NonNull Pl pl2) {
        return new J(byArray, string, a1.L.b(), pl2);
    }

    public static boolean a(int n7) {
        return f.contains((Object)a1.a(n7));
    }

    public static boolean a(a1 a12) {
        return b.contains((Object)a12) ^ true;
    }

    public static c0 b(@NonNull String string, @NonNull Pl pl2) {
        return z0.a(string, a1.I, pl2);
    }

    public static boolean b(int n7) {
        return d.contains((Object)a1.a(n7));
    }

    public static boolean b(a1 a12) {
        return c.contains((Object)a12) ^ true;
    }

    public static c0 c(@Nullable String string, @NonNull Pl pl2) {
        return z0.a(string, a1.K, pl2);
    }

    public static boolean c(int n7) {
        return e.contains((Object)a1.a(n7));
    }

    public static boolean d(int n7) {
        return h.contains((Object)a1.a(n7)) ^ true;
    }

    public static boolean e(int n7) {
        return g.contains((Object)a1.a(n7));
    }

    public static boolean f(int n7) {
        return a.contains((Object)n7);
    }
}

