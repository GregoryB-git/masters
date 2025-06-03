package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb
{
  private static final String TAG = "ActionBarDrawerToggleHC";
  private static final int[] THEME_ATTRS = { 16843531 };
  
  public static Drawable getThemeUpIndicator(Activity paramActivity)
  {
    TypedArray localTypedArray = paramActivity.obtainStyledAttributes(THEME_ATTRS);
    paramActivity = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return paramActivity;
  }
  
  public static SetIndicatorInfo setActionBarDescription(SetIndicatorInfo paramSetIndicatorInfo, Activity paramActivity, int paramInt)
  {
    SetIndicatorInfo localSetIndicatorInfo = paramSetIndicatorInfo;
    if (paramSetIndicatorInfo == null) {
      localSetIndicatorInfo = new SetIndicatorInfo(paramActivity);
    }
    if (setHomeAsUpIndicator != null) {
      try
      {
        paramSetIndicatorInfo = paramActivity.getActionBar();
        setHomeActionContentDescription.invoke(paramSetIndicatorInfo, new Object[] { Integer.valueOf(paramInt) });
      }
      catch (Exception paramSetIndicatorInfo)
      {
        Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", paramSetIndicatorInfo);
      }
    }
    return localSetIndicatorInfo;
  }
  
  public static SetIndicatorInfo setActionBarUpIndicator(Activity paramActivity, Drawable paramDrawable, int paramInt)
  {
    SetIndicatorInfo localSetIndicatorInfo = new SetIndicatorInfo(paramActivity);
    if (setHomeAsUpIndicator != null)
    {
      try
      {
        paramActivity = paramActivity.getActionBar();
        setHomeAsUpIndicator.invoke(paramActivity, new Object[] { paramDrawable });
        setHomeActionContentDescription.invoke(paramActivity, new Object[] { Integer.valueOf(paramInt) });
      }
      catch (Exception paramActivity)
      {
        Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", paramActivity);
      }
    }
    else
    {
      paramActivity = upIndicatorView;
      if (paramActivity != null) {
        paramActivity.setImageDrawable(paramDrawable);
      } else {
        Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
      }
    }
    return localSetIndicatorInfo;
  }
  
  public static class SetIndicatorInfo
  {
    public Method setHomeActionContentDescription;
    public Method setHomeAsUpIndicator;
    public ImageView upIndicatorView;
    
    public SetIndicatorInfo(Activity paramActivity)
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
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ActionBarDrawerToggleHoneycomb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */