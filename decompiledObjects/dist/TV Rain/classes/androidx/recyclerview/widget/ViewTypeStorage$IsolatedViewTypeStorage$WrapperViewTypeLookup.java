package androidx.recyclerview.widget;

import a;
import android.util.SparseIntArray;

class ViewTypeStorage$IsolatedViewTypeStorage$WrapperViewTypeLookup
  implements ViewTypeStorage.ViewTypeLookup
{
  private SparseIntArray mGlobalToLocalMapping = new SparseIntArray(1);
  private SparseIntArray mLocalToGlobalMapping = new SparseIntArray(1);
  public final NestedAdapterWrapper mWrapper;
  
  public ViewTypeStorage$IsolatedViewTypeStorage$WrapperViewTypeLookup(ViewTypeStorage.IsolatedViewTypeStorage paramIsolatedViewTypeStorage, NestedAdapterWrapper paramNestedAdapterWrapper)
  {
    mWrapper = paramNestedAdapterWrapper;
  }
  
  public void dispose()
  {
    this$0.removeWrapper(mWrapper);
  }
  
  public int globalToLocal(int paramInt)
  {
    int i = mGlobalToLocalMapping.indexOfKey(paramInt);
    if (i >= 0) {
      return mGlobalToLocalMapping.valueAt(i);
    }
    StringBuilder localStringBuilder = a.r("requested global type ", paramInt, " does not belong to the adapter:");
    localStringBuilder.append(mWrapper.adapter);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public int localToGlobal(int paramInt)
  {
    int i = mLocalToGlobalMapping.indexOfKey(paramInt);
    if (i > -1) {
      return mLocalToGlobalMapping.valueAt(i);
    }
    i = this$0.obtainViewType(mWrapper);
    mLocalToGlobalMapping.put(paramInt, i);
    mGlobalToLocalMapping.put(i, paramInt);
    return i;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage.WrapperViewTypeLookup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */