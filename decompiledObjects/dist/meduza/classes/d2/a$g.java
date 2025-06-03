package d2;

import android.os.Build.VERSION;

public final class a$g
  extends a
{
  public a$g()
  {
    super("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
  }
  
  public final boolean c()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 28) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     d2.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */