package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatCheckedTextView
  extends CheckedTextView
  implements TintableCheckedTextView, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView
{
  @NonNull
  private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private final AppCompatCheckedTextViewHelper mCheckedHelper;
  private final AppCompatTextHelper mTextHelper;
  
  public AppCompatCheckedTextView(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatCheckedTextView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.checkedTextViewStyle);
  }
  
  public AppCompatCheckedTextView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(TintContextWrapper.wrap(paramContext), paramAttributeSet, paramInt);
    ThemeUtils.checkAppCompatTheme(this, getContext());
    paramContext = new AppCompatTextHelper(this);
    mTextHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, paramInt);
    paramContext.applyCompoundDrawablesTints();
    paramContext = new AppCompatBackgroundHelper(this);
    mBackgroundTintHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, paramInt);
    paramContext = new AppCompatCheckedTextViewHelper(this);
    mCheckedHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, paramInt);
    getEmojiTextViewHelper().loadFromAttributes(paramAttributeSet, paramInt);
  }
  
  @NonNull
  private AppCompatEmojiTextHelper getEmojiTextViewHelper()
  {
    if (mAppCompatEmojiTextHelper == null) {
      mAppCompatEmojiTextHelper = new AppCompatEmojiTextHelper(this);
    }
    return mAppCompatEmojiTextHelper;
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = mTextHelper;
    if (localObject != null) {
      ((AppCompatTextHelper)localObject).applyCompoundDrawablesTints();
    }
    localObject = mBackgroundTintHelper;
    if (localObject != null) {
      ((AppCompatBackgroundHelper)localObject).applySupportBackgroundTint();
    }
    localObject = mCheckedHelper;
    if (localObject != null) {
      ((AppCompatCheckedTextViewHelper)localObject).applyCheckMarkTint();
    }
  }
  
  @Nullable
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
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
  public ColorStateList getSupportCheckMarkTintList()
  {
    Object localObject = mCheckedHelper;
    if (localObject != null) {
      localObject = ((AppCompatCheckedTextViewHelper)localObject).getSupportCheckMarkTintList();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public PorterDuff.Mode getSupportCheckMarkTintMode()
  {
    Object localObject = mCheckedHelper;
    if (localObject != null) {
      localObject = ((AppCompatCheckedTextViewHelper)localObject).getSupportCheckMarkTintMode();
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
  
  public boolean isEmojiCompatEnabled()
  {
    return getEmojiTextViewHelper().isEnabled();
  }
  
  @Nullable
  public InputConnection onCreateInputConnection(@NonNull EditorInfo paramEditorInfo)
  {
    return AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, this);
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().setAllCaps(paramBoolean);
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
  
  public void setCheckMarkDrawable(@DrawableRes int paramInt)
  {
    setCheckMarkDrawable(AppCompatResources.getDrawable(getContext(), paramInt));
  }
  
  public void setCheckMarkDrawable(@Nullable Drawable paramDrawable)
  {
    super.setCheckMarkDrawable(paramDrawable);
    paramDrawable = mCheckedHelper;
    if (paramDrawable != null) {
      paramDrawable.onSetCheckMarkDrawable();
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
  
  public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, paramCallback));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().setEnabled(paramBoolean);
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
  public void setSupportCheckMarkTintList(@Nullable ColorStateList paramColorStateList)
  {
    AppCompatCheckedTextViewHelper localAppCompatCheckedTextViewHelper = mCheckedHelper;
    if (localAppCompatCheckedTextViewHelper != null) {
      localAppCompatCheckedTextViewHelper.setSupportCheckMarkTintList(paramColorStateList);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    AppCompatCheckedTextViewHelper localAppCompatCheckedTextViewHelper = mCheckedHelper;
    if (localAppCompatCheckedTextViewHelper != null) {
      localAppCompatCheckedTextViewHelper.setSupportCheckMarkTintMode(paramMode);
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
  
  public void setTextAppearance(@NonNull Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    AppCompatTextHelper localAppCompatTextHelper = mTextHelper;
    if (localAppCompatTextHelper != null) {
      localAppCompatTextHelper.onSetTextAppearance(paramContext, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatCheckedTextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */