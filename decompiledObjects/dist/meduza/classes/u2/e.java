package u2;

import android.os.Build.VERSION;
import ec.i;
import v2.g;
import x2.s;

public final class e
  extends d<t2.c>
{
  public final int b = 7;
  
  public e(g<t2.c> paramg)
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
    if (j.a == 2) {
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
    boolean bool1 = true;
    if (i >= 26)
    {
      bool2 = bool1;
      if (!a) {
        break label62;
      }
      if (!b)
      {
        bool2 = bool1;
        break label62;
      }
    }
    else if (!a)
    {
      bool2 = bool1;
      break label62;
    }
    boolean bool2 = false;
    label62:
    return bool2;
  }
}

/* Location:
 * Qualified Name:     u2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */