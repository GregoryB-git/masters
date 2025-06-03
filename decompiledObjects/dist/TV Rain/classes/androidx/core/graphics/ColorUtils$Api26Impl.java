package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import b;
import f0;
import java.util.Objects;
import z2;

@RequiresApi(26)
class ColorUtils$Api26Impl
{
  @DoNotInline
  public static Color compositeColors(Color paramColor1, Color paramColor2)
  {
    if (Objects.equals(f0.m(paramColor1), f0.m(paramColor2)))
    {
      if (!Objects.equals(f0.n(paramColor2), f0.n(paramColor1))) {
        paramColor1 = b.k(paramColor1, f0.n(paramColor2));
      }
      localObject = f0.z(paramColor1);
      float[] arrayOfFloat = f0.z(paramColor2);
      float f1 = f0.b(paramColor1);
      float f2 = (1.0F - f1) * f0.b(paramColor2);
      int i = f0.e(paramColor2) - 1;
      float f3 = f1 + f2;
      arrayOfFloat[i] = f3;
      float f4 = f2;
      float f5 = f1;
      if (f3 > 0.0F)
      {
        f5 = f1 / f3;
        f4 = f2 / f3;
      }
      for (int j = 0; j < i; j++)
      {
        f2 = localObject[j];
        arrayOfFloat[j] = (arrayOfFloat[j] * f4 + f2 * f5);
      }
      return f0.l(arrayOfFloat, f0.n(paramColor2));
    }
    Object localObject = z2.t("Color models must match (");
    ((StringBuilder)localObject).append(f0.m(paramColor1));
    ((StringBuilder)localObject).append(" vs. ");
    ((StringBuilder)localObject).append(f0.m(paramColor2));
    ((StringBuilder)localObject).append(")");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.ColorUtils.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */