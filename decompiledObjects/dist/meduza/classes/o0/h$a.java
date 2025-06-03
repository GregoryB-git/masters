package o0;

import dc.l;
import ec.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rb.h;
import ub.e;
import vb.a;
import x6.b;

public final class h$a
{
  public static final Object a(a parama, List paramList, k paramk, e parame)
  {
    parama.getClass();
    Object localObject1;
    if ((parame instanceof f))
    {
      localObject1 = (f)parame;
      i = e;
      if ((i & 0x80000000) != 0)
      {
        e = (i + Integer.MIN_VALUE);
        parama = (a)localObject1;
        break label59;
      }
    }
    parama = new f(parama, parame);
    label59:
    Object localObject2 = c;
    a locala = a.a;
    int i = e;
    a locala1;
    if (i != 0) {
      if (i != 1) {
        if (i == 2)
        {
          paramk = b;
          paramList = (s)a;
          locala1 = parama;
          parame = paramk;
          localObject1 = paramList;
        }
      }
    }
    try
    {
      rb.f.b(localObject2);
    }
    finally
    {
      for (;;)
      {
        parama = a;
        if (parama == null)
        {
          a = paramList;
          parama = locala1;
          paramk = parame;
          paramList = (List)localObject1;
        }
        else
        {
          b.e((Throwable)parama, paramList);
          parama = locala1;
          paramk = parame;
          paramList = (List)localObject1;
        }
      }
      parama = (Throwable)a;
      if (parama != null) {
        break label375;
      }
    }
    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    paramList = (List)a;
    rb.f.b(localObject2);
    break label203;
    rb.f.b(localObject2);
    parame = new ArrayList();
    paramList = new g(paramList, parame, null);
    a = parame;
    e = 1;
    if (paramk.a(paramList, parama) == locala)
    {
      parama = locala;
    }
    else
    {
      paramList = parame;
      label203:
      parame = new s();
      paramk = paramList.iterator();
      paramList = parame;
      while (paramk.hasNext())
      {
        localObject2 = (l)paramk.next();
        locala1 = parama;
        parame = paramk;
        localObject1 = paramList;
        a = paramList;
        locala1 = parama;
        parame = paramk;
        localObject1 = paramList;
        b = paramk;
        locala1 = parama;
        parame = paramk;
        localObject1 = paramList;
        e = 2;
        locala1 = parama;
        parame = paramk;
        localObject1 = paramList;
        localObject2 = ((l)localObject2).invoke(parama);
        if (localObject2 == locala)
        {
          parama = locala;
          break label373;
        }
      }
      parama = h.a;
    }
    label373:
    return parama;
    label375:
    throw parama;
  }
}

/* Location:
 * Qualified Name:     o0.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */