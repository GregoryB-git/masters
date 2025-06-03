package x2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;

public class o
{
  public static o c;
  public final Context a;
  public volatile String b;
  
  public o(Context paramContext)
  {
    a = paramContext.getApplicationContext();
  }
  
  public static o a(Context paramContext)
  {
    A2.n.i(paramContext);
    try
    {
      if (c == null)
      {
        E.d(paramContext);
        o localo = new x2/o;
        localo.<init>(paramContext);
        c = localo;
      }
    }
    finally
    {
      break label45;
    }
    return c;
    label45:
    throw paramContext;
  }
  
  public static final A d(PackageInfo paramPackageInfo, A... paramVarArgs)
  {
    Signature[] arrayOfSignature = signatures;
    if (arrayOfSignature == null) {
      return null;
    }
    if (arrayOfSignature.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    }
    paramPackageInfo = signatures;
    int i = 0;
    paramPackageInfo = new B(paramPackageInfo[0].toByteArray());
    while (i < paramVarArgs.length)
    {
      if (paramVarArgs[i].equals(paramPackageInfo)) {
        return paramVarArgs[i];
      }
      i++;
    }
    return null;
  }
  
  public static final boolean e(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    if (paramBoolean)
    {
      bool = paramBoolean;
      if (paramPackageInfo != null) {
        if (!"com.android.vending".equals(packageName))
        {
          bool = paramBoolean;
          if (!"com.google.android.gms".equals(packageName)) {}
        }
        else
        {
          ApplicationInfo localApplicationInfo = applicationInfo;
          if (localApplicationInfo == null) {}
          while ((flags & 0x81) == 0)
          {
            bool = false;
            break;
          }
          bool = true;
        }
      }
    }
    if ((paramPackageInfo != null) && (signatures != null))
    {
      if (bool) {
        paramPackageInfo = d(paramPackageInfo, D.a);
      } else {
        paramPackageInfo = d(paramPackageInfo, new A[] { D.a[0] });
      }
      if (paramPackageInfo != null) {
        return true;
      }
    }
    return false;
  }
  
  public boolean b(PackageInfo paramPackageInfo)
  {
    if (paramPackageInfo == null) {
      return false;
    }
    if (e(paramPackageInfo, false)) {
      return true;
    }
    if (e(paramPackageInfo, true))
    {
      if (n.d(a)) {
        return true;
      }
      Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    }
    return false;
  }
  
  public boolean c(int paramInt)
  {
    String[] arrayOfString = a.getPackageManager().getPackagesForUid(paramInt);
    if (arrayOfString != null)
    {
      int i = arrayOfString.length;
      if (i != 0)
      {
        localO = null;
        for (paramInt = 0; paramInt < i; paramInt++)
        {
          localO = f(arrayOfString[paramInt], false, false);
          if (a) {
            break label80;
          }
        }
        A2.n.i(localO);
        break label80;
      }
    }
    O localO = O.c("no pkgs");
    label80:
    localO.e();
    return a;
  }
  
  public final O f(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = "null pkg";
    if (paramString == null) {
      return O.c("null pkg");
    }
    if (!paramString.equals(b))
    {
      if (E.e()) {
        localObject1 = E.b(paramString, n.d(a), false, false);
      }
      try
      {
        Object localObject2 = a.getPackageManager().getPackageInfo(paramString, 64);
        paramBoolean1 = n.d(a);
        if (localObject2 == null) {}
        for (;;)
        {
          localObject1 = O.c((String)localObject1);
          break;
          localObject1 = signatures;
          if ((localObject1 != null) && (localObject1.length == 1))
          {
            B localB = new B(signatures[0].toByteArray());
            String str = packageName;
            localObject1 = E.a(str, localB, paramBoolean1, false);
            if (a)
            {
              localObject2 = applicationInfo;
              if ((localObject2 != null) && ((flags & 0x2) != 0) && (aa))
              {
                localObject1 = "debuggable release cert app rejected";
                continue;
              }
            }
            break;
          }
          else
          {
            localObject1 = "single cert required";
          }
        }
        if (a) {
          b = paramString;
        }
        return (O)localObject1;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        return O.d("no pkg ".concat(paramString), localNameNotFoundException);
      }
    }
    return O.b();
  }
}

/* Location:
 * Qualified Name:     x2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */