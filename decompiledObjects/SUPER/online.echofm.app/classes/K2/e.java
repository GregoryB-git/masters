package K2;

import android.os.Build.VERSION;

public abstract class e
{
  public static boolean a()
  {
    return (Build.VERSION.SDK_INT >= 33) || (Build.VERSION.CODENAME.charAt(0) == 'T');
  }
}

/* Location:
 * Qualified Name:     K2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */