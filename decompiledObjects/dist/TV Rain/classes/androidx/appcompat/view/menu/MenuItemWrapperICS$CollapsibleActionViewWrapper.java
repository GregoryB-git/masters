package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

class MenuItemWrapperICS$CollapsibleActionViewWrapper
  extends FrameLayout
  implements androidx.appcompat.view.CollapsibleActionView
{
  public final android.view.CollapsibleActionView mWrappedView;
  
  public MenuItemWrapperICS$CollapsibleActionViewWrapper(View paramView)
  {
    super(paramView.getContext());
    mWrappedView = ((android.view.CollapsibleActionView)paramView);
    addView(paramView);
  }
  
  public View getWrappedView()
  {
    return (View)mWrappedView;
  }
  
  public void onActionViewCollapsed()
  {
    mWrappedView.onActionViewCollapsed();
  }
  
  public void onActionViewExpanded()
  {
    mWrappedView.onActionViewExpanded();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */