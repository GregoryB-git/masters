package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

abstract interface NestedAdapterWrapper$Callback
{
  public abstract void onChanged(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper);
  
  public abstract void onItemRangeChanged(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2);
  
  public abstract void onItemRangeChanged(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2, @Nullable Object paramObject);
  
  public abstract void onItemRangeInserted(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2);
  
  public abstract void onItemRangeMoved(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2);
  
  public abstract void onItemRangeRemoved(@NonNull NestedAdapterWrapper paramNestedAdapterWrapper, int paramInt1, int paramInt2);
  
  public abstract void onStateRestorationPolicyChanged(NestedAdapterWrapper paramNestedAdapterWrapper);
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.NestedAdapterWrapper.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */