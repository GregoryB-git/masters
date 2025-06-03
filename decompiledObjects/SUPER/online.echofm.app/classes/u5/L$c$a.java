package u5;

public class L$c$a
  implements L.d.a
{
  public boolean a = false;
  
  public L$c$a(L.c paramc) {}
  
  public void a(boolean paramBoolean)
  {
    if (!a)
    {
      a = true;
      L.c localc = b;
      int i = b - 1;
      b = i;
      paramBoolean |= c;
      c = paramBoolean;
      if ((i == 0) && (!paramBoolean)) {
        L.c(d, a);
      }
      return;
    }
    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
  }
}

/* Location:
 * Qualified Name:     u5.L.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */