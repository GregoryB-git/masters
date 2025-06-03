package androidx.dynamicanimation.animation;

import android.view.View;

final class DynamicAnimation$6
  extends DynamicAnimation.ViewProperty
{
  public DynamicAnimation$6(String paramString)
  {
    super(paramString, null);
  }
  
  public float getValue(View paramView)
  {
    return paramView.getRotation();
  }
  
  public void setValue(View paramView, float paramFloat)
  {
    paramView.setRotation(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */