package L;

import android.os.Build.VERSION;

public abstract interface b
{
  public static final boolean b;
  
  static
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 27) {
      bool = true;
    } else {
      bool = false;
    }
    b = bool;
  }
}

/* Location:
 * Qualified Name:     L.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */