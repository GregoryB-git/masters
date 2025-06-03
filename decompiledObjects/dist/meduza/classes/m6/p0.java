package m6;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import j6.b;
import java.util.Arrays;

public final class p0
{
  public static final Uri e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
  public final String a;
  public final String b;
  public final ComponentName c;
  public final boolean d;
  
  public p0(ComponentName paramComponentName)
  {
    a = null;
    b = null;
    j.i(paramComponentName);
    c = paramComponentName;
    d = false;
  }
  
  public p0(String paramString1, String paramString2, boolean paramBoolean)
  {
    j.e(paramString1);
    a = paramString1;
    j.e(paramString2);
    b = paramString2;
    c = null;
    d = paramBoolean;
  }
  
  public final Intent a(Context paramContext)
  {
    if (a != null)
    {
      boolean bool = d;
      Object localObject1 = null;
      StringBuilder localStringBuilder = null;
      label111:
      Object localObject2;
      if (bool)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("serviceActionBundleKey", a);
        try
        {
          localObject1 = paramContext.getContentResolver().acquireUnstableContentProviderClient(e);
          if (localObject1 != null) {}
          try
          {
            paramContext = ((ContentProviderClient)localObject1).call("serviceIntentCall", null, localBundle);
            try
            {
              ((ContentProviderClient)localObject1).release();
              localObject1 = paramContext;
            }
            catch (IllegalArgumentException localIllegalArgumentException1)
            {
              break label111;
            }
            catch (RemoteException localRemoteException1)
            {
              break label111;
            }
            paramContext.<init>("Failed to acquire ContentProviderClient");
          }
          finally
          {
            localRemoteException1.release();
          }
          throw paramContext;
        }
        catch (IllegalArgumentException localIllegalArgumentException2) {}catch (RemoteException localRemoteException2) {}
        paramContext = null;
        Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(localRemoteException2.toString()));
        localObject2 = paramContext;
        paramContext = localStringBuilder;
        if (localObject2 != null)
        {
          paramContext = (Intent)((Bundle)localObject2).getParcelable("serviceResponseIntentKey");
          if (paramContext == null)
          {
            localObject2 = (PendingIntent)((Bundle)localObject2).getParcelable("serviceMissingResolutionIntentKey");
            if (localObject2 != null)
            {
              paramContext = a;
              localStringBuilder = new StringBuilder();
              localStringBuilder.append("Dynamic lookup for intent failed for action ");
              localStringBuilder.append(paramContext);
              localStringBuilder.append(" but has possible resolution");
              Log.w("ConnectionStatusConfig", localStringBuilder.toString());
              throw new g0(new b(25, (PendingIntent)localObject2));
            }
          }
        }
        localObject2 = paramContext;
        if (paramContext == null)
        {
          Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(a)));
          localObject2 = paramContext;
        }
      }
      paramContext = (Context)localObject2;
      if (localObject2 == null) {
        return new Intent(a).setPackage(b);
      }
    }
    else
    {
      paramContext = new Intent().setComponent(c);
    }
    return paramContext;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof p0)) {
      return false;
    }
    paramObject = (p0)paramObject;
    return (h.a(a, a)) && (h.a(b, b)) && (h.a(c, c)) && (d == d);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, Integer.valueOf(4225), Boolean.valueOf(d) });
  }
  
  public final String toString()
  {
    String str1 = a;
    String str2 = str1;
    if (str1 == null)
    {
      j.i(c);
      str2 = c.flattenToString();
    }
    return str2;
  }
}

/* Location:
 * Qualified Name:     m6.p0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */