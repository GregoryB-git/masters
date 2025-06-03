package androidx.fragment.app;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import java.util.concurrent.atomic.AtomicReference;

class Fragment$9
  extends ActivityResultLauncher<I>
{
  public Fragment$9(Fragment paramFragment, AtomicReference paramAtomicReference, ActivityResultContract paramActivityResultContract) {}
  
  @NonNull
  public ActivityResultContract<I, ?> getContract()
  {
    return val$contract;
  }
  
  public void launch(I paramI, @Nullable ActivityOptionsCompat paramActivityOptionsCompat)
  {
    ActivityResultLauncher localActivityResultLauncher = (ActivityResultLauncher)val$ref.get();
    if (localActivityResultLauncher != null)
    {
      localActivityResultLauncher.launch(paramI, paramActivityOptionsCompat);
      return;
    }
    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
  }
  
  public void unregister()
  {
    ActivityResultLauncher localActivityResultLauncher = (ActivityResultLauncher)val$ref.getAndSet(null);
    if (localActivityResultLauncher != null) {
      localActivityResultLauncher.unregister();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */