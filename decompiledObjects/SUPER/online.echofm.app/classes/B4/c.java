package B4;

import G4.h.a;
import L4.k;
import M4.g;
import M4.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.n.l;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;

public class c
  extends n.l
{
  public static final F4.a f = ;
  public final WeakHashMap a = new WeakHashMap();
  public final M4.a b;
  public final k c;
  public final a d;
  public final d e;
  
  public c(M4.a parama, k paramk, a parama1, d paramd)
  {
    b = parama;
    c = paramk;
    d = parama1;
    e = paramd;
  }
  
  public void f(n paramn, Fragment paramFragment)
  {
    super.f(paramn, paramFragment);
    F4.a locala = f;
    locala.b("FragmentMonitor %s.onFragmentPaused ", new Object[] { paramFragment.getClass().getSimpleName() });
    if (!a.containsKey(paramFragment))
    {
      locala.k("FragmentMonitor: missed a fragment trace from %s", new Object[] { paramFragment.getClass().getSimpleName() });
      return;
    }
    Trace localTrace = (Trace)a.get(paramFragment);
    a.remove(paramFragment);
    paramn = e.f(paramFragment);
    if (!paramn.d())
    {
      locala.k("onFragmentPaused: recorder failed to trace %s", new Object[] { paramFragment.getClass().getSimpleName() });
      return;
    }
    j.a(localTrace, (h.a)paramn.c());
    localTrace.stop();
  }
  
  public void i(n paramn, Fragment paramFragment)
  {
    super.i(paramn, paramFragment);
    f.b("FragmentMonitor %s.onFragmentResumed", new Object[] { paramFragment.getClass().getSimpleName() });
    Trace localTrace = new Trace(o(paramFragment), c, b, d);
    localTrace.start();
    if (paramFragment.E() == null) {
      paramn = "No parent";
    } else {
      paramn = paramFragment.E().getClass().getSimpleName();
    }
    localTrace.putAttribute("Parent_fragment", paramn);
    if (paramFragment.n() != null) {
      localTrace.putAttribute("Hosting_activity", paramFragment.n().getClass().getSimpleName());
    }
    a.put(paramFragment, localTrace);
    e.d(paramFragment);
  }
  
  public String o(Fragment paramFragment)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("_st_");
    localStringBuilder.append(paramFragment.getClass().getSimpleName());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     B4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */