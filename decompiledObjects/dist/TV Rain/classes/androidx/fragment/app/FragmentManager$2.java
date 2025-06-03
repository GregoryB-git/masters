package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.core.os.CancellationSignal;

class FragmentManager$2
  implements FragmentTransition.Callback
{
  public FragmentManager$2(FragmentManager paramFragmentManager) {}
  
  public void onComplete(@NonNull Fragment paramFragment, @NonNull CancellationSignal paramCancellationSignal)
  {
    if (!paramCancellationSignal.isCanceled()) {
      this$0.removeCancellationSignal(paramFragment, paramCancellationSignal);
    }
  }
  
  public void onStart(@NonNull Fragment paramFragment, @NonNull CancellationSignal paramCancellationSignal)
  {
    this$0.addCancellationSignal(paramFragment, paramCancellationSignal);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */