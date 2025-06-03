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
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import y1.F;
import y1.p;
import y1.p.a;

public final class i
{
  public static final i a = new i();
  public static final String b = i.class.getCanonicalName();
  public static final F c = new F(B.l());
  
  public static final boolean c()
  {
    r localr = v.f(B.m());
    boolean bool;
    if ((localr != null) && (B.p()) && (localr.e())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final void d()
  {
    Context localContext = B.l();
    String str = B.m();
    if (B.p()) {
      if ((localContext instanceof Application)) {
        p.b.a((Application)localContext, str);
      } else {
        Log.w(b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
      }
    }
  }
  
  public static final void e(String paramString, long paramLong)
  {
    Object localObject1 = B.l();
    Object localObject2 = v.q(B.m(), false);
    if ((localObject2 != null) && (((r)localObject2).a()) && (paramLong > 0L))
    {
      localObject2 = new F((Context)localObject1);
      localObject1 = new Bundle(1);
      ((Bundle)localObject1).putCharSequence("fb_aa_time_spent_view_name", paramString);
      ((F)localObject2).c("fb_aa_time_spent_on_view", paramLong, (Bundle)localObject1);
    }
  }
  
  public static final void f(String paramString1, String paramString2, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramString1, "purchase");
    Intrinsics.checkNotNullParameter(paramString2, "skuDetails");
    if (!c()) {
      return;
    }
    a locala = a.a(paramString1, paramString2);
    if (locala == null) {
      return;
    }
    if (paramBoolean)
    {
      paramString1 = q.a;
      if (q.d("app_events_if_auto_log_subs", B.m(), false))
      {
        if (E1.i.a.m(paramString2)) {
          paramString1 = "StartTrial";
        } else {
          paramString1 = "Subscribe";
        }
        c.i(paramString1, locala.c(), locala.a(), locala.b());
        return;
      }
    }
    c.j(locala.c(), locala.a(), locala.b());
  }
  
  public final a a(String paramString1, String paramString2)
  {
    return b(paramString1, paramString2, new HashMap());
  }
  
  public final a b(String paramString1, String paramString2, Map paramMap)
  {
    try
    {
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString1);
      paramString1 = new org/json/JSONObject;
      paramString1.<init>(paramString2);
      paramString2 = new android/os/Bundle;
      paramString2.<init>(1);
      paramString2.putCharSequence("fb_iap_product_id", ((JSONObject)localObject).getString("productId"));
      paramString2.putCharSequence("fb_iap_purchase_time", ((JSONObject)localObject).getString("purchaseTime"));
      paramString2.putCharSequence("fb_iap_purchase_token", ((JSONObject)localObject).getString("purchaseToken"));
      paramString2.putCharSequence("fb_iap_package_name", ((JSONObject)localObject).optString("packageName"));
      paramString2.putCharSequence("fb_iap_product_title", paramString1.optString("title"));
      paramString2.putCharSequence("fb_iap_product_description", paramString1.optString("description"));
      String str = paramString1.optString("type");
      paramString2.putCharSequence("fb_iap_product_type", str);
      if (Intrinsics.a(str, "subs"))
      {
        paramString2.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(((JSONObject)localObject).optBoolean("autoRenewing", false)));
        paramString2.putCharSequence("fb_iap_subs_period", paramString1.optString("subscriptionPeriod"));
        paramString2.putCharSequence("fb_free_trial_period", paramString1.optString("freeTrialPeriod"));
        localObject = paramString1.optString("introductoryPriceCycles");
        Intrinsics.checkNotNullExpressionValue(localObject, "introductoryPriceCycles");
        if (((CharSequence)localObject).length() != 0)
        {
          paramString2.putCharSequence("fb_intro_price_amount_micros", paramString1.optString("introductoryPriceAmountMicros"));
          paramString2.putCharSequence("fb_intro_price_cycles", (CharSequence)localObject);
        }
      }
    }
    catch (JSONException paramString1)
    {
      break label338;
    }
    Object localObject = paramMap.entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramMap = (Map.Entry)((Iterator)localObject).next();
      paramString2.putCharSequence((String)paramMap.getKey(), (String)paramMap.getValue());
    }
    paramMap = new java/math/BigDecimal;
    paramMap.<init>(paramString1.getLong("price_amount_micros") / 1000000.0D);
    paramString1 = Currency.getInstance(paramString1.getString("price_currency_code"));
    Intrinsics.checkNotNullExpressionValue(paramString1, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
    return new a(paramMap, paramString1, paramString2);
    label338:
    Log.e(b, "Error parsing in-app subscription data.", paramString1);
    paramString1 = null;
    return paramString1;
  }
  
  public static final class a
  {
    public BigDecimal a;
    public Currency b;
    public Bundle c;
    
    public a(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
    {
      a = paramBigDecimal;
      b = paramCurrency;
      c = paramBundle;
    }
    
    public final Currency a()
    {
      return b;
    }
    
    public final Bundle b()
    {
      return c;
    }
    
    public final BigDecimal c()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     G1.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */