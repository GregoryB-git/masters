package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.collection.ArrayMap;

class FragmentTransition$5
  implements Runnable
{
  public FragmentTransition$5(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, ArrayMap paramArrayMap, View paramView, FragmentTransitionImpl paramFragmentTransitionImpl, Rect paramRect) {}
  
  public void run()
  {
    FragmentTransition.callSharedElementStartEnd(val$inFragment, val$outFragment, val$inIsPop, val$inSharedElements, false);
    View localView = val$epicenterView;
    if (localView != null) {
      val$impl.getBoundsOnScreen(localView, val$epicenter);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransition.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */