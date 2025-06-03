package okhttp3;

import java.io.IOException;

public abstract interface Callback
{
  public abstract void a(Call paramCall, Response paramResponse);
  
  public abstract void b(Call paramCall, IOException paramIOException);
}

/* Location:
 * Qualified Name:     okhttp3.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */