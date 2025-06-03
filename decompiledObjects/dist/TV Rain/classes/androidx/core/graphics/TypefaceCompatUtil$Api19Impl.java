package androidx.core.graphics;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

@RequiresApi(19)
class TypefaceCompatUtil$Api19Impl
{
  @DoNotInline
  public static ParcelFileDescriptor openFileDescriptor(ContentResolver paramContentResolver, Uri paramUri, String paramString, CancellationSignal paramCancellationSignal)
    throws FileNotFoundException
  {
    return paramContentResolver.openFileDescriptor(paramUri, paramString, paramCancellationSignal);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.TypefaceCompatUtil.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */