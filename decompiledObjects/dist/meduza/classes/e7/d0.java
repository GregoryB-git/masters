package e7;

import android.os.BaseBundle;
import java.util.Iterator;
import java.util.Set;

public final class d0
  implements Iterator<String>
{
  public Iterator<String> a;
  
  public d0(a0 parama0)
  {
    a = a.keySet().iterator();
  }
  
  public final boolean hasNext()
  {
    return a.hasNext();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Remove not supported");
  }
}

/* Location:
 * Qualified Name:     e7.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */