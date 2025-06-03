package b0;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;

public final class e$b
  implements e.a
{
  public final ContentProviderClient a;
  
  public e$b(Context paramContext, Uri paramUri)
  {
    a = paramContext.getContentResolver().acquireUnstableContentProviderClient(paramUri);
  }
  
  public final Cursor a(Uri paramUri, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    ContentProviderClient localContentProviderClient = a;
    if (localContentProviderClient == null) {
      return null;
    }
    try
    {
      paramUri = localContentProviderClient.query(paramUri, paramArrayOfString1, "query = ?", paramArrayOfString2, null, null);
      return paramUri;
    }
    catch (RemoteException paramUri)
    {
      Log.w("FontsProvider", "Unable to query the content provider", paramUri);
    }
    return null;
  }
  
  public final void close()
  {
    ContentProviderClient localContentProviderClient = a;
    if (localContentProviderClient != null) {
      localContentProviderClient.release();
    }
  }
}

/* Location:
 * Qualified Name:     b0.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */