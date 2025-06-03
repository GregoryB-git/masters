package K2;

import android.os.Build.VERSION;

public abstract class h
{
  public static final int a;
  
  static
  {
    int i;
    if (Build.VERSION.SDK_INT >= 31) {
      i = 33554432;
    } else {
      i = 0;
    }
    a = i;
  }
}

/* Location:
 * Qualified Name:     K2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */