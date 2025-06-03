package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import java.util.List;

final class GradientColorInflaterCompat$ColorStops
{
  public final int[] mColors;
  public final float[] mOffsets;
  
  public GradientColorInflaterCompat$ColorStops(@ColorInt int paramInt1, @ColorInt int paramInt2)
  {
    mColors = new int[] { paramInt1, paramInt2 };
    mOffsets = new float[] { 0.0F, 1.0F };
  }
  
  public GradientColorInflaterCompat$ColorStops(@ColorInt int paramInt1, @ColorInt int paramInt2, @ColorInt int paramInt3)
  {
    mColors = new int[] { paramInt1, paramInt2, paramInt3 };
    mOffsets = new float[] { 0.0F, 0.5F, 1.0F };
  }
  
  public GradientColorInflaterCompat$ColorStops(@NonNull List<Integer> paramList, @NonNull List<Float> paramList1)
  {
    int i = paramList.size();
    mColors = new int[i];
    mOffsets = new float[i];
    for (int j = 0; j < i; j++)
    {
      mColors[j] = ((Integer)paramList.get(j)).intValue();
      mOffsets[j] = ((Float)paramList1.get(j)).floatValue();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.GradientColorInflaterCompat.ColorStops
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */