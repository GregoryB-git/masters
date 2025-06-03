package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract interface CallbackToFutureAdapter$Resolver<T>
{
  @Nullable
  public abstract Object attachCompleter(@NonNull CallbackToFutureAdapter.Completer<T> paramCompleter)
    throws Exception;
}

/* Location:
 * Qualified Name:     androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */