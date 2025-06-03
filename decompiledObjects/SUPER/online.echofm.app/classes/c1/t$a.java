package c1;

import d0.q;

public abstract interface t$a
{
  public static final a a = new a();
  
  public abstract boolean a(q paramq);
  
  public abstract t b(q paramq);
  
  public abstract int c(q paramq);
  
  public class a
    implements t.a
  {
    public boolean a(q paramq)
    {
      return false;
    }
    
    public t b(q paramq)
    {
      throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }
    
    public int c(q paramq)
    {
      return 1;
    }
  }
}

/* Location:
 * Qualified Name:     c1.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */