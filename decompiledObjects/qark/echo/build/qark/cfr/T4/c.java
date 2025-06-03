/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package T4;

import P.f;
import R4.b;
import T4.g;
import T4.h;
import V2.j;
import V5.m;
import V5.o;
import V5.q;
import V5.t;
import W5.C;
import X5.d;
import Z5.k;
import android.os.Build;
import android.util.Log;
import g6.p;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import o6.a;
import org.json.JSONException;
import org.json.JSONObject;
import s4.i;

public final class c
implements h {
    public static final a g = new a(null);
    public final X5.g a;
    public final i b;
    public final b c;
    public final T4.a d;
    public final g e;
    public final y6.a f;

    public c(X5.g g8, i i8, b b8, T4.a a8, f f8) {
        Intrinsics.checkNotNullParameter(g8, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(i8, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(b8, "appInfo");
        Intrinsics.checkNotNullParameter(a8, "configsFetcher");
        Intrinsics.checkNotNullParameter(f8, "dataStore");
        this.a = g8;
        this.b = i8;
        this.c = b8;
        this.d = a8;
        this.e = new g(f8);
        this.f = y6.c.b(false, 1, null);
    }

    public static final /* synthetic */ g e(c c8) {
        return c8.e;
    }

    @Override
    public Boolean a() {
        return this.e.g();
    }

    @Override
    public Double b() {
        return this.e.f();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public Object c(d var1_1) {
        block26 : {
            block20 : {
                block25 : {
                    block24 : {
                        block21 : {
                            block23 : {
                                block22 : {
                                    if (!(var1_1 instanceof )) ** GOTO lbl-1000
                                    var4_2 = var1_1;
                                    var2_4 = var4_2.s;
                                    if ((var2_4 & Integer.MIN_VALUE) != 0) {
                                        var4_2.s = var2_4 + Integer.MIN_VALUE;
                                    } else lbl-1000: // 2 sources:
                                    {
                                        var4_2 = new Z5.d((d)var1_1){
                                            public Object o;
                                            public Object p;
                                            public /* synthetic */ Object q;
                                            public int s;

                                            @Override
                                            public final Object invokeSuspend(Object object) {
                                                this.q = object;
                                                this.s |= Integer.MIN_VALUE;
                                                return this.c(this);
                                            }
                                        };
                                    }
                                    var6_5 = var4_2.q;
                                    var7_6 = Y5.b.c();
                                    var2_4 = var4_2.s;
                                    if (var2_4 != 0) {
                                        if (var2_4 != 1) {
                                            if (var2_4 != 2) {
                                                if (var2_4 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                var1_1 = var3_7 = (y6.a)var4_2.o;
                                                o.b(var6_5);
                                                break block20;
                                            }
                                            var1_1 = (y6.a)var4_2.p;
                                            var5_10 = (c)var4_2.o;
                                            var3_7 = var1_1;
                                            o.b(var6_5);
                                            break block21;
                                        }
                                        var1_1 = (y6.a)var4_2.p;
                                        var3_7 = (c)var4_2.o;
                                        o.b(var6_5);
                                    } else {
                                        o.b(var6_5);
                                        if (!this.f.c() && !this.e.d()) {
                                            return t.a;
                                        }
                                        var1_1 = this.f;
                                        var4_2.o = this;
                                        var4_2.p = var1_1;
                                        var4_2.s = 1;
                                        if (var1_1.a(null, (d)var4_2) == var7_6) {
                                            return var7_6;
                                        }
                                        var3_7 = this;
                                    }
                                    try {
                                        if (var3_7.e.d()) break block22;
                                        var3_7 = t.a;
                                    }
                                    catch (Throwable var3_9) {}
                                    var1_1.b(null);
                                    return var3_7;
                                }
                                var5_10 = var3_7.b.a();
                                Intrinsics.checkNotNullExpressionValue(var5_10, "firebaseInstallationsApi.id");
                                var4_2.o = var3_7;
                                var4_2.p = var1_1;
                                var4_2.s = 2;
                                var6_5 = z6.b.a((j)var5_10, (d)var4_2);
                                if (var6_5 == var7_6) {
                                    return var7_6;
                                }
                                break block23;
                                break block26;
                            }
                            var5_10 = var3_7;
                        }
                        var3_7 = var1_1;
                        var6_5 = (String)var6_5;
                        if (var6_5 != null) break block24;
                        var3_7 = var1_1;
                        Log.w((String)"SessionConfigFetcher", (String)"Error getting Firebase Installation ID. Skipping this Session Event.");
                        var3_7 = var1_1;
                        var4_2 = t.a;
                        var1_1.b(null);
                        return var4_2;
                    }
                    var3_7 = var1_1;
                    try {
                        var6_5 = q.a("X-Crashlytics-Installation-ID", var6_5);
                        var3_7 = var1_1;
                        var8_11 = x.a;
                        var3_7 = var1_1;
                        var8_11 = String.format((String)"%s/%s", (Object[])Arrays.copyOf((Object[])new Object[]{Build.MANUFACTURER, Build.MODEL}, (int)2));
                        var3_7 = var1_1;
                        Intrinsics.checkNotNullExpressionValue(var8_11, "format(format, *args)");
                        var3_7 = var1_1;
                        var8_11 = q.a("X-Crashlytics-Device-Model", var5_10.f((String)var8_11));
                        var3_7 = var1_1;
                        var9_12 = Build.VERSION.INCREMENTAL;
                        var3_7 = var1_1;
                        Intrinsics.checkNotNullExpressionValue(var9_12, "INCREMENTAL");
                        var3_7 = var1_1;
                        var9_12 = q.a("X-Crashlytics-OS-Build-Version", var5_10.f((String)var9_12));
                        var3_7 = var1_1;
                        var10_13 = Build.VERSION.RELEASE;
                        var3_7 = var1_1;
                        Intrinsics.checkNotNullExpressionValue(var10_13, "RELEASE");
                        var3_7 = var1_1;
                        var6_5 = C.f(new m[]{var6_5, var8_11, var9_12, q.a("X-Crashlytics-OS-Display-Version", var5_10.f(var10_13)), q.a("X-Crashlytics-API-Client-Version", var5_10.c.f())});
                        var3_7 = var1_1;
                        var8_11 = var5_10.d;
                        var3_7 = var1_1;
                        var5_10 = new p((c)var5_10, null){
                            public Object o;
                            public Object p;
                            public int q;
                            public /* synthetic */ Object r;
                            public final /* synthetic */ c s;
                            {
                                this.s = c8;
                                super(2, d8);
                            }

                            public final Object a(JSONObject jSONObject, d d8) {
                                return (this.create((Object)jSONObject, d8)).invokeSuspend(t.a);
                            }

                            @Override
                            public final d create(Object object, d d8) {
                                d8 = new ;
                                d8.r = object;
                                return d8;
                            }

                            /*
                             * Unable to fully structure code
                             * Enabled aggressive exception aggregation
                             */
                            @Override
                            public final Object invokeSuspend(Object var1_1) {
                                block27 : {
                                    block28 : {
                                        block35 : {
                                            block34 : {
                                                block29 : {
                                                    block30 : {
                                                        block31 : {
                                                            block33 : {
                                                                block32 : {
                                                                    var6_2 = Y5.b.c();
                                                                    switch (this.q) {
                                                                        default: {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        case 6: {
                                                                            o.b(var1_1);
                                                                            break block27;
                                                                        }
                                                                        case 5: {
                                                                            o.b(var1_1);
                                                                            break block28;
                                                                        }
                                                                        case 4: {
                                                                            o.b(var1_1);
                                                                            break block29;
                                                                        }
                                                                        case 3: {
                                                                            var2_3 = (u)this.r;
                                                                            o.b(var1_1);
                                                                            break block30;
                                                                        }
                                                                        case 2: {
                                                                            var2_3 = (u)this.o;
                                                                            var4_6 = (u)this.r;
                                                                            o.b(var1_1);
                                                                            var1_1 = var2_3;
                                                                            break block31;
                                                                        }
                                                                        case 1: {
                                                                            var2_3 = (u)this.p;
                                                                            var3_7 = (u)this.o;
                                                                            var4_6 = (u)this.r;
                                                                            o.b(var1_1);
                                                                            var1_1 = var4_6;
                                                                            break;
                                                                        }
                                                                        case 0: {
                                                                            o.b(var1_1);
                                                                            var1_1 = (JSONObject)this.r;
                                                                            var5_8 = new u();
                                                                            var3_7 = new u();
                                                                            var4_6 = new u();
                                                                            if (!var1_1.has("app_quality")) ** GOTO lbl59
                                                                            var1_1 = var1_1.get("app_quality");
                                                                            Intrinsics.c(var1_1, "null cannot be cast to non-null type org.json.JSONObject");
                                                                            var7_9 = (JSONObject)var1_1;
                                                                            try {
                                                                                var1_1 = var7_9.has("sessions_enabled") != false ? (Boolean)var7_9.get("sessions_enabled") : null;
                                                                            }
                                                                            catch (JSONException var2_4) {
                                                                                var1_1 = null;
                                                                                ** GOTO lbl56
                                                                            }
                                                                            if (var7_9.has("sampling_rate")) {
                                                                                var5_8.o = (Double)var7_9.get("sampling_rate");
                                                                            }
                                                                            if (var7_9.has("session_timeout_seconds")) {
                                                                                var3_7.o = (Integer)var7_9.get("session_timeout_seconds");
                                                                            }
                                                                            var2_3 = var1_1;
                                                                            if (var7_9.has("cache_duration")) {
                                                                                var4_6.o = (Integer)var7_9.get("cache_duration");
                                                                                var2_3 = var1_1;
                                                                            }
                                                                            ** GOTO lbl60
lbl56: // 2 sources:
                                                                            Log.e((String)"SessionConfigFetcher", (String)"Error parsing the configs remotely fetched: ", (Throwable)var2_3);
                                                                            var2_3 = var1_1;
                                                                            ** GOTO lbl60
lbl59: // 1 sources:
                                                                            var2_3 = null;
lbl60: // 3 sources:
                                                                            if (var2_3 == null) break block32;
                                                                            var1_1 = c.e(this.s);
                                                                            this.r = var5_8;
                                                                            this.o = var3_7;
                                                                            this.p = var4_6;
                                                                            this.q = 1;
                                                                            if (var1_1.n((Boolean)var2_3, this) == var6_2) {
                                                                                return var6_2;
                                                                            }
                                                                            var1_1 = var5_8;
                                                                            var2_3 = var4_6;
                                                                        }
                                                                    }
                                                                    var5_8 = var3_7;
                                                                    var3_7 = var1_1;
                                                                    break block33;
                                                                }
                                                                var1_1 = var5_8;
                                                                var2_3 = var4_6;
                                                                var5_8 = var3_7;
                                                                var3_7 = var1_1;
                                                            }
                                                            var1_1 = var2_3;
                                                            var4_6 = var3_7;
                                                            if ((Integer)var5_8.o != null) {
                                                                var7_9 = c.e(this.s);
                                                                var5_8 = (Integer)var5_8.o;
                                                                this.r = var3_7;
                                                                this.o = var2_3;
                                                                this.p = null;
                                                                this.q = 2;
                                                                var1_1 = var2_3;
                                                                var4_6 = var3_7;
                                                                if (var7_9.m((Integer)var5_8, this) == var6_2) {
                                                                    return var6_2;
                                                                }
                                                            }
                                                        }
                                                        var2_3 = var1_1;
                                                        if ((Double)var4_6.o != null) {
                                                            var3_7 = c.e(this.s);
                                                            var4_6 = (Double)var4_6.o;
                                                            this.r = var1_1;
                                                            this.o = null;
                                                            this.p = null;
                                                            this.q = 3;
                                                            var2_3 = var1_1;
                                                            if (var3_7.i((Double)var4_6, this) == var6_2) {
                                                                return var6_2;
                                                            }
                                                        }
                                                    }
                                                    if ((Integer)var2_3.o != null) {
                                                        var1_1 = c.e(this.s);
                                                        var2_3 = (Integer)var2_3.o;
                                                        this.r = null;
                                                        this.o = null;
                                                        this.p = null;
                                                        this.q = 4;
                                                        if (var1_1.j((Integer)var2_3, this) == var6_2) {
                                                            return var6_2;
                                                        } else {
                                                            ** GOTO lbl115
                                                        }
                                                    }
                                                    break block34;
                                                }
                                                var1_1 = t.a;
                                                break block35;
                                            }
                                            var1_1 = null;
                                        }
                                        if (var1_1 == null) {
                                            var1_1 = c.e(this.s);
                                            var2_3 = Z5.b.b(86400);
                                            this.r = null;
                                            this.o = null;
                                            this.p = null;
                                            this.q = 5;
                                            if (var1_1.j((Integer)var2_3, this) == var6_2) {
                                                return var6_2;
                                            }
                                        }
                                    }
                                    var1_1 = c.e(this.s);
                                    var2_3 = Z5.b.c(System.currentTimeMillis());
                                    this.r = null;
                                    this.o = null;
                                    this.p = null;
                                    this.q = 6;
                                    if (var1_1.k((Long)var2_3, this) == var6_2) {
                                        return var6_2;
                                    }
                                }
                                return t.a;
                                catch (JSONException var2_5) {
                                    ** GOTO lbl56
                                }
                            }
                        };
                        var3_7 = var1_1;
                        var9_12 = new p(null){
                            public int o;
                            public /* synthetic */ Object p;

                            public final Object a(String string2, d d8) {
                                return (this.create(string2, d8)).invokeSuspend(t.a);
                            }

                            @Override
                            public final d create(Object object, d d8) {
                                d8 = new ;
                                d8.p = object;
                                return d8;
                            }

                            @Override
                            public final Object invokeSuspend(Object object) {
                                Y5.b.c();
                                if (this.o == 0) {
                                    o.b(object);
                                    object = (String)this.p;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Error failing to fetch the remote configs: ");
                                    stringBuilder.append((String)object);
                                    Log.e((String)"SessionConfigFetcher", (String)stringBuilder.toString());
                                    return t.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        };
                        var3_7 = var1_1;
                        var4_2.o = var1_1;
                        var3_7 = var1_1;
                        var4_2.p = null;
                        var3_7 = var1_1;
                        var4_2.s = 3;
                        var3_7 = var1_1;
                        var4_2 = var8_11.a((Map)var6_5, (p)var5_10, (p)var9_12, (d)var4_2);
                        if (var4_2 == var7_6) {
                            return var7_6;
                        }
                        break block25;
                    }
                    catch (Throwable var4_3) {
                        var1_1 = var3_7;
                        var3_7 = var4_3;
                    }
                    break block26;
                }
                var3_7 = var1_1;
            }
            var1_1 = var3_7;
            try {
                var4_2 = t.a;
            }
            catch (Throwable var3_8) {
                break block26;
            }
            var3_7.b(null);
            return t.a;
        }
        var1_1.b(null);
        throw var3_7;
    }

    @Override
    public o6.a d() {
        Integer n8 = this.e.e();
        if (n8 != null) {
            a.a a8 = o6.a.p;
            return o6.a.h(o6.c.o(n8, o6.d.s));
        }
        return null;
    }

    public final String f(String string2) {
        return new Regex("/").replace(string2, "");
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }
    }

}

