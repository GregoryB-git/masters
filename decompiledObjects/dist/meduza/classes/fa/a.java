package fa;

import ec.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import sb.y;
import vc.d;
import wb.c;

public final class a
{
  public static final a a = new a();
  public static final Map<b.a, a> b = Collections.synchronizedMap(new LinkedHashMap());
  
  public static a a(b.a parama)
  {
    Object localObject = b;
    i.d(localObject, "dependencies");
    localObject = ((Map)localObject).get(parama);
    if (localObject != null) {
      return (a)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Cannot get dependency ");
    ((StringBuilder)localObject).append(parama);
    ((StringBuilder)localObject).append(". Dependencies should be added at class load time.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public static b c(b.a parama)
  {
    i.e(parama, "subscriberName");
    Object localObject = ab;
    if (localObject != null) {
      return (b)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Subscriber ");
    ((StringBuilder)localObject).append(parama);
    ((StringBuilder)localObject).append(" has not been registered.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final Object b(ub.e<? super Map<b.a, ? extends b>> parame)
  {
    Object localObject1;
    if ((parame instanceof b))
    {
      localObject1 = (b)parame;
      i = q;
      if ((i & 0x80000000) != 0)
      {
        q = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super Map<b.a, ? extends b>>)localObject1;
        break label47;
      }
    }
    parame = new b(this, parame);
    label47:
    Object localObject2 = o;
    vb.a locala = vb.a.a;
    int i = q;
    Object localObject3;
    vc.a locala1;
    Object localObject4;
    Iterator localIterator;
    if (i != 0)
    {
      if (i == 1)
      {
        localObject3 = f;
        localObject1 = e;
        locala1 = d;
        localObject4 = c;
        localIterator = b;
        Map localMap = a;
        rb.f.b(localObject2);
        localObject2 = parame;
        parame = localMap;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(localObject2);
      localObject2 = b;
      i.d(localObject2, "dependencies");
      localObject1 = new LinkedHashMap(y.H0(((Map)localObject2).size()));
      localIterator = ((Map)localObject2).entrySet().iterator();
      localObject2 = parame;
    }
    while (localIterator.hasNext())
    {
      parame = (Map.Entry)localIterator.next();
      localObject3 = parame.getKey();
      localObject4 = (b.a)parame.getKey();
      locala1 = getValuea;
      a = ((Map)localObject1);
      b = localIterator;
      c = ((b.a)localObject4);
      d = locala1;
      e = ((Map)localObject1);
      f = localObject3;
      q = 1;
      if (locala1.b((c)localObject2) == locala) {
        return locala;
      }
      parame = (ub.e<? super Map<b.a, ? extends b>>)localObject1;
      try
      {
        localObject4 = c((b.a)localObject4);
        locala1.a(null);
        ((Map)localObject1).put(localObject3, localObject4);
        localObject1 = parame;
      }
      finally
      {
        locala1.a(null);
      }
    }
    return localObject1;
  }
  
  public static final class a
  {
    public final vc.a a;
    public b b;
    
    public a(d paramd)
    {
      a = paramd;
      b = null;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      if (!i.a(a, a)) {
        return false;
      }
      return i.a(b, b);
    }
    
    public final int hashCode()
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
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("Dependency(mutex=");
      localStringBuilder.append(a);
      localStringBuilder.append(", subscriber=");
      localStringBuilder.append(b);
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
  }
  
  @wb.e(c="com.google.firebase.sessions.api.FirebaseSessionsDependencies", f="FirebaseSessionsDependencies.kt", l={124}, m="getRegisteredSubscribers$com_google_firebase_firebase_sessions")
  public static final class b
    extends c
  {
    public Map a;
    public Iterator b;
    public b.a c;
    public vc.a d;
    public Map e;
    public Object f;
    public int q;
    
    public b(a parama, ub.e<? super b> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      o = paramObject;
      q |= 0x80000000;
      return p.b(this);
    }
  }
}

/* Location:
 * Qualified Name:     fa.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */