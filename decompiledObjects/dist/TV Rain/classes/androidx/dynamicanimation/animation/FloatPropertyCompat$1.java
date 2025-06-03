package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import android.util.Property;

final class FloatPropertyCompat$1
  extends FloatPropertyCompat<T>
{
  public FloatPropertyCompat$1(String paramString, FloatProperty paramFloatProperty)
  {
    super(paramString);
  }
  
  public float getValue(T paramT)
  {
    return ((Float)val$property.get(paramT)).floatValue();
  }
  
  public void setValue(T paramT, float paramFloat)
  {
    val$property.setValue(paramT, paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.FloatPropertyCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */