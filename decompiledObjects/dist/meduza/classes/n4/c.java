package n4;

import c4.i;
import f;
import v3.a1;
import v5.m;
import v5.u;

public final class c
{
  public static boolean a(i parami)
  {
    u localu = new u(8);
    int i = aa;
    if ((i != 1380533830) && (i != 1380333108)) {
      return false;
    }
    parami.m(a, 0, 4);
    localu.G(0);
    i = localu.f();
    if (i != 1463899717)
    {
      parami = new StringBuilder();
      parami.append("Unsupported form type: ");
      parami.append(i);
      m.c("WavHeaderReader", parami.toString());
      return false;
    }
    return true;
  }
  
  public static a b(int paramInt, i parami, u paramu)
  {
    a locala;
    for (;;)
    {
      locala = a.a(parami, paramu);
      if (a == paramInt) {
        return locala;
      }
      StringBuilder localStringBuilder = f.l("Ignoring unknown WAV chunk: ");
      localStringBuilder.append(a);
      m.f("WavHeaderReader", localStringBuilder.toString());
      long l = b + 8L;
      if (l > 2147483647L) {
        break;
      }
      parami.j((int)l);
    }
    parami = f.l("Chunk is too large (~2GB+) to skip; id: ");
    parami.append(a);
    throw a1.c(parami.toString());
    return locala;
  }
  
  public static final class a
  {
    public final int a;
    public final long b;
    
    public a(int paramInt, long paramLong)
    {
      a = paramInt;
      b = paramLong;
    }
    
    public static a a(i parami, u paramu)
    {
      parami.m(a, 0, 8);
      paramu.G(0);
      return new a(paramu.f(), paramu.l());
    }
  }
}

/* Location:
 * Qualified Name:     n4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */