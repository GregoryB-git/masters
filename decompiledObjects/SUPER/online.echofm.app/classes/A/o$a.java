package A;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

public abstract class o$a
{
  public static ParcelFileDescriptor a(ContentResolver paramContentResolver, Uri paramUri, String paramString, CancellationSignal paramCancellationSignal)
  {
    return paramContentResolver.openFileDescriptor(paramUri, paramString, paramCancellationSignal);
  }
}

/* Location:
 * Qualified Name:     A.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */