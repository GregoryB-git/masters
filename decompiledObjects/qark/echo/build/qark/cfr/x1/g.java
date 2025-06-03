/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashSet
 *  java.util.Locale
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package x1;

import O1.P;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.I;
import x1.J;
import x1.K;
import x1.L;
import x1.a;
import x1.f;
import x1.h;
import x1.o;

public final class g {
    public static final a f = new a(null);
    public static g g;
    public final Z.a a;
    public final x1.b b;
    public x1.a c;
    public final AtomicBoolean d;
    public Date e;

    public g(Z.a a8, x1.b b8) {
        Intrinsics.checkNotNullParameter(a8, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(b8, "accessTokenCache");
        this.a = a8;
        this.b = b8;
        this.d = new AtomicBoolean(false);
        this.e = new Date(0L);
    }

    public static /* synthetic */ void a(d d8, K k8) {
        g.o(d8, k8);
    }

    public static /* synthetic */ void b(g g8, a.a a8) {
        g.l(g8, a8);
    }

    public static /* synthetic */ void c(d d8, x1.a a8, a.a a9, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, g g8, J j8) {
        g.p(d8, a8, a9, atomicBoolean, set, set2, set3, g8, j8);
    }

    public static /* synthetic */ void d(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, K k8) {
        g.n(atomicBoolean, set, set2, set3, k8);
    }

    public static final /* synthetic */ void f(g g8) {
        g = g8;
    }

    public static final void l(g g8, a.a a8) {
        Intrinsics.checkNotNullParameter(g8, "this$0");
        g8.m(a8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static final void n(AtomicBoolean var0, Set var1_1, Set var2_2, Set var3_3, K var4_4) {
        Intrinsics.checkNotNullParameter(var0, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter((Object)var1_1, "$permissions");
        Intrinsics.checkNotNullParameter((Object)var2_2, "$declinedPermissions");
        Intrinsics.checkNotNullParameter((Object)var3_3, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(var4_4, "response");
        var4_4 = var4_4.d();
        if (var4_4 == null) {
            return;
        }
        if ((var4_4 = var4_4.optJSONArray("data")) == null) {
            return;
        }
        var0.set(true);
        var7_5 = var4_4.length();
        if (var7_5 <= 0) return;
        var5_6 = 0;
        do {
            block6 : {
                block7 : {
                    block8 : {
                        var6_7 = var5_6 + 1;
                        var8_8 = var4_4.optJSONObject(var5_6);
                        if (var8_8 == null) break block6;
                        var0 = var8_8.optString("permission");
                        var8_8 = var8_8.optString("status");
                        if (P.c0((String)var0) || P.c0((String)var8_8)) break block6;
                        Intrinsics.checkNotNullExpressionValue(var8_8, "status");
                        var9_9 = Locale.US;
                        Intrinsics.checkNotNullExpressionValue((Object)var9_9, "US");
                        var8_8 = var8_8.toLowerCase(var9_9);
                        Intrinsics.checkNotNullExpressionValue(var8_8, "(this as java.lang.String).toLowerCase(locale)");
                        Intrinsics.checkNotNullExpressionValue(var8_8, "status");
                        var5_6 = var8_8.hashCode();
                        if (var5_6 == -1309235419) break block7;
                        if (var5_6 == 280295099) break block8;
                        if (var5_6 != 568196142 || !var8_8.equals((Object)"declined")) ** GOTO lbl-1000
                        var2_2.add(var0);
                        break block6;
                    }
                    if (!var8_8.equals((Object)"granted")) ** GOTO lbl-1000
                    var1_1.add(var0);
                    break block6;
                }
                if (!var8_8.equals((Object)"expired")) lbl-1000: // 3 sources:
                {
                    Log.w((String)"AccessTokenManager", (String)Intrinsics.i("Unexpected status: ", var8_8));
                } else {
                    var3_3.add(var0);
                }
            }
            if (var6_7 >= var7_5) {
                return;
            }
            var5_6 = var6_7;
        } while (true);
    }

    public static final void o(d d8, K k8) {
        Intrinsics.checkNotNullParameter(d8, "$refreshResult");
        Intrinsics.checkNotNullParameter(k8, "response");
        k8 = k8.d();
        if (k8 == null) {
            return;
        }
        d8.f(k8.optString("access_token"));
        d8.h(k8.optInt("expires_at"));
        d8.i(k8.optInt("expires_in"));
        d8.g(k8.optLong("data_access_expiration_time"));
        d8.j(k8.optString("graph_domain", null));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void p(d object, x1.a a8, a.a a9, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, g g8, J object2) {
        void var0_3;
        block17 : {
            block18 : {
                block14 : {
                    a a10;
                    String string3;
                    String string2;
                    Long l8;
                    block15 : {
                        block16 : {
                            Intrinsics.checkNotNullParameter(object, "$refreshResult");
                            Intrinsics.checkNotNullParameter((Object)atomicBoolean, "$permissionsCallSucceeded");
                            Intrinsics.checkNotNullParameter((Object)set, "$permissions");
                            Intrinsics.checkNotNullParameter((Object)set2, "$declinedPermissions");
                            Intrinsics.checkNotNullParameter((Object)set3, "$expiredPermissions");
                            Intrinsics.checkNotNullParameter(g8, "this$0");
                            Intrinsics.checkNotNullParameter(object2, "it");
                            string2 = object.a();
                            int n8 = object.c();
                            l8 = object.b();
                            string3 = object.e();
                            a10 = f;
                            if (a10.e().i() == null) break block14;
                            object2 = a10.e().i();
                            object2 = object2 == null ? null : object2.m();
                            if (object2 != a8.m()) break block14;
                            if (atomicBoolean.get() || string2 != null || n8 != 0) break block15;
                            if (a9 == null) break block16;
                            a9.b(new o("Failed to refresh access token"));
                        }
                        g8.d.set(false);
                        return;
                    }
                    object2 = a8.g();
                    if (object.c() != 0) {
                        object2 = new Date((long)object.c() * 1000L);
                    } else if (object.d() != 0) {
                        long l9 = new Date().getTime();
                        object2 = new Date((long)object.d() * 1000L + l9);
                    }
                    object = string2;
                    if (string2 == null) {
                        object = a8.l();
                    }
                    String string4 = a8.c();
                    String string5 = a8.m();
                    if (!atomicBoolean.get()) {
                        set = a8.j();
                    }
                    if (!atomicBoolean.get()) {
                        set2 = a8.e();
                    }
                    atomicBoolean = atomicBoolean.get() ? set3 : a8.f();
                    h h8 = a8.k();
                    Date date = new Date();
                    set3 = l8 != null ? new Date(l8 * 1000L) : a8.d();
                    string2 = string3;
                    if (string3 == null) {
                        string2 = a8.h();
                    }
                    a8 = new x1.a((String)object, string4, string5, (Collection)set, (Collection)set2, (Collection)atomicBoolean, h8, (Date)object2, date, (Date)set3, string2);
                    try {
                        a10.e().r(a8);
                    }
                    catch (Throwable throwable) {
                        break block17;
                    }
                    g8.d.set(false);
                    if (a9 == null) return;
                    a9.a(a8);
                    return;
                }
                if (a9 != null) {
                    a9.b(new o("No current access token to refresh"));
                    break block18;
                }
                break block18;
                catch (Throwable throwable) {
                    a8 = null;
                }
                break block17;
            }
            g8.d.set(false);
            return;
        }
        g8.d.set(false);
        if (a9 == null) throw var0_3;
        if (a8 == null) throw var0_3;
        a9.a(a8);
        throw var0_3;
    }

    public final void g() {
        this.q(this.i(), this.i());
    }

    public final void h() {
        if (!this.u()) {
            return;
        }
        this.k(null);
    }

    public final x1.a i() {
        return this.c;
    }

    public final boolean j() {
        x1.a a8 = this.b.f();
        if (a8 != null) {
            this.s(a8, false);
            return true;
        }
        return false;
    }

    public final void k(a.a a8) {
        if (Intrinsics.a((Object)Looper.getMainLooper(), (Object)Looper.myLooper())) {
            this.m(a8);
            return;
        }
        new Handler(Looper.getMainLooper()).post((Runnable)new x1.c(this, a8));
    }

    public final void m(a.a a8) {
        x1.a a9 = this.i();
        if (a9 == null) {
            if (a8 == null) {
                return;
            }
            a8.b(new o("No current access token to refresh"));
            return;
        }
        if (!this.d.compareAndSet(false, true)) {
            if (a8 == null) {
                return;
            }
            a8.b(new o("Refresh already in progress"));
            return;
        }
        this.e = new Date();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        d d8 = new d();
        Object object = f;
        object = new J(((a)object).d(a9, new x1.d(atomicBoolean, (Set)hashSet, (Set)hashSet2, (Set)hashSet3)), ((a)object).c(a9, new x1.e(d8)));
        object.f(new f(d8, a9, a8, atomicBoolean, (Set)hashSet, (Set)hashSet2, (Set)hashSet3, this));
        object.q();
    }

    public final void q(x1.a a8, x1.a a9) {
        Intent intent = new Intent(B.l(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", (Parcelable)a8);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", (Parcelable)a9);
        this.a.d(intent);
    }

    public final void r(x1.a a8) {
        this.s(a8, true);
    }

    public final void s(x1.a a8, boolean bl) {
        x1.a a9 = this.c;
        this.c = a8;
        this.d.set(false);
        this.e = new Date(0L);
        if (bl) {
            Object object = this.b;
            if (a8 != null) {
                object.g(a8);
            } else {
                object.a();
                object = P.a;
                P.i(B.l());
            }
        }
        if (!P.e(a9, a8)) {
            this.q(a9, a8);
            this.t();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void t() {
        Context context = B.l();
        a.c c8 = x1.a.z;
        x1.a a8 = c8.e();
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        if (!c8.g()) return;
        if (a8 == null) {
            return;
        }
        c8 = a8.g();
        if (c8 == null) return;
        if (alarmManager == null) {
            return;
        }
        c8 = new Intent(context, CurrentAccessTokenExpirationBroadcastReceiver.class);
        c8.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        c8 = PendingIntent.getBroadcast((Context)context, (int)0, (Intent)c8, (int)67108864);
        try {
            alarmManager.set(1, a8.g().getTime(), (PendingIntent)c8);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final boolean u() {
        x1.a a8 = this.i();
        boolean bl = false;
        if (a8 == null) {
            return false;
        }
        long l8 = new Date().getTime();
        boolean bl2 = bl;
        if (a8.k().e()) {
            bl2 = bl;
            if (l8 - this.e.getTime() > 3600000L) {
                bl2 = bl;
                if (l8 - a8.i().getTime() > 86400000L) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }

        public final F c(x1.a object, F.b b8) {
            e e8 = this.f((x1.a)object);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", e8.b());
            bundle.putString("client_id", object.c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            object = F.n.x((x1.a)object, e8.a(), b8);
            object.G(bundle);
            object.F(L.o);
            return object;
        }

        public final F d(x1.a object, F.b b8) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            object = F.n.x((x1.a)object, "me/permissions", b8);
            object.G(bundle);
            object.F(L.o);
            return object;
        }

        public final g e() {
            Object object = g;
            if (object == null) {
                synchronized (this) {
                    Throwable throwable2;
                    block6 : {
                        block5 : {
                            try {
                                g g8 = g;
                                object = g8;
                                if (g8 != null) break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                            object = Z.a.b(B.l());
                            Intrinsics.checkNotNullExpressionValue(object, "getInstance(applicationContext)");
                            object = new g((Z.a)object, new x1.b());
                            g.f((g)object);
                        }
                        return object;
                    }
                    throw throwable2;
                }
            }
            return object;
        }

        public final e f(x1.a object) {
            String string2 = object.h();
            object = string2;
            if (string2 == null) {
                object = "facebook";
            }
            if (Intrinsics.a(object, "instagram")) {
                return new c();
            }
            return new b();
        }
    }

    public static final class b
    implements e {
        public final String a = "oauth/access_token";
        public final String b = "fb_extend_sso_token";

        @Override
        public String a() {
            return this.a;
        }

        @Override
        public String b() {
            return this.b;
        }
    }

    public static final class c
    implements e {
        public final String a = "refresh_access_token";
        public final String b = "ig_refresh_token";

        @Override
        public String a() {
            return this.a;
        }

        @Override
        public String b() {
            return this.b;
        }
    }

    public static final class d {
        public String a;
        public int b;
        public int c;
        public Long d;
        public String e;

        public final String a() {
            return this.a;
        }

        public final Long b() {
            return this.d;
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public final void f(String string2) {
            this.a = string2;
        }

        public final void g(Long l8) {
            this.d = l8;
        }

        public final void h(int n8) {
            this.b = n8;
        }

        public final void i(int n8) {
            this.c = n8;
        }

        public final void j(String string2) {
            this.e = string2;
        }
    }

    public static interface e {
        public String a();

        public String b();
    }

}

