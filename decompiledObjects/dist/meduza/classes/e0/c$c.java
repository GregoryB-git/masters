package e0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

public final class c$c
  implements c.b
{
  public ClipData a;
  public int b;
  public int c;
  public Uri d;
  public Bundle e;
  
  public c$c(ClipData paramClipData, int paramInt)
  {
    a = paramClipData;
    b = paramInt;
  }
  
  public final void a(Uri paramUri)
  {
    d = paramUri;
  }
  
  public final void b(int paramInt)
  {
    c = paramInt;
  }
  
  public final c build()
  {
    return new c(new c.f(this));
  }
  
  public final void setExtras(Bundle paramBundle)
  {
    e = paramBundle;
  }
}

/* Location:
 * Qualified Name:     e0.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */