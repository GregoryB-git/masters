package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SharedValues
{
  public static final int UNSET = -1;
  private SparseIntArray mValues = new SparseIntArray();
  private HashMap<Integer, HashSet<WeakReference<SharedValuesListener>>> mValuesListeners = new HashMap();
  
  public void addListener(int paramInt, SharedValuesListener paramSharedValuesListener)
  {
    HashSet localHashSet1 = (HashSet)mValuesListeners.get(Integer.valueOf(paramInt));
    HashSet localHashSet2 = localHashSet1;
    if (localHashSet1 == null)
    {
      localHashSet2 = new HashSet();
      mValuesListeners.put(Integer.valueOf(paramInt), localHashSet2);
    }
    localHashSet2.add(new WeakReference(paramSharedValuesListener));
  }
  
  public void clearListeners()
  {
    mValuesListeners.clear();
  }
  
  public void fireNewValue(int paramInt1, int paramInt2)
  {
    int i = mValues.get(paramInt1, -1);
    if (i == paramInt2) {
      return;
    }
    mValues.put(paramInt1, paramInt2);
    HashSet localHashSet = (HashSet)mValuesListeners.get(Integer.valueOf(paramInt1));
    if (localHashSet == null) {
      return;
    }
    Object localObject1 = localHashSet.iterator();
    int j = 0;
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (SharedValuesListener)((WeakReference)((Iterator)localObject1).next()).get();
      if (localObject2 != null) {
        ((SharedValuesListener)localObject2).onNewValue(paramInt1, paramInt2, i);
      } else {
        j = 1;
      }
    }
    if (j != 0)
    {
      localObject1 = new ArrayList();
      localObject2 = localHashSet.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        WeakReference localWeakReference = (WeakReference)((Iterator)localObject2).next();
        if ((SharedValuesListener)localWeakReference.get() == null) {
          ((ArrayList)localObject1).add(localWeakReference);
        }
      }
      localHashSet.removeAll((Collection)localObject1);
    }
  }
  
  public int getValue(int paramInt)
  {
    return mValues.get(paramInt, -1);
  }
  
  public void removeListener(int paramInt, SharedValuesListener paramSharedValuesListener)
  {
    HashSet localHashSet = (HashSet)mValuesListeners.get(Integer.valueOf(paramInt));
    if (localHashSet == null) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localHashSet.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      SharedValuesListener localSharedValuesListener = (SharedValuesListener)localWeakReference.get();
      if ((localSharedValuesListener == null) || (localSharedValuesListener == paramSharedValuesListener)) {
        localArrayList.add(localWeakReference);
      }
    }
    localHashSet.removeAll(localArrayList);
  }
  
  public void removeListener(SharedValuesListener paramSharedValuesListener)
  {
    Iterator localIterator = mValuesListeners.keySet().iterator();
    while (localIterator.hasNext()) {
      removeListener(((Integer)localIterator.next()).intValue(), paramSharedValuesListener);
    }
  }
  
  public static abstract interface SharedValuesListener
  {
    public abstract void onNewValue(int paramInt1, int paramInt2, int paramInt3);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.SharedValues
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */