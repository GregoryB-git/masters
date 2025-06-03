package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import android.util.Property;
import androidx.annotation.RequiresApi;

public abstract class FloatPropertyCompat<T>
{
  public final String mPropertyName;
  
  public FloatPropertyCompat(String paramString)
  {
    mPropertyName = paramString;
  }
  
  @RequiresApi(24)
  public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(final FloatProperty<T> paramFloatProperty)
  {
    new FloatPropertyCompat(paramFloatProperty.getName())
    {
      public float getValue(T paramAnonymousT)
      {
        return ((Float)paramFloatProperty.get(paramAnonymousT)).floatValue();
      }
      
      public void setValue(T paramAnonymousT, float paramAnonymousFloat)
      {
        paramFloatProperty.setValue(paramAnonymousT, paramAnonymousFloat);
      }
    };
  }
  
  public abstract float getValue(T paramT);
  
  public abstract void setValue(T paramT, float paramFloat);
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.FloatPropertyCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */