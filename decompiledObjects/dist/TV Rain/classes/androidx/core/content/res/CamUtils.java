package androidx.core.content.res;

import a;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;

final class CamUtils
{
  public static final float[][] CAM16RGB_TO_XYZ;
  public static final float[][] SRGB_TO_XYZ = { { 0.41233894F, 0.35762063F, 0.18051042F }, { 0.2126F, 0.7152F, 0.0722F }, { 0.01932141F, 0.11916382F, 0.9503448F } };
  public static final float[] WHITE_POINT_D65;
  public static final float[][] XYZ_TO_CAM16RGB = { { 0.401288F, 0.650173F, -0.051461F }, { -0.250268F, 1.204414F, 0.045854F }, { -0.002079F, 0.048952F, 0.953127F } };
  
  static
  {
    CAM16RGB_TO_XYZ = new float[][] { { 1.8620678F, -1.0112547F, 0.14918678F }, { 0.38752654F, 0.62144744F, -0.00897398F }, { -0.0158415F, -0.03412294F, 1.0499644F } };
    WHITE_POINT_D65 = new float[] { 95.047F, 100.0F, 108.883F };
  }
  
  public static int intFromLStar(float paramFloat)
  {
    if (paramFloat < 1.0F) {
      return -16777216;
    }
    if (paramFloat > 99.0F) {
      return -1;
    }
    float f1 = (paramFloat + 16.0F) / 116.0F;
    int i;
    if (paramFloat > 8.0F) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      paramFloat = f1 * f1 * f1;
    } else {
      paramFloat /= 903.2963F;
    }
    float f2 = f1 * f1 * f1;
    if (f2 > 0.008856452F) {
      i = 1;
    } else {
      i = 0;
    }
    float f3;
    if (i != 0) {
      f3 = f2;
    } else {
      f3 = (f1 * 116.0F - 16.0F) / 903.2963F;
    }
    if (i == 0) {
      f2 = (f1 * 116.0F - 16.0F) / 903.2963F;
    }
    float[] arrayOfFloat = WHITE_POINT_D65;
    return ColorUtils.XYZToColor(f3 * arrayOfFloat[0], paramFloat * arrayOfFloat[1], f2 * arrayOfFloat[2]);
  }
  
  public static float lStarFromInt(int paramInt)
  {
    return lStarFromY(yFromInt(paramInt));
  }
  
  public static float lStarFromY(float paramFloat)
  {
    paramFloat /= 100.0F;
    if (paramFloat <= 0.008856452F) {
      return paramFloat * 903.2963F;
    }
    return (float)Math.cbrt(paramFloat) * 116.0F - 16.0F;
  }
  
  public static float lerp(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return a.a(paramFloat2, paramFloat1, paramFloat3, paramFloat1);
  }
  
  public static float linearized(int paramInt)
  {
    float f = paramInt / 255.0F;
    if (f <= 0.04045F) {}
    for (f /= 12.92F;; f = (float)Math.pow((f + 0.055F) / 1.055F, 2.4000000953674316D)) {
      return f * 100.0F;
    }
  }
  
  @NonNull
  public static float[] xyzFromInt(int paramInt)
  {
    float f1 = linearized(Color.red(paramInt));
    float f2 = linearized(Color.green(paramInt));
    float f3 = linearized(Color.blue(paramInt));
    Object localObject1 = SRGB_TO_XYZ;
    Object localObject2 = localObject1[0];
    float f4 = localObject2[0];
    float f5 = localObject2[1];
    float f6 = localObject2[2];
    localObject2 = localObject1[1];
    float f7 = localObject2[0];
    float f8 = localObject2[1];
    float f9 = localObject2[2];
    localObject1 = localObject1[2];
    float f10 = localObject1[0];
    float f11 = localObject1[1];
    return new float[] { f6 * f3 + (f5 * f2 + f4 * f1), f9 * f3 + (f8 * f2 + f7 * f1), f3 * localObject1[2] + (f2 * f11 + f1 * f10) };
  }
  
  public static float yFromInt(int paramInt)
  {
    float f1 = linearized(Color.red(paramInt));
    float f2 = linearized(Color.green(paramInt));
    float f3 = linearized(Color.blue(paramInt));
    float[] arrayOfFloat = SRGB_TO_XYZ[1];
    float f4 = arrayOfFloat[0];
    float f5 = arrayOfFloat[1];
    return f3 * arrayOfFloat[2] + (f2 * f5 + f1 * f4);
  }
  
  public static float yFromLStar(float paramFloat)
  {
    if (paramFloat > 8.0F) {}
    for (paramFloat = (float)Math.pow((paramFloat + 16.0D) / 116.0D, 3.0D);; paramFloat /= 903.2963F) {
      return paramFloat * 100.0F;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.CamUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */