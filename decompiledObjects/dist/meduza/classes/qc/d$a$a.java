package qc;

import wb.c;

@wb.e(c="kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f="Distinct.kt", l={77}, m="emit")
public final class d$a$a
  extends c
{
  public int c;
  
  public d$a$a(d.a<? super T> parama, ub.e<? super a> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a = paramObject;
    c |= 0x80000000;
    return b.emit(null, this);
  }
}

/* Location:
 * Qualified Name:     qc.d.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */