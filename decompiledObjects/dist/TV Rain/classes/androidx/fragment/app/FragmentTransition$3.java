package androidx.fragment.app;

import androidx.core.os.CancellationSignal;

class FragmentTransition$3
  implements Runnable
{
  public FragmentTransition$3(FragmentTransition.Callback paramCallback, Fragment paramFragment, CancellationSignal paramCancellationSignal) {}
  
  public void run()
  {
    val$callback.onComplete(val$outFragment, val$signal);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransition.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */