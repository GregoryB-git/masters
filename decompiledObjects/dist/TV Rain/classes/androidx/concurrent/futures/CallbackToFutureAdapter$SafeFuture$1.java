package androidx.concurrent.futures;

import java.lang.ref.Reference;
import z2;

class CallbackToFutureAdapter$SafeFuture$1
  extends AbstractResolvableFuture<T>
{
  public CallbackToFutureAdapter$SafeFuture$1(CallbackToFutureAdapter.SafeFuture paramSafeFuture) {}
  
  public String pendingToString()
  {
    CallbackToFutureAdapter.Completer localCompleter = (CallbackToFutureAdapter.Completer)this$0.completerWeakReference.get();
    if (localCompleter == null) {
      return "Completer object has been garbage collected, future will fail soon";
    }
    StringBuilder localStringBuilder = z2.t("tag=[");
    localStringBuilder.append(tag);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */