package androidx.core.view;

import android.view.View;
import androidx.annotation.RequiresApi;

class ViewCompat$4
  extends ViewCompat.AccessibilityViewProperty<Boolean>
{
  public ViewCompat$4(int paramInt1, Class paramClass, int paramInt2)
  {
    super(paramInt1, paramClass, paramInt2);
  }
  
  @RequiresApi(28)
  public Boolean frameworkGet(View paramView)
  {
    return Boolean.valueOf(ViewCompat.Api28Impl.isAccessibilityHeading(paramView));
  }
  
  @RequiresApi(28)
  public void frameworkSet(View paramView, Boolean paramBoolean)
  {
    ViewCompat.Api28Impl.setAccessibilityHeading(paramView, paramBoolean.booleanValue());
  }
  
  public boolean shouldUpdate(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    return booleanNullToFalseEquals(paramBoolean1, paramBoolean2) ^ true;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */