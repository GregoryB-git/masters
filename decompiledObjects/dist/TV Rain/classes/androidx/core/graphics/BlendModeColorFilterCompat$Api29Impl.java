package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
class BlendModeColorFilterCompat$Api29Impl
{
  @DoNotInline
  public static ColorFilter createBlendModeColorFilter(int paramInt, Object paramObject)
  {
    return new BlendModeColorFilter(paramInt, (BlendMode)paramObject);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.BlendModeColorFilterCompat.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */