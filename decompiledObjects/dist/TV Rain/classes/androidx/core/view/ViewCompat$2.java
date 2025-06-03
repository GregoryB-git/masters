package androidx.core.view;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.RequiresApi;

class ViewCompat$2
  extends ViewCompat.AccessibilityViewProperty<CharSequence>
{
  public ViewCompat$2(int paramInt1, Class paramClass, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramClass, paramInt2, paramInt3);
  }
  
  @RequiresApi(28)
  public CharSequence frameworkGet(View paramView)
  {
    return ViewCompat.Api28Impl.getAccessibilityPaneTitle(paramView);
  }
  
  @RequiresApi(28)
  public void frameworkSet(View paramView, CharSequence paramCharSequence)
  {
    ViewCompat.Api28Impl.setAccessibilityPaneTitle(paramView, paramCharSequence);
  }
  
  public boolean shouldUpdate(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return TextUtils.equals(paramCharSequence1, paramCharSequence2) ^ true;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */