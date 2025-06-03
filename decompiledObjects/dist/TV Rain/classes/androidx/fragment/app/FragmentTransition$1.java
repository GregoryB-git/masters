package androidx.fragment.app;

import androidx.core.os.CancellationSignal;

class FragmentTransition$1
  implements Runnable
{
  public FragmentTransition$1(FragmentTransition.Callback paramCallback, Fragment paramFragment, CancellationSignal paramCancellationSignal) {}
  
  public void run()
  {
    val$callback.onComplete(val$outFragment, val$signal);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransition.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */