package u5;

import android.view.KeyEvent;

public class L$c
{
  public final KeyEvent a;
  public int b;
  public boolean c;
  
  public L$c(L paramL, KeyEvent paramKeyEvent)
  {
    b = a.length;
    c = false;
    a = paramKeyEvent;
  }
  
  public L.d.a a()
  {
    return new a(null);
  }
  
  public class a
    implements L.d.a
  {
    public boolean a = false;
    
    public a() {}
    
    public void a(boolean paramBoolean)
    {
      if (!a)
      {
        a = true;
        L.c localc = L.c.this;
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
}

/* Location:
 * Qualified Name:     u5.L.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */