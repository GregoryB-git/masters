package nc;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.m0;
import rb.f;
import rb.h;
import sb.s;
import vb.a;

public final class d
{
  public static final <T> Object a(j0<? extends T>[] paramArrayOfj0, ub.e<? super List<? extends T>> parame)
  {
    int i = paramArrayOfj0.length;
    int j = 0;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return s.a;
    }
    Object localObject1 = new c(paramArrayOfj0);
    parame = new l(1, m0.P(parame));
    parame.t();
    int k = paramArrayOfj0.length;
    paramArrayOfj0 = new c.a[k];
    Object localObject3;
    for (i = 0; i < k; i++)
    {
      Object localObject2 = a[i];
      ((j1)localObject2).start();
      localObject3 = new c.a((c)localObject1, parame);
      f = ((j1)localObject2).invokeOnCompletion((dc.l)localObject3);
      localObject2 = h.a;
      paramArrayOfj0[i] = localObject3;
    }
    localObject1 = new c.b(paramArrayOfj0);
    for (i = j; i < k; i++)
    {
      localObject3 = paramArrayOfj0[i];
      localObject3.getClass();
      c.a.p.set(localObject3, localObject1);
    }
    if ((l.o.get(parame) instanceof v1 ^ true)) {
      ((c.b)localObject1).i();
    } else {
      parame.v((dc.l)localObject1);
    }
    paramArrayOfj0 = parame.s();
    parame = a.a;
    return paramArrayOfj0;
  }
  
  public static final Object b(List paramList, ub.e parame)
  {
    if ((parame instanceof e))
    {
      localObject1 = (e)parame;
      i = c;
      if ((i & 0x80000000) != 0)
      {
        c = (i + Integer.MIN_VALUE);
        parame = (ub.e)localObject1;
        break label46;
      }
    }
    parame = new e(parame);
    label46:
    Object localObject2 = b;
    Object localObject1 = a.a;
    int i = c;
    if (i != 0)
    {
      if (i == 1)
      {
        paramList = a;
        f.b(localObject2);
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject2);
      paramList = paramList.iterator();
    }
    while (paramList.hasNext())
    {
      localObject2 = (j1)paramList.next();
      a = paramList;
      c = 1;
      if (((j1)localObject2).join(parame) == localObject1) {
        return localObject1;
      }
    }
    return h.a;
  }
  
  public static final Object c(j1[] paramArrayOfj1, ub.e<? super h> parame)
  {
    if ((parame instanceof a))
    {
      localObject = (a)parame;
      i = e;
      if ((i & 0x80000000) != 0)
      {
        e = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super h>)localObject;
        break label46;
      }
    }
    parame = new a(parame);
    label46:
    Object localObject = d;
    a locala = a.a;
    int i = e;
    int j;
    if (i != 0)
    {
      if (i == 1)
      {
        j = c;
        i = b;
        paramArrayOfj1 = (j1[])a;
        f.b(localObject);
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject);
      j = paramArrayOfj1.length;
      i = 0;
    }
    for (localObject = parame; i < j; localObject = parame)
    {
      j1 localj1 = paramArrayOfj1[i];
      a = paramArrayOfj1;
      b = i;
      c = j;
      e = 1;
      parame = (ub.e<? super h>)localObject;
      if (localj1.join((ub.e)localObject) == locala) {
        return locala;
      }
      i++;
    }
    return h.a;
  }
  
  @wb.e(c="kotlinx.coroutines.AwaitKt", f="Await.kt", l={54}, m="joinAll")
  public static final class a
    extends wb.c
  {
    public Object[] a;
    public int b;
    public int c;
    public int e;
    
    public a(ub.e<? super a> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      d = paramObject;
      e |= 0x80000000;
      return d.c(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     nc.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */