package o1;

import android.os.Build.VERSION;

public final class a
{
  public static final a a = new a();
  
  public final int a()
  {
    int i;
    if (Build.VERSION.SDK_INT >= 30) {
      i = a.a.a();
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final class a
  {
    public static final a a = new a();
    
    public final int a()
    {
      return E.a.a(1000000);
    }
  }
}

/* Location:
 * Qualified Name:     o1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */