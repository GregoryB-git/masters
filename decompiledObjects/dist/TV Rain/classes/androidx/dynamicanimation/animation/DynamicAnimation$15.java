package androidx.dynamicanimation.animation;

class DynamicAnimation$15
  extends FloatPropertyCompat
{
  public DynamicAnimation$15(DynamicAnimation paramDynamicAnimation, String paramString, FloatValueHolder paramFloatValueHolder)
  {
    super(paramString);
  }
  
  public float getValue(Object paramObject)
  {
    return val$floatValueHolder.getValue();
  }
  
  public void setValue(Object paramObject, float paramFloat)
  {
    val$floatValueHolder.setValue(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation.15
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */