package R2;

import com.google.android.gms.internal.measurement.y6;
import java.util.Map;

public final class F2
  implements y6
{
  public F2(x2 paramx2, String paramString) {}
  
  public final String i(String paramString)
  {
    Map localMap = (Map)x2.D(b).get(a);
    if ((localMap != null) && (localMap.containsKey(paramString))) {
      return (String)localMap.get(paramString);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     R2.F2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */