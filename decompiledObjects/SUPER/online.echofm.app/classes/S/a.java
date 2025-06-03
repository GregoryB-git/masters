package S;

import W5.m;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class a
  extends d
{
  public final Map a;
  public final AtomicBoolean b;
  
  public a(Map paramMap, boolean paramBoolean)
  {
    a = paramMap;
    b = new AtomicBoolean(paramBoolean);
  }
  
  public Map a()
  {
    Map localMap = Collections.unmodifiableMap(a);
    Intrinsics.checkNotNullExpressionValue(localMap, "unmodifiableMap(preferencesMap)");
    return localMap;
  }
  
  public Object b(d.a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "key");
    return a.get(parama);
  }
  
  public final void e()
  {
    if ((b.get() ^ true)) {
      return;
    }
    throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof a)) {
      return Intrinsics.a(a, a);
    }
    return false;
  }
  
  public final void f()
  {
    b.set(true);
  }
  
  public final void g(d.b... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    e();
    if (paramVarArgs.length <= 0) {
      return;
    }
    paramVarArgs = paramVarArgs[0];
    throw null;
  }
  
  public final Object h(d.a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "key");
    e();
    return a.remove(parama);
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public final void i(d.a parama, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(parama, "key");
    j(parama, paramObject);
  }
  
  public final void j(d.a parama, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(parama, "key");
    e();
    if (paramObject == null)
    {
      h(parama);
    }
    else
    {
      Map localMap;
      if ((paramObject instanceof Set))
      {
        localMap = a;
        paramObject = Collections.unmodifiableSet(m.J((Iterable)paramObject));
        Intrinsics.checkNotNullExpressionValue(paramObject, "unmodifiableSet(value.toSet())");
      }
      for (;;)
      {
        localMap.put(parama, paramObject);
        break;
        localMap = a;
      }
    }
  }
  
  public String toString()
  {
    return m.x(a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.o, 24, null);
  }
  
  public static final class a
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public static final a o = new a();
    
    public a()
    {
      super();
    }
    
    public final CharSequence a(Map.Entry paramEntry)
    {
      Intrinsics.checkNotNullParameter(paramEntry, "entry");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("  ");
      localStringBuilder.append(((d.a)paramEntry.getKey()).a());
      localStringBuilder.append(" = ");
      localStringBuilder.append(paramEntry.getValue());
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     S.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */