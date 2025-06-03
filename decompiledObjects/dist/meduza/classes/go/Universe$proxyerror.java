package go;

final class Universe$proxyerror
  extends Exception
  implements Seq.Proxy, error
{
  private final int refnum;
  
  public Universe$proxyerror(int paramInt)
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

/* Location:
 * Qualified Name:     go.Universe.proxyerror
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */