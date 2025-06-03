package qc;

import eb.y;
import pc.h;
import pc.s;
import wb.c;

@wb.e(c="kotlinx.coroutines.flow.FlowKt__ChannelsKt", f="Channels.kt", l={36, 37}, m="emitAllImpl$FlowKt__ChannelsKt")
public final class g<T>
  extends c
{
  public f a;
  public s b;
  public h c;
  public boolean d;
  public int f;
  
  public g(ub.e<? super g> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    e = paramObject;
    f |= 0x80000000;
    return y.b(null, null, false, this);
  }
}

/* Location:
 * Qualified Name:     qc.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */