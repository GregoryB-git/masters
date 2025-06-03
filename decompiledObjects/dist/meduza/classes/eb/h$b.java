package eb;

import n7.g;
import n7.g.a;
import x6.b;

public final class h$b
{
  public final c a;
  public final int b;
  public final boolean c;
  
  public h$b(c paramc, int paramInt, boolean paramBoolean)
  {
    b.y(paramc, "callOptions");
    a = paramc;
    b = paramInt;
    c = paramBoolean;
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a, "callOptions");
    locala.d(String.valueOf(b), "previousAttempts");
    locala.c("isTransparentRetry", c);
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     eb.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */