package A0;

import B0.e;
import X2.v;
import d0.I;
import d0.J;
import g0.c;
import java.util.List;
import x0.x.b;

public class a$b
  implements y.b
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final float f;
  public final float g;
  public final c h;
  
  public a$b()
  {
    this(10000, 25000, 25000, 0.7F);
  }
  
  public a$b(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    this(paramInt1, paramInt2, paramInt3, 1279, 719, paramFloat, 0.75F, c.a);
  }
  
  public a$b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, c paramc)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
    e = paramInt5;
    f = paramFloat1;
    g = paramFloat2;
    h = paramc;
  }
  
  public final y[] a(y.a[] paramArrayOfa, e parame, x.b paramb, I paramI)
  {
    v localv = a.x(paramArrayOfa);
    paramI = new y[paramArrayOfa.length];
    for (int i = 0; i < paramArrayOfa.length; i++)
    {
      y.a locala = paramArrayOfa[i];
      if (locala != null)
      {
        paramb = b;
        if (paramb.length != 0)
        {
          if (paramb.length == 1) {
            paramb = new z(a, paramb[0], c);
          } else {
            paramb = b(a, paramb, c, parame, (v)localv.get(i));
          }
          paramI[i] = paramb;
        }
      }
    }
    return paramI;
  }
  
  public a b(J paramJ, int[] paramArrayOfInt, int paramInt, e parame, v paramv)
  {
    return new a(paramJ, paramArrayOfInt, paramInt, parame, a, b, c, d, e, f, g, paramv, h);
  }
}

/* Location:
 * Qualified Name:     A0.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */