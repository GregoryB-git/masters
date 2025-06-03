package androidx.constraintlayout.core.motion.utils;

class SplineSet$CoreSpline
  extends SplineSet
{
  public long start;
  public String type;
  
  public SplineSet$CoreSpline(String paramString, long paramLong)
  {
    type = paramString;
    start = paramLong;
  }
  
  public void setProperty(TypedValues paramTypedValues, float paramFloat)
  {
    paramTypedValues.setValue(paramTypedValues.getId(type), get(paramFloat));
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.SplineSet.CoreSpline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */