package androidx.transition;

import android.util.SparseArray;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;

class TransitionValuesMaps
{
  public final SparseArray<View> mIdValues = new SparseArray();
  public final LongSparseArray<View> mItemIdValues = new LongSparseArray();
  public final ArrayMap<String, View> mNameValues = new ArrayMap();
  public final ArrayMap<View, TransitionValues> mViewValues = new ArrayMap();
}

/* Location:
 * Qualified Name:     androidx.transition.TransitionValuesMaps
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */