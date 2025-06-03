package p0;

import B0.k;
import B0.m;
import d0.g;
import g0.a;
import java.util.HashMap;
import java.util.UUID;

public final class h$b
{
  public final HashMap a = new HashMap();
  public UUID b = g.d;
  public F.c c = N.d;
  public boolean d;
  public int[] e = new int[0];
  public boolean f = true;
  public m g = new k();
  public long h = 300000L;
  
  public h a(Q paramQ)
  {
    return new h(b, c, paramQ, a, d, e, f, g, h, null);
  }
  
  public b b(m paramm)
  {
    g = ((m)a.e(paramm));
    return this;
  }
  
  public b c(boolean paramBoolean)
  {
    d = paramBoolean;
    return this;
  }
  
  public b d(boolean paramBoolean)
  {
    f = paramBoolean;
    return this;
  }
  
  public b e(int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramVarArgs[j];
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (k != 2) {
        if (k == 1) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      a.a(bool2);
    }
    e = ((int[])paramVarArgs.clone());
    return this;
  }
  
  public b f(UUID paramUUID, F.c paramc)
  {
    b = ((UUID)a.e(paramUUID));
    c = ((F.c)a.e(paramc));
    return this;
  }
}

/* Location:
 * Qualified Name:     p0.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */