package A6;

import A5.a.b;
import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import android.os.Build.VERSION;

public class a
  implements A5.a, k.c
{
  public k a;
  
  public void onAttachedToEngine(a.b paramb)
  {
    paramb = new k(paramb.b(), "flutter_native_splash");
    a = paramb;
    paramb.e(this);
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    a.e(null);
  }
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    if (a.equals("getPlatformVersion"))
    {
      paramj = new StringBuilder();
      paramj.append("Android ");
      paramj.append(Build.VERSION.RELEASE);
      paramd.a(paramj.toString());
    }
    else
    {
      paramd.c();
    }
  }
}

/* Location:
 * Qualified Name:     A6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */