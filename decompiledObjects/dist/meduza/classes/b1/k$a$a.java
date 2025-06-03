package b1;

import ec.i;

public final class k$a$a
{
  public static k.a a(k.b paramb)
  {
    i.e(paramb, "state");
    int i = paramb.ordinal();
    if (i != 2)
    {
      if (i != 3)
      {
        if (i != 4) {
          paramb = null;
        } else {
          paramb = k.a.ON_PAUSE;
        }
      }
      else {
        paramb = k.a.ON_STOP;
      }
    }
    else {
      paramb = k.a.ON_DESTROY;
    }
    return paramb;
  }
  
  public static k.a b(k.b paramb)
  {
    i.e(paramb, "state");
    int i = paramb.ordinal();
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          paramb = null;
        } else {
          paramb = k.a.ON_RESUME;
        }
      }
      else {
        paramb = k.a.ON_START;
      }
    }
    else {
      paramb = k.a.ON_CREATE;
    }
    return paramb;
  }
}

/* Location:
 * Qualified Name:     b1.k.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */