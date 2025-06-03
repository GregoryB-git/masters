package x0;

import android.view.View;
import dc.l;
import e0.d0;
import e0.d0.d;
import ec.i;
import ec.j;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import sb.q;

public final class e$i
  extends j
  implements l<Map.Entry<String, View>, Boolean>
{
  public e$i(Collection<String> paramCollection)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    Object localObject = (Map.Entry)paramObject;
    i.e(localObject, "entry");
    paramObject = a;
    localObject = (View)((Map.Entry)localObject).getValue();
    WeakHashMap localWeakHashMap = d0.a;
    return Boolean.valueOf(q.l((Collection)paramObject, d0.d.k((View)localObject)));
  }
}

/* Location:
 * Qualified Name:     x0.e.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */