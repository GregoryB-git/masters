package P;

import V5.o;
import V5.t;
import Y5.b;
import Z5.k;
import g6.l;
import g6.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

public final class e$a
{
  public final p b(List paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "migrations");
    return new a(paramList, null);
  }
  
  public final Object c(List paramList, i parami, X5.d paramd)
  {
    if ((paramd instanceof b))
    {
      localObject1 = (b)paramd;
      i = s;
      if ((i & 0x80000000) != 0)
      {
        s = (i + Integer.MIN_VALUE);
        paramd = (X5.d)localObject1;
        break label54;
      }
    }
    paramd = new b(this, paramd);
    label54:
    Object localObject2 = q;
    Object localObject3 = b.c();
    int i = s;
    X5.d locald;
    i locali;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          parami = (Iterator)p;
          paramList = (u)o;
          locald = paramd;
          locali = parami;
          localObject1 = paramList;
          try
          {
            o.b(localObject2);
          }
          finally
          {
            break label320;
          }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      paramList = (List)o;
      o.b(localObject2);
    }
    else
    {
      o.b(localObject2);
      localObject1 = new ArrayList();
      paramList = new c(paramList, (List)localObject1, null);
      o = localObject1;
      s = 1;
      if (parami.a(paramList, paramd) == localObject3) {
        return localObject3;
      }
      paramList = (List)localObject1;
    }
    final Object localObject1 = new u();
    parami = ((Iterable)paramList).iterator();
    paramList = (List)localObject1;
    while (parami.hasNext())
    {
      localObject2 = (l)parami.next();
      locald = paramd;
      locali = parami;
      localObject1 = paramList;
      o = paramList;
      locald = paramd;
      locali = parami;
      localObject1 = paramList;
      p = parami;
      locald = paramd;
      locali = parami;
      localObject1 = paramList;
      s = 2;
      locald = paramd;
      locali = parami;
      localObject1 = paramList;
      localObject2 = ((l)localObject2).invoke(paramd);
      if (localObject2 == localObject3)
      {
        return localObject3;
        label320:
        paramList = o;
        if (paramList == null)
        {
          o = parami;
          paramd = locald;
          parami = locali;
          paramList = (List)localObject1;
        }
        else
        {
          Intrinsics.b(paramList);
          V5.a.a((Throwable)o, parami);
          paramd = locald;
          parami = locali;
          paramList = (List)localObject1;
        }
      }
    }
    paramList = (Throwable)o;
    if (paramList == null) {
      return t.a;
    }
    throw paramList;
  }
  
  public static final class a
    extends k
    implements p
  {
    public int o;
    
    public a(List paramList, X5.d paramd)
    {
      super(paramd);
    }
    
    public final Object a(i parami, X5.d paramd)
    {
      return ((a)create(parami, paramd)).invokeSuspend(t.a);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      paramd = new a(q, paramd);
      p = paramObject;
      return paramd;
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject = b.c();
      int i = o;
      if (i != 0)
      {
        if (i == 1) {
          o.b(paramObject);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        o.b(paramObject);
        i locali = (i)p;
        e.a locala = e.a;
        paramObject = q;
        o = 1;
        if (e.a.a(locala, (List)paramObject, locali, this) == localObject) {
          return localObject;
        }
      }
      return t.a;
    }
  }
  
  public static final class b
    extends Z5.d
  {
    public Object o;
    public Object p;
    public int s;
    
    public b(e.a parama, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      q = paramObject;
      s |= 0x80000000;
      return e.a.a(r, null, null, this);
    }
  }
  
  public static final class c
    extends k
    implements p
  {
    public Object o;
    public Object p;
    public Object q;
    public int r;
    
    public c(List paramList1, List paramList2, X5.d paramd)
    {
      super(paramd);
    }
    
    public final Object a(Object paramObject, X5.d paramd)
    {
      return ((c)create(paramObject, paramd)).invokeSuspend(t.a);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      paramd = new c(t, localObject1, paramd);
      s = paramObject;
      return paramd;
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      b.c();
      int i = r;
      Object localObject1;
      List localList;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i == 2)
          {
            localObject1 = (Iterator)o;
            localList = (List)s;
            o.b(paramObject);
          }
          else
          {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          Object localObject2 = q;
          android.support.v4.media.a.a(p);
          localObject1 = (Iterator)o;
          localList = (List)s;
          o.b(paramObject);
          if (!((Boolean)paramObject).booleanValue())
          {
            paramObject = localObject2;
          }
          else
          {
            localList.add(new a(null, null));
            s = localList;
            o = localObject1;
            p = null;
            q = null;
            r = 2;
            throw null;
          }
        }
      }
      else
      {
        o.b(paramObject);
        paramObject = s;
        localObject1 = (Iterable)t;
        localList = localObject1;
        localObject1 = ((Iterable)localObject1).iterator();
      }
      if (!((Iterator)localObject1).hasNext()) {
        return paramObject;
      }
      android.support.v4.media.a.a(((Iterator)localObject1).next());
      s = localList;
      o = localObject1;
      p = null;
      q = paramObject;
      r = 1;
      throw null;
    }
    
    public static final class a
      extends k
      implements l
    {
      public int o;
      
      public a(d paramd, X5.d paramd1)
      {
        super(paramd1);
      }
      
      public final Object a(X5.d paramd)
      {
        return ((a)create(paramd)).invokeSuspend(t.a);
      }
      
      public final X5.d create(X5.d paramd)
      {
        return new a(null, paramd);
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        b.c();
        int i = o;
        if (i != 0)
        {
          if (i == 1)
          {
            o.b(paramObject);
            return t.a;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(paramObject);
        o = 1;
        throw null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     P.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */