package E3;

import H3.i;
import android.content.Context;
import android.content.res.Resources;

public class e$b
{
  public final String a;
  public final String b;
  
  public e$b(e parame)
  {
    int i = i.q(e.a(parame), "com.google.firebase.crashlytics.unity_version", "string");
    if (i != 0)
    {
      a = "Unity";
      String str = e.a(parame).getResources().getString(i);
      b = str;
      parame = f.f();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unity Editor version is: ");
      localStringBuilder.append(str);
      parame.i(localStringBuilder.toString());
      return;
    }
    if (e.b(parame, "flutter_assets/NOTICES.Z"))
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

/* Location:
 * Qualified Name:     E3.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */