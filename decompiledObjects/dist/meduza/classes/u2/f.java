package u2;

import android.os.Build.VERSION;
import ec.i;
import o2.j;
import v2.g;
import x2.s;

public final class f
  extends d<t2.c>
{
  public static final String c;
  public final int b = 7;
  
  static
  {
    String str = j.f("NetworkMeteredCtrlr");
    i.d(str, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
    c = str;
  }
  
  public f(g<t2.c> paramg)
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
    if (j.a == 5) {
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
    if (i < 26)
    {
      j.d().a(c, "Metered network constraint is not supported before API 26, only checking for connected state.");
      if (a) {
        return bool;
      }
    }
    else if ((a) && (c))
    {
      return bool;
    }
    bool = true;
    return bool;
  }
}

/* Location:
 * Qualified Name:     u2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */