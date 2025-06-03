package D0;

import d0.n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public abstract class d$g
{
  public static Constructor a;
  public static Method b;
  public static Method c;
  
  public static n a(float paramFloat)
  {
    try
    {
      b();
      Object localObject = a.newInstance(new Object[0]);
      b.invoke(localObject, new Object[] { Float.valueOf(paramFloat) });
      android.support.v4.media.a.a(g0.a.e(c.invoke(localObject, new Object[0])));
      return null;
    }
    catch (Exception localException)
    {
      throw new IllegalStateException(localException);
    }
  }
  
  public static void b()
  {
    if ((a == null) || (b == null) || (c == null))
    {
      Class localClass = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
      a = localClass.getConstructor(new Class[0]);
      b = localClass.getMethod("setRotationDegrees", new Class[] { Float.TYPE });
      c = localClass.getMethod("build", new Class[0]);
    }
  }
}

/* Location:
 * Qualified Name:     D0.d.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */