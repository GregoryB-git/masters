package g8;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

public final class c
{
  public final Context a;
  public a b;
  
  public c(Context paramContext)
  {
    a = paramContext;
    b = null;
  }
  
  public final class a
  {
    public final String a;
    
    public a()
    {
      int i = j8.g.e(a, "com.google.firebase.crashlytics.unity_version", "string");
      if (i != 0)
      {
        a = "Unity";
        this$1 = a.getResources().getString(i);
        this$1 = g.d("Unity Editor version is: ", c.this);
        if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
          break label151;
        }
      }
      else if (a.getAssets() == null) {}
      try
      {
        this$1 = a.getAssets().open("flutter_assets/NOTICES.Z");
        if (c.this != null) {
          close();
        }
        i = 1;
      }
      catch (IOException this$1)
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
          this$1 = "Development platform is: Flutter";
          Log.v("FirebaseCrashlytics", c.this, null);
        }
      }
      else
      {
        a = null;
        b = null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     g8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */