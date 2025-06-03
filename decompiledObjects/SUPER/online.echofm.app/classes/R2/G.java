package R2;

import android.os.BaseBundle;
import java.util.Iterator;
import java.util.Set;

public final class G
  implements Iterator
{
  public Iterator o;
  
  public G(D paramD)
  {
    o = D.d(paramD).keySet().iterator();
  }
  
  public final boolean hasNext()
  {
    return o.hasNext();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Remove not supported");
  }
}

/* Location:
 * Qualified Name:     R2.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */