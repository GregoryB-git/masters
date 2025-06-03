package okhttp3.internal.http2;

public abstract class Http2Connection$Listener
{
  public static final Listener a = new Listener()
  {
    public final void b(Http2Stream paramAnonymousHttp2Stream)
    {
      paramAnonymousHttp2Stream.c(ErrorCode.f);
    }
  };
  
  public void a(Http2Connection paramHttp2Connection) {}
  
  public abstract void b(Http2Stream paramHttp2Stream);
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.Listener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */