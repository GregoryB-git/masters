package e5;

import android.net.Uri;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class e
  extends LinkedHashMap<Uri, byte[]>
{
  public e(int paramInt)
  {
    super(paramInt, 1.0F, false);
  }
  
  public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> paramEntry)
  {
    boolean bool;
    if (size() > a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     e5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */