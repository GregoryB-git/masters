package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

public final class DocumentsContractCompat
{
  private static final String PATH_TREE = "tree";
  
  @Nullable
  public static Uri buildChildDocumentsUri(@NonNull String paramString1, @Nullable String paramString2)
  {
    return DocumentsContractApi21Impl.buildChildDocumentsUri(paramString1, paramString2);
  }
  
  @Nullable
  public static Uri buildChildDocumentsUriUsingTree(@NonNull Uri paramUri, @NonNull String paramString)
  {
    return DocumentsContractApi21Impl.buildChildDocumentsUriUsingTree(paramUri, paramString);
  }
  
  @Nullable
  public static Uri buildDocumentUri(@NonNull String paramString1, @NonNull String paramString2)
  {
    return DocumentsContractApi19Impl.buildDocumentUri(paramString1, paramString2);
  }
  
  @Nullable
  public static Uri buildDocumentUriUsingTree(@NonNull Uri paramUri, @NonNull String paramString)
  {
    return DocumentsContractApi21Impl.buildDocumentUriUsingTree(paramUri, paramString);
  }
  
  @Nullable
  public static Uri buildTreeDocumentUri(@NonNull String paramString1, @NonNull String paramString2)
  {
    return DocumentsContractApi21Impl.buildTreeDocumentUri(paramString1, paramString2);
  }
  
  @Nullable
  public static Uri createDocument(@NonNull ContentResolver paramContentResolver, @NonNull Uri paramUri, @NonNull String paramString1, @NonNull String paramString2)
    throws FileNotFoundException
  {
    return DocumentsContractApi21Impl.createDocument(paramContentResolver, paramUri, paramString1, paramString2);
  }
  
  @Nullable
  public static String getDocumentId(@NonNull Uri paramUri)
  {
    return DocumentsContractApi19Impl.getDocumentId(paramUri);
  }
  
  @Nullable
  public static String getTreeDocumentId(@NonNull Uri paramUri)
  {
    return DocumentsContractApi21Impl.getTreeDocumentId(paramUri);
  }
  
  public static boolean isDocumentUri(@NonNull Context paramContext, @Nullable Uri paramUri)
  {
    return DocumentsContractApi19Impl.isDocumentUri(paramContext, paramUri);
  }
  
  public static boolean isTreeUri(@NonNull Uri paramUri)
  {
    return DocumentsContractApi24Impl.isTreeUri(paramUri);
  }
  
  public static boolean removeDocument(@NonNull ContentResolver paramContentResolver, @NonNull Uri paramUri1, @NonNull Uri paramUri2)
    throws FileNotFoundException
  {
    return DocumentsContractApi24Impl.removeDocument(paramContentResolver, paramUri1, paramUri2);
  }
  
  @Nullable
  public static Uri renameDocument(@NonNull ContentResolver paramContentResolver, @NonNull Uri paramUri, @NonNull String paramString)
    throws FileNotFoundException
  {
    return DocumentsContractApi21Impl.renameDocument(paramContentResolver, paramUri, paramString);
  }
  
  public static final class DocumentCompat
  {
    public static final int FLAG_VIRTUAL_DOCUMENT = 512;
  }
  
  @RequiresApi(19)
  public static class DocumentsContractApi19Impl
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
  
  @RequiresApi(21)
  public static class DocumentsContractApi21Impl
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
  
  @RequiresApi(24)
  public static class DocumentsContractApi24Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.provider.DocumentsContractCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */