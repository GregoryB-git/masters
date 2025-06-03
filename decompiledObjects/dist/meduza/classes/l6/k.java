package l6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;
import k6.f;
import k6.g.a;
import k6.j;
import k6.l;
import k6.m;

public final class k<R extends j>
  extends f<R>
{
  public final BasePendingResult a;
  
  public k(BasePendingResult paramBasePendingResult)
  {
    a = paramBasePendingResult;
  }
  
  public final void addStatusListener(g.a parama)
  {
    a.addStatusListener(parama);
  }
  
  public final R await()
  {
    return a.await();
  }
  
  public final R await(long paramLong, TimeUnit paramTimeUnit)
  {
    return a.await(paramLong, paramTimeUnit);
  }
  
  public final void cancel()
  {
    a.cancel();
  }
  
  public final boolean isCanceled()
  {
    return a.isCanceled();
  }
  
  public final void setResultCallback(k6.k<? super R> paramk)
  {
    a.setResultCallback(paramk);
  }
  
  public final void setResultCallback(k6.k<? super R> paramk, long paramLong, TimeUnit paramTimeUnit)
  {
    a.setResultCallback(paramk, paramLong, paramTimeUnit);
  }
  
  public final <S extends j> m<S> then(l<? super R, ? extends S> paraml)
  {
    return a.then(paraml);
  }
}

/* Location:
 * Qualified Name:     l6.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */