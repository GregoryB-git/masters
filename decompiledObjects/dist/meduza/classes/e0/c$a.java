package e0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo.Builder;

public final class c$a
  implements c.b
{
  public final ContentInfo.Builder a;
  
  public c$a(ClipData paramClipData, int paramInt)
  {
    a = new ContentInfo.Builder(paramClipData, paramInt);
  }
  
  public final void a(Uri paramUri)
  {
    a.setLinkUri(paramUri);
  }
  
  public final void b(int paramInt)
  {
    a.setFlags(paramInt);
  }
  
  public final c build()
  {
    return new c(new c.d(a.build()));
  }
  
  public final void setExtras(Bundle paramBundle)
  {
    a.setExtras(paramBundle);
  }
}

/* Location:
 * Qualified Name:     e0.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */