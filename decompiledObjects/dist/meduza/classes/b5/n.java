package b5;

import java.util.NoSuchElementException;

public abstract interface n
{
  public static final a a = new a();
  
  public abstract long a();
  
  public abstract long b();
  
  public abstract boolean next();
  
  public final class a
    implements n
  {
    public final long a()
    {
      throw new NoSuchElementException();
    }
    
    public final long b()
    {
      throw new NoSuchElementException();
    }
    
    public final boolean next()
    {
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     b5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */