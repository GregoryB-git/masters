package androidx.dynamicanimation.animation;

import android.view.View;

final class DynamicAnimation$2
  extends DynamicAnimation.ViewProperty
{
  public DynamicAnimation$2(String paramString)
  {
    super(paramString, null);
  }
  
  public float getValue(View paramView)
  {
    return paramView.getTranslationY();
  }
  
  public void setValue(View paramView, float paramFloat)
  {
    paramView.setTranslationY(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */