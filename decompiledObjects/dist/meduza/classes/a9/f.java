package a9;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import y8.b;
import y8.c;
import y8.d;
import y8.e;

public final class f
  implements e, y8.g
{
  public boolean a = true;
  public final JsonWriter b;
  public final Map<Class<?>, d<?>> c;
  public final Map<Class<?>, y8.f<?>> d;
  public final d<Object> e;
  public final boolean f;
  
  public f(Writer paramWriter, HashMap paramHashMap1, HashMap paramHashMap2, a parama, boolean paramBoolean)
  {
    b = new JsonWriter(paramWriter);
    c = paramHashMap1;
    d = paramHashMap2;
    e = parama;
    f = paramBoolean;
  }
  
  public final e a(c paramc, boolean paramBoolean)
  {
    paramc = a;
    j();
    b.name(paramc);
    j();
    b.value(paramBoolean);
    return this;
  }
  
  public final e b(c paramc, double paramDouble)
  {
    paramc = a;
    j();
    b.name(paramc);
    j();
    b.value(paramDouble);
    return this;
  }
  
  public final e c(c paramc, int paramInt)
  {
    paramc = a;
    j();
    b.name(paramc);
    j();
    b.value(paramInt);
    return this;
  }
  
  public final e d(c paramc, long paramLong)
  {
    paramc = a;
    j();
    b.name(paramc);
    j();
    b.value(paramLong);
    return this;
  }
  
  public final e e(c paramc, Object paramObject)
  {
    return i(paramObject, a);
  }
  
  public final y8.g f(String paramString)
  {
    j();
    b.value(paramString);
    return this;
  }
  
  public final y8.g g(boolean paramBoolean)
  {
    j();
    b.value(paramBoolean);
    return this;
  }
  
  public final f h(Object paramObject)
  {
    if (paramObject == null)
    {
      b.nullValue();
      return this;
    }
    if ((paramObject instanceof Number))
    {
      b.value((Number)paramObject);
      return this;
    }
    boolean bool = paramObject.getClass().isArray();
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    if (bool)
    {
      if ((paramObject instanceof byte[]))
      {
        paramObject = (byte[])paramObject;
        j();
        b.value(Base64.encodeToString((byte[])paramObject, 2));
        return this;
      }
      b.beginArray();
      if ((paramObject instanceof int[]))
      {
        paramObject = (int[])paramObject;
        j = paramObject.length;
        while (i2 < j)
        {
          k = paramObject[i2];
          b.value(k);
          i2++;
        }
      }
      if ((paramObject instanceof long[]))
      {
        paramObject = (long[])paramObject;
        k = paramObject.length;
        for (i2 = j; i2 < k; i2++)
        {
          long l = paramObject[i2];
          j();
          b.value(l);
        }
      }
      if ((paramObject instanceof double[]))
      {
        paramObject = (double[])paramObject;
        j = paramObject.length;
        for (i2 = k; i2 < j; i2++)
        {
          double d1 = paramObject[i2];
          b.value(d1);
        }
      }
      if ((paramObject instanceof boolean[]))
      {
        paramObject = (boolean[])paramObject;
        j = paramObject.length;
        for (i2 = m; i2 < j; i2++)
        {
          int i = paramObject[i2];
          b.value(i);
        }
      }
      if ((paramObject instanceof Number[]))
      {
        paramObject = (Number[])paramObject;
        j = paramObject.length;
        for (i2 = n; i2 < j; i2++) {
          h(paramObject[i2]);
        }
      }
      paramObject = (Object[])paramObject;
      j = paramObject.length;
      for (i2 = i1; i2 < j; i2++) {
        h(paramObject[i2]);
      }
      b.endArray();
      return this;
    }
    if ((paramObject instanceof Collection))
    {
      paramObject = (Collection)paramObject;
      b.beginArray();
      paramObject = ((Collection)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        h(((Iterator)paramObject).next());
      }
      b.endArray();
      return this;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = (Map)paramObject;
      b.beginObject();
      Iterator localIterator = ((Map)paramObject).entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramObject = localEntry.getKey();
        try
        {
          String str = (String)paramObject;
          i(localEntry.getValue(), str);
        }
        catch (ClassCastException localClassCastException)
        {
          throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[] { paramObject, paramObject.getClass() }), localClassCastException);
        }
      }
      b.endObject();
      return this;
    }
    Object localObject = (d)c.get(paramObject.getClass());
    if (localObject != null)
    {
      b.beginObject();
      ((y8.a)localObject).a(paramObject, this);
      b.endObject();
      return this;
    }
    localObject = (y8.f)d.get(paramObject.getClass());
    if (localObject != null)
    {
      ((y8.a)localObject).a(paramObject, this);
      return this;
    }
    if ((paramObject instanceof Enum))
    {
      if ((paramObject instanceof g))
      {
        i2 = ((g)paramObject).a();
        j();
        b.value(i2);
      }
      else
      {
        paramObject = ((Enum)paramObject).name();
        j();
        b.value((String)paramObject);
      }
      return this;
    }
    localObject = e;
    b.beginObject();
    ((y8.a)localObject).a(paramObject, this);
    b.endObject();
    return this;
  }
  
  public final f i(Object paramObject, String paramString)
  {
    if (f)
    {
      if (paramObject == null)
      {
        paramObject = this;
      }
      else
      {
        j();
        b.name(paramString);
        paramObject = h(paramObject);
      }
      return (f)paramObject;
    }
    j();
    b.name(paramString);
    if (paramObject == null)
    {
      b.nullValue();
      paramObject = this;
    }
    else
    {
      paramObject = h(paramObject);
    }
    return (f)paramObject;
  }
  
  public final void j()
  {
    if (a) {
      return;
    }
    throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
  }
}

/* Location:
 * Qualified Name:     a9.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */