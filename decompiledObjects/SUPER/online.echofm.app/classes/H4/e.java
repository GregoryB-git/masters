package H4;

import N4.i;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class e
{
  public static List a(i parami, Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    if (parami.l()) {
      localArrayList.add(new d(parami.n()));
    }
    if (parami.o()) {
      localArrayList.add(new c(parami.p(), paramContext));
    }
    if (parami.Z()) {
      localArrayList.add(new a(parami.Y()));
    }
    if (parami.f()) {
      localArrayList.add(new b(parami.g()));
    }
    return localArrayList;
  }
  
  public static boolean b(i parami, Context paramContext)
  {
    parami = a(parami, paramContext);
    if (parami.isEmpty())
    {
      F4.a.e().a("No validators found for PerfMetric.");
      return false;
    }
    parami = parami.iterator();
    while (parami.hasNext()) {
      if (!((e)parami.next()).c()) {
        return false;
      }
    }
    return true;
  }
  
  public static void d(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString1.length() != 0))
    {
      if ((paramString2 != null) && (paramString2.length() != 0))
      {
        if (paramString1.length() <= 40)
        {
          if (paramString2.length() <= 100)
          {
            if (paramString1.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
              return;
            }
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
          }
          throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[] { Integer.valueOf(100) }));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[] { Integer.valueOf(40) }));
      }
      throw new IllegalArgumentException("Attribute value must not be null or empty");
    }
    throw new IllegalArgumentException("Attribute key must not be null or empty");
  }
  
  public static String e(String paramString)
  {
    int i = 0;
    if (paramString == null) {
      return "Metric name must not be null";
    }
    if (paramString.length() > 100) {
      return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[] { Integer.valueOf(100) });
    }
    if (paramString.startsWith("_"))
    {
      M4.b[] arrayOfb = M4.b.values();
      int j = arrayOfb.length;
      while (i < j)
      {
        if (arrayOfb[i].toString().equals(paramString)) {
          return null;
        }
        i++;
      }
      return "Metric name must not start with '_'";
    }
    return null;
  }
  
  public static String f(String paramString)
  {
    int i = 0;
    if (paramString == null) {
      return "Trace name must not be null";
    }
    if (paramString.length() > 100) {
      return String.format(Locale.US, "Trace name must not exceed %d characters", new Object[] { Integer.valueOf(100) });
    }
    if (paramString.startsWith("_"))
    {
      M4.c[] arrayOfc = M4.c.values();
      int j = arrayOfc.length;
      while (i < j)
      {
        if (arrayOfc[i].toString().equals(paramString)) {
          return null;
        }
        i++;
      }
      if (paramString.startsWith("_st_")) {
        return null;
      }
      return "Trace name must not start with '_'";
    }
    return null;
  }
  
  public abstract boolean c();
}

/* Location:
 * Qualified Name:     H4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */