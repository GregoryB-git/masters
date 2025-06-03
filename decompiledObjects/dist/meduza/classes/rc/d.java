package rc;

import nc.d0;
import pc.b;

@wb.e(c="kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f="ChannelFlow.kt", l={123}, m="invokeSuspend")
public final class d
  extends wb.i
  implements dc.p<d0, ub.e<? super rb.h>, Object>
{
  public int a;
  
  public d(ub.e parame, qc.f paramf, f paramf1)
  {
    super(2, parame);
  }
  
  public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new d(parame, c, d);
    b = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((d)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    vb.a locala = vb.a.a;
    int i = a;
    if (i != 0)
    {
      if (i == 1) {
        rb.f.b(paramObject);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(paramObject);
      Object localObject1 = (d0)b;
      paramObject = c;
      Object localObject2 = d;
      ub.h localh = a;
      int j = b;
      i = j;
      if (j == -3) {
        i = -2;
      }
      Object localObject3 = c;
      localObject2 = new e((f)localObject2, null);
      localObject3 = pc.i.a(i, (pc.a)localObject3, 4);
      localObject1 = new pc.p(nc.y.b((d0)localObject1, localh), (b)localObject3);
      ((nc.a)localObject1).d0(3, (nc.a)localObject1, (dc.p)localObject2);
      a = 1;
      paramObject = eb.y.b((qc.f)paramObject, (pc.p)localObject1, true, this);
      if (paramObject != locala) {
        paramObject = rb.h.a;
      }
      if (paramObject == locala) {
        return locala;
      }
    }
    return rb.h.a;
  }
}

/* Location:
 * Qualified Name:     rc.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */