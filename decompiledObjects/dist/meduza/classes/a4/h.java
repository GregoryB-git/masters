package a4;

import android.os.Looper;
import v3.i0;
import w3.a0;

public abstract interface h
{
  public static final a a = new a();
  
  public abstract void a();
  
  public abstract b b(g.a parama, i0 parami0);
  
  public abstract void c(Looper paramLooper, a0 parama0);
  
  public abstract e d(g.a parama, i0 parami0);
  
  public abstract int e(i0 parami0);
  
  public abstract void release();
  
  public final class a
    implements h
  {
    public final void c(Looper paramLooper, a0 parama0) {}
    
    public final e d(g.a parama, i0 parami0)
    {
      if (w == null) {
        return null;
      }
      return new n(new e.a(6001, new y()));
    }
    
    public final int e(i0 parami0)
    {
      int i;
      if (w != null) {
        i = 1;
      } else {
        i = 0;
      }
      return i;
    }
  }
  
  public static abstract interface b
  {
    public static final e0.e h = new e0.e(12);
    
    public abstract void release();
  }
}

/* Location:
 * Qualified Name:     a4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */