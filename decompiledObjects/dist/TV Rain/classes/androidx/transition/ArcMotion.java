package androidx.transition;

import a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion
  extends PathMotion
{
  private static final float DEFAULT_MAX_ANGLE_DEGREES = 70.0F;
  private static final float DEFAULT_MAX_TANGENT = (float)Math.tan(Math.toRadians(35.0D));
  private static final float DEFAULT_MIN_ANGLE_DEGREES = 0.0F;
  private float mMaximumAngle = 70.0F;
  private float mMaximumTangent = DEFAULT_MAX_TANGENT;
  private float mMinimumHorizontalAngle = 0.0F;
  private float mMinimumHorizontalTangent = 0.0F;
  private float mMinimumVerticalAngle = 0.0F;
  private float mMinimumVerticalTangent = 0.0F;
  
  public ArcMotion() {}
  
  @SuppressLint({"RestrictedApi"})
  public ArcMotion(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Styleable.ARC_MOTION);
    paramAttributeSet = (XmlPullParser)paramAttributeSet;
    setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(paramContext, paramAttributeSet, "minimumVerticalAngle", 1, 0.0F));
    setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(paramContext, paramAttributeSet, "minimumHorizontalAngle", 0, 0.0F));
    setMaximumAngle(TypedArrayUtils.getNamedFloat(paramContext, paramAttributeSet, "maximumAngle", 2, 70.0F));
    paramContext.recycle();
  }
  
  private static float toTangent(float paramFloat)
  {
    if ((paramFloat >= 0.0F) && (paramFloat <= 90.0F)) {
      return (float)Math.tan(Math.toRadians(paramFloat / 2.0F));
    }
    throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
  }
  
  public float getMaximumAngle()
  {
    return mMaximumAngle;
  }
  
  public float getMinimumHorizontalAngle()
  {
    return mMinimumHorizontalAngle;
  }
  
  public float getMinimumVerticalAngle()
  {
    return mMinimumVerticalAngle;
  }
  
  public Path getPath(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Path localPath = new Path();
    localPath.moveTo(paramFloat1, paramFloat2);
    float f1 = paramFloat3 - paramFloat1;
    float f2 = paramFloat4 - paramFloat2;
    float f3 = f2 * f2 + f1 * f1;
    float f4 = (paramFloat1 + paramFloat3) / 2.0F;
    float f5 = (paramFloat2 + paramFloat4) / 2.0F;
    float f6 = 0.25F * f3;
    int i;
    if (paramFloat2 > paramFloat4) {
      i = 1;
    } else {
      i = 0;
    }
    if (Math.abs(f1) < Math.abs(f2))
    {
      f1 = Math.abs(f3 / (f2 * 2.0F));
      if (i != 0)
      {
        f1 += paramFloat4;
        f2 = paramFloat3;
      }
      else
      {
        f1 += paramFloat2;
        f2 = paramFloat1;
      }
      f3 = mMinimumVerticalTangent;
    }
    else
    {
      f2 = f3 / (f1 * 2.0F);
      if (i != 0)
      {
        f1 = paramFloat2;
        f2 += paramFloat1;
      }
      else
      {
        f2 = paramFloat3 - f2;
        f1 = paramFloat4;
      }
      f3 = mMinimumHorizontalTangent;
    }
    f3 = f6 * f3 * f3;
    float f7 = f4 - f2;
    float f8 = f5 - f1;
    f7 = f8 * f8 + f7 * f7;
    f8 = mMaximumTangent;
    f6 = f6 * f8 * f8;
    if (f7 >= f3) {
      if (f7 > f6) {
        f3 = f6;
      } else {
        f3 = 0.0F;
      }
    }
    f8 = f1;
    f6 = f2;
    if (f3 != 0.0F)
    {
      f3 = (float)Math.sqrt(f3 / f7);
      f6 = a.a(f2, f4, f3, f4);
      f8 = a.a(f1, f5, f3, f5);
    }
    localPath.cubicTo((paramFloat1 + f6) / 2.0F, (paramFloat2 + f8) / 2.0F, (f6 + paramFloat3) / 2.0F, (f8 + paramFloat4) / 2.0F, paramFloat3, paramFloat4);
    return localPath;
  }
  
  public void setMaximumAngle(float paramFloat)
  {
    mMaximumAngle = paramFloat;
    mMaximumTangent = toTangent(paramFloat);
  }
  
  public void setMinimumHorizontalAngle(float paramFloat)
  {
    mMinimumHorizontalAngle = paramFloat;
    mMinimumHorizontalTangent = toTangent(paramFloat);
  }
  
  public void setMinimumVerticalAngle(float paramFloat)
  {
    mMinimumVerticalAngle = paramFloat;
    mMinimumVerticalTangent = toTangent(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ArcMotion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */