// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G1;

import java.util.Iterator;
import org.json.JSONException;
import java.util.Currency;
import java.math.BigDecimal;
import org.json.JSONObject;
import java.util.Map;
import java.util.HashMap;
import O1.q;
import kotlin.jvm.internal.Intrinsics;
import android.os.Bundle;
import android.content.Context;
import android.util.Log;
import y1.p;
import android.app.Application;
import O1.r;
import O1.v;
import x1.B;
import y1.F;

public final class i
{
    public static final i a;
    public static final String b;
    public static final F c;
    
    static {
        a = new i();
        b = i.class.getCanonicalName();
        c = new F(B.l());
    }
    
    public static final boolean c() {
        final r f = v.f(B.m());
        return f != null && B.p() && f.e();
    }
    
    public static final void d() {
        final Context l = B.l();
        final String m = B.m();
        if (B.p()) {
            if (l instanceof Application) {
                p.b.a((Application)l, m);
                return;
            }
            Log.w(i.b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }
    
    public static final void e(final String s, final long n) {
        final Context l = B.l();
        final r q = v.q(B.m(), false);
        if (q != null && q.a() && n > 0L) {
            final F f = new F(l);
            final Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", (CharSequence)s);
            f.c("fb_aa_time_spent_on_view", (double)n, bundle);
        }
    }
    
    public static final void f(String s, final String s2, final boolean b) {
        Intrinsics.checkNotNullParameter(s, "purchase");
        Intrinsics.checkNotNullParameter(s2, "skuDetails");
        if (!c()) {
            return;
        }
        final a a = i.a.a(s, s2);
        if (a == null) {
            return;
        }
        if (b) {
            final q a2 = q.a;
            if (q.d("app_events_if_auto_log_subs", B.m(), false)) {
                if (E1.i.a.m(s2)) {
                    s = "StartTrial";
                }
                else {
                    s = "Subscribe";
                }
                i.c.i(s, a.c(), a.a(), a.b());
                return;
            }
        }
        i.c.j(a.c(), a.a(), a.b());
    }
    
    public final a a(final String s, final String s2) {
        return this.b(s, s2, new HashMap());
    }
    
    public final a b(final String s, final String s2, final Map map) {
        while (true) {
            try {
                final JSONObject jsonObject = new JSONObject(s);
                final JSONObject jsonObject2 = new JSONObject(s2);
                final Bundle bundle = new Bundle(1);
                bundle.putCharSequence("fb_iap_product_id", (CharSequence)jsonObject.getString("productId"));
                bundle.putCharSequence("fb_iap_purchase_time", (CharSequence)jsonObject.getString("purchaseTime"));
                bundle.putCharSequence("fb_iap_purchase_token", (CharSequence)jsonObject.getString("purchaseToken"));
                bundle.putCharSequence("fb_iap_package_name", (CharSequence)jsonObject.optString("packageName"));
                bundle.putCharSequence("fb_iap_product_title", (CharSequence)jsonObject2.optString("title"));
                bundle.putCharSequence("fb_iap_product_description", (CharSequence)jsonObject2.optString("description"));
                final String optString = jsonObject2.optString("type");
                bundle.putCharSequence("fb_iap_product_type", (CharSequence)optString);
                if (Intrinsics.a(optString, "subs")) {
                    bundle.putCharSequence("fb_iap_subs_auto_renewing", (CharSequence)Boolean.toString(jsonObject.optBoolean("autoRenewing", false)));
                    bundle.putCharSequence("fb_iap_subs_period", (CharSequence)jsonObject2.optString("subscriptionPeriod"));
                    bundle.putCharSequence("fb_free_trial_period", (CharSequence)jsonObject2.optString("freeTrialPeriod"));
                    final String optString2 = jsonObject2.optString("introductoryPriceCycles");
                    Intrinsics.checkNotNullExpressionValue(optString2, "introductoryPriceCycles");
                    if (optString2.length() != 0) {
                        bundle.putCharSequence("fb_intro_price_amount_micros", (CharSequence)jsonObject2.optString("introductoryPriceAmountMicros"));
                        bundle.putCharSequence("fb_intro_price_cycles", (CharSequence)optString2);
                    }
                }
                for (final Map.Entry<String, V> entry : map.entrySet()) {
                    bundle.putCharSequence((String)entry.getKey(), (CharSequence)entry.getValue());
                }
                final BigDecimal bigDecimal = new BigDecimal(jsonObject2.getLong("price_amount_micros") / 1000000.0);
                final Currency instance = Currency.getInstance(jsonObject2.getString("price_currency_code"));
                Intrinsics.checkNotNullExpressionValue(instance, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
                return new a(bigDecimal, instance, bundle);
                final JSONException ex;
                Log.e(i.b, "Error parsing in-app subscription data.", (Throwable)ex);
                return null;
            }
            catch (JSONException ex) {
                continue;
            }
            break;
        }
    }
    
    public static final class a
    {
        public BigDecimal a;
        public Currency b;
        public Bundle c;
        
        public a(final BigDecimal a, final Currency b, final Bundle c) {
            Intrinsics.checkNotNullParameter(a, "purchaseAmount");
            Intrinsics.checkNotNullParameter(b, "currency");
            Intrinsics.checkNotNullParameter(c, "param");
            this.a = a;
            this.b = b;
            this.c = c;
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
