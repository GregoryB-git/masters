package hb;

import eb.o0;
import eb.p0;

public final class g
  extends p0
{
  public o0 a(String paramString)
  {
    return new e(paramString);
  }
  
  public boolean b()
  {
    return true;
  }
  
  public int c()
  {
    ClassLoader localClassLoader = g.class.getClassLoader();
    int i = 0;
    try
    {
      Class.forName("android.app.Application", false, localClassLoader);
      i = 1;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    if (i != 0) {
      i = 8;
    } else {
      i = 3;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     hb.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */