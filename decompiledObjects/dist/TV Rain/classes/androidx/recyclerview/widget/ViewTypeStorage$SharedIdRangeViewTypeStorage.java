package androidx.recyclerview.widget;

import a;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class ViewTypeStorage$SharedIdRangeViewTypeStorage
  implements ViewTypeStorage
{
  public SparseArray<List<NestedAdapterWrapper>> mGlobalTypeToWrapper = new SparseArray();
  
  @NonNull
  public ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper)
  {
    return new WrapperViewTypeLookup(paramNestedAdapterWrapper);
  }
  
  @NonNull
  public NestedAdapterWrapper getWrapperForGlobalType(int paramInt)
  {
    List localList = (List)mGlobalTypeToWrapper.get(paramInt);
    if ((localList != null) && (!localList.isEmpty())) {
      return (NestedAdapterWrapper)localList.get(0);
    }
    throw new IllegalArgumentException(a.f("Cannot find the wrapper for global view type ", paramInt));
  }
  
  public void removeWrapper(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper)
  {
    for (int i = mGlobalTypeToWrapper.size() - 1; i >= 0; i--)
    {
      List localList = (List)mGlobalTypeToWrapper.valueAt(i);
      if ((localList.remove(paramNestedAdapterWrapper)) && (localList.isEmpty())) {
        mGlobalTypeToWrapper.removeAt(i);
      }
    }
  }
  
  public class WrapperViewTypeLookup
    implements ViewTypeStorage.ViewTypeLookup
  {
    public final NestedAdapterWrapper mWrapper;
    
    public WrapperViewTypeLookup(NestedAdapterWrapper paramNestedAdapterWrapper)
    {
      mWrapper = paramNestedAdapterWrapper;
    }
    
    public void dispose()
    {
      removeWrapper(mWrapper);
    }
    
    public int globalToLocal(int paramInt)
    {
      return paramInt;
    }
    
    public int localToGlobal(int paramInt)
    {
      List localList = (List)mGlobalTypeToWrapper.get(paramInt);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList();
        mGlobalTypeToWrapper.put(paramInt, localObject);
      }
      if (!((List)localObject).contains(mWrapper)) {
        ((List)localObject).add(mWrapper);
      }
      return paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */