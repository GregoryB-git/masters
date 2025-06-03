package r0;

import dc.l;
import ec.i;
import ec.j;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sb.q;

public final class a
  extends d
{
  public final Map<d.a<?>, Object> a;
  public final AtomicBoolean b;
  
  public a()
  {
    this(false, 3);
  }
  
  public a(Map<d.a<?>, Object> paramMap, boolean paramBoolean)
  {
    a = paramMap;
    b = new AtomicBoolean(paramBoolean);
  }
  
  public final Map<d.a<?>, Object> a()
  {
    Map localMap = Collections.unmodifiableMap(a);
    i.d(localMap, "unmodifiableMap(preferencesMap)");
    return localMap;
  }
  
  public final <T> T b(d.a<T> parama)
  {
    i.e(parama, "key");
    return (T)a.get(parama);
  }
  
  public final void c()
  {
    if ((b.get() ^ true)) {
      return;
    }
    throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
  }
  
  public final <T> void d(d.a<T> parama, T paramT)
  {
    i.e(parama, "key");
    e(parama, paramT);
  }
  
  public final void e(d.a<?> parama, Object paramObject)
  {
    i.e(parama, "key");
    c();
    if (paramObject == null)
    {
      c();
      a.remove(parama);
    }
    else
    {
      Object localObject1;
      Object localObject2;
      if ((paramObject instanceof Set))
      {
        localObject1 = a;
        localObject2 = Collections.unmodifiableSet(q.x((Iterable)paramObject));
        i.d(localObject2, "unmodifiableSet(value.toSet())");
        paramObject = localObject1;
        localObject1 = localObject2;
      }
      else
      {
        localObject2 = a;
        localObject1 = paramObject;
        paramObject = localObject2;
      }
      ((Map)paramObject).put(parama, localObject1);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof a)) {
      return i.a(a, a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    return q.p(a.entrySet(), ",\n", "{\n", "\n}", a.a, 24);
  }
  
  public static final class a
    extends j
    implements l<Map.Entry<d.a<?>, Object>, CharSequence>
  {
    public static final a a = new a();
    
    public a()
    {
      super();
    }
    
    public final Object invoke(Object paramObject)
    {
      paramObject = (Map.Entry)paramObject;
      i.e(paramObject, "entry");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("  ");
      localStringBuilder.append(getKeya);
      localStringBuilder.append(" = ");
      localStringBuilder.append(((Map.Entry)paramObject).getValue());
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     r0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */