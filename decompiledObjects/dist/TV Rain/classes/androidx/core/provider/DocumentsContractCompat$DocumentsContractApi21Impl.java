package androidx.core.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

@RequiresApi(21)
class DocumentsContractCompat$DocumentsContractApi21Impl
{
  @DoNotInline
  public static Uri buildChildDocumentsUri(String paramString1, String paramString2)
  {
    return DocumentsContract.buildChildDocumentsUri(paramString1, paramString2);
  }
  
  @DoNotInline
  public static Uri buildChildDocumentsUriUsingTree(Uri paramUri, String paramString)
  {
    return DocumentsContract.buildChildDocumentsUriUsingTree(paramUri, paramString);
  }
  
  @DoNotInline
  public static Uri buildDocumentUriUsingTree(Uri paramUri, String paramString)
  {
    return DocumentsContract.buildDocumentUriUsingTree(paramUri, paramString);
  }
  
  @DoNotInline
  public static Uri buildTreeDocumentUri(String paramString1, String paramString2)
  {
    return DocumentsContract.buildTreeDocumentUri(paramString1, paramString2);
  }
  
  @DoNotInline
  public static Uri createDocument(ContentResolver paramContentResolver, Uri paramUri, String paramString1, String paramString2)
    throws FileNotFoundException
  {
    return DocumentsContract.createDocument(paramContentResolver, paramUri, paramString1, paramString2);
  }
  
  @DoNotInline
  public static String getTreeDocumentId(Uri paramUri)
  {
    return DocumentsContract.getTreeDocumentId(paramUri);
  }
  
  @DoNotInline
  public static Uri renameDocument(@NonNull ContentResolver paramContentResolver, @NonNull Uri paramUri, @NonNull String paramString)
    throws FileNotFoundException
  {
    return DocumentsContract.renameDocument(paramContentResolver, paramUri, paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */