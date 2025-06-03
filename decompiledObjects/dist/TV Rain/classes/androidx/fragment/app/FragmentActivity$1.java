package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleRegistry;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;

class FragmentActivity$1
  implements SavedStateRegistry.SavedStateProvider
{
  public FragmentActivity$1(FragmentActivity paramFragmentActivity) {}
  
  @NonNull
  public Bundle saveState()
  {
    Bundle localBundle = new Bundle();
    this$0.markFragmentsCreated();
    this$0.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    Parcelable localParcelable = this$0.mFragments.saveAllState();
    if (localParcelable != null) {
      localBundle.putParcelable("android:support:fragments", localParcelable);
    }
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */