package androidx.coordinatorlayout.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class DirectedAcyclicGraph<T>
{
  private final SimpleArrayMap<T, ArrayList<T>> mGraph = new SimpleArrayMap();
  private final Pools.Pool<ArrayList<T>> mListPool = new Pools.SimplePool(10);
  private final ArrayList<T> mSortResult = new ArrayList();
  private final HashSet<T> mSortTmpMarked = new HashSet();
  
  private void dfs(T paramT, ArrayList<T> paramArrayList, HashSet<T> paramHashSet)
  {
    if (paramArrayList.contains(paramT)) {
      return;
    }
    if (!paramHashSet.contains(paramT))
    {
      paramHashSet.add(paramT);
      ArrayList localArrayList = (ArrayList)mGraph.get(paramT);
      if (localArrayList != null)
      {
        int i = 0;
        int j = localArrayList.size();
        while (i < j)
        {
          dfs(localArrayList.get(i), paramArrayList, paramHashSet);
          i++;
        }
      }
      paramHashSet.remove(paramT);
      paramArrayList.add(paramT);
      return;
    }
    throw new RuntimeException("This graph contains cyclic dependencies");
  }
  
  @NonNull
  private ArrayList<T> getEmptyList()
  {
    ArrayList localArrayList1 = (ArrayList)mListPool.acquire();
    ArrayList localArrayList2 = localArrayList1;
    if (localArrayList1 == null) {
      localArrayList2 = new ArrayList();
    }
    return localArrayList2;
  }
  
  private void poolList(@NonNull ArrayList<T> paramArrayList)
  {
    paramArrayList.clear();
    mListPool.release(paramArrayList);
  }
  
  public void addEdge(@NonNull T paramT1, @NonNull T paramT2)
  {
    if ((mGraph.containsKey(paramT1)) && (mGraph.containsKey(paramT2)))
    {
      ArrayList localArrayList1 = (ArrayList)mGraph.get(paramT1);
      ArrayList localArrayList2 = localArrayList1;
      if (localArrayList1 == null)
      {
        localArrayList2 = getEmptyList();
        mGraph.put(paramT1, localArrayList2);
      }
      localArrayList2.add(paramT2);
      return;
    }
    throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
  }
  
  public void addNode(@NonNull T paramT)
  {
    if (!mGraph.containsKey(paramT)) {
      mGraph.put(paramT, null);
    }
  }
  
  public void clear()
  {
    int i = mGraph.size();
    for (int j = 0; j < i; j++)
    {
      ArrayList localArrayList = (ArrayList)mGraph.valueAt(j);
      if (localArrayList != null) {
        poolList(localArrayList);
      }
    }
    mGraph.clear();
  }
  
  public boolean contains(@NonNull T paramT)
  {
    return mGraph.containsKey(paramT);
  }
  
  @Nullable
  public List getIncomingEdges(@NonNull T paramT)
  {
    return (List)mGraph.get(paramT);
  }
  
  @Nullable
  public List<T> getOutgoingEdges(@NonNull T paramT)
  {
    int i = mGraph.size();
    Object localObject1 = null;
    int j = 0;
    while (j < i)
    {
      ArrayList localArrayList = (ArrayList)mGraph.valueAt(j);
      Object localObject2 = localObject1;
      if (localArrayList != null)
      {
        localObject2 = localObject1;
        if (localArrayList.contains(paramT))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new ArrayList();
          }
          ((ArrayList)localObject2).add(mGraph.keyAt(j));
        }
      }
      j++;
      localObject1 = localObject2;
    }
    return (List<T>)localObject1;
  }
  
  @NonNull
  public ArrayList<T> getSortedList()
  {
    mSortResult.clear();
    mSortTmpMarked.clear();
    int i = mGraph.size();
    for (int j = 0; j < i; j++) {
      dfs(mGraph.keyAt(j), mSortResult, mSortTmpMarked);
    }
    return mSortResult;
  }
  
  public boolean hasOutgoingEdges(@NonNull T paramT)
  {
    int i = mGraph.size();
    for (int j = 0; j < i; j++)
    {
      ArrayList localArrayList = (ArrayList)mGraph.valueAt(j);
      if ((localArrayList != null) && (localArrayList.contains(paramT))) {
        return true;
      }
    }
    return false;
  }
  
  public int size()
  {
    return mGraph.size();
  }
}

/* Location:
 * Qualified Name:     androidx.coordinatorlayout.widget.DirectedAcyclicGraph
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */