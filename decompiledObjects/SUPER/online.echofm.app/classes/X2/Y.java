package X2;

import java.io.ObjectOutputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class Y
{
  public static b a(Class paramClass, String paramString)
  {
    try
    {
      paramClass = new b(paramClass.getDeclaredField(paramString), null);
      return paramClass;
    }
    catch (NoSuchFieldException paramClass)
    {
      throw new AssertionError(paramClass);
    }
  }
  
  public static void b(H paramH, ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.writeInt(paramH.a().size());
    paramH = paramH.a().entrySet().iterator();
    while (paramH.hasNext())
    {
      Object localObject = (Map.Entry)paramH.next();
      paramObjectOutputStream.writeObject(((Map.Entry)localObject).getKey());
      paramObjectOutputStream.writeInt(((Collection)((Map.Entry)localObject).getValue()).size());
      localObject = ((Collection)((Map.Entry)localObject).getValue()).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramObjectOutputStream.writeObject(((Iterator)localObject).next());
      }
    }
  }
  
  public static final class b
  {
    public final Field a;
    
    public b(Field paramField)
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
}

/* Location:
 * Qualified Name:     X2.Y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */