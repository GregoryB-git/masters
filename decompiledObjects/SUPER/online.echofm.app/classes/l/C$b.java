package l;

import android.view.View;

public class C$b
  implements Runnable
{
  public C$b(C paramC) {}
  
  public void a()
  {
    C localC = o;
    A = null;
    localC.removeCallbacks(this);
  }
  
  public void b()
  {
    o.post(this);
  }
  
  public void run()
  {
    C localC = o;
    A = null;
    localC.drawableStateChanged();
  }
}

/* Location:
 * Qualified Name:     l.C.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */