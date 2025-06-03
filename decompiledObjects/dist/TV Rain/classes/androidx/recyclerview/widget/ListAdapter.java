package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public abstract class ListAdapter<T, VH extends RecyclerView.ViewHolder>
  extends RecyclerView.Adapter<VH>
{
  public final AsyncListDiffer<T> mDiffer;
  private final AsyncListDiffer.ListListener<T> mListener;
  
  public ListAdapter(@NonNull AsyncDifferConfig<T> paramAsyncDifferConfig)
  {
    AsyncListDiffer.ListListener local1 = new AsyncListDiffer.ListListener()
    {
      public void onCurrentListChanged(@NonNull List<T> paramAnonymousList1, @NonNull List<T> paramAnonymousList2)
      {
        ListAdapter.this.onCurrentListChanged(paramAnonymousList1, paramAnonymousList2);
      }
    };
    mListener = local1;
    paramAsyncDifferConfig = new AsyncListDiffer(new AdapterListUpdateCallback(this), paramAsyncDifferConfig);
    mDiffer = paramAsyncDifferConfig;
    paramAsyncDifferConfig.addListListener(local1);
  }
  
  public ListAdapter(@NonNull DiffUtil.ItemCallback<T> paramItemCallback)
  {
    AsyncListDiffer.ListListener local1 = new AsyncListDiffer.ListListener()
    {
      public void onCurrentListChanged(@NonNull List<T> paramAnonymousList1, @NonNull List<T> paramAnonymousList2)
      {
        ListAdapter.this.onCurrentListChanged(paramAnonymousList1, paramAnonymousList2);
      }
    };
    mListener = local1;
    paramItemCallback = new AsyncListDiffer(new AdapterListUpdateCallback(this), new AsyncDifferConfig.Builder(paramItemCallback).build());
    mDiffer = paramItemCallback;
    paramItemCallback.addListListener(local1);
  }
  
  @NonNull
  public List<T> getCurrentList()
  {
    return mDiffer.getCurrentList();
  }
  
  public T getItem(int paramInt)
  {
    return (T)mDiffer.getCurrentList().get(paramInt);
  }
  
  public int getItemCount()
  {
    return mDiffer.getCurrentList().size();
  }
  
  public void onCurrentListChanged(@NonNull List<T> paramList1, @NonNull List<T> paramList2) {}
  
  public void submitList(@Nullable List<T> paramList)
  {
    mDiffer.submitList(paramList);
  }
  
  public void submitList(@Nullable List<T> paramList, @Nullable Runnable paramRunnable)
  {
    mDiffer.submitList(paramList, paramRunnable);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ListAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */