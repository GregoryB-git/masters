package a2;

import android.animation.TypeEvaluator;
import x.d;
import x.d.a;

public final class c$a
  implements TypeEvaluator<d.a[]>
{
  public d.a[] a;
  
  public final Object evaluate(float paramFloat, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (d.a[])paramObject1;
    d.a[] arrayOfa = (d.a[])paramObject2;
    if (d.a((d.a[])paramObject1, arrayOfa))
    {
      if (!d.a(a, (d.a[])paramObject1)) {
        a = d.e((d.a[])paramObject1);
      }
      for (int i = 0; i < paramObject1.length; i++)
      {
        d.a locala = a[i];
        Object localObject = paramObject1[i];
        paramObject2 = arrayOfa[i];
        locala.getClass();
        a = ((char)a);
        for (int j = 0;; j++)
        {
          float[] arrayOfFloat1 = b;
          if (j >= arrayOfFloat1.length) {
            break;
          }
          float[] arrayOfFloat2 = b;
          float f = arrayOfFloat1[j];
          arrayOfFloat2[j] = (b[j] * paramFloat + (1.0F - paramFloat) * f);
        }
      }
      return a;
    }
    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
  }
}

/* Location:
 * Qualified Name:     a2.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */