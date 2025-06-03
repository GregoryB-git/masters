package androidx.dynamicanimation.animation;

import android.view.View;

final class DynamicAnimation$14
  extends DynamicAnimation.ViewProperty
{
  public DynamicAnimation$14(String paramString)
  {
    super(paramString, null);
  }
  
  public float getValue(View paramView)
  {
    return paramView.getScrollY();
  }
  
  public void setValue(View paramView, float paramFloat)
  {
    paramView.setScrollY((int)paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation.14
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */