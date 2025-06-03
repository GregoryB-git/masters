package qc;

import dc.p;
import pc.q;
import pc.t;

public final class b<T>
  extends c<T>
{
  public final p<q<? super T>, ub.e<? super rb.h>, Object> e;
  
  public b(p<? super q<? super T>, ? super ub.e<? super rb.h>, ? extends Object> paramp, ub.h paramh, int paramInt, pc.a parama)
  {
    super(paramp, paramh, paramInt, parama);
    e = paramp;
  }
  
  public final Object b(q<? super T> paramq, ub.e<? super rb.h> parame)
  {
    if ((parame instanceof a))
    {
      localObject1 = (a)parame;
      i = d;
      if ((i & 0x80000000) != 0)
      {
        d = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super rb.h>)localObject1;
        break label50;
      }
    }
    parame = new a(this, parame);
    label50:
    Object localObject2 = b;
    Object localObject1 = vb.a.a;
    int i = d;
    if (i != 0)
    {
      if (i == 1)
      {
        paramq = a;
        rb.f.b(localObject2);
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(localObject2);
      a = paramq;
      d = 1;
      parame = d.invoke(paramq, parame);
      if (parame != localObject1) {
        parame = rb.h.a;
      }
      if (parame == localObject1) {
        return localObject1;
      }
    }
    if (paramq.m()) {
      return rb.h.a;
    }
    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
  }
  
  public final rc.f<T> c(ub.h paramh, int paramInt, pc.a parama)
  {
    return new b(e, paramh, paramInt, parama);
  }
  
  @wb.e(c="kotlinx.coroutines.flow.CallbackFlowBuilder", f="Builders.kt", l={334}, m="collectTo")
  public static final class a
    extends wb.c
  {
    public q a;
    public int d;
    
    public a(b<T> paramb, ub.e<? super a> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      b = paramObject;
      d |= 0x80000000;
      return c.b(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     qc.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */