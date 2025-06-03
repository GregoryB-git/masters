package androidx.fragment.app;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.d;
import o.a;

public class Fragment$e
  implements a
{
  public Fragment$e(Fragment paramFragment) {}
  
  public ActivityResultRegistry a(Void paramVoid)
  {
    Fragment localFragment = a;
    paramVoid = H;
    if ((paramVoid instanceof d)) {
      return ((d)paramVoid).c();
    }
    return localFragment.o1().c();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */