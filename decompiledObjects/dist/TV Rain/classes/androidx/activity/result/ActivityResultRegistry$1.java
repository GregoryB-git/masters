package androidx.activity.result;

import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;

class ActivityResultRegistry$1
  implements LifecycleEventObserver
{
  public ActivityResultRegistry$1(ActivityResultRegistry paramActivityResultRegistry, String paramString, ActivityResultCallback paramActivityResultCallback, ActivityResultContract paramActivityResultContract) {}
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    if (Lifecycle.Event.ON_START.equals(paramEvent))
    {
      this$0.mKeyToCallback.put(val$key, new ActivityResultRegistry.CallbackAndContract(val$callback, val$contract));
      if (this$0.mParsedPendingResults.containsKey(val$key))
      {
        paramLifecycleOwner = this$0.mParsedPendingResults.get(val$key);
        this$0.mParsedPendingResults.remove(val$key);
        val$callback.onActivityResult(paramLifecycleOwner);
      }
      paramLifecycleOwner = (ActivityResult)this$0.mPendingResults.getParcelable(val$key);
      if (paramLifecycleOwner != null)
      {
        this$0.mPendingResults.remove(val$key);
        val$callback.onActivityResult(val$contract.parseResult(paramLifecycleOwner.getResultCode(), paramLifecycleOwner.getData()));
      }
    }
    else if (Lifecycle.Event.ON_STOP.equals(paramEvent))
    {
      this$0.mKeyToCallback.remove(val$key);
    }
    else if (Lifecycle.Event.ON_DESTROY.equals(paramEvent))
    {
      this$0.unregister(val$key);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultRegistry.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */