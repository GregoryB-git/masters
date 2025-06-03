package r6;

public abstract class f
{
  public static final d a(int paramInt, a parama, g6.l paraml)
  {
    if (paramInt != -2) {
      if (paramInt != -1) {
        if (paramInt != 0)
        {
          if (paramInt != Integer.MAX_VALUE)
          {
            if (parama == a.o) {
              parama = new b(paramInt, paraml);
            } else {
              parama = new l(paramInt, parama, paraml);
            }
          }
          else {
            parama = new b(Integer.MAX_VALUE, paraml);
          }
        }
        else if (parama == a.o) {
          parama = new b(0, paraml);
        }
      }
    }
    for (;;)
    {
      break;
      parama = new l(1, parama, paraml);
      continue;
      if (parama == a.o)
      {
        parama = new l(1, a.p, paraml);
      }
      else
      {
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        if (parama == a.o)
        {
          parama = new b(d.a.a(), paraml);
          continue;
        }
        parama = new l(1, parama, paraml);
      }
    }
    return parama;
  }
}

/* Location:
 * Qualified Name:     r6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */