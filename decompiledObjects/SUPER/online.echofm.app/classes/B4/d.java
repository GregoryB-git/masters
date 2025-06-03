package B4;

import F4.a;
import G4.h;
import G4.h.a;
import M4.g;
import android.app.Activity;
import android.os.Build.VERSION;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;
import w.f;

public class d
{
  public static final a e = ;
  public final Activity a;
  public final f b;
  public final Map c;
  public boolean d = false;
  
  public d(Activity paramActivity)
  {
    this(paramActivity, new f(), new HashMap());
  }
  
  public d(Activity paramActivity, f paramf, Map paramMap)
  {
    a = paramActivity;
    b = paramf;
    c = paramMap;
  }
  
  public static boolean a()
  {
    return true;
  }
  
  public final g b()
  {
    if (!d)
    {
      e.a("No recording has been started.");
      return g.a();
    }
    SparseIntArray[] arrayOfSparseIntArray = b.b();
    if (arrayOfSparseIntArray == null)
    {
      e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
      return g.a();
    }
    if (arrayOfSparseIntArray[0] == null)
    {
      e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
      return g.a();
    }
    return g.e(h.a(arrayOfSparseIntArray));
  }
  
  public void c()
  {
    if (d)
    {
      e.b("FrameMetricsAggregator is already recording %s", new Object[] { a.getClass().getSimpleName() });
      return;
    }
    b.a(a);
    d = true;
  }
  
  public void d(Fragment paramFragment)
  {
    if (!d)
    {
      e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
      return;
    }
    if (c.containsKey(paramFragment))
    {
      e.b("Cannot start sub-recording because one is already ongoing with the key %s", new Object[] { paramFragment.getClass().getSimpleName() });
      return;
    }
    g localg = b();
    if (!localg.d())
    {
      e.b("startFragment(%s): snapshot() failed", new Object[] { paramFragment.getClass().getSimpleName() });
      return;
    }
    c.put(paramFragment, (h.a)localg.c());
  }
  
  public g e()
  {
    if (!d)
    {
      e.a("Cannot stop because no recording was started");
      return g.a();
    }
    if (!c.isEmpty())
    {
      e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
      c.clear();
    }
    g localg1 = b();
    try
    {
      b.c(a);
    }
    catch (NullPointerException localNullPointerException) {}catch (IllegalArgumentException localIllegalArgumentException) {}
    if (((localIllegalArgumentException instanceof NullPointerException)) && (Build.VERSION.SDK_INT > 28)) {
      throw localIllegalArgumentException;
    }
    e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", new Object[] { localIllegalArgumentException.toString() });
    g localg2 = g.a();
    b.d();
    d = false;
    return localg2;
  }
  
  public g f(Fragment paramFragment)
  {
    if (!d)
    {
      e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
      return g.a();
    }
    if (!c.containsKey(paramFragment))
    {
      e.b("Sub-recording associated with key %s was not started or does not exist", new Object[] { paramFragment.getClass().getSimpleName() });
      return g.a();
    }
    h.a locala = (h.a)c.remove(paramFragment);
    g localg = b();
    if (!localg.d())
    {
      e.b("stopFragment(%s): snapshot() failed", new Object[] { paramFragment.getClass().getSimpleName() });
      return g.a();
    }
    return g.e(((h.a)localg.c()).a(locala));
  }
}

/* Location:
 * Qualified Name:     B4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */