package androidx.palette.graphics;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

public abstract interface Palette$Filter
{
  public abstract boolean isAllowed(@ColorInt int paramInt, @NonNull float[] paramArrayOfFloat);
}

/* Location:
 * Qualified Name:     androidx.palette.graphics.Palette.Filter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */