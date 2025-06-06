package androidx.core.graphics;

import android.graphics.BlendMode;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
class BlendModeUtils$Api29Impl
{
  @DoNotInline
  @Nullable
  public static Object obtainBlendModeFromCompat(@NonNull BlendModeCompat paramBlendModeCompat)
  {
    switch (BlendModeUtils.1.$SwitchMap$androidx$core$graphics$BlendModeCompat[paramBlendModeCompat.ordinal()])
    {
    default: 
      return null;
    case 29: 
      return BlendMode.LUMINOSITY;
    case 28: 
      return BlendMode.COLOR;
    case 27: 
      return BlendMode.SATURATION;
    case 26: 
      return BlendMode.HUE;
    case 25: 
      return BlendMode.MULTIPLY;
    case 24: 
      return BlendMode.EXCLUSION;
    case 23: 
      return BlendMode.DIFFERENCE;
    case 22: 
      return BlendMode.SOFT_LIGHT;
    case 21: 
      return BlendMode.HARD_LIGHT;
    case 20: 
      return BlendMode.COLOR_BURN;
    case 19: 
      return BlendMode.COLOR_DODGE;
    case 18: 
      return BlendMode.LIGHTEN;
    case 17: 
      return BlendMode.DARKEN;
    case 16: 
      return BlendMode.OVERLAY;
    case 15: 
      return BlendMode.SCREEN;
    case 14: 
      return BlendMode.MODULATE;
    case 13: 
      return BlendMode.PLUS;
    case 12: 
      return BlendMode.XOR;
    case 11: 
      return BlendMode.DST_ATOP;
    case 10: 
      return BlendMode.SRC_ATOP;
    case 9: 
      return BlendMode.DST_OUT;
    case 8: 
      return BlendMode.SRC_OUT;
    case 7: 
      return BlendMode.DST_IN;
    case 6: 
      return BlendMode.SRC_IN;
    case 5: 
      return BlendMode.DST_OVER;
    case 4: 
      return BlendMode.SRC_OVER;
    case 3: 
      return BlendMode.DST;
    case 2: 
      return BlendMode.SRC;
    }
    return BlendMode.CLEAR;
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.BlendModeUtils.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */