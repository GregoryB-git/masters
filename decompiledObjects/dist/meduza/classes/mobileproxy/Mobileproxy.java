package mobileproxy;

import go.Seq;
import go.Seq.Proxy;

public abstract class Mobileproxy
{
  static
  {
    Seq.touch();
    _init();
  }
  
  private static native void _init();
  
  public static native StringList newListFromLines(String paramString);
  
  public static native StreamDialer newSmartStreamDialer(StringList paramStringList, String paramString, LogWriter paramLogWriter);
  
  public static native LogWriter newStderrLogWriter();
  
  public static native StreamDialer newStreamDialerFromConfig(String paramString);
  
  public static native Proxy runProxy(String paramString, StreamDialer paramStreamDialer);
  
  public static void touch() {}
  
  public static final class proxyLogWriter
    implements Seq.Proxy, LogWriter
  {
    private final int refnum;
    
    public proxyLogWriter(int paramInt)
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
}

/* Location:
 * Qualified Name:     mobileproxy.Mobileproxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */