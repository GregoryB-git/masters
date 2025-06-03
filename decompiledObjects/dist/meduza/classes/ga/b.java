package ga;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.os.Bundle;
import mc.a;
import mc.c;
import p2.m0;
import rb.h;
import ub.e;

public final class b
  implements j
{
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
  
  public final Boolean a()
  {
    Boolean localBoolean;
    if (a.containsKey("firebase_sessions_enabled")) {
      localBoolean = Boolean.valueOf(a.getBoolean("firebase_sessions_enabled"));
    } else {
      localBoolean = null;
    }
    return localBoolean;
  }
  
  public final a b()
  {
    a locala;
    if (a.containsKey("firebase_sessions_sessions_restart_timeout")) {
      locala = new a(m0.c0(a.getInt("firebase_sessions_sessions_restart_timeout"), c.d));
    } else {
      locala = null;
    }
    return locala;
  }
  
  public final Double c()
  {
    Double localDouble;
    if (a.containsKey("firebase_sessions_sampling_rate")) {
      localDouble = Double.valueOf(a.getDouble("firebase_sessions_sampling_rate"));
    } else {
      localDouble = null;
    }
    return localDouble;
  }
  
  public final Object d(e<? super h> parame)
  {
    return h.a;
  }
}

/* Location:
 * Qualified Name:     ga.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */