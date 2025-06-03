package androidx.vectordrawable.graphics.drawable;

import a;
import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ArgbEvaluator
  implements TypeEvaluator
{
  private static final ArgbEvaluator sInstance = new ArgbEvaluator();
  
  public static ArgbEvaluator getInstance()
  {
    return sInstance;
  }
  
  public Object evaluate(float paramFloat, Object paramObject1, Object paramObject2)
  {
    int i = ((Integer)paramObject1).intValue();
    float f1 = (i >> 24 & 0xFF) / 255.0F;
    float f2 = (i >> 16 & 0xFF) / 255.0F;
    float f3 = (i >> 8 & 0xFF) / 255.0F;
    float f4 = (i & 0xFF) / 255.0F;
    i = ((Integer)paramObject2).intValue();
    float f5 = (i >> 24 & 0xFF) / 255.0F;
    float f6 = (i >> 16 & 0xFF) / 255.0F;
    float f7 = (i >> 8 & 0xFF) / 255.0F;
    float f8 = (i & 0xFF) / 255.0F;
    f2 = (float)Math.pow(f2, 2.2D);
    f3 = (float)Math.pow(f3, 2.2D);
    f4 = (float)Math.pow(f4, 2.2D);
    f6 = (float)Math.pow(f6, 2.2D);
    f7 = (float)Math.pow(f7, 2.2D);
    f8 = (float)Math.pow(f8, 2.2D);
    f5 = a.a(f5, f1, paramFloat, f1);
    f2 = a.a(f6, f2, paramFloat, f2);
    f1 = a.a(f7, f3, paramFloat, f3);
    paramFloat = a.a(f8, f4, paramFloat, f4);
    f4 = (float)Math.pow(f2, 0.45454545454545453D);
    f2 = (float)Math.pow(f1, 0.45454545454545453D);
    paramFloat = (float)Math.pow(paramFloat, 0.45454545454545453D);
    int j = Math.round(f5 * 255.0F);
    i = Math.round(f4 * 255.0F);
    int k = Math.round(f2 * 255.0F);
    return Integer.valueOf(Math.round(paramFloat * 255.0F) | i << 16 | j << 24 | k << 8);
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.ArgbEvaluator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */