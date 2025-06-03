package mobileproxy;

import go.Seq;
import go.Seq.Proxy;

final class Mobileproxy$proxyLogWriter
  implements Seq.Proxy, LogWriter
{
  private final int refnum;
  
  public Mobileproxy$proxyLogWriter(int paramInt)
  {
    refnum = paramInt;
    Seq.trackGoRef(paramInt, this);
  }
  
  public final int incRefnum()
  {
    Seq.incGoRef(refnum, this);
    return refnum;
  }
  
  public native long writeString(String paramString);
}

/* Location:
 * Qualified Name:     mobileproxy.Mobileproxy.proxyLogWriter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */