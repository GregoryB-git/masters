package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

public class StandardIntegrityException
  extends k6.b
{
  private final Throwable a;
  
  public StandardIntegrityException(int paramInt, Throwable paramThrowable)
  {
    super(new Status(paramInt, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", new Object[] { Integer.valueOf(paramInt), com.google.android.play.core.integrity.model.b.a(paramInt) }), null, null));
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
 * Qualified Name:     com.google.android.play.core.integrity.StandardIntegrityException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */