package androidx.core.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

@RequiresApi(24)
class DocumentsContractCompat$DocumentsContractApi24Impl
{
  @DoNotInline
  public static boolean isTreeUri(@NonNull Uri paramUri)
  {
    return DocumentsContract.isTreeUri(paramUri);
  }
  
  @DoNotInline
  public static boolean removeDocument(ContentResolver paramContentResolver, Uri paramUri1, Uri paramUri2)
    throws FileNotFoundException
  {
    return DocumentsContract.removeDocument(paramContentResolver, paramUri1, paramUri2);
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.DocumentsContractCompat.DocumentsContractApi24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */