package pc;

public final class i
{
  public static b a(int paramInt1, a parama, int paramInt2)
  {
    a locala = a.a;
    int i = 0;
    if ((paramInt2 & 0x1) != 0) {
      paramInt1 = 0;
    }
    if ((paramInt2 & 0x2) != 0) {
      parama = locala;
    }
    if (paramInt1 != -2)
    {
      if (paramInt1 != -1)
      {
        if (paramInt1 != 0)
        {
          if (paramInt1 != Integer.MAX_VALUE)
          {
            if (parama == locala) {
              parama = new b(paramInt1, null);
            } else {
              parama = new n(paramInt1, parama, null);
            }
          }
          else {
            parama = new b(Integer.MAX_VALUE, null);
          }
        }
        else if (parama == locala) {
          parama = new b(0, null);
        } else {
          parama = new n(1, parama, null);
        }
      }
      else
      {
        paramInt1 = i;
        if (parama == locala) {
          paramInt1 = 1;
        }
        if (paramInt1 != 0) {
          parama = new n(1, a.b, null);
        } else {
          throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
      }
    }
    else if (parama == locala)
    {
      f.m.getClass();
      parama = new b(f.a.b, null);
    }
    else
    {
      parama = new n(1, parama, null);
    }
    return parama;
  }
}

/* Location:
 * Qualified Name:     pc.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */