package o0;

import dc.l;
import dc.p;
import java.util.Iterator;
import java.util.List;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f="DataMigrationInitializer.kt", l={44, 46}, m="invokeSuspend")
public final class g
  extends i
  implements p<Object, ub.e<Object>, Object>
{
  public Iterator a;
  public d b;
  public Object c;
  public int d;
  
  public g(List<? extends d<Object>> paramList, List<l<ub.e<? super h>, Object>> paramList1, ub.e<? super g> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new g(f, o, parame);
    e = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((g)create(paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = d;
    Object localObject1;
    Object localObject2;
    Object localObject4;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          localObject1 = a;
          localObject2 = (List)e;
          f.b(paramObject);
        }
        else
        {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        localObject3 = c;
        localObject4 = b;
        localObject2 = a;
        localObject5 = (List)e;
        f.b(paramObject);
        localObject1 = this;
        break label225;
      }
    }
    else
    {
      f.b(paramObject);
      paramObject = e;
      localObject1 = f;
      localObject2 = o;
      localObject1 = ((Iterable)localObject1).iterator();
    }
    Object localObject5 = this;
    Object localObject3 = paramObject;
    paramObject = localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      d locald = (d)((Iterator)localObject1).next();
      e = paramObject;
      a = ((Iterator)localObject1);
      b = locald;
      c = localObject3;
      d = 1;
      localObject4 = locald.c();
      if (localObject4 == locala) {
        return locala;
      }
      localObject2 = localObject1;
      Object localObject6 = paramObject;
      paramObject = localObject4;
      localObject1 = localObject5;
      localObject5 = localObject6;
      localObject4 = locald;
      label225:
      if (((Boolean)paramObject).booleanValue())
      {
        ((List)localObject5).add(new a((d)localObject4, null));
        e = localObject5;
        a = ((Iterator)localObject2);
        b = null;
        c = null;
        d = 2;
        paramObject = ((d)localObject4).b();
        localObject3 = paramObject;
        if (paramObject == locala) {
          return locala;
        }
      }
      paramObject = localObject5;
      localObject5 = localObject1;
      localObject1 = localObject2;
    }
    return localObject3;
  }
  
  @wb.e(c="androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f="DataMigrationInitializer.kt", l={45}, m="invokeSuspend")
  public static final class a
    extends i
    implements l<ub.e<? super h>, Object>
  {
    public int a;
    
    public a(d<Object> paramd, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<h> create(ub.e<?> parame)
    {
      return new a(b, parame);
    }
    
    public final Object invoke(Object paramObject)
    {
      return ((a)create((ub.e)paramObject)).invokeSuspend(h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      a locala = a.a;
      int i = a;
      if (i != 0)
      {
        if (i == 1) {
          f.b(paramObject);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        f.b(paramObject);
        paramObject = b;
        a = 1;
        if (((d)paramObject).a() == locala) {
          return locala;
        }
      }
      return h.a;
    }
  }
}

/* Location:
 * Qualified Name:     o0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */