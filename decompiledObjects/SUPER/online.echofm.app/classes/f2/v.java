package f2;

import android.content.Context;
import java.io.Closeable;
import n2.d;

public abstract class v
  implements Closeable
{
  public abstract d a();
  
  public abstract u b();
  
  public void close()
  {
    a().close();
  }
  
  public static abstract interface a
  {
    public abstract v a();
    
    public abstract a b(Context paramContext);
  }
}

/* Location:
 * Qualified Name:     f2.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */