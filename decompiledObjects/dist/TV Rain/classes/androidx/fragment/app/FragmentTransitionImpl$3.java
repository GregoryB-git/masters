package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Map;

class FragmentTransitionImpl$3
  implements Runnable
{
  public FragmentTransitionImpl$3(FragmentTransitionImpl paramFragmentTransitionImpl, ArrayList paramArrayList, Map paramMap) {}
  
  public void run()
  {
    int i = val$sharedElementsIn.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)val$sharedElementsIn.get(j);
      String str = ViewCompat.getTransitionName(localView);
      ViewCompat.setTransitionName(localView, (String)val$nameOverrides.get(str));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransitionImpl.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */