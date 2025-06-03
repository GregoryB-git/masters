package e7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import d2.q;
import g;
import java.util.Random;
import v6.f;

public final class c1
  implements Runnable
{
  public final void run()
  {
    Object localObject1 = ((j2)f.b).j();
    if (!c)
    {
      f.s(6, "Persisted config not initialized. Not logging error/warn");
      return;
    }
    Object localObject2 = f;
    int i = d;
    int j = 1;
    if (i == 0)
    {
      localObject2 = ((q)localObject2).h();
      if (f == null) {
        try
        {
          if (f == null)
          {
            Object localObject3 = ((q)localObject2).zza().getApplicationInfo();
            String str = f.a();
            if (localObject3 != null)
            {
              localObject3 = processName;
              boolean bool;
              if ((localObject3 != null) && (((String)localObject3).equals(str))) {
                bool = true;
              } else {
                bool = false;
              }
              f = Boolean.valueOf(bool);
            }
            if (f == null)
            {
              f = Boolean.TRUE;
              zzjo.b("My process not in the list of running processes");
            }
          }
        }
        finally {}
      }
      if (f.booleanValue())
      {
        localObject2 = f;
        i = 67;
      }
      else
      {
        localObject2 = f;
        i = 99;
      }
      d = ((char)i);
    }
    localObject2 = f;
    if (e < 0L) {
      e = 114010L;
    }
    char c1 = "01VDIWEA?".charAt(a);
    localObject2 = f;
    char c2 = d;
    long l1 = e;
    localObject2 = a1.r(true, b, c, d, e);
    Object localObject5 = new StringBuilder("2");
    ((StringBuilder)localObject5).append(c1);
    ((StringBuilder)localObject5).append(c2);
    ((StringBuilder)localObject5).append(l1);
    localObject5 = g.f((StringBuilder)localObject5, ":", (String)localObject2);
    localObject2 = localObject5;
    if (((String)localObject5).length() > 1024) {
      localObject2 = b.substring(0, 1024);
    }
    localObject1 = o;
    if (localObject1 != null)
    {
      e.l();
      if (e.v().getLong(a, 0L) == 0L) {
        ((p1)localObject1).a();
      }
      localObject5 = localObject2;
      if (localObject2 == null) {
        localObject5 = "";
      }
      long l2 = e.v().getLong(b, 0L);
      if (l2 <= 0L)
      {
        localObject2 = e.v().edit();
        ((SharedPreferences.Editor)localObject2).putString(c, (String)localObject5);
        ((SharedPreferences.Editor)localObject2).putLong(b, 1L);
      }
      else
      {
        l1 = e.k().C0().nextLong();
        l2 += 1L;
        if ((l1 & 0x7FFFFFFFFFFFFFFF) < Long.MAX_VALUE / l2) {
          i = j;
        } else {
          i = 0;
        }
        localObject2 = e.v().edit();
        if (i != 0) {
          ((SharedPreferences.Editor)localObject2).putString(c, (String)localObject5);
        }
        ((SharedPreferences.Editor)localObject2).putLong(b, l2);
      }
      ((SharedPreferences.Editor)localObject2).apply();
    }
  }
}

/* Location:
 * Qualified Name:     e7.c1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */