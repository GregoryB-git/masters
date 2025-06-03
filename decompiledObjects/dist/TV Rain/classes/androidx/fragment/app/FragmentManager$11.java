package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.activity.result.ActivityResultCallback;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import z2;

class FragmentManager$11
  implements ActivityResultCallback<Map<String, Boolean>>
{
  public FragmentManager$11(FragmentManager paramFragmentManager) {}
  
  @SuppressLint({"SyntheticAccessor"})
  public void onActivityResult(Map<String, Boolean> paramMap)
  {
    String[] arrayOfString = (String[])paramMap.keySet().toArray(new String[0]);
    Object localObject1 = new ArrayList(paramMap.values());
    paramMap = new int[((ArrayList)localObject1).size()];
    for (int i = 0; i < ((ArrayList)localObject1).size(); i++)
    {
      int j;
      if (((Boolean)((ArrayList)localObject1).get(i)).booleanValue()) {
        j = 0;
      } else {
        j = -1;
      }
      paramMap[i] = j;
    }
    Object localObject2 = (FragmentManager.LaunchedFragmentInfo)this$0.mLaunchedFragments.pollFirst();
    if (localObject2 == null)
    {
      paramMap = new StringBuilder();
      paramMap.append("No permissions were requested for ");
      paramMap.append(this);
      Log.w("FragmentManager", paramMap.toString());
      return;
    }
    localObject1 = mWho;
    i = mRequestCode;
    localObject2 = FragmentManager.access$200(this$0).findFragmentByWho((String)localObject1);
    if (localObject2 == null)
    {
      z2.A("Permission request result delivered for unknown Fragment ", (String)localObject1, "FragmentManager");
      return;
    }
    ((Fragment)localObject2).onRequestPermissionsResult(i, arrayOfString, paramMap);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.11
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */