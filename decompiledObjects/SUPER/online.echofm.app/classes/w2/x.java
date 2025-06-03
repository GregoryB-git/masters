package w2;

import E2.l;
import G2.c;
import G2.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.List;

public final class x
{
  public final Context a;
  public int b;
  public int c = 0;
  
  public x(Context paramContext)
  {
    a = paramContext;
  }
  
  public final int a()
  {
    try
    {
      if (b == 0) {}
      PackageInfo localPackageInfo;
      String str;
      i = b;
    }
    finally
    {
      try
      {
        localPackageInfo = d.a(a).e("com.google.android.gms", 0);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        str = String.valueOf(localNameNotFoundException);
        i = str.length();
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 23);
        localStringBuilder.append("Failed to find package ");
        localStringBuilder.append(str);
        Log.w("Metadata", localStringBuilder.toString());
        localStringBuilder = null;
        if (localStringBuilder == null) {
          break label90;
        }
        b = versionCode;
      }
      localObject = finally;
      break label99;
    }
    int i;
    StringBuilder localStringBuilder;
    label90:
    return i;
    label99:
    throw localStringBuilder;
  }
  
  public final int b()
  {
    List localList;
    label209:
    try
    {
      i = c;
      if (i != 0) {
        return i;
      }
      PackageManager localPackageManager = a.getPackageManager();
      if (d.a(a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1)
      {
        Log.e("Metadata", "Google Play services missing or without correct permission.");
        return 0;
      }
    }
    finally
    {
      break label209;
      boolean bool = l.h();
      int i = 1;
      if (!bool)
      {
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>("com.google.android.c2dm.intent.REGISTER");
        ((Intent)localObject2).setPackage("com.google.android.gms");
        localObject2 = ((PackageManager)localObject1).queryIntentServices((Intent)localObject2, 0);
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          c = 1;
          return 1;
        }
      }
      Object localObject2 = new android/content/Intent;
      ((Intent)localObject2).<init>("com.google.iid.TOKEN_REQUEST");
      ((Intent)localObject2).setPackage("com.google.android.gms");
      localList = ((PackageManager)localObject1).queryBroadcastReceivers((Intent)localObject2, 0);
      if ((localList != null) && (localList.size() > 0))
      {
        c = 2;
        return 2;
      }
      Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
      if (l.h())
      {
        c = 2;
        i = 2;
      }
      else
      {
        c = 1;
      }
      return i;
    }
  }
}

/* Location:
 * Qualified Name:     w2.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */