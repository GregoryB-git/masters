package androidx.media2.common;

import b2.e;
import java.util.Arrays;
import java.util.Objects;

public final class SubtitleData
  implements e
{
  public long a;
  public long b;
  public byte[] c;
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (SubtitleData.class == paramObject.getClass()))
    {
      paramObject = (SubtitleData)paramObject;
      if ((a != a) || (b != b) || (!Arrays.equals(c, c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { Long.valueOf(a), Long.valueOf(b), Integer.valueOf(Arrays.hashCode(c)) });
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.SubtitleData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */