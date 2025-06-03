package androidx.dynamicanimation.animation;

import android.view.View;

final class DynamicAnimation$13
  extends DynamicAnimation.ViewProperty
{
  public DynamicAnimation$13(String paramString)
  {
    super(paramString, null);
  }
  
  public float getValue(View paramView)
  {
    return paramView.getScrollX();
  }
  
  public void setValue(View paramView, float paramFloat)
  {
    paramView.setScrollX((int)paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation.13
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */