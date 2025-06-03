package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;

class ViewPager2$PageAwareAccessibilityProvider$1
  implements AccessibilityViewCommand
{
  public ViewPager2$PageAwareAccessibilityProvider$1(ViewPager2.PageAwareAccessibilityProvider paramPageAwareAccessibilityProvider) {}
  
  public boolean perform(@NonNull View paramView, @Nullable AccessibilityViewCommand.CommandArguments paramCommandArguments)
  {
    paramView = (ViewPager2)paramView;
    this$1.setCurrentItemFromAccessibilityCommand(paramView.getCurrentItem() + 1);
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */