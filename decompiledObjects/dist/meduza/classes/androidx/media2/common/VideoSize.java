package androidx.media2.common;

import b2.e;

public class VideoSize
  implements e
{
  public int a;
  public int b;
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    boolean bool2 = bool1;
    if ((paramObject instanceof VideoSize))
    {
      paramObject = (VideoSize)paramObject;
      bool2 = bool1;
      if (a == a)
      {
        bool2 = bool1;
        if (b == b) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    int i = b;
    int j = a;
    return i ^ (j >>> 16 | j << 16);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append("x");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.VideoSize
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */