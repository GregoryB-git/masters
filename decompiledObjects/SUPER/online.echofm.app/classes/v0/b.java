package v0;

import B0.p.a;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;

public final class b
  implements p.a
{
  public final p.a a;
  public final List b;
  
  public b(p.a parama, List paramList)
  {
    a = parama;
    b = paramList;
  }
  
  public a b(Uri paramUri, InputStream paramInputStream)
  {
    paramInputStream = (a)a.a(paramUri, paramInputStream);
    List localList = b;
    paramUri = paramInputStream;
    if (localList != null) {
      if (localList.isEmpty()) {
        paramUri = paramInputStream;
      } else {
        paramUri = (a)paramInputStream.a(b);
      }
    }
    return paramUri;
  }
}

/* Location:
 * Qualified Name:     v0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */