package m0;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

public final class i$d
  extends ContentObserver
{
  public final ContentResolver a;
  public final Uri b;
  
  public i$d(i parami, Handler paramHandler, ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramHandler);
    a = paramContentResolver;
    b = paramUri;
  }
  
  public void a()
  {
    a.registerContentObserver(b, false, this);
  }
  
  public void b()
  {
    a.unregisterContentObserver(this);
  }
  
  public void onChange(boolean paramBoolean)
  {
    i locali = c;
    i.d(locali, e.g(i.e(locali), i.a(c), i.b(c)));
  }
}

/* Location:
 * Qualified Name:     m0.i.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */