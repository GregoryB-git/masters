package q0;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class e$a
  extends LinkedHashMap
{
  public e$a(e parame, int paramInt1, float paramFloat, boolean paramBoolean, int paramInt2)
  {
    super(paramInt1, paramFloat, paramBoolean);
  }
  
  public boolean removeEldestEntry(Map.Entry paramEntry)
  {
    boolean bool;
    if (size() > o) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     q0.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */