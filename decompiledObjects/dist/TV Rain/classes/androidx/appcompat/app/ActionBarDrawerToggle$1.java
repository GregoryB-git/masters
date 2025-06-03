package androidx.appcompat.app;

import android.view.View;
import android.view.View.OnClickListener;

class ActionBarDrawerToggle$1
  implements View.OnClickListener
{
  public ActionBarDrawerToggle$1(ActionBarDrawerToggle paramActionBarDrawerToggle) {}
  
  public void onClick(View paramView)
  {
    Object localObject = this$0;
    if (mDrawerIndicatorEnabled)
    {
      ((ActionBarDrawerToggle)localObject).toggle();
    }
    else
    {
      localObject = mToolbarNavigationClickListener;
      if (localObject != null) {
        ((View.OnClickListener)localObject).onClick(paramView);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ActionBarDrawerToggle.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */