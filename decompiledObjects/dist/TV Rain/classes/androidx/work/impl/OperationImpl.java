package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.Operation.State;
import androidx.work.Operation.State.FAILURE;
import androidx.work.Operation.State.SUCCESS;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class OperationImpl
  implements Operation
{
  private final SettableFuture<Operation.State.SUCCESS> mOperationFuture = SettableFuture.create();
  private final MutableLiveData<Operation.State> mOperationState = new MutableLiveData();
  
  public OperationImpl()
  {
    setState(Operation.IN_PROGRESS);
  }
  
  @NonNull
  public ListenableFuture<Operation.State.SUCCESS> getResult()
  {
    return mOperationFuture;
  }
  
  @NonNull
  public LiveData<Operation.State> getState()
  {
    return mOperationState;
  }
  
  public void setState(@NonNull Operation.State paramState)
  {
    mOperationState.postValue(paramState);
    if ((paramState instanceof Operation.State.SUCCESS))
    {
      mOperationFuture.set((Operation.State.SUCCESS)paramState);
    }
    else if ((paramState instanceof Operation.State.FAILURE))
    {
      paramState = (Operation.State.FAILURE)paramState;
      mOperationFuture.setException(paramState.getThrowable());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.OperationImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */