package go;

public abstract class Universe
{
  static
  {
    Seq.touch();
    _init();
  }
  
  private static native void _init();
  
  public static void touch() {}
  
  public static final class proxyerror
    extends Exception
    implements Seq.Proxy, error
  {
    private final int refnum;
    
    public proxyerror(int paramInt)
    {
      refnum = paramInt;
      Seq.trackGoRef(paramInt, this);
    }
    
    public native String error();
    
    public String getMessage()
    {
      return error();
    }
    
    public final int incRefnum()
    {
      Seq.incGoRef(refnum, this);
      return refnum;
    }
  }
}

/* Location:
 * Qualified Name:     go.Universe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */