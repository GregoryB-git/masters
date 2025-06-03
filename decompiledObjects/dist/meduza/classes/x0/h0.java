package x0;

import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import r.b;
import r.g.b;
import r.h;

public final class h0
{
  public static final j0 a = new j0();
  public static final n0 b;
  
  static
  {
    n0 localn02;
    try
    {
      n0 localn01 = (n0)Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localn02 = null;
    }
    b = localn02;
  }
  
  public static final void a(i parami1, i parami2, boolean paramBoolean, b paramb)
  {
    ec.i.e(parami1, "inFragment");
    ec.i.e(parami2, "outFragment");
    ec.i.e(paramb, "sharedElements");
    if (paramBoolean) {
      parami1 = parami2.getEnterTransitionCallback();
    } else {
      parami1 = parami1.getEnterTransitionCallback();
    }
    if (parami1 != null)
    {
      parami1 = new ArrayList(c);
      parami2 = ((g.b)paramb.entrySet()).iterator();
      while (parami2.hasNext()) {
        parami1.add((View)((Map.Entry)parami2.next()).getValue());
      }
      parami1 = new ArrayList(c);
      parami2 = ((g.b)paramb.entrySet()).iterator();
      while (parami2.hasNext()) {
        parami1.add((String)((Map.Entry)parami2.next()).getKey());
      }
    }
  }
  
  public static final String b(b<String, String> paramb, String paramString)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    Iterator localIterator = ((g.b)paramb.entrySet()).iterator();
    while (localIterator.hasNext())
    {
      paramb = (Map.Entry)localIterator.next();
      if (ec.i.a(paramb.getValue(), paramString)) {
        localLinkedHashMap.put(paramb.getKey(), paramb.getValue());
      }
    }
    paramb = new ArrayList(localLinkedHashMap.size());
    paramString = localLinkedHashMap.entrySet().iterator();
    while (paramString.hasNext()) {
      paramb.add((String)((Map.Entry)paramString.next()).getKey());
    }
    if (paramb.isEmpty()) {
      paramb = null;
    } else {
      paramb = paramb.get(0);
    }
    return (String)paramb;
  }
  
  public static final void c(int paramInt, List paramList)
  {
    ec.i.e(paramList, "views");
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((View)paramList.next()).setVisibility(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     x0.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */