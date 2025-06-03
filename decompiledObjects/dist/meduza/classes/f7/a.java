package f7;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import j6.f;
import j6.g;
import j6.j;
import java.lang.reflect.Method;

public final class a
{
  public static final f a = f.b;
  public static final Object b = new Object();
  public static Method c;
  public static boolean d = false;
  
  public static void a(Context paramContext)
  {
    if (paramContext != null)
    {
      a.getClass();
      j.a(paramContext, 11925000);
      long l1 = SystemClock.uptimeMillis();
      synchronized (b)
      {
        boolean bool = d;
        Object localObject2 = null;
        Context localContext2;
        if (!bool)
        {
          try
          {
            Context localContext1 = cc"com.google.android.gms.providerinstaller.dynamite"a;
          }
          catch (DynamiteModule.a locala)
          {
            Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(locala.getMessage())));
            localContext2 = null;
          }
          if (localContext2 != null)
          {
            b(localContext2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
            return;
          }
        }
        bool = d;
        Object localObject3;
        try
        {
          localContext2 = paramContext.createPackageContext("com.google.android.gms", 3);
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          localObject3 = null;
        }
        if (localObject3 == null)
        {
          paramContext = (Context)localObject2;
        }
        else
        {
          d = true;
          if ((bool ^ true)) {
            try
            {
              long l2 = SystemClock.uptimeMillis();
              zzl.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", ((Context)localObject3).getClassLoader(), new zzj[] { zzj.zzb(Context.class, paramContext), zzi.zza(l1), zzi.zza(l2) });
            }
            catch (Exception paramContext)
            {
              Log.w("ProviderInstaller", "Failed to report request stats: ".concat(paramContext.toString()));
            }
          }
          paramContext = (Context)localObject3;
        }
        if (paramContext != null)
        {
          b(paramContext, "com.google.android.gms.common.security.ProviderInstallerImpl");
          return;
        }
        Log.e("ProviderInstaller", "Failed to get remote context");
        paramContext = new j6/g;
        paramContext.<init>(8);
        throw paramContext;
      }
    }
    throw new NullPointerException("Context must not be null");
  }
  
  public static void b(Context paramContext, String paramString)
  {
    try
    {
      if (c == null) {
        c = paramContext.getClassLoader().loadClass(paramString).getMethod("insertProvider", new Class[] { Context.class });
      }
      c.invoke(null, new Object[] { paramContext });
      return;
    }
    catch (Exception paramContext)
    {
      paramString = paramContext.getCause();
      if (Log.isLoggable("ProviderInstaller", 6))
      {
        if (paramString == null) {
          paramContext = paramContext.toString();
        } else {
          paramContext = paramString.toString();
        }
        Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(paramContext)));
      }
      throw new g(8);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
  }
}

/* Location:
 * Qualified Name:     f7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */