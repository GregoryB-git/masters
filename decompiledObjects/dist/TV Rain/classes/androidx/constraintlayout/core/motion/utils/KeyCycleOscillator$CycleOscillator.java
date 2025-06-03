package androidx.constraintlayout.core.motion.utils;

class KeyCycleOscillator$CycleOscillator
{
  private static final String TAG = "CycleOscillator";
  public static final int UNSET = -1;
  private final int OFFST;
  private final int PHASE;
  private final int VALUE;
  public CurveFit mCurveFit;
  public float[] mOffset;
  public Oscillator mOscillator;
  public float mPathLength;
  public float[] mPeriod;
  public float[] mPhase;
  public double[] mPosition;
  public float[] mScale;
  public double[] mSplineSlopeCache;
  public double[] mSplineValueCache;
  public float[] mValues;
  private final int mVariesBy;
  public int mWaveShape;
  
  public KeyCycleOscillator$CycleOscillator(int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    Oscillator localOscillator = new Oscillator();
    mOscillator = localOscillator;
    OFFST = 0;
    PHASE = 1;
    VALUE = 2;
    mWaveShape = paramInt1;
    mVariesBy = paramInt2;
    localOscillator.setType(paramInt1, paramString);
    mValues = new float[paramInt3];
    mPosition = new double[paramInt3];
    mPeriod = new float[paramInt3];
    mOffset = new float[paramInt3];
    mPhase = new float[paramInt3];
    mScale = new float[paramInt3];
  }
  
  public double getLastPhase()
  {
    return mSplineValueCache[1];
  }
  
  public double getSlope(float paramFloat)
  {
    Object localObject = mCurveFit;
    if (localObject != null)
    {
      d1 = paramFloat;
      ((CurveFit)localObject).getSlope(d1, mSplineSlopeCache);
      mCurveFit.getPos(d1, mSplineValueCache);
    }
    else
    {
      localObject = mSplineSlopeCache;
      localObject[0] = 0.0D;
      localObject[1] = 0.0D;
      localObject[2] = 0.0D;
    }
    localObject = mOscillator;
    double d2 = paramFloat;
    double d1 = ((Oscillator)localObject).getValue(d2, mSplineValueCache[1]);
    double d3 = mOscillator.getSlope(d2, mSplineValueCache[1], mSplineSlopeCache[1]);
    localObject = mSplineSlopeCache;
    d2 = localObject[0];
    double d4 = localObject[2];
    return d3 * mSplineValueCache[2] + (d1 * d4 + d2);
  }
  
  public double getValues(float paramFloat)
  {
    Object localObject = mCurveFit;
    if (localObject != null)
    {
      ((CurveFit)localObject).getPos(paramFloat, mSplineValueCache);
    }
    else
    {
      localObject = mSplineValueCache;
      localObject[0] = mOffset[0];
      localObject[1] = mPhase[0];
      localObject[2] = mValues[0];
    }
    localObject = mSplineValueCache;
    double d1 = localObject[0];
    double d2 = localObject[1];
    return mOscillator.getValue(paramFloat, d2) * mSplineValueCache[2] + d1;
  }
  
  public void setPoint(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    mPosition[paramInt1] = (paramInt2 / 100.0D);
    mPeriod[paramInt1] = paramFloat1;
    mOffset[paramInt1] = paramFloat2;
    mPhase[paramInt1] = paramFloat3;
    mValues[paramInt1] = paramFloat4;
  }
  
  public void setup(float paramFloat)
  {
    mPathLength = paramFloat;
    int i = mPosition.length;
    double[][] arrayOfDouble = new double[i][3];
    Object localObject = mValues;
    mSplineValueCache = new double[localObject.length + 2];
    mSplineSlopeCache = new double[localObject.length + 2];
    if (mPosition[0] > 0.0D) {
      mOscillator.addPoint(0.0D, mPeriod[0]);
    }
    localObject = mPosition;
    i = localObject.length - 1;
    if (localObject[i] < 1.0D) {
      mOscillator.addPoint(1.0D, mPeriod[i]);
    }
    for (i = 0; i < arrayOfDouble.length; i++)
    {
      localObject = arrayOfDouble[i];
      localObject[0] = mOffset[i];
      localObject[1] = mPhase[i];
      localObject[2] = mValues[i];
      mOscillator.addPoint(mPosition[i], mPeriod[i]);
    }
    mOscillator.normalize();
    localObject = mPosition;
    if (localObject.length > 1) {
      mCurveFit = CurveFit.get(0, (double[])localObject, arrayOfDouble);
    } else {
      mCurveFit = null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CycleOscillator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */