package androidx.constraintlayout.core.motion.utils;

public class VelocityMatrix
{
  private static String TAG = "VelocityMatrix";
  public float mDRotate;
  public float mDScaleX;
  public float mDScaleY;
  public float mDTranslateX;
  public float mDTranslateY;
  public float mRotate;
  
  public void applyTransform(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float[] paramArrayOfFloat)
  {
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    paramFloat1 = (paramFloat1 - 0.5F) * 2.0F;
    float f3 = (paramFloat2 - 0.5F) * 2.0F;
    paramFloat2 = mDTranslateX;
    float f4 = mDTranslateY;
    float f5 = mDScaleX;
    float f6 = mDScaleY;
    float f7 = (float)Math.toRadians(mRotate);
    float f8 = (float)Math.toRadians(mDRotate);
    double d1 = -paramInt1 * paramFloat1;
    double d2 = f7;
    double d3 = Math.sin(d2);
    double d4 = paramInt2 * f3;
    f7 = (float)(d3 * d1 - Math.cos(d2) * d4);
    d1 = paramInt1 * paramFloat1;
    float f9 = (float)(Math.cos(d2) * d1 - Math.sin(d2) * d4);
    paramArrayOfFloat[0] = (f7 * f8 + (f5 * paramFloat1 + (f1 + paramFloat2)));
    paramArrayOfFloat[1] = (f8 * f9 + (f6 * f3 + (f2 + f4)));
  }
  
  public void clear()
  {
    mDRotate = 0.0F;
    mDTranslateY = 0.0F;
    mDTranslateX = 0.0F;
    mDScaleY = 0.0F;
    mDScaleX = 0.0F;
  }
  
  public void setRotationVelocity(KeyCycleOscillator paramKeyCycleOscillator, float paramFloat)
  {
    if (paramKeyCycleOscillator != null) {
      mDRotate = paramKeyCycleOscillator.getSlope(paramFloat);
    }
  }
  
  public void setRotationVelocity(SplineSet paramSplineSet, float paramFloat)
  {
    if (paramSplineSet != null)
    {
      mDRotate = paramSplineSet.getSlope(paramFloat);
      mRotate = paramSplineSet.get(paramFloat);
    }
  }
  
  public void setScaleVelocity(KeyCycleOscillator paramKeyCycleOscillator1, KeyCycleOscillator paramKeyCycleOscillator2, float paramFloat)
  {
    if (paramKeyCycleOscillator1 != null) {
      mDScaleX = paramKeyCycleOscillator1.getSlope(paramFloat);
    }
    if (paramKeyCycleOscillator2 != null) {
      mDScaleY = paramKeyCycleOscillator2.getSlope(paramFloat);
    }
  }
  
  public void setScaleVelocity(SplineSet paramSplineSet1, SplineSet paramSplineSet2, float paramFloat)
  {
    if (paramSplineSet1 != null) {
      mDScaleX = paramSplineSet1.getSlope(paramFloat);
    }
    if (paramSplineSet2 != null) {
      mDScaleY = paramSplineSet2.getSlope(paramFloat);
    }
  }
  
  public void setTranslationVelocity(KeyCycleOscillator paramKeyCycleOscillator1, KeyCycleOscillator paramKeyCycleOscillator2, float paramFloat)
  {
    if (paramKeyCycleOscillator1 != null) {
      mDTranslateX = paramKeyCycleOscillator1.getSlope(paramFloat);
    }
    if (paramKeyCycleOscillator2 != null) {
      mDTranslateY = paramKeyCycleOscillator2.getSlope(paramFloat);
    }
  }
  
  public void setTranslationVelocity(SplineSet paramSplineSet1, SplineSet paramSplineSet2, float paramFloat)
  {
    if (paramSplineSet1 != null) {
      mDTranslateX = paramSplineSet1.getSlope(paramFloat);
    }
    if (paramSplineSet2 != null) {
      mDTranslateY = paramSplineSet2.getSlope(paramFloat);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.VelocityMatrix
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */