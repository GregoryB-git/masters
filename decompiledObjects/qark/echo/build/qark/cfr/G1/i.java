/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.math.BigDecimal
 *  java.util.Currency
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package G1;

import O1.q;
import O1.r;
import O1.v;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import y1.F;
import y1.p;

public final class i {
    public static final i a = new i();
    public static final String b = i.class.getCanonicalName();
    public static final F c = new F(B.l());

    public static final boolean c() {
        r r8 = v.f(B.m());
        if (r8 != null && B.p() && r8.e()) {
            return true;
        }
        return false;
    }

    public static final void d() {
        Context context = B.l();
        String string2 = B.m();
        if (B.p()) {
            if (context instanceof Application) {
                p.b.a((Application)context, string2);
                return;
            }
            Log.w((String)b, (String)"Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    public static final void e(String string2, long l8) {
        Object object = B.l();
        r r8 = v.q(B.m(), false);
        if (r8 != null && r8.a() && l8 > 0L) {
            object = new F((Context)object);
            r8 = new Bundle(1);
            r8.putCharSequence("fb_aa_time_spent_view_name", (CharSequence)string2);
            object.c("fb_aa_time_spent_on_view", l8, (Bundle)r8);
        }
    }

    public static final void f(String object, String string2, boolean bl) {
        Intrinsics.checkNotNullParameter(object, "purchase");
        Intrinsics.checkNotNullParameter(string2, "skuDetails");
        if (!i.c()) {
            return;
        }
        a a8 = a.a((String)object, string2);
        if (a8 == null) {
            return;
        }
        if (bl) {
            object = q.a;
            if (q.d("app_events_if_auto_log_subs", B.m(), false)) {
                object = E1.i.a.m(string2) ? "StartTrial" : "Subscribe";
                c.i((String)object, a8.c(), a8.a(), a8.b());
                return;
            }
        }
        c.j(a8.c(), a8.a(), a8.b());
    }

    public final a a(String string2, String string3) {
        return this.b(string2, string3, (Map)new HashMap());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final a b(String object, String string2, Map map) {
        try {
            Object object2 = new JSONObject((String)object);
            string2 = new JSONObject(string2);
            object = new Bundle(1);
            object.putCharSequence("fb_iap_product_id", (CharSequence)object2.getString("productId"));
            object.putCharSequence("fb_iap_purchase_time", (CharSequence)object2.getString("purchaseTime"));
            object.putCharSequence("fb_iap_purchase_token", (CharSequence)object2.getString("purchaseToken"));
            object.putCharSequence("fb_iap_package_name", (CharSequence)object2.optString("packageName"));
            object.putCharSequence("fb_iap_product_title", (CharSequence)string2.optString("title"));
            object.putCharSequence("fb_iap_product_description", (CharSequence)string2.optString("description"));
            String string3 = string2.optString("type");
            object.putCharSequence("fb_iap_product_type", (CharSequence)string3);
            if (Intrinsics.a(string3, "subs")) {
                object.putCharSequence("fb_iap_subs_auto_renewing", (CharSequence)Boolean.toString((boolean)object2.optBoolean("autoRenewing", false)));
                object.putCharSequence("fb_iap_subs_period", (CharSequence)string2.optString("subscriptionPeriod"));
                object.putCharSequence("fb_free_trial_period", (CharSequence)string2.optString("freeTrialPeriod"));
                object2 = string2.optString("introductoryPriceCycles");
                Intrinsics.checkNotNullExpressionValue(object2, "introductoryPriceCycles");
                if (object2.length() != 0) {
                    object.putCharSequence("fb_intro_price_amount_micros", (CharSequence)string2.optString("introductoryPriceAmountMicros"));
                    object.putCharSequence("fb_intro_price_cycles", (CharSequence)object2);
                }
            }
            map = map.entrySet().iterator();
            do {
                if (!map.hasNext()) {
                    map = new BigDecimal((double)string2.getLong("price_amount_micros") / 1000000.0);
                    string2 = Currency.getInstance((String)string2.getString("price_currency_code"));
                    Intrinsics.checkNotNullExpressionValue(string2, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
                    return new a((BigDecimal)map, (Currency)string2, (Bundle)object);
                }
                object2 = (Map.Entry)map.next();
                object.putCharSequence((String)object2.getKey(), (CharSequence)((String)object2.getValue()));
            } while (true);
        }
        catch (JSONException jSONException) {}
        Log.e((String)b, (String)"Error parsing in-app subscription data.", (Throwable)jSONException);
        return null;
    }

    public static final class a {
        public BigDecimal a;
        public Currency b;
        public Bundle c;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            Intrinsics.checkNotNullParameter((Object)bigDecimal, "purchaseAmount");
            Intrinsics.checkNotNullParameter((Object)currency, "currency");
            Intrinsics.checkNotNullParameter((Object)bundle, "param");
            this.a = bigDecimal;
            this.b = currency;
            this.c = bundle;
        }

        public final Currency a() {
            return this.b;
        }

        public final Bundle b() {
            return this.c;
        }

        public final BigDecimal c() {
            return this.a;
        }
    }

}

