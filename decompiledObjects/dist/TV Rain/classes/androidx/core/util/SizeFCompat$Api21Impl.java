package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
final class SizeFCompat$Api21Impl
{
  @DoNotInline
  @NonNull
  public static SizeF toSizeF(@NonNull SizeFCompat paramSizeFCompat)
  {
    Preconditions.checkNotNull(paramSizeFCompat);
    return new SizeF(paramSizeFCompat.getWidth(), paramSizeFCompat.getHeight());
  }
  
  @DoNotInline
  @NonNull
  public static SizeFCompat toSizeFCompat(@NonNull SizeF paramSizeF)
  {
    Preconditions.checkNotNull(paramSizeF);
    return new SizeFCompat(paramSizeF.getWidth(), paramSizeF.getHeight());
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.SizeFCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */