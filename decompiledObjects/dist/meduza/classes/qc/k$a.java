package qc;

import wb.c;

@wb.e(c="kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f="Errors.kt", l={158}, m="emit")
public final class k$a
  extends c
{
  public k a;
  public int d;
  
  public k$a(k<? super T> paramk, ub.e<? super a> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b = paramObject;
    d |= 0x80000000;
    return c.emit(null, this);
  }
}

/* Location:
 * Qualified Name:     qc.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */