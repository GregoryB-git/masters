package i6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.List;
import v6.e;
import x6.c;
import x6.d;

public final class a0
{
  public final Context a;
  public int b;
  public int c = 0;
  
  public a0(Context paramContext)
  {
    a = paramContext;
  }
  
  public final int a()
  {
    try
    {
      if (b == 0)
      {
        Object localObject1;
        try
        {
          PackageInfo localPackageInfo = d.a(a).b(0, "com.google.android.gms");
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          Log.w("Metadata", "Failed to find package ".concat(localNameNotFoundException.toString()));
          localObject1 = null;
        }
        if (localObject1 != null) {
          b = versionCode;
        }
      }
      int i = b;
      return i;
    }
    finally {}
  }
  
  public final int b()
  {
    try
    {
      int i = c;
      if (i != 0) {
        return i;
      }
      Object localObject1 = a;
      Object localObject2 = ((Context)localObject1).getPackageManager();
      if (aa.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1)
      {
        Log.e("Metadata", "Google Play services missing or without correct permission.");
        return 0;
      }
      boolean bool = e.a();
      i = 2;
      if (!bool)
      {
        localObject1 = new android/content/Intent;
        ((Intent)localObject1).<init>("com.google.android.c2dm.intent.REGISTER");
        ((Intent)localObject1).setPackage("com.google.android.gms");
        localObject1 = ((PackageManager)localObject2).queryIntentServices((Intent)localObject1, 0);
        if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
        {
          i = 1;
          break label149;
        }
      }
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>("com.google.iid.TOKEN_REQUEST");
      ((Intent)localObject1).setPackage("com.google.android.gms");
      localObject2 = ((PackageManager)localObject2).queryBroadcastReceivers((Intent)localObject1, 0);
      if ((localObject2 != null) && (!((List)localObject2).isEmpty()))
      {
        label149:
        c = i;
        return i;
      }
      Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
      if (true != e.a()) {
        i = 1;
      }
      c = i;
      return i;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     i6.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */