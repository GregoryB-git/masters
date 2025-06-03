package okhttp3;

import okhttp3.internal.http.RealInterceptorChain;

public abstract interface Interceptor
{
  public abstract Response a(RealInterceptorChain paramRealInterceptorChain);
  
  public static abstract interface Chain
  {
    public abstract int a();
    
    public abstract int b();
  }
}

/* Location:
 * Qualified Name:     okhttp3.Interceptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */