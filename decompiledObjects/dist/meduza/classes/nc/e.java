package nc;

import java.util.Iterator;
import wb.c;

@wb.e(c="kotlinx.coroutines.AwaitKt", f="Await.kt", l={66}, m="joinAll")
public final class e
  extends c
{
  public Iterator a;
  public int c;
  
  public e(ub.e<? super e> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b = paramObject;
    c |= 0x80000000;
    return d.b(null, this);
  }
}

/* Location:
 * Qualified Name:     nc.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */