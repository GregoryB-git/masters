/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.util.SparseArray
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.J1$a
 *  com.yandex.metrica.impl.ob.J1$b
 *  com.yandex.metrica.impl.ob.ce
 *  com.yandex.metrica.impl.ob.de
 *  com.yandex.metrica.impl.ob.e6
 *  com.yandex.metrica.impl.ob.ee
 *  com.yandex.metrica.impl.ob.fe
 *  com.yandex.metrica.impl.ob.ge
 *  com.yandex.metrica.impl.ob.gf
 *  com.yandex.metrica.impl.ob.hc$a
 *  com.yandex.metrica.impl.ob.he
 *  com.yandex.metrica.impl.ob.ie
 *  com.yandex.metrica.impl.ob.if$f
 *  com.yandex.metrica.impl.ob.jf
 *  com.yandex.metrica.impl.ob.ke
 *  com.yandex.metrica.impl.ob.le
 *  com.yandex.metrica.impl.ob.oe
 *  com.yandex.metrica.impl.ob.pe
 *  com.yandex.metrica.impl.ob.qe
 *  com.yandex.metrica.impl.ob.re
 *  com.yandex.metrica.impl.ob.te
 *  com.yandex.metrica.impl.ob.xe
 *  com.yandex.metrica.impl.ob.ye
 *  com.yandex.metrica.impl.ob.ze
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Calendar
 *  java.util.Collections
 *  java.util.GregorianCalendar
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.J1;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.ce;
import com.yandex.metrica.impl.ob.de;
import com.yandex.metrica.impl.ob.e6;
import com.yandex.metrica.impl.ob.ee;
import com.yandex.metrica.impl.ob.fe;
import com.yandex.metrica.impl.ob.ge;
import com.yandex.metrica.impl.ob.gf;
import com.yandex.metrica.impl.ob.hc;
import com.yandex.metrica.impl.ob.he;
import com.yandex.metrica.impl.ob.ie;
import com.yandex.metrica.impl.ob.if;
import com.yandex.metrica.impl.ob.jf;
import com.yandex.metrica.impl.ob.ke;
import com.yandex.metrica.impl.ob.le;
import com.yandex.metrica.impl.ob.oe;
import com.yandex.metrica.impl.ob.pe;
import com.yandex.metrica.impl.ob.qe;
import com.yandex.metrica.impl.ob.re;
import com.yandex.metrica.impl.ob.te;
import com.yandex.metrica.impl.ob.xe;
import com.yandex.metrica.impl.ob.ye;
import com.yandex.metrica.impl.ob.ze;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class J1 {
    private static Map<e6, Integer> a;
    private static SparseArray<e6> b;
    private static final Map<a1, Integer> c;
    private static final Map<a1, ke> d;
    public static final int e = 0;

    static {
        Object object = new HashMap();
        Object object2 = e6.b;
        object.put(object2, (Object)0);
        Object object3 = e6.c;
        Object object4 = 1;
        object.put(object3, object4);
        a = Collections.unmodifiableMap((Map)object);
        object = new SparseArray();
        object.put(0, object2);
        object.put(1, object3);
        b = object;
        HashMap hashMap = new HashMap();
        object2 = a1.d;
        hashMap.put(object2, object4);
        a1 a12 = a1.e;
        hashMap.put((Object)a12, (Object)4);
        a1 a13 = a1.z;
        hashMap.put((Object)a13, (Object)5);
        a1 a14 = a1.h;
        hashMap.put((Object)a14, (Object)7);
        a1 a15 = a1.D;
        Object object5 = 3;
        hashMap.put((Object)a15, object5);
        object4 = a1.G;
        Object object6 = 26;
        hashMap.put(object4, object6);
        object = a1.F;
        hashMap.put(object, object6);
        a1 a16 = a1.E;
        hashMap.put((Object)a16, object6);
        a1 a17 = a1.N;
        hashMap.put((Object)a17, (Object)25);
        object3 = a1.q;
        hashMap.put(object3, object5);
        a1 a18 = a1.I;
        hashMap.put((Object)a18, object6);
        a1 a19 = a1.r;
        hashMap.put((Object)a19, object5);
        object5 = a1.J;
        hashMap.put(object5, object6);
        a1 a110 = a1.M;
        hashMap.put((Object)a110, object6);
        a1 a111 = a1.K;
        hashMap.put((Object)a111, object6);
        a1 a112 = a1.g;
        hashMap.put((Object)a112, (Object)6);
        a1 a113 = a1.H;
        Object object7 = 27;
        hashMap.put((Object)a113, object7);
        object6 = a1.L;
        hashMap.put(object6, object7);
        a1 a114 = a1.t;
        hashMap.put((Object)a114, (Object)8);
        hashMap.put((Object)a1.u, (Object)28);
        object7 = a1.y;
        hashMap.put(object7, (Object)11);
        a1 a115 = a1.i;
        Object object8 = 12;
        hashMap.put((Object)a115, object8);
        a1 a116 = a1.j;
        hashMap.put((Object)a116, object8);
        a1 a117 = a1.P;
        hashMap.put((Object)a117, (Object)13);
        a1 a118 = a1.Q;
        hashMap.put((Object)a118, (Object)2);
        a1 a119 = a1.S;
        hashMap.put((Object)a119, (Object)16);
        object8 = a1.T;
        hashMap.put(object8, (Object)17);
        a1 a120 = a1.U;
        hashMap.put((Object)a120, (Object)18);
        a1 a121 = a1.V;
        hashMap.put((Object)a121, (Object)19);
        a1 a122 = a1.k;
        hashMap.put((Object)a122, (Object)20);
        a1 a123 = a1.m;
        hashMap.put((Object)a123, (Object)21);
        a1 a124 = a1.n;
        hashMap.put((Object)a124, (Object)40);
        a1 a125 = a1.o;
        hashMap.put((Object)a125, (Object)35);
        hashMap.put((Object)a1.X, (Object)29);
        a1 a126 = a1.Y;
        hashMap.put((Object)a126, (Object)30);
        a1 a127 = a1.Z;
        hashMap.put((Object)a127, (Object)34);
        a1 a128 = a1.b0;
        hashMap.put((Object)a128, (Object)36);
        a1 a129 = a1.c0;
        hashMap.put((Object)a129, (Object)38);
        c = Collections.unmodifiableMap((Map)hashMap);
        HashMap hashMap2 = new HashMap();
        fe fe2 = new fe();
        hashMap = new ie();
        ge ge2 = new ge();
        ce ce2 = new ce();
        xe xe2 = new xe();
        te te2 = new te();
        ke ke2 = ke.a().a((ye)te2).a((he)te2).a();
        ke ke3 = ke.a().a((ye)hashMap).a();
        te2 = ke.a().a((ye)ce2).a();
        ke ke4 = ke.a().a((ye)xe2).a();
        ke ke5 = ke.a().a((qe)fe2).a();
        xe2 = ke.a().a((ye)new ze()).a();
        hashMap2.put((Object)a12, (Object)ke3);
        hashMap2.put((Object)a13, (Object)ke.a().a((ye)new a()).a());
        hashMap2.put((Object)a14, (Object)ke.a().a((qe)fe2).a((ye)ge2).a((pe)new de()).a((re)new ee()).a());
        hashMap2.put(object3, (Object)ke2);
        hashMap2.put((Object)a19, (Object)ke2);
        hashMap2.put((Object)a18, (Object)ke2);
        hashMap2.put(object5, (Object)ke2);
        hashMap2.put((Object)a110, (Object)ke2);
        hashMap2.put((Object)a111, (Object)ke2);
        hashMap2.put((Object)a112, (Object)ke3);
        hashMap2.put((Object)a113, (Object)te2);
        hashMap2.put(object6, (Object)te2);
        hashMap2.put((Object)a114, (Object)ke.a().a((ye)hashMap).a((he)new oe()).a());
        hashMap2.put(object7, (Object)ke3);
        hashMap2.put((Object)a115, (Object)ke3);
        hashMap2.put((Object)a116, (Object)ke3);
        hashMap2.put((Object)a15, (Object)ke3);
        hashMap2.put(object4, (Object)te2);
        hashMap2.put(object, (Object)te2);
        hashMap2.put((Object)a16, (Object)te2);
        hashMap2.put((Object)a17, (Object)te2);
        hashMap2.put((Object)a118, (Object)ke.a().a((qe)new fe()).a((ye)ce2).a());
        hashMap2.put((Object)a1.R, (Object)ke.a().a((le)new b()).a());
        hashMap2.put((Object)a119, (Object)ke3);
        hashMap2.put((Object)a120, (Object)ke5);
        hashMap2.put((Object)a121, (Object)ke5);
        hashMap2.put((Object)a122, (Object)te2);
        hashMap2.put((Object)a123, (Object)te2);
        hashMap2.put((Object)a124, (Object)te2);
        hashMap2.put((Object)a125, (Object)ke4);
        hashMap2.put((Object)a126, (Object)ke3);
        hashMap2.put((Object)a127, (Object)ke3);
        hashMap2.put(object2, (Object)xe2);
        hashMap2.put(object8, (Object)xe2);
        hashMap2.put((Object)a117, (Object)ke3);
        hashMap2.put((Object)a128, (Object)ke3);
        hashMap2.put((Object)a129, (Object)ke3);
        d = Collections.unmodifiableMap((Map)hashMap2);
    }

    public static int a(@NonNull E.b.a a3) {
        int n2 = a3.ordinal();
        int n3 = 1;
        if (n2 != 1) {
            n3 = 2;
            if (n2 != 2) {
                n3 = 3;
                if (n2 != 3) {
                    n3 = 4;
                    if (n2 != 4) {
                        return 0;
                    }
                }
            }
        }
        return n3;
    }

    public static int a(@NonNull e6 e62) {
        int n2 = (e62 = (Integer)a.get((Object)e62)) != null ? e62.intValue() : 0;
        return n2;
    }

    public static int a(@NonNull hc.a a3) {
        int n2 = a3.ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @NonNull
    public static e6 a(int n2) {
        e6 e62;
        e6 e63 = e62 = (e6)b.get(n2);
        if (e62 == null) {
            e63 = e6.b;
        }
        return e63;
    }

    @NonNull
    public static if.f a(ContentValues contentValues) {
        Long l3 = contentValues.getAsLong("start_time");
        Long l4 = contentValues.getAsLong("server_time_offset");
        contentValues = contentValues.getAsBoolean("obtained_before_first_sync");
        if.f f2 = new if.f();
        if (l3 != null) {
            f2.a = l3;
            long l6 = l3;
            f2.b = ((GregorianCalendar)Calendar.getInstance()).getTimeZone().getOffset(l6 * 1000L) / 1000;
        }
        if (l4 != null) {
            f2.c = l4;
        }
        if (contentValues != null) {
            f2.d = contentValues.booleanValue();
        }
        return f2;
    }

    @NonNull
    private static jf a(JSONObject jSONObject) {
        try {
            jf jf2 = new jf();
            jf2.a = jSONObject.getString("mac");
            jf2.b = jSONObject.getInt("signal_strength");
            jf2.c = jSONObject.getString("ssid");
            jf2.d = jSONObject.optBoolean("is_connected");
            jf2.e = jSONObject.optLong("last_visible_offset_seconds", 0L);
            return jf2;
        }
        catch (Throwable throwable) {
            jf jf3 = new jf();
            jf3.a = jSONObject.optString("mac");
            return jf3;
        }
    }

    @NonNull
    public static ke a(@Nullable a1 a12) {
        a12 = a12 != null ? (ke)d.get((Object)a12) : null;
        a1 a13 = a12;
        if (a12 == null) {
            a13 = ke.b();
        }
        return a13;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static jf[] a(JSONArray jSONArray) {
        int n2;
        jf[] jfArray;
        try {
            jfArray = new jf[jSONArray.length()];
            n2 = 0;
        }
        catch (Throwable throwable) {
            return null;
        }
        while (true) {
            jf[] jfArray2 = jfArray;
            try {
                if (n2 >= jSONArray.length()) return jfArray2;
                jfArray[n2] = J1.a(jSONArray.getJSONObject(n2));
                ++n2;
            }
            catch (Throwable throwable) {
                return jfArray;
            }
        }
    }

    @NonNull
    public static gf b(JSONObject jSONObject) {
        gf gf2 = new gf();
        int n2 = jSONObject.optInt("signal_strength", gf2.b);
        if (n2 != -1) {
            gf2.b = n2;
        }
        gf2.a = jSONObject.optInt("cell_id", gf2.a);
        gf2.c = jSONObject.optInt("lac", gf2.c);
        gf2.d = jSONObject.optInt("country_code", gf2.d);
        gf2.e = jSONObject.optInt("operator_id", gf2.e);
        gf2.f = jSONObject.optString("operator_name", gf2.f);
        gf2.g = jSONObject.optBoolean("is_connected", gf2.g);
        gf2.h = jSONObject.optInt("cell_type", 0);
        gf2.i = jSONObject.optInt("pci", gf2.i);
        gf2.j = jSONObject.optLong("last_visible_time_offset", gf2.j);
        gf2.k = jSONObject.optInt("lte_rsrq", gf2.k);
        gf2.l = jSONObject.optInt("lte_rssnr", gf2.l);
        gf2.n = jSONObject.optInt("arfcn", gf2.n);
        gf2.m = jSONObject.optInt("lte_rssi", gf2.m);
        gf2.o = jSONObject.optInt("lte_bandwidth", gf2.o);
        gf2.p = jSONObject.optInt("lte_cqi", gf2.p);
        return gf2;
    }

    @Nullable
    public static Integer b(@Nullable a1 a12) {
        a12 = a12 == null ? null : (Integer)c.get((Object)a12);
        return a12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static gf[] b(@NonNull JSONArray jSONArray) {
        int n2;
        JSONObject jSONObject;
        try {
            jSONObject = new gf[jSONArray.length()];
            n2 = 0;
        }
        catch (Throwable throwable) {
            return null;
        }
        while (true) {
            JSONObject jSONObject2 = jSONObject;
            try {
                if (n2 >= jSONArray.length()) return jSONObject2;
                jSONObject2 = jSONArray.optJSONObject(n2);
                if (jSONObject2 != null) {
                    jSONObject[n2] = J1.b(jSONObject2);
                }
                ++n2;
            }
            catch (Throwable throwable) {
                return jSONObject;
            }
        }
    }
}

