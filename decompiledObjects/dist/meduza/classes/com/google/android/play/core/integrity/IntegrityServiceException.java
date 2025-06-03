package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.a;
import java.util.Locale;
import k6.b;

public class IntegrityServiceException
  extends b
{
  private final Throwable a;
  
  public IntegrityServiceException(int paramInt, Throwable paramThrowable)
  {
    super(new Status(paramInt, String.format(Locale.ROOT, "Integrity API error (%d): %s.", new Object[] { Integer.valueOf(paramInt), a.a(paramInt) }), null, null));
    if (paramInt != 0)
    {
      a = paramThrowable;
      return;
    }
    throw new IllegalArgumentException("ErrorCode should not be 0.");
  }
  
  public final Throwable getCause()
  {
    try
    {
      Throwable localThrowable = a;
      return localThrowable;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getErrorCode()
  {
    return super.getStatusCode();
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.IntegrityServiceException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */