package o4;

import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint;
import java.util.List;
import v5.e0;

public final class l$a
{
  public static int a(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble)
  {
    paramVideoCapabilities = paramVideoCapabilities.getSupportedPerformancePoints();
    int i = 0;
    if ((paramVideoCapabilities != null) && (!paramVideoCapabilities.isEmpty()))
    {
      Object localObject = e0.b;
      if ((!((String)localObject).equals("sabrina")) && (!((String)localObject).equals("boreal")))
      {
        localObject = e0.d;
        if ((!((String)localObject).startsWith("Lenovo TB-X605")) && (!((String)localObject).startsWith("Lenovo TB-X606")) && (!((String)localObject).startsWith("Lenovo TB-X616")))
        {
          j = 0;
          break label93;
        }
      }
      int j = 1;
      label93:
      if (j == 0)
      {
        localObject = new MediaCodecInfo.VideoCapabilities.PerformancePoint(paramInt1, paramInt2, (int)paramDouble);
        for (paramInt1 = i; paramInt1 < paramVideoCapabilities.size(); paramInt1++) {
          if (((MediaCodecInfo.VideoCapabilities.PerformancePoint)paramVideoCapabilities.get(paramInt1)).covers((MediaCodecInfo.VideoCapabilities.PerformancePoint)localObject)) {
            return 2;
          }
        }
        return 1;
      }
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     o4.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */