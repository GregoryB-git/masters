package o0;

import n7.w;
import rb.h;
import vb.a;

public final class v
  implements qc.f<b0<Object>>
{
  public v(qc.f paramf) {}
  
  public final Object emit(Object paramObject, ub.e parame)
  {
    if ((parame instanceof a))
    {
      localObject1 = (a)parame;
      i = b;
      if ((i & 0x80000000) != 0)
      {
        b = (i + Integer.MIN_VALUE);
        parame = (ub.e)localObject1;
        break label50;
      }
    }
    parame = new a(this, parame);
    label50:
    Object localObject2 = a;
    Object localObject1 = a.a;
    int i = b;
    if (i != 0)
    {
      if (i == 1) {
        rb.f.b(localObject2);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(localObject2);
      localObject2 = a;
      paramObject = (b0)paramObject;
      if ((paramObject instanceof l)) {
        break label200;
      }
      if ((paramObject instanceof j)) {
        break label192;
      }
      if (!(paramObject instanceof c)) {
        break label164;
      }
      paramObject = a;
      b = 1;
      if (((qc.f)localObject2).emit(paramObject, parame) == localObject1) {
        return localObject1;
      }
    }
    return h.a;
    label164:
    if ((paramObject instanceof c0)) {
      throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
    }
    throw new w();
    label192:
    throw a;
    label200:
    throw a;
  }
  
  @wb.e(c="androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f="SingleProcessDataStore.kt", l={137}, m="emit")
  public static final class a
    extends wb.c
  {
    public int b;
    
    public a(v paramv, ub.e parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      a = paramObject;
      b |= 0x80000000;
      return c.emit(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     o0.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */