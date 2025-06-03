package okhttp3.internal.http2;

public enum ErrorCode
{
  public final int a;
  
  static
  {
    ErrorCode localErrorCode1 = new ErrorCode("NO_ERROR", 0, 0);
    b = localErrorCode1;
    ErrorCode localErrorCode2 = new ErrorCode("PROTOCOL_ERROR", 1, 1);
    c = localErrorCode2;
    ErrorCode localErrorCode3 = new ErrorCode("INTERNAL_ERROR", 2, 2);
    d = localErrorCode3;
    ErrorCode localErrorCode4 = new ErrorCode("FLOW_CONTROL_ERROR", 3, 3);
    e = localErrorCode4;
    ErrorCode localErrorCode5 = new ErrorCode("REFUSED_STREAM", 4, 7);
    f = localErrorCode5;
    ErrorCode localErrorCode6 = new ErrorCode("CANCEL", 5, 8);
    o = localErrorCode6;
    p = new ErrorCode[] { localErrorCode1, localErrorCode2, localErrorCode3, localErrorCode4, localErrorCode5, localErrorCode6, new ErrorCode("COMPRESSION_ERROR", 6, 9), new ErrorCode("CONNECT_ERROR", 7, 10), new ErrorCode("ENHANCE_YOUR_CALM", 8, 11), new ErrorCode("INADEQUATE_SECURITY", 9, 12), new ErrorCode("HTTP_1_1_REQUIRED", 10, 13) };
  }
  
  public ErrorCode(int paramInt)
  {
    a = paramInt;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.ErrorCode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */