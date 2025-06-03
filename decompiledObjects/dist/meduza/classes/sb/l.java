package sb;

import java.util.Iterator;

public abstract class l
  implements Iterator<Character>
{
  public abstract char a();
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     sb.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */