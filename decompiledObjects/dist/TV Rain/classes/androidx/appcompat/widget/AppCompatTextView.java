package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.text.PrecomputedTextCompat.Params;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView
  extends TextView
  implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView, EmojiCompatConfigurationView
{
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  @NonNull
  private AppCompatEmojiTextHelper mEmojiTextViewHelper;
  private boolean mIsSetTypefaceProcessing = false;
  @Nullable
  private Future<PrecomputedTextCompat> mPrecomputedTextFuture;
  private final AppCompatTextClassifierHelper mTextClassifierHelper;
  private final AppCompatTextHelper mTextHelper;
  
  public AppCompatTextView(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatTextView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public AppCompatTextView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(TintContextWrapper.wrap(paramContext), paramAttributeSet, paramInt);
    ThemeUtils.checkAppCompatTheme(this, getContext());
    paramContext = new AppCompatBackgroundHelper(this);
    mBackgroundTintHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, paramInt);
    paramContext = new AppCompatTextHelper(this);
    mTextHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, paramInt);
    paramContext.applyCompoundDrawablesTints();
    mTextClassifierHelper = new AppCompatTextClassifierHelper(this);
    getEmojiTextViewHelper().loadFromAttributes(paramAttributeSet, paramInt);
  }
  
  private void consumeTextFutureAndSetBlocking()
  {
    Future localFuture = mPrecomputedTextFuture;
    if (localFuture != null) {}
    try
    {
      mPrecomputedTextFuture = null;
      TextViewCompat.setPrecomputedText(this, (PrecomputedTextCompat)localFuture.get());
      return;
    }
    catch (InterruptedException|ExecutionException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  @NonNull
  private AppCompatEmojiTextHelper getEmojiTextViewHelper()
  {
    if (mEmojiTextViewHelper == null) {
      mEmojiTextViewHelper = new AppCompatEmojiTextHelper(this);
    }
    return mEmojiTextViewHelper;
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = mBackgroundTintHelper;
    if (localObject != null) {
      ((AppCompatBackgroundHelper)localObject).applySupportBackgroundTint();
    }
    localObject = mTextHelper;
    if (localObject != null) {
      ((AppCompatTextHelper)localObject).applyCompoundDrawablesTints();
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getAutoSizeMaxTextSize()
  {
    if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
      return super.getAutoSizeMaxTextSize();
    }
    AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
    if (localAppCompatTextHelper != null) {
      return localAppCompatTextHelper.getAutoSizeMaxTextSize();
    }
    return -1;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getAutoSizeMinTextSize()
  {
    if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
      return super.getAutoSizeMinTextSize();
    }
    AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
    if (localAppCompatTextHelper != null) {
      return localAppCompatTextHelper.getAutoSizeMinTextSize();
    }
    return -1;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getAutoSizeStepGranularity()
  {
    if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
      return super.getAutoSizeStepGranularity();
    }
    AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
    if (localAppCompatTextHelper != null) {
      return localAppCompatTextHelper.getAutoSizeStepGranularity();
    }
    return -1;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int[] getAutoSizeTextAvailableSizes()
  {
    if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
      return super.getAutoSizeTextAvailableSizes();
    }
    AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
    if (localAppCompatTextHelper != null) {
      return localAppCompatTextHelper.getAutoSizeTextAvailableSizes();
    }
    return new int[0];
  }
  
  @SuppressLint({"WrongConstant"})
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getAutoSizeTextType()
  {
    boolean bool = AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE;
    int i = 0;
    if (bool)
    {
      if (super.getAutoSizeTextType() == 1) {
        i = 1;
      }
      return i;
    }
    AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
    if (localAppCompatTextHelper != null) {
      return localAppCompatTextHelper.getAutoSizeTextType();
    }
    return 0;
  }
  
  @Nullable
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
  }
  
  public int getFirstBaselineToTopHeight()
  {
    return TextViewCompat.getFirstBaselineToTopHeight(this);
  }
  
  public int getLastBaselineToBottomHeight()
  {
    return TextViewCompat.getLastBaselineToBottomHeight(this);
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = mBackgroundTintHelper;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintList();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = mBackgroundTintHelper;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintMode();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public ColorStateList getSupportCompoundDrawablesTintList()
  {
    return mTextHelper.getCompoundDrawableTintList();
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return mTextHelper.getCompoundDrawableTintMode();
  }
  
  public CharSequence getText()
  {
    consumeTextFutureAndSetBlocking();
    return super.getText();
  }
  
  @NonNull
  @RequiresApi(api=26)
  public TextClassifier getTextClassifier()
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      AppCompatTextClassifierHelper localAppCompatTextClassifierHelper = mTextClassifierHelper;
      if (localAppCompatTextClassifierHelper != null) {
        return localAppCompatTextClassifierHelper.getTextClassifier();
      }
    }
    return super.getTextClassifier();
  }
  
  @NonNull
  public PrecomputedTextCompat.Params getTextMetricsParamsCompat()
  {
    return TextViewCompat.getTextMetricsParams(this);
  }
  
  public boolean isEmojiCompatEnabled()
  {
    return getEmojiTextViewHelper().isEnabled();
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    mTextHelper.populateSurroundingTextIfNeeded(this, localInputConnection, paramEditorInfo);
    return AppCompatHintHelper.onCreateInputConnection(localInputConnection, paramEditorInfo, this);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
    if (localAppCompatTextHelper != null) {
      localAppCompatTextHelper.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    consumeTextFutureAndSetBlocking();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    paramCharSequence = mTextHelper;
    if ((paramCharSequence != null) && (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) && (paramCharSequence.isAutoSizeEnabled())) {
      mTextHelper.autoSizeText();
    }
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().setAllCaps(paramBoolean);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws IllegalArgumentException
  {
    if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE)
    {
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    else
    {
      AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
      if (localAppCompatTextHelper != null) {
        localAppCompatTextHelper.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] paramArrayOfInt, int paramInt)
    throws IllegalArgumentException
  {
    if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE)
    {
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
    }
    else
    {
      AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
      if (localAppCompatTextHelper != null) {
        localAppCompatTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
      }
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE)
    {
      super.setAutoSizeTextTypeWithDefaults(paramInt);
    }
    else
    {
      AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
      if (localAppCompatTextHelper != null) {
        localAppCompatTextHelper.setAutoSizeTextTypeWithDefaults(paramInt);
      }
    }
  }
  
  public void setBackgroundDrawable(@Nullable Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.onSetBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setBackgroundResource(@DrawableRes int paramInt)
  {
    super.setBackgroundResource(paramInt);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.onSetBackgroundResource(paramInt);
    }
  }
  
  public void setCompoundDrawables(@Nullable Drawable paramDrawable1, @Nullable Drawable paramDrawable2, @Nullable Drawable paramDrawable3, @Nullable Drawable paramDrawable4)
  {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = mTextHelper;
    if (paramDrawable1 != null) {
      paramDrawable1.onSetCompoundDrawables();
    }
  }
  
  @RequiresApi(17)
  public void setCompoundDrawablesRelative(@Nullable Drawable paramDrawable1, @Nullable Drawable paramDrawable2, @Nullable Drawable paramDrawable3, @Nullable Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = mTextHelper;
    if (paramDrawable1 != null) {
      paramDrawable1.onSetCompoundDrawables();
    }
  }
  
  @RequiresApi(17)
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Context localContext = getContext();
    Drawable localDrawable1 = null;
    if (paramInt1 != 0) {
      localObject = AppCompatResources.getDrawable(localContext, paramInt1);
    } else {
      localObject = null;
    }
    Drawable localDrawable2;
    if (paramInt2 != 0) {
      localDrawable2 = AppCompatResources.getDrawable(localContext, paramInt2);
    } else {
      localDrawable2 = null;
    }
    Drawable localDrawable3;
    if (paramInt3 != 0) {
      localDrawable3 = AppCompatResources.getDrawable(localContext, paramInt3);
    } else {
      localDrawable3 = null;
    }
    if (paramInt4 != 0) {
      localDrawable1 = AppCompatResources.getDrawable(localContext, paramInt4);
    }
    setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)localObject, localDrawable2, localDrawable3, localDrawable1);
    Object localObject = mTextHelper;
    if (localObject != null) {
      ((AppCompatTextHelper)localObject).onSetCompoundDrawables();
    }
  }
  
  @RequiresApi(17)
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable paramDrawable1, @Nullable Drawable paramDrawable2, @Nullable Drawable paramDrawable3, @Nullable Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = mTextHelper;
    if (paramDrawable1 != null) {
      paramDrawable1.onSetCompoundDrawables();
    }
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Context localContext = getContext();
    Drawable localDrawable1 = null;
    if (paramInt1 != 0) {
      localObject = AppCompatResources.getDrawable(localContext, paramInt1);
    } else {
      localObject = null;
    }
    Drawable localDrawable2;
    if (paramInt2 != 0) {
      localDrawable2 = AppCompatResources.getDrawable(localContext, paramInt2);
    } else {
      localDrawable2 = null;
    }
    Drawable localDrawable3;
    if (paramInt3 != 0) {
      localDrawable3 = AppCompatResources.getDrawable(localContext, paramInt3);
    } else {
      localDrawable3 = null;
    }
    if (paramInt4 != 0) {
      localDrawable1 = AppCompatResources.getDrawable(localContext, paramInt4);
    }
    setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject, localDrawable2, localDrawable3, localDrawable1);
    Object localObject = mTextHelper;
    if (localObject != null) {
      ((AppCompatTextHelper)localObject).onSetCompoundDrawables();
    }
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable paramDrawable1, @Nullable Drawable paramDrawable2, @Nullable Drawable paramDrawable3, @Nullable Drawable paramDrawable4)
  {
    super.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = mTextHelper;
    if (paramDrawable1 != null) {
      paramDrawable1.onSetCompoundDrawables();
    }
  }
  
  public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, paramCallback));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().setEnabled(paramBoolean);
  }
  
  public void setFilters(@NonNull InputFilter[] paramArrayOfInputFilter)
  {
    super.setFilters(getEmojiTextViewHelper().getFilters(paramArrayOfInputFilter));
  }
  
  public void setFirstBaselineToTopHeight(@IntRange(from=0L) @Px int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      super.setFirstBaselineToTopHeight(paramInt);
    } else {
      TextViewCompat.setFirstBaselineToTopHeight(this, paramInt);
    }
  }
  
  public void setLastBaselineToBottomHeight(@IntRange(from=0L) @Px int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      super.setLastBaselineToBottomHeight(paramInt);
    } else {
      TextViewCompat.setLastBaselineToBottomHeight(this, paramInt);
    }
  }
  
  public void setLineHeight(@IntRange(from=0L) @Px int paramInt)
  {
    TextViewCompat.setLineHeight(this, paramInt);
  }
  
  public void setPrecomputedText(@NonNull PrecomputedTextCompat paramPrecomputedTextCompat)
  {
    TextViewCompat.setPrecomputedText(this, paramPrecomputedTextCompat);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setSupportBackgroundTintList(@Nullable ColorStateList paramColorStateList)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList paramColorStateList)
  {
    mTextHelper.setCompoundDrawableTintList(paramColorStateList);
    mTextHelper.applyCompoundDrawablesTints();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    mTextHelper.setCompoundDrawableTintMode(paramMode);
    mTextHelper.applyCompoundDrawablesTints();
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
    if (localAppCompatTextHelper != null) {
      localAppCompatTextHelper.onSetTextAppearance(paramContext, paramInt);
    }
  }
  
  @RequiresApi(api=26)
  public void setTextClassifier(@Nullable TextClassifier paramTextClassifier)
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      AppCompatTextClassifierHelper localAppCompatTextClassifierHelper = mTextClassifierHelper;
      if (localAppCompatTextClassifierHelper != null)
      {
        localAppCompatTextClassifierHelper.setTextClassifier(paramTextClassifier);
        return;
      }
    }
    super.setTextClassifier(paramTextClassifier);
  }
  
  public void setTextFuture(@Nullable Future<PrecomputedTextCompat> paramFuture)
  {
    mPrecomputedTextFuture = paramFuture;
    if (paramFuture != null) {
      requestLayout();
    }
  }
  
  public void setTextMetricsParamsCompat(@NonNull PrecomputedTextCompat.Params paramParams)
  {
    TextViewCompat.setTextMetricsParams(this, paramParams);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE)
    {
      super.setTextSize(paramInt, paramFloat);
    }
    else
    {
      AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
      if (localAppCompatTextHelper != null) {
        localAppCompatTextHelper.setTextSize(paramInt, paramFloat);
      }
    }
  }
  
  public void setTypeface(@Nullable Typeface paramTypeface, int paramInt)
  {
    if (mIsSetTypefaceProcessing) {
      return;
    }
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramTypeface != null)
    {
      localObject2 = localObject1;
      if (paramInt > 0) {
        localObject2 = TypefaceCompat.create(getContext(), paramTypeface, paramInt);
      }
    }
    mIsSetTypefaceProcessing = true;
    if (localObject2 != null) {
      paramTypeface = (Typeface)localObject2;
    }
    try
    {
      super.setTypeface(paramTypeface, paramInt);
      return;
    }
    finally
    {
      mIsSetTypefaceProcessing = false;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */