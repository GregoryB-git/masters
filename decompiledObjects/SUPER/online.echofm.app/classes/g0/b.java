package g0;

import W2.g;
import X2.v;
import X2.v.a;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class b
{
  public static v a(g paramg, List paramList)
  {
    v.a locala = v.M();
    for (int i = 0; i < paramList.size(); i++) {
      locala.h(paramg.apply((Bundle)a.e((Bundle)paramList.get(i))));
    }
    return locala.k();
  }
  
  public static ArrayList b(Collection paramCollection, g paramg)
  {
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      localArrayList.add((Bundle)paramg.apply(paramCollection.next()));
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     g0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */