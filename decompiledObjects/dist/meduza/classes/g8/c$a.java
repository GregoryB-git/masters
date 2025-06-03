package g8;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

public final class c$a
{
  public final String a;
  public final String b;
  
  public c$a(c paramc)
  {
    int i = j8.g.e(a, "com.google.firebase.crashlytics.unity_version", "string");
    if (i != 0)
    {
      a = "Unity";
      paramc = a.getResources().getString(i);
      b = paramc;
      paramc = g.d("Unity Editor version is: ", paramc);
      if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
        break label151;
      }
    }
    else if (a.getAssets() == null) {}
    try
    {
      paramc = a.getAssets().open("flutter_assets/NOTICES.Z");
      if (paramc != null) {
        paramc.close();
      }
      i = 1;
    }
    catch (IOException paramc)
    {
      label151:
      for (;;) {}
    }
    i = 0;
    if (i != 0)
    {
      a = "Flutter";
      b = null;
      if (Log.isLoggable("FirebaseCrashlytics", 2))
      {
        paramc = "Development platform is: Flutter";
        Log.v("FirebaseCrashlytics", paramc, null);
      }
    }
    else
    {
      a = null;
      b = null;
    }
  }
}

/* Location:
 * Qualified Name:     g8.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */