package qc;

import wb.c;

@wb.e(c="kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f="Errors.kt", l={114, 115}, m="collect")
public final class i$a
  extends c
{
  public int b;
  public i d;
  public f e;
  
  public i$a(i parami, ub.e parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a = paramObject;
    b |= 0x80000000;
    return c.collect(null, this);
  }
}

/* Location:
 * Qualified Name:     qc.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */