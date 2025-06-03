package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class BlendModeColorFilterCompat
{
  @Nullable
  public static ColorFilter createBlendModeColorFilterCompat(int paramInt, @NonNull BlendModeCompat paramBlendModeCompat)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject = null;
    PorterDuff.Mode localMode = null;
    if (i >= 29)
    {
      localObject = BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(paramBlendModeCompat);
      paramBlendModeCompat = localMode;
      if (localObject != null) {
        paramBlendModeCompat = Api29Impl.createBlendModeColorFilter(paramInt, localObject);
      }
      return paramBlendModeCompat;
    }
    localMode = BlendModeUtils.obtainPorterDuffFromCompat(paramBlendModeCompat);
    paramBlendModeCompat = (BlendModeCompat)localObject;
    if (localMode != null) {
      paramBlendModeCompat = new PorterDuffColorFilter(paramInt, localMode);
    }
    return paramBlendModeCompat;
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static ColorFilter createBlendModeColorFilter(int paramInt, Object paramObject)
    {
      return new BlendModeColorFilter(paramInt, (BlendMode)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.BlendModeColorFilterCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */