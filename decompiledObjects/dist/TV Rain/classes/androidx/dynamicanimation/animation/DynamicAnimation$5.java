package androidx.dynamicanimation.animation;

import android.view.View;

final class DynamicAnimation$5
  extends DynamicAnimation.ViewProperty
{
  public DynamicAnimation$5(String paramString)
  {
    super(paramString, null);
  }
  
  public float getValue(View paramView)
  {
    return paramView.getScaleY();
  }
  
  public void setValue(View paramView, float paramFloat)
  {
    paramView.setScaleY(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */