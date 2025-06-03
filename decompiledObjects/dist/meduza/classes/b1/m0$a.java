package b1;

public final class m0$a
  implements Runnable
{
  public final p a;
  public final k.a b;
  public boolean c;
  
  public m0$a(p paramp, k.a parama)
  {
    a = paramp;
    b = parama;
  }
  
  public final void run()
  {
    if (!c)
    {
      a.f(b);
      c = true;
    }
  }
}

/* Location:
 * Qualified Name:     b1.m0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */