package p0;

import android.util.Pair;
import java.util.Map;

public abstract class U
{
  public static long a(Map paramMap, String paramString)
  {
    if (paramMap != null) {}
    try
    {
      paramMap = (String)paramMap.get(paramString);
      if (paramMap != null)
      {
        long l = Long.parseLong(paramMap);
        return l;
      }
    }
    catch (NumberFormatException paramMap)
    {
      for (;;) {}
    }
    return -9223372036854775807L;
  }
  
  public static Pair b(n paramn)
  {
    paramn = paramn.c();
    if (paramn == null) {
      return null;
    }
    return new Pair(Long.valueOf(a(paramn, "LicenseDurationRemaining")), Long.valueOf(a(paramn, "PlaybackDurationRemaining")));
  }
}

/* Location:
 * Qualified Name:     p0.U
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */