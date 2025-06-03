package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.drawee.drawable.DrawableParent;
import com.facebook.drawee.drawable.ForwardingDrawable;
import com.facebook.drawee.drawable.MatrixDrawable;
import com.facebook.drawee.drawable.Rounded;
import com.facebook.drawee.drawable.RoundedBitmapDrawable;
import com.facebook.drawee.drawable.RoundedColorDrawable;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import javax.annotation.Nullable;

public class WrappingUtils
{
  private static final Drawable sEmptyDrawable = new ColorDrawable(0);
  
  private static Drawable applyLeafRounding(Drawable paramDrawable, RoundingParams paramRoundingParams, Resources paramResources)
  {
    if ((paramDrawable instanceof BitmapDrawable))
    {
      paramDrawable = (BitmapDrawable)paramDrawable;
      paramDrawable = new RoundedBitmapDrawable(paramResources, paramDrawable.getBitmap(), paramDrawable.getPaint());
      applyRoundingParams(paramDrawable, paramRoundingParams);
      return paramDrawable;
    }
    paramResources = paramDrawable;
    if ((paramDrawable instanceof ColorDrawable))
    {
      paramResources = RoundedColorDrawable.fromColorDrawable((ColorDrawable)paramDrawable);
      applyRoundingParams(paramResources, paramRoundingParams);
    }
    return paramResources;
  }
  
  public static void applyRoundingParams(Rounded paramRounded, RoundingParams paramRoundingParams)
  {
    paramRounded.setCircle(paramRoundingParams.getRoundAsCircle());
    paramRounded.setRadii(paramRoundingParams.getCornersRadii());
    paramRounded.setBorder(paramRoundingParams.getBorderColor(), paramRoundingParams.getBorderWidth());
    paramRounded.setPadding(paramRoundingParams.getPadding());
    paramRounded.setScaleDownInsideBorders(paramRoundingParams.getScaleDownInsideBorders());
  }
  
  public static DrawableParent findDrawableParentForLeaf(DrawableParent paramDrawableParent)
  {
    for (;;)
    {
      Drawable localDrawable = paramDrawableParent.getDrawable();
      if ((localDrawable == paramDrawableParent) || (!(localDrawable instanceof DrawableParent))) {
        break;
      }
      paramDrawableParent = (DrawableParent)localDrawable;
    }
    return paramDrawableParent;
  }
  
  public static Drawable maybeApplyLeafRounding(@Nullable Drawable paramDrawable, @Nullable RoundingParams paramRoundingParams, Resources paramResources)
  {
    Object localObject = paramDrawable;
    if (paramDrawable != null)
    {
      localObject = paramDrawable;
      if (paramRoundingParams != null) {
        if (paramRoundingParams.getRoundingMethod() != RoundingParams.RoundingMethod.BITMAP_ONLY)
        {
          localObject = paramDrawable;
        }
        else
        {
          if ((paramDrawable instanceof ForwardingDrawable))
          {
            localObject = findDrawableParentForLeaf((ForwardingDrawable)paramDrawable);
            ((DrawableParent)localObject).setDrawable(applyLeafRounding(((DrawableParent)localObject).setDrawable(sEmptyDrawable), paramRoundingParams, paramResources));
            return paramDrawable;
          }
          localObject = applyLeafRounding(paramDrawable, paramRoundingParams, paramResources);
        }
      }
    }
    return (Drawable)localObject;
  }
  
  @Nullable
  public static Drawable maybeWrapWithMatrix(@Nullable Drawable paramDrawable, @Nullable Matrix paramMatrix)
  {
    if ((paramDrawable != null) && (paramMatrix != null)) {
      return new MatrixDrawable(paramDrawable, paramMatrix);
    }
    return paramDrawable;
  }
  
  public static Drawable maybeWrapWithRoundedOverlayColor(@Nullable Drawable paramDrawable, @Nullable RoundingParams paramRoundingParams)
  {
    if ((paramDrawable != null) && (paramRoundingParams != null) && (paramRoundingParams.getRoundingMethod() == RoundingParams.RoundingMethod.OVERLAY_COLOR))
    {
      paramDrawable = new RoundedCornersDrawable(paramDrawable);
      applyRoundingParams(paramDrawable, paramRoundingParams);
      paramDrawable.setOverlayColor(paramRoundingParams.getOverlayColor());
      return paramDrawable;
    }
    return paramDrawable;
  }
  
  @Nullable
  public static Drawable maybeWrapWithScaleType(@Nullable Drawable paramDrawable, @Nullable ScalingUtils.ScaleType paramScaleType)
  {
    return maybeWrapWithScaleType(paramDrawable, paramScaleType, null);
  }
  
  @Nullable
  public static Drawable maybeWrapWithScaleType(@Nullable Drawable paramDrawable, @Nullable ScalingUtils.ScaleType paramScaleType, @Nullable PointF paramPointF)
  {
    if ((paramDrawable != null) && (paramScaleType != null))
    {
      paramDrawable = new ScaleTypeDrawable(paramDrawable, paramScaleType);
      if (paramPointF != null) {
        paramDrawable.setFocusPoint(paramPointF);
      }
      return paramDrawable;
    }
    return paramDrawable;
  }
  
  public static void resetRoundingParams(Rounded paramRounded)
  {
    paramRounded.setCircle(false);
    paramRounded.setRadius(0.0F);
    paramRounded.setBorder(0, 0.0F);
    paramRounded.setPadding(0.0F);
    paramRounded.setScaleDownInsideBorders(false);
  }
  
  public static void updateLeafRounding(DrawableParent paramDrawableParent, @Nullable RoundingParams paramRoundingParams, Resources paramResources)
  {
    paramDrawableParent = findDrawableParentForLeaf(paramDrawableParent);
    Drawable localDrawable = paramDrawableParent.getDrawable();
    if ((paramRoundingParams != null) && (paramRoundingParams.getRoundingMethod() == RoundingParams.RoundingMethod.BITMAP_ONLY))
    {
      if ((localDrawable instanceof Rounded))
      {
        applyRoundingParams((Rounded)localDrawable, paramRoundingParams);
      }
      else if (localDrawable != null)
      {
        paramDrawableParent.setDrawable(sEmptyDrawable);
        paramDrawableParent.setDrawable(applyLeafRounding(localDrawable, paramRoundingParams, paramResources));
      }
    }
    else if ((localDrawable instanceof Rounded)) {
      resetRoundingParams((Rounded)localDrawable);
    }
  }
  
  public static void updateOverlayColorRounding(DrawableParent paramDrawableParent, @Nullable RoundingParams paramRoundingParams)
  {
    Object localObject = paramDrawableParent.getDrawable();
    if ((paramRoundingParams != null) && (paramRoundingParams.getRoundingMethod() == RoundingParams.RoundingMethod.OVERLAY_COLOR))
    {
      if ((localObject instanceof RoundedCornersDrawable))
      {
        paramDrawableParent = (RoundedCornersDrawable)localObject;
        applyRoundingParams(paramDrawableParent, paramRoundingParams);
        paramDrawableParent.setOverlayColor(paramRoundingParams.getOverlayColor());
      }
      else
      {
        paramDrawableParent.setDrawable(maybeWrapWithRoundedOverlayColor(paramDrawableParent.setDrawable(sEmptyDrawable), paramRoundingParams));
      }
    }
    else if ((localObject instanceof RoundedCornersDrawable))
    {
      localObject = (RoundedCornersDrawable)localObject;
      paramRoundingParams = sEmptyDrawable;
      paramDrawableParent.setDrawable(((ForwardingDrawable)localObject).setCurrent(paramRoundingParams));
      paramRoundingParams.setCallback(null);
    }
  }
  
  public static ScaleTypeDrawable wrapChildWithScaleType(DrawableParent paramDrawableParent, ScalingUtils.ScaleType paramScaleType)
  {
    paramScaleType = maybeWrapWithScaleType(paramDrawableParent.setDrawable(sEmptyDrawable), paramScaleType);
    paramDrawableParent.setDrawable(paramScaleType);
    Preconditions.checkNotNull(paramScaleType, "Parent has no child drawable!");
    return (ScaleTypeDrawable)paramScaleType;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.generic.WrappingUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */