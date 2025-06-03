package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;

final class vm<T>
{
  private final Handler a;
  private final T b;
  private boolean c;
  
  public vm(Handler paramHandler, T paramT)
  {
    a = paramHandler;
    b = paramT;
  }
  
  public final void a()
  {
    c = true;
  }
  
  public final void a(vn<T> paramvn)
  {
    a.post(new vp(this, paramvn));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */