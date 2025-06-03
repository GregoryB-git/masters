package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import java.util.ArrayList;
import java.util.Map;
import z2;

class ActivityResultRegistry$3
  extends ActivityResultLauncher<I>
{
  public ActivityResultRegistry$3(ActivityResultRegistry paramActivityResultRegistry, String paramString, ActivityResultContract paramActivityResultContract) {}
  
  @NonNull
  public ActivityResultContract<I, ?> getContract()
  {
    return val$contract;
  }
  
  public void launch(I paramI, @Nullable ActivityOptionsCompat paramActivityOptionsCompat)
  {
    Integer localInteger = (Integer)this$0.mKeyToRc.get(val$key);
    if (localInteger != null)
    {
      this$0.mLaunchedKeys.add(val$key);
      try
      {
        this$0.onLaunch(localInteger.intValue(), val$contract, paramI, paramActivityOptionsCompat);
        return;
      }
      catch (Exception paramI)
      {
        this$0.mLaunchedKeys.remove(val$key);
        throw paramI;
      }
    }
    paramActivityOptionsCompat = z2.t("Attempting to launch an unregistered ActivityResultLauncher with contract ");
    paramActivityOptionsCompat.append(val$contract);
    paramActivityOptionsCompat.append(" and input ");
    paramActivityOptionsCompat.append(paramI);
    paramActivityOptionsCompat.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
    throw new IllegalStateException(paramActivityOptionsCompat.toString());
  }
  
  public void unregister()
  {
    this$0.unregister(val$key);
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultRegistry.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */