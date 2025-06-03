package H1;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class b$a
{
  public final b a(File paramFile)
  {
    Intrinsics.checkNotNullParameter(paramFile, "file");
    paramFile = b(paramFile);
    if (paramFile == null) {
      return null;
    }
    try
    {
      paramFile = new b(paramFile, null);
      return paramFile;
    }
    catch (Exception paramFile) {}
    return null;
  }
  
  public final Map b(File paramFile)
  {
    paramFile = j.c(paramFile);
    if (paramFile != null)
    {
      HashMap localHashMap = new HashMap();
      Map localMap = b.a();
      Iterator localIterator = paramFile.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramFile = (String)localEntry.getKey();
        if (localMap.containsKey(localEntry.getKey()))
        {
          String str = (String)localMap.get(localEntry.getKey());
          paramFile = str;
          if (str == null) {
            return null;
          }
        }
        localHashMap.put(paramFile, localEntry.getValue());
      }
      return localHashMap;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     H1.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */