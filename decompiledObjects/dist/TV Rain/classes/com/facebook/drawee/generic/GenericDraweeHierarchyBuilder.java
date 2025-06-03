package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class GenericDraweeHierarchyBuilder
{
  public static final ScalingUtils.ScaleType DEFAULT_ACTUAL_IMAGE_SCALE_TYPE = ScalingUtils.ScaleType.CENTER_CROP;
  public static final int DEFAULT_FADE_DURATION = 300;
  public static final ScalingUtils.ScaleType DEFAULT_SCALE_TYPE = ScalingUtils.ScaleType.CENTER_INSIDE;
  private ColorFilter mActualImageColorFilter;
  private PointF mActualImageFocusPoint;
  private Matrix mActualImageMatrix;
  private ScalingUtils.ScaleType mActualImageScaleType;
  private Drawable mBackground;
  private float mDesiredAspectRatio;
  private int mFadeDuration;
  private Drawable mFailureImage;
  private ScalingUtils.ScaleType mFailureImageScaleType;
  private List<Drawable> mOverlays;
  private Drawable mPlaceholderImage;
  @Nullable
  private ScalingUtils.ScaleType mPlaceholderImageScaleType;
  private Drawable mPressedStateOverlay;
  private Drawable mProgressBarImage;
  private ScalingUtils.ScaleType mProgressBarImageScaleType;
  private Resources mResources;
  private Drawable mRetryImage;
  private ScalingUtils.ScaleType mRetryImageScaleType;
  private RoundingParams mRoundingParams;
  
  public GenericDraweeHierarchyBuilder(Resources paramResources)
  {
    mResources = paramResources;
    init();
  }
  
  private void init()
  {
    mFadeDuration = 300;
    mDesiredAspectRatio = 0.0F;
    mPlaceholderImage = null;
    ScalingUtils.ScaleType localScaleType = DEFAULT_SCALE_TYPE;
    mPlaceholderImageScaleType = localScaleType;
    mRetryImage = null;
    mRetryImageScaleType = localScaleType;
    mFailureImage = null;
    mFailureImageScaleType = localScaleType;
    mProgressBarImage = null;
    mProgressBarImageScaleType = localScaleType;
    mActualImageScaleType = DEFAULT_ACTUAL_IMAGE_SCALE_TYPE;
    mActualImageMatrix = null;
    mActualImageFocusPoint = null;
    mActualImageColorFilter = null;
    mBackground = null;
    mOverlays = null;
    mPressedStateOverlay = null;
    mRoundingParams = null;
  }
  
  public static GenericDraweeHierarchyBuilder newInstance(Resources paramResources)
  {
    return new GenericDraweeHierarchyBuilder(paramResources);
  }
  
  private void validate()
  {
    Object localObject = mOverlays;
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        Preconditions.checkNotNull((Drawable)((Iterator)localObject).next());
      }
    }
  }
  
  public GenericDraweeHierarchy build()
  {
    validate();
    return new GenericDraweeHierarchy(this);
  }
  
  @Nullable
  public ColorFilter getActualImageColorFilter()
  {
    return mActualImageColorFilter;
  }
  
  @Nullable
  public PointF getActualImageFocusPoint()
  {
    return mActualImageFocusPoint;
  }
  
  @Nullable
  public ScalingUtils.ScaleType getActualImageScaleType()
  {
    return mActualImageScaleType;
  }
  
  @Nullable
  public Drawable getBackground()
  {
    return mBackground;
  }
  
  public float getDesiredAspectRatio()
  {
    return mDesiredAspectRatio;
  }
  
  public int getFadeDuration()
  {
    return mFadeDuration;
  }
  
  @Nullable
  public Drawable getFailureImage()
  {
    return mFailureImage;
  }
  
  @Nullable
  public ScalingUtils.ScaleType getFailureImageScaleType()
  {
    return mFailureImageScaleType;
  }
  
  @Nullable
  public List<Drawable> getOverlays()
  {
    return mOverlays;
  }
  
  @Nullable
  public Drawable getPlaceholderImage()
  {
    return mPlaceholderImage;
  }
  
  @Nullable
  public ScalingUtils.ScaleType getPlaceholderImageScaleType()
  {
    return mPlaceholderImageScaleType;
  }
  
  @Nullable
  public Drawable getPressedStateOverlay()
  {
    return mPressedStateOverlay;
  }
  
  @Nullable
  public Drawable getProgressBarImage()
  {
    return mProgressBarImage;
  }
  
  @Nullable
  public ScalingUtils.ScaleType getProgressBarImageScaleType()
  {
    return mProgressBarImageScaleType;
  }
  
  public Resources getResources()
  {
    return mResources;
  }
  
  @Nullable
  public Drawable getRetryImage()
  {
    return mRetryImage;
  }
  
  @Nullable
  public ScalingUtils.ScaleType getRetryImageScaleType()
  {
    return mRetryImageScaleType;
  }
  
  @Nullable
  public RoundingParams getRoundingParams()
  {
    return mRoundingParams;
  }
  
  public GenericDraweeHierarchyBuilder reset()
  {
    init();
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setActualImageColorFilter(@Nullable ColorFilter paramColorFilter)
  {
    mActualImageColorFilter = paramColorFilter;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setActualImageFocusPoint(@Nullable PointF paramPointF)
  {
    mActualImageFocusPoint = paramPointF;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setActualImageScaleType(@Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mActualImageScaleType = paramScaleType;
    mActualImageMatrix = null;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setBackground(@Nullable Drawable paramDrawable)
  {
    mBackground = paramDrawable;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setDesiredAspectRatio(float paramFloat)
  {
    mDesiredAspectRatio = paramFloat;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setFadeDuration(int paramInt)
  {
    mFadeDuration = paramInt;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setFailureImage(int paramInt)
  {
    mFailureImage = mResources.getDrawable(paramInt);
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setFailureImage(int paramInt, @Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mFailureImage = mResources.getDrawable(paramInt);
    mFailureImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setFailureImage(@Nullable Drawable paramDrawable)
  {
    mFailureImage = paramDrawable;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setFailureImage(Drawable paramDrawable, @Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mFailureImage = paramDrawable;
    mFailureImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setFailureImageScaleType(@Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mFailureImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setOverlay(@Nullable Drawable paramDrawable)
  {
    if (paramDrawable == null) {
      mOverlays = null;
    } else {
      mOverlays = Arrays.asList(new Drawable[] { paramDrawable });
    }
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setOverlays(@Nullable List<Drawable> paramList)
  {
    mOverlays = paramList;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setPlaceholderImage(int paramInt)
  {
    mPlaceholderImage = mResources.getDrawable(paramInt);
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setPlaceholderImage(int paramInt, @Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mPlaceholderImage = mResources.getDrawable(paramInt);
    mPlaceholderImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setPlaceholderImage(@Nullable Drawable paramDrawable)
  {
    mPlaceholderImage = paramDrawable;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setPlaceholderImage(Drawable paramDrawable, @Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mPlaceholderImage = paramDrawable;
    mPlaceholderImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setPlaceholderImageScaleType(@Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mPlaceholderImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setPressedStateOverlay(@Nullable Drawable paramDrawable)
  {
    if (paramDrawable == null)
    {
      mPressedStateOverlay = null;
    }
    else
    {
      StateListDrawable localStateListDrawable = new StateListDrawable();
      localStateListDrawable.addState(new int[] { 16842919 }, paramDrawable);
      mPressedStateOverlay = localStateListDrawable;
    }
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setProgressBarImage(int paramInt)
  {
    mProgressBarImage = mResources.getDrawable(paramInt);
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setProgressBarImage(int paramInt, @Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mProgressBarImage = mResources.getDrawable(paramInt);
    mProgressBarImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setProgressBarImage(@Nullable Drawable paramDrawable)
  {
    mProgressBarImage = paramDrawable;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setProgressBarImage(Drawable paramDrawable, @Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mProgressBarImage = paramDrawable;
    mProgressBarImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setProgressBarImageScaleType(@Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mProgressBarImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setRetryImage(int paramInt)
  {
    mRetryImage = mResources.getDrawable(paramInt);
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setRetryImage(int paramInt, @Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mRetryImage = mResources.getDrawable(paramInt);
    mRetryImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setRetryImage(@Nullable Drawable paramDrawable)
  {
    mRetryImage = paramDrawable;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setRetryImage(Drawable paramDrawable, @Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mRetryImage = paramDrawable;
    mRetryImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setRetryImageScaleType(@Nullable ScalingUtils.ScaleType paramScaleType)
  {
    mRetryImageScaleType = paramScaleType;
    return this;
  }
  
  public GenericDraweeHierarchyBuilder setRoundingParams(@Nullable RoundingParams paramRoundingParams)
  {
    mRoundingParams = paramRoundingParams;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */