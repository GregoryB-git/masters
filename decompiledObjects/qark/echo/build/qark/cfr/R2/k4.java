/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package R2;

import E2.e;
import R2.C3;
import R2.G2;
import R2.K;
import R2.P1;
import R2.S5;
import R2.Y1;
import R2.a2;
import R2.c6;
import R2.g;
import R2.l5;
import R2.n5;
import R2.o4;
import R2.o5;
import R2.v4;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.H6;
import com.google.android.gms.internal.measurement.y7;

public final class k4
implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C3 o;

    public k4(C3 c32) {
        this.o = c32;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void a(k4 var0, boolean var1_1, Uri var2_2, String var3_4, String var4_5) {
        var0.o.n();
        try {
            var8_6 = var0.o.k();
            var5_7 = y7.a() != false && var0.o.f().s(K.E0) != false;
            var6_8 = H6.a() != false && var0.o.f().s(K.Z0) != false;
            var7_9 = TextUtils.isEmpty((CharSequence)var4_5);
            if (var7_9) ** GOTO lbl10
            if (!(var4_5.contains((CharSequence)"gclid") || var6_8 && var4_5.contains((CharSequence)"gbraid") || var4_5.contains((CharSequence)"utm_campaign") || var4_5.contains((CharSequence)"utm_source") || var4_5.contains((CharSequence)"utm_medium") || var4_5.contains((CharSequence)"utm_id") || var4_5.contains((CharSequence)"dclid") || var4_5.contains((CharSequence)"srsltid") || var5_7 && var4_5.contains((CharSequence)"sfmc_id"))) {
                var8_6.j().F().a("Activity created with data 'referrer' without required params");
lbl10: // 2 sources:
                var8_6 = null;
            } else {
                var9_10 = new StringBuilder("https://google.com/search?");
                var9_10.append(var4_5);
                var8_6 = var9_10 = var8_6.D(Uri.parse((String)var9_10.toString()), var5_7, var6_8);
                if (var9_10 != null) {
                    var9_10.putString("_cis", "referrer");
                    var8_6 = var9_10;
                }
            }
            if (var1_1) {
                var9_10 = var0.o.k();
                var1_1 = y7.a() != false && var0.o.f().s(K.E0) != false;
                var5_7 = H6.a() != false && var0.o.f().s(K.Z0) != false;
                if ((var2_2 = var9_10.D(var2_2, var1_1, var5_7)) != null) {
                    var2_2.putString("_cis", "intent");
                    if (!var2_2.containsKey("gclid") && var8_6 != null && var8_6.containsKey("gclid")) {
                        var2_2.putString("_cer", String.format((String)"gclid=%s", (Object[])new Object[]{var8_6.getString("gclid")}));
                    }
                    var0.o.z0(var3_4, "_cmp", (Bundle)var2_2);
                    var0.o.n.b(var3_4, (Bundle)var2_2);
                }
            }
            if (TextUtils.isEmpty((CharSequence)var4_5)) {
                return;
            }
            var0.o.j().F().b("Activity created with referrer", var4_5);
            var1_1 = var0.o.f().s(K.l0);
            if (var1_1) {
                if (var8_6 != null) {
                    var0.o.z0(var3_4, "_cmp", (Bundle)var8_6);
                    var0.o.n.b(var3_4, (Bundle)var8_6);
                } else {
                    var0.o.j().F().b("Referrer does not contain valid parameters", var4_5);
                }
                var0.o.b0("auto", "_ldl", null, true);
                return;
            }
            if (var4_5.contains((CharSequence)"gclid") && (var4_5.contains((CharSequence)"utm_campaign") || var4_5.contains((CharSequence)"utm_source") || var4_5.contains((CharSequence)"utm_medium") || var4_5.contains((CharSequence)"utm_term") || var4_5.contains((CharSequence)"utm_content"))) {
                if (TextUtils.isEmpty((CharSequence)var4_5) != false) return;
                var0.o.b0("auto", "_ldl", var4_5, true);
                return;
            }
            var0.o.j().F().a("Activity created with data 'referrer' without required params");
            return;
        }
        catch (RuntimeException var2_3) {}
        var0.o.j().G().b("Throwable caught in handleReferrerForOnActivityCreated", (Object)var2_3);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        block7 : {
            Object object;
            Object object2;
            block8 : {
                try {
                    this.o.j().K().a("onActivityCreated");
                    object2 = activity.getIntent();
                    if (object2 == null) break block7;
                    object = object2.getData();
                    if (object == null || !object.isHierarchical()) {
                        object = object2.getExtras();
                        object = object != null && !TextUtils.isEmpty((CharSequence)(object = object.getString("com.android.vending.referral_url"))) ? Uri.parse((String)object) : null;
                    }
                    break block8;
                }
                catch (Throwable throwable) {}
                this.o.s().M(activity, bundle);
                throw throwable;
                catch (RuntimeException runtimeException) {}
                this.o.j().G().b("Throwable caught in onActivityCreated", (Object)runtimeException);
                break block7;
            }
            if (object != null && object.isHierarchical()) {
                this.o.k();
                object2 = S5.e0((Intent)object2) ? "gs" : "auto";
                String string2 = object.getQueryParameter("referrer");
                boolean bl = bundle == null;
                this.o.e().D(new o4(this, bl, (Uri)object, (String)object2, string2));
            }
        }
        this.o.s().M(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.o.s().K(activity);
    }

    public final void onActivityPaused(Activity object) {
        this.o.s().Q((Activity)object);
        object = this.o.u();
        long l8 = object.b().b();
        object.e().D(new n5((l5)object, l8));
    }

    public final void onActivityResumed(Activity activity) {
        l5 l52 = this.o.u();
        long l8 = l52.b().b();
        l52.e().D(new o5(l52, l8));
        this.o.s().S(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.o.s().R(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}

