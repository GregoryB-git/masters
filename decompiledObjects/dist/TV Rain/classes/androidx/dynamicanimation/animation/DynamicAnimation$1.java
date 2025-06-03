package androidx.dynamicanimation.animation;

import android.view.View;

final class DynamicAnimation$1
  extends DynamicAnimation.ViewProperty
{
  public DynamicAnimation$1(String paramString)
  {
    super(paramString, null);
  }
  
  public float getValue(View paramView)
  {
    return paramView.getTranslationX();
  }
  
  public void setValue(View paramView, float paramFloat)
  {
    paramView.setTranslationX(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */