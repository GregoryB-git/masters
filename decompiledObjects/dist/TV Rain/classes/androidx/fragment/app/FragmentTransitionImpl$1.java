package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

class FragmentTransitionImpl$1
  implements Runnable
{
  public FragmentTransitionImpl$1(FragmentTransitionImpl paramFragmentTransitionImpl, int paramInt, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, ArrayList paramArrayList4) {}
  
  public void run()
  {
    for (int i = 0; i < val$numSharedElements; i++)
    {
      ViewCompat.setTransitionName((View)val$sharedElementsIn.get(i), (String)val$inNames.get(i));
      ViewCompat.setTransitionName((View)val$sharedElementsOut.get(i), (String)val$outNames.get(i));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransitionImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */