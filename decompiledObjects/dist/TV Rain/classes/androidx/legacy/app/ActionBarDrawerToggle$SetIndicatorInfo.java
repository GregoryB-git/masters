package androidx.legacy.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggle$SetIndicatorInfo
{
  public Method mSetHomeActionContentDescription;
  public Method mSetHomeAsUpIndicator;
  public ImageView mUpIndicatorView;
  
  public ActionBarDrawerToggle$SetIndicatorInfo(Activity paramActivity)
  {
    try
    {
      mSetHomeAsUpIndicator = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[] { Drawable.class });
      mSetHomeActionContentDescription = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[] { Integer.TYPE });
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      paramActivity = paramActivity.findViewById(16908332);
      if (paramActivity == null) {
        return;
      }
      paramActivity = (ViewGroup)paramActivity.getParent();
      if (paramActivity.getChildCount() != 2) {
        return;
      }
      View localView1 = paramActivity.getChildAt(0);
      View localView2 = paramActivity.getChildAt(1);
      paramActivity = localView1;
      if (localView1.getId() == 16908332) {
        paramActivity = localView2;
      }
      if ((paramActivity instanceof ImageView)) {
        mUpIndicatorView = ((ImageView)paramActivity);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.legacy.app.ActionBarDrawerToggle.SetIndicatorInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */