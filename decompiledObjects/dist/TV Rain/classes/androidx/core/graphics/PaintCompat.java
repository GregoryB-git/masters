package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Pair;
import o3;

public final class PaintCompat
{
  private static final String EM_STRING = "m";
  private static final String TOFU_STRING = "󟿽";
  private static final ThreadLocal<Pair<Rect, Rect>> sRectThreadLocal = new ThreadLocal();
  
  public static boolean hasGlyph(@NonNull Paint paramPaint, @NonNull String paramString)
  {
    return Api23Impl.hasGlyph(paramPaint, paramString);
  }
  
  private static Pair<Rect, Rect> obtainEmptyRects()
  {
    ThreadLocal localThreadLocal = sRectThreadLocal;
    Pair localPair = (Pair)localThreadLocal.get();
    if (localPair == null)
    {
      localPair = new Pair(new Rect(), new Rect());
      localThreadLocal.set(localPair);
    }
    else
    {
      ((Rect)first).setEmpty();
      ((Rect)second).setEmpty();
    }
    return localPair;
  }
  
  public static boolean setBlendMode(@NonNull Paint paramPaint, @Nullable BlendModeCompat paramBlendModeCompat)
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool = true;
    Object localObject = null;
    PorterDuff.Mode localMode = null;
    if (i >= 29)
    {
      localObject = localMode;
      if (paramBlendModeCompat != null) {
        localObject = BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(paramBlendModeCompat);
      }
      Api29Impl.setBlendMode(paramPaint, localObject);
      return true;
    }
    if (paramBlendModeCompat != null)
    {
      localMode = BlendModeUtils.obtainPorterDuffFromCompat(paramBlendModeCompat);
      paramBlendModeCompat = (BlendModeCompat)localObject;
      if (localMode != null) {
        paramBlendModeCompat = new PorterDuffXfermode(localMode);
      }
      paramPaint.setXfermode(paramBlendModeCompat);
      if (localMode == null) {
        bool = false;
      }
      return bool;
    }
    paramPaint.setXfermode(null);
    return true;
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @DoNotInline
    public static boolean hasGlyph(Paint paramPaint, String paramString)
    {
      return paramPaint.hasGlyph(paramString);
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static void setBlendMode(Paint paramPaint, Object paramObject)
    {
      o3.v(paramPaint, (BlendMode)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.PaintCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */