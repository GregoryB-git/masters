/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package x1;

import O1.P;
import O1.a;
import O1.v;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.C;
import x1.F;
import x1.K;
import x1.W;

public final class X {
    public static final X a = new X();
    public static final String b = X.class.getName();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final a e = new a(true, "com.facebook.sdk.AutoInitEnabled");
    public static final a f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    public static final a g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    public static final a h = new a(false, "auto_event_setup_enabled");
    public static final a i = new a(true, "com.facebook.sdk.MonitorEnabled");
    public static SharedPreferences j;

    public static /* synthetic */ void a(long l8) {
        X.i(l8);
    }

    public static final boolean d() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            a.j();
            boolean bl = g.e();
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, X.class);
            return false;
        }
    }

    public static final boolean e() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            a.j();
            boolean bl = e.e();
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, X.class);
            return false;
        }
    }

    public static final boolean f() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            X x8 = a;
            x8.j();
            boolean bl = x8.b();
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, X.class);
            return false;
        }
    }

    public static final boolean g() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            a.j();
            boolean bl = h.e();
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, X.class);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void i(long l8) {
        block7 : {
            Object object;
            if (T1.a.d(X.class)) {
                return;
            }
            try {
                if (g.e()) {
                    object = v.a;
                    object = v.q(B.m(), false);
                    if (object != null && object.b()) {
                        object = B.l();
                        object = (object = O1.a.f.e((Context)object)) != null && object.h() != null ? object.h() : null;
                    }
                }
                break block7;
            }
            catch (Throwable throwable) {}
            T1.a.b(throwable, X.class);
            return;
            if (object != null) {
                Object object2 = new Bundle();
                object2.putString("advertiser_id", (String)object);
                object2.putString("fields", "auto_event_setup_enabled");
                object = F.n.x(null, "app", null);
                object.G((Bundle)object2);
                object = object.k().c();
                if (object != null) {
                    object2 = h;
                    object2.g(object.optBoolean("auto_event_setup_enabled", false));
                    object2.f(l8);
                    a.u((a)object2);
                }
            }
        }
        d.set(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void n() {
        if (T1.a.d(X.class)) {
            return;
        }
        try {
            Object object = B.l();
            ApplicationInfo applicationInfo = object.getPackageManager().getApplicationInfo(object.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue((Object)applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            applicationInfo = applicationInfo.metaData;
            if (applicationInfo == null) return;
            if (!applicationInfo.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) return;
            object = new y1.F((Context)object);
            applicationInfo = new Bundle();
            if (!P.U()) {
                applicationInfo.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w((String)b, (String)"You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            object.d("fb_auto_applink", (Bundle)applicationInfo);
            return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, X.class);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final Boolean q() {
        Object object = "";
        if (T1.a.d(X.class)) {
            return null;
        }
        try {
            a.t();
            Object object2 = j;
            if (object2 == null) {
                Intrinsics.n("userSettingPref");
                throw null;
            }
            if ((object2 = object2.getString(f.b(), "")) != null) {
                object = object2;
            }
            if (object.length() <= 0) return null;
            return new JSONObject((String)object).getBoolean("value");
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, X.class);
        return null;
        catch (JSONException jSONException) {}
        object = P.a;
        P.i0(b, (Exception)jSONException);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void s(boolean bl) {
        if (T1.a.d(X.class)) {
            return;
        }
        try {
            a a8 = f;
            a8.g(bl);
            a8.f(System.currentTimeMillis());
            if (c.get()) {
                a.u(a8);
                return;
            }
            a.j();
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, X.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b() {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            Map map = v.g();
            if (map == null) return f.e();
            if (!map.isEmpty()) {
                Boolean bl = (Boolean)map.get((Object)"auto_log_app_events_enabled");
                map = (Boolean)map.get((Object)"auto_log_app_events_default");
                if (bl != null) {
                    return bl;
                }
                bl = this.c();
                if (bl != null) {
                    return bl;
                }
                if (map != null) return map.booleanValue();
                return true;
            }
            return f.e();
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Boolean c() {
        Boolean bl;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            bl = X.q();
            if (bl != null) return bl;
        }
        catch (Throwable throwable) {}
        bl = this.l();
        if (bl != null) return bl;
        return null;
        T1.a.b(throwable, this);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            a a8 = h;
            this.r(a8);
            long l8 = System.currentTimeMillis();
            if (a8.d() != null && l8 - a8.c() < 604800000L) {
                return;
            }
            a8.g(null);
            a8.f(0L);
            if (!d.compareAndSet(false, true)) {
                return;
            }
            B.t().execute((Runnable)new W(l8));
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    public final void j() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (!B.F()) {
                return;
            }
            if (!c.compareAndSet(false, true)) {
                return;
            }
            SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            Intrinsics.checkNotNullExpressionValue((Object)sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
            j = sharedPreferences;
            this.k(f, g, e);
            this.h();
            this.p();
            this.o();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* varargs */ void k(a ... arra) {
        int n8;
        int n9;
        if (T1.a.d(this)) {
            return;
        }
        try {
            n9 = arra.length;
            n8 = 0;
        }
        catch (Throwable throwable) {}
        while (n8 < n9) {
            a a8 = arra[n8];
            int n10 = n8 + 1;
            if (a8 == h) {
                this.h();
                n8 = n10;
                continue;
            }
            if (a8.d() == null) {
                this.r(a8);
                n8 = n10;
                if (a8.d() != null) continue;
                this.m(a8);
                n8 = n10;
                continue;
            }
            this.u(a8);
            n8 = n10;
        }
        return;
        T1.a.b(throwable, this);
    }

    /*
     * Exception decompiling
     */
    public final Boolean l() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CATCHBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void m(a a8) {
        Throwable throwable2222;
        block5 : {
            if (T1.a.d(this)) {
                return;
            }
            try {
                this.t();
                Context context = B.l();
                context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue((Object)context, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = context.metaData;
                if (bundle == null) return;
                if (!bundle.containsKey(a8.b())) return;
                a8.g(context.metaData.getBoolean(a8.b(), a8.a()));
                return;
            }
            catch (Throwable throwable2222) {
                break block5;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                P p8 = P.a;
                P.i0(b, (Exception)nameNotFoundException);
            }
            return;
        }
        T1.a.b(throwable2222, this);
    }

    public final void o() {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void p() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Context context = B.l();
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue((Object)context, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            context = context.metaData;
            if (context == null) return;
            if (!context.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                Log.w((String)b, (String)"You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
            }
            if (X.d()) return;
            Log.w((String)b, (String)"The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void r(a object) {
        Object object2 = "";
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.t();
            Object object3 = j;
            if (object3 == null) {
                Intrinsics.n("userSettingPref");
                throw null;
            }
            if ((object3 = object3.getString(object.b(), "")) != null) {
                object2 = object3;
            }
            if (object2.length() <= 0) return;
            object2 = new JSONObject((String)object2);
            object.g(object2.getBoolean("value"));
            object.f(object2.getLong("last_timestamp"));
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return;
        catch (JSONException jSONException) {}
        object = P.a;
        P.i0(b, (Exception)jSONException);
    }

    public final void t() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (c.get()) {
                return;
            }
            throw new C("The UserSettingManager has not been initialized successfully");
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void u(a object) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.t();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", (Object)object.d());
            jSONObject.put("last_timestamp", object.c());
            SharedPreferences sharedPreferences = j;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(object.b(), jSONObject.toString()).apply();
                this.o();
                return;
            }
            Intrinsics.n("userSettingPref");
            throw null;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return;
        catch (Exception exception) {}
        object = P.a;
        P.i0(b, exception);
    }

    public static final class a {
        public boolean a;
        public String b;
        public Boolean c;
        public long d;

        public a(boolean bl, String string2) {
            Intrinsics.checkNotNullParameter(string2, "key");
            this.a = bl;
            this.b = string2;
        }

        public final boolean a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final long c() {
            return this.d;
        }

        public final Boolean d() {
            return this.c;
        }

        public final boolean e() {
            Boolean bl = this.c;
            if (bl == null) {
                return this.a;
            }
            return bl;
        }

        public final void f(long l8) {
            this.d = l8;
        }

        public final void g(Boolean bl) {
            this.c = bl;
        }
    }

}

