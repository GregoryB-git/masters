package k6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class p<R extends j>
  extends BasePendingResult<R>
{
  public p(e parame)
  {
    super(parame);
  }
  
  public final R createFailedResult(Status paramStatus)
  {
    throw new UnsupportedOperationException("Creating failed results is not supported");
  }
}

/* Location:
 * Qualified Name:     k6.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */