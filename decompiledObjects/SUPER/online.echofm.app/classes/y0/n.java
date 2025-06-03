package y0;

import java.util.NoSuchElementException;

public abstract interface n
{
  public static final n a = new a();
  
  public abstract long a();
  
  public abstract long b();
  
  public abstract boolean next();
  
  public class a
    implements n
  {
    public long a()
    {
      throw new NoSuchElementException();
    }
    
    public long b()
    {
      throw new NoSuchElementException();
    }
    
    public boolean next()
    {
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     y0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */