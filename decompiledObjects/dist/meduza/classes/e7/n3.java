package e7;

import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import d2.q;

public final class n3
  implements Runnable
{
  public n3(AppMeasurementDynamiteService paramAppMeasurementDynamiteService, zzdq paramzzdq, String paramString1, String paramString2, boolean paramBoolean) {}
  
  public n3(i4 parami4, boolean paramBoolean, Uri paramUri, String paramString1, String paramString2) {}
  
  public final void run()
  {
    Object localObject3;
    Object localObject4;
    boolean bool1;
    switch (a)
    {
    default: 
      break;
    case 0: 
      localObject1 = f).a.l();
      localObject2 = (zzdq)e;
      localObject3 = c;
      localObject4 = d;
      bool1 = b;
      ((o0)localObject1).l();
      ((j0)localObject1).t();
      ((w4)localObject1).x(new f4((w4)localObject1, (String)localObject3, (String)localObject4, ((w4)localObject1).I(false), bool1, (zzdq)localObject2));
      return;
    }
    Object localObject2 = (i4)f;
    boolean bool2 = b;
    Uri localUri = (Uri)e;
    Object localObject1 = c;
    String str = d;
    a.l();
    try
    {
      localObject4 = a.k();
      bool1 = TextUtils.isEmpty(str);
      if (!bool1)
      {
        if ((!str.contains("gclid")) && (!str.contains("gbraid")) && (!str.contains("utm_campaign")) && (!str.contains("utm_source")) && (!str.contains("utm_medium")) && (!str.contains("utm_id")) && (!str.contains("dclid")) && (!str.contains("srsltid")) && (!str.contains("sfmc_id"))) {
          zzjv.b("Activity created with data 'referrer' without required params");
        }
      }
      else
      {
        localObject3 = null;
        break label322;
      }
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("https://google.com/search?");
      ((StringBuilder)localObject3).append(str);
      localObject4 = ((r6)localObject4).u(Uri.parse(((StringBuilder)localObject3).toString()));
      localObject3 = localObject4;
      if (localObject4 != null)
      {
        ((BaseBundle)localObject4).putString("_cis", "referrer");
        localObject3 = localObject4;
      }
      label322:
      if (bool2)
      {
        localObject4 = a.k().u(localUri);
        if (localObject4 != null)
        {
          ((BaseBundle)localObject4).putString("_cis", "intent");
          if ((!((BaseBundle)localObject4).containsKey("gclid")) && (localObject3 != null) && (((BaseBundle)localObject3).containsKey("gclid"))) {
            ((BaseBundle)localObject4).putString("_cer", String.format("gclid=%s", new Object[] { ((BaseBundle)localObject3).getString("gclid") }));
          }
          a.Q((String)localObject1, "_cmp", (Bundle)localObject4);
          a.A.a((String)localObject1, (Bundle)localObject4);
        }
      }
      int i = 0;
      if (!TextUtils.isEmpty(str))
      {
        a.zzj().v.c("Activity created with referrer", str);
        bool1 = a.h().x(null, h0.B0);
        if (bool1)
        {
          if (localObject3 != null)
          {
            a.Q((String)localObject1, "_cmp", (Bundle)localObject3);
            a.A.a((String)localObject1, (Bundle)localObject3);
          }
          else
          {
            a.zzj().v.c("Referrer does not contain valid parameters", str);
          }
          a.H("auto", "_ldl", null, true);
        }
        else
        {
          int j = i;
          if (str.contains("gclid")) {
            if ((!str.contains("utm_campaign")) && (!str.contains("utm_source")) && (!str.contains("utm_medium")) && (!str.contains("utm_term")))
            {
              j = i;
              if (!str.contains("utm_content")) {}
            }
            else
            {
              j = 1;
            }
          }
          if (j == 0) {
            a.zzj().v.b("Activity created with data 'referrer' without required params");
          } else if (!TextUtils.isEmpty(str)) {
            a.H("auto", "_ldl", str, true);
          }
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      a.zzj().o.c("Throwable caught in handleReferrerForOnActivityCreated", localRuntimeException);
    }
  }
}

/* Location:
 * Qualified Name:     e7.n3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */