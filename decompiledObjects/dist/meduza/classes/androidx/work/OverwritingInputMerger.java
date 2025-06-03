package androidx.work;

import ec.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o2.f;

public final class OverwritingInputMerger
  extends f
{
  public final c a(ArrayList paramArrayList)
  {
    c.a locala = new c.a();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      paramArrayList = Collections.unmodifiableMap(nexta);
      i.d(paramArrayList, "input.keyValueMap");
      localLinkedHashMap.putAll(paramArrayList);
    }
    locala.a(localLinkedHashMap);
    paramArrayList = new c(a);
    c.e(paramArrayList);
    return paramArrayList;
  }
}

/* Location:
 * Qualified Name:     androidx.work.OverwritingInputMerger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */