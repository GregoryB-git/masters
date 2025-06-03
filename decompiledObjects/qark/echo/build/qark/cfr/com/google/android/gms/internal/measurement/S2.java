/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicInteger
 *  java.util.concurrent.atomic.AtomicReference
 */
package com.google.android.gms.internal.measurement;

import W2.g;
import W2.l;
import W2.m;
import W2.s;
import W2.t;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.J2;
import com.google.android.gms.internal.measurement.K2;
import com.google.android.gms.internal.measurement.O2;
import com.google.android.gms.internal.measurement.P2;
import com.google.android.gms.internal.measurement.Q2;
import com.google.android.gms.internal.measurement.R2;
import com.google.android.gms.internal.measurement.T2;
import com.google.android.gms.internal.measurement.U2;
import com.google.android.gms.internal.measurement.V2;
import com.google.android.gms.internal.measurement.W2;
import com.google.android.gms.internal.measurement.X2;
import com.google.android.gms.internal.measurement.Y2;
import com.google.android.gms.internal.measurement.Z2;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.b3;
import com.google.android.gms.internal.measurement.c3;
import com.google.android.gms.internal.measurement.d3;
import com.google.android.gms.internal.measurement.h3;
import com.google.android.gms.internal.measurement.x2;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class S2 {
    public static final Object g = new Object();
    public static volatile Z2 h;
    public static final AtomicReference i;
    public static d3 j;
    public static final AtomicInteger k;
    public final a3 a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    public final boolean f;

    static {
        i = new AtomicReference();
        j = new d3(T2.a);
        k = new AtomicInteger();
    }

    public S2(a3 a32, String string2, Object object, boolean bl) {
        String string3 = a32.a;
        if (string3 == null && a32.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (string3 != null && a32.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.a = a32;
        this.b = string2;
        this.c = object;
        this.f = bl;
    }

    public /* synthetic */ S2(a3 a32, String string2, Object object, boolean bl, c3 c32) {
        this(a32, string2, object, true);
    }

    public static /* synthetic */ l a(Context context) {
        return O2.a.a(context);
    }

    public static /* synthetic */ S2 b(a3 a32, String string2, Boolean bl, boolean bl2) {
        return new V2(a32, string2, bl, true);
    }

    public static /* synthetic */ S2 c(a3 a32, String string2, Double d8, boolean bl) {
        return new Y2(a32, string2, d8, true);
    }

    public static /* synthetic */ S2 d(a3 a32, String string2, Long l8, boolean bl) {
        return new W2(a32, string2, l8, true);
    }

    public static /* synthetic */ S2 e(a3 a32, String string2, String string3, boolean bl) {
        return new X2(a32, string2, string3, true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void l(Context var0) {
        if (S2.h != null) {
            return;
        }
        if (var0 == null) {
            return;
        }
        var2_3 = S2.g;
        synchronized (var2_3) {
            if (S2.h != null) ** GOTO lbl23
            ** synchronized (var2_3)
lbl-1000: // 2 sources:
            {
                catch (Throwable var0_2) {}
lbl12: // 2 sources:
                var3_4 = S2.h;
                var1_5 = var0.getApplicationContext();
                if (var1_5 != null) {
                    var0 = var1_5;
                }
                if (var3_4 == null || var3_4.a() != var0) {
                    B2.d();
                    b3.c();
                    J2.b();
                    S2.h = new x2(var0, t.a(new U2(var0)));
                    S2.k.incrementAndGet();
                } else {
                    ** GOTO lbl23
                }
                {
                    catch (Throwable var0_1) {}
lbl23: // 4 sources:
                    return;
                    // MONITOREXIT [2, 3] lbl25 : MonitorExitStatement: MONITOREXIT : var2_3
                    ** try [egrp 2[TRYBLOCK] [6 : 101->108)] { 
lbl26: // 1 sources:
                    throw var0_1;
                }
                throw var0_2;
            }
        }
    }

    public static void m() {
        k.incrementAndGet();
    }

    public static /* synthetic */ boolean n() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object f() {
        int n8;
        if (!this.f) {
            m.p(j.a(this.b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        if (this.d >= (n8 = k.get())) return this.e;
        synchronized (this) {
            Object object;
            Object object2;
            Object object3;
            Z2 z22;
            block8 : {
                try {
                    if (this.d >= n8) return this.e;
                    z22 = h;
                    object = l.a();
                    a3 a32 = null;
                    object3 = a32;
                    if (z22 != null) {
                        object = object2 = (l)z22.b().get();
                        object3 = a32;
                        if (object2.c()) {
                            object = (K2)object2.b();
                            object3 = this.a;
                            object3 = object.a(object3.b, object3.a, object3.d, this.b);
                            object = object2;
                        }
                    }
                    break block8;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            boolean bl = z22 != null;
            m.p(bl, "Must call PhenotypeFlagInitializer.maybeInit() first");
            if (!(this.a.f ? (object2 = this.g(z22)) != null || (object2 = this.j(z22)) != null : (object2 = this.j(z22)) != null || (object2 = this.g(z22)) != null)) {
                object2 = this.c;
            }
            if (object.c()) {
                object2 = object3 == null ? this.c : this.h(object3);
            }
            this.e = object2;
            this.d = n8;
            return this.e;
        }
    }

    public final Object g(Z2 object) {
        Object object2 = this.a;
        if (!object2.e && ((object2 = object2.i) == null || ((Boolean)object2.apply((Object)object.a())).booleanValue())) {
            object2 = J2.a(object.a());
            object = this.a;
            object = object.e ? null : this.i(object.c);
            if ((object = object2.i((String)object)) != null) {
                return this.h(object);
            }
        }
        return null;
    }

    public abstract Object h(Object var1);

    public final String i(String string2) {
        if (string2 != null && string2.isEmpty()) {
            return this.b;
        }
        String string3 = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public final Object j(Z2 object) {
        object = this.a.b != null ? (Q2.b(object.a(), this.a.b) ? (this.a.h ? B2.a(object.a().getContentResolver(), P2.a(P2.b(object.a(), this.a.b.getLastPathSegment())), R2.o) : B2.a(object.a().getContentResolver(), this.a.b, R2.o)) : null) : b3.b(object.a(), this.a.a, R2.o);
        if (object != null && (object = object.i(this.k())) != null) {
            return this.h(object);
        }
        return null;
    }

    public final String k() {
        return this.i(this.a.d);
    }
}

