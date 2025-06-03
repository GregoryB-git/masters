package mobileproxy;

import go.Seq;
import go.Seq.Proxy;
import java.util.Arrays;

public final class Proxy
  implements Seq.Proxy
{
  private final int refnum;
  
  static {}
  
  public Proxy()
  {
    int i = __New();
    refnum = i;
    Seq.trackGoRef(i, this);
  }
  
  public Proxy(int paramInt)
  {
    refnum = paramInt;
    Seq.trackGoRef(paramInt, this);
  }
  
  private static native int __New();
  
  public native void addURLProxy(String paramString, StreamDialer paramStreamDialer);
  
  public native String address();
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof Proxy)))
    {
      paramObject = (Proxy)paramObject;
      return true;
    }
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[0]);
  }
  
  public native String host();
  
  public final int incRefnum()
  {
    Seq.incGoRef(refnum, this);
    return refnum;
  }
  
  public native long port();
  
  public native void stop(long paramLong);
  
  public String toString()
  {
    return "Proxy{}";
  }
}

/* Location:
 * Qualified Name:     mobileproxy.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */