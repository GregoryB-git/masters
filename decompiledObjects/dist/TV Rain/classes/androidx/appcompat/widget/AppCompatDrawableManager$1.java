package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.color;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;

class AppCompatDrawableManager$1
  implements ResourceManagerInternal.ResourceManagerHooks
{
  private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = { R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult };
  private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = { R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl };
  private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = { R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha };
  private final int[] TINT_CHECKABLE_BUTTON_LIST = { R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim };
  private final int[] TINT_COLOR_CONTROL_NORMAL = { R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha };
  private final int[] TINT_COLOR_CONTROL_STATE_LIST = { R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material };
  
  private boolean arrayContains(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++) {
      if (paramArrayOfInt[j] == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  private ColorStateList createBorderlessButtonColorStateList(@NonNull Context paramContext)
  {
    return createButtonColorStateList(paramContext, 0);
  }
  
  private ColorStateList createButtonColorStateList(@NonNull Context paramContext, @ColorInt int paramInt)
  {
    int i = ThemeUtils.getThemeAttrColor(paramContext, R.attr.colorControlHighlight);
    int j = ThemeUtils.getDisabledThemeAttrColor(paramContext, R.attr.colorButtonNormal);
    paramContext = ThemeUtils.DISABLED_STATE_SET;
    int[] arrayOfInt1 = ThemeUtils.PRESSED_STATE_SET;
    int k = ColorUtils.compositeColors(i, paramInt);
    int[] arrayOfInt2 = ThemeUtils.FOCUSED_STATE_SET;
    i = ColorUtils.compositeColors(i, paramInt);
    return new ColorStateList(new int[][] { paramContext, arrayOfInt1, arrayOfInt2, ThemeUtils.EMPTY_STATE_SET }, new int[] { j, k, i, paramInt });
  }
  
  private ColorStateList createColoredButtonColorStateList(@NonNull Context paramContext)
  {
    return createButtonColorStateList(paramContext, ThemeUtils.getThemeAttrColor(paramContext, R.attr.colorAccent));
  }
  
  private ColorStateList createDefaultButtonColorStateList(@NonNull Context paramContext)
  {
    return createButtonColorStateList(paramContext, ThemeUtils.getThemeAttrColor(paramContext, R.attr.colorButtonNormal));
  }
  
  private ColorStateList createSwitchThumbColorStateList(Context paramContext)
  {
    int[][] arrayOfInt = new int[3][];
    int[] arrayOfInt1 = new int[3];
    int i = R.attr.colorSwitchThumbNormal;
    ColorStateList localColorStateList = ThemeUtils.getThemeAttrColorStateList(paramContext, i);
    if ((localColorStateList != null) && (localColorStateList.isStateful()))
    {
      int[] arrayOfInt2 = ThemeUtils.DISABLED_STATE_SET;
      arrayOfInt[0] = arrayOfInt2;
      arrayOfInt1[0] = localColorStateList.getColorForState(arrayOfInt2, 0);
      arrayOfInt[1] = ThemeUtils.CHECKED_STATE_SET;
      arrayOfInt1[1] = ThemeUtils.getThemeAttrColor(paramContext, R.attr.colorControlActivated);
      arrayOfInt[2] = ThemeUtils.EMPTY_STATE_SET;
      arrayOfInt1[2] = localColorStateList.getDefaultColor();
    }
    else
    {
      arrayOfInt[0] = ThemeUtils.DISABLED_STATE_SET;
      arrayOfInt1[0] = ThemeUtils.getDisabledThemeAttrColor(paramContext, i);
      arrayOfInt[1] = ThemeUtils.CHECKED_STATE_SET;
      arrayOfInt1[1] = ThemeUtils.getThemeAttrColor(paramContext, R.attr.colorControlActivated);
      arrayOfInt[2] = ThemeUtils.EMPTY_STATE_SET;
      arrayOfInt1[2] = ThemeUtils.getThemeAttrColor(paramContext, i);
    }
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  private LayerDrawable getRatingBarLayerDrawable(@NonNull ResourceManagerInternal paramResourceManagerInternal, @NonNull Context paramContext, @DimenRes int paramInt)
  {
    paramInt = paramContext.getResources().getDimensionPixelSize(paramInt);
    Object localObject1 = paramResourceManagerInternal.getDrawable(paramContext, R.drawable.abc_star_black_48dp);
    Object localObject2 = paramResourceManagerInternal.getDrawable(paramContext, R.drawable.abc_star_half_black_48dp);
    if (((localObject1 instanceof BitmapDrawable)) && (((Drawable)localObject1).getIntrinsicWidth() == paramInt) && (((Drawable)localObject1).getIntrinsicHeight() == paramInt))
    {
      paramContext = (BitmapDrawable)localObject1;
      paramResourceManagerInternal = new BitmapDrawable(paramContext.getBitmap());
    }
    else
    {
      paramResourceManagerInternal = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
      paramContext = new Canvas(paramResourceManagerInternal);
      ((Drawable)localObject1).setBounds(0, 0, paramInt, paramInt);
      ((Drawable)localObject1).draw(paramContext);
      paramContext = new BitmapDrawable(paramResourceManagerInternal);
      paramResourceManagerInternal = new BitmapDrawable(paramResourceManagerInternal);
    }
    paramResourceManagerInternal.setTileModeX(Shader.TileMode.REPEAT);
    if (((localObject2 instanceof BitmapDrawable)) && (((Drawable)localObject2).getIntrinsicWidth() == paramInt) && (((Drawable)localObject2).getIntrinsicHeight() == paramInt))
    {
      localObject2 = (BitmapDrawable)localObject2;
    }
    else
    {
      localObject1 = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas((Bitmap)localObject1);
      ((Drawable)localObject2).setBounds(0, 0, paramInt, paramInt);
      ((Drawable)localObject2).draw(localCanvas);
      localObject2 = new BitmapDrawable((Bitmap)localObject1);
    }
    paramResourceManagerInternal = new LayerDrawable(new Drawable[] { paramContext, localObject2, paramResourceManagerInternal });
    paramResourceManagerInternal.setId(0, 16908288);
    paramResourceManagerInternal.setId(1, 16908303);
    paramResourceManagerInternal.setId(2, 16908301);
    return paramResourceManagerInternal;
  }
  
  private void setPorterDuffColorFilter(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = paramDrawable;
    if (DrawableUtils.canSafelyMutateDrawable(paramDrawable)) {
      localDrawable = paramDrawable.mutate();
    }
    paramDrawable = paramMode;
    if (paramMode == null) {
      paramDrawable = AppCompatDrawableManager.access$000();
    }
    localDrawable.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(paramInt, paramDrawable));
  }
  
  public Drawable createDrawableFor(@NonNull ResourceManagerInternal paramResourceManagerInternal, @NonNull Context paramContext, int paramInt)
  {
    if (paramInt == R.drawable.abc_cab_background_top_material) {
      return new LayerDrawable(new Drawable[] { paramResourceManagerInternal.getDrawable(paramContext, R.drawable.abc_cab_background_internal_bg), paramResourceManagerInternal.getDrawable(paramContext, R.drawable.abc_cab_background_top_mtrl_alpha) });
    }
    if (paramInt == R.drawable.abc_ratingbar_material) {
      return getRatingBarLayerDrawable(paramResourceManagerInternal, paramContext, R.dimen.abc_star_big);
    }
    if (paramInt == R.drawable.abc_ratingbar_indicator_material) {
      return getRatingBarLayerDrawable(paramResourceManagerInternal, paramContext, R.dimen.abc_star_medium);
    }
    if (paramInt == R.drawable.abc_ratingbar_small_material) {
      return getRatingBarLayerDrawable(paramResourceManagerInternal, paramContext, R.dimen.abc_star_small);
    }
    return null;
  }
  
  public ColorStateList getTintListForDrawableRes(@NonNull Context paramContext, int paramInt)
  {
    if (paramInt == R.drawable.abc_edit_text_material) {
      return AppCompatResources.getColorStateList(paramContext, R.color.abc_tint_edittext);
    }
    if (paramInt == R.drawable.abc_switch_track_mtrl_alpha) {
      return AppCompatResources.getColorStateList(paramContext, R.color.abc_tint_switch_track);
    }
    if (paramInt == R.drawable.abc_switch_thumb_material) {
      return createSwitchThumbColorStateList(paramContext);
    }
    if (paramInt == R.drawable.abc_btn_default_mtrl_shape) {
      return createDefaultButtonColorStateList(paramContext);
    }
    if (paramInt == R.drawable.abc_btn_borderless_material) {
      return createBorderlessButtonColorStateList(paramContext);
    }
    if (paramInt == R.drawable.abc_btn_colored_material) {
      return createColoredButtonColorStateList(paramContext);
    }
    if ((paramInt != R.drawable.abc_spinner_mtrl_am_alpha) && (paramInt != R.drawable.abc_spinner_textfield_background_material))
    {
      if (arrayContains(TINT_COLOR_CONTROL_NORMAL, paramInt)) {
        return ThemeUtils.getThemeAttrColorStateList(paramContext, R.attr.colorControlNormal);
      }
      if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, paramInt)) {
        return AppCompatResources.getColorStateList(paramContext, R.color.abc_tint_default);
      }
      if (arrayContains(TINT_CHECKABLE_BUTTON_LIST, paramInt)) {
        return AppCompatResources.getColorStateList(paramContext, R.color.abc_tint_btn_checkable);
      }
      if (paramInt == R.drawable.abc_seekbar_thumb_material) {
        return AppCompatResources.getColorStateList(paramContext, R.color.abc_tint_seek_thumb);
      }
      return null;
    }
    return AppCompatResources.getColorStateList(paramContext, R.color.abc_tint_spinner);
  }
  
  public PorterDuff.Mode getTintModeForDrawableRes(int paramInt)
  {
    PorterDuff.Mode localMode;
    if (paramInt == R.drawable.abc_switch_thumb_material) {
      localMode = PorterDuff.Mode.MULTIPLY;
    } else {
      localMode = null;
    }
    return localMode;
  }
  
  public boolean tintDrawable(@NonNull Context paramContext, int paramInt, @NonNull Drawable paramDrawable)
  {
    if (paramInt == R.drawable.abc_seekbar_track_material)
    {
      paramDrawable = (LayerDrawable)paramDrawable;
      localObject = paramDrawable.findDrawableByLayerId(16908288);
      paramInt = R.attr.colorControlNormal;
      setPorterDuffColorFilter((Drawable)localObject, ThemeUtils.getThemeAttrColor(paramContext, paramInt), AppCompatDrawableManager.access$000());
      setPorterDuffColorFilter(paramDrawable.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(paramContext, paramInt), AppCompatDrawableManager.access$000());
      setPorterDuffColorFilter(paramDrawable.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(paramContext, R.attr.colorControlActivated), AppCompatDrawableManager.access$000());
      return true;
    }
    if ((paramInt != R.drawable.abc_ratingbar_material) && (paramInt != R.drawable.abc_ratingbar_indicator_material) && (paramInt != R.drawable.abc_ratingbar_small_material)) {
      return false;
    }
    Object localObject = (LayerDrawable)paramDrawable;
    setPorterDuffColorFilter(((LayerDrawable)localObject).findDrawableByLayerId(16908288), ThemeUtils.getDisabledThemeAttrColor(paramContext, R.attr.colorControlNormal), AppCompatDrawableManager.access$000());
    paramDrawable = ((LayerDrawable)localObject).findDrawableByLayerId(16908303);
    paramInt = R.attr.colorControlActivated;
    setPorterDuffColorFilter(paramDrawable, ThemeUtils.getThemeAttrColor(paramContext, paramInt), AppCompatDrawableManager.access$000());
    setPorterDuffColorFilter(((LayerDrawable)localObject).findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(paramContext, paramInt), AppCompatDrawableManager.access$000());
    return true;
  }
  
  public boolean tintDrawableUsingColorFilter(@NonNull Context paramContext, int paramInt, @NonNull Drawable paramDrawable)
  {
    PorterDuff.Mode localMode = AppCompatDrawableManager.access$000();
    boolean bool = arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, paramInt);
    int i = 16842801;
    if (bool) {
      paramInt = R.attr.colorControlNormal;
    }
    for (;;)
    {
      for (i = -1;; i = Math.round(40.8F))
      {
        j = 1;
        break label125;
        if (arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, paramInt))
        {
          paramInt = R.attr.colorControlActivated;
          break;
        }
        if (arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, paramInt))
        {
          localMode = PorterDuff.Mode.MULTIPLY;
          paramInt = i;
          break;
        }
        if (paramInt != R.drawable.abc_list_divider_mtrl_alpha) {
          break label103;
        }
        paramInt = 16842800;
      }
      label103:
      if (paramInt != R.drawable.abc_dialog_material_background) {
        break;
      }
      paramInt = i;
    }
    i = -1;
    int j = 0;
    paramInt = j;
    label125:
    if (j != 0)
    {
      Drawable localDrawable = paramDrawable;
      if (DrawableUtils.canSafelyMutateDrawable(paramDrawable)) {
        localDrawable = paramDrawable.mutate();
      }
      localDrawable.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(paramContext, paramInt), localMode));
      if (i != -1) {
        localDrawable.setAlpha(i);
      }
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatDrawableManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */