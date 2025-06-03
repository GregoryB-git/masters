package u2;

import android.os.Build.VERSION;
import ec.i;
import v2.g;
import x2.s;

public final class h
  extends d<t2.c>
{
  public final int b = 7;
  
  public h(g<t2.c> paramg)
  {
    super(paramg);
  }
  
  public final int a()
  {
    return b;
  }
  
  public final boolean b(s params)
  {
    int i = j.a;
    boolean bool;
    if ((i != 3) && ((Build.VERSION.SDK_INT < 30) || (i != 6))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean c(Object paramObject)
  {
    paramObject = (t2.c)paramObject;
    i.e(paramObject, "value");
    boolean bool;
    if ((a) && (!c)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     u2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */