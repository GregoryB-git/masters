package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;

class FragmentManager$6
  implements LifecycleEventObserver
{
  public FragmentManager$6(FragmentManager paramFragmentManager, String paramString, FragmentResultListener paramFragmentResultListener, Lifecycle paramLifecycle) {}
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    if (paramEvent == Lifecycle.Event.ON_START)
    {
      paramLifecycleOwner = (Bundle)FragmentManager.access$000(this$0).get(val$requestKey);
      if (paramLifecycleOwner != null)
      {
        val$listener.onFragmentResult(val$requestKey, paramLifecycleOwner);
        this$0.clearFragmentResult(val$requestKey);
      }
    }
    if (paramEvent == Lifecycle.Event.ON_DESTROY)
    {
      val$lifecycle.removeObserver(this);
      FragmentManager.access$100(this$0).remove(val$requestKey);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */