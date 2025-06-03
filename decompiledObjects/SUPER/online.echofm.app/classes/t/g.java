package t;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class g
{
  public final LinkedHashMap a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  
  public g(int paramInt)
  {
    if (paramInt > 0)
    {
      c = paramInt;
      a = new LinkedHashMap(0, 0.75F, true);
      return;
    }
    throw new IllegalArgumentException("maxSize <= 0");
  }
  
  public Object a(Object paramObject)
  {
    return null;
  }
  
  public void b(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3) {}
  
  public final Object c(Object paramObject)
  {
    if (paramObject != null) {
      label145:
      label149:
      try
      {
        localObject1 = a.get(paramObject);
        if (localObject1 != null)
        {
          g += 1;
          return localObject1;
        }
      }
      finally
      {
        Object localObject1;
        break label149;
        h += 1;
        Object localObject2 = a(paramObject);
        if (localObject2 == null) {
          return null;
        }
        try
        {
          e += 1;
          localObject1 = a.put(paramObject, localObject2);
          if (localObject1 != null) {
            a.put(paramObject, localObject1);
          }
        }
        finally
        {
          break label145;
        }
        b += f(paramObject, localObject2);
        if (localObject1 != null)
        {
          b(false, paramObject, localObject2, localObject1);
          return localObject1;
        }
        i(c);
        return localObject2;
        throw ((Throwable)paramObject);
      }
    }
    throw new NullPointerException("key == null");
  }
  
  public final Object d(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 != null) && (paramObject2 != null))
    {
      Object localObject;
      try
      {
        d += 1;
        b += f(paramObject1, paramObject2);
        localObject = a.put(paramObject1, paramObject2);
        if (localObject != null) {
          b -= f(paramObject1, localObject);
        }
      }
      finally
      {
        break label95;
      }
      if (localObject != null) {
        b(false, paramObject1, localObject, paramObject2);
      }
      i(c);
      return localObject;
      label95:
      throw ((Throwable)paramObject1);
    }
    throw new NullPointerException("key == null || value == null");
  }
  
  public final Object e(Object paramObject)
  {
    if (paramObject != null)
    {
      Object localObject;
      try
      {
        localObject = a.remove(paramObject);
        if (localObject != null) {
          b -= f(paramObject, localObject);
        }
      }
      finally
      {
        break label57;
      }
      if (localObject != null) {
        b(false, paramObject, localObject, null);
      }
      return localObject;
      label57:
      throw ((Throwable)paramObject);
    }
    throw new NullPointerException("key == null");
  }
  
  public final int f(Object paramObject1, Object paramObject2)
  {
    int i = g(paramObject1, paramObject2);
    if (i >= 0) {
      return i;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Negative size: ");
    localStringBuilder.append(paramObject1);
    localStringBuilder.append("=");
    localStringBuilder.append(paramObject2);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public int g(Object paramObject1, Object paramObject2)
  {
    return 1;
  }
  
  public final Map h()
  {
    try
    {
      LinkedHashMap localLinkedHashMap = new LinkedHashMap(a);
      return localLinkedHashMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void i(int paramInt)
  {
    for (;;)
    {
      try
      {
        if (b < 0) {
          break label139;
        }
        if (a.isEmpty()) {
          if (b != 0) {
            break label139;
          }
        }
      }
      finally
      {
        break label180;
      }
      if ((b <= paramInt) || (a.isEmpty())) {
        break;
      }
      localObject3 = (Map.Entry)a.entrySet().iterator().next();
      localObject2 = ((Map.Entry)localObject3).getKey();
      localObject3 = ((Map.Entry)localObject3).getValue();
      a.remove(localObject2);
      b -= f(localObject2, localObject3);
      f += 1;
      b(true, localObject2, localObject3, null);
    }
    return;
    label139:
    Object localObject2 = new java/lang/IllegalStateException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append(getClass().getName());
    ((StringBuilder)localObject3).append(".sizeOf() is reporting inconsistent results!");
    ((IllegalStateException)localObject2).<init>(((StringBuilder)localObject3).toString());
    throw ((Throwable)localObject2);
    label180:
    throw ((Throwable)localObject2);
  }
  
  public final String toString()
  {
    try
    {
      i = g;
      int j = h + i;
      if (j != 0) {
        i = i * 100 / j;
      }
    }
    finally
    {
      break label88;
    }
    int i = 0;
    String str = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(c), Integer.valueOf(g), Integer.valueOf(h), Integer.valueOf(i) });
    return str;
    label88:
    throw str;
  }
}

/* Location:
 * Qualified Name:     t.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */