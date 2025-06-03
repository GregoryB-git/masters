package t0;

import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint;
import d0.q.b;
import g0.M;
import java.util.List;

public abstract class v
{
  public static Boolean a;
  
  public static int c(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble)
  {
    if (M.a >= 29)
    {
      Boolean localBoolean = a;
      if ((localBoolean == null) || (!localBoolean.booleanValue())) {
        return a.a(paramVideoCapabilities, paramInt1, paramInt2, paramDouble);
      }
    }
    return 0;
  }
  
  public static final abstract class a
  {
    public static int a(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble)
    {
      paramVideoCapabilities = s.a(paramVideoCapabilities);
      if ((paramVideoCapabilities != null) && (!paramVideoCapabilities.isEmpty()))
      {
        r.a();
        paramInt1 = b(paramVideoCapabilities, q.a(paramInt1, paramInt2, (int)paramDouble));
        if ((paramInt1 == 1) && (v.a() == null))
        {
          v.b(Boolean.valueOf(c()));
          if (v.a().booleanValue()) {
            return 0;
          }
        }
        return paramInt1;
      }
      return 0;
    }
    
    public static int b(List paramList, MediaCodecInfo.VideoCapabilities.PerformancePoint paramPerformancePoint)
    {
      for (int i = 0; i < paramList.size(); i++) {
        if (u.a(t.a(paramList.get(i)), paramPerformancePoint)) {
          return 2;
        }
      }
      return 1;
    }
    
    public static boolean c()
    {
      int i = M.a;
      boolean bool = false;
      if (i >= 35) {
        return false;
      }
      try
      {
        Object localObject = new d0/q$b;
        ((q.b)localObject).<init>();
        localObject = ((q.b)localObject).o0("video/avc").K();
        if (n != null)
        {
          List localList = I.v(z.a, (d0.q)localObject, false, false);
          for (i = 0; i < localList.size(); i++) {
            if ((getd != null) && (getd.getVideoCapabilities() != null))
            {
              localObject = s.a(getd.getVideoCapabilities());
              if ((localObject != null) && (!((List)localObject).isEmpty()))
              {
                r.a();
                i = b((List)localObject, q.a(1280, 720, 60));
                if (i == 1) {
                  bool = true;
                }
                return bool;
              }
            }
          }
        }
      }
      catch (I.c localc)
      {
        for (;;) {}
      }
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     t0.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */