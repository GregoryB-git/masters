package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.mediarouter.R.color;
import androidx.mediarouter.R.drawable;
import androidx.mediarouter.R.style;

final class MediaRouterThemeHelper
{
  public static final int COLOR_DARK_ON_LIGHT_BACKGROUND = -570425344;
  private static final int COLOR_DARK_ON_LIGHT_BACKGROUND_RES_ID = R.color.mr_dynamic_dialog_icon_light;
  public static final int COLOR_WHITE_ON_DARK_BACKGROUND = -1;
  private static final float MIN_CONTRAST = 3.0F;
  
  public static Context createThemedButtonContext(Context paramContext)
  {
    ContextThemeWrapper localContextThemeWrapper = new ContextThemeWrapper(paramContext, getRouterThemeId(paramContext));
    int i = getThemeResource(localContextThemeWrapper, androidx.mediarouter.R.attr.mediaRouteTheme);
    paramContext = localContextThemeWrapper;
    if (i != 0) {
      paramContext = new ContextThemeWrapper(localContextThemeWrapper, i);
    }
    return paramContext;
  }
  
  public static Context createThemedDialogContext(Context paramContext, int paramInt, boolean paramBoolean)
  {
    int i = paramInt;
    if (paramInt == 0)
    {
      if (!paramBoolean) {
        paramInt = androidx.appcompat.R.attr.dialogTheme;
      } else {
        paramInt = androidx.appcompat.R.attr.alertDialogTheme;
      }
      i = getThemeResource(paramContext, paramInt);
    }
    ContextThemeWrapper localContextThemeWrapper = new ContextThemeWrapper(paramContext, i);
    paramContext = localContextThemeWrapper;
    if (getThemeResource(localContextThemeWrapper, androidx.mediarouter.R.attr.mediaRouteTheme) != 0) {
      paramContext = new ContextThemeWrapper(localContextThemeWrapper, getRouterThemeId(localContextThemeWrapper));
    }
    return paramContext;
  }
  
  public static int createThemedDialogStyle(Context paramContext)
  {
    int i = getThemeResource(paramContext, androidx.mediarouter.R.attr.mediaRouteTheme);
    int j = i;
    if (i == 0) {
      j = getRouterThemeId(paramContext);
    }
    return j;
  }
  
  public static int getButtonTextColor(Context paramContext)
  {
    int i = getThemeColor(paramContext, 0, androidx.appcompat.R.attr.colorPrimary);
    if (ColorUtils.calculateContrast(i, getThemeColor(paramContext, 0, 16842801)) < 3.0D) {
      return getThemeColor(paramContext, 0, androidx.appcompat.R.attr.colorAccent);
    }
    return i;
  }
  
  public static Drawable getCheckBoxDrawableIcon(Context paramContext)
  {
    return getIconByDrawableId(paramContext, R.drawable.mr_cast_checkbox);
  }
  
  public static int getControllerColor(Context paramContext, int paramInt)
  {
    if (ColorUtils.calculateContrast(-1, getThemeColor(paramContext, paramInt, androidx.appcompat.R.attr.colorPrimary)) >= 3.0D) {
      return -1;
    }
    return -570425344;
  }
  
  public static Drawable getDefaultDrawableIcon(Context paramContext)
  {
    return getIconByAttrId(paramContext, androidx.mediarouter.R.attr.mediaRouteDefaultIconDrawable);
  }
  
  public static float getDisabledAlpha(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    float f;
    if (paramContext.getTheme().resolveAttribute(16842803, localTypedValue, true)) {
      f = localTypedValue.getFloat();
    } else {
      f = 0.5F;
    }
    return f;
  }
  
  private static Drawable getIconByAttrId(Context paramContext, int paramInt)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(new int[] { paramInt });
    Drawable localDrawable = DrawableCompat.wrap(AppCompatResources.getDrawable(paramContext, localTypedArray.getResourceId(0, 0)));
    if (isLightTheme(paramContext)) {
      DrawableCompat.setTint(localDrawable, ContextCompat.getColor(paramContext, COLOR_DARK_ON_LIGHT_BACKGROUND_RES_ID));
    }
    localTypedArray.recycle();
    return localDrawable;
  }
  
  private static Drawable getIconByDrawableId(Context paramContext, int paramInt)
  {
    Drawable localDrawable = DrawableCompat.wrap(AppCompatResources.getDrawable(paramContext, paramInt));
    if (isLightTheme(paramContext)) {
      DrawableCompat.setTint(localDrawable, ContextCompat.getColor(paramContext, COLOR_DARK_ON_LIGHT_BACKGROUND_RES_ID));
    }
    return localDrawable;
  }
  
  public static Drawable getMuteButtonDrawableIcon(Context paramContext)
  {
    return getIconByDrawableId(paramContext, R.drawable.mr_cast_mute_button);
  }
  
  private static int getRouterThemeId(Context paramContext)
  {
    int i;
    if (isLightTheme(paramContext))
    {
      if (getControllerColor(paramContext, 0) == -570425344) {
        i = R.style.Theme_MediaRouter_Light;
      } else {
        i = R.style.Theme_MediaRouter_Light_DarkControlPanel;
      }
    }
    else if (getControllerColor(paramContext, 0) == -570425344) {
      i = R.style.Theme_MediaRouter_LightControlPanel;
    } else {
      i = R.style.Theme_MediaRouter;
    }
    return i;
  }
  
  public static Drawable getSpeakerDrawableIcon(Context paramContext)
  {
    return getIconByAttrId(paramContext, androidx.mediarouter.R.attr.mediaRouteSpeakerIconDrawable);
  }
  
  public static Drawable getSpeakerGroupDrawableIcon(Context paramContext)
  {
    return getIconByAttrId(paramContext, androidx.mediarouter.R.attr.mediaRouteSpeakerGroupIconDrawable);
  }
  
  public static TypedArray getStyledAttributes(Context paramContext)
  {
    return paramContext.obtainStyledAttributes(new int[] { androidx.mediarouter.R.attr.mediaRouteDefaultIconDrawable, androidx.mediarouter.R.attr.mediaRouteTvIconDrawable, androidx.mediarouter.R.attr.mediaRouteSpeakerIconDrawable, androidx.mediarouter.R.attr.mediaRouteSpeakerGroupIconDrawable });
  }
  
  private static int getThemeColor(Context paramContext, int paramInt1, int paramInt2)
  {
    if (paramInt1 != 0)
    {
      localObject = paramContext.obtainStyledAttributes(paramInt1, new int[] { paramInt2 });
      paramInt1 = ((TypedArray)localObject).getColor(0, 0);
      ((TypedArray)localObject).recycle();
      if (paramInt1 != 0) {
        return paramInt1;
      }
    }
    Object localObject = new TypedValue();
    paramContext.getTheme().resolveAttribute(paramInt2, (TypedValue)localObject, true);
    if (resourceId != 0) {
      return paramContext.getResources().getColor(resourceId);
    }
    return data;
  }
  
  public static int getThemeResource(Context paramContext, int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(paramInt, localTypedValue, true)) {
      paramInt = resourceId;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public static Drawable getTvDrawableIcon(Context paramContext)
  {
    return getIconByAttrId(paramContext, androidx.mediarouter.R.attr.mediaRouteTvIconDrawable);
  }
  
  private static boolean isLightTheme(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    paramContext = paramContext.getTheme();
    int i = androidx.appcompat.R.attr.isLightTheme;
    boolean bool = true;
    if ((!paramContext.resolveAttribute(i, localTypedValue, true)) || (data == 0)) {
      bool = false;
    }
    return bool;
  }
  
  public static void setDialogBackgroundColor(Context paramContext, Dialog paramDialog)
  {
    paramDialog = paramDialog.getWindow().getDecorView();
    int i;
    if (isLightTheme(paramContext)) {
      i = R.color.mr_dynamic_dialog_background_light;
    } else {
      i = R.color.mr_dynamic_dialog_background_dark;
    }
    paramDialog.setBackgroundColor(ContextCompat.getColor(paramContext, i));
  }
  
  public static void setIndeterminateProgressBarColor(Context paramContext, ProgressBar paramProgressBar)
  {
    if (!paramProgressBar.isIndeterminate()) {
      return;
    }
    if (isLightTheme(paramContext)) {
      i = R.color.mr_cast_progressbar_progress_and_thumb_light;
    } else {
      i = R.color.mr_cast_progressbar_progress_and_thumb_dark;
    }
    int i = ContextCompat.getColor(paramContext, i);
    paramProgressBar.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
  }
  
  public static void setMediaControlsBackgroundColor(Context paramContext, View paramView1, View paramView2, boolean paramBoolean)
  {
    int i = getThemeColor(paramContext, 0, androidx.appcompat.R.attr.colorPrimary);
    int j = getThemeColor(paramContext, 0, androidx.appcompat.R.attr.colorPrimaryDark);
    int k = i;
    int m = j;
    if (paramBoolean)
    {
      k = i;
      m = j;
      if (getControllerColor(paramContext, 0) == -570425344)
      {
        m = i;
        k = -1;
      }
    }
    paramView1.setBackgroundColor(k);
    paramView2.setBackgroundColor(m);
    paramView1.setTag(Integer.valueOf(k));
    paramView2.setTag(Integer.valueOf(m));
  }
  
  public static void setVolumeSliderColor(Context paramContext, MediaRouteVolumeSlider paramMediaRouteVolumeSlider)
  {
    int i;
    int j;
    if (isLightTheme(paramContext))
    {
      i = ContextCompat.getColor(paramContext, R.color.mr_cast_progressbar_progress_and_thumb_light);
      j = ContextCompat.getColor(paramContext, R.color.mr_cast_progressbar_background_light);
    }
    else
    {
      i = ContextCompat.getColor(paramContext, R.color.mr_cast_progressbar_progress_and_thumb_dark);
      j = ContextCompat.getColor(paramContext, R.color.mr_cast_progressbar_background_dark);
    }
    paramMediaRouteVolumeSlider.setColor(i, j);
  }
  
  public static void setVolumeSliderColor(Context paramContext, MediaRouteVolumeSlider paramMediaRouteVolumeSlider, View paramView)
  {
    int i = getControllerColor(paramContext, 0);
    int j = i;
    if (Color.alpha(i) != 255) {
      j = ColorUtils.compositeColors(i, ((Integer)paramView.getTag()).intValue());
    }
    paramMediaRouteVolumeSlider.setColor(j);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouterThemeHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */