package androidx.core.widget;

import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class EdgeEffectCompat$Api21Impl
{
  @DoNotInline
  public static void onPull(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    paramEdgeEffect.onPull(paramFloat1, paramFloat2);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.EdgeEffectCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */