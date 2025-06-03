package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import m7.f;
import m7.w;

abstract class bm
  extends w
{
  public bm(bn parambn, TaskCompletionSource paramTaskCompletionSource)
  {
    super(paramTaskCompletionSource);
  }
  
  public final void a(Exception paramException)
  {
    if (!(paramException instanceof f))
    {
      super.a(paramException);
      return;
    }
    if (bn.k(f)) {}
    for (paramException = new StandardIntegrityException(-2, paramException);; paramException = new StandardIntegrityException(-9, paramException))
    {
      super.a(paramException);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.bm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */