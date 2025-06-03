package rc;

import wb.c;

@wb.e(c="kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f="Combine.kt", l={32, 33}, m="emit")
public final class j$a$a$a
  extends c
{
  public int c;
  
  public j$a$a$a(j.a.a<? super T> parama, ub.e<? super a> parame)
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
 * Qualified Name:     rc.j.a.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */