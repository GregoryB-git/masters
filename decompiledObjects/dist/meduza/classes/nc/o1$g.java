package nc;

import kc.d;
import rb.f;
import sc.j;
import vb.a;

@wb.e(c="kotlinx.coroutines.JobSupport$children$1", f="JobSupport.kt", l={956, 958}, m="invokeSuspend")
public final class o1$g
  extends wb.h
  implements dc.p<d<? super j1>, ub.e<? super rb.h>, Object>
{
  public sc.i b;
  public j c;
  public int d;
  
  public o1$g(ub.e parame, o1 paramo1)
  {
    super(parame);
  }
  
  public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new g(parame, f);
    e = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((g)create((d)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = d;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          localObject1 = c;
          localObject2 = b;
          localObject3 = (d)e;
          f.b(paramObject);
          localObject4 = this;
        }
        else
        {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        f.b(paramObject);
        break label284;
      }
    }
    else
    {
      f.b(paramObject);
      localObject5 = (d)e;
      paramObject = f.F();
      if ((paramObject instanceof p))
      {
        paramObject = e;
        d = 1;
        ((d)localObject5).a(paramObject, this);
        return locala;
      }
      if (!(paramObject instanceof f1)) {
        break label284;
      }
      localObject6 = ((f1)paramObject).b();
      if (localObject6 == null) {
        break label284;
      }
      paramObject = ((j)localObject6).h();
      ec.i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
      paramObject = (j)paramObject;
    }
    for (Object localObject7 = this; !ec.i.a(paramObject, localObject6); localObject7 = localObject4)
    {
      localObject1 = paramObject;
      localObject2 = localObject6;
      localObject3 = localObject5;
      localObject4 = localObject7;
      if ((paramObject instanceof p))
      {
        localObject2 = e;
        e = localObject5;
        b = ((sc.i)localObject6);
        c = ((j)paramObject);
        d = 2;
        ((d)localObject5).a(localObject2, (ub.e)localObject7);
        localObject1 = paramObject;
        localObject2 = localObject6;
        localObject3 = localObject5;
        localObject4 = localObject7;
        if (a.a == locala) {
          return locala;
        }
      }
      paramObject = ((j)localObject1).i();
      localObject6 = localObject2;
      localObject5 = localObject3;
    }
    label284:
    return rb.h.a;
  }
}

/* Location:
 * Qualified Name:     nc.o1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */