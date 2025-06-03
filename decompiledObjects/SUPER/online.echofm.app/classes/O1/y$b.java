package O1;

import T1.a;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;

public final class y$b
  implements InstallReferrerStateListener
{
  public y$b(InstallReferrerClient paramInstallReferrerClient, y.a parama) {}
  
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
          b.a((String)localObject2);
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

/* Location:
 * Qualified Name:     O1.y.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */