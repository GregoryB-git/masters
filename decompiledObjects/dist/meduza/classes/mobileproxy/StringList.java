package mobileproxy;

import go.Seq;
import go.Seq.Proxy;
import java.util.Arrays;

public final class StringList
  implements Seq.Proxy
{
  private final int refnum;
  
  static {}
  
  public StringList()
  {
    int i = __New();
    refnum = i;
    Seq.trackGoRef(i, this);
  }
  
  public StringList(int paramInt)
  {
    refnum = paramInt;
    Seq.trackGoRef(paramInt, this);
  }
  
  private static native int __New();
  
  public native void append(String paramString);
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof StringList)))
    {
      paramObject = (StringList)paramObject;
      return true;
    }
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[0]);
  }
  
  public final int incRefnum()
  {
    Seq.incGoRef(refnum, this);
    return refnum;
  }
  
  public String toString()
  {
    return "StringList{}";
  }
}

/* Location:
 * Qualified Name:     mobileproxy.StringList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */