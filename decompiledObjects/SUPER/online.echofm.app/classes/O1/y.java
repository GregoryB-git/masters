package O1;

import T1.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerClient.Builder;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import x1.B;

public final class y
{
  public static final y a = new y();
  
  public static final void d(a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "callback");
    y localy = a;
    if (!localy.b()) {
      localy.c(parama);
    }
  }
  
  public final boolean b()
  {
    return B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
  }
  
  public final void c(final a parama)
  {
    InstallReferrerClient localInstallReferrerClient = InstallReferrerClient.newBuilder(B.l()).build();
    parama = new b(localInstallReferrerClient, parama);
    try
    {
      localInstallReferrerClient.startConnection(parama);
      return;
    }
    catch (Exception parama)
    {
      for (;;) {}
    }
  }
  
  public final void e()
  {
    B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString);
  }
  
  public static final class b
    implements InstallReferrerStateListener
  {
    public b(InstallReferrerClient paramInstallReferrerClient, y.a parama) {}
    
    public void onInstallReferrerServiceDisconnected() {}
    
    public void onInstallReferrerSetupFinished(int paramInt)
    {
      if (a.d(this)) {
        return;
      }
      if (paramInt != 0) {
        if (paramInt != 2) {
          break label99;
        }
      }
      for (;;)
      {
        try
        {
          y localy = y.a;
          y.a(localy);
        }
        finally {}
        try
        {
          localObject2 = a.getInstallReferrer();
          Intrinsics.checkNotNullExpressionValue(localObject2, "{\n                      referrerClient.installReferrer\n                    }");
          localObject2 = ((ReferrerDetails)localObject2).getInstallReferrer();
          if ((localObject2 != null) && ((i.v((CharSequence)localObject2, "fb", false, 2, null)) || (i.v((CharSequence)localObject2, "facebook", false, 2, null)))) {
            parama.a((String)localObject2);
          }
          localObject2 = y.a;
        }
        catch (RemoteException localRemoteException)
        {
          try
          {
            Object localObject2;
            label99:
            a.endConnection();
            return;
            a.b((Throwable)localObject2, this);
            for (;;)
            {
              return;
              localRemoteException = localRemoteException;
            }
          }
          catch (Exception localException)
          {
            for (;;) {}
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     O1.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */