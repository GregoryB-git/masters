/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  android.preference.PreferenceManager
 *  android.util.Log
 *  android.util.Patterns
 *  java.lang.CharSequence
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package y1;

import O1.P;
import T1.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import x1.B;
import y1.F;
import y1.I;
import y1.J;
import y1.K;
import z1.d;

public final class L {
    public static final L a = new L();
    public static final String b = L.class.getSimpleName();
    public static SharedPreferences c;
    public static final AtomicBoolean d;
    public static final ConcurrentHashMap e;
    public static final ConcurrentHashMap f;

    static {
        d = new AtomicBoolean(false);
        e = new ConcurrentHashMap();
        f = new ConcurrentHashMap();
    }

    public static /* synthetic */ void a(String string2, String string3) {
        L.r(string2, string3);
    }

    public static /* synthetic */ void b(Bundle bundle) {
        L.o(bundle);
    }

    public static /* synthetic */ void c() {
        L.e();
    }

    public static final void d() {
        if (a.d(L.class)) {
            return;
        }
        try {
            F.b.b().execute((Runnable)new J());
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, L.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e() {
        if (a.d(L.class)) {
            return;
        }
        try {
            if (!d.get()) {
                Log.w((String)b, (String)"initStore should have been called before calling setUserData");
                a.h();
            }
            e.clear();
            SharedPreferences sharedPreferences = c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.userData", null).apply();
                return;
            }
            Intrinsics.n("sharedPreferences");
            throw null;
        }
        catch (Throwable throwable) {}
        a.b(throwable, L.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String f() {
        if (a.d(L.class)) {
            return null;
        }
        try {
            if (!d.get()) {
                a.h();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll((Map)e);
            hashMap.putAll(a.g());
            return P.l0((Map)hashMap);
        }
        catch (Throwable throwable) {}
        a.b(throwable, L.class);
        return null;
    }

    public static final void i() {
        if (a.d(L.class)) {
            return;
        }
        try {
            if (d.get()) {
                return;
            }
            a.h();
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, L.class);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static final void l(Map var0) {
        block17 : {
            block21 : {
                block22 : {
                    block15 : {
                        block16 : {
                            block19 : {
                                block18 : {
                                    if (a.d(L.class)) {
                                        return;
                                    }
                                    Intrinsics.checkNotNullParameter((Object)var0, "ud");
                                    if (!L.d.get()) {
                                        L.a.h();
                                    }
                                    var7_2 = var0.entrySet().iterator();
lbl8: // 3 sources:
                                    while (var7_2.hasNext()) {
                                        var0 = (Map.Entry)var7_2.next();
                                        var8_9 = (String)var0.getKey();
                                        var0 = (String)var0.getValue();
                                        var6_8 = P.a;
                                        var6_8 = L.a;
                                        var1_3 = var0.length();
                                        var5_7 = 1;
                                    }
                                    ** GOTO lbl62
                                    {
                                        --var1_3;
                                        var3_5 = var2_4 = 0;
                                        break block15;
                                        break;
                                    }
lbl22: // 3 sources:
                                    var4_6 = Intrinsics.d(var0.charAt(var4_6), 32) <= 0 ? 1 : 0;
lbl23: // 2 sources:
                                    var9_10 = P.F0(var6_8.k(var8_9, var0.subSequence(var2_4, var1_3 + 1).toString()));
                                    var0 = L.f;
                                    if (!var0.containsKey((Object)var8_9)) ** GOTO lbl60
                                    var10_11 = (String)var0.get((Object)var8_9);
                                    var0 = null;
                                    if (var10_11 == null || (var6_8 = new Regex(",").c(var10_11, 0)) == null) break block18;
                                    var0 = ((Collection)var6_8).toArray((Object[])new String[0]);
                                    if (var0 == null) ** GOTO lbl59
                                    var0 = (String[])var0;
                                }
                                var6_8 = var0;
                                if (var0 == null) {
                                    var6_8 = new List[]{};
                                }
                                if ((var0 = W5.I.d(Arrays.copyOf((Object[])var6_8, (int)var6_8.length))).contains((Object)var9_10)) {
                                    return;
                                }
                                var11_12 = new StringBuilder();
                                if (var6_8.length != 0) break block19;
lbl40: // 2 sources:
                                do {
                                    var11_12.append(var9_10);
                                    ** GOTO lbl57
                                    break;
                                } while (true);
                            }
                            var1_3 = var5_7;
                            if (var6_8.length >= 5) break block16;
                            var11_12.append(var10_11);
                            var11_12.append(",");
                            ** continue;
                        }
lbl50: // 2 sources:
                        var2_4 = var1_3 + 1;
                        try {
                            var11_12.append((String)var6_8[var1_3]);
                            var11_12.append(",");
                            if (var2_4 < 5) break block17;
                            var11_12.append(var9_10);
                            var0.remove((Object)var6_8[0]);
lbl57: // 2 sources:
                            L.f.put((Object)var8_9, (Object)var11_12.toString());
                            ** GOTO lbl8
lbl59: // 1 sources:
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
lbl60: // 1 sources:
                            var0.put((Object)var8_9, (Object)var9_10);
                            ** GOTO lbl8
lbl62: // 1 sources:
                            var0 = L.a;
                            var6_8 = P.a;
                            var0.q("com.facebook.appevents.UserDataStore.internalUserData", P.l0((Map)L.f));
                            return;
                        }
                        catch (Throwable var0_1) {
                            ** continue;
                        }
lbl66: // 1 sources:
                        do {
                            a.b(var0_1, L.class);
                            return;
                            break;
                        } while (true);
                    }
lbl72: // 4 sources:
                    do {
                        block20 : {
                            if (var2_4 > var1_3) ** GOTO lbl23
                            if (var3_5 != 0) break block20;
                            var4_6 = var2_4;
                            ** GOTO lbl22
                        }
                        var4_6 = var1_3;
                        ** GOTO lbl22
                        break;
                    } while (true);
                    if (var3_5 != 0) break block21;
                    if (var4_6 != 0) break block22;
                    var3_5 = 1;
                    ** GOTO lbl72
                }
                ++var2_4;
                ** GOTO lbl72
            }
            if (var4_6 == 0) ** GOTO lbl23
            --var1_3;
            ** while (true)
        }
        var1_3 = var2_4;
        ** GOTO lbl50
    }

    public static final void m(Bundle bundle) {
        if (a.d(L.class)) {
            return;
        }
        try {
            F.b.b().execute((Runnable)new I(bundle));
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, L.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void n(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        if (a.d(L.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (string2 != null) {
                bundle.putString("em", string2);
            }
            if (string3 != null) {
                bundle.putString("fn", string3);
            }
            if (string4 != null) {
                bundle.putString("ln", string4);
            }
            if (string5 != null) {
                bundle.putString("ph", string5);
            }
            if (string6 != null) {
                bundle.putString("db", string6);
            }
            if (string7 != null) {
                bundle.putString("ge", string7);
            }
            if (string8 != null) {
                bundle.putString("ct", string8);
            }
            if (string9 != null) {
                bundle.putString("st", string9);
            }
            if (string10 != null) {
                bundle.putString("zp", string10);
            }
            if (string11 != null) {
                bundle.putString("country", string11);
            }
            L.m(bundle);
            return;
        }
        catch (Throwable throwable) {}
        a.b(throwable, L.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void o(Bundle object) {
        if (a.d(L.class)) {
            return;
        }
        try {
            if (!d.get()) {
                Log.w((String)b, (String)"initStore should have been called before calling setUserData");
                a.h();
            }
            L l8 = a;
            l8.p((Bundle)object);
            object = P.a;
            l8.q("com.facebook.appevents.UserDataStore.userData", P.l0((Map)e));
            l8.q("com.facebook.appevents.UserDataStore.internalUserData", P.l0((Map)f));
            return;
        }
        catch (Throwable throwable) {}
        a.b(throwable, L.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void r(String string2, String string3) {
        if (a.d(L.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences;
            Intrinsics.checkNotNullParameter(string2, "$key");
            Intrinsics.checkNotNullParameter(string3, "$value");
            if (!d.get()) {
                a.h();
            }
            if ((sharedPreferences = c) != null) {
                sharedPreferences.edit().putString(string2, string3).apply();
                return;
            }
            Intrinsics.n("sharedPreferences");
            throw null;
        }
        catch (Throwable throwable) {}
        a.b(throwable, L.class);
    }

    public final Map g() {
        Throwable throwable2;
        block4 : {
            HashMap hashMap;
            if (a.d(this)) {
                return null;
            }
            try {
                hashMap = new HashMap();
                Set set = d.d.b();
                for (String string2 : f.keySet()) {
                    if (!set.contains((Object)string2)) continue;
                    hashMap.put((Object)string2, f.get((Object)string2));
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return hashMap;
        }
        a.b(throwable2, this);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        synchronized (this) {
            Throwable throwable2;
            AtomicBoolean atomicBoolean;
            String string2;
            block11 : {
                boolean bl = a.d(this);
                if (bl) {
                    return;
                }
                try {
                    atomicBoolean = d;
                    bl = atomicBoolean.get();
                    if (!bl) break block11;
                }
                catch (Throwable throwable2) {}
                return;
            }
            Object object = PreferenceManager.getDefaultSharedPreferences((Context)B.l());
            Intrinsics.checkNotNullExpressionValue(object, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            c = object;
            if (object == null) {
                Intrinsics.n("sharedPreferences");
                throw null;
            }
            String string3 = object.getString("com.facebook.appevents.UserDataStore.userData", "");
            object = string3;
            if (string3 == null) {
                object = "";
            }
            if ((string3 = c) == null) {
                Intrinsics.n("sharedPreferences");
                throw null;
            }
            string3 = string2 = string3.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string3 = "";
            }
            e.putAll(P.h0((String)object));
            f.putAll(P.h0(string3));
            atomicBoolean.set(true);
            return;
            a.b(throwable2, this);
            return;
        }
    }

    public final boolean j(String string2) {
        if (a.d(this)) {
            return false;
        }
        try {
            boolean bl = new Regex("[A-Fa-f0-9]{64}").b(string2);
            return bl;
        }
        catch (Throwable throwable) {
            a.b(throwable, this);
            return false;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final String k(String var1_1, String var2_3) {
        block15 : {
            if (a.d(this)) {
                return null;
            }
            try {
                var3_4 = var2_3.length() - 1;
                var5_6 = var4_5 = 0;
                ** GOTO lbl18
            }
            catch (Throwable var1_2) {}
            a.b(var1_2, this);
            return null;
lbl-1000: // 2 sources:
            {
                var6_7 = Intrinsics.d(var2_3.charAt(var6_7), 32) <= 0 ? 1 : 0;
                if (var5_6 == 0) {
                    if (var6_7 == 0) {
                        var5_6 = 1;
                    } else {
                        ++var4_5;
                    }
                } else {
                    --var3_4;
                }
lbl18: // 4 sources:
                if (var4_5 <= var3_4) {
                    if (var5_6 == 0) {
                        var6_7 = var4_5;
                        continue;
                    }
                } else {
                    if ((var2_3 = var2_3.subSequence(var4_5, var3_4 + 1).toString()) == null) throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    var2_3 = var2_3.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(var2_3, "(this as java.lang.String).toLowerCase()");
                    var7_8 = Intrinsics.a("em", var1_1);
                    if (var7_8) {
                        if (Patterns.EMAIL_ADDRESS.matcher((CharSequence)var2_3).matches()) {
                            return var2_3;
                        }
                        Log.e((String)L.b, (String)"Setting email failure: this is not a valid email address");
                        return "";
                    }
                    if (Intrinsics.a("ph", var1_1)) {
                        return new Regex("[^0-9]").replace(var2_3, "");
                    }
                    if (Intrinsics.a("ge", var1_1) == false) return var2_3;
                    if (var2_3.length() <= 0) break;
                    if (var2_3 == null) throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    var1_1 = var2_3.substring(0, 1);
                    Intrinsics.checkNotNullExpressionValue(var1_1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    break block15;
                }
                var6_7 = var3_4;
                ** while (true)
            }
            var1_1 = "";
        }
        if (Intrinsics.a("f", var1_1) != false) return var1_1;
        if (Intrinsics.a("m", var1_1)) {
            return var1_1;
        }
        Log.e((String)L.b, (String)"Setting gender failure: the supported value for gender is f or m");
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void p(Bundle bundle) {
        if (a.d(this)) {
            return;
        }
        if (bundle == null) {
            return;
        }
        try {
            Iterator iterator = bundle.keySet().iterator();
            do {
                Object object;
                if (!iterator.hasNext()) {
                    return;
                }
                String string2 = (String)iterator.next();
                Object object2 = bundle.get(string2);
                if (object2 == null) continue;
                if (this.j((String)(object2 = object2.toString()))) {
                    object = e;
                    if (object2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    object2 = object2.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(object2, "(this as java.lang.String).toLowerCase()");
                } else {
                    object = P.a;
                    Intrinsics.checkNotNullExpressionValue(string2, "key");
                    if ((object2 = P.F0(this.k(string2, (String)object2))) == null) continue;
                    object = e;
                }
                object.put((Object)string2, object2);
            } while (true);
        }
        catch (Throwable throwable) {}
        a.b(throwable, this);
    }

    public final void q(String string2, String string3) {
        if (a.d(this)) {
            return;
        }
        try {
            B.t().execute((Runnable)new K(string2, string3));
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, this);
            return;
        }
    }
}

