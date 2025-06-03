package i0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.inputmethod.InputContentInfo;

public final class e
{
  public final c a;
  
  public e(Uri paramUri1, ClipDescription paramClipDescription, Uri paramUri2)
  {
    if (Build.VERSION.SDK_INT >= 25) {
      paramUri1 = new a(paramUri1, paramClipDescription, paramUri2);
    } else {
      paramUri1 = new b(paramUri1, paramClipDescription, paramUri2);
    }
    a = paramUri1;
  }
  
  public e(a parama)
  {
    a = parama;
  }
  
  public static final class a
    implements e.c
  {
    public final InputContentInfo a;
    
    public a(Uri paramUri1, ClipDescription paramClipDescription, Uri paramUri2)
    {
      a = new InputContentInfo(paramUri1, paramClipDescription, paramUri2);
    }
    
    public a(Object paramObject)
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
  
  public static final class b
    implements e.c
  {
    public final Uri a;
    public final ClipDescription b;
    public final Uri c;
    
    public b(Uri paramUri1, ClipDescription paramClipDescription, Uri paramUri2)
    {
      a = paramUri1;
      b = paramClipDescription;
      c = paramUri2;
    }
    
    public final Uri a()
    {
      return a;
    }
    
    public final void b() {}
    
    public final Uri c()
    {
      return c;
    }
    
    public final Object d()
    {
      return null;
    }
    
    public final ClipDescription getDescription()
    {
      return b;
    }
  }
  
  public static abstract interface c
  {
    public abstract Uri a();
    
    public abstract void b();
    
    public abstract Uri c();
    
    public abstract Object d();
    
    public abstract ClipDescription getDescription();
  }
}

/* Location:
 * Qualified Name:     i0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */