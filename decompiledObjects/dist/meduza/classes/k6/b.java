package k6;

import com.google.android.gms.common.api.Status;

public class b
  extends Exception
{
  @Deprecated
  public final Status mStatus;
  
  public b(Status paramStatus)
  {
    super(localStringBuilder.toString());
    mStatus = paramStatus;
  }
  
  public Status getStatus()
  {
    return mStatus;
  }
  
  public int getStatusCode()
  {
    return mStatus.a;
  }
  
  @Deprecated
  public String getStatusMessage()
  {
    return mStatus.b;
  }
}

/* Location:
 * Qualified Name:     k6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */