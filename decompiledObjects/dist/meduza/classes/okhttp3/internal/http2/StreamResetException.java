package okhttp3.internal.http2;

import java.io.IOException;

public final class StreamResetException
  extends IOException
{
  public final ErrorCode a;
  
  public StreamResetException(ErrorCode paramErrorCode)
  {
    super(localStringBuilder.toString());
    a = paramErrorCode;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.StreamResetException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */