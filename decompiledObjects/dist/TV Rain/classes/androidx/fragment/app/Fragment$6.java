package androidx.fragment.app;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.arch.core.util.Function;

class Fragment$6
  implements Function<Void, ActivityResultRegistry>
{
  public Fragment$6(Fragment paramFragment) {}
  
  public ActivityResultRegistry apply(Void paramVoid)
  {
    paramVoid = this$0;
    FragmentHostCallback localFragmentHostCallback = mHost;
    if ((localFragmentHostCallback instanceof ActivityResultRegistryOwner)) {
      return ((ActivityResultRegistryOwner)localFragmentHostCallback).getActivityResultRegistry();
    }
    return paramVoid.requireActivity().getActivityResultRegistry();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */