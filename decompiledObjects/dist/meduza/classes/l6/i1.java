package l6;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import g;
import i6.n;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import r.b;

public final class i1
{
  public final Map a = Collections.synchronizedMap(new b());
  public int b = 0;
  public Bundle c;
  
  public final void a(String paramString, f paramf)
  {
    if (!a.containsKey(paramString))
    {
      a.put(paramString, paramf);
      if (b > 0) {
        new zzh(Looper.getMainLooper()).post(new n(this, paramf, paramString));
      }
      return;
    }
    throw new IllegalArgumentException(g.e("LifecycleCallback with tag ", paramString, " already added to this fragment."));
  }
  
  public final void b(Bundle paramBundle)
  {
    b = 1;
    c = paramBundle;
    Iterator localIterator = a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      f localf = (f)((Map.Entry)localObject).getValue();
      if (paramBundle != null) {
        localObject = paramBundle.getBundle((String)((Map.Entry)localObject).getKey());
      } else {
        localObject = null;
      }
      localf.onCreate((Bundle)localObject);
    }
  }
  
  public final void c()
  {
    b = 5;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext()) {
      ((f)localIterator.next()).onDestroy();
    }
  }
  
  public final void d()
  {
    b = 3;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext()) {
      ((f)localIterator.next()).onResume();
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      Iterator localIterator = a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Bundle localBundle = new Bundle();
        ((f)localEntry.getValue()).onSaveInstanceState(localBundle);
        paramBundle.putBundle((String)localEntry.getKey(), localBundle);
      }
    }
  }
  
  public final void f()
  {
    b = 2;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext()) {
      ((f)localIterator.next()).onStart();
    }
  }
  
  public final void g()
  {
    b = 4;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext()) {
      ((f)localIterator.next()).onStop();
    }
  }
}

/* Location:
 * Qualified Name:     l6.i1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */