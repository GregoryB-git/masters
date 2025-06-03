package x;

import android.graphics.Typeface;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class i
  extends h
{
  public final Typeface j(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(f, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)l.invoke(null, new Object[] { localObject, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1) });
      return (Typeface)paramObject;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  public final Method o(Class<?> paramClass)
  {
    Class localClass = Array.newInstance(paramClass, 1).getClass();
    paramClass = Integer.TYPE;
    paramClass = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { localClass, String.class, paramClass, paramClass });
    paramClass.setAccessible(true);
    return paramClass;
  }
}

/* Location:
 * Qualified Name:     x.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */