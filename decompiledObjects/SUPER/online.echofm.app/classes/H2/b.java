package H2;

import A2.n;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class b
  extends a.a
{
  public final Object b;
  
  public b(Object paramObject)
  {
    b = paramObject;
  }
  
  public static a Z0(Object paramObject)
  {
    return new b(paramObject);
  }
  
  public static Object v(a parama)
  {
    if ((parama instanceof b)) {
      return b;
    }
    IBinder localIBinder = parama.asBinder();
    Field[] arrayOfField = localIBinder.getClass().getDeclaredFields();
    int i = arrayOfField.length;
    int j = 0;
    parama = null;
    int m;
    for (int k = 0; j < i; k = m)
    {
      Field localField = arrayOfField[j];
      m = k;
      if (!localField.isSynthetic())
      {
        m = k + 1;
        parama = localField;
      }
      j++;
    }
    if (k == 1)
    {
      n.i(parama);
      if (!parama.isAccessible())
      {
        parama.setAccessible(true);
        try
        {
          parama = parama.get(localIBinder);
          return parama;
        }
        catch (IllegalAccessException parama)
        {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", parama);
        }
        catch (NullPointerException parama)
        {
          throw new IllegalArgumentException("Binder object is null.", parama);
        }
      }
      throw new IllegalArgumentException("IObjectWrapper declared field not private!");
    }
    k = arrayOfField.length;
    parama = new StringBuilder();
    parama.append("Unexpected number of IObjectWrapper declared fields: ");
    parama.append(k);
    throw new IllegalArgumentException(parama.toString());
  }
}

/* Location:
 * Qualified Name:     H2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */