package V2;

public final class s
  implements Runnable
{
  public s(t paramt, j paramj) {}
  
  public final void run()
  {
    if (o.l())
    {
      t.b(p).s();
      return;
    }
    try
    {
      Object localObject = t.a(p).a(o);
      t.b(p).r(localObject);
      return;
    }
    catch (Exception localException) {}catch (h localh) {}
    t.b(p).q(localh);
    return;
    if ((localh.getCause() instanceof Exception))
    {
      t.b(p).q((Exception)localh.getCause());
      return;
    }
    t.b(p).q(localh);
  }
}

/* Location:
 * Qualified Name:     V2.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */