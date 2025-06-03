package qc;

import ec.s;
import wb.c;
import x6.b;

@wb.e(c="kotlinx.coroutines.flow.FlowKt__ErrorsKt", f="Errors.kt", l={156}, m="catchImpl")
public final class j<T>
  extends c
{
  public s a;
  public int c;
  
  public j(ub.e<? super j> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b = paramObject;
    c |= 0x80000000;
    return b.k(this, null, null);
  }
}

/* Location:
 * Qualified Name:     qc.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */