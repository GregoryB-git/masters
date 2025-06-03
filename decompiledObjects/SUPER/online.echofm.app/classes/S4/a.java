package S4;

import V5.o;
import W5.C;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;
import y6.c;

public final class a
{
  public static final a a = new a();
  public static final Map b = Collections.synchronizedMap(new LinkedHashMap());
  
  public final void a(b.a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "subscriberName");
    Object localObject = b;
    if (((Map)localObject).containsKey(parama))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Dependency ");
      ((StringBuilder)localObject).append(parama);
      ((StringBuilder)localObject).append(" already added.");
      Log.d("SessionsDependencies", ((StringBuilder)localObject).toString());
      return;
    }
    Intrinsics.checkNotNullExpressionValue(localObject, "dependencies");
    ((Map)localObject).put(parama, new a(c.a(true), null, 2, null));
  }
  
  public final a b(b.a parama)
  {
    Object localObject = b;
    Intrinsics.checkNotNullExpressionValue(localObject, "dependencies");
    localObject = ((Map)localObject).get(parama);
    if (localObject != null)
    {
      Intrinsics.checkNotNullExpressionValue(localObject, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
      return (a)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Cannot get dependency ");
    ((StringBuilder)localObject).append(parama);
    ((StringBuilder)localObject).append(". Dependencies should be added at class load time.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final Object c(X5.d paramd)
  {
    if ((paramd instanceof b))
    {
      localObject1 = (b)paramd;
      i = w;
      if ((i & 0x80000000) != 0)
      {
        w = (i + Integer.MIN_VALUE);
        paramd = (X5.d)localObject1;
        break label47;
      }
    }
    paramd = new b(this, paramd);
    label47:
    Object localObject1 = u;
    Object localObject2 = Y5.b.c();
    int i = w;
    Object localObject3;
    Object localObject4;
    y6.a locala;
    b.a locala1;
    Object localObject5;
    Object localObject6;
    if (i != 0)
    {
      if (i == 1)
      {
        localObject3 = t;
        localObject4 = (Map)s;
        locala = (y6.a)r;
        locala1 = (b.a)q;
        localObject5 = (Iterator)p;
        localObject6 = (Map)o;
        o.b(localObject1);
        localObject1 = paramd;
        paramd = (X5.d)localObject6;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      o.b(localObject1);
      localObject5 = b;
      Intrinsics.checkNotNullExpressionValue(localObject5, "dependencies");
      localObject1 = new LinkedHashMap(C.a(((Map)localObject5).size()));
      localObject5 = ((Map)localObject5).entrySet().iterator();
      localObject6 = paramd;
    }
    while (((Iterator)localObject5).hasNext())
    {
      paramd = (Map.Entry)((Iterator)localObject5).next();
      localObject3 = paramd.getKey();
      locala1 = (b.a)paramd.getKey();
      locala = ((a)paramd.getValue()).a();
      o = localObject1;
      p = localObject5;
      q = locala1;
      r = locala;
      s = localObject1;
      t = localObject3;
      w = 1;
      if (locala.a(null, (X5.d)localObject6) == localObject2) {
        return localObject2;
      }
      paramd = (X5.d)localObject1;
      localObject4 = localObject1;
      localObject1 = localObject6;
      try
      {
        localObject6 = a.d(locala1);
        locala.b(null);
        ((Map)localObject4).put(localObject3, localObject6);
        localObject6 = localObject1;
        localObject1 = paramd;
      }
      finally
      {
        locala.b(null);
      }
    }
    return localObject1;
  }
  
  public final b d(b.a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "subscriberName");
    Object localObject = b(parama).b();
    if (localObject != null) {
      return (b)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Subscriber ");
    ((StringBuilder)localObject).append(parama);
    ((StringBuilder)localObject).append(" has not been registered.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final void e(b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "subscriber");
    b.a locala = paramb.a();
    a locala1 = b(locala);
    if (locala1.b() != null)
    {
      paramb = new StringBuilder();
      paramb.append("Subscriber ");
      paramb.append(locala);
      paramb.append(" already registered.");
      Log.d("SessionsDependencies", paramb.toString());
      return;
    }
    locala1.c(paramb);
    y6.a.a.a(locala1.a(), null, 1, null);
  }
  
  public static final class a
  {
    public final y6.a a;
    public b b;
    
    public a(y6.a parama, b paramb)
    {
      a = parama;
      b = paramb;
    }
    
    public final y6.a a()
    {
      return a;
    }
    
    public final b b()
    {
      return b;
    }
    
    public final void c(b paramb)
    {
      b = paramb;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      if (!Intrinsics.a(a, a)) {
        return false;
      }
      return Intrinsics.a(b, b);
    }
    
    public int hashCode()
    {
      int i = a.hashCode();
      b localb = b;
      int j;
      if (localb == null) {
        j = 0;
      } else {
        j = localb.hashCode();
      }
      return i * 31 + j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Dependency(mutex=");
      localStringBuilder.append(a);
      localStringBuilder.append(", subscriber=");
      localStringBuilder.append(b);
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends Z5.d
  {
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public int w;
    
    public b(a parama, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      u = paramObject;
      w |= 0x80000000;
      return v.c(this);
    }
  }
}

/* Location:
 * Qualified Name:     S4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */