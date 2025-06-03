package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import javax.annotation.Nullable;

public class DraweeView<DH extends DraweeHierarchy>
  extends ImageView
{
  private static boolean sGlobalLegacyVisibilityHandlingEnabled = false;
  private float mAspectRatio = 0.0F;
  private DraweeHolder<DH> mDraweeHolder;
  private boolean mInitialised = false;
  private boolean mLegacyVisibilityHandlingEnabled = false;
  private final AspectRatioMeasure.Spec mMeasureSpec = new AspectRatioMeasure.Spec();
  
  public DraweeView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public DraweeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public DraweeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  @TargetApi(21)
  public DraweeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    if (mInitialised) {
      return;
    }
    boolean bool = true;
    mInitialised = true;
    mDraweeHolder = DraweeHolder.create(null, paramContext);
    ColorStateList localColorStateList = getImageTintList();
    if (localColorStateList == null) {
      return;
    }
    setColorFilter(localColorStateList.getDefaultColor());
    if ((!sGlobalLegacyVisibilityHandlingEnabled) || (getApplicationInfotargetSdkVersion < 24)) {
      bool = false;
    }
    mLegacyVisibilityHandlingEnabled = bool;
  }
  
  private void maybeOverrideVisibilityHandling()
  {
    if (mLegacyVisibilityHandlingEnabled)
    {
      Drawable localDrawable = getDrawable();
      if (localDrawable != null)
      {
        boolean bool;
        if (getVisibility() == 0) {
          bool = true;
        } else {
          bool = false;
        }
        localDrawable.setVisible(bool, false);
      }
    }
  }
  
  public static void setGlobalLegacyVisibilityHandlingEnabled(boolean paramBoolean)
  {
    sGlobalLegacyVisibilityHandlingEnabled = paramBoolean;
  }
  
  public void doAttach()
  {
    mDraweeHolder.onAttach();
  }
  
  public void doDetach()
  {
    mDraweeHolder.onDetach();
  }
  
  public float getAspectRatio()
  {
    return mAspectRatio;
  }
  
  @Nullable
  public DraweeController getController()
  {
    return mDraweeHolder.getController();
  }
  
  public DH getHierarchy()
  {
    return mDraweeHolder.getHierarchy();
  }
  
  @Nullable
  public Drawable getTopLevelDrawable()
  {
    return mDraweeHolder.getTopLevelDrawable();
  }
  
  public boolean hasController()
  {
    boolean bool;
    if (mDraweeHolder.getController() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasHierarchy()
  {
    return mDraweeHolder.hasHierarchy();
  }
  
  public void onAttach()
  {
    doAttach();
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    maybeOverrideVisibilityHandling();
    onAttach();
  }
  
  public void onDetach()
  {
    doDetach();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    maybeOverrideVisibilityHandling();
    onDetach();
  }
  
  public void onFinishTemporaryDetach()
  {
    super.onFinishTemporaryDetach();
    maybeOverrideVisibilityHandling();
    onAttach();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    AspectRatioMeasure.Spec localSpec = mMeasureSpec;
    width = paramInt1;
    height = paramInt2;
    float f = mAspectRatio;
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    int i = getPaddingLeft();
    paramInt1 = getPaddingRight();
    paramInt2 = getPaddingTop();
    AspectRatioMeasure.updateMeasureSpec(localSpec, f, localLayoutParams, paramInt1 + i, getPaddingBottom() + paramInt2);
    localSpec = mMeasureSpec;
    super.onMeasure(width, height);
  }
  
  public void onStartTemporaryDetach()
  {
    super.onStartTemporaryDetach();
    maybeOverrideVisibilityHandling();
    onDetach();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (mDraweeHolder.onTouchEvent(paramMotionEvent)) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    maybeOverrideVisibilityHandling();
  }
  
  public void setAspectRatio(float paramFloat)
  {
    if (paramFloat == mAspectRatio) {
      return;
    }
    mAspectRatio = paramFloat;
    requestLayout();
  }
  
  public void setController(@Nullable DraweeController paramDraweeController)
  {
    mDraweeHolder.setController(paramDraweeController);
    super.setImageDrawable(mDraweeHolder.getTopLevelDrawable());
  }
  
  public void setHierarchy(DH paramDH)
  {
    mDraweeHolder.setHierarchy(paramDH);
    super.setImageDrawable(mDraweeHolder.getTopLevelDrawable());
  }
  
  @Deprecated
  public void setImageBitmap(Bitmap paramBitmap)
  {
    init(getContext());
    mDraweeHolder.setController(null);
    super.setImageBitmap(paramBitmap);
  }
  
  @Deprecated
  public void setImageDrawable(Drawable paramDrawable)
  {
    init(getContext());
    mDraweeHolder.setController(null);
    super.setImageDrawable(paramDrawable);
  }
  
  @Deprecated
  public void setImageResource(int paramInt)
  {
    init(getContext());
    mDraweeHolder.setController(null);
    super.setImageResource(paramInt);
  }
  
  @Deprecated
  public void setImageURI(Uri paramUri)
  {
    init(getContext());
    mDraweeHolder.setController(null);
    super.setImageURI(paramUri);
  }
  
  public void setLegacyVisibilityHandlingEnabled(boolean paramBoolean)
  {
    mLegacyVisibilityHandlingEnabled = paramBoolean;
  }
  
  public String toString()
  {
    Objects.ToStringHelper localToStringHelper = Objects.toStringHelper(this);
    Object localObject = mDraweeHolder;
    if (localObject != null) {
      localObject = ((DraweeHolder)localObject).toString();
    } else {
      localObject = "<no holder set>";
    }
    return localToStringHelper.add("holder", localObject).toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.view.DraweeView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */