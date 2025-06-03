package y4;

import android.net.Uri;
import java.util.List;
import t5.f0.a;
import t5.m;

public final class b<T extends a<T>>
  implements f0.a<T>
{
  public final f0.a<? extends T> a;
  public final List<c> b;
  
  public b(f0.a<? extends T> parama, List<c> paramList)
  {
    a = parama;
    b = paramList;
  }
  
  public final Object a(Uri paramUri, m paramm)
  {
    paramm = (a)a.a(paramUri, paramm);
    List localList = b;
    paramUri = paramm;
    if (localList != null) {
      if (localList.isEmpty()) {
        paramUri = paramm;
      } else {
        paramUri = (a)paramm.a(b);
      }
    }
    return paramUri;
  }
}

/* Location:
 * Qualified Name:     y4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */