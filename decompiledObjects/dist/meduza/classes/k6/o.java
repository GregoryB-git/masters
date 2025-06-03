package k6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class o<R extends j>
  extends BasePendingResult<R>
{
  public final j a;
  
  public o(Status paramStatus)
  {
    super(null);
    a = paramStatus;
  }
  
  public final R createFailedResult(Status paramStatus)
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     k6.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */