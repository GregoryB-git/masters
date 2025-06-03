package com.google.firebase.dynamiclinks.internal;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class b$b
  extends b.a
{
  public final TaskCompletionSource<v8.d> a;
  
  public b$b(TaskCompletionSource<v8.d> paramTaskCompletionSource)
  {
    a = paramTaskCompletionSource;
  }
  
  public final void K0(Status paramStatus, w8.d paramd)
  {
    a0.K(paramStatus, paramd, a);
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.dynamiclinks.internal.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */