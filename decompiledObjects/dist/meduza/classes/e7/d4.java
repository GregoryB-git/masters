package e7;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import b.z;
import d2.q;
import java.net.MalformedURLException;
import java.net.URL;
import y5.a;
import y5.a.a;

public final class d4
  extends v
{
  public d4(k3 paramk3, j2 paramj2)
  {
    super(paramj2);
  }
  
  public final void c()
  {
    Object localObject1 = (j2)e.b;
    ((j2)localObject1).zzl().l();
    j2.c(z);
    j2.c(z);
    String str = ((j2)localObject1).h().v();
    Object localObject2 = o.v("google_analytics_adid_collection_enabled");
    int i = 0;
    int j = 0;
    if ((localObject2 != null) && (!((Boolean)localObject2).booleanValue())) {
      k = 0;
    } else {
      k = 1;
    }
    Object localObject4;
    long l;
    Object localObject7;
    if (k == 0)
    {
      localObject2 = zzjw;
      localObject4 = "ADID collection is disabled from Manifest. Skipping";
    }
    else
    {
      localObject2 = ((j2)localObject1).j();
      ((q)localObject2).l();
      if (!((l1)localObject2).y().j(e3.a.b)) {
        localObject2 = new Pair("", Boolean.FALSE);
      }
      for (;;)
      {
        break;
        ((z)((q)localObject2).zzb()).getClass();
        l = SystemClock.elapsedRealtime();
        if ((r != null) && (l < t))
        {
          localObject2 = new Pair(r, Boolean.valueOf(s));
        }
        else
        {
          localObject4 = ((q)localObject2).h();
          localObject4.getClass();
          t = (((h)localObject4).s(str, h0.b) + l);
          try
          {
            localObject7 = a.a(((q)localObject2).zza());
            r = "";
            localObject4 = a;
            if (localObject4 != null) {
              r = ((String)localObject4);
            }
            s = b;
          }
          catch (Exception localException)
          {
            zzjv.c("Unable to get advertising id", localException);
            r = "";
          }
          localObject2 = new Pair(r, Boolean.valueOf(s));
        }
      }
      if ((!((Boolean)second).booleanValue()) && (!TextUtils.isEmpty((CharSequence)first)))
      {
        j2.c(z);
        localObject5 = z;
        ((d3)localObject5).m();
        localObject5 = (ConnectivityManager)((q)localObject5).zza().getSystemService("connectivity");
        if (localObject5 == null) {}
      }
    }
    try
    {
      localObject5 = ((ConnectivityManager)localObject5).getActiveNetworkInfo();
    }
    catch (SecurityException localSecurityException)
    {
      Object localObject8;
      n0 localn0;
      Object localObject6;
      Object localObject3;
      for (;;) {}
    }
    Object localObject5 = null;
    if ((localObject5 != null) && (((NetworkInfo)localObject5).isConnected())) {
      k = 1;
    } else {
      k = 0;
    }
    if (k == 0)
    {
      localObject2 = zzjr;
      localObject5 = "Network is not available for Deferred Deep Link request. Skipping";
    }
    else
    {
      localObject8 = new StringBuilder();
      localObject5 = ((j2)localObject1).l();
      ((o0)localObject5).l();
      ((j0)localObject5).t();
      if ((!((w4)localObject5).F()) || (((q)localObject5).k().s0() >= 234200)) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0)
      {
        localObject5 = ((j2)localObject1).k();
        ((o0)localObject5).l();
        localObject7 = ((o0)localObject5).q();
        ((o0)localObject7).l();
        ((j0)localObject7).t();
        localn0 = e;
        if (localn0 == null)
        {
          ((w4)localObject7).A();
          zzjv.b("Failed to get consents; not connected to service yet.");
        }
        else
        {
          localObject5 = ((w4)localObject7).I(false);
          try
          {
            localObject5 = localn0.v1((k6)localObject5);
            ((w4)localObject7).H();
          }
          catch (RemoteException localRemoteException)
          {
            zzjo.c("Failed to get consents; remote exception", localRemoteException);
          }
        }
        localObject6 = null;
        if (localObject6 != null) {
          localObject6 = a;
        } else {
          localObject6 = null;
        }
        if (localObject6 == null)
        {
          i = O;
          O = (i + 1);
          k = j;
          if (i < 10) {
            k = 1;
          }
          localObject6 = zzjv;
          if (k != 0) {
            localObject2 = "Retrying.";
          } else {
            localObject2 = "Skipping.";
          }
          ((b1)localObject6).c(a0.j.j("Failed to retrieve DMA consent from the service, ", (String)localObject2, " retryCount"), Integer.valueOf(O));
          break label1216;
        }
        localObject7 = e3.b(100, (Bundle)localObject6);
        ((StringBuilder)localObject8).append("&gcs=");
        ((StringBuilder)localObject8).append(((e3)localObject7).m());
        localObject7 = x.a(100, (Bundle)localObject6);
        ((StringBuilder)localObject8).append("&dma=");
        if (c == Boolean.FALSE) {
          k = 0;
        } else {
          k = 1;
        }
        ((StringBuilder)localObject8).append(k);
        if (!TextUtils.isEmpty(d))
        {
          ((StringBuilder)localObject8).append("&dma_cps=");
          ((StringBuilder)localObject8).append(d);
        }
        if (x.c((Bundle)localObject6) == Boolean.TRUE) {
          k = 0;
        } else {
          k = 1;
        }
        ((StringBuilder)localObject8).append("&npa=");
        ((StringBuilder)localObject8).append(k);
        zzjw.c("Consent query parameters to Bow", localObject8);
      }
      localObject7 = ((j2)localObject1).m();
      ((j2)localObject1).h();
      localObject2 = (String)first;
      l = jE.a();
      localObject8 = ((StringBuilder)localObject8).toString();
      localObject7.getClass();
      label1102:
      try
      {
        m6.j.e((String)localObject2);
        m6.j.e(str);
        k = 0;
        try
        {
          localObject6 = String.format("v%s.%s", new Object[] { Long.valueOf(114010L), Integer.valueOf(((r6)localObject7).s0()) });
          boolean bool;
          k = 0;
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          try
          {
            localObject6 = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[] { localObject6, localObject2, str, Long.valueOf(l - 1L) });
            localObject2 = localObject6;
            if (str.equals(((q)localObject7).h().b("debug.deferred.deeplink", ""))) {
              localObject2 = ((String)localObject6).concat("&ddl_test=1");
            }
            bool = ((String)localObject8).isEmpty();
            localObject6 = localObject2;
            if (!bool) {
              localObject6 = localObject2;
            }
            try
            {
              if (((String)localObject8).charAt(0) != '&') {
                localObject6 = ((String)localObject2).concat("&");
              }
              localObject6 = ((String)localObject6).concat((String)localObject8);
              localObject2 = new java/net/URL;
              ((URL)localObject2).<init>((String)localObject6);
              k = 0;
            }
            catch (IllegalArgumentException localIllegalArgumentException1) {}catch (MalformedURLException localMalformedURLException1) {}
          }
          catch (IllegalArgumentException localIllegalArgumentException3)
          {
            break label1102;
          }
          catch (MalformedURLException localMalformedURLException3) {}
          localIllegalArgumentException2 = localIllegalArgumentException2;
        }
        catch (MalformedURLException localMalformedURLException2) {}
      }
      catch (IllegalArgumentException localIllegalArgumentException4) {}catch (MalformedURLException localMalformedURLException4) {}
      k = 0;
      zzjo.c("Failed to create BOW URL for Deferred Deep Link. exception", localMalformedURLException4.getMessage());
      localObject3 = null;
      if (localObject3 != null)
      {
        j2.c(z);
        localObject6 = z;
        localObject1 = new d2.h0(localObject1, 5);
        ((d3)localObject6).m();
        ((q)localObject6).zzl().s(new n4((l4)localObject6, str, (URL)localObject3, null, null, (k4)localObject1));
      }
      break label1216;
      localObject3 = zzjw;
      localObject6 = "ADID unavailable to retrieve Deferred Deep Link. Skipping";
    }
    ((b1)localObject3).b((String)localObject6);
    int k = i;
    label1216:
    if (k != 0) {
      e.C.b(2000L);
    }
  }
}

/* Location:
 * Qualified Name:     e7.d4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */