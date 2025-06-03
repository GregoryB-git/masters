package d2;

import android.os.Build.VERSION;

public final class z$b
  extends z
{
  public z$b()
  {
    super("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
  }
  
  public final boolean b()
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
 * Qualified Name:     d2.z.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */