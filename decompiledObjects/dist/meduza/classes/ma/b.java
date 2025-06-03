package ma;

public abstract class b<MessageType extends s0>
  implements b1<MessageType>
{
  static
  {
    o.a();
  }
  
  public static void b(s0 params0)
  {
    if (!params0.f())
    {
      if ((params0 instanceof a))
      {
        localObject = (a)params0;
        localObject = new o1();
      }
      else
      {
        localObject = new o1();
      }
      Object localObject = new b0(((Throwable)localObject).getMessage());
      a = params0;
      throw ((Throwable)localObject);
    }
  }
  
  public final s0 a(i parami, o paramo)
  {
    parami = w.C(a, parami, paramo);
    b(parami);
    return parami;
  }
}

/* Location:
 * Qualified Name:     ma.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */