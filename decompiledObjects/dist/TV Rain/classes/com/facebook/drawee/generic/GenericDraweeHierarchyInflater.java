package com.facebook.drawee.generic;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.R.styleable;
import com.facebook.drawee.drawable.AutoRotateDrawable;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.infer.annotation.ReturnsOwnership;
import javax.annotation.Nullable;

public class GenericDraweeHierarchyInflater
{
  @Nullable
  private static Drawable getDrawable(Context paramContext, TypedArray paramTypedArray, int paramInt)
  {
    paramInt = paramTypedArray.getResourceId(paramInt, 0);
    if (paramInt == 0) {
      paramContext = null;
    } else {
      paramContext = paramContext.getResources().getDrawable(paramInt);
    }
    return paramContext;
  }
  
  @ReturnsOwnership
  private static RoundingParams getRoundingParams(GenericDraweeHierarchyBuilder paramGenericDraweeHierarchyBuilder)
  {
    if (paramGenericDraweeHierarchyBuilder.getRoundingParams() == null) {
      paramGenericDraweeHierarchyBuilder.setRoundingParams(new RoundingParams());
    }
    return paramGenericDraweeHierarchyBuilder.getRoundingParams();
  }
  
  @Nullable
  private static ScalingUtils.ScaleType getScaleTypeFromXml(TypedArray paramTypedArray, int paramInt)
  {
    switch (paramTypedArray.getInt(paramInt, -2))
    {
    default: 
      throw new RuntimeException("XML attribute not specified!");
    case 8: 
      return ScalingUtils.ScaleType.FIT_BOTTOM_START;
    case 7: 
      return ScalingUtils.ScaleType.FOCUS_CROP;
    case 6: 
      return ScalingUtils.ScaleType.CENTER_CROP;
    case 5: 
      return ScalingUtils.ScaleType.CENTER_INSIDE;
    case 4: 
      return ScalingUtils.ScaleType.CENTER;
    case 3: 
      return ScalingUtils.ScaleType.FIT_END;
    case 2: 
      return ScalingUtils.ScaleType.FIT_CENTER;
    case 1: 
      return ScalingUtils.ScaleType.FIT_START;
    case 0: 
      return ScalingUtils.ScaleType.FIT_XY;
    }
    return null;
  }
  
  public static GenericDraweeHierarchyBuilder inflateBuilder(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    return updateBuilder(new GenericDraweeHierarchyBuilder(paramContext.getResources()), paramContext, paramAttributeSet);
  }
  
  public static GenericDraweeHierarchy inflateHierarchy(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    return inflateBuilder(paramContext, paramAttributeSet).build();
  }
  
  public static GenericDraweeHierarchyBuilder updateBuilder(GenericDraweeHierarchyBuilder paramGenericDraweeHierarchyBuilder, Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray;
    if (paramAttributeSet != null) {
      localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.GenericDraweeHierarchy);
    }
    int j;
    label861:
    label1302:
    int i2;
    try
    {
      int i = localTypedArray.getIndexCount();
      j = 0;
      k = 0;
      boolean bool1 = true;
      boolean bool2 = true;
      boolean bool3 = true;
      boolean bool4 = true;
      boolean bool5 = true;
      boolean bool6 = true;
      boolean bool7 = true;
      boolean bool8 = true;
      m = 0;
      int n;
      for (;;)
      {
        paramAttributeSet = paramContext;
        if (k < i) {
          try
          {
            n = localTypedArray.getIndex(k);
            boolean bool9;
            boolean bool10;
            boolean bool11;
            boolean bool12;
            boolean bool13;
            boolean bool14;
            boolean bool15;
            boolean bool16;
            if (n == R.styleable.GenericDraweeHierarchy_actualImageScaleType)
            {
              paramGenericDraweeHierarchyBuilder.setActualImageScaleType(getScaleTypeFromXml(localTypedArray, n));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else if (n == R.styleable.GenericDraweeHierarchy_placeholderImage)
            {
              paramGenericDraweeHierarchyBuilder.setPlaceholderImage(getDrawable(paramAttributeSet, localTypedArray, n));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else if (n == R.styleable.GenericDraweeHierarchy_pressedStateOverlayImage)
            {
              paramGenericDraweeHierarchyBuilder.setPressedStateOverlay(getDrawable(paramAttributeSet, localTypedArray, n));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else if (n == R.styleable.GenericDraweeHierarchy_progressBarImage)
            {
              paramGenericDraweeHierarchyBuilder.setProgressBarImage(getDrawable(paramAttributeSet, localTypedArray, n));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else if (n == R.styleable.GenericDraweeHierarchy_fadeDuration)
            {
              paramGenericDraweeHierarchyBuilder.setFadeDuration(localTypedArray.getInt(n, 0));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else if (n == R.styleable.GenericDraweeHierarchy_viewAspectRatio)
            {
              paramGenericDraweeHierarchyBuilder.setDesiredAspectRatio(localTypedArray.getFloat(n, 0.0F));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else if (n == R.styleable.GenericDraweeHierarchy_placeholderImageScaleType)
            {
              paramGenericDraweeHierarchyBuilder.setPlaceholderImageScaleType(getScaleTypeFromXml(localTypedArray, n));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else if (n == R.styleable.GenericDraweeHierarchy_retryImage)
            {
              paramGenericDraweeHierarchyBuilder.setRetryImage(getDrawable(paramAttributeSet, localTypedArray, n));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else if (n == R.styleable.GenericDraweeHierarchy_retryImageScaleType)
            {
              paramGenericDraweeHierarchyBuilder.setRetryImageScaleType(getScaleTypeFromXml(localTypedArray, n));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else if (n == R.styleable.GenericDraweeHierarchy_failureImage)
            {
              paramGenericDraweeHierarchyBuilder.setFailureImage(getDrawable(paramAttributeSet, localTypedArray, n));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else if (n == R.styleable.GenericDraweeHierarchy_failureImageScaleType)
            {
              paramGenericDraweeHierarchyBuilder.setFailureImageScaleType(getScaleTypeFromXml(localTypedArray, n));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else if (n == R.styleable.GenericDraweeHierarchy_progressBarImageScaleType)
            {
              paramGenericDraweeHierarchyBuilder.setProgressBarImageScaleType(getScaleTypeFromXml(localTypedArray, n));
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
            }
            else
            {
              if (n != R.styleable.GenericDraweeHierarchy_progressBarAutoRotateInterval) {
                break label861;
              }
              i1 = localTypedArray.getInteger(n, j);
              bool16 = bool8;
              bool15 = bool7;
              bool14 = bool6;
              bool13 = bool5;
              bool12 = bool4;
              bool11 = bool3;
              bool10 = bool2;
              bool9 = bool1;
            }
            do
            {
              for (;;)
              {
                j = i1;
                bool1 = bool9;
                bool2 = bool10;
                bool3 = bool11;
                bool4 = bool12;
                bool5 = bool13;
                bool6 = bool14;
                bool7 = bool15;
                bool8 = bool16;
                break label1571;
                if (n == R.styleable.GenericDraweeHierarchy_backgroundImage)
                {
                  paramGenericDraweeHierarchyBuilder.setBackground(getDrawable(paramAttributeSet, localTypedArray, n));
                  i1 = j;
                  bool9 = bool1;
                  bool10 = bool2;
                  bool11 = bool3;
                  bool12 = bool4;
                  bool13 = bool5;
                  bool14 = bool6;
                  bool15 = bool7;
                  bool16 = bool8;
                }
                else if (n == R.styleable.GenericDraweeHierarchy_overlayImage)
                {
                  paramGenericDraweeHierarchyBuilder.setOverlay(getDrawable(paramAttributeSet, localTypedArray, n));
                  i1 = j;
                  bool9 = bool1;
                  bool10 = bool2;
                  bool11 = bool3;
                  bool12 = bool4;
                  bool13 = bool5;
                  bool14 = bool6;
                  bool15 = bool7;
                  bool16 = bool8;
                }
                else if (n == R.styleable.GenericDraweeHierarchy_roundAsCircle)
                {
                  getRoundingParams(paramGenericDraweeHierarchyBuilder).setRoundAsCircle(localTypedArray.getBoolean(n, false));
                  i1 = j;
                  bool9 = bool1;
                  bool10 = bool2;
                  bool11 = bool3;
                  bool12 = bool4;
                  bool13 = bool5;
                  bool14 = bool6;
                  bool15 = bool7;
                  bool16 = bool8;
                }
                else if (n == R.styleable.GenericDraweeHierarchy_roundedCornerRadius)
                {
                  m = localTypedArray.getDimensionPixelSize(n, m);
                  i1 = j;
                  bool9 = bool1;
                  bool10 = bool2;
                  bool11 = bool3;
                  bool12 = bool4;
                  bool13 = bool5;
                  bool14 = bool6;
                  bool15 = bool7;
                  bool16 = bool8;
                }
                else
                {
                  if (n == R.styleable.GenericDraweeHierarchy_roundTopLeft) {
                    bool1 = localTypedArray.getBoolean(n, bool1);
                  }
                  for (;;)
                  {
                    i1 = j;
                    bool9 = bool1;
                    bool10 = bool2;
                    bool11 = bool3;
                    bool12 = bool4;
                    bool13 = bool5;
                    bool14 = bool6;
                    bool15 = bool7;
                    bool16 = bool8;
                    break;
                    if (n == R.styleable.GenericDraweeHierarchy_roundTopRight)
                    {
                      bool3 = localTypedArray.getBoolean(n, bool3);
                    }
                    else if (n == R.styleable.GenericDraweeHierarchy_roundBottomLeft)
                    {
                      bool7 = localTypedArray.getBoolean(n, bool7);
                    }
                    else if (n == R.styleable.GenericDraweeHierarchy_roundBottomRight)
                    {
                      bool5 = localTypedArray.getBoolean(n, bool5);
                    }
                    else if (n == R.styleable.GenericDraweeHierarchy_roundTopStart)
                    {
                      bool2 = localTypedArray.getBoolean(n, bool2);
                    }
                    else if (n == R.styleable.GenericDraweeHierarchy_roundTopEnd)
                    {
                      bool4 = localTypedArray.getBoolean(n, bool4);
                    }
                    else if (n == R.styleable.GenericDraweeHierarchy_roundBottomStart)
                    {
                      bool8 = localTypedArray.getBoolean(n, bool8);
                    }
                    else
                    {
                      if (n != R.styleable.GenericDraweeHierarchy_roundBottomEnd) {
                        break label1302;
                      }
                      bool6 = localTypedArray.getBoolean(n, bool6);
                    }
                  }
                  if (n == R.styleable.GenericDraweeHierarchy_roundWithOverlayColor)
                  {
                    paramAttributeSet = getRoundingParams(paramGenericDraweeHierarchyBuilder);
                    paramAttributeSet.setOverlayColor(localTypedArray.getColor(n, 0));
                    i1 = j;
                    bool9 = bool1;
                    bool10 = bool2;
                    bool11 = bool3;
                    bool12 = bool4;
                    bool13 = bool5;
                    bool14 = bool6;
                    bool15 = bool7;
                    bool16 = bool8;
                  }
                  else
                  {
                    i2 = m;
                    if (n == R.styleable.GenericDraweeHierarchy_roundingBorderWidth)
                    {
                      getRoundingParams(paramGenericDraweeHierarchyBuilder).setBorderWidth(localTypedArray.getDimensionPixelSize(n, 0));
                      i1 = j;
                      bool9 = bool1;
                      bool10 = bool2;
                      bool11 = bool3;
                      bool12 = bool4;
                      bool13 = bool5;
                      bool14 = bool6;
                      bool15 = bool7;
                      bool16 = bool8;
                      m = i2;
                    }
                    else
                    {
                      if (n != R.styleable.GenericDraweeHierarchy_roundingBorderColor) {
                        break;
                      }
                      getRoundingParams(paramGenericDraweeHierarchyBuilder).setBorderColor(localTypedArray.getColor(n, 0));
                      i1 = j;
                      bool9 = bool1;
                      bool10 = bool2;
                      bool11 = bool3;
                      bool12 = bool4;
                      bool13 = bool5;
                      bool14 = bool6;
                      bool15 = bool7;
                      bool16 = bool8;
                      m = i2;
                    }
                  }
                }
              }
              i1 = j;
              bool9 = bool1;
              bool10 = bool2;
              bool11 = bool3;
              bool12 = bool4;
              bool13 = bool5;
              bool14 = bool6;
              bool15 = bool7;
              bool16 = bool8;
              m = i2;
            } while (n != R.styleable.GenericDraweeHierarchy_roundingBorderPadding);
            getRoundingParams(paramGenericDraweeHierarchyBuilder).setPadding(localTypedArray.getDimensionPixelSize(n, 0));
            m = i2;
            label1571:
            k++;
          }
          finally
          {
            break label1838;
          }
        }
      }
      int i3 = 0;
      localTypedArray.recycle();
      int i4;
      if (paramContext.getResources().getConfiguration().getLayoutDirection() == 1)
      {
        if ((bool1) && (bool4)) {
          k = 1;
        } else {
          k = 0;
        }
        if ((bool3) && (bool2)) {
          n = 1;
        } else {
          n = 0;
        }
        if ((bool5) && (bool8)) {
          i4 = 1;
        } else {
          i4 = 0;
        }
        i = k;
        i2 = n;
        i1 = i4;
        i5 = i3;
        if (!bool7) {
          break label1826;
        }
        i = k;
        i2 = n;
        i1 = i4;
        i5 = i3;
        if (!bool6) {
          break label1826;
        }
        i2 = n;
        i1 = i4;
      }
      else
      {
        if ((bool1) && (bool2)) {
          k = 1;
        } else {
          k = 0;
        }
        if ((bool3) && (bool4)) {
          n = 1;
        } else {
          n = 0;
        }
        if ((bool5) && (bool6)) {
          i4 = 1;
        } else {
          i4 = 0;
        }
        i = k;
        i2 = n;
        i1 = i4;
        i5 = i3;
        if (!bool7) {
          break label1826;
        }
        i = k;
        i2 = n;
        i1 = i4;
        i5 = i3;
        if (!bool8) {
          break label1826;
        }
        i1 = i4;
        i2 = n;
      }
      i5 = 1;
      i = k;
      label1826:
      k = m;
      m = i;
    }
    finally
    {
      label1838:
      localTypedArray.recycle();
      paramContext.getResources().getConfiguration().getLayoutDirection();
    }
    int i1 = 1;
    int m = i1;
    int i5 = m;
    int k = 0;
    if ((paramGenericDraweeHierarchyBuilder.getProgressBarImage() != null) && (j > 0)) {
      paramGenericDraweeHierarchyBuilder.setProgressBarImage(new AutoRotateDrawable(paramGenericDraweeHierarchyBuilder.getProgressBarImage(), j));
    }
    if (k > 0)
    {
      paramContext = getRoundingParams(paramGenericDraweeHierarchyBuilder);
      float f1;
      if (m != 0) {
        f1 = k;
      } else {
        f1 = 0.0F;
      }
      float f2;
      if (i2 != 0) {
        f2 = k;
      } else {
        f2 = 0.0F;
      }
      float f3;
      if (i1 != 0) {
        f3 = k;
      } else {
        f3 = 0.0F;
      }
      float f4;
      if (i5 != 0) {
        f4 = k;
      } else {
        f4 = 0.0F;
      }
      paramContext.setCornersRadii(f1, f2, f3, f4);
    }
    return paramGenericDraweeHierarchyBuilder;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.generic.GenericDraweeHierarchyInflater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */