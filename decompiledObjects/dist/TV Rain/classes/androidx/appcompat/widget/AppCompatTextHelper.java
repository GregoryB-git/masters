package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import b;
import c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Locale;

class AppCompatTextHelper
{
  private static final int MONOSPACE = 3;
  private static final int SANS = 1;
  private static final int SERIF = 2;
  private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
  private boolean mAsyncFontPending;
  @NonNull
  private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
  private TintInfo mDrawableBottomTint;
  private TintInfo mDrawableEndTint;
  private TintInfo mDrawableLeftTint;
  private TintInfo mDrawableRightTint;
  private TintInfo mDrawableStartTint;
  private TintInfo mDrawableTint;
  private TintInfo mDrawableTopTint;
  private Typeface mFontTypeface;
  private int mFontWeight = -1;
  private int mStyle = 0;
  @NonNull
  private final TextView mView;
  
  public AppCompatTextHelper(@NonNull TextView paramTextView)
  {
    mView = paramTextView;
    mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(paramTextView);
  }
  
  private void applyCompoundDrawableTint(Drawable paramDrawable, TintInfo paramTintInfo)
  {
    if ((paramDrawable != null) && (paramTintInfo != null)) {
      AppCompatDrawableManager.tintDrawable(paramDrawable, paramTintInfo, mView.getDrawableState());
    }
  }
  
  private static TintInfo createTintInfo(Context paramContext, AppCompatDrawableManager paramAppCompatDrawableManager, int paramInt)
  {
    paramContext = paramAppCompatDrawableManager.getTintList(paramContext, paramInt);
    if (paramContext != null)
    {
      paramAppCompatDrawableManager = new TintInfo();
      mHasTintList = true;
      mTintList = paramContext;
      return paramAppCompatDrawableManager;
    }
    return null;
  }
  
  private void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4, Drawable paramDrawable5, Drawable paramDrawable6)
  {
    if ((paramDrawable5 == null) && (paramDrawable6 == null))
    {
      if ((paramDrawable1 != null) || (paramDrawable2 != null) || (paramDrawable3 != null) || (paramDrawable4 != null))
      {
        paramDrawable6 = Api17Impl.getCompoundDrawablesRelative(mView);
        paramDrawable5 = paramDrawable6[0];
        if ((paramDrawable5 == null) && (paramDrawable6[2] == null))
        {
          paramDrawable6 = mView.getCompoundDrawables();
          paramDrawable5 = mView;
          if (paramDrawable1 == null) {
            paramDrawable1 = paramDrawable6[0];
          }
          if (paramDrawable2 == null) {
            paramDrawable2 = paramDrawable6[1];
          }
          if (paramDrawable3 == null) {
            paramDrawable3 = paramDrawable6[2];
          }
          if (paramDrawable4 == null) {
            paramDrawable4 = paramDrawable6[3];
          }
          paramDrawable5.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
        }
        else
        {
          paramDrawable1 = mView;
          if (paramDrawable2 == null) {
            paramDrawable2 = paramDrawable6[1];
          }
          paramDrawable3 = paramDrawable6[2];
          if (paramDrawable4 == null) {
            paramDrawable4 = paramDrawable6[3];
          }
          Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable5, paramDrawable2, paramDrawable3, paramDrawable4);
        }
      }
    }
    else
    {
      paramDrawable3 = Api17Impl.getCompoundDrawablesRelative(mView);
      paramDrawable1 = mView;
      if (paramDrawable5 == null) {
        paramDrawable5 = paramDrawable3[0];
      }
      if (paramDrawable2 == null) {
        paramDrawable2 = paramDrawable3[1];
      }
      if (paramDrawable6 == null) {
        paramDrawable6 = paramDrawable3[2];
      }
      if (paramDrawable4 == null) {
        paramDrawable4 = paramDrawable3[3];
      }
      Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable5, paramDrawable2, paramDrawable6, paramDrawable4);
    }
  }
  
  private void setCompoundTints()
  {
    TintInfo localTintInfo = mDrawableTint;
    mDrawableLeftTint = localTintInfo;
    mDrawableTopTint = localTintInfo;
    mDrawableRightTint = localTintInfo;
    mDrawableBottomTint = localTintInfo;
    mDrawableStartTint = localTintInfo;
    mDrawableEndTint = localTintInfo;
  }
  
  private void setTextSizeInternal(int paramInt, float paramFloat)
  {
    mAutoSizeTextHelper.setTextSizeInternal(paramInt, paramFloat);
  }
  
  private void updateTypefaceAndStyle(Context paramContext, TintTypedArray paramTintTypedArray)
  {
    mStyle = paramTintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, mStyle);
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    if (i >= 28)
    {
      j = paramTintTypedArray.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
      mFontWeight = j;
      if (j != -1) {
        mStyle = (mStyle & 0x2 | 0x0);
      }
    }
    int j = R.styleable.TextAppearance_android_fontFamily;
    if ((!paramTintTypedArray.hasValue(j)) && (!paramTintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)))
    {
      j = R.styleable.TextAppearance_android_typeface;
      if (paramTintTypedArray.hasValue(j))
      {
        mAsyncFontPending = false;
        j = paramTintTypedArray.getInt(j, 1);
        if (j != 1)
        {
          if (j != 2)
          {
            if (j == 3) {
              mFontTypeface = Typeface.MONOSPACE;
            }
          }
          else {
            mFontTypeface = Typeface.SERIF;
          }
        }
        else {
          mFontTypeface = Typeface.SANS_SERIF;
        }
      }
      return;
    }
    mFontTypeface = null;
    final int k = R.styleable.TextAppearance_fontFamily;
    if (paramTintTypedArray.hasValue(k)) {
      j = k;
    }
    final int m = mFontWeight;
    k = mStyle;
    if (!paramContext.isRestricted()) {
      paramContext = new ResourcesCompat.FontCallback()
      {
        public void onFontRetrievalFailed(int paramAnonymousInt) {}
        
        public void onFontRetrieved(@NonNull Typeface paramAnonymousTypeface)
        {
          Typeface localTypeface = paramAnonymousTypeface;
          if (Build.VERSION.SDK_INT >= 28)
          {
            int i = m;
            localTypeface = paramAnonymousTypeface;
            if (i != -1)
            {
              boolean bool;
              if ((k & 0x2) != 0) {
                bool = true;
              } else {
                bool = false;
              }
              localTypeface = AppCompatTextHelper.Api28Impl.create(paramAnonymousTypeface, i, bool);
            }
          }
          onAsyncTypefaceReceived(val$textViewWeak, localTypeface);
        }
      };
    }
    try
    {
      paramContext = paramTintTypedArray.getFont(j, mStyle, paramContext);
      if (paramContext != null) {
        if ((i >= 28) && (mFontWeight != -1))
        {
          paramContext = Typeface.create(paramContext, 0);
          k = mFontWeight;
          if ((mStyle & 0x2) != 0) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          mFontTypeface = Api28Impl.create(paramContext, k, bool2);
        }
        else
        {
          mFontTypeface = paramContext;
        }
      }
      if (mFontTypeface == null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      mAsyncFontPending = bool2;
    }
    catch (UnsupportedOperationException|Resources.NotFoundException paramContext)
    {
      boolean bool2;
      for (;;) {}
    }
    if (mFontTypeface == null)
    {
      paramContext = paramTintTypedArray.getString(j);
      if (paramContext != null) {
        if ((Build.VERSION.SDK_INT >= 28) && (mFontWeight != -1))
        {
          paramContext = Typeface.create(paramContext, 0);
          j = mFontWeight;
          bool2 = bool1;
          if ((mStyle & 0x2) != 0) {
            bool2 = true;
          }
          mFontTypeface = Api28Impl.create(paramContext, j, bool2);
        }
        else
        {
          mFontTypeface = Typeface.create(paramContext, mStyle);
        }
      }
    }
  }
  
  public void applyCompoundDrawablesTints()
  {
    Drawable[] arrayOfDrawable;
    if ((mDrawableLeftTint != null) || (mDrawableTopTint != null) || (mDrawableRightTint != null) || (mDrawableBottomTint != null))
    {
      arrayOfDrawable = mView.getCompoundDrawables();
      applyCompoundDrawableTint(arrayOfDrawable[0], mDrawableLeftTint);
      applyCompoundDrawableTint(arrayOfDrawable[1], mDrawableTopTint);
      applyCompoundDrawableTint(arrayOfDrawable[2], mDrawableRightTint);
      applyCompoundDrawableTint(arrayOfDrawable[3], mDrawableBottomTint);
    }
    if ((mDrawableStartTint != null) || (mDrawableEndTint != null))
    {
      arrayOfDrawable = Api17Impl.getCompoundDrawablesRelative(mView);
      applyCompoundDrawableTint(arrayOfDrawable[0], mDrawableStartTint);
      applyCompoundDrawableTint(arrayOfDrawable[2], mDrawableEndTint);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void autoSizeText()
  {
    mAutoSizeTextHelper.autoSizeText();
  }
  
  public int getAutoSizeMaxTextSize()
  {
    return mAutoSizeTextHelper.getAutoSizeMaxTextSize();
  }
  
  public int getAutoSizeMinTextSize()
  {
    return mAutoSizeTextHelper.getAutoSizeMinTextSize();
  }
  
  public int getAutoSizeStepGranularity()
  {
    return mAutoSizeTextHelper.getAutoSizeStepGranularity();
  }
  
  public int[] getAutoSizeTextAvailableSizes()
  {
    return mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
  }
  
  public int getAutoSizeTextType()
  {
    return mAutoSizeTextHelper.getAutoSizeTextType();
  }
  
  @Nullable
  public ColorStateList getCompoundDrawableTintList()
  {
    Object localObject = mDrawableTint;
    if (localObject != null) {
      localObject = mTintList;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  @Nullable
  public PorterDuff.Mode getCompoundDrawableTintMode()
  {
    Object localObject = mDrawableTint;
    if (localObject != null) {
      localObject = mTintMode;
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean isAutoSizeEnabled()
  {
    return mAutoSizeTextHelper.isAutoSizeEnabled();
  }
  
  @SuppressLint({"NewApi"})
  public void loadFromAttributes(@Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = mView.getContext();
    AppCompatDrawableManager localAppCompatDrawableManager = AppCompatDrawableManager.get();
    Object localObject2 = R.styleable.AppCompatTextHelper;
    Object localObject3 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    Object localObject4 = mView;
    ViewCompat.saveAttributeDataForStyleable((View)localObject4, ((View)localObject4).getContext(), (int[])localObject2, paramAttributeSet, ((TintTypedArray)localObject3).getWrappedTypeArray(), paramInt, 0);
    int i = ((TintTypedArray)localObject3).getResourceId(R.styleable.AppCompatTextHelper_android_textAppearance, -1);
    int j = R.styleable.AppCompatTextHelper_android_drawableLeft;
    if (((TintTypedArray)localObject3).hasValue(j)) {
      mDrawableLeftTint = createTintInfo((Context)localObject1, localAppCompatDrawableManager, ((TintTypedArray)localObject3).getResourceId(j, 0));
    }
    j = R.styleable.AppCompatTextHelper_android_drawableTop;
    if (((TintTypedArray)localObject3).hasValue(j)) {
      mDrawableTopTint = createTintInfo((Context)localObject1, localAppCompatDrawableManager, ((TintTypedArray)localObject3).getResourceId(j, 0));
    }
    j = R.styleable.AppCompatTextHelper_android_drawableRight;
    if (((TintTypedArray)localObject3).hasValue(j)) {
      mDrawableRightTint = createTintInfo((Context)localObject1, localAppCompatDrawableManager, ((TintTypedArray)localObject3).getResourceId(j, 0));
    }
    j = R.styleable.AppCompatTextHelper_android_drawableBottom;
    if (((TintTypedArray)localObject3).hasValue(j)) {
      mDrawableBottomTint = createTintInfo((Context)localObject1, localAppCompatDrawableManager, ((TintTypedArray)localObject3).getResourceId(j, 0));
    }
    j = Build.VERSION.SDK_INT;
    int k = R.styleable.AppCompatTextHelper_android_drawableStart;
    if (((TintTypedArray)localObject3).hasValue(k)) {
      mDrawableStartTint = createTintInfo((Context)localObject1, localAppCompatDrawableManager, ((TintTypedArray)localObject3).getResourceId(k, 0));
    }
    k = R.styleable.AppCompatTextHelper_android_drawableEnd;
    if (((TintTypedArray)localObject3).hasValue(k)) {
      mDrawableEndTint = createTintInfo((Context)localObject1, localAppCompatDrawableManager, ((TintTypedArray)localObject3).getResourceId(k, 0));
    }
    ((TintTypedArray)localObject3).recycle();
    boolean bool1 = mView.getTransformationMethod() instanceof PasswordTransformationMethod;
    boolean bool2;
    int m;
    if (i != -1)
    {
      localObject2 = TintTypedArray.obtainStyledAttributes((Context)localObject1, i, R.styleable.TextAppearance);
      if (!bool1)
      {
        i = R.styleable.TextAppearance_textAllCaps;
        if (((TintTypedArray)localObject2).hasValue(i))
        {
          bool2 = ((TintTypedArray)localObject2).getBoolean(i, false);
          m = 1;
          break label346;
        }
      }
      bool2 = false;
      m = bool2;
      label346:
      updateTypefaceAndStyle((Context)localObject1, (TintTypedArray)localObject2);
      i = R.styleable.TextAppearance_textLocale;
      if (((TintTypedArray)localObject2).hasValue(i)) {
        localObject3 = ((TintTypedArray)localObject2).getString(i);
      } else {
        localObject3 = null;
      }
      if (j >= 26)
      {
        i = R.styleable.TextAppearance_fontVariationSettings;
        if (((TintTypedArray)localObject2).hasValue(i))
        {
          localObject4 = ((TintTypedArray)localObject2).getString(i);
          break label420;
        }
      }
      localObject4 = null;
      label420:
      ((TintTypedArray)localObject2).recycle();
    }
    else
    {
      bool2 = false;
      m = bool2;
      localObject4 = null;
      localObject3 = null;
    }
    Object localObject5 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, R.styleable.TextAppearance, paramInt, 0);
    if (!bool1)
    {
      i = R.styleable.TextAppearance_textAllCaps;
      if (((TintTypedArray)localObject5).hasValue(i))
      {
        bool2 = ((TintTypedArray)localObject5).getBoolean(i, false);
        m = 1;
      }
    }
    i = R.styleable.TextAppearance_textLocale;
    if (((TintTypedArray)localObject5).hasValue(i)) {
      localObject3 = ((TintTypedArray)localObject5).getString(i);
    }
    localObject2 = localObject4;
    if (j >= 26)
    {
      i = R.styleable.TextAppearance_fontVariationSettings;
      localObject2 = localObject4;
      if (((TintTypedArray)localObject5).hasValue(i)) {
        localObject2 = ((TintTypedArray)localObject5).getString(i);
      }
    }
    if (j >= 28)
    {
      j = R.styleable.TextAppearance_android_textSize;
      if ((((TintTypedArray)localObject5).hasValue(j)) && (((TintTypedArray)localObject5).getDimensionPixelSize(j, -1) == 0)) {
        mView.setTextSize(0, 0.0F);
      }
    }
    updateTypefaceAndStyle((Context)localObject1, (TintTypedArray)localObject5);
    ((TintTypedArray)localObject5).recycle();
    if ((!bool1) && (m != 0)) {
      setAllCaps(bool2);
    }
    localObject4 = mFontTypeface;
    if (localObject4 != null) {
      if (mFontWeight == -1) {
        mView.setTypeface((Typeface)localObject4, mStyle);
      } else {
        mView.setTypeface((Typeface)localObject4);
      }
    }
    if (localObject2 != null) {
      Api26Impl.setFontVariationSettings(mView, (String)localObject2);
    }
    if (localObject3 != null) {
      Api24Impl.setTextLocales(mView, Api24Impl.forLanguageTags((String)localObject3));
    }
    mAutoSizeTextHelper.loadFromAttributes(paramAttributeSet, paramInt);
    if ((AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) && (mAutoSizeTextHelper.getAutoSizeTextType() != 0))
    {
      localObject4 = mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
      if (localObject4.length > 0) {
        if (Api26Impl.getAutoSizeStepGranularity(mView) != -1.0F) {
          Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(mView, mAutoSizeTextHelper.getAutoSizeMinTextSize(), mAutoSizeTextHelper.getAutoSizeMaxTextSize(), mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
        } else {
          Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(mView, (int[])localObject4, 0);
        }
      }
    }
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, R.styleable.AppCompatTextView);
    paramInt = localTintTypedArray.getResourceId(R.styleable.AppCompatTextView_drawableLeftCompat, -1);
    if (paramInt != -1) {
      paramAttributeSet = localAppCompatDrawableManager.getDrawable((Context)localObject1, paramInt);
    } else {
      paramAttributeSet = null;
    }
    paramInt = localTintTypedArray.getResourceId(R.styleable.AppCompatTextView_drawableTopCompat, -1);
    if (paramInt != -1) {
      localObject4 = localAppCompatDrawableManager.getDrawable((Context)localObject1, paramInt);
    } else {
      localObject4 = null;
    }
    paramInt = localTintTypedArray.getResourceId(R.styleable.AppCompatTextView_drawableRightCompat, -1);
    if (paramInt != -1) {
      localObject3 = localAppCompatDrawableManager.getDrawable((Context)localObject1, paramInt);
    } else {
      localObject3 = null;
    }
    paramInt = localTintTypedArray.getResourceId(R.styleable.AppCompatTextView_drawableBottomCompat, -1);
    if (paramInt != -1) {
      localObject2 = localAppCompatDrawableManager.getDrawable((Context)localObject1, paramInt);
    } else {
      localObject2 = null;
    }
    paramInt = localTintTypedArray.getResourceId(R.styleable.AppCompatTextView_drawableStartCompat, -1);
    if (paramInt != -1) {
      localObject5 = localAppCompatDrawableManager.getDrawable((Context)localObject1, paramInt);
    } else {
      localObject5 = null;
    }
    paramInt = localTintTypedArray.getResourceId(R.styleable.AppCompatTextView_drawableEndCompat, -1);
    if (paramInt != -1) {
      localObject1 = localAppCompatDrawableManager.getDrawable((Context)localObject1, paramInt);
    } else {
      localObject1 = null;
    }
    setCompoundDrawables(paramAttributeSet, (Drawable)localObject4, (Drawable)localObject3, (Drawable)localObject2, (Drawable)localObject5, (Drawable)localObject1);
    paramInt = R.styleable.AppCompatTextView_drawableTint;
    if (localTintTypedArray.hasValue(paramInt))
    {
      paramAttributeSet = localTintTypedArray.getColorStateList(paramInt);
      TextViewCompat.setCompoundDrawableTintList(mView, paramAttributeSet);
    }
    paramInt = R.styleable.AppCompatTextView_drawableTintMode;
    if (localTintTypedArray.hasValue(paramInt))
    {
      paramAttributeSet = DrawableUtils.parseTintMode(localTintTypedArray.getInt(paramInt, -1), null);
      TextViewCompat.setCompoundDrawableTintMode(mView, paramAttributeSet);
    }
    i = localTintTypedArray.getDimensionPixelSize(R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
    paramInt = localTintTypedArray.getDimensionPixelSize(R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
    j = localTintTypedArray.getDimensionPixelSize(R.styleable.AppCompatTextView_lineHeight, -1);
    localTintTypedArray.recycle();
    if (i != -1) {
      TextViewCompat.setFirstBaselineToTopHeight(mView, i);
    }
    if (paramInt != -1) {
      TextViewCompat.setLastBaselineToBottomHeight(mView, paramInt);
    }
    if (j != -1) {
      TextViewCompat.setLineHeight(mView, j);
    }
  }
  
  public void onAsyncTypefaceReceived(final WeakReference<TextView> paramWeakReference, final Typeface paramTypeface)
  {
    if (mAsyncFontPending)
    {
      mFontTypeface = paramTypeface;
      paramWeakReference = (TextView)paramWeakReference.get();
      if (paramWeakReference != null) {
        if (ViewCompat.isAttachedToWindow(paramWeakReference)) {
          paramWeakReference.post(new Runnable()
          {
            public void run()
            {
              paramWeakReference.setTypeface(paramTypeface, val$style);
            }
          });
        } else {
          paramWeakReference.setTypeface(paramTypeface, mStyle);
        }
      }
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
      autoSizeText();
    }
  }
  
  public void onSetCompoundDrawables()
  {
    applyCompoundDrawablesTints();
  }
  
  public void onSetTextAppearance(Context paramContext, int paramInt)
  {
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, paramInt, R.styleable.TextAppearance);
    paramInt = R.styleable.TextAppearance_textAllCaps;
    if (localTintTypedArray.hasValue(paramInt)) {
      setAllCaps(localTintTypedArray.getBoolean(paramInt, false));
    }
    int i = Build.VERSION.SDK_INT;
    paramInt = R.styleable.TextAppearance_android_textSize;
    if ((localTintTypedArray.hasValue(paramInt)) && (localTintTypedArray.getDimensionPixelSize(paramInt, -1) == 0)) {
      mView.setTextSize(0, 0.0F);
    }
    updateTypefaceAndStyle(paramContext, localTintTypedArray);
    if (i >= 26)
    {
      paramInt = R.styleable.TextAppearance_fontVariationSettings;
      if (localTintTypedArray.hasValue(paramInt))
      {
        paramContext = localTintTypedArray.getString(paramInt);
        if (paramContext != null) {
          Api26Impl.setFontVariationSettings(mView, paramContext);
        }
      }
    }
    localTintTypedArray.recycle();
    paramContext = mFontTypeface;
    if (paramContext != null) {
      mView.setTypeface(paramContext, mStyle);
    }
  }
  
  public void populateSurroundingTextIfNeeded(@NonNull TextView paramTextView, @Nullable InputConnection paramInputConnection, @NonNull EditorInfo paramEditorInfo)
  {
    if ((Build.VERSION.SDK_INT < 30) && (paramInputConnection != null)) {
      EditorInfoCompat.setInitialSurroundingText(paramEditorInfo, paramTextView.getText());
    }
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    mView.setAllCaps(paramBoolean);
  }
  
  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws IllegalArgumentException
  {
    mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] paramArrayOfInt, int paramInt)
    throws IllegalArgumentException
  {
    mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(paramInt);
  }
  
  public void setCompoundDrawableTintList(@Nullable ColorStateList paramColorStateList)
  {
    if (mDrawableTint == null) {
      mDrawableTint = new TintInfo();
    }
    TintInfo localTintInfo = mDrawableTint;
    mTintList = paramColorStateList;
    boolean bool;
    if (paramColorStateList != null) {
      bool = true;
    } else {
      bool = false;
    }
    mHasTintList = bool;
    setCompoundTints();
  }
  
  public void setCompoundDrawableTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    if (mDrawableTint == null) {
      mDrawableTint = new TintInfo();
    }
    TintInfo localTintInfo = mDrawableTint;
    mTintMode = paramMode;
    boolean bool;
    if (paramMode != null) {
      bool = true;
    } else {
      bool = false;
    }
    mHasTintMode = bool;
    setCompoundTints();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setTextSize(int paramInt, float paramFloat)
  {
    if ((!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) && (!isAutoSizeEnabled())) {
      setTextSizeInternal(paramInt, paramFloat);
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
    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    }
    
    @DoNotInline
    public static void setTextLocale(TextView paramTextView, Locale paramLocale)
    {
      paramTextView.setTextLocale(paramLocale);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static Locale forLanguageTag(String paramString)
    {
      return Locale.forLanguageTag(paramString);
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static LocaleList forLanguageTags(String paramString)
    {
      return LocaleList.forLanguageTags(paramString);
    }
    
    @DoNotInline
    public static void setTextLocales(TextView paramTextView, LocaleList paramLocaleList)
    {
      paramTextView.setTextLocales(paramLocaleList);
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static int getAutoSizeStepGranularity(TextView paramTextView)
    {
      return b.g(paramTextView);
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
    public static boolean setFontVariationSettings(TextView paramTextView, String paramString)
    {
      return b.w(paramTextView, paramString);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static Typeface create(Typeface paramTypeface, int paramInt, boolean paramBoolean)
    {
      return c.d(paramTypeface, paramInt, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */