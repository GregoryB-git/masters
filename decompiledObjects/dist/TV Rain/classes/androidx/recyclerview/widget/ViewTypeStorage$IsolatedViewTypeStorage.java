package androidx.recyclerview.widget;

import a;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;

public class ViewTypeStorage$IsolatedViewTypeStorage
  implements ViewTypeStorage
{
  public SparseArray<NestedAdapterWrapper> mGlobalTypeToWrapper = new SparseArray();
  public int mNextViewType = 0;
  
  @NonNull
  public ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper)
  {
    return new WrapperViewTypeLookup(paramNestedAdapterWrapper);
  }
  
  @NonNull
  public NestedAdapterWrapper getWrapperForGlobalType(int paramInt)
  {
    NestedAdapterWrapper localNestedAdapterWrapper = (NestedAdapterWrapper)mGlobalTypeToWrapper.get(paramInt);
    if (localNestedAdapterWrapper != null) {
      return localNestedAdapterWrapper;
    }
    throw new IllegalArgumentException(a.f("Cannot find the wrapper for global view type ", paramInt));
  }
  
  public int obtainViewType(NestedAdapterWrapper paramNestedAdapterWrapper)
  {
    int i = mNextViewType;
    mNextViewType = (i + 1);
    mGlobalTypeToWrapper.put(i, paramNestedAdapterWrapper);
    return i;
  }
  
  public void removeWrapper(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper)
  {
    for (int i = mGlobalTypeToWrapper.size() - 1; i >= 0; i--) {
      if ((NestedAdapterWrapper)mGlobalTypeToWrapper.valueAt(i) == paramNestedAdapterWrapper) {
        mGlobalTypeToWrapper.removeAt(i);
      }
    }
  }
  
  public class WrapperViewTypeLookup
    implements ViewTypeStorage.ViewTypeLookup
  {
    private SparseIntArray mGlobalToLocalMapping = new SparseIntArray(1);
    private SparseIntArray mLocalToGlobalMapping = new SparseIntArray(1);
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
      i = obtainViewType(mWrapper);
      mLocalToGlobalMapping.put(paramInt, i);
      mGlobalToLocalMapping.put(i, paramInt);
      return i;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */