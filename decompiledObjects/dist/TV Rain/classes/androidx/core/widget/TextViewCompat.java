package androidx.core.widget;

import a3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.PrecomputedText.Params;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.text.PrecomputedTextCompat.Params;
import androidx.core.text.PrecomputedTextCompat.Params.Builder;
import androidx.core.util.Preconditions;
import b;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p3;
import z2;

public final class TextViewCompat
{
  public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
  public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
  private static final int LINES = 1;
  private static final String LOG_TAG = "TextViewCompat";
  private static Field sMaxModeField;
  private static boolean sMaxModeFieldFetched;
  private static Field sMaximumField;
  private static boolean sMaximumFieldFetched;
  private static Field sMinModeField;
  private static boolean sMinModeFieldFetched;
  private static Field sMinimumField;
  private static boolean sMinimumFieldFetched;
  
  public static int getAutoSizeMaxTextSize(@NonNull TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 27) {
      return Api26Impl.getAutoSizeMaxTextSize(paramTextView);
    }
    if ((paramTextView instanceof AutoSizeableTextView)) {
      return ((AutoSizeableTextView)paramTextView).getAutoSizeMaxTextSize();
    }
    return -1;
  }
  
  public static int getAutoSizeMinTextSize(@NonNull TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 27) {
      return Api26Impl.getAutoSizeMinTextSize(paramTextView);
    }
    if ((paramTextView instanceof AutoSizeableTextView)) {
      return ((AutoSizeableTextView)paramTextView).getAutoSizeMinTextSize();
    }
    return -1;
  }
  
  public static int getAutoSizeStepGranularity(@NonNull TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 27) {
      return Api26Impl.getAutoSizeStepGranularity(paramTextView);
    }
    if ((paramTextView instanceof AutoSizeableTextView)) {
      return ((AutoSizeableTextView)paramTextView).getAutoSizeStepGranularity();
    }
    return -1;
  }
  
  @NonNull
  public static int[] getAutoSizeTextAvailableSizes(@NonNull TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 27) {
      return Api26Impl.getAutoSizeTextAvailableSizes(paramTextView);
    }
    if ((paramTextView instanceof AutoSizeableTextView)) {
      return ((AutoSizeableTextView)paramTextView).getAutoSizeTextAvailableSizes();
    }
    return new int[0];
  }
  
  public static int getAutoSizeTextType(@NonNull TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 27) {
      return Api26Impl.getAutoSizeTextType(paramTextView);
    }
    if ((paramTextView instanceof AutoSizeableTextView)) {
      return ((AutoSizeableTextView)paramTextView).getAutoSizeTextType();
    }
    return 0;
  }
  
  @Nullable
  public static ColorStateList getCompoundDrawableTintList(@NonNull TextView paramTextView)
  {
    Preconditions.checkNotNull(paramTextView);
    return Api23Impl.getCompoundDrawableTintList(paramTextView);
  }
  
  @Nullable
  public static PorterDuff.Mode getCompoundDrawableTintMode(@NonNull TextView paramTextView)
  {
    Preconditions.checkNotNull(paramTextView);
    return Api23Impl.getCompoundDrawableTintMode(paramTextView);
  }
  
  @NonNull
  public static Drawable[] getCompoundDrawablesRelative(@NonNull TextView paramTextView)
  {
    return Api17Impl.getCompoundDrawablesRelative(paramTextView);
  }
  
  public static int getFirstBaselineToTopHeight(@NonNull TextView paramTextView)
  {
    return paramTextView.getPaddingTop() - getPaintgetFontMetricsInttop;
  }
  
  public static int getLastBaselineToBottomHeight(@NonNull TextView paramTextView)
  {
    return paramTextView.getPaddingBottom() + getPaintgetFontMetricsIntbottom;
  }
  
  public static int getMaxLines(@NonNull TextView paramTextView)
  {
    return Api16Impl.getMaxLines(paramTextView);
  }
  
  public static int getMinLines(@NonNull TextView paramTextView)
  {
    return Api16Impl.getMinLines(paramTextView);
  }
  
  @RequiresApi(18)
  private static int getTextDirection(@NonNull TextDirectionHeuristic paramTextDirectionHeuristic)
  {
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
      return 1;
    }
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
      return 1;
    }
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
      return 2;
    }
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.LTR) {
      return 3;
    }
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.RTL) {
      return 4;
    }
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
      return 5;
    }
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
      return 6;
    }
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
      return 7;
    }
    return 1;
  }
  
  @RequiresApi(18)
  private static TextDirectionHeuristic getTextDirectionHeuristic(@NonNull TextView paramTextView)
  {
    if ((paramTextView.getTransformationMethod() instanceof PasswordTransformationMethod)) {
      return TextDirectionHeuristics.LTR;
    }
    int i = Build.VERSION.SDK_INT;
    int j = 0;
    if ((i >= 28) && ((paramTextView.getInputType() & 0xF) == 3))
    {
      j = Character.getDirectionality(Api28Impl.getDigitStrings(Api24Impl.getInstance(Api17Impl.getTextLocale(paramTextView)))[0].codePointAt(0));
      if ((j != 1) && (j != 2)) {
        return TextDirectionHeuristics.LTR;
      }
      return TextDirectionHeuristics.RTL;
    }
    if (Api17Impl.getLayoutDirection(paramTextView) == 1) {
      j = 1;
    }
    switch (Api17Impl.getTextDirection(paramTextView))
    {
    default: 
      if (j != 0) {
        paramTextView = TextDirectionHeuristics.FIRSTSTRONG_RTL;
      }
      break;
    case 7: 
      return TextDirectionHeuristics.FIRSTSTRONG_RTL;
    case 6: 
      return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    case 5: 
      return TextDirectionHeuristics.LOCALE;
    case 4: 
      return TextDirectionHeuristics.RTL;
    case 3: 
      return TextDirectionHeuristics.LTR;
    case 2: 
      return TextDirectionHeuristics.ANYRTL_LTR;
    }
    paramTextView = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    return paramTextView;
  }
  
  @NonNull
  public static PrecomputedTextCompat.Params getTextMetricsParams(@NonNull TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return new PrecomputedTextCompat.Params(Api28Impl.getTextMetricsParams(paramTextView));
    }
    PrecomputedTextCompat.Params.Builder localBuilder = new PrecomputedTextCompat.Params.Builder(new TextPaint(paramTextView.getPaint()));
    localBuilder.setBreakStrategy(Api23Impl.getBreakStrategy(paramTextView));
    localBuilder.setHyphenationFrequency(Api23Impl.getHyphenationFrequency(paramTextView));
    localBuilder.setTextDirection(getTextDirectionHeuristic(paramTextView));
    return localBuilder.build();
  }
  
  private static Field retrieveField(String paramString)
  {
    Object localObject = null;
    try
    {
      Field localField = TextView.class.getDeclaredField(paramString);
      localObject = localField;
      localField.setAccessible(true);
      localObject = localField;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not retrieve ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" field.");
      Log.e("TextViewCompat", localStringBuilder.toString());
    }
    return (Field)localObject;
  }
  
  private static int retrieveIntFromField(Field paramField, TextView paramTextView)
  {
    try
    {
      int i = paramField.getInt(paramTextView);
      return i;
    }
    catch (IllegalAccessException paramTextView)
    {
      paramTextView = z2.t("Could not retrieve value of ");
      paramTextView.append(paramField.getName());
      paramTextView.append(" field.");
      Log.d("TextViewCompat", paramTextView.toString());
    }
    return -1;
  }
  
  public static void setAutoSizeTextTypeUniformWithConfiguration(@NonNull TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws IllegalArgumentException
  {
    if (Build.VERSION.SDK_INT >= 27) {
      Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(paramTextView, paramInt1, paramInt2, paramInt3, paramInt4);
    } else if ((paramTextView instanceof AutoSizeableTextView)) {
      ((AutoSizeableTextView)paramTextView).setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public static void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull TextView paramTextView, @NonNull int[] paramArrayOfInt, int paramInt)
    throws IllegalArgumentException
  {
    if (Build.VERSION.SDK_INT >= 27) {
      Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(paramTextView, paramArrayOfInt, paramInt);
    } else if ((paramTextView instanceof AutoSizeableTextView)) {
      ((AutoSizeableTextView)paramTextView).setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
    }
  }
  
  public static void setAutoSizeTextTypeWithDefaults(@NonNull TextView paramTextView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 27) {
      Api26Impl.setAutoSizeTextTypeWithDefaults(paramTextView, paramInt);
    } else if ((paramTextView instanceof AutoSizeableTextView)) {
      ((AutoSizeableTextView)paramTextView).setAutoSizeTextTypeWithDefaults(paramInt);
    }
  }
  
  public static void setCompoundDrawableTintList(@NonNull TextView paramTextView, @Nullable ColorStateList paramColorStateList)
  {
    Preconditions.checkNotNull(paramTextView);
    Api23Impl.setCompoundDrawableTintList(paramTextView, paramColorStateList);
  }
  
  public static void setCompoundDrawableTintMode(@NonNull TextView paramTextView, @Nullable PorterDuff.Mode paramMode)
  {
    Preconditions.checkNotNull(paramTextView);
    Api23Impl.setCompoundDrawableTintMode(paramTextView, paramMode);
  }
  
  public static void setCompoundDrawablesRelative(@NonNull TextView paramTextView, @Nullable Drawable paramDrawable1, @Nullable Drawable paramDrawable2, @Nullable Drawable paramDrawable3, @Nullable Drawable paramDrawable4)
  {
    Api17Impl.setCompoundDrawablesRelative(paramTextView, paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@NonNull TextView paramTextView, @DrawableRes int paramInt1, @DrawableRes int paramInt2, @DrawableRes int paramInt3, @DrawableRes int paramInt4)
  {
    Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(paramTextView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@NonNull TextView paramTextView, @Nullable Drawable paramDrawable1, @Nullable Drawable paramDrawable2, @Nullable Drawable paramDrawable3, @Nullable Drawable paramDrawable4)
  {
    Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(paramTextView, paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public static void setCustomSelectionActionModeCallback(@NonNull TextView paramTextView, @NonNull ActionMode.Callback paramCallback)
  {
    paramTextView.setCustomSelectionActionModeCallback(wrapCustomSelectionActionModeCallback(paramTextView, paramCallback));
  }
  
  public static void setFirstBaselineToTopHeight(@NonNull TextView paramTextView, @IntRange(from=0L) @Px int paramInt)
  {
    Preconditions.checkArgumentNonnegative(paramInt);
    if (Build.VERSION.SDK_INT >= 28)
    {
      Api28Impl.setFirstBaselineToTopHeight(paramTextView, paramInt);
      return;
    }
    Paint.FontMetricsInt localFontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
    int i;
    if (Api16Impl.getIncludeFontPadding(paramTextView)) {
      i = top;
    } else {
      i = ascent;
    }
    if (paramInt > Math.abs(i)) {
      paramTextView.setPadding(paramTextView.getPaddingLeft(), paramInt + i, paramTextView.getPaddingRight(), paramTextView.getPaddingBottom());
    }
  }
  
  public static void setLastBaselineToBottomHeight(@NonNull TextView paramTextView, @IntRange(from=0L) @Px int paramInt)
  {
    Preconditions.checkArgumentNonnegative(paramInt);
    Paint.FontMetricsInt localFontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
    int i;
    if (Api16Impl.getIncludeFontPadding(paramTextView)) {
      i = bottom;
    } else {
      i = descent;
    }
    if (paramInt > Math.abs(i)) {
      paramTextView.setPadding(paramTextView.getPaddingLeft(), paramTextView.getPaddingTop(), paramTextView.getPaddingRight(), paramInt - i);
    }
  }
  
  public static void setLineHeight(@NonNull TextView paramTextView, @IntRange(from=0L) @Px int paramInt)
  {
    Preconditions.checkArgumentNonnegative(paramInt);
    int i = paramTextView.getPaint().getFontMetricsInt(null);
    if (paramInt != i) {
      paramTextView.setLineSpacing(paramInt - i, 1.0F);
    }
  }
  
  public static void setPrecomputedText(@NonNull TextView paramTextView, @NonNull PrecomputedTextCompat paramPrecomputedTextCompat)
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      paramTextView.setText(paramPrecomputedTextCompat.getPrecomputedText());
    }
    else
    {
      if (!getTextMetricsParams(paramTextView).equalsWithoutTextDirection(paramPrecomputedTextCompat.getParams())) {
        break label39;
      }
      paramTextView.setText(paramPrecomputedTextCompat);
    }
    return;
    label39:
    throw new IllegalArgumentException("Given text can not be applied to TextView.");
  }
  
  public static void setTextAppearance(@NonNull TextView paramTextView, @StyleRes int paramInt)
  {
    paramTextView.setTextAppearance(paramInt);
  }
  
  public static void setTextMetricsParams(@NonNull TextView paramTextView, @NonNull PrecomputedTextCompat.Params paramParams)
  {
    Api17Impl.setTextDirection(paramTextView, getTextDirection(paramParams.getTextDirection()));
    paramTextView.getPaint().set(paramParams.getTextPaint());
    Api23Impl.setBreakStrategy(paramTextView, paramParams.getBreakStrategy());
    Api23Impl.setHyphenationFrequency(paramTextView, paramParams.getHyphenationFrequency());
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static ActionMode.Callback unwrapCustomSelectionActionModeCallback(@Nullable ActionMode.Callback paramCallback)
  {
    ActionMode.Callback localCallback = paramCallback;
    if ((paramCallback instanceof OreoCallback))
    {
      localCallback = paramCallback;
      if (Build.VERSION.SDK_INT >= 26) {
        localCallback = ((OreoCallback)paramCallback).getWrappedCallback();
      }
    }
    return localCallback;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static ActionMode.Callback wrapCustomSelectionActionModeCallback(@NonNull TextView paramTextView, @Nullable ActionMode.Callback paramCallback)
  {
    int i = Build.VERSION.SDK_INT;
    if ((i >= 26) && (i <= 27) && (!(paramCallback instanceof OreoCallback)) && (paramCallback != null)) {
      return new OreoCallback(paramCallback, paramTextView);
    }
    return paramCallback;
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static boolean getIncludeFontPadding(TextView paramTextView)
    {
      return paramTextView.getIncludeFontPadding();
    }
    
    @DoNotInline
    public static int getMaxLines(TextView paramTextView)
    {
      return paramTextView.getMaxLines();
    }
    
    @DoNotInline
    public static int getMinLines(TextView paramTextView)
    {
      return paramTextView.getMinLines();
    }
  }
  
  @RequiresApi(17)
  public static class Api17Impl
  {
    @DoNotInline
    public static Drawable[] getCompoundDrawablesRelative(TextView paramTextView)
    {
      return paramTextView.getCompoundDrawablesRelative();
    }
    
    @DoNotInline
    public static int getLayoutDirection(View paramView)
    {
      return paramView.getLayoutDirection();
    }
    
    @DoNotInline
    public static int getTextDirection(View paramView)
    {
      return paramView.getTextDirection();
    }
    
    @DoNotInline
    public static Locale getTextLocale(TextView paramTextView)
    {
      return paramTextView.getTextLocale();
    }
    
    @DoNotInline
    public static void setCompoundDrawablesRelative(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      paramTextView.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    }
    
    @DoNotInline
    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    @DoNotInline
    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    }
    
    @DoNotInline
    public static void setTextDirection(View paramView, int paramInt)
    {
      paramView.setTextDirection(paramInt);
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @DoNotInline
    public static int getBreakStrategy(TextView paramTextView)
    {
      return paramTextView.getBreakStrategy();
    }
    
    @DoNotInline
    public static ColorStateList getCompoundDrawableTintList(TextView paramTextView)
    {
      return paramTextView.getCompoundDrawableTintList();
    }
    
    @DoNotInline
    public static PorterDuff.Mode getCompoundDrawableTintMode(TextView paramTextView)
    {
      return paramTextView.getCompoundDrawableTintMode();
    }
    
    @DoNotInline
    public static int getHyphenationFrequency(TextView paramTextView)
    {
      return paramTextView.getHyphenationFrequency();
    }
    
    @DoNotInline
    public static void setBreakStrategy(TextView paramTextView, int paramInt)
    {
      paramTextView.setBreakStrategy(paramInt);
    }
    
    @DoNotInline
    public static void setCompoundDrawableTintList(TextView paramTextView, ColorStateList paramColorStateList)
    {
      paramTextView.setCompoundDrawableTintList(paramColorStateList);
    }
    
    @DoNotInline
    public static void setCompoundDrawableTintMode(TextView paramTextView, PorterDuff.Mode paramMode)
    {
      paramTextView.setCompoundDrawableTintMode(paramMode);
    }
    
    @DoNotInline
    public static void setHyphenationFrequency(TextView paramTextView, int paramInt)
    {
      paramTextView.setHyphenationFrequency(paramInt);
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static DecimalFormatSymbols getInstance(Locale paramLocale)
    {
      return DecimalFormatSymbols.getInstance(paramLocale);
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static int getAutoSizeMaxTextSize(TextView paramTextView)
    {
      return p3.z(paramTextView);
    }
    
    @DoNotInline
    public static int getAutoSizeMinTextSize(TextView paramTextView)
    {
      return p3.D(paramTextView);
    }
    
    @DoNotInline
    public static int getAutoSizeStepGranularity(TextView paramTextView)
    {
      return b.g(paramTextView);
    }
    
    @DoNotInline
    public static int[] getAutoSizeTextAvailableSizes(TextView paramTextView)
    {
      return p3.x(paramTextView);
    }
    
    @DoNotInline
    public static int getAutoSizeTextType(TextView paramTextView)
    {
      return p3.b(paramTextView);
    }
    
    @DoNotInline
    public static void setAutoSizeTextTypeUniformWithConfiguration(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      b.r(paramTextView, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    @DoNotInline
    public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView paramTextView, int[] paramArrayOfInt, int paramInt)
    {
      b.s(paramTextView, paramArrayOfInt, paramInt);
    }
    
    @DoNotInline
    public static void setAutoSizeTextTypeWithDefaults(TextView paramTextView, int paramInt)
    {
      p3.r(paramTextView, paramInt);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static String[] getDigitStrings(DecimalFormatSymbols paramDecimalFormatSymbols)
    {
      return a3.C(paramDecimalFormatSymbols);
    }
    
    @DoNotInline
    public static PrecomputedText.Params getTextMetricsParams(TextView paramTextView)
    {
      return a3.j(paramTextView);
    }
    
    @DoNotInline
    public static void setFirstBaselineToTopHeight(TextView paramTextView, int paramInt)
    {
      a3.x(paramTextView, paramInt);
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface AutoSizeTextType {}
  
  @RequiresApi(26)
  public static class OreoCallback
    implements ActionMode.Callback
  {
    private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
    private final ActionMode.Callback mCallback;
    private boolean mCanUseMenuBuilderReferences;
    private boolean mInitializedMenuBuilderReferences;
    private Class<?> mMenuBuilderClass;
    private Method mMenuBuilderRemoveItemAtMethod;
    private final TextView mTextView;
    
    public OreoCallback(ActionMode.Callback paramCallback, TextView paramTextView)
    {
      mCallback = paramCallback;
      mTextView = paramTextView;
      mInitializedMenuBuilderReferences = false;
    }
    
    private Intent createProcessTextIntent()
    {
      return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }
    
    private Intent createProcessTextIntentForResolveInfo(ResolveInfo paramResolveInfo, TextView paramTextView)
    {
      paramTextView = createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", isEditable(paramTextView) ^ true);
      paramResolveInfo = activityInfo;
      return paramTextView.setClassName(packageName, name);
    }
    
    private List<ResolveInfo> getSupportedActivities(Context paramContext, PackageManager paramPackageManager)
    {
      ArrayList localArrayList = new ArrayList();
      if (!(paramContext instanceof Activity)) {
        return localArrayList;
      }
      Iterator localIterator = paramPackageManager.queryIntentActivities(createProcessTextIntent(), 0).iterator();
      while (localIterator.hasNext())
      {
        paramPackageManager = (ResolveInfo)localIterator.next();
        if (isSupportedActivity(paramPackageManager, paramContext)) {
          localArrayList.add(paramPackageManager);
        }
      }
      return localArrayList;
    }
    
    private boolean isEditable(TextView paramTextView)
    {
      boolean bool;
      if (((paramTextView instanceof Editable)) && (paramTextView.onCheckIsTextEditor()) && (paramTextView.isEnabled())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private boolean isSupportedActivity(ResolveInfo paramResolveInfo, Context paramContext)
    {
      boolean bool1 = paramContext.getPackageName().equals(activityInfo.packageName);
      boolean bool2 = true;
      if (bool1) {
        return true;
      }
      paramResolveInfo = activityInfo;
      if (!exported) {
        return false;
      }
      paramResolveInfo = permission;
      bool1 = bool2;
      if (paramResolveInfo != null) {
        if (paramContext.checkSelfPermission(paramResolveInfo) == 0) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      return bool1;
    }
    
    private void recomputeProcessTextMenuItems(Menu paramMenu)
    {
      Object localObject1 = mTextView.getContext();
      PackageManager localPackageManager = ((Context)localObject1).getPackageManager();
      if (!mInitializedMenuBuilderReferences)
      {
        mInitializedMenuBuilderReferences = true;
        try
        {
          Class localClass = Class.forName("com.android.internal.view.menu.MenuBuilder");
          mMenuBuilderClass = localClass;
          mMenuBuilderRemoveItemAtMethod = localClass.getDeclaredMethod("removeItemAt", new Class[] { Integer.TYPE });
          mCanUseMenuBuilderReferences = true;
        }
        catch (ClassNotFoundException|NoSuchMethodException localClassNotFoundException)
        {
          mMenuBuilderClass = null;
          mMenuBuilderRemoveItemAtMethod = null;
          mCanUseMenuBuilderReferences = false;
        }
      }
      try
      {
        Object localObject2;
        if ((mCanUseMenuBuilderReferences) && (mMenuBuilderClass.isInstance(paramMenu))) {
          localObject2 = mMenuBuilderRemoveItemAtMethod;
        } else {
          localObject2 = paramMenu.getClass().getDeclaredMethod("removeItemAt", new Class[] { Integer.TYPE });
        }
        for (int i = paramMenu.size() - 1; i >= 0; i--)
        {
          MenuItem localMenuItem = paramMenu.getItem(i);
          if ((localMenuItem.getIntent() != null) && ("android.intent.action.PROCESS_TEXT".equals(localMenuItem.getIntent().getAction()))) {
            ((Method)localObject2).invoke(paramMenu, new Object[] { Integer.valueOf(i) });
          }
        }
        localObject1 = getSupportedActivities((Context)localObject1, localPackageManager);
        for (i = 0; i < ((List)localObject1).size(); i++)
        {
          localObject2 = (ResolveInfo)((List)localObject1).get(i);
          paramMenu.add(0, 0, i + 100, ((ResolveInfo)localObject2).loadLabel(localPackageManager)).setIntent(createProcessTextIntentForResolveInfo((ResolveInfo)localObject2, mTextView)).setShowAsAction(1);
        }
        return;
      }
      catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramMenu)
      {
        for (;;) {}
      }
    }
    
    @NonNull
    public ActionMode.Callback getWrappedCallback()
    {
      return mCallback;
    }
    
    public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
    {
      return mCallback.onActionItemClicked(paramActionMode, paramMenuItem);
    }
    
    public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
    {
      return mCallback.onCreateActionMode(paramActionMode, paramMenu);
    }
    
    public void onDestroyActionMode(ActionMode paramActionMode)
    {
      mCallback.onDestroyActionMode(paramActionMode);
    }
    
    public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
    {
      recomputeProcessTextMenuItems(paramMenu);
      return mCallback.onPrepareActionMode(paramActionMode, paramMenu);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */