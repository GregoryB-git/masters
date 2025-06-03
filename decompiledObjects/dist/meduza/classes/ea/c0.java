package ea;

import wb.c;

@wb.e(c="com.google.firebase.sessions.SessionFirelogPublisherImpl", f="SessionFirelogPublisher.kt", l={94}, m="shouldLogSession")
public final class c0
  extends c
{
  public b0 a;
  public int d;
  
  public c0(b0 paramb0, ub.e<? super c0> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b = paramObject;
    d |= 0x80000000;
    return b0.b(c, this);
  }
}

/* Location:
 * Qualified Name:     ea.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */