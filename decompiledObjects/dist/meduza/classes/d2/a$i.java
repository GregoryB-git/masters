package d2;

import android.os.Build.VERSION;

public class a$i
  extends a
{
  public a$i()
  {
    super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
  }
  
  public final boolean c()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 33) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     d2.a.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */