package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import java.util.ArrayDeque;
import z2;

class FragmentManager$10
  implements ActivityResultCallback<ActivityResult>
{
  public FragmentManager$10(FragmentManager paramFragmentManager) {}
  
  public void onActivityResult(ActivityResult paramActivityResult)
  {
    Object localObject = (FragmentManager.LaunchedFragmentInfo)this$0.mLaunchedFragments.pollFirst();
    if (localObject == null)
    {
      paramActivityResult = new StringBuilder();
      paramActivityResult.append("No IntentSenders were started for ");
      paramActivityResult.append(this);
      Log.w("FragmentManager", paramActivityResult.toString());
      return;
    }
    String str = mWho;
    int i = mRequestCode;
    localObject = FragmentManager.access$200(this$0).findFragmentByWho(str);
    if (localObject == null)
    {
      z2.A("Intent Sender result delivered for unknown Fragment ", str, "FragmentManager");
      return;
    }
    ((Fragment)localObject).onActivityResult(i, paramActivityResult.getResultCode(), paramActivityResult.getData());
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */