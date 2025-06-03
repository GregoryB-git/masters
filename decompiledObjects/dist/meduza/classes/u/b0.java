package u;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

public final class b0
  implements Iterable<Intent>
{
  public final ArrayList<Intent> a = new ArrayList();
  public final Context b;
  
  public b0(Context paramContext)
  {
    b = paramContext;
  }
  
  @Deprecated
  public final Iterator<Intent> iterator()
  {
    return a.iterator();
  }
  
  public static abstract interface a
  {
    public abstract Intent getSupportParentActivityIntent();
  }
}

/* Location:
 * Qualified Name:     u.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */