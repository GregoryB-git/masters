package mobileproxy;

import go.Seq;
import go.Seq.Proxy;
import java.util.Arrays;

public final class StreamDialer
  implements Seq.Proxy
{
  private final int refnum;
  
  static {}
  
  public StreamDialer(int paramInt)
  {
    refnum = paramInt;
    Seq.trackGoRef(paramInt, this);
  }
  
  public StreamDialer(String paramString)
  {
    int i = __NewStreamDialerFromConfig(paramString);
    refnum = i;
    Seq.trackGoRef(i, this);
  }
  
  private static native int __NewStreamDialerFromConfig(String paramString);
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof StreamDialer)))
    {
      paramObject = (StreamDialer)paramObject;
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
    return "StreamDialer{}";
  }
}

/* Location:
 * Qualified Name:     mobileproxy.StreamDialer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */