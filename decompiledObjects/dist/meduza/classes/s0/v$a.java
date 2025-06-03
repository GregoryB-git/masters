package s0;

import g3.b;

public abstract class v$a<MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  extends a.a<MessageType, BuilderType>
{
  public final MessageType a;
  public MessageType b;
  public boolean c;
  
  public v$a(MessageType paramMessageType)
  {
    a = paramMessageType;
    b = ((v)paramMessageType.k(v.f.d));
    c = false;
  }
  
  public static void k(v paramv1, v paramv2)
  {
    y0 localy0 = y0.c;
    localy0.getClass();
    localy0.a(paramv1.getClass()).a(paramv1, paramv2);
  }
  
  public final v b()
  {
    return a;
  }
  
  public final Object clone()
  {
    a locala = (a)a.k(v.f.e);
    v localv = i();
    locala.j();
    k(b, localv);
    return locala;
  }
  
  public final MessageType h()
  {
    v localv = i();
    if (localv.f()) {
      return localv;
    }
    throw new b();
  }
  
  public final MessageType i()
  {
    if (c) {
      return b;
    }
    v localv = b;
    localv.getClass();
    y0 localy0 = y0.c;
    localy0.getClass();
    localy0.a(localv.getClass()).b(localv);
    c = true;
    return b;
  }
  
  public final void j()
  {
    if (c)
    {
      v localv = (v)b.k(v.f.d);
      k(localv, b);
      b = localv;
      c = false;
    }
  }
}

/* Location:
 * Qualified Name:     s0.v.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */