package T4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.os.Bundle;
import o6.a;
import o6.c;

public final class b
  implements h
{
  public static final a b = new a(null);
  public final Bundle a;
  
  public b(Context paramContext)
  {
    Bundle localBundle = getPackageManagergetApplicationInfogetPackageName128metaData;
    paramContext = localBundle;
    if (localBundle == null) {
      paramContext = Bundle.EMPTY;
    }
    a = paramContext;
  }
  
  public Boolean a()
  {
    Boolean localBoolean;
    if (a.containsKey("firebase_sessions_enabled")) {
      localBoolean = Boolean.valueOf(a.getBoolean("firebase_sessions_enabled"));
    } else {
      localBoolean = null;
    }
    return localBoolean;
  }
  
  public Double b()
  {
    Double localDouble;
    if (a.containsKey("firebase_sessions_sampling_rate")) {
      localDouble = Double.valueOf(a.getDouble("firebase_sessions_sampling_rate"));
    } else {
      localDouble = null;
    }
    return localDouble;
  }
  
  public Object c(X5.d paramd)
  {
    return h.a.a(this, paramd);
  }
  
  public a d()
  {
    a locala;
    if (a.containsKey("firebase_sessions_sessions_restart_timeout")) {
      locala = a.h(c.o(a.getInt("firebase_sessions_sessions_restart_timeout"), o6.d.s));
    } else {
      locala = null;
    }
    return locala;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     T4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */