package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d0$b
{
  public final String a;
  public final List<d0.a> b;
  public final byte[] c;
  
  public d0$b(int paramInt, String paramString, ArrayList paramArrayList, byte[] paramArrayOfByte)
  {
    a = paramString;
    if (paramArrayList == null) {
      paramString = Collections.emptyList();
    } else {
      paramString = Collections.unmodifiableList(paramArrayList);
    }
    b = paramString;
    c = paramArrayOfByte;
  }
}

/* Location:
 * Qualified Name:     m4.d0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */