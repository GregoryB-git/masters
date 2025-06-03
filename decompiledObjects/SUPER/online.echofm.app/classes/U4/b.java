package U4;

import B3.c;
import B3.j;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b
  implements j
{
  public List a(ComponentRegistrar paramComponentRegistrar)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramComponentRegistrar.getComponents().iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      String str = localc.i();
      paramComponentRegistrar = localc;
      if (str != null) {
        paramComponentRegistrar = localc.t(new a(str, localc));
      }
      localArrayList.add(paramComponentRegistrar);
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     U4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */