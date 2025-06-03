package t1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

public abstract interface b
  extends Closeable
{
  public abstract void G();
  
  public abstract void J();
  
  public abstract Cursor V(e parame, CancellationSignal paramCancellationSignal);
  
  public abstract void X();
  
  public abstract void h();
  
  public abstract boolean isOpen();
  
  public abstract boolean j0();
  
  public abstract void m(String paramString);
  
  public abstract boolean n0();
  
  public abstract f q(String paramString);
  
  public abstract Cursor y(e parame);
}

/* Location:
 * Qualified Name:     t1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */