package u6;

import g6.p;

public abstract class d
{
  public static final F a = new F("CLOSED");
  
  public static final e b(e parame)
  {
    for (;;)
    {
      Object localObject = e.a(parame);
      if (localObject == a()) {
        return parame;
      }
      localObject = (e)localObject;
      if (localObject == null)
      {
        if (parame.j()) {
          return parame;
        }
      }
      else {
        parame = (e)localObject;
      }
    }
  }
  
  public static final Object c(C paramC, long paramLong, p paramp)
  {
    C localC1 = paramC;
    if ((q >= paramLong) && (!localC1.h())) {
      return D.a(localC1);
    }
    paramC = e.a(localC1);
    if (paramC == a()) {
      return D.a(a);
    }
    paramC = (C)paramC;
    if (paramC != null) {}
    for (;;)
    {
      localC1 = paramC;
      break;
      C localC2 = (C)paramp.invoke(Long.valueOf(q + 1L), localC1);
      if (!localC1.l(localC2)) {
        break;
      }
      paramC = localC2;
      if (localC1.h())
      {
        localC1.k();
        paramC = localC2;
      }
    }
  }
}

/* Location:
 * Qualified Name:     u6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */