package pa;

import android.net.Uri;
import ec.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import t5.a0;
import t5.s.a;

public final class j
{
  public static final s.a a(String paramString, Map arg1)
  {
    s.a locala = new s.a();
    b = paramString;
    e = true;
    c = 8000;
    d = 8000;
    if (??? != null)
    {
      paramString = new LinkedHashMap();
      Iterator localIterator = ???.entrySet().iterator();
      while (localIterator.hasNext())
      {
        ??? = (Map.Entry)localIterator.next();
        paramString.put(???.getKey(), ???.getValue());
      }
      synchronized (a)
      {
        b = null;
        a.clear();
        a.putAll(paramString);
      }
    }
    return locala;
  }
  
  public static final boolean b(Uri paramUri)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramUri != null) {
      if (paramUri.getScheme() == null)
      {
        bool2 = bool1;
      }
      else
      {
        paramUri = paramUri.getScheme();
        if (!i.a(paramUri, "http"))
        {
          bool2 = bool1;
          if (!i.a(paramUri, "https")) {}
        }
        else
        {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     pa.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */