package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;

public abstract interface ActivityResultCaller
{
  @NonNull
  public abstract <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> paramActivityResultContract, @NonNull ActivityResultCallback<O> paramActivityResultCallback);
  
  @NonNull
  public abstract <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> paramActivityResultContract, @NonNull ActivityResultRegistry paramActivityResultRegistry, @NonNull ActivityResultCallback<O> paramActivityResultCallback);
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultCaller
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */