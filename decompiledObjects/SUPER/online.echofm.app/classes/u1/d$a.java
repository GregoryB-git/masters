package u1;

import A.g;
import A.g.b;
import android.animation.TypeEvaluator;

public class d$a
  implements TypeEvaluator
{
  public g.b[] a;
  
  public g.b[] a(float paramFloat, g.b[] paramArrayOfb1, g.b[] paramArrayOfb2)
  {
    if (g.b(paramArrayOfb1, paramArrayOfb2))
    {
      if (!g.b(a, paramArrayOfb1)) {
        a = g.f(paramArrayOfb1);
      }
      for (int i = 0; i < paramArrayOfb1.length; i++) {
        a[i].d(paramArrayOfb1[i], paramArrayOfb2[i], paramFloat);
      }
      return a;
    }
    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
  }
}

/* Location:
 * Qualified Name:     u1.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */