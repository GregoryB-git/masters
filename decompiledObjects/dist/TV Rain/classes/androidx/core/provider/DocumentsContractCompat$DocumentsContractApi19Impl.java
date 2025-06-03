package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

@RequiresApi(19)
class DocumentsContractCompat$DocumentsContractApi19Impl
{
  @DoNotInline
  public static Uri buildDocumentUri(String paramString1, String paramString2)
  {
    return DocumentsContract.buildDocumentUri(paramString1, paramString2);
  }
  
  @DoNotInline
  public static boolean deleteDocument(ContentResolver paramContentResolver, Uri paramUri)
    throws FileNotFoundException
  {
    return DocumentsContract.deleteDocument(paramContentResolver, paramUri);
  }
  
  @DoNotInline
  public static String getDocumentId(Uri paramUri)
  {
    return DocumentsContract.getDocumentId(paramUri);
  }
  
  @DoNotInline
  public static boolean isDocumentUri(Context paramContext, @Nullable Uri paramUri)
  {
    return DocumentsContract.isDocumentUri(paramContext, paramUri);
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.DocumentsContractCompat.DocumentsContractApi19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */