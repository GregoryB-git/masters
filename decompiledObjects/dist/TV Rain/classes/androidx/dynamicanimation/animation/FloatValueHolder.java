package androidx.dynamicanimation.animation;

public final class FloatValueHolder
{
  private float mValue = 0.0F;
  
  public FloatValueHolder() {}
  
  public FloatValueHolder(float paramFloat)
  {
    setValue(paramFloat);
  }
  
  public float getValue()
  {
    return mValue;
  }
  
  public void setValue(float paramFloat)
  {
    mValue = paramFloat;
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.FloatValueHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */