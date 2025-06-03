package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

class ViewTypeStorage$SharedIdRangeViewTypeStorage$WrapperViewTypeLookup
  implements ViewTypeStorage.ViewTypeLookup
{
  public final NestedAdapterWrapper mWrapper;
  
  public ViewTypeStorage$SharedIdRangeViewTypeStorage$WrapperViewTypeLookup(ViewTypeStorage.SharedIdRangeViewTypeStorage paramSharedIdRangeViewTypeStorage, NestedAdapterWrapper paramNestedAdapterWrapper)
  {
    mWrapper = paramNestedAdapterWrapper;
  }
  
  public void dispose()
  {
    this$0.removeWrapper(mWrapper);
  }
  
  public int globalToLocal(int paramInt)
  {
    return paramInt;
  }
  
  public int localToGlobal(int paramInt)
  {
    List localList = (List)this$0.mGlobalTypeToWrapper.get(paramInt);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      this$0.mGlobalTypeToWrapper.put(paramInt, localObject);
    }
    if (!((List)localObject).contains(mWrapper)) {
      ((List)localObject).add(mWrapper);
    }
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.WrapperViewTypeLookup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */