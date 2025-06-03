package i0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class e$a
  implements e.c
{
  public final InputContentInfo a;
  
  public e$a(Uri paramUri1, ClipDescription paramClipDescription, Uri paramUri2)
  {
    a = new InputContentInfo(paramUri1, paramClipDescription, paramUri2);
  }
  
  public e$a(Object paramObject)
  {
    a = ((InputContentInfo)paramObject);
  }
  
  public final Uri a()
  {
    return a.getContentUri();
  }
  
  public final void b()
  {
    a.requestPermission();
  }
  
  public final Uri c()
  {
    return a.getLinkUri();
  }
  
  public final Object d()
  {
    return a;
  }
  
  public final ClipDescription getDescription()
  {
    return a.getDescription();
  }
}

/* Location:
 * Qualified Name:     i0.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */