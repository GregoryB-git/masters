/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.math.BigDecimal
 *  java.util.Currency
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.UUID
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package y1;

import F1.b;
import G1.f;
import G1.i;
import I1.c;
import O1.C;
import O1.P;
import O1.Q;
import O1.n;
import O1.v;
import O1.y;
import V5.t;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.N;
import x1.a;
import x1.o;
import y1.C;
import y1.L;
import y1.d;
import y1.e;
import y1.n;
import y1.p;
import y1.q;
import y1.r;

public final class s {
    public static final a c;
    public static final String d;
    public static ScheduledThreadPoolExecutor e;
    public static p.b f;
    public static final Object g;
    public static String h;
    public static boolean i;
    public static String j;
    public final String a;
    public y1.a b;

    static {
        String string2;
        c = new a(null);
        String string3 = string2 = s.class.getCanonicalName();
        if (string2 == null) {
            string3 = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        d = string3;
        f = p.b.o;
        g = new Object();
    }

    public s(Context context, String string2, x1.a a8) {
        this(P.t(context), string2, a8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public s(String object, String string2, x1.a a8) {
        Intrinsics.checkNotNullParameter(object, "activityName");
        Q.l();
        this.a = object;
        object = a8;
        if (a8 == null) {
            object = x1.a.z.e();
        }
        if (object != null && !object.n() && (string2 == null || Intrinsics.a(string2, object.c()))) {
            object = new y1.a((x1.a)object);
        } else {
            object = string2;
            if (string2 == null) {
                object = P.a;
                object = P.J(B.l());
            }
            if (object == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            object = new y1.a(null, (String)object);
        }
        this.b = object;
        c.o();
    }

    public static final /* synthetic */ String a() {
        if (T1.a.d(s.class)) {
            return null;
        }
        try {
            String string2 = h;
            return string2;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, s.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (T1.a.d(s.class)) {
            return null;
        }
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = e;
            return scheduledThreadPoolExecutor;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, s.class);
            return null;
        }
    }

    public static final /* synthetic */ p.b c() {
        if (T1.a.d(s.class)) {
            return null;
        }
        try {
            p.b b8 = f;
            return b8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, s.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (T1.a.d(s.class)) {
            return null;
        }
        try {
            String string2 = j;
            return string2;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, s.class);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        if (T1.a.d(s.class)) {
            return null;
        }
        try {
            Object object = g;
            return object;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, s.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        if (T1.a.d(s.class)) {
            return false;
        }
        try {
            boolean bl = i;
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, s.class);
            return false;
        }
    }

    public static final /* synthetic */ void g(boolean bl) {
        if (T1.a.d(s.class)) {
            return;
        }
        try {
            i = bl;
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, s.class);
            return;
        }
    }

    public static final /* synthetic */ void h(String string2) {
        if (T1.a.d(s.class)) {
            return;
        }
        try {
            h = string2;
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, s.class);
            return;
        }
    }

    public static final /* synthetic */ void i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (T1.a.d(s.class)) {
            return;
        }
        try {
            e = scheduledThreadPoolExecutor;
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, s.class);
            return;
        }
    }

    public final void j() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            n n8 = n.a;
            n.l(C.o);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public final String k() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            String string2 = this.b.b();
            return string2;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    public final void l(String string2) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.o(string2, null);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public final void m(String string2, double d8) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.n(string2, d8, null);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public final void n(String string2, double d8, Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.p(string2, d8, bundle, false, f.m());
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public final void o(String string2, Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.p(string2, null, bundle, false, f.m());
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
    public final void p(String object, Double d8, Bundle bundle, boolean bl, UUID uUID) {
        if (T1.a.d(this)) {
            return;
        }
        if (object != null) {
            Throwable throwable2;
            block9 : {
                JSONException jSONException2;
                block10 : {
                    try {
                        if (object.length() == 0) {
                            return;
                        }
                        O1.q q8 = O1.q.a;
                        boolean bl2 = O1.q.d("app_events_killswitch", B.m(), false);
                        if (bl2) {
                            O1.C.e.c(N.s, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", object);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    try {
                        b.h(bundle, (String)object);
                        F1.c.e(bundle);
                        object = new e(this.a, (String)object, d8, bundle, bl, f.o(), uUID);
                        c.q((e)object, this.b);
                        return;
                    }
                    catch (o o8) {
                    }
                    catch (JSONException jSONException2) {
                        break block10;
                    }
                    O1.C.e.c(N.s, "AppEvents", "Invalid app event: %s", o8.toString());
                    return;
                }
                O1.C.e.c(N.s, "AppEvents", "JSON encoding for app event failed: '%s'", jSONException2.toString());
                return;
            }
            T1.a.b(throwable2, this);
        }
    }

    public final void q(String string2, String string3) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", string3);
            this.o(string2, bundle);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public final void r(String string2, Double d8, Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.p(string2, d8, bundle, true, f.m());
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void s(String var1_1, BigDecimal var2_3, Currency var3_4, Bundle var4_5) {
        if (T1.a.d(this)) {
            return;
        }
        if (var2_3 == null || var3_4 == null) ** GOTO lbl11
        var5_6 = var4_5;
        if (var4_5 != null) ** GOTO lbl8
        try {
            var5_6 = new Bundle();
lbl8: // 2 sources:
            var5_6.putString("fb_currency", var3_4.getCurrencyCode());
            this.p((String)var1_1, var2_3.doubleValue(), var5_6, true, f.m());
            return;
lbl11: // 1 sources:
            var1_1 = P.a;
            P.j0(s.d, "purchaseAmount and currency cannot be null");
            return;
        }
        catch (Throwable var1_2) {}
        T1.a.b(var1_2, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void t(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (i.c()) {
                Log.w((String)d, (String)"You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
            }
            this.u(bigDecimal, currency, bundle, false);
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void u(BigDecimal var1_1, Currency var2_3, Bundle var3_4, boolean var4_5) {
        if (T1.a.d(this)) {
            return;
        }
        if (var1_1 != null) ** GOTO lbl7
        try {
            a.e(s.c, "purchaseAmount cannot be null");
            return;
lbl7: // 1 sources:
            if (var2_3 == null) {
                a.e(s.c, "currency cannot be null");
                return;
            }
            var5_6 = var3_4;
            if (var3_4 == null) {
                var5_6 = new Bundle();
            }
            var5_6.putString("fb_currency", var2_3.getCurrencyCode());
            this.p("fb_mobile_purchase", var1_1.doubleValue(), var5_6, var4_5, f.m());
            s.c.g();
            return;
        }
        catch (Throwable var1_2) {}
        T1.a.b(var1_2, this);
    }

    public final void v(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.u(bigDecimal, currency, bundle, true);
            return;
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
    public final void w(Bundle object, String string2) {
        block8 : {
            if (T1.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(object, "payload");
                object = object.getString("fb_push_payload");
                if (P.c0((String)object)) {
                    return;
                }
                object = new JSONObject((String)object).getString("campaign");
                break block8;
            }
            catch (Throwable throwable) {}
            T1.a.b(throwable, this);
            return;
            catch (JSONException jSONException) {}
            object = null;
        }
        if (object == null) {
            O1.C.e.b(N.t, d, "Malformed payload specified for logging a push notification open.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("fb_push_campaign", (String)object);
        if (string2 != null) {
            bundle.putString("fb_push_action", string2);
        }
        this.o("fb_mobile_push_opened", bundle);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public static /* synthetic */ void a(Context context, s s8) {
            a.n(context, s8);
        }

        public static /* synthetic */ void b() {
            a.p();
        }

        public static final /* synthetic */ void e(a a8, String string2) {
            a8.r(string2);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static final void n(Context context, s s8) {
            int n8;
            Intrinsics.checkNotNullParameter((Object)context, "$context");
            Intrinsics.checkNotNullParameter(s8, "$logger");
            Bundle bundle = new Bundle();
            int n9 = n8 = 0;
            do {
                int n10;
                n10 = n8 + 1;
                String string2 = new String[]{"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"}[n8];
                String string3 = new String[]{"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"}[n8];
                try {
                    Class.forName((String)string2);
                    bundle.putInt(string3, 1);
                    n9 |= 1 << n8;
                }
                catch (ClassNotFoundException classNotFoundException) {}
                if (n10 > 10) {
                    if ((context = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0)).getInt("kitsBitmask", 0) != n9) {
                        context.edit().putInt("kitsBitmask", n9).apply();
                        s8.r("fb_sdk_initialize", null, bundle);
                    }
                    return;
                }
                n8 = n10;
            } while (true);
        }

        public static final void p() {
            HashSet hashSet = new HashSet();
            Iterator iterator = n.p().iterator();
            while (iterator.hasNext()) {
                hashSet.add((Object)((y1.a)iterator.next()).b());
            }
            hashSet = hashSet.iterator();
            while (hashSet.hasNext()) {
                v.q((String)hashSet.next(), true);
            }
        }

        public final void f(Application application, String string2) {
            Intrinsics.checkNotNullParameter((Object)application, "application");
            if (B.F()) {
                d.e();
                L.i();
                String string3 = string2;
                if (string2 == null) {
                    string3 = B.m();
                }
                B.K((Context)application, string3);
                f.x(application, string3);
                return;
            }
            throw new o("The Facebook sdk must be initialized before calling activateApp");
        }

        public final void g() {
            if (this.j() != p.b.p) {
                n n8 = n.a;
                n.l(C.t);
            }
        }

        public final Executor h() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            if (s.b() == null) {
                this.o();
            }
            if ((scheduledThreadPoolExecutor = s.b()) != null) {
                return scheduledThreadPoolExecutor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public final String i(Context object) {
            Intrinsics.checkNotNullParameter(object, "context");
            if (s.a() == null) {
                Object object2 = s.e();
                // MONITORENTER : object2
                if (s.a() == null) {
                    s.h(object.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                    if (s.a() == null) {
                        UUID uUID = UUID.randomUUID();
                        Intrinsics.checkNotNullExpressionValue((Object)uUID, "randomUUID()");
                        s.h(Intrinsics.i("XZ", (Object)uUID));
                        object.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", s.a()).apply();
                    }
                }
                object = t.a;
                // MONITOREXIT : object2
            }
            if ((object = s.a()) == null) throw new IllegalStateException("Required value was null.".toString());
            return object;
            catch (Throwable throwable) {
                throw throwable;
            }
        }

        public final p.b j() {
            Object object = s.e();
            synchronized (object) {
                p.b b8 = s.c();
                return b8;
            }
        }

        public final String k() {
            y y8 = y.a;
            y.d(new y.a(){

                @Override
                public void a(String string2) {
                    s.c.t(string2);
                }
            });
            return B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public final String l() {
            Object object = s.e();
            synchronized (object) {
                String string2 = s.d();
                return string2;
            }
        }

        public final void m(Context context, String object) {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            if (!B.p()) {
                return;
            }
            object = new s(context, (String)object, null);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = s.b();
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.execute((Runnable)new r(context, (s)object));
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void o() {
            Object object;
            Object object2 = s.e();
            synchronized (object2) {
                object = s.b();
                if (object != null) {
                    return;
                }
                s.i(new ScheduledThreadPoolExecutor(1));
                object = t.a;
            }
            object2 = new q();
            object = s.b();
            if (object != null) {
                object.scheduleAtFixedRate((Runnable)object2, 0L, 86400L, TimeUnit.SECONDS);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final void q(e e8, y1.a a8) {
            n.g(a8, e8);
            O1.n n8 = O1.n.a;
            if (O1.n.g(n.b.F) && c.d()) {
                c.e(a8.b(), e8);
            }
            if (!e8.c() && !s.f()) {
                if (Intrinsics.a(e8.f(), "fb_mobile_activate_app")) {
                    s.g(true);
                    return;
                }
                O1.C.e.b(N.s, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        public final void r(String string2) {
            O1.C.e.b(N.t, "AppEvents", string2);
        }

        public final void s() {
            n.s();
        }

        public final void t(String string2) {
            SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (string2 != null) {
                sharedPreferences.edit().putString("install_referrer", string2).apply();
            }
        }

    }

}

