package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class DrawableContainer
  extends Drawable
  implements Drawable.Callback
{
  private static final boolean DEBUG = false;
  private static final boolean DEFAULT_DITHER = true;
  private static final String TAG = "DrawableContainer";
  private int mAlpha = 255;
  private Runnable mAnimationRunnable;
  private BlockInvalidateCallback mBlockInvalidateCallback;
  private int mCurIndex = -1;
  private Drawable mCurrDrawable;
  private DrawableContainerState mDrawableContainerState;
  private long mEnterAnimationEnd;
  private long mExitAnimationEnd;
  private boolean mHasAlpha;
  private Rect mHotspotBounds;
  private Drawable mLastDrawable;
  private boolean mMutated;
  
  private void initializeDrawableForDisplay(Drawable paramDrawable)
  {
    if (mBlockInvalidateCallback == null) {
      mBlockInvalidateCallback = new BlockInvalidateCallback();
    }
    paramDrawable.setCallback(mBlockInvalidateCallback.wrap(paramDrawable.getCallback()));
    try
    {
      if ((mDrawableContainerState.mEnterFadeDuration <= 0) && (mHasAlpha)) {
        paramDrawable.setAlpha(mAlpha);
      }
      Object localObject1 = mDrawableContainerState;
      if (mHasColorFilter)
      {
        paramDrawable.setColorFilter(mColorFilter);
      }
      else
      {
        if (mHasTintList) {
          DrawableCompat.setTintList(paramDrawable, mTintList);
        }
        localObject1 = mDrawableContainerState;
        if (mHasTintMode) {
          DrawableCompat.setTintMode(paramDrawable, mTintMode);
        }
      }
      paramDrawable.setVisible(isVisible(), true);
      paramDrawable.setDither(mDrawableContainerState.mDither);
      paramDrawable.setState(getState());
      paramDrawable.setLevel(getLevel());
      paramDrawable.setBounds(getBounds());
      DrawableCompat.setLayoutDirection(paramDrawable, DrawableCompat.getLayoutDirection(this));
      DrawableCompat.setAutoMirrored(paramDrawable, mDrawableContainerState.mAutoMirrored);
      localObject1 = mHotspotBounds;
      if (localObject1 != null) {
        DrawableCompat.setHotspotBounds(paramDrawable, left, top, right, bottom);
      }
      return;
    }
    finally
    {
      paramDrawable.setCallback(mBlockInvalidateCallback.unwrap());
    }
  }
  
  private boolean needsMirroring()
  {
    boolean bool1 = isAutoMirrored();
    boolean bool2 = true;
    if ((!bool1) || (DrawableCompat.getLayoutDirection(this) != 1)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public static int resolveDensity(@Nullable Resources paramResources, int paramInt)
  {
    if (paramResources != null) {
      paramInt = getDisplayMetricsdensityDpi;
    }
    int i = paramInt;
    if (paramInt == 0) {
      i = 160;
    }
    return i;
  }
  
  public void animate(boolean paramBoolean)
  {
    int i = 1;
    mHasAlpha = true;
    long l1 = SystemClock.uptimeMillis();
    Drawable localDrawable = mCurrDrawable;
    long l2;
    if (localDrawable != null)
    {
      l2 = mEnterAnimationEnd;
      if (l2 != 0L) {
        if (l2 <= l1)
        {
          localDrawable.setAlpha(mAlpha);
          mEnterAnimationEnd = 0L;
        }
        else
        {
          localDrawable.setAlpha((255 - (int)((l2 - l1) * 255L) / mDrawableContainerState.mEnterFadeDuration) * mAlpha / 255);
          j = 1;
          break label108;
        }
      }
    }
    else
    {
      mEnterAnimationEnd = 0L;
    }
    int j = 0;
    label108:
    localDrawable = mLastDrawable;
    if (localDrawable != null)
    {
      l2 = mExitAnimationEnd;
      if (l2 != 0L) {
        if (l2 <= l1)
        {
          localDrawable.setVisible(false, false);
          mLastDrawable = null;
          mExitAnimationEnd = 0L;
        }
        else
        {
          localDrawable.setAlpha((int)((l2 - l1) * 255L) / mDrawableContainerState.mExitFadeDuration * mAlpha / 255);
          j = i;
        }
      }
    }
    else
    {
      mExitAnimationEnd = 0L;
    }
    if ((paramBoolean) && (j != 0)) {
      scheduleSelf(mAnimationRunnable, l1 + 16L);
    }
  }
  
  @RequiresApi(21)
  public void applyTheme(@NonNull Resources.Theme paramTheme)
  {
    mDrawableContainerState.applyTheme(paramTheme);
  }
  
  @RequiresApi(21)
  public boolean canApplyTheme()
  {
    return mDrawableContainerState.canApplyTheme();
  }
  
  public void clearMutated()
  {
    mDrawableContainerState.clearMutated();
    mMutated = false;
  }
  
  public DrawableContainerState cloneConstantState()
  {
    return mDrawableContainerState;
  }
  
  public void draw(@NonNull Canvas paramCanvas)
  {
    Drawable localDrawable = mCurrDrawable;
    if (localDrawable != null) {
      localDrawable.draw(paramCanvas);
    }
    localDrawable = mLastDrawable;
    if (localDrawable != null) {
      localDrawable.draw(paramCanvas);
    }
  }
  
  public int getAlpha()
  {
    return mAlpha;
  }
  
  public int getChangingConfigurations()
  {
    return super.getChangingConfigurations() | mDrawableContainerState.getChangingConfigurations();
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (mDrawableContainerState.canConstantState())
    {
      mDrawableContainerState.mChangingConfigurations = getChangingConfigurations();
      return mDrawableContainerState;
    }
    return null;
  }
  
  @NonNull
  public Drawable getCurrent()
  {
    return mCurrDrawable;
  }
  
  int getCurrentIndex()
  {
    return mCurIndex;
  }
  
  public void getHotspotBounds(@NonNull Rect paramRect)
  {
    Rect localRect = mHotspotBounds;
    if (localRect != null) {
      paramRect.set(localRect);
    } else {
      super.getHotspotBounds(paramRect);
    }
  }
  
  public int getIntrinsicHeight()
  {
    if (mDrawableContainerState.isConstantSize()) {
      return mDrawableContainerState.getConstantHeight();
    }
    Drawable localDrawable = mCurrDrawable;
    int i;
    if (localDrawable != null) {
      i = localDrawable.getIntrinsicHeight();
    } else {
      i = -1;
    }
    return i;
  }
  
  public int getIntrinsicWidth()
  {
    if (mDrawableContainerState.isConstantSize()) {
      return mDrawableContainerState.getConstantWidth();
    }
    Drawable localDrawable = mCurrDrawable;
    int i;
    if (localDrawable != null) {
      i = localDrawable.getIntrinsicWidth();
    } else {
      i = -1;
    }
    return i;
  }
  
  public int getMinimumHeight()
  {
    if (mDrawableContainerState.isConstantSize()) {
      return mDrawableContainerState.getConstantMinimumHeight();
    }
    Drawable localDrawable = mCurrDrawable;
    int i;
    if (localDrawable != null) {
      i = localDrawable.getMinimumHeight();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getMinimumWidth()
  {
    if (mDrawableContainerState.isConstantSize()) {
      return mDrawableContainerState.getConstantMinimumWidth();
    }
    Drawable localDrawable = mCurrDrawable;
    int i;
    if (localDrawable != null) {
      i = localDrawable.getMinimumWidth();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getOpacity()
  {
    Drawable localDrawable = mCurrDrawable;
    int i;
    if ((localDrawable != null) && (localDrawable.isVisible())) {
      i = mDrawableContainerState.getOpacity();
    } else {
      i = -2;
    }
    return i;
  }
  
  @RequiresApi(21)
  public void getOutline(@NonNull Outline paramOutline)
  {
    Drawable localDrawable = mCurrDrawable;
    if (localDrawable != null) {
      Api21Impl.getOutline(localDrawable, paramOutline);
    }
  }
  
  public boolean getPadding(@NonNull Rect paramRect)
  {
    Object localObject = mDrawableContainerState.getConstantPadding();
    int i;
    boolean bool;
    if (localObject != null)
    {
      paramRect.set((Rect)localObject);
      i = left;
      int j = top;
      int k = bottom;
      if ((right | i | j | k) != 0) {
        bool = true;
      } else {
        bool = false;
      }
    }
    else
    {
      localObject = mCurrDrawable;
      if (localObject != null) {
        bool = ((Drawable)localObject).getPadding(paramRect);
      } else {
        bool = super.getPadding(paramRect);
      }
    }
    if (needsMirroring())
    {
      i = left;
      left = right;
      right = i;
    }
    return bool;
  }
  
  public void invalidateDrawable(@NonNull Drawable paramDrawable)
  {
    DrawableContainerState localDrawableContainerState = mDrawableContainerState;
    if (localDrawableContainerState != null) {
      localDrawableContainerState.invalidateCache();
    }
    if ((paramDrawable == mCurrDrawable) && (getCallback() != null)) {
      getCallback().invalidateDrawable(this);
    }
  }
  
  public boolean isAutoMirrored()
  {
    return mDrawableContainerState.mAutoMirrored;
  }
  
  public boolean isStateful()
  {
    return mDrawableContainerState.isStateful();
  }
  
  public void jumpToCurrentState()
  {
    Drawable localDrawable = mLastDrawable;
    int i = 1;
    int j;
    if (localDrawable != null)
    {
      localDrawable.jumpToCurrentState();
      mLastDrawable = null;
      j = 1;
    }
    else
    {
      j = 0;
    }
    localDrawable = mCurrDrawable;
    if (localDrawable != null)
    {
      localDrawable.jumpToCurrentState();
      if (mHasAlpha) {
        mCurrDrawable.setAlpha(mAlpha);
      }
    }
    if (mExitAnimationEnd != 0L)
    {
      mExitAnimationEnd = 0L;
      j = 1;
    }
    if (mEnterAnimationEnd != 0L)
    {
      mEnterAnimationEnd = 0L;
      j = i;
    }
    if (j != 0) {
      invalidateSelf();
    }
  }
  
  public Drawable mutate()
  {
    if ((!mMutated) && (super.mutate() == this))
    {
      DrawableContainerState localDrawableContainerState = cloneConstantState();
      localDrawableContainerState.mutate();
      setConstantState(localDrawableContainerState);
      mMutated = true;
    }
    return this;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = mLastDrawable;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
    localDrawable = mCurrDrawable;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
  }
  
  public boolean onLayoutDirectionChanged(int paramInt)
  {
    return mDrawableContainerState.setLayoutDirection(paramInt, getCurrentIndex());
  }
  
  public boolean onLevelChange(int paramInt)
  {
    Drawable localDrawable = mLastDrawable;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    localDrawable = mCurrDrawable;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    return false;
  }
  
  public boolean onStateChange(@NonNull int[] paramArrayOfInt)
  {
    Drawable localDrawable = mLastDrawable;
    if (localDrawable != null) {
      return localDrawable.setState(paramArrayOfInt);
    }
    localDrawable = mCurrDrawable;
    if (localDrawable != null) {
      return localDrawable.setState(paramArrayOfInt);
    }
    return false;
  }
  
  public void scheduleDrawable(@NonNull Drawable paramDrawable, @NonNull Runnable paramRunnable, long paramLong)
  {
    if ((paramDrawable == mCurrDrawable) && (getCallback() != null)) {
      getCallback().scheduleDrawable(this, paramRunnable, paramLong);
    }
  }
  
  boolean selectDrawable(int paramInt)
  {
    if (paramInt == mCurIndex) {
      return false;
    }
    long l = SystemClock.uptimeMillis();
    Object localObject;
    if (mDrawableContainerState.mExitFadeDuration > 0)
    {
      localObject = mLastDrawable;
      if (localObject != null) {
        ((Drawable)localObject).setVisible(false, false);
      }
      localObject = mCurrDrawable;
      if (localObject != null)
      {
        mLastDrawable = ((Drawable)localObject);
        mExitAnimationEnd = (mDrawableContainerState.mExitFadeDuration + l);
      }
      else
      {
        mLastDrawable = null;
        mExitAnimationEnd = 0L;
      }
    }
    else
    {
      localObject = mCurrDrawable;
      if (localObject != null) {
        ((Drawable)localObject).setVisible(false, false);
      }
    }
    if (paramInt >= 0)
    {
      localObject = mDrawableContainerState;
      if (paramInt < mNumChildren)
      {
        localObject = ((DrawableContainerState)localObject).getChild(paramInt);
        mCurrDrawable = ((Drawable)localObject);
        mCurIndex = paramInt;
        if (localObject == null) {
          break label191;
        }
        paramInt = mDrawableContainerState.mEnterFadeDuration;
        if (paramInt > 0) {
          mEnterAnimationEnd = (l + paramInt);
        }
        initializeDrawableForDisplay((Drawable)localObject);
        break label191;
      }
    }
    mCurrDrawable = null;
    mCurIndex = -1;
    label191:
    if ((mEnterAnimationEnd != 0L) || (mExitAnimationEnd != 0L))
    {
      localObject = mAnimationRunnable;
      if (localObject == null) {
        mAnimationRunnable = new Runnable()
        {
          public void run()
          {
            animate(true);
            invalidateSelf();
          }
        };
      } else {
        unscheduleSelf((Runnable)localObject);
      }
      animate(true);
    }
    invalidateSelf();
    return true;
  }
  
  public void setAlpha(int paramInt)
  {
    if ((!mHasAlpha) || (mAlpha != paramInt))
    {
      mHasAlpha = true;
      mAlpha = paramInt;
      Drawable localDrawable = mCurrDrawable;
      if (localDrawable != null) {
        if (mEnterAnimationEnd == 0L) {
          localDrawable.setAlpha(paramInt);
        } else {
          animate(false);
        }
      }
    }
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    Object localObject = mDrawableContainerState;
    if (mAutoMirrored != paramBoolean)
    {
      mAutoMirrored = paramBoolean;
      localObject = mCurrDrawable;
      if (localObject != null) {
        DrawableCompat.setAutoMirrored((Drawable)localObject, paramBoolean);
      }
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    Object localObject = mDrawableContainerState;
    mHasColorFilter = true;
    if (mColorFilter != paramColorFilter)
    {
      mColorFilter = paramColorFilter;
      localObject = mCurrDrawable;
      if (localObject != null) {
        ((Drawable)localObject).setColorFilter(paramColorFilter);
      }
    }
  }
  
  public void setConstantState(DrawableContainerState paramDrawableContainerState)
  {
    mDrawableContainerState = paramDrawableContainerState;
    int i = mCurIndex;
    if (i >= 0)
    {
      paramDrawableContainerState = paramDrawableContainerState.getChild(i);
      mCurrDrawable = paramDrawableContainerState;
      if (paramDrawableContainerState != null) {
        initializeDrawableForDisplay(paramDrawableContainerState);
      }
    }
    mLastDrawable = null;
  }
  
  public void setCurrentIndex(int paramInt)
  {
    selectDrawable(paramInt);
  }
  
  public void setDither(boolean paramBoolean)
  {
    Object localObject = mDrawableContainerState;
    if (mDither != paramBoolean)
    {
      mDither = paramBoolean;
      localObject = mCurrDrawable;
      if (localObject != null) {
        ((Drawable)localObject).setDither(paramBoolean);
      }
    }
  }
  
  public void setEnterFadeDuration(int paramInt)
  {
    mDrawableContainerState.mEnterFadeDuration = paramInt;
  }
  
  public void setExitFadeDuration(int paramInt)
  {
    mDrawableContainerState.mExitFadeDuration = paramInt;
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    Drawable localDrawable = mCurrDrawable;
    if (localDrawable != null) {
      DrawableCompat.setHotspot(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = mHotspotBounds;
    if (localObject == null) {
      mHotspotBounds = new Rect(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      ((Rect)localObject).set(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    localObject = mCurrDrawable;
    if (localObject != null) {
      DrawableCompat.setHotspotBounds((Drawable)localObject, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void setTint(@ColorInt int paramInt)
  {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    DrawableContainerState localDrawableContainerState = mDrawableContainerState;
    mHasTintList = true;
    if (mTintList != paramColorStateList)
    {
      mTintList = paramColorStateList;
      DrawableCompat.setTintList(mCurrDrawable, paramColorStateList);
    }
  }
  
  public void setTintMode(@NonNull PorterDuff.Mode paramMode)
  {
    DrawableContainerState localDrawableContainerState = mDrawableContainerState;
    mHasTintMode = true;
    if (mTintMode != paramMode)
    {
      mTintMode = paramMode;
      DrawableCompat.setTintMode(mCurrDrawable, paramMode);
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Drawable localDrawable = mLastDrawable;
    if (localDrawable != null) {
      localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    localDrawable = mCurrDrawable;
    if (localDrawable != null) {
      localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    return bool;
  }
  
  public void unscheduleDrawable(@NonNull Drawable paramDrawable, @NonNull Runnable paramRunnable)
  {
    if ((paramDrawable == mCurrDrawable) && (getCallback() != null)) {
      getCallback().unscheduleDrawable(this, paramRunnable);
    }
  }
  
  public final void updateDensity(Resources paramResources)
  {
    mDrawableContainerState.updateDensity(paramResources);
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    public static boolean canApplyTheme(Drawable.ConstantState paramConstantState)
    {
      return paramConstantState.canApplyTheme();
    }
    
    public static void getOutline(Drawable paramDrawable, Outline paramOutline)
    {
      paramDrawable.getOutline(paramOutline);
    }
    
    public static Resources getResources(Resources.Theme paramTheme)
    {
      return paramTheme.getResources();
    }
  }
  
  public static class BlockInvalidateCallback
    implements Drawable.Callback
  {
    private Drawable.Callback mCallback;
    
    public void invalidateDrawable(@NonNull Drawable paramDrawable) {}
    
    public void scheduleDrawable(@NonNull Drawable paramDrawable, @NonNull Runnable paramRunnable, long paramLong)
    {
      Drawable.Callback localCallback = mCallback;
      if (localCallback != null) {
        localCallback.scheduleDrawable(paramDrawable, paramRunnable, paramLong);
      }
    }
    
    public void unscheduleDrawable(@NonNull Drawable paramDrawable, @NonNull Runnable paramRunnable)
    {
      Drawable.Callback localCallback = mCallback;
      if (localCallback != null) {
        localCallback.unscheduleDrawable(paramDrawable, paramRunnable);
      }
    }
    
    public Drawable.Callback unwrap()
    {
      Drawable.Callback localCallback = mCallback;
      mCallback = null;
      return localCallback;
    }
    
    public BlockInvalidateCallback wrap(Drawable.Callback paramCallback)
    {
      mCallback = paramCallback;
      return this;
    }
  }
  
  public static abstract class DrawableContainerState
    extends Drawable.ConstantState
  {
    public boolean mAutoMirrored;
    public boolean mCanConstantState;
    public int mChangingConfigurations;
    public boolean mCheckedConstantSize;
    public boolean mCheckedConstantState;
    public boolean mCheckedOpacity;
    public boolean mCheckedPadding;
    public boolean mCheckedStateful;
    public int mChildrenChangingConfigurations;
    public ColorFilter mColorFilter;
    public int mConstantHeight;
    public int mConstantMinimumHeight;
    public int mConstantMinimumWidth;
    public Rect mConstantPadding;
    public boolean mConstantSize;
    public int mConstantWidth;
    public int mDensity;
    public boolean mDither;
    public SparseArray<Drawable.ConstantState> mDrawableFutures;
    public Drawable[] mDrawables;
    public int mEnterFadeDuration;
    public int mExitFadeDuration;
    public boolean mHasColorFilter;
    public boolean mHasTintList;
    public boolean mHasTintMode;
    public int mLayoutDirection;
    public boolean mMutated;
    public int mNumChildren;
    public int mOpacity;
    public final DrawableContainer mOwner;
    public Resources mSourceRes;
    public boolean mStateful;
    public ColorStateList mTintList;
    public PorterDuff.Mode mTintMode;
    public boolean mVariablePadding;
    
    public DrawableContainerState(DrawableContainerState paramDrawableContainerState, DrawableContainer paramDrawableContainer, Resources paramResources)
    {
      int i = 0;
      mVariablePadding = false;
      mConstantSize = false;
      mDither = true;
      mEnterFadeDuration = 0;
      mExitFadeDuration = 0;
      mOwner = paramDrawableContainer;
      Object localObject = null;
      if (paramResources != null) {
        paramDrawableContainer = paramResources;
      } else if (paramDrawableContainerState != null) {
        paramDrawableContainer = mSourceRes;
      } else {
        paramDrawableContainer = null;
      }
      mSourceRes = paramDrawableContainer;
      if (paramDrawableContainerState != null) {
        j = mDensity;
      } else {
        j = 0;
      }
      int j = DrawableContainer.resolveDensity(paramResources, j);
      mDensity = j;
      if (paramDrawableContainerState != null)
      {
        mChangingConfigurations = mChangingConfigurations;
        mChildrenChangingConfigurations = mChildrenChangingConfigurations;
        mCheckedConstantState = true;
        mCanConstantState = true;
        mVariablePadding = mVariablePadding;
        mConstantSize = mConstantSize;
        mDither = mDither;
        mMutated = mMutated;
        mLayoutDirection = mLayoutDirection;
        mEnterFadeDuration = mEnterFadeDuration;
        mExitFadeDuration = mExitFadeDuration;
        mAutoMirrored = mAutoMirrored;
        mColorFilter = mColorFilter;
        mHasColorFilter = mHasColorFilter;
        mTintList = mTintList;
        mTintMode = mTintMode;
        mHasTintList = mHasTintList;
        mHasTintMode = mHasTintMode;
        if (mDensity == j)
        {
          if (mCheckedPadding)
          {
            paramDrawableContainer = (DrawableContainer)localObject;
            if (mConstantPadding != null) {
              paramDrawableContainer = new Rect(mConstantPadding);
            }
            mConstantPadding = paramDrawableContainer;
            mCheckedPadding = true;
          }
          if (mCheckedConstantSize)
          {
            mConstantWidth = mConstantWidth;
            mConstantHeight = mConstantHeight;
            mConstantMinimumWidth = mConstantMinimumWidth;
            mConstantMinimumHeight = mConstantMinimumHeight;
            mCheckedConstantSize = true;
          }
        }
        if (mCheckedOpacity)
        {
          mOpacity = mOpacity;
          mCheckedOpacity = true;
        }
        if (mCheckedStateful)
        {
          mStateful = mStateful;
          mCheckedStateful = true;
        }
        paramDrawableContainer = mDrawables;
        mDrawables = new Drawable[paramDrawableContainer.length];
        mNumChildren = mNumChildren;
        paramDrawableContainerState = mDrawableFutures;
        if (paramDrawableContainerState != null) {
          mDrawableFutures = paramDrawableContainerState.clone();
        } else {
          mDrawableFutures = new SparseArray(mNumChildren);
        }
        int k = mNumChildren;
        for (j = i; j < k; j++)
        {
          paramDrawableContainerState = paramDrawableContainer[j];
          if (paramDrawableContainerState != null)
          {
            paramDrawableContainerState = paramDrawableContainerState.getConstantState();
            if (paramDrawableContainerState != null) {
              mDrawableFutures.put(j, paramDrawableContainerState);
            } else {
              mDrawables[j] = paramDrawableContainer[j];
            }
          }
        }
      }
      mDrawables = new Drawable[10];
      mNumChildren = 0;
    }
    
    private void createAllFutures()
    {
      Object localObject = mDrawableFutures;
      if (localObject != null)
      {
        int i = ((SparseArray)localObject).size();
        for (int j = 0; j < i; j++)
        {
          int k = mDrawableFutures.keyAt(j);
          localObject = (Drawable.ConstantState)mDrawableFutures.valueAt(j);
          mDrawables[k] = prepareDrawable(((Drawable.ConstantState)localObject).newDrawable(mSourceRes));
        }
        mDrawableFutures = null;
      }
    }
    
    private Drawable prepareDrawable(Drawable paramDrawable)
    {
      DrawableCompat.setLayoutDirection(paramDrawable, mLayoutDirection);
      paramDrawable = paramDrawable.mutate();
      paramDrawable.setCallback(mOwner);
      return paramDrawable;
    }
    
    public final int addChild(Drawable paramDrawable)
    {
      int i = mNumChildren;
      if (i >= mDrawables.length) {
        growArray(i, i + 10);
      }
      paramDrawable.mutate();
      paramDrawable.setVisible(false, true);
      paramDrawable.setCallback(mOwner);
      mDrawables[i] = paramDrawable;
      mNumChildren += 1;
      int j = mChildrenChangingConfigurations;
      mChildrenChangingConfigurations = (paramDrawable.getChangingConfigurations() | j);
      invalidateCache();
      mConstantPadding = null;
      mCheckedPadding = false;
      mCheckedConstantSize = false;
      mCheckedConstantState = false;
      return i;
    }
    
    @RequiresApi(21)
    public final void applyTheme(Resources.Theme paramTheme)
    {
      if (paramTheme != null)
      {
        createAllFutures();
        int i = mNumChildren;
        Drawable[] arrayOfDrawable = mDrawables;
        for (int j = 0; j < i; j++)
        {
          Drawable localDrawable = arrayOfDrawable[j];
          if ((localDrawable != null) && (DrawableCompat.canApplyTheme(localDrawable)))
          {
            DrawableCompat.applyTheme(arrayOfDrawable[j], paramTheme);
            mChildrenChangingConfigurations |= arrayOfDrawable[j].getChangingConfigurations();
          }
        }
        updateDensity(DrawableContainer.Api21Impl.getResources(paramTheme));
      }
    }
    
    @RequiresApi(21)
    public boolean canApplyTheme()
    {
      int i = mNumChildren;
      Drawable[] arrayOfDrawable = mDrawables;
      for (int j = 0; j < i; j++)
      {
        Object localObject = arrayOfDrawable[j];
        if (localObject != null)
        {
          if (DrawableCompat.canApplyTheme((Drawable)localObject)) {
            return true;
          }
        }
        else
        {
          localObject = (Drawable.ConstantState)mDrawableFutures.get(j);
          if ((localObject != null) && (DrawableContainer.Api21Impl.canApplyTheme((Drawable.ConstantState)localObject))) {
            return true;
          }
        }
      }
      return false;
    }
    
    public boolean canConstantState()
    {
      if (mCheckedConstantState) {
        return mCanConstantState;
      }
      createAllFutures();
      mCheckedConstantState = true;
      int i = mNumChildren;
      Drawable[] arrayOfDrawable = mDrawables;
      for (int j = 0; j < i; j++) {
        if (arrayOfDrawable[j].getConstantState() == null)
        {
          mCanConstantState = false;
          return false;
        }
      }
      mCanConstantState = true;
      return true;
    }
    
    public final void clearMutated()
    {
      mMutated = false;
    }
    
    public void computeConstantSize()
    {
      mCheckedConstantSize = true;
      createAllFutures();
      int i = mNumChildren;
      Drawable[] arrayOfDrawable = mDrawables;
      mConstantHeight = -1;
      mConstantWidth = -1;
      int j = 0;
      mConstantMinimumHeight = 0;
      mConstantMinimumWidth = 0;
      while (j < i)
      {
        Drawable localDrawable = arrayOfDrawable[j];
        int k = localDrawable.getIntrinsicWidth();
        if (k > mConstantWidth) {
          mConstantWidth = k;
        }
        k = localDrawable.getIntrinsicHeight();
        if (k > mConstantHeight) {
          mConstantHeight = k;
        }
        k = localDrawable.getMinimumWidth();
        if (k > mConstantMinimumWidth) {
          mConstantMinimumWidth = k;
        }
        k = localDrawable.getMinimumHeight();
        if (k > mConstantMinimumHeight) {
          mConstantMinimumHeight = k;
        }
        j++;
      }
    }
    
    public final int getCapacity()
    {
      return mDrawables.length;
    }
    
    public int getChangingConfigurations()
    {
      return mChangingConfigurations | mChildrenChangingConfigurations;
    }
    
    public final Drawable getChild(int paramInt)
    {
      Object localObject = mDrawables[paramInt];
      if (localObject != null) {
        return (Drawable)localObject;
      }
      localObject = mDrawableFutures;
      if (localObject != null)
      {
        int i = ((SparseArray)localObject).indexOfKey(paramInt);
        if (i >= 0)
        {
          localObject = prepareDrawable(((Drawable.ConstantState)mDrawableFutures.valueAt(i)).newDrawable(mSourceRes));
          mDrawables[paramInt] = localObject;
          mDrawableFutures.removeAt(i);
          if (mDrawableFutures.size() == 0) {
            mDrawableFutures = null;
          }
          return (Drawable)localObject;
        }
      }
      return null;
    }
    
    public final int getChildCount()
    {
      return mNumChildren;
    }
    
    public final int getConstantHeight()
    {
      if (!mCheckedConstantSize) {
        computeConstantSize();
      }
      return mConstantHeight;
    }
    
    public final int getConstantMinimumHeight()
    {
      if (!mCheckedConstantSize) {
        computeConstantSize();
      }
      return mConstantMinimumHeight;
    }
    
    public final int getConstantMinimumWidth()
    {
      if (!mCheckedConstantSize) {
        computeConstantSize();
      }
      return mConstantMinimumWidth;
    }
    
    public final Rect getConstantPadding()
    {
      boolean bool = mVariablePadding;
      Object localObject1 = null;
      if (bool) {
        return null;
      }
      Object localObject2 = mConstantPadding;
      if ((localObject2 == null) && (!mCheckedPadding))
      {
        createAllFutures();
        Rect localRect = new Rect();
        int i = mNumChildren;
        Drawable[] arrayOfDrawable = mDrawables;
        int j = 0;
        while (j < i)
        {
          Object localObject3 = localObject1;
          if (arrayOfDrawable[j].getPadding(localRect))
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new Rect(0, 0, 0, 0);
            }
            int k = left;
            if (k > left) {
              left = k;
            }
            k = top;
            if (k > top) {
              top = k;
            }
            k = right;
            if (k > right) {
              right = k;
            }
            k = bottom;
            localObject3 = localObject2;
            if (k > bottom)
            {
              bottom = k;
              localObject3 = localObject2;
            }
          }
          j++;
          localObject1 = localObject3;
        }
        mCheckedPadding = true;
        mConstantPadding = ((Rect)localObject1);
        return (Rect)localObject1;
      }
      return (Rect)localObject2;
    }
    
    public final int getConstantWidth()
    {
      if (!mCheckedConstantSize) {
        computeConstantSize();
      }
      return mConstantWidth;
    }
    
    public final int getEnterFadeDuration()
    {
      return mEnterFadeDuration;
    }
    
    public final int getExitFadeDuration()
    {
      return mExitFadeDuration;
    }
    
    public final int getOpacity()
    {
      if (mCheckedOpacity) {
        return mOpacity;
      }
      createAllFutures();
      int i = mNumChildren;
      Drawable[] arrayOfDrawable = mDrawables;
      int j;
      if (i > 0) {
        j = arrayOfDrawable[0].getOpacity();
      } else {
        j = -2;
      }
      for (int k = 1; k < i; k++) {
        j = Drawable.resolveOpacity(j, arrayOfDrawable[k].getOpacity());
      }
      mOpacity = j;
      mCheckedOpacity = true;
      return j;
    }
    
    public void growArray(int paramInt1, int paramInt2)
    {
      Drawable[] arrayOfDrawable1 = new Drawable[paramInt2];
      Drawable[] arrayOfDrawable2 = mDrawables;
      if (arrayOfDrawable2 != null) {
        System.arraycopy(arrayOfDrawable2, 0, arrayOfDrawable1, 0, paramInt1);
      }
      mDrawables = arrayOfDrawable1;
    }
    
    public void invalidateCache()
    {
      mCheckedOpacity = false;
      mCheckedStateful = false;
    }
    
    public final boolean isConstantSize()
    {
      return mConstantSize;
    }
    
    public final boolean isStateful()
    {
      if (mCheckedStateful) {
        return mStateful;
      }
      createAllFutures();
      int i = mNumChildren;
      Drawable[] arrayOfDrawable = mDrawables;
      boolean bool1 = false;
      boolean bool2;
      for (int j = 0;; j++)
      {
        bool2 = bool1;
        if (j >= i) {
          break;
        }
        if (arrayOfDrawable[j].isStateful())
        {
          bool2 = true;
          break;
        }
      }
      mStateful = bool2;
      mCheckedStateful = true;
      return bool2;
    }
    
    public void mutate()
    {
      int i = mNumChildren;
      Drawable[] arrayOfDrawable = mDrawables;
      for (int j = 0; j < i; j++)
      {
        Drawable localDrawable = arrayOfDrawable[j];
        if (localDrawable != null) {
          localDrawable.mutate();
        }
      }
      mMutated = true;
    }
    
    public final void setConstantSize(boolean paramBoolean)
    {
      mConstantSize = paramBoolean;
    }
    
    public final void setEnterFadeDuration(int paramInt)
    {
      mEnterFadeDuration = paramInt;
    }
    
    public final void setExitFadeDuration(int paramInt)
    {
      mExitFadeDuration = paramInt;
    }
    
    public final boolean setLayoutDirection(int paramInt1, int paramInt2)
    {
      int i = mNumChildren;
      Drawable[] arrayOfDrawable = mDrawables;
      int j = 0;
      boolean bool2;
      for (boolean bool1 = false; j < i; bool1 = bool2)
      {
        Drawable localDrawable = arrayOfDrawable[j];
        bool2 = bool1;
        if (localDrawable != null)
        {
          boolean bool3 = DrawableCompat.setLayoutDirection(localDrawable, paramInt1);
          bool2 = bool1;
          if (j == paramInt2) {
            bool2 = bool3;
          }
        }
        j++;
      }
      mLayoutDirection = paramInt1;
      return bool1;
    }
    
    public final void setVariablePadding(boolean paramBoolean)
    {
      mVariablePadding = paramBoolean;
    }
    
    public final void updateDensity(Resources paramResources)
    {
      if (paramResources != null)
      {
        mSourceRes = paramResources;
        int i = DrawableContainer.resolveDensity(paramResources, mDensity);
        int j = mDensity;
        mDensity = i;
        if (j != i)
        {
          mCheckedConstantSize = false;
          mCheckedPadding = false;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.DrawableContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */