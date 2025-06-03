package k6;

import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

public abstract class g<R extends j>
{
  public void addStatusListener(a parama)
  {
    throw new UnsupportedOperationException();
  }
  
  @ResultIgnorabilityUnspecified
  public abstract R await();
  
  @ResultIgnorabilityUnspecified
  public abstract R await(long paramLong, TimeUnit paramTimeUnit);
  
  public abstract void cancel();
  
  public abstract boolean isCanceled();
  
  public abstract void setResultCallback(k<? super R> paramk);
  
  public abstract void setResultCallback(k<? super R> paramk, long paramLong, TimeUnit paramTimeUnit);
  
  public <S extends j> m<S> then(l<? super R, ? extends S> paraml)
  {
    throw new UnsupportedOperationException();
  }
  
  public static abstract interface a
  {
    public abstract void a(Status paramStatus);
  }
}

/* Location:
 * Qualified Name:     k6.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */