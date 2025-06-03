package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.core.view.ViewCompat;

final class DynamicAnimation$11
  extends DynamicAnimation.ViewProperty
{
  public DynamicAnimation$11(String paramString)
  {
    super(paramString, null);
  }
  
  public float getValue(View paramView)
  {
    return ViewCompat.getZ(paramView);
  }
  
  public void setValue(View paramView, float paramFloat)
  {
    ViewCompat.setZ(paramView, paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation.11
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */