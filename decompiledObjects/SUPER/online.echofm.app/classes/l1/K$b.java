package l1;

import java.util.Collections;
import java.util.List;

public final class K$b
{
  public final int a;
  public final String b;
  public final int c;
  public final List d;
  public final byte[] e;
  
  public K$b(int paramInt1, String paramString, int paramInt2, List paramList, byte[] paramArrayOfByte)
  {
    a = paramInt1;
    b = paramString;
    c = paramInt2;
    if (paramList == null) {
      paramString = Collections.emptyList();
    } else {
      paramString = Collections.unmodifiableList(paramList);
    }
    d = paramString;
    e = paramArrayOfByte;
  }
  
  public int a()
  {
    int i = c;
    if (i != 2)
    {
      if (i != 3) {
        return 0;
      }
      return 512;
    }
    return 2048;
  }
}

/* Location:
 * Qualified Name:     l1.K.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */