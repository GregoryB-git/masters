package androidx.core.content.res;

import androidx.annotation.NonNull;

final class ViewingConditions
{
  public static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float)(CamUtils.yFromLStar(50.0F) * 63.66197723675813D / 100.0D), 50.0F, 2.0F, false);
  private final float mAw;
  private final float mC;
  private final float mFl;
  private final float mFlRoot;
  private final float mN;
  private final float mNbb;
  private final float mNc;
  private final float mNcb;
  private final float[] mRgbD;
  private final float mZ;
  
  private ViewingConditions(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float[] paramArrayOfFloat, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    mN = paramFloat1;
    mAw = paramFloat2;
    mNbb = paramFloat3;
    mNcb = paramFloat4;
    mC = paramFloat5;
    mNc = paramFloat6;
    mRgbD = paramArrayOfFloat;
    mFl = paramFloat7;
    mFlRoot = paramFloat8;
    mZ = paramFloat9;
  }
  
  @NonNull
  public static ViewingConditions make(@NonNull float[] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
  {
    Object localObject1 = CamUtils.XYZ_TO_CAM16RGB;
    float f1 = paramArrayOfFloat[0];
    Object localObject2 = localObject1[0];
    float f2 = localObject2[0];
    float f3 = paramArrayOfFloat[1];
    float f4 = localObject2[1];
    float f5 = paramArrayOfFloat[2];
    f2 = localObject2[2] * f5 + (f4 * f3 + f2 * f1);
    localObject2 = localObject1[1];
    float f6 = localObject2[0];
    f4 = localObject2[1];
    f4 = localObject2[2] * f5 + (f4 * f3 + f6 * f1);
    localObject1 = localObject1[2];
    float f7 = localObject1[0];
    f6 = localObject1[1];
    f3 = f5 * localObject1[2] + (f3 * f6 + f1 * f7);
    f5 = paramFloat3 / 10.0F + 0.8F;
    if (f5 >= 0.9D) {
      f1 = CamUtils.lerp(0.59F, 0.69F, (f5 - 0.9F) * 10.0F);
    } else {
      f1 = CamUtils.lerp(0.525F, 0.59F, (f5 - 0.8F) * 10.0F);
    }
    if (paramBoolean) {
      paramFloat3 = 1.0F;
    } else {
      paramFloat3 = (1.0F - (float)Math.exp((-paramFloat1 - 42.0F) / 92.0F) * 0.2777778F) * f5;
    }
    double d = paramFloat3;
    if (d > 1.0D) {
      paramFloat3 = 1.0F;
    } else if (d < 0.0D) {
      paramFloat3 = 0.0F;
    }
    localObject1 = new float[3];
    localObject1[0] = (100.0F / f2 * paramFloat3 + 1.0F - paramFloat3);
    localObject1[1] = (100.0F / f4 * paramFloat3 + 1.0F - paramFloat3);
    localObject1[2] = (100.0F / f3 * paramFloat3 + 1.0F - paramFloat3);
    paramFloat3 = 1.0F / (5.0F * paramFloat1 + 1.0F);
    f6 = paramFloat3 * paramFloat3 * paramFloat3 * paramFloat3;
    paramFloat3 = 1.0F - f6;
    paramFloat1 = 0.1F * paramFloat3 * paramFloat3 * (float)Math.cbrt(paramFloat1 * 5.0D) + f6 * paramFloat1;
    paramFloat3 = CamUtils.yFromLStar(paramFloat2) / paramArrayOfFloat[1];
    d = paramFloat3;
    f6 = (float)Math.sqrt(d);
    paramFloat2 = 0.725F / (float)Math.pow(d, 0.2D);
    paramArrayOfFloat = new float[3];
    paramArrayOfFloat[0] = ((float)Math.pow(localObject1[0] * paramFloat1 * f2 / 100.0D, 0.42D));
    paramArrayOfFloat[1] = ((float)Math.pow(localObject1[1] * paramFloat1 * f4 / 100.0D, 0.42D));
    f2 = (float)Math.pow(localObject1[2] * paramFloat1 * f3 / 100.0D, 0.42D);
    paramArrayOfFloat[2] = f2;
    f4 = paramArrayOfFloat[0];
    f4 = f4 * 400.0F / (f4 + 27.13F);
    f3 = paramArrayOfFloat[1];
    f3 = f3 * 400.0F / (f3 + 27.13F);
    return new ViewingConditions(paramFloat3, (400.0F * f2 / (f2 + 27.13F) * 0.05F + (f4 * 2.0F + f3)) * paramFloat2, paramFloat2, paramFloat2, f1, f5, (float[])localObject1, paramFloat1, (float)Math.pow(paramFloat1, 0.25D), f6 + 1.48F);
  }
  
  public float getAw()
  {
    return mAw;
  }
  
  public float getC()
  {
    return mC;
  }
  
  public float getFl()
  {
    return mFl;
  }
  
  public float getFlRoot()
  {
    return mFlRoot;
  }
  
  public float getN()
  {
    return mN;
  }
  
  public float getNbb()
  {
    return mNbb;
  }
  
  public float getNc()
  {
    return mNc;
  }
  
  public float getNcb()
  {
    return mNcb;
  }
  
  @NonNull
  public float[] getRgbD()
  {
    return mRgbD;
  }
  
  public float getZ()
  {
    return mZ;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.ViewingConditions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */