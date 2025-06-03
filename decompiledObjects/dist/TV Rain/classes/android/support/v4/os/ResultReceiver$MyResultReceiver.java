package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;

class ResultReceiver$MyResultReceiver
  extends IResultReceiver.Stub
{
  public ResultReceiver$MyResultReceiver(ResultReceiver paramResultReceiver) {}
  
  public void send(int paramInt, Bundle paramBundle)
  {
    ResultReceiver localResultReceiver = this$0;
    Handler localHandler = mHandler;
    if (localHandler != null) {
      localHandler.post(new ResultReceiver.MyRunnable(localResultReceiver, paramInt, paramBundle));
    } else {
      localResultReceiver.onReceiveResult(paramInt, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.os.ResultReceiver.MyResultReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */