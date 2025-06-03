package w3;

import android.media.metrics.LogSessionId;
import v5.e0;
import x6.b;

public final class a0
{
  public final a a;
  
  static
  {
    if (e0.a < 31) {
      new a0();
    } else {
      int i = a.b;
    }
  }
  
  public a0()
  {
    this(null);
    boolean bool;
    if (e0.a < 31) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
  }
  
  public a0(LogSessionId paramLogSessionId)
  {
    this(new a(paramLogSessionId));
  }
  
  public a0(a parama)
  {
    a = parama;
  }
  
  public static final class a
  {
    public final LogSessionId a;
    
    static
    {
      LogSessionId localLogSessionId = LogSessionId.LOG_SESSION_ID_NONE;
    }
    
    public a(LogSessionId paramLogSessionId)
    {
      a = paramLogSessionId;
    }
  }
}

/* Location:
 * Qualified Name:     w3.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */