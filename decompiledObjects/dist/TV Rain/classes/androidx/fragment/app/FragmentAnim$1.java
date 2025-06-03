package androidx.fragment.app;

import android.view.View;
import androidx.core.os.CancellationSignal.OnCancelListener;

class FragmentAnim$1
  implements CancellationSignal.OnCancelListener
{
  public FragmentAnim$1(Fragment paramFragment) {}
  
  public void onCancel()
  {
    if (val$fragment.getAnimatingAway() != null)
    {
      View localView = val$fragment.getAnimatingAway();
      val$fragment.setAnimatingAway(null);
      localView.clearAnimation();
    }
    val$fragment.setAnimator(null);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentAnim.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */