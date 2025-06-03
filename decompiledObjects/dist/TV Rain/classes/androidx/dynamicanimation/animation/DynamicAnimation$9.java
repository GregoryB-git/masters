package androidx.dynamicanimation.animation;

import android.view.View;

final class DynamicAnimation$9
  extends DynamicAnimation.ViewProperty
{
  public DynamicAnimation$9(String paramString)
  {
    super(paramString, null);
  }
  
  public float getValue(View paramView)
  {
    return paramView.getX();
  }
  
  public void setValue(View paramView, float paramFloat)
  {
    paramView.setX(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */