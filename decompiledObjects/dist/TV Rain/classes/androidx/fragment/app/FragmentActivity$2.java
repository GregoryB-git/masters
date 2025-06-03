package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.NonNull;
import androidx.savedstate.SavedStateRegistry;

class FragmentActivity$2
  implements OnContextAvailableListener
{
  public FragmentActivity$2(FragmentActivity paramFragmentActivity) {}
  
  public void onContextAvailable(@NonNull Context paramContext)
  {
    this$0.mFragments.attachHost(null);
    paramContext = this$0.getSavedStateRegistry().consumeRestoredStateForKey("android:support:fragments");
    if (paramContext != null)
    {
      paramContext = paramContext.getParcelable("android:support:fragments");
      this$0.mFragments.restoreSaveState(paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */