package androidx.fragment.app;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.arch.core.util.Function;
import java.util.concurrent.atomic.AtomicReference;

class Fragment$8
  extends Fragment.OnPreAttachedListener
{
  public Fragment$8(Fragment paramFragment, Function paramFunction, AtomicReference paramAtomicReference, ActivityResultContract paramActivityResultContract, ActivityResultCallback paramActivityResultCallback)
  {
    super(null);
  }
  
  public void onPreAttached()
  {
    String str = this$0.generateActivityResultKey();
    ActivityResultRegistry localActivityResultRegistry = (ActivityResultRegistry)val$registryProvider.apply(null);
    val$ref.set(localActivityResultRegistry.register(str, this$0, val$contract, val$callback));
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */