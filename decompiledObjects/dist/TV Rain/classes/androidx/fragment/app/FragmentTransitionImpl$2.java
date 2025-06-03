package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Map;

class FragmentTransitionImpl$2
  implements Runnable
{
  public FragmentTransitionImpl$2(FragmentTransitionImpl paramFragmentTransitionImpl, ArrayList paramArrayList, Map paramMap) {}
  
  public void run()
  {
    int i = val$sharedElementsIn.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)val$sharedElementsIn.get(j);
      String str = ViewCompat.getTransitionName(localView);
      if (str != null) {
        ViewCompat.setTransitionName(localView, FragmentTransitionImpl.findKeyForValue(val$nameOverrides, str));
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransitionImpl.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */