package y2;

import x2.d;

public final class g
  extends UnsupportedOperationException
{
  public final d o;
  
  public g(d paramd)
  {
    o = paramd;
  }
  
  public String getMessage()
  {
    return "Missing ".concat(String.valueOf(o));
  }
}

/* Location:
 * Qualified Name:     y2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */