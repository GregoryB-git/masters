package E3;

import H3.i;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;

public class e
{
  public final Context a;
  public b b;
  
  public e(Context paramContext)
  {
    a = paramContext;
    b = null;
  }
  
  public final boolean c(String paramString)
  {
    if (a.getAssets() == null) {
      return false;
    }
    try
    {
      paramString = a.getAssets().open(paramString);
      if (paramString != null) {
        paramString.close();
      }
      return true;
    }
    catch (IOException paramString) {}
    return false;
  }
  
  public String d()
  {
    return b.a(f());
  }
  
  public String e()
  {
    return b.b(f());
  }
  
  public final b f()
  {
    if (b == null) {
      b = new b(null);
    }
    return b;
  }
  
  public class b
  {
    public final String a;
    public final String b;
    
    public b()
    {
      int i = i.q(e.a(e.this), "com.google.firebase.crashlytics.unity_version", "string");
      if (i != 0)
      {
        a = "Unity";
        String str = e.a(e.this).getResources().getString(i);
        b = str;
        this$1 = f.f();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unity Editor version is: ");
        localStringBuilder.append(str);
        i(localStringBuilder.toString());
        return;
      }
      if (e.b(e.this, "flutter_assets/NOTICES.Z"))
      {
        a = "Flutter";
        b = null;
        f.f().i("Development platform is: Flutter");
        return;
      }
      a = null;
      b = null;
    }
  }
}

/* Location:
 * Qualified Name:     E3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */