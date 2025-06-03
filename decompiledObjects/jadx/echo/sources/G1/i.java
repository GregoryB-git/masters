package G1;

import O1.C0454q;
import O1.C0458v;
import O1.r;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import y1.C2237F;
import y1.C2259p;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2047a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final String f2048b = i.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static final C2237F f2049c = new C2237F(C2146B.l());

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public BigDecimal f2050a;

        /* renamed from: b, reason: collision with root package name */
        public Currency f2051b;

        /* renamed from: c, reason: collision with root package name */
        public Bundle f2052c;

        public a(BigDecimal purchaseAmount, Currency currency, Bundle param) {
            Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(param, "param");
            this.f2050a = purchaseAmount;
            this.f2051b = currency;
            this.f2052c = param;
        }

        public final Currency a() {
            return this.f2051b;
        }

        public final Bundle b() {
            return this.f2052c;
        }

        public final BigDecimal c() {
            return this.f2050a;
        }
    }

    public static final boolean c() {
        r f7 = C0458v.f(C2146B.m());
        return f7 != null && C2146B.p() && f7.e();
    }

    public static final void d() {
        Context l7 = C2146B.l();
        String m7 = C2146B.m();
        if (C2146B.p()) {
            if (l7 instanceof Application) {
                C2259p.f21393b.a((Application) l7, m7);
            } else {
                Log.w(f2048b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void e(String str, long j7) {
        Context l7 = C2146B.l();
        r q7 = C0458v.q(C2146B.m(), false);
        if (q7 == null || !q7.a() || j7 <= 0) {
            return;
        }
        C2237F c2237f = new C2237F(l7);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        c2237f.c("fb_aa_time_spent_on_view", j7, bundle);
    }

    public static final void f(String purchase, String skuDetails, boolean z7) {
        a a7;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        if (c() && (a7 = f2047a.a(purchase, skuDetails)) != null) {
            if (z7) {
                C0454q c0454q = C0454q.f3908a;
                if (C0454q.d("app_events_if_auto_log_subs", C2146B.m(), false)) {
                    f2049c.i(E1.i.f1577a.m(skuDetails) ? "StartTrial" : "Subscribe", a7.c(), a7.a(), a7.b());
                    return;
                }
            }
            f2049c.j(a7.c(), a7.a(), a7.b());
        }
    }

    public final a a(String str, String str2) {
        return b(str, str2, new HashMap());
    }

    public final a b(String str, String str2, Map map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (Intrinsics.a(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                Intrinsics.checkNotNullExpressionValue(introductoryPriceCycles, "introductoryPriceCycles");
                if (introductoryPriceCycles.length() != 0) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", introductoryPriceCycles);
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                bundle.putCharSequence((String) entry.getKey(), (String) entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException e7) {
            Log.e(f2048b, "Error parsing in-app subscription data.", e7);
            return null;
        }
    }
}
