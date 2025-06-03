package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.collection.ArrayMap;
import java.util.ArrayList;

class FragmentTransition$6
  implements Runnable
{
  public FragmentTransition$6(FragmentTransitionImpl paramFragmentTransitionImpl, ArrayMap paramArrayMap, Object paramObject1, FragmentTransition.FragmentContainerTransition paramFragmentContainerTransition, ArrayList paramArrayList1, View paramView, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, ArrayList paramArrayList2, Object paramObject2, Rect paramRect) {}
  
  public void run()
  {
    ArrayMap localArrayMap = FragmentTransition.captureInSharedElements(val$impl, val$nameOverrides, val$finalSharedElementTransition, val$fragments);
    if (localArrayMap != null)
    {
      val$sharedElementsIn.addAll(localArrayMap.values());
      val$sharedElementsIn.add(val$nonExistentView);
    }
    FragmentTransition.callSharedElementStartEnd(val$inFragment, val$outFragment, val$inIsPop, localArrayMap, false);
    Object localObject = val$finalSharedElementTransition;
    if (localObject != null)
    {
      val$impl.swapSharedElementTargets(localObject, val$sharedElementsOut, val$sharedElementsIn);
      localObject = FragmentTransition.getInEpicenterView(localArrayMap, val$fragments, val$enterTransition, val$inIsPop);
      if (localObject != null) {
        val$impl.getBoundsOnScreen((View)localObject, val$inEpicenter);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransition.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */