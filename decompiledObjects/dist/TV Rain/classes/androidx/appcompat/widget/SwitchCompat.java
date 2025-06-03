package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;

public class SwitchCompat
  extends CompoundButton
  implements EmojiCompatConfigurationView
{
  private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
  private static final int[] CHECKED_STATE_SET = { 16842912 };
  private static final int MONOSPACE = 3;
  private static final int SANS = 1;
  private static final int SERIF = 2;
  private static final int THUMB_ANIMATION_DURATION = 250;
  private static final Property<SwitchCompat, Float> THUMB_POS = new Property(Float.class, "thumbPos")
  {
    public Float get(SwitchCompat paramAnonymousSwitchCompat)
    {
      return Float.valueOf(mThumbPosition);
    }
    
    public void set(SwitchCompat paramAnonymousSwitchCompat, Float paramAnonymousFloat)
    {
      paramAnonymousSwitchCompat.setThumbPosition(paramAnonymousFloat.floatValue());
    }
  };
  private static final int TOUCH_MODE_DOWN = 1;
  private static final int TOUCH_MODE_DRAGGING = 2;
  private static final int TOUCH_MODE_IDLE = 0;
  @NonNull
  private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
  @Nullable
  private EmojiCompatInitCallback mEmojiCompatInitCallback;
  private boolean mEnforceSwitchWidth = true;
  private boolean mHasThumbTint = false;
  private boolean mHasThumbTintMode = false;
  private boolean mHasTrackTint = false;
  private boolean mHasTrackTintMode = false;
  private int mMinFlingVelocity;
  private Layout mOffLayout;
  private Layout mOnLayout;
  public ObjectAnimator mPositionAnimator;
  private boolean mShowText;
  private boolean mSplitTrack;
  private int mSwitchBottom;
  private int mSwitchHeight;
  private int mSwitchLeft;
  private int mSwitchMinWidth;
  private int mSwitchPadding;
  private int mSwitchRight;
  private int mSwitchTop;
  @Nullable
  private TransformationMethod mSwitchTransformationMethod;
  private int mSwitchWidth;
  private final Rect mTempRect = new Rect();
  private ColorStateList mTextColors;
  private final AppCompatTextHelper mTextHelper;
  private CharSequence mTextOff;
  private CharSequence mTextOffTransformed;
  private CharSequence mTextOn;
  private CharSequence mTextOnTransformed;
  private final TextPaint mTextPaint;
  private Drawable mThumbDrawable;
  public float mThumbPosition;
  private int mThumbTextPadding;
  private ColorStateList mThumbTintList = null;
  private PorterDuff.Mode mThumbTintMode = null;
  private int mThumbWidth;
  private int mTouchMode;
  private int mTouchSlop;
  private float mTouchX;
  private float mTouchY;
  private Drawable mTrackDrawable;
  private ColorStateList mTrackTintList = null;
  private PorterDuff.Mode mTrackTintMode = null;
  private VelocityTracker mVelocityTracker = VelocityTracker.obtain();
  
  public SwitchCompat(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwitchCompat(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.switchStyle);
  }
  
  public SwitchCompat(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ThemeUtils.checkAppCompatTheme(this, getContext());
    Object localObject1 = new TextPaint(1);
    mTextPaint = ((TextPaint)localObject1);
    density = getResourcesgetDisplayMetricsdensity;
    Object localObject2 = R.styleable.SwitchCompat;
    localObject1 = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject2, paramInt, 0);
    ViewCompat.saveAttributeDataForStyleable(this, paramContext, (int[])localObject2, paramAttributeSet, ((TintTypedArray)localObject1).getWrappedTypeArray(), paramInt, 0);
    localObject2 = ((TintTypedArray)localObject1).getDrawable(R.styleable.SwitchCompat_android_thumb);
    mThumbDrawable = ((Drawable)localObject2);
    if (localObject2 != null) {
      ((Drawable)localObject2).setCallback(this);
    }
    localObject2 = ((TintTypedArray)localObject1).getDrawable(R.styleable.SwitchCompat_track);
    mTrackDrawable = ((Drawable)localObject2);
    if (localObject2 != null) {
      ((Drawable)localObject2).setCallback(this);
    }
    setTextOnInternal(((TintTypedArray)localObject1).getText(R.styleable.SwitchCompat_android_textOn));
    setTextOffInternal(((TintTypedArray)localObject1).getText(R.styleable.SwitchCompat_android_textOff));
    mShowText = ((TintTypedArray)localObject1).getBoolean(R.styleable.SwitchCompat_showText, true);
    mThumbTextPadding = ((TintTypedArray)localObject1).getDimensionPixelSize(R.styleable.SwitchCompat_thumbTextPadding, 0);
    mSwitchMinWidth = ((TintTypedArray)localObject1).getDimensionPixelSize(R.styleable.SwitchCompat_switchMinWidth, 0);
    mSwitchPadding = ((TintTypedArray)localObject1).getDimensionPixelSize(R.styleable.SwitchCompat_switchPadding, 0);
    mSplitTrack = ((TintTypedArray)localObject1).getBoolean(R.styleable.SwitchCompat_splitTrack, false);
    localObject2 = ((TintTypedArray)localObject1).getColorStateList(R.styleable.SwitchCompat_thumbTint);
    if (localObject2 != null)
    {
      mThumbTintList = ((ColorStateList)localObject2);
      mHasThumbTint = true;
    }
    localObject2 = DrawableUtils.parseTintMode(((TintTypedArray)localObject1).getInt(R.styleable.SwitchCompat_thumbTintMode, -1), null);
    if (mThumbTintMode != localObject2)
    {
      mThumbTintMode = ((PorterDuff.Mode)localObject2);
      mHasThumbTintMode = true;
    }
    if ((mHasThumbTint) || (mHasThumbTintMode)) {
      applyThumbTint();
    }
    localObject2 = ((TintTypedArray)localObject1).getColorStateList(R.styleable.SwitchCompat_trackTint);
    if (localObject2 != null)
    {
      mTrackTintList = ((ColorStateList)localObject2);
      mHasTrackTint = true;
    }
    localObject2 = DrawableUtils.parseTintMode(((TintTypedArray)localObject1).getInt(R.styleable.SwitchCompat_trackTintMode, -1), null);
    if (mTrackTintMode != localObject2)
    {
      mTrackTintMode = ((PorterDuff.Mode)localObject2);
      mHasTrackTintMode = true;
    }
    if ((mHasTrackTint) || (mHasTrackTintMode)) {
      applyTrackTint();
    }
    int i = ((TintTypedArray)localObject1).getResourceId(R.styleable.SwitchCompat_switchTextAppearance, 0);
    if (i != 0) {
      setSwitchTextAppearance(paramContext, i);
    }
    localObject2 = new AppCompatTextHelper(this);
    mTextHelper = ((AppCompatTextHelper)localObject2);
    ((AppCompatTextHelper)localObject2).loadFromAttributes(paramAttributeSet, paramInt);
    ((TintTypedArray)localObject1).recycle();
    paramContext = ViewConfiguration.get(paramContext);
    mTouchSlop = paramContext.getScaledTouchSlop();
    mMinFlingVelocity = paramContext.getScaledMinimumFlingVelocity();
    getEmojiTextViewHelper().loadFromAttributes(paramAttributeSet, paramInt);
    refreshDrawableState();
    setChecked(isChecked());
  }
  
  private void animateThumbToCheckedState(boolean paramBoolean)
  {
    float f;
    if (paramBoolean) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this, THUMB_POS, new float[] { f });
    mPositionAnimator = localObjectAnimator;
    localObjectAnimator.setDuration(250L);
    Api18Impl.setAutoCancel(mPositionAnimator, true);
    mPositionAnimator.start();
  }
  
  private void applyThumbTint()
  {
    Drawable localDrawable = mThumbDrawable;
    if ((localDrawable != null) && ((mHasThumbTint) || (mHasThumbTintMode)))
    {
      localDrawable = DrawableCompat.wrap(localDrawable).mutate();
      mThumbDrawable = localDrawable;
      if (mHasThumbTint) {
        DrawableCompat.setTintList(localDrawable, mThumbTintList);
      }
      if (mHasThumbTintMode) {
        DrawableCompat.setTintMode(mThumbDrawable, mThumbTintMode);
      }
      if (mThumbDrawable.isStateful()) {
        mThumbDrawable.setState(getDrawableState());
      }
    }
  }
  
  private void applyTrackTint()
  {
    Drawable localDrawable = mTrackDrawable;
    if ((localDrawable != null) && ((mHasTrackTint) || (mHasTrackTintMode)))
    {
      localDrawable = DrawableCompat.wrap(localDrawable).mutate();
      mTrackDrawable = localDrawable;
      if (mHasTrackTint) {
        DrawableCompat.setTintList(localDrawable, mTrackTintList);
      }
      if (mHasTrackTintMode) {
        DrawableCompat.setTintMode(mTrackDrawable, mTrackTintMode);
      }
      if (mTrackDrawable.isStateful()) {
        mTrackDrawable.setState(getDrawableState());
      }
    }
  }
  
  private void cancelPositionAnimator()
  {
    ObjectAnimator localObjectAnimator = mPositionAnimator;
    if (localObjectAnimator != null) {
      localObjectAnimator.cancel();
    }
  }
  
  private void cancelSuperTouch(MotionEvent paramMotionEvent)
  {
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(3);
    super.onTouchEvent(paramMotionEvent);
    paramMotionEvent.recycle();
  }
  
  private static float constrain(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 >= paramFloat2)
    {
      paramFloat2 = paramFloat1;
      if (paramFloat1 > paramFloat3) {
        paramFloat2 = paramFloat3;
      }
    }
    return paramFloat2;
  }
  
  @Nullable
  private CharSequence doTransformForOnOffText(@Nullable CharSequence paramCharSequence)
  {
    TransformationMethod localTransformationMethod = getEmojiTextViewHelper().wrapTransformationMethod(mSwitchTransformationMethod);
    CharSequence localCharSequence = paramCharSequence;
    if (localTransformationMethod != null) {
      localCharSequence = localTransformationMethod.getTransformation(paramCharSequence, this);
    }
    return localCharSequence;
  }
  
  @NonNull
  private AppCompatEmojiTextHelper getEmojiTextViewHelper()
  {
    if (mAppCompatEmojiTextHelper == null) {
      mAppCompatEmojiTextHelper = new AppCompatEmojiTextHelper(this);
    }
    return mAppCompatEmojiTextHelper;
  }
  
  private boolean getTargetCheckedState()
  {
    boolean bool;
    if (mThumbPosition > 0.5F) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private int getThumbOffset()
  {
    float f;
    if (ViewUtils.isLayoutRtl(this)) {
      f = 1.0F - mThumbPosition;
    } else {
      f = mThumbPosition;
    }
    return (int)(f * getThumbScrollRange() + 0.5F);
  }
  
  private int getThumbScrollRange()
  {
    Object localObject = mTrackDrawable;
    if (localObject != null)
    {
      Rect localRect = mTempRect;
      ((Drawable)localObject).getPadding(localRect);
      localObject = mThumbDrawable;
      if (localObject != null) {
        localObject = DrawableUtils.getOpticalBounds((Drawable)localObject);
      } else {
        localObject = DrawableUtils.INSETS_NONE;
      }
      return mSwitchWidth - mThumbWidth - left - right - left - right;
    }
    return 0;
  }
  
  private boolean hitThumb(float paramFloat1, float paramFloat2)
  {
    Object localObject = mThumbDrawable;
    boolean bool1 = false;
    if (localObject == null) {
      return false;
    }
    int i = getThumbOffset();
    mThumbDrawable.getPadding(mTempRect);
    int j = mSwitchTop;
    int k = mTouchSlop;
    int m = mSwitchLeft + i - k;
    int n = mThumbWidth;
    localObject = mTempRect;
    i = left;
    int i1 = right;
    int i2 = mSwitchBottom;
    boolean bool2 = bool1;
    if (paramFloat1 > m)
    {
      bool2 = bool1;
      if (paramFloat1 < n + m + i + i1 + k)
      {
        bool2 = bool1;
        if (paramFloat2 > j - k)
        {
          bool2 = bool1;
          if (paramFloat2 < i2 + k) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  private Layout makeLayout(CharSequence paramCharSequence)
  {
    TextPaint localTextPaint = mTextPaint;
    int i;
    if (paramCharSequence != null) {
      i = (int)Math.ceil(Layout.getDesiredWidth(paramCharSequence, localTextPaint));
    } else {
      i = 0;
    }
    return new StaticLayout(paramCharSequence, localTextPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
  }
  
  private void setOffStateDescriptionOnRAndAbove()
  {
    if (Build.VERSION.SDK_INT >= 30)
    {
      CharSequence localCharSequence = mTextOff;
      Object localObject = localCharSequence;
      if (localCharSequence == null) {
        localObject = getResources().getString(R.string.abc_capital_off);
      }
      ViewCompat.setStateDescription(this, (CharSequence)localObject);
    }
  }
  
  private void setOnStateDescriptionOnRAndAbove()
  {
    if (Build.VERSION.SDK_INT >= 30)
    {
      CharSequence localCharSequence = mTextOn;
      Object localObject = localCharSequence;
      if (localCharSequence == null) {
        localObject = getResources().getString(R.string.abc_capital_on);
      }
      ViewCompat.setStateDescription(this, (CharSequence)localObject);
    }
  }
  
  private void setSwitchTypefaceByIndex(int paramInt1, int paramInt2)
  {
    Typeface localTypeface;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          localTypeface = null;
        } else {
          localTypeface = Typeface.MONOSPACE;
        }
      }
      else {
        localTypeface = Typeface.SERIF;
      }
    }
    else {
      localTypeface = Typeface.SANS_SERIF;
    }
    setSwitchTypeface(localTypeface, paramInt2);
  }
  
  private void setTextOffInternal(CharSequence paramCharSequence)
  {
    mTextOff = paramCharSequence;
    mTextOffTransformed = doTransformForOnOffText(paramCharSequence);
    mOffLayout = null;
    if (mShowText) {
      setupEmojiCompatLoadCallback();
    }
  }
  
  private void setTextOnInternal(CharSequence paramCharSequence)
  {
    mTextOn = paramCharSequence;
    mTextOnTransformed = doTransformForOnOffText(paramCharSequence);
    mOnLayout = null;
    if (mShowText) {
      setupEmojiCompatLoadCallback();
    }
  }
  
  private void setupEmojiCompatLoadCallback()
  {
    if ((mEmojiCompatInitCallback == null) && (mAppCompatEmojiTextHelper.isEnabled()) && (EmojiCompat.isConfigured()))
    {
      EmojiCompat localEmojiCompat = EmojiCompat.get();
      int i = localEmojiCompat.getLoadState();
      if ((i == 3) || (i == 0))
      {
        EmojiCompatInitCallback localEmojiCompatInitCallback = new EmojiCompatInitCallback(this);
        mEmojiCompatInitCallback = localEmojiCompatInitCallback;
        localEmojiCompat.registerInitCallback(localEmojiCompatInitCallback);
      }
    }
  }
  
  private void stopDrag(MotionEvent paramMotionEvent)
  {
    mTouchMode = 0;
    int i = paramMotionEvent.getAction();
    boolean bool1 = true;
    if ((i == 1) && (isEnabled())) {
      i = 1;
    } else {
      i = 0;
    }
    boolean bool2 = isChecked();
    if (i != 0)
    {
      mVelocityTracker.computeCurrentVelocity(1000);
      float f = mVelocityTracker.getXVelocity();
      if (Math.abs(f) > mMinFlingVelocity)
      {
        if (ViewUtils.isLayoutRtl(this) ? f >= 0.0F : f <= 0.0F) {
          bool1 = false;
        }
      }
      else {
        bool1 = getTargetCheckedState();
      }
    }
    else
    {
      bool1 = bool2;
    }
    if (bool1 != bool2) {
      playSoundEffect(0);
    }
    setChecked(bool1);
    cancelSuperTouch(paramMotionEvent);
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = mTempRect;
    int i = mSwitchLeft;
    int j = mSwitchTop;
    int k = mSwitchRight;
    int m = mSwitchBottom;
    int n = getThumbOffset() + i;
    Object localObject = mThumbDrawable;
    if (localObject != null) {
      localObject = DrawableUtils.getOpticalBounds((Drawable)localObject);
    } else {
      localObject = DrawableUtils.INSETS_NONE;
    }
    Drawable localDrawable = mTrackDrawable;
    int i1 = n;
    if (localDrawable != null)
    {
      localDrawable.getPadding(localRect);
      int i2 = left;
      int i3 = n + i2;
      int i4;
      if (localObject != null)
      {
        n = left;
        i1 = i;
        if (n > i2) {
          i1 = i + (n - i2);
        }
        i2 = top;
        n = top;
        if (i2 > n) {
          n = i2 - n + j;
        } else {
          n = j;
        }
        i4 = right;
        i = right;
        i2 = k;
        if (i4 > i) {
          i2 = k - (i4 - i);
        }
        int i5 = bottom;
        int i6 = bottom;
        i = i1;
        k = i2;
        i4 = n;
        if (i5 > i6)
        {
          k = m - (i5 - i6);
          i = i1;
          i1 = k;
          break label263;
        }
      }
      else
      {
        i4 = j;
      }
      i1 = m;
      n = i4;
      i2 = k;
      label263:
      mTrackDrawable.setBounds(i, n, i2, i1);
      i1 = i3;
    }
    localObject = mThumbDrawable;
    if (localObject != null)
    {
      ((Drawable)localObject).getPadding(localRect);
      n = i1 - left;
      i1 = i1 + mThumbWidth + right;
      mThumbDrawable.setBounds(n, j, i1, m);
      localObject = getBackground();
      if (localObject != null) {
        DrawableCompat.setHotspotBounds((Drawable)localObject, n, j, i1, m);
      }
    }
    super.draw(paramCanvas);
  }
  
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    super.drawableHotspotChanged(paramFloat1, paramFloat2);
    Drawable localDrawable = mThumbDrawable;
    if (localDrawable != null) {
      DrawableCompat.setHotspot(localDrawable, paramFloat1, paramFloat2);
    }
    localDrawable = mTrackDrawable;
    if (localDrawable != null) {
      DrawableCompat.setHotspot(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable localDrawable = mThumbDrawable;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localDrawable != null)
    {
      bool2 = bool1;
      if (localDrawable.isStateful()) {
        bool2 = false | localDrawable.setState(arrayOfInt);
      }
    }
    localDrawable = mTrackDrawable;
    bool1 = bool2;
    if (localDrawable != null)
    {
      bool1 = bool2;
      if (localDrawable.isStateful()) {
        bool1 = bool2 | localDrawable.setState(arrayOfInt);
      }
    }
    if (bool1) {
      invalidate();
    }
  }
  
  public int getCompoundPaddingLeft()
  {
    if (!ViewUtils.isLayoutRtl(this)) {
      return super.getCompoundPaddingLeft();
    }
    int i = super.getCompoundPaddingLeft() + mSwitchWidth;
    int j = i;
    if (!TextUtils.isEmpty(getText())) {
      j = i + mSwitchPadding;
    }
    return j;
  }
  
  public int getCompoundPaddingRight()
  {
    if (ViewUtils.isLayoutRtl(this)) {
      return super.getCompoundPaddingRight();
    }
    int i = super.getCompoundPaddingRight() + mSwitchWidth;
    int j = i;
    if (!TextUtils.isEmpty(getText())) {
      j = i + mSwitchPadding;
    }
    return j;
  }
  
  @Nullable
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
  }
  
  public boolean getShowText()
  {
    return mShowText;
  }
  
  public boolean getSplitTrack()
  {
    return mSplitTrack;
  }
  
  public int getSwitchMinWidth()
  {
    return mSwitchMinWidth;
  }
  
  public int getSwitchPadding()
  {
    return mSwitchPadding;
  }
  
  public CharSequence getTextOff()
  {
    return mTextOff;
  }
  
  public CharSequence getTextOn()
  {
    return mTextOn;
  }
  
  public Drawable getThumbDrawable()
  {
    return mThumbDrawable;
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public final float getThumbPosition()
  {
    return mThumbPosition;
  }
  
  public int getThumbTextPadding()
  {
    return mThumbTextPadding;
  }
  
  @Nullable
  public ColorStateList getThumbTintList()
  {
    return mThumbTintList;
  }
  
  @Nullable
  public PorterDuff.Mode getThumbTintMode()
  {
    return mThumbTintMode;
  }
  
  public Drawable getTrackDrawable()
  {
    return mTrackDrawable;
  }
  
  @Nullable
  public ColorStateList getTrackTintList()
  {
    return mTrackTintList;
  }
  
  @Nullable
  public PorterDuff.Mode getTrackTintMode()
  {
    return mTrackTintMode;
  }
  
  public boolean isEmojiCompatEnabled()
  {
    return getEmojiTextViewHelper().isEnabled();
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Object localObject = mThumbDrawable;
    if (localObject != null) {
      ((Drawable)localObject).jumpToCurrentState();
    }
    localObject = mTrackDrawable;
    if (localObject != null) {
      ((Drawable)localObject).jumpToCurrentState();
    }
    localObject = mPositionAnimator;
    if ((localObject != null) && (((Animator)localObject).isStarted()))
    {
      mPositionAnimator.end();
      mPositionAnimator = null;
    }
  }
  
  public int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked()) {
      View.mergeDrawableStates(arrayOfInt, CHECKED_STATE_SET);
    }
    return arrayOfInt;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Object localObject1 = mTempRect;
    Object localObject2 = mTrackDrawable;
    if (localObject2 != null) {
      ((Drawable)localObject2).getPadding((Rect)localObject1);
    } else {
      ((Rect)localObject1).setEmpty();
    }
    int i = mSwitchTop;
    int j = mSwitchBottom;
    int k = top;
    int m = bottom;
    Object localObject3 = mThumbDrawable;
    Object localObject4;
    int n;
    if (localObject2 != null) {
      if ((mSplitTrack) && (localObject3 != null))
      {
        localObject4 = DrawableUtils.getOpticalBounds((Drawable)localObject3);
        ((Drawable)localObject3).copyBounds((Rect)localObject1);
        left += left;
        right -= right;
        n = paramCanvas.save();
        paramCanvas.clipRect((Rect)localObject1, Region.Op.DIFFERENCE);
        ((Drawable)localObject2).draw(paramCanvas);
        paramCanvas.restoreToCount(n);
      }
      else
      {
        ((Drawable)localObject2).draw(paramCanvas);
      }
    }
    int i1 = paramCanvas.save();
    if (localObject3 != null) {
      ((Drawable)localObject3).draw(paramCanvas);
    }
    if (getTargetCheckedState()) {
      localObject4 = mOnLayout;
    } else {
      localObject4 = mOffLayout;
    }
    if (localObject4 != null)
    {
      localObject2 = getDrawableState();
      localObject1 = mTextColors;
      if (localObject1 != null) {
        mTextPaint.setColor(((ColorStateList)localObject1).getColorForState((int[])localObject2, 0));
      }
      mTextPaint.drawableState = ((int[])localObject2);
      if (localObject3 != null)
      {
        localObject3 = ((Drawable)localObject3).getBounds();
        n = left + right;
      }
      else
      {
        n = getWidth();
      }
      n /= 2;
      int i2 = ((Layout)localObject4).getWidth() / 2;
      k = (i + k + (j - m)) / 2;
      j = ((Layout)localObject4).getHeight() / 2;
      paramCanvas.translate(n - i2, k - j);
      ((Layout)localObject4).draw(paramCanvas);
    }
    paramCanvas.restoreToCount(i1);
  }
  
  public void onEmojiCompatInitializedForSwitchText()
  {
    setTextOnInternal(mTextOn);
    setTextOffInternal(mTextOff);
    requestLayout();
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("android.widget.Switch");
    if (Build.VERSION.SDK_INT < 30)
    {
      CharSequence localCharSequence1;
      if (isChecked()) {
        localCharSequence1 = mTextOn;
      } else {
        localCharSequence1 = mTextOff;
      }
      if (!TextUtils.isEmpty(localCharSequence1))
      {
        CharSequence localCharSequence2 = paramAccessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(localCharSequence2))
        {
          paramAccessibilityNodeInfo.setText(localCharSequence1);
        }
        else
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(localCharSequence2);
          localStringBuilder.append(' ');
          localStringBuilder.append(localCharSequence1);
          paramAccessibilityNodeInfo.setText(localStringBuilder);
        }
      }
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject1 = mThumbDrawable;
    paramInt1 = 0;
    if (localObject1 != null)
    {
      localObject1 = mTempRect;
      Object localObject2 = mTrackDrawable;
      if (localObject2 != null) {
        ((Drawable)localObject2).getPadding((Rect)localObject1);
      } else {
        ((Rect)localObject1).setEmpty();
      }
      localObject2 = DrawableUtils.getOpticalBounds(mThumbDrawable);
      paramInt2 = Math.max(0, left - left);
      paramInt1 = Math.max(0, right - right);
    }
    else
    {
      paramInt2 = 0;
    }
    if (ViewUtils.isLayoutRtl(this))
    {
      paramInt4 = getPaddingLeft() + paramInt2;
      paramInt3 = mSwitchWidth + paramInt4 - paramInt2 - paramInt1;
    }
    else
    {
      paramInt3 = getWidth() - getPaddingRight() - paramInt1;
      paramInt4 = paramInt3 - mSwitchWidth + paramInt2 + paramInt1;
    }
    paramInt1 = getGravity() & 0x70;
    if (paramInt1 != 16)
    {
      if (paramInt1 != 80)
      {
        paramInt1 = getPaddingTop();
        paramInt2 = mSwitchHeight + paramInt1;
      }
      else
      {
        paramInt2 = getHeight() - getPaddingBottom();
        paramInt1 = paramInt2 - mSwitchHeight;
      }
    }
    else
    {
      paramInt1 = getPaddingTop();
      paramInt1 = (getHeight() + paramInt1 - getPaddingBottom()) / 2;
      paramInt2 = mSwitchHeight;
      paramInt1 -= paramInt2 / 2;
      paramInt2 += paramInt1;
    }
    mSwitchLeft = paramInt4;
    mSwitchTop = paramInt1;
    mSwitchBottom = paramInt2;
    mSwitchRight = paramInt3;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (mShowText)
    {
      if (mOnLayout == null) {
        mOnLayout = makeLayout(mTextOnTransformed);
      }
      if (mOffLayout == null) {
        mOffLayout = makeLayout(mTextOffTransformed);
      }
    }
    Object localObject = mTempRect;
    Drawable localDrawable = mThumbDrawable;
    int i = 0;
    int j;
    if (localDrawable != null)
    {
      localDrawable.getPadding((Rect)localObject);
      j = mThumbDrawable.getIntrinsicWidth() - left - right;
      k = mThumbDrawable.getIntrinsicHeight();
    }
    else
    {
      j = 0;
      k = j;
    }
    if (mShowText)
    {
      m = Math.max(mOnLayout.getWidth(), mOffLayout.getWidth());
      m = mThumbTextPadding * 2 + m;
    }
    else
    {
      m = 0;
    }
    mThumbWidth = Math.max(m, j);
    localDrawable = mTrackDrawable;
    if (localDrawable != null)
    {
      localDrawable.getPadding((Rect)localObject);
      j = mTrackDrawable.getIntrinsicHeight();
    }
    else
    {
      ((Rect)localObject).setEmpty();
      j = i;
    }
    int n = left;
    int i1 = right;
    localObject = mThumbDrawable;
    i = i1;
    int m = n;
    if (localObject != null)
    {
      localObject = DrawableUtils.getOpticalBounds((Drawable)localObject);
      m = Math.max(n, left);
      i = Math.max(i1, right);
    }
    if (mEnforceSwitchWidth) {
      m = Math.max(mSwitchMinWidth, mThumbWidth * 2 + m + i);
    } else {
      m = mSwitchMinWidth;
    }
    int k = Math.max(j, k);
    mSwitchWidth = m;
    mSwitchHeight = k;
    super.onMeasure(paramInt1, paramInt2);
    if (getMeasuredHeight() < k) {
      setMeasuredDimension(getMeasuredWidthAndState(), k);
    }
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    CharSequence localCharSequence;
    if (isChecked()) {
      localCharSequence = mTextOn;
    } else {
      localCharSequence = mTextOff;
    }
    if (localCharSequence != null) {
      paramAccessibilityEvent.getText().add(localCharSequence);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    mVelocityTracker.addMovement(paramMotionEvent);
    int i = paramMotionEvent.getActionMasked();
    float f2;
    float f3;
    if (i != 0)
    {
      if (i != 1) {
        if (i != 2)
        {
          if (i != 3) {
            break label318;
          }
        }
        else
        {
          i = mTouchMode;
          if (i != 1)
          {
            if (i != 2) {
              break label318;
            }
            float f1 = paramMotionEvent.getX();
            i = getThumbScrollRange();
            f2 = f1 - mTouchX;
            if (i != 0) {
              f2 /= i;
            } else if (f2 > 0.0F) {
              f2 = 1.0F;
            } else {
              f2 = -1.0F;
            }
            f3 = f2;
            if (ViewUtils.isLayoutRtl(this)) {
              f3 = -f2;
            }
            f2 = constrain(mThumbPosition + f3, 0.0F, 1.0F);
            if (f2 != mThumbPosition)
            {
              mTouchX = f1;
              setThumbPosition(f2);
            }
            return true;
          }
          f3 = paramMotionEvent.getX();
          f2 = paramMotionEvent.getY();
          if ((Math.abs(f3 - mTouchX) <= mTouchSlop) && (Math.abs(f2 - mTouchY) <= mTouchSlop)) {
            break label318;
          }
          mTouchMode = 2;
          getParent().requestDisallowInterceptTouchEvent(true);
          mTouchX = f3;
          mTouchY = f2;
          return true;
        }
      }
      if (mTouchMode == 2)
      {
        stopDrag(paramMotionEvent);
        super.onTouchEvent(paramMotionEvent);
        return true;
      }
      mTouchMode = 0;
      mVelocityTracker.clear();
    }
    else
    {
      f3 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      if ((isEnabled()) && (hitThumb(f3, f2)))
      {
        mTouchMode = 1;
        mTouchX = f3;
        mTouchY = f2;
      }
    }
    label318:
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().setAllCaps(paramBoolean);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    if (paramBoolean) {
      setOnStateDescriptionOnRAndAbove();
    } else {
      setOffStateDescriptionOnRAndAbove();
    }
    if ((getWindowToken() != null) && (ViewCompat.isLaidOut(this)))
    {
      animateThumbToCheckedState(paramBoolean);
    }
    else
    {
      cancelPositionAnimator();
      float f;
      if (paramBoolean) {
        f = 1.0F;
      } else {
        f = 0.0F;
      }
      setThumbPosition(f);
    }
  }
  
  public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, paramCallback));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().setEnabled(paramBoolean);
    setTextOnInternal(mTextOn);
    setTextOffInternal(mTextOff);
    requestLayout();
  }
  
  public final void setEnforceSwitchWidth(boolean paramBoolean)
  {
    mEnforceSwitchWidth = paramBoolean;
    invalidate();
  }
  
  public void setFilters(@NonNull InputFilter[] paramArrayOfInputFilter)
  {
    super.setFilters(getEmojiTextViewHelper().getFilters(paramArrayOfInputFilter));
  }
  
  public void setShowText(boolean paramBoolean)
  {
    if (mShowText != paramBoolean)
    {
      mShowText = paramBoolean;
      requestLayout();
      if (paramBoolean) {
        setupEmojiCompatLoadCallback();
      }
    }
  }
  
  public void setSplitTrack(boolean paramBoolean)
  {
    mSplitTrack = paramBoolean;
    invalidate();
  }
  
  public void setSwitchMinWidth(int paramInt)
  {
    mSwitchMinWidth = paramInt;
    requestLayout();
  }
  
  public void setSwitchPadding(int paramInt)
  {
    mSwitchPadding = paramInt;
    requestLayout();
  }
  
  public void setSwitchTextAppearance(Context paramContext, int paramInt)
  {
    paramContext = TintTypedArray.obtainStyledAttributes(paramContext, paramInt, R.styleable.TextAppearance);
    ColorStateList localColorStateList = paramContext.getColorStateList(R.styleable.TextAppearance_android_textColor);
    if (localColorStateList != null) {
      mTextColors = localColorStateList;
    } else {
      mTextColors = getTextColors();
    }
    paramInt = paramContext.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
    if (paramInt != 0)
    {
      float f = paramInt;
      if (f != mTextPaint.getTextSize())
      {
        mTextPaint.setTextSize(f);
        requestLayout();
      }
    }
    setSwitchTypefaceByIndex(paramContext.getInt(R.styleable.TextAppearance_android_typeface, -1), paramContext.getInt(R.styleable.TextAppearance_android_textStyle, -1));
    if (paramContext.getBoolean(R.styleable.TextAppearance_textAllCaps, false)) {
      mSwitchTransformationMethod = new AllCapsTransformationMethod(getContext());
    } else {
      mSwitchTransformationMethod = null;
    }
    setTextOnInternal(mTextOn);
    setTextOffInternal(mTextOff);
    paramContext.recycle();
  }
  
  public void setSwitchTypeface(Typeface paramTypeface)
  {
    if (((mTextPaint.getTypeface() != null) && (!mTextPaint.getTypeface().equals(paramTypeface))) || ((mTextPaint.getTypeface() == null) && (paramTypeface != null)))
    {
      mTextPaint.setTypeface(paramTypeface);
      requestLayout();
      invalidate();
    }
  }
  
  public void setSwitchTypeface(Typeface paramTypeface, int paramInt)
  {
    float f = 0.0F;
    boolean bool = false;
    if (paramInt > 0)
    {
      if (paramTypeface == null) {
        paramTypeface = Typeface.defaultFromStyle(paramInt);
      } else {
        paramTypeface = Typeface.create(paramTypeface, paramInt);
      }
      setSwitchTypeface(paramTypeface);
      int i;
      if (paramTypeface != null) {
        i = paramTypeface.getStyle();
      } else {
        i = 0;
      }
      paramInt = i & paramInt;
      paramTypeface = mTextPaint;
      if ((paramInt & 0x1) != 0) {
        bool = true;
      }
      paramTypeface.setFakeBoldText(bool);
      paramTypeface = mTextPaint;
      if ((paramInt & 0x2) != 0) {
        f = -0.25F;
      }
      paramTypeface.setTextSkewX(f);
    }
    else
    {
      mTextPaint.setFakeBoldText(false);
      mTextPaint.setTextSkewX(0.0F);
      setSwitchTypeface(paramTypeface);
    }
  }
  
  public void setTextOff(CharSequence paramCharSequence)
  {
    setTextOffInternal(paramCharSequence);
    requestLayout();
    if (!isChecked()) {
      setOffStateDescriptionOnRAndAbove();
    }
  }
  
  public void setTextOn(CharSequence paramCharSequence)
  {
    setTextOnInternal(paramCharSequence);
    requestLayout();
    if (isChecked()) {
      setOnStateDescriptionOnRAndAbove();
    }
  }
  
  public void setThumbDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = mThumbDrawable;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
    mThumbDrawable = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
    requestLayout();
  }
  
  public void setThumbPosition(float paramFloat)
  {
    mThumbPosition = paramFloat;
    invalidate();
  }
  
  public void setThumbResource(int paramInt)
  {
    setThumbDrawable(AppCompatResources.getDrawable(getContext(), paramInt));
  }
  
  public void setThumbTextPadding(int paramInt)
  {
    mThumbTextPadding = paramInt;
    requestLayout();
  }
  
  public void setThumbTintList(@Nullable ColorStateList paramColorStateList)
  {
    mThumbTintList = paramColorStateList;
    mHasThumbTint = true;
    applyThumbTint();
  }
  
  public void setThumbTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    mThumbTintMode = paramMode;
    mHasThumbTintMode = true;
    applyThumbTint();
  }
  
  public void setTrackDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = mTrackDrawable;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
    mTrackDrawable = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
    requestLayout();
  }
  
  public void setTrackResource(int paramInt)
  {
    setTrackDrawable(AppCompatResources.getDrawable(getContext(), paramInt));
  }
  
  public void setTrackTintList(@Nullable ColorStateList paramColorStateList)
  {
    mTrackTintList = paramColorStateList;
    mHasTrackTint = true;
    applyTrackTint();
  }
  
  public void setTrackTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    mTrackTintMode = paramMode;
    mHasTrackTintMode = true;
    applyTrackTint();
  }
  
  public void toggle()
  {
    setChecked(isChecked() ^ true);
  }
  
  public boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool;
    if ((!super.verifyDrawable(paramDrawable)) && (paramDrawable != mThumbDrawable) && (paramDrawable != mTrackDrawable)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @RequiresApi(18)
  public static class Api18Impl
  {
    @DoNotInline
    public static void setAutoCancel(ObjectAnimator paramObjectAnimator, boolean paramBoolean)
    {
      paramObjectAnimator.setAutoCancel(paramBoolean);
    }
  }
  
  public static class EmojiCompatInitCallback
    extends EmojiCompat.InitCallback
  {
    private final Reference<SwitchCompat> mOuterWeakRef;
    
    public EmojiCompatInitCallback(SwitchCompat paramSwitchCompat)
    {
      mOuterWeakRef = new WeakReference(paramSwitchCompat);
    }
    
    public void onFailed(@Nullable Throwable paramThrowable)
    {
      paramThrowable = (SwitchCompat)mOuterWeakRef.get();
      if (paramThrowable != null) {
        paramThrowable.onEmojiCompatInitializedForSwitchText();
      }
    }
    
    public void onInitialized()
    {
      SwitchCompat localSwitchCompat = (SwitchCompat)mOuterWeakRef.get();
      if (localSwitchCompat != null) {
        localSwitchCompat.onEmojiCompatInitializedForSwitchText();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SwitchCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */