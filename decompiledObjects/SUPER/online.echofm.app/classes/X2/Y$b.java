package X2;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class Y$b
{
  public final Field a;
  
  public Y$b(Field paramField)
  {
    a = paramField;
    paramField.setAccessible(true);
  }
  
  public void a(Object paramObject, int paramInt)
  {
    try
    {
      a.set(paramObject, Integer.valueOf(paramInt));
      return;
    }
    catch (IllegalAccessException paramObject)
    {
      throw new AssertionError(paramObject);
    }
  }
  
  public void b(Object paramObject1, Object paramObject2)
  {
    try
    {
      a.set(paramObject1, paramObject2);
      return;
    }
    catch (IllegalAccessException paramObject1)
    {
      throw new AssertionError(paramObject1);
    }
  }
}

/* Location:
 * Qualified Name:     X2.Y.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */