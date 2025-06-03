package androidx.asynclayoutinflater.view;

import android.os.Handler.Callback;
import android.os.Message;
import android.view.LayoutInflater;

class AsyncLayoutInflater$1
  implements Handler.Callback
{
  public AsyncLayoutInflater$1(AsyncLayoutInflater paramAsyncLayoutInflater) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    paramMessage = (AsyncLayoutInflater.InflateRequest)obj;
    if (view == null) {
      view = this$0.mInflater.inflate(resid, parent, false);
    }
    callback.onInflateFinished(view, resid, parent);
    this$0.mInflateThread.releaseRequest(paramMessage);
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.asynclayoutinflater.view.AsyncLayoutInflater.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */