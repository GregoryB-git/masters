package u2;

import android.os.Build.VERSION;
import ec.i;
import o2.j;
import x2.s;

public final class g
  extends d<t2.c>
{
  public static final String c;
  public final int b = 7;
  
  static
  {
    String str = j.f("NetworkNotRoamingCtrlr");
    i.d(str, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    c = str;
  }
  
  public g(v2.g<t2.c> paramg)
  {
    super(paramg);
  }
  
  public final int a()
  {
    return b;
  }
  
  public final boolean b(s params)
  {
    boolean bool;
    if (j.a == 4) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean c(Object paramObject)
  {
    paramObject = (t2.c)paramObject;
    i.e(paramObject, "value");
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i < 24)
    {
      j.d().a(c, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
      if (a) {
        return bool;
      }
    }
    else if ((a) && (d))
    {
      return bool;
    }
    bool = true;
    return bool;
  }
}

/* Location:
 * Qualified Name:     u2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */