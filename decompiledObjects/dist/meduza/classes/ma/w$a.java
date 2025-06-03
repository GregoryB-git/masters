package ma;

public abstract class w$a<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  extends a.a<MessageType, BuilderType>
{
  public final MessageType a;
  public MessageType b;
  
  public w$a(MessageType paramMessageType)
  {
    a = paramMessageType;
    if (!paramMessageType.y())
    {
      b = ((w)paramMessageType.t(w.f.d));
      return;
    }
    throw new IllegalArgumentException("Default instance must be immutable.");
  }
  
  public static void o(w paramw, Object paramObject)
  {
    d1 locald1 = d1.c;
    locald1.getClass();
    locald1.a(paramw.getClass()).a(paramw, paramObject);
  }
  
  public final w b()
  {
    return a;
  }
  
  public final Object clone()
  {
    a locala = (a)a.t(w.f.e);
    b = l();
    return locala;
  }
  
  public final boolean f()
  {
    return w.x(b, false);
  }
  
  public final MessageType k()
  {
    w localw = l();
    localw.getClass();
    if (w.x(localw, true)) {
      return localw;
    }
    throw new o1();
  }
  
  public final MessageType l()
  {
    if (!b.y()) {
      return b;
    }
    w localw = b;
    localw.getClass();
    d1 locald1 = d1.c;
    locald1.getClass();
    locald1.a(localw.getClass()).b(localw);
    localw.z();
    return b;
  }
  
  public final void m()
  {
    if (!b.y())
    {
      w localw = (w)a.t(w.f.d);
      o(localw, b);
      b = localw;
    }
  }
  
  public final void n(w paramw)
  {
    if (a.equals(paramw)) {
      return;
    }
    m();
    o(b, paramw);
  }
}

/* Location:
 * Qualified Name:     ma.w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */