package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatEditText
  extends EditText
  implements TintableBackgroundView, OnReceiveContentViewBehavior, EmojiCompatConfigurationView, TintableCompoundDrawablesView
{
  @NonNull
  private final AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private final TextViewOnReceiveContentListener mDefaultOnReceiveContentListener;
  private final AppCompatTextClassifierHelper mTextClassifierHelper;
  private final AppCompatTextHelper mTextHelper;
  
  public AppCompatEditText(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatEditText(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.editTextStyle);
  }
  
  public AppCompatEditText(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
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
    mDefaultOnReceiveContentListener = new TextViewOnReceiveContentListener();
    paramContext = new AppCompatEmojiEditTextHelper(this);
    mAppCompatEmojiEditTextHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, paramInt);
    initEmojiKeyListener(paramContext);
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
  
  @Nullable
  public Editable getText()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return super.getText();
    }
    return super.getEditableText();
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
  
  public void initEmojiKeyListener(AppCompatEmojiEditTextHelper paramAppCompatEmojiEditTextHelper)
  {
    KeyListener localKeyListener = getKeyListener();
    if (paramAppCompatEmojiEditTextHelper.isEmojiCapableKeyListener(localKeyListener))
    {
      boolean bool1 = super.isFocusable();
      boolean bool2 = super.isClickable();
      boolean bool3 = super.isLongClickable();
      int i = super.getInputType();
      paramAppCompatEmojiEditTextHelper = paramAppCompatEmojiEditTextHelper.getKeyListener(localKeyListener);
      if (paramAppCompatEmojiEditTextHelper == localKeyListener) {
        return;
      }
      super.setKeyListener(paramAppCompatEmojiEditTextHelper);
      super.setRawInputType(i);
      super.setFocusable(bool1);
      super.setClickable(bool2);
      super.setLongClickable(bool3);
    }
  }
  
  public boolean isEmojiCompatEnabled()
  {
    return mAppCompatEmojiEditTextHelper.isEnabled();
  }
  
  @Nullable
  public InputConnection onCreateInputConnection(@NonNull EditorInfo paramEditorInfo)
  {
    Object localObject = super.onCreateInputConnection(paramEditorInfo);
    mTextHelper.populateSurroundingTextIfNeeded(this, (InputConnection)localObject, paramEditorInfo);
    InputConnection localInputConnection = AppCompatHintHelper.onCreateInputConnection((InputConnection)localObject, paramEditorInfo, this);
    localObject = localInputConnection;
    if (localInputConnection != null)
    {
      localObject = localInputConnection;
      if (Build.VERSION.SDK_INT <= 30)
      {
        String[] arrayOfString = ViewCompat.getOnReceiveContentMimeTypes(this);
        localObject = localInputConnection;
        if (arrayOfString != null)
        {
          EditorInfoCompat.setContentMimeTypes(paramEditorInfo, arrayOfString);
          localObject = InputConnectionCompat.createWrapper(this, localInputConnection, paramEditorInfo);
        }
      }
    }
    return mAppCompatEmojiEditTextHelper.onCreateInputConnection((InputConnection)localObject, paramEditorInfo);
  }
  
  public boolean onDragEvent(DragEvent paramDragEvent)
  {
    if (AppCompatReceiveContentHelper.maybeHandleDragEventViaPerformReceiveContent(this, paramDragEvent)) {
      return true;
    }
    return super.onDragEvent(paramDragEvent);
  }
  
  @Nullable
  public ContentInfoCompat onReceiveContent(@NonNull ContentInfoCompat paramContentInfoCompat)
  {
    return mDefaultOnReceiveContentListener.onReceiveContent(this, paramContentInfoCompat);
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    if (AppCompatReceiveContentHelper.maybeHandleMenuActionViaPerformReceiveContent(this, paramInt)) {
      return true;
    }
    return super.onTextContextMenuItem(paramInt);
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
  
  public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, paramCallback));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    mAppCompatEmojiEditTextHelper.setEnabled(paramBoolean);
  }
  
  public void setKeyListener(@Nullable KeyListener paramKeyListener)
  {
    super.setKeyListener(mAppCompatEmojiEditTextHelper.getKeyListener(paramKeyListener));
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
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatEditText
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */