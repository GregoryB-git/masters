package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.core.os.CancellationSignal;

abstract interface FragmentTransition$Callback
{
  public abstract void onComplete(@NonNull Fragment paramFragment, @NonNull CancellationSignal paramCancellationSignal);
  
  public abstract void onStart(@NonNull Fragment paramFragment, @NonNull CancellationSignal paramCancellationSignal);
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransition.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */