package androidx.dynamicanimation.animation;

import android.view.View;

final class DynamicAnimation$12
  extends DynamicAnimation.ViewProperty
{
  public DynamicAnimation$12(String paramString)
  {
    super(paramString, null);
  }
  
  public float getValue(View paramView)
  {
    return paramView.getAlpha();
  }
  
  public void setValue(View paramView, float paramFloat)
  {
    paramView.setAlpha(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation.12
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */