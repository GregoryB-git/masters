package androidx.dynamicanimation.animation;

import android.view.View;

final class DynamicAnimation$10
  extends DynamicAnimation.ViewProperty
{
  public DynamicAnimation$10(String paramString)
  {
    super(paramString, null);
  }
  
  public float getValue(View paramView)
  {
    return paramView.getY();
  }
  
  public void setValue(View paramView, float paramFloat)
  {
    paramView.setY(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */