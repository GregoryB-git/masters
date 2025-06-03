package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
{
  public Method setHomeActionContentDescription;
  public Method setHomeAsUpIndicator;
  public ImageView upIndicatorView;
  
  public ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity paramActivity)
  {
    try
    {
      setHomeAsUpIndicator = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[] { Drawable.class });
      setHomeActionContentDescription = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[] { Integer.TYPE });
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
        upIndicatorView = ((ImageView)paramActivity);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */