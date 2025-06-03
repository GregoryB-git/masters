package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;

class CamColor
{
  private static final float CHROMA_SEARCH_ENDPOINT = 0.4F;
  private static final float DE_MAX = 1.0F;
  private static final float DL_MAX = 0.2F;
  private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01F;
  private final float mAstar;
  private final float mBstar;
  private final float mChroma;
  private final float mHue;
  private final float mJ;
  private final float mJstar;
  private final float mM;
  private final float mQ;
  private final float mS;
  
  public CamColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    mHue = paramFloat1;
    mChroma = paramFloat2;
    mJ = paramFloat3;
    mQ = paramFloat4;
    mM = paramFloat5;
    mS = paramFloat6;
    mJstar = paramFloat7;
    mAstar = paramFloat8;
    mBstar = paramFloat9;
  }
  
  @Nullable
  private static CamColor findCamByJ(@FloatRange(from=0.0D, to=360.0D) float paramFloat1, @FloatRange(from=0.0D, to=Double.POSITIVE_INFINITY, toInclusive=false) float paramFloat2, @FloatRange(from=0.0D, to=100.0D) float paramFloat3)
  {
    float f1 = 1000.0F;
    float f2 = 0.0F;
    Object localObject1 = null;
    float f3 = 100.0F;
    float f4 = 1000.0F;
    Object localObject2;
    for (;;)
    {
      localObject2 = localObject1;
      if (Math.abs(f2 - f3) <= 0.01F) {
        break;
      }
      float f5 = (f3 - f2) / 2.0F + f2;
      int i = fromJch(f5, paramFloat2, paramFloat1).viewedInSrgb();
      float f6 = CamUtils.lStarFromInt(i);
      float f7 = Math.abs(paramFloat3 - f6);
      float f8 = f1;
      float f9 = f4;
      localObject2 = localObject1;
      if (f7 < 0.2F)
      {
        CamColor localCamColor = fromColor(i);
        float f10 = localCamColor.distance(fromJch(localCamColor.getJ(), localCamColor.getChroma(), paramFloat1));
        f8 = f1;
        f9 = f4;
        localObject2 = localObject1;
        if (f10 <= 1.0F)
        {
          localObject2 = localCamColor;
          f8 = f7;
          f9 = f10;
        }
      }
      if ((f8 == 0.0F) && (f9 == 0.0F)) {
        break;
      }
      if (f6 < paramFloat3)
      {
        f2 = f5;
        f1 = f8;
        f4 = f9;
        localObject1 = localObject2;
      }
      else
      {
        f3 = f5;
        f1 = f8;
        f4 = f9;
        localObject1 = localObject2;
      }
    }
    return (CamColor)localObject2;
  }
  
  @NonNull
  public static CamColor fromColor(@ColorInt int paramInt)
  {
    return fromColorInViewingConditions(paramInt, ViewingConditions.DEFAULT);
  }
  
  @NonNull
  public static CamColor fromColorInViewingConditions(@ColorInt int paramInt, @NonNull ViewingConditions paramViewingConditions)
  {
    float[] arrayOfFloat = CamUtils.xyzFromInt(paramInt);
    Object localObject1 = CamUtils.XYZ_TO_CAM16RGB;
    float f1 = arrayOfFloat[0];
    Object localObject2 = localObject1[0];
    float f2 = localObject2[0];
    float f3 = arrayOfFloat[1];
    float f4 = localObject2[1];
    float f5 = arrayOfFloat[2];
    float f6 = localObject2[2];
    arrayOfFloat = localObject1[1];
    float f7 = arrayOfFloat[0];
    float f8 = arrayOfFloat[1];
    float f9 = arrayOfFloat[2];
    localObject1 = localObject1[2];
    float f10 = localObject1[0];
    float f11 = localObject1[1];
    float f12 = localObject1[2];
    f2 = paramViewingConditions.getRgbD()[0] * (f6 * f5 + (f4 * f3 + f2 * f1));
    f8 = paramViewingConditions.getRgbD()[1] * (f9 * f5 + (f8 * f3 + f7 * f1));
    f11 = paramViewingConditions.getRgbD()[2] * (f5 * f12 + (f3 * f11 + f1 * f10));
    f3 = paramViewingConditions.getFl();
    f1 = (float)Math.pow(Math.abs(f2) * f3 / 100.0D, 0.42D);
    f3 = paramViewingConditions.getFl();
    f3 = (float)Math.pow(Math.abs(f8) * f3 / 100.0D, 0.42D);
    f10 = paramViewingConditions.getFl();
    f10 = (float)Math.pow(Math.abs(f11) * f10 / 100.0D, 0.42D);
    f2 = Math.signum(f2) * 400.0F * f1 / (f1 + 27.13F);
    f1 = Math.signum(f8) * 400.0F * f3 / (f3 + 27.13F);
    f8 = Math.signum(f11) * 400.0F * f10 / (f10 + 27.13F);
    double d1 = f2;
    double d2 = f1;
    double d3 = f8;
    f11 = (float)(d2 * -12.0D + d1 * 11.0D + d3) / 11.0F;
    f3 = (float)(f2 + f1 - d3 * 2.0D) / 9.0F;
    f1 *= 20.0F;
    f5 = (21.0F * f8 + (f2 * 20.0F + f1)) / 20.0F;
    f10 = (f2 * 40.0F + f1 + f8) / 20.0F;
    f8 = (float)Math.atan2(f3, f11) * 180.0F / 3.1415927F;
    if (f8 < 0.0F) {
      f2 = f8 + 360.0F;
    }
    for (;;)
    {
      break;
      f2 = f8;
      if (f8 >= 360.0F) {
        f2 = f8 - 360.0F;
      }
    }
    f1 = 3.1415927F * f2 / 180.0F;
    f12 = (float)Math.pow(f10 * paramViewingConditions.getNbb() / paramViewingConditions.getAw(), paramViewingConditions.getC() * paramViewingConditions.getZ()) * 100.0F;
    f6 = 4.0F / paramViewingConditions.getC();
    f10 = (float)Math.sqrt(f12 / 100.0F);
    f7 = paramViewingConditions.getAw();
    f9 = paramViewingConditions.getFlRoot();
    if (f2 < 20.14D) {
      f8 = 360.0F + f2;
    } else {
      f8 = f2;
    }
    f8 = (float)(Math.cos(f8 * 3.141592653589793D / 180.0D + 2.0D) + 3.8D) * 0.25F * 3846.1538F * paramViewingConditions.getNc() * paramViewingConditions.getNcb() * (float)Math.sqrt(f3 * f3 + f11 * f11) / (f5 + 0.305F);
    f3 = (float)Math.pow(1.64D - Math.pow(0.29D, paramViewingConditions.getN()), 0.73D) * (float)Math.pow(f8, 0.9D);
    f8 = f3 * (float)Math.sqrt(f12 / 100.0D);
    f11 = f8 * paramViewingConditions.getFlRoot();
    f3 = (float)Math.sqrt(f3 * paramViewingConditions.getC() / (paramViewingConditions.getAw() + 4.0F));
    f4 = 1.7F * f12 / (0.007F * f12 + 1.0F);
    f5 = (float)Math.log(0.0228F * f11 + 1.0F) * 43.85965F;
    d1 = f1;
    return new CamColor(f2, f8, f12, (f7 + 4.0F) * (f6 * f10) * f9, f11, f3 * 50.0F, f4, f5 * (float)Math.cos(d1), f5 * (float)Math.sin(d1));
  }
  
  @NonNull
  private static CamColor fromJch(@FloatRange(from=0.0D, to=100.0D) float paramFloat1, @FloatRange(from=0.0D, to=Double.POSITIVE_INFINITY, toInclusive=false) float paramFloat2, @FloatRange(from=0.0D, to=360.0D) float paramFloat3)
  {
    return fromJchInFrame(paramFloat1, paramFloat2, paramFloat3, ViewingConditions.DEFAULT);
  }
  
  @NonNull
  private static CamColor fromJchInFrame(@FloatRange(from=0.0D, to=100.0D) float paramFloat1, @FloatRange(from=0.0D, to=Double.POSITIVE_INFINITY, toInclusive=false) float paramFloat2, @FloatRange(from=0.0D, to=360.0D) float paramFloat3, ViewingConditions paramViewingConditions)
  {
    float f1 = 4.0F / paramViewingConditions.getC();
    double d = paramFloat1 / 100.0D;
    float f2 = (float)Math.sqrt(d);
    float f3 = paramViewingConditions.getAw();
    float f4 = paramViewingConditions.getFlRoot();
    float f5 = paramFloat2 * paramViewingConditions.getFlRoot();
    float f6 = (float)Math.sqrt(paramFloat2 / (float)Math.sqrt(d) * paramViewingConditions.getC() / (paramViewingConditions.getAw() + 4.0F));
    float f7 = 3.1415927F * paramFloat3 / 180.0F;
    float f8 = 1.7F * paramFloat1 / (0.007F * paramFloat1 + 1.0F);
    float f9 = (float)Math.log(f5 * 0.0228D + 1.0D) * 43.85965F;
    d = f7;
    return new CamColor(paramFloat3, paramFloat2, paramFloat1, (f3 + 4.0F) * (f1 * f2) * f4, f5, f6 * 50.0F, f8, f9 * (float)Math.cos(d), f9 * (float)Math.sin(d));
  }
  
  public static int toColor(@FloatRange(from=0.0D, to=360.0D) float paramFloat1, @FloatRange(from=0.0D, to=Double.POSITIVE_INFINITY, toInclusive=false) float paramFloat2, @FloatRange(from=0.0D, to=100.0D) float paramFloat3)
  {
    return toColor(paramFloat1, paramFloat2, paramFloat3, ViewingConditions.DEFAULT);
  }
  
  @ColorInt
  public static int toColor(@FloatRange(from=0.0D, to=360.0D) float paramFloat1, @FloatRange(from=0.0D, to=Double.POSITIVE_INFINITY, toInclusive=false) float paramFloat2, @FloatRange(from=0.0D, to=100.0D) float paramFloat3, @NonNull ViewingConditions paramViewingConditions)
  {
    if ((paramFloat2 >= 1.0D) && (Math.round(paramFloat3) > 0.0D) && (Math.round(paramFloat3) < 100.0D))
    {
      float f1;
      if (paramFloat1 < 0.0F) {
        f1 = 0.0F;
      } else {
        f1 = Math.min(360.0F, paramFloat1);
      }
      Object localObject = null;
      int i = 1;
      float f2 = 0.0F;
      paramFloat1 = paramFloat2;
      if (Math.abs(f2 - paramFloat2) >= 0.4F)
      {
        CamColor localCamColor = findCamByJ(f1, paramFloat1, paramFloat3);
        if (i != 0)
        {
          if (localCamColor != null) {
            return localCamColor.viewed(paramViewingConditions);
          }
          i = 0;
        }
        for (;;)
        {
          paramFloat1 = (paramFloat2 - f2) / 2.0F + f2;
          break;
          if (localCamColor == null)
          {
            paramFloat2 = paramFloat1;
          }
          else
          {
            localObject = localCamColor;
            f2 = paramFloat1;
          }
        }
      }
      if (localObject == null) {
        return CamUtils.intFromLStar(paramFloat3);
      }
      return ((CamColor)localObject).viewed(paramViewingConditions);
    }
    return CamUtils.intFromLStar(paramFloat3);
  }
  
  public float distance(@NonNull CamColor paramCamColor)
  {
    float f1 = getJStar() - paramCamColor.getJStar();
    float f2 = getAStar() - paramCamColor.getAStar();
    float f3 = getBStar() - paramCamColor.getBStar();
    return (float)(Math.pow(Math.sqrt(f3 * f3 + (f2 * f2 + f1 * f1)), 0.63D) * 1.41D);
  }
  
  @FloatRange(from=Double.NEGATIVE_INFINITY, fromInclusive=false, to=Double.POSITIVE_INFINITY, toInclusive=false)
  public float getAStar()
  {
    return mAstar;
  }
  
  @FloatRange(from=Double.NEGATIVE_INFINITY, fromInclusive=false, to=Double.POSITIVE_INFINITY, toInclusive=false)
  public float getBStar()
  {
    return mBstar;
  }
  
  @FloatRange(from=0.0D, to=Double.POSITIVE_INFINITY, toInclusive=false)
  public float getChroma()
  {
    return mChroma;
  }
  
  @FloatRange(from=0.0D, to=360.0D, toInclusive=false)
  public float getHue()
  {
    return mHue;
  }
  
  @FloatRange(from=0.0D, to=100.0D)
  public float getJ()
  {
    return mJ;
  }
  
  @FloatRange(from=0.0D, to=100.0D)
  public float getJStar()
  {
    return mJstar;
  }
  
  @FloatRange(from=0.0D, to=Double.POSITIVE_INFINITY, toInclusive=false)
  public float getM()
  {
    return mM;
  }
  
  @FloatRange(from=0.0D, to=Double.POSITIVE_INFINITY, toInclusive=false)
  public float getQ()
  {
    return mQ;
  }
  
  @FloatRange(from=0.0D, to=Double.POSITIVE_INFINITY, toInclusive=false)
  public float getS()
  {
    return mS;
  }
  
  @ColorInt
  public int viewed(@NonNull ViewingConditions paramViewingConditions)
  {
    if ((getChroma() != 0.0D) && (getJ() != 0.0D)) {
      f1 = getChroma() / (float)Math.sqrt(getJ() / 100.0D);
    } else {
      f1 = 0.0F;
    }
    float f2 = (float)Math.pow(f1 / Math.pow(1.64D - Math.pow(0.29D, paramViewingConditions.getN()), 0.73D), 1.1111111111111112D);
    double d = getHue() * 3.1415927F / 180.0F;
    float f3 = (float)(Math.cos(2.0D + d) + 3.8D);
    float f1 = paramViewingConditions.getAw();
    float f4 = (float)Math.pow(getJ() / 100.0D, 1.0D / paramViewingConditions.getC() / paramViewingConditions.getZ());
    float f5 = paramViewingConditions.getNc();
    float f6 = paramViewingConditions.getNcb();
    f1 = f1 * f4 / paramViewingConditions.getNbb();
    f4 = (float)Math.sin(d);
    float f7 = (float)Math.cos(d);
    f2 = (0.305F + f1) * 23.0F * f2 / (f2 * 108.0F * f4 + (11.0F * f2 * f7 + f3 * 0.25F * 3846.1538F * f5 * f6 * 23.0F));
    f3 = f7 * f2;
    f6 = f2 * f4;
    f4 = f1 * 460.0F;
    f1 = (288.0F * f6 + (451.0F * f3 + f4)) / 1403.0F;
    f2 = (f4 - 891.0F * f3 - 261.0F * f6) / 1403.0F;
    f5 = (f4 - f3 * 220.0F - f6 * 6300.0F) / 1403.0F;
    f6 = (float)Math.max(0.0D, Math.abs(f1) * 27.13D / (400.0D - Math.abs(f1)));
    f1 = Math.signum(f1);
    f3 = 100.0F / paramViewingConditions.getFl();
    f6 = (float)Math.pow(f6, 2.380952380952381D);
    f7 = (float)Math.max(0.0D, Math.abs(f2) * 27.13D / (400.0D - Math.abs(f2)));
    f4 = Math.signum(f2);
    f2 = 100.0F / paramViewingConditions.getFl();
    float f8 = (float)Math.pow(f7, 2.380952380952381D);
    float f9 = (float)Math.max(0.0D, Math.abs(f5) * 27.13D / (400.0D - Math.abs(f5)));
    f7 = Math.signum(f5);
    f5 = 100.0F / paramViewingConditions.getFl();
    f9 = (float)Math.pow(f9, 2.380952380952381D);
    f1 = f3 * f1 * f6 / paramViewingConditions.getRgbD()[0];
    f3 = f2 * f4 * f8 / paramViewingConditions.getRgbD()[1];
    float f10 = f5 * f7 * f9 / paramViewingConditions.getRgbD()[2];
    paramViewingConditions = CamUtils.CAM16RGB_TO_XYZ;
    Object localObject = paramViewingConditions[0];
    f4 = localObject[0];
    f2 = localObject[1];
    f9 = localObject[2];
    localObject = paramViewingConditions[1];
    f5 = localObject[0];
    float f11 = localObject[1];
    float f12 = localObject[2];
    paramViewingConditions = paramViewingConditions[2];
    f6 = paramViewingConditions[0];
    f8 = paramViewingConditions[1];
    f7 = paramViewingConditions[2];
    return ColorUtils.XYZToColor(f9 * f10 + (f2 * f3 + f4 * f1), f12 * f10 + (f11 * f3 + f5 * f1), f10 * f7 + (f3 * f8 + f1 * f6));
  }
  
  @ColorInt
  public int viewedInSrgb()
  {
    return viewed(ViewingConditions.DEFAULT);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.CamColor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */