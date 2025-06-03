package androidx.fragment.app;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.b;
import java.util.concurrent.atomic.AtomicReference;

public class Fragment$f
  extends Fragment.j
{
  public Fragment$f(Fragment paramFragment, o.a parama, AtomicReference paramAtomicReference, d.a parama1, b paramb)
  {
    super(null);
  }
  
  public void a()
  {
    String str = e.m();
    ActivityResultRegistry localActivityResultRegistry = (ActivityResultRegistry)a.apply(null);
    b.set(localActivityResultRegistry.i(str, e, c, d));
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */