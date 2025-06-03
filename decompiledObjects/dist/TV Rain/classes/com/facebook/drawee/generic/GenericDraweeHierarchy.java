package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.drawee.drawable.ArrayDrawable;
import com.facebook.drawee.drawable.DrawableParent;
import com.facebook.drawee.drawable.FadeDrawable;
import com.facebook.drawee.drawable.ForwardingDrawable;
import com.facebook.drawee.drawable.MatrixDrawable;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.interfaces.SettableDraweeHierarchy;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class GenericDraweeHierarchy
  implements SettableDraweeHierarchy
{
  private static final int ACTUAL_IMAGE_INDEX = 2;
  private static final int BACKGROUND_IMAGE_INDEX = 0;
  private static final int FAILURE_IMAGE_INDEX = 5;
  private static final int OVERLAY_IMAGES_INDEX = 6;
  private static final int PLACEHOLDER_IMAGE_INDEX = 1;
  private static final int PROGRESS_BAR_IMAGE_INDEX = 3;
  private static final int RETRY_IMAGE_INDEX = 4;
  private final ForwardingDrawable mActualImageWrapper;
  private final Drawable mEmptyActualImageDrawable;
  private final FadeDrawable mFadeDrawable;
  private final Resources mResources;
  @Nullable
  private RoundingParams mRoundingParams;
  private final RootDrawable mTopLevelDrawable;
  
  public GenericDraweeHierarchy(GenericDraweeHierarchyBuilder paramGenericDraweeHierarchyBuilder)
  {
    int i = 0;
    Object localObject1 = new ColorDrawable(0);
    mEmptyActualImageDrawable = ((Drawable)localObject1);
    mResources = paramGenericDraweeHierarchyBuilder.getResources();
    mRoundingParams = paramGenericDraweeHierarchyBuilder.getRoundingParams();
    Object localObject2 = new ForwardingDrawable((Drawable)localObject1);
    mActualImageWrapper = ((ForwardingDrawable)localObject2);
    localObject1 = paramGenericDraweeHierarchyBuilder.getOverlays();
    int j = 1;
    int k;
    if (localObject1 != null) {
      k = paramGenericDraweeHierarchyBuilder.getOverlays().size();
    } else {
      k = 1;
    }
    int m;
    if (paramGenericDraweeHierarchyBuilder.getPressedStateOverlay() != null) {
      m = 1;
    } else {
      m = 0;
    }
    k += m;
    localObject1 = new Drawable[k + 6];
    localObject1[0] = buildBranch(paramGenericDraweeHierarchyBuilder.getBackground(), null);
    localObject1[1] = buildBranch(paramGenericDraweeHierarchyBuilder.getPlaceholderImage(), paramGenericDraweeHierarchyBuilder.getPlaceholderImageScaleType());
    localObject1[2] = buildActualImageBranch((Drawable)localObject2, paramGenericDraweeHierarchyBuilder.getActualImageScaleType(), paramGenericDraweeHierarchyBuilder.getActualImageFocusPoint(), paramGenericDraweeHierarchyBuilder.getActualImageColorFilter());
    localObject1[3] = buildBranch(paramGenericDraweeHierarchyBuilder.getProgressBarImage(), paramGenericDraweeHierarchyBuilder.getProgressBarImageScaleType());
    localObject1[4] = buildBranch(paramGenericDraweeHierarchyBuilder.getRetryImage(), paramGenericDraweeHierarchyBuilder.getRetryImageScaleType());
    localObject1[5] = buildBranch(paramGenericDraweeHierarchyBuilder.getFailureImage(), paramGenericDraweeHierarchyBuilder.getFailureImageScaleType());
    if (k > 0)
    {
      k = j;
      if (paramGenericDraweeHierarchyBuilder.getOverlays() != null)
      {
        localObject2 = paramGenericDraweeHierarchyBuilder.getOverlays().iterator();
        for (k = i; ((Iterator)localObject2).hasNext(); k++) {
          localObject1[(k + 6)] = buildBranch((Drawable)((Iterator)localObject2).next(), null);
        }
      }
      if (paramGenericDraweeHierarchyBuilder.getPressedStateOverlay() != null) {
        localObject1[(k + 6)] = buildBranch(paramGenericDraweeHierarchyBuilder.getPressedStateOverlay(), null);
      }
    }
    localObject1 = new FadeDrawable((Drawable[])localObject1);
    mFadeDrawable = ((FadeDrawable)localObject1);
    ((FadeDrawable)localObject1).setTransitionDuration(paramGenericDraweeHierarchyBuilder.getFadeDuration());
    paramGenericDraweeHierarchyBuilder = new RootDrawable(WrappingUtils.maybeWrapWithRoundedOverlayColor((Drawable)localObject1, mRoundingParams));
    mTopLevelDrawable = paramGenericDraweeHierarchyBuilder;
    paramGenericDraweeHierarchyBuilder.mutate();
    resetFade();
  }
  
  @Nullable
  private Drawable buildActualImageBranch(Drawable paramDrawable, @Nullable ScalingUtils.ScaleType paramScaleType, @Nullable PointF paramPointF, @Nullable ColorFilter paramColorFilter)
  {
    paramDrawable.setColorFilter(paramColorFilter);
    return WrappingUtils.maybeWrapWithScaleType(paramDrawable, paramScaleType, paramPointF);
  }
  
  @Nullable
  private Drawable buildBranch(@Nullable Drawable paramDrawable, @Nullable ScalingUtils.ScaleType paramScaleType)
  {
    return WrappingUtils.maybeWrapWithScaleType(WrappingUtils.maybeApplyLeafRounding(paramDrawable, mRoundingParams, mResources), paramScaleType);
  }
  
  private void fadeInLayer(int paramInt)
  {
    if (paramInt >= 0) {
      mFadeDrawable.fadeInLayer(paramInt);
    }
  }
  
  private void fadeOutBranches()
  {
    fadeOutLayer(1);
    fadeOutLayer(2);
    fadeOutLayer(3);
    fadeOutLayer(4);
    fadeOutLayer(5);
  }
  
  private void fadeOutLayer(int paramInt)
  {
    if (paramInt >= 0) {
      mFadeDrawable.fadeOutLayer(paramInt);
    }
  }
  
  private DrawableParent getParentDrawableAtIndex(int paramInt)
  {
    Object localObject1 = mFadeDrawable.getDrawableParentForIndex(paramInt);
    Object localObject2 = localObject1;
    if ((((DrawableParent)localObject1).getDrawable() instanceof MatrixDrawable)) {
      localObject2 = (MatrixDrawable)((DrawableParent)localObject1).getDrawable();
    }
    localObject1 = localObject2;
    if ((((DrawableParent)localObject2).getDrawable() instanceof ScaleTypeDrawable)) {
      localObject1 = (ScaleTypeDrawable)((DrawableParent)localObject2).getDrawable();
    }
    return (DrawableParent)localObject1;
  }
  
  private ScaleTypeDrawable getScaleTypeDrawableAtIndex(int paramInt)
  {
    DrawableParent localDrawableParent = getParentDrawableAtIndex(paramInt);
    if ((localDrawableParent instanceof ScaleTypeDrawable)) {
      return (ScaleTypeDrawable)localDrawableParent;
    }
    return WrappingUtils.wrapChildWithScaleType(localDrawableParent, ScalingUtils.ScaleType.FIT_XY);
  }
  
  private boolean hasScaleTypeDrawableAtIndex(int paramInt)
  {
    return getParentDrawableAtIndex(paramInt) instanceof ScaleTypeDrawable;
  }
  
  private void resetActualImages()
  {
    mActualImageWrapper.setDrawable(mEmptyActualImageDrawable);
  }
  
  private void resetFade()
  {
    FadeDrawable localFadeDrawable = mFadeDrawable;
    if (localFadeDrawable != null)
    {
      localFadeDrawable.beginBatchMode();
      mFadeDrawable.fadeInAllLayers();
      fadeOutBranches();
      fadeInLayer(1);
      mFadeDrawable.finishTransitionImmediately();
      mFadeDrawable.endBatchMode();
    }
  }
  
  private void setChildDrawableAtIndex(int paramInt, @Nullable Drawable paramDrawable)
  {
    if (paramDrawable == null)
    {
      mFadeDrawable.setDrawable(paramInt, null);
      return;
    }
    paramDrawable = WrappingUtils.maybeApplyLeafRounding(paramDrawable, mRoundingParams, mResources);
    getParentDrawableAtIndex(paramInt).setDrawable(paramDrawable);
  }
  
  private void setProgress(float paramFloat)
  {
    Drawable localDrawable = mFadeDrawable.getDrawable(3);
    if (localDrawable == null) {
      return;
    }
    if (paramFloat >= 0.999F)
    {
      if ((localDrawable instanceof Animatable)) {
        ((Animatable)localDrawable).stop();
      }
      fadeOutLayer(3);
    }
    else
    {
      if ((localDrawable instanceof Animatable)) {
        ((Animatable)localDrawable).start();
      }
      fadeInLayer(3);
    }
    localDrawable.setLevel(Math.round(paramFloat * 10000.0F));
  }
  
  public void getActualImageBounds(RectF paramRectF)
  {
    mActualImageWrapper.getTransformedBounds(paramRectF);
  }
  
  @Nullable
  public ScalingUtils.ScaleType getActualImageScaleType()
  {
    if (!hasScaleTypeDrawableAtIndex(2)) {
      return null;
    }
    return getScaleTypeDrawableAtIndex(2).getScaleType();
  }
  
  public int getFadeDuration()
  {
    return mFadeDrawable.getTransitionDuration();
  }
  
  @Nullable
  public RoundingParams getRoundingParams()
  {
    return mRoundingParams;
  }
  
  public Drawable getTopLevelDrawable()
  {
    return mTopLevelDrawable;
  }
  
  public boolean hasPlaceholderImage()
  {
    FadeDrawable localFadeDrawable = mFadeDrawable;
    boolean bool = true;
    if (localFadeDrawable.getDrawable(1) == null) {
      bool = false;
    }
    return bool;
  }
  
  public void reset()
  {
    resetActualImages();
    resetFade();
  }
  
  public void setActualImageColorFilter(ColorFilter paramColorFilter)
  {
    mActualImageWrapper.setColorFilter(paramColorFilter);
  }
  
  public void setActualImageFocusPoint(PointF paramPointF)
  {
    Preconditions.checkNotNull(paramPointF);
    getScaleTypeDrawableAtIndex(2).setFocusPoint(paramPointF);
  }
  
  public void setActualImageScaleType(ScalingUtils.ScaleType paramScaleType)
  {
    Preconditions.checkNotNull(paramScaleType);
    getScaleTypeDrawableAtIndex(2).setScaleType(paramScaleType);
  }
  
  public void setBackgroundImage(@Nullable Drawable paramDrawable)
  {
    setChildDrawableAtIndex(0, paramDrawable);
  }
  
  public void setControllerOverlay(@Nullable Drawable paramDrawable)
  {
    mTopLevelDrawable.setControllerOverlay(paramDrawable);
  }
  
  public void setFadeDuration(int paramInt)
  {
    mFadeDrawable.setTransitionDuration(paramInt);
  }
  
  public void setFailure(Throwable paramThrowable)
  {
    mFadeDrawable.beginBatchMode();
    fadeOutBranches();
    if (mFadeDrawable.getDrawable(5) != null) {
      fadeInLayer(5);
    } else {
      fadeInLayer(1);
    }
    mFadeDrawable.endBatchMode();
  }
  
  public void setFailureImage(int paramInt)
  {
    setFailureImage(mResources.getDrawable(paramInt));
  }
  
  public void setFailureImage(int paramInt, ScalingUtils.ScaleType paramScaleType)
  {
    setFailureImage(mResources.getDrawable(paramInt), paramScaleType);
  }
  
  public void setFailureImage(@Nullable Drawable paramDrawable)
  {
    setChildDrawableAtIndex(5, paramDrawable);
  }
  
  public void setFailureImage(Drawable paramDrawable, ScalingUtils.ScaleType paramScaleType)
  {
    setChildDrawableAtIndex(5, paramDrawable);
    getScaleTypeDrawableAtIndex(5).setScaleType(paramScaleType);
  }
  
  public void setImage(Drawable paramDrawable, float paramFloat, boolean paramBoolean)
  {
    paramDrawable = WrappingUtils.maybeApplyLeafRounding(paramDrawable, mRoundingParams, mResources);
    paramDrawable.mutate();
    mActualImageWrapper.setDrawable(paramDrawable);
    mFadeDrawable.beginBatchMode();
    fadeOutBranches();
    fadeInLayer(2);
    setProgress(paramFloat);
    if (paramBoolean) {
      mFadeDrawable.finishTransitionImmediately();
    }
    mFadeDrawable.endBatchMode();
  }
  
  public void setOverlayImage(int paramInt, @Nullable Drawable paramDrawable)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt + 6 < mFadeDrawable.getNumberOfLayers())) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "The given index does not correspond to an overlay image.");
    setChildDrawableAtIndex(paramInt + 6, paramDrawable);
  }
  
  public void setOverlayImage(@Nullable Drawable paramDrawable)
  {
    setOverlayImage(0, paramDrawable);
  }
  
  public void setPlaceholderImage(int paramInt)
  {
    setPlaceholderImage(mResources.getDrawable(paramInt));
  }
  
  public void setPlaceholderImage(int paramInt, ScalingUtils.ScaleType paramScaleType)
  {
    setPlaceholderImage(mResources.getDrawable(paramInt), paramScaleType);
  }
  
  public void setPlaceholderImage(@Nullable Drawable paramDrawable)
  {
    setChildDrawableAtIndex(1, paramDrawable);
  }
  
  public void setPlaceholderImage(Drawable paramDrawable, ScalingUtils.ScaleType paramScaleType)
  {
    setChildDrawableAtIndex(1, paramDrawable);
    getScaleTypeDrawableAtIndex(1).setScaleType(paramScaleType);
  }
  
  public void setPlaceholderImageFocusPoint(PointF paramPointF)
  {
    Preconditions.checkNotNull(paramPointF);
    getScaleTypeDrawableAtIndex(1).setFocusPoint(paramPointF);
  }
  
  public void setProgress(float paramFloat, boolean paramBoolean)
  {
    if (mFadeDrawable.getDrawable(3) == null) {
      return;
    }
    mFadeDrawable.beginBatchMode();
    setProgress(paramFloat);
    if (paramBoolean) {
      mFadeDrawable.finishTransitionImmediately();
    }
    mFadeDrawable.endBatchMode();
  }
  
  public void setProgressBarImage(int paramInt)
  {
    setProgressBarImage(mResources.getDrawable(paramInt));
  }
  
  public void setProgressBarImage(int paramInt, ScalingUtils.ScaleType paramScaleType)
  {
    setProgressBarImage(mResources.getDrawable(paramInt), paramScaleType);
  }
  
  public void setProgressBarImage(@Nullable Drawable paramDrawable)
  {
    setChildDrawableAtIndex(3, paramDrawable);
  }
  
  public void setProgressBarImage(Drawable paramDrawable, ScalingUtils.ScaleType paramScaleType)
  {
    setChildDrawableAtIndex(3, paramDrawable);
    getScaleTypeDrawableAtIndex(3).setScaleType(paramScaleType);
  }
  
  public void setRetry(Throwable paramThrowable)
  {
    mFadeDrawable.beginBatchMode();
    fadeOutBranches();
    if (mFadeDrawable.getDrawable(4) != null) {
      fadeInLayer(4);
    } else {
      fadeInLayer(1);
    }
    mFadeDrawable.endBatchMode();
  }
  
  public void setRetryImage(int paramInt)
  {
    setRetryImage(mResources.getDrawable(paramInt));
  }
  
  public void setRetryImage(int paramInt, ScalingUtils.ScaleType paramScaleType)
  {
    setRetryImage(mResources.getDrawable(paramInt), paramScaleType);
  }
  
  public void setRetryImage(@Nullable Drawable paramDrawable)
  {
    setChildDrawableAtIndex(4, paramDrawable);
  }
  
  public void setRetryImage(Drawable paramDrawable, ScalingUtils.ScaleType paramScaleType)
  {
    setChildDrawableAtIndex(4, paramDrawable);
    getScaleTypeDrawableAtIndex(4).setScaleType(paramScaleType);
  }
  
  public void setRoundingParams(@Nullable RoundingParams paramRoundingParams)
  {
    mRoundingParams = paramRoundingParams;
    WrappingUtils.updateOverlayColorRounding(mTopLevelDrawable, paramRoundingParams);
    for (int i = 0; i < mFadeDrawable.getNumberOfLayers(); i++) {
      WrappingUtils.updateLeafRounding(getParentDrawableAtIndex(i), mRoundingParams, mResources);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.generic.GenericDraweeHierarchy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */