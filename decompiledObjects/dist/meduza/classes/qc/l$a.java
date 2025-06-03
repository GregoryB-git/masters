package qc;

import wb.c;

@wb.e(c="kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f="Limit.kt", l={37, 38, 40}, m="emit")
public final class l$a
  extends c
{
  public l a;
  public Object b;
  public int e;
  
  public l$a(l<? super T> paraml, ub.e<? super a> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    c = paramObject;
    e |= 0x80000000;
    return d.emit(null, this);
  }
}

/* Location:
 * Qualified Name:     qc.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */