package j6;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;
import m6.e0;
import m6.j;

public final class y
{
  public static final s a = new s(u.g("0\004C0\003+ \003\002\001\002\002\t\000ÂàFdJ00"));
  public static final t b = new t(u.g("0\004¨0\003 \003\002\001\002\002\t\000Õ¸l}ÓNõ0"));
  public static volatile e0 c;
  public static final Object d = new Object();
  public static Context e;
  
  static
  {
    new q(u.g("0\005È0\003° \003\002\001\002\002\024\020e\bsù/Qí"));
    new r(u.g("0\006\0040\003ì \003\002\001\002\002\024\003£²­×árÊkì"));
  }
  
  public static g0 a(String paramString, u paramu, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      b();
      j.i(e);
      d0 locald0 = new d0(paramString, paramu, paramBoolean1, paramBoolean2);
      try
      {
        paramBoolean2 = c.H2(locald0, ObjectWrapper.wrap(e.getPackageManager()));
        if (paramBoolean2) {
          return g0.d;
        }
        return new f0(new p(paramBoolean1, paramString, paramu));
      }
      catch (RemoteException paramString)
      {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramString);
        return new g0(false, "module call", paramString);
      }
      return new g0(false, "module init: ".concat(String.valueOf(paramString.getMessage())), paramString);
    }
    catch (DynamiteModule.a paramString)
    {
      Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramString);
    }
  }
  
  public static void b()
  {
    if (c != null) {
      return;
    }
    j.i(e);
    synchronized (d)
    {
      if (c == null) {
        c = zzaf.zzb(DynamiteModule.c(e, DynamiteModule.c, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl"));
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     j6.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */