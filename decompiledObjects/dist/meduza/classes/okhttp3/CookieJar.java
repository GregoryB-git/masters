package okhttp3;

import java.util.Collections;
import java.util.List;

public abstract interface CookieJar
{
  public static final CookieJar a = new CookieJar()
  {
    public final List a()
    {
      return Collections.emptyList();
    }
    
    public final void b() {}
  };
  
  public abstract List a();
  
  public abstract void b();
}

/* Location:
 * Qualified Name:     okhttp3.CookieJar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */