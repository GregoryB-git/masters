package G2;

import E2.l;
import android.content.Context;
import com.appsflyer.internal.t;

public abstract class a
{
  public static Context a;
  public static Boolean b;
  
  public static boolean a(Context paramContext)
  {
    label121:
    try
    {
      localContext1 = paramContext.getApplicationContext();
      Context localContext2 = a;
      if (localContext2 != null)
      {
        Boolean localBoolean = b;
        if ((localBoolean != null) && (localContext2 == localContext1))
        {
          bool = localBoolean.booleanValue();
          return bool;
        }
      }
    }
    finally
    {
      Context localContext1;
      break label121;
      b = null;
      if (l.h()) {
        paramContext = Boolean.valueOf(t.a(localContext1.getPackageManager()));
      }
      for (;;)
      {
        b = paramContext;
        break;
        try
        {
          paramContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
          b = Boolean.TRUE;
        }
        catch (ClassNotFoundException paramContext)
        {
          paramContext = Boolean.FALSE;
        }
      }
      a = localContext1;
      boolean bool = b.booleanValue();
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     G2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */