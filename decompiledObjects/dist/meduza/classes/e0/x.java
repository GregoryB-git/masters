package e0;

import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class x
{
  public static Map<VelocityTracker, y> a = Collections.synchronizedMap(new WeakHashMap());
  
  public static final class a
  {
    public static float a(VelocityTracker paramVelocityTracker, int paramInt)
    {
      return paramVelocityTracker.getAxisVelocity(paramInt);
    }
    
    public static float b(VelocityTracker paramVelocityTracker, int paramInt1, int paramInt2)
    {
      return paramVelocityTracker.getAxisVelocity(paramInt1, paramInt2);
    }
    
    public static boolean c(VelocityTracker paramVelocityTracker, int paramInt)
    {
      return paramVelocityTracker.isAxisSupported(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     e0.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */