package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;

class ActivityResultRegistry$CallbackAndContract<O>
{
  public final ActivityResultCallback<O> mCallback;
  public final ActivityResultContract<?, O> mContract;
  
  public ActivityResultRegistry$CallbackAndContract(ActivityResultCallback<O> paramActivityResultCallback, ActivityResultContract<?, O> paramActivityResultContract)
  {
    mCallback = paramActivityResultCallback;
    mContract = paramActivityResultContract;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultRegistry.CallbackAndContract
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */