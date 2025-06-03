package ha;

import com.google.firebase.components.ComponentRegistrar;
import d8.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
  implements f
{
  public final List<d8.b<?>> a(ComponentRegistrar paramComponentRegistrar)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramComponentRegistrar.getComponents().iterator();
    while (localIterator.hasNext())
    {
      d8.b localb = (d8.b)localIterator.next();
      String str = a;
      paramComponentRegistrar = localb;
      if (str != null)
      {
        paramComponentRegistrar = new a(str, localb);
        paramComponentRegistrar = new d8.b(str, b, c, d, e, paramComponentRegistrar, g);
      }
      localArrayList.add(paramComponentRegistrar);
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     ha.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */