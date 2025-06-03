package s7;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

public final class a$j$a
  implements PrivilegedExceptionAction<Unsafe>
{
  public static Unsafe a()
  {
    for (Object localObject : Unsafe.class.getDeclaredFields())
    {
      ((AccessibleObject)localObject).setAccessible(true);
      localObject = ((Field)localObject).get(null);
      if (Unsafe.class.isInstance(localObject)) {
        return (Unsafe)Unsafe.class.cast(localObject);
      }
    }
    throw new NoSuchFieldError("the Unsafe");
  }
}

/* Location:
 * Qualified Name:     s7.a.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */