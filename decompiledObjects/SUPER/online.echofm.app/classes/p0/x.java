package p0;

import android.os.Looper;
import d0.q;
import l0.y1;

public abstract interface x
{
  public static final x a = new a();
  
  public abstract void a(Looper paramLooper, y1 paramy1);
  
  public abstract int b(q paramq);
  
  public abstract n c(v.a parama, q paramq);
  
  public abstract b d(v.a parama, q paramq);
  
  public abstract void g();
  
  public abstract void release();
  
  public class a
    implements x
  {
    public void a(Looper paramLooper, y1 paramy1) {}
    
    public int b(q paramq)
    {
      int i;
      if (r != null) {
        i = 1;
      } else {
        i = 0;
      }
      return i;
    }
    
    public n c(v.a parama, q paramq)
    {
      if (r == null) {
        return null;
      }
      return new D(new n.a(new T(1), 6001));
    }
  }
  
  public static abstract interface b
  {
    public static final b a = new y();
    
    public abstract void release();
  }
}

/* Location:
 * Qualified Name:     p0.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */