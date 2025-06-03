package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public class AsyncListDiffer<T>
{
  private static final Executor sMainThreadExecutor = new MainThreadExecutor();
  public final AsyncDifferConfig<T> mConfig;
  @Nullable
  private List<T> mList;
  private final List<ListListener<T>> mListeners = new CopyOnWriteArrayList();
  public Executor mMainThreadExecutor;
  public int mMaxScheduledGeneration;
  @NonNull
  private List<T> mReadOnlyList = Collections.emptyList();
  private final ListUpdateCallback mUpdateCallback;
  
  public AsyncListDiffer(@NonNull ListUpdateCallback paramListUpdateCallback, @NonNull AsyncDifferConfig<T> paramAsyncDifferConfig)
  {
    mUpdateCallback = paramListUpdateCallback;
    mConfig = paramAsyncDifferConfig;
    if (paramAsyncDifferConfig.getMainThreadExecutor() != null) {
      mMainThreadExecutor = paramAsyncDifferConfig.getMainThreadExecutor();
    } else {
      mMainThreadExecutor = sMainThreadExecutor;
    }
  }
  
  public AsyncListDiffer(@NonNull RecyclerView.Adapter paramAdapter, @NonNull DiffUtil.ItemCallback<T> paramItemCallback)
  {
    this(new AdapterListUpdateCallback(paramAdapter), new AsyncDifferConfig.Builder(paramItemCallback).build());
  }
  
  private void onCurrentListChanged(@NonNull List<T> paramList, @Nullable Runnable paramRunnable)
  {
    Iterator localIterator = mListeners.iterator();
    while (localIterator.hasNext()) {
      ((ListListener)localIterator.next()).onCurrentListChanged(paramList, mReadOnlyList);
    }
    if (paramRunnable != null) {
      paramRunnable.run();
    }
  }
  
  public void addListListener(@NonNull ListListener<T> paramListListener)
  {
    mListeners.add(paramListListener);
  }
  
  @NonNull
  public List<T> getCurrentList()
  {
    return mReadOnlyList;
  }
  
  public void latchList(@NonNull List<T> paramList, @NonNull DiffUtil.DiffResult paramDiffResult, @Nullable Runnable paramRunnable)
  {
    List localList = mReadOnlyList;
    mList = paramList;
    mReadOnlyList = Collections.unmodifiableList(paramList);
    paramDiffResult.dispatchUpdatesTo(mUpdateCallback);
    onCurrentListChanged(localList, paramRunnable);
  }
  
  public void removeListListener(@NonNull ListListener<T> paramListListener)
  {
    mListeners.remove(paramListListener);
  }
  
  public void submitList(@Nullable List<T> paramList)
  {
    submitList(paramList, null);
  }
  
  public void submitList(@Nullable final List<T> paramList, @Nullable final Runnable paramRunnable)
  {
    final int i = mMaxScheduledGeneration + 1;
    mMaxScheduledGeneration = i;
    final List localList1 = mList;
    if (paramList == localList1)
    {
      if (paramRunnable != null) {
        paramRunnable.run();
      }
      return;
    }
    List localList2 = mReadOnlyList;
    if (paramList == null)
    {
      i = localList1.size();
      mList = null;
      mReadOnlyList = Collections.emptyList();
      mUpdateCallback.onRemoved(0, i);
      onCurrentListChanged(localList2, paramRunnable);
      return;
    }
    if (localList1 == null)
    {
      mList = paramList;
      mReadOnlyList = Collections.unmodifiableList(paramList);
      mUpdateCallback.onInserted(0, paramList.size());
      onCurrentListChanged(localList2, paramRunnable);
      return;
    }
    mConfig.getBackgroundThreadExecutor().execute(new Runnable()
    {
      public void run()
      {
        final DiffUtil.DiffResult localDiffResult = DiffUtil.calculateDiff(new DiffUtil.Callback()
        {
          public boolean areContentsTheSame(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            Object localObject1 = val$oldList.get(paramAnonymous2Int1);
            Object localObject2 = val$newList.get(paramAnonymous2Int2);
            if ((localObject1 != null) && (localObject2 != null)) {
              return mConfig.getDiffCallback().areContentsTheSame(localObject1, localObject2);
            }
            if ((localObject1 == null) && (localObject2 == null)) {
              return true;
            }
            throw new AssertionError();
          }
          
          public boolean areItemsTheSame(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            Object localObject1 = val$oldList.get(paramAnonymous2Int1);
            Object localObject2 = val$newList.get(paramAnonymous2Int2);
            if ((localObject1 != null) && (localObject2 != null)) {
              return mConfig.getDiffCallback().areItemsTheSame(localObject1, localObject2);
            }
            boolean bool;
            if ((localObject1 == null) && (localObject2 == null)) {
              bool = true;
            } else {
              bool = false;
            }
            return bool;
          }
          
          @Nullable
          public Object getChangePayload(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            Object localObject1 = val$oldList.get(paramAnonymous2Int1);
            Object localObject2 = val$newList.get(paramAnonymous2Int2);
            if ((localObject1 != null) && (localObject2 != null)) {
              return mConfig.getDiffCallback().getChangePayload(localObject1, localObject2);
            }
            throw new AssertionError();
          }
          
          public int getNewListSize()
          {
            return val$newList.size();
          }
          
          public int getOldListSize()
          {
            return val$oldList.size();
          }
        });
        mMainThreadExecutor.execute(new Runnable()
        {
          public void run()
          {
            AsyncListDiffer.1 local1 = AsyncListDiffer.1.this;
            AsyncListDiffer localAsyncListDiffer = this$0;
            if (mMaxScheduledGeneration == val$runGeneration) {
              localAsyncListDiffer.latchList(val$newList, localDiffResult, val$commitCallback);
            }
          }
        });
      }
    });
  }
  
  public static abstract interface ListListener<T>
  {
    public abstract void onCurrentListChanged(@NonNull List<T> paramList1, @NonNull List<T> paramList2);
  }
  
  public static class MainThreadExecutor
    implements Executor
  {
    public final Handler mHandler = new Handler(Looper.getMainLooper());
    
    public void execute(@NonNull Runnable paramRunnable)
    {
      mHandler.post(paramRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncListDiffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */