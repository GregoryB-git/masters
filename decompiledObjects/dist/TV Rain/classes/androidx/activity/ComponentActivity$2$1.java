package androidx.activity;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract.SynchronousResult;

class ComponentActivity$2$1
  implements Runnable
{
  public ComponentActivity$2$1(ComponentActivity.2 param2, int paramInt, ActivityResultContract.SynchronousResult paramSynchronousResult) {}
  
  public void run()
  {
    this$1.dispatchResult(val$requestCode, val$synchronousResult.getValue());
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity.2.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */