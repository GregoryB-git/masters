package b2;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public final class b
  extends ObjectInputStream
{
  public b(ByteArrayInputStream paramByteArrayInputStream)
  {
    super(paramByteArrayInputStream);
  }
  
  public final Class<?> resolveClass(ObjectStreamClass paramObjectStreamClass)
  {
    Class localClass = Class.forName(paramObjectStreamClass.getName(), false, b.class.getClassLoader());
    if (localClass != null) {
      return localClass;
    }
    return super.resolveClass(paramObjectStreamClass);
  }
}

/* Location:
 * Qualified Name:     b2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */