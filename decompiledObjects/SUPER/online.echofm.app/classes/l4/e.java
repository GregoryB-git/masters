package l4;

import android.util.Base64;
import android.util.JsonWriter;
import j4.b;
import j4.c;
import j4.d;
import j4.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class e
  implements j4.e, g
{
  public e a = null;
  public boolean b = true;
  public final JsonWriter c;
  public final Map d;
  public final Map e;
  public final d f;
  public final boolean g;
  
  public e(Writer paramWriter, Map paramMap1, Map paramMap2, d paramd, boolean paramBoolean)
  {
    c = new JsonWriter(paramWriter);
    d = paramMap1;
    e = paramMap2;
    f = paramd;
    g = paramBoolean;
  }
  
  public j4.e a(c paramc, double paramDouble)
  {
    return m(paramc.b(), paramDouble);
  }
  
  public j4.e b(c paramc, long paramLong)
  {
    return o(paramc.b(), paramLong);
  }
  
  public j4.e c(c paramc, int paramInt)
  {
    return n(paramc.b(), paramInt);
  }
  
  public j4.e f(c paramc, boolean paramBoolean)
  {
    return q(paramc.b(), paramBoolean);
  }
  
  public j4.e g(c paramc, Object paramObject)
  {
    return p(paramc.b(), paramObject);
  }
  
  public e h(double paramDouble)
  {
    y();
    c.value(paramDouble);
    return this;
  }
  
  public e i(int paramInt)
  {
    y();
    c.value(paramInt);
    return this;
  }
  
  public e j(long paramLong)
  {
    y();
    c.value(paramLong);
    return this;
  }
  
  public e k(Object paramObject, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if ((paramBoolean) && (t(paramObject)))
    {
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = paramObject.getClass();
      }
      throw new b(String.format("%s cannot be encoded inline", new Object[] { paramObject }));
    }
    if (paramObject == null)
    {
      c.nullValue();
      return this;
    }
    if ((paramObject instanceof Number))
    {
      c.value((Number)paramObject);
      return this;
    }
    if (paramObject.getClass().isArray())
    {
      if ((paramObject instanceof byte[])) {
        return s((byte[])paramObject);
      }
      c.beginArray();
      if ((paramObject instanceof int[]))
      {
        paramObject = (int[])paramObject;
        i = paramObject.length;
        while (m < i)
        {
          j = paramObject[m];
          c.value(j);
          m++;
        }
      }
      if ((paramObject instanceof long[]))
      {
        paramObject = (long[])paramObject;
        j = paramObject.length;
        for (m = i; m < j; m++) {
          j(paramObject[m]);
        }
      }
      if ((paramObject instanceof double[]))
      {
        paramObject = (double[])paramObject;
        i = paramObject.length;
        for (m = j; m < i; m++)
        {
          double d1 = paramObject[m];
          c.value(d1);
        }
      }
      if ((paramObject instanceof boolean[]))
      {
        paramObject = (boolean[])paramObject;
        i = paramObject.length;
        for (m = k; m < i; m++)
        {
          paramBoolean = paramObject[m];
          c.value(paramBoolean);
        }
      }
      if ((paramObject instanceof Number[]))
      {
        paramObject = (Number[])paramObject;
        i = paramObject.length;
        for (m = 0; m < i; m++) {
          k(paramObject[m], false);
        }
      }
      paramObject = (Object[])paramObject;
      i = paramObject.length;
      for (m = 0; m < i; m++) {
        k(paramObject[m], false);
      }
      c.endArray();
      return this;
    }
    if ((paramObject instanceof Collection))
    {
      paramObject = (Collection)paramObject;
      c.beginArray();
      paramObject = ((Collection)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        k(((Iterator)paramObject).next(), false);
      }
      c.endArray();
      return this;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = (Map)paramObject;
      c.beginObject();
      Iterator localIterator = ((Map)paramObject).entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramObject = localEntry.getKey();
        try
        {
          p((String)paramObject, localEntry.getValue());
        }
        catch (ClassCastException localClassCastException)
        {
          throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[] { paramObject, paramObject.getClass() }), localClassCastException);
        }
      }
      c.endObject();
      return this;
    }
    Object localObject = (d)d.get(paramObject.getClass());
    if (localObject != null) {
      return v((d)localObject, paramObject, paramBoolean);
    }
    localObject = (j4.f)e.get(paramObject.getClass());
    if (localObject != null)
    {
      ((j4.f)localObject).a(paramObject, this);
      return this;
    }
    if ((paramObject instanceof Enum))
    {
      if ((paramObject instanceof f)) {
        i(((f)paramObject).g());
      } else {
        l(((Enum)paramObject).name());
      }
      return this;
    }
    return v(f, paramObject, paramBoolean);
  }
  
  public e l(String paramString)
  {
    y();
    c.value(paramString);
    return this;
  }
  
  public e m(String paramString, double paramDouble)
  {
    y();
    c.name(paramString);
    return h(paramDouble);
  }
  
  public e n(String paramString, int paramInt)
  {
    y();
    c.name(paramString);
    return i(paramInt);
  }
  
  public e o(String paramString, long paramLong)
  {
    y();
    c.name(paramString);
    return j(paramLong);
  }
  
  public e p(String paramString, Object paramObject)
  {
    if (g) {
      return x(paramString, paramObject);
    }
    return w(paramString, paramObject);
  }
  
  public e q(String paramString, boolean paramBoolean)
  {
    y();
    c.name(paramString);
    return r(paramBoolean);
  }
  
  public e r(boolean paramBoolean)
  {
    y();
    c.value(paramBoolean);
    return this;
  }
  
  public e s(byte[] paramArrayOfByte)
  {
    y();
    if (paramArrayOfByte == null) {
      c.nullValue();
    } else {
      c.value(Base64.encodeToString(paramArrayOfByte, 2));
    }
    return this;
  }
  
  public final boolean t(Object paramObject)
  {
    boolean bool;
    if ((paramObject != null) && (!paramObject.getClass().isArray()) && (!(paramObject instanceof Collection)) && (!(paramObject instanceof Date)) && (!(paramObject instanceof Enum)) && (!(paramObject instanceof Number))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void u()
  {
    y();
    c.flush();
  }
  
  public e v(d paramd, Object paramObject, boolean paramBoolean)
  {
    if (!paramBoolean) {
      c.beginObject();
    }
    paramd.a(paramObject, this);
    if (!paramBoolean) {
      c.endObject();
    }
    return this;
  }
  
  public final e w(String paramString, Object paramObject)
  {
    y();
    c.name(paramString);
    if (paramObject == null)
    {
      c.nullValue();
      return this;
    }
    return k(paramObject, false);
  }
  
  public final e x(String paramString, Object paramObject)
  {
    if (paramObject == null) {
      return this;
    }
    y();
    c.name(paramString);
    return k(paramObject, false);
  }
  
  public final void y()
  {
    if (b)
    {
      e locale = a;
      if (locale != null)
      {
        locale.y();
        a.b = false;
        a = null;
        c.endObject();
      }
      return;
    }
    throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
  }
}

/* Location:
 * Qualified Name:     l4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */