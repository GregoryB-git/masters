package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

public abstract class DocumentFile
{
  public static final String TAG = "DocumentFile";
  @Nullable
  private final DocumentFile mParent;
  
  public DocumentFile(@Nullable DocumentFile paramDocumentFile)
  {
    mParent = paramDocumentFile;
  }
  
  @NonNull
  public static DocumentFile fromFile(@NonNull File paramFile)
  {
    return new RawDocumentFile(null, paramFile);
  }
  
  @Nullable
  public static DocumentFile fromSingleUri(@NonNull Context paramContext, @NonNull Uri paramUri)
  {
    return new SingleDocumentFile(null, paramContext, paramUri);
  }
  
  @Nullable
  public static DocumentFile fromTreeUri(@NonNull Context paramContext, @NonNull Uri paramUri)
  {
    return new TreeDocumentFile(null, paramContext, DocumentsContract.buildDocumentUriUsingTree(paramUri, DocumentsContract.getTreeDocumentId(paramUri)));
  }
  
  public static boolean isDocumentUri(@NonNull Context paramContext, @Nullable Uri paramUri)
  {
    return DocumentsContract.isDocumentUri(paramContext, paramUri);
  }
  
  public abstract boolean canRead();
  
  public abstract boolean canWrite();
  
  @Nullable
  public abstract DocumentFile createDirectory(@NonNull String paramString);
  
  @Nullable
  public abstract DocumentFile createFile(@NonNull String paramString1, @NonNull String paramString2);
  
  public abstract boolean delete();
  
  public abstract boolean exists();
  
  @Nullable
  public DocumentFile findFile(@NonNull String paramString)
  {
    for (DocumentFile localDocumentFile : listFiles()) {
      if (paramString.equals(localDocumentFile.getName())) {
        return localDocumentFile;
      }
    }
    return null;
  }
  
  @Nullable
  public abstract String getName();
  
  @Nullable
  public DocumentFile getParentFile()
  {
    return mParent;
  }
  
  @Nullable
  public abstract String getType();
  
  @NonNull
  public abstract Uri getUri();
  
  public abstract boolean isDirectory();
  
  public abstract boolean isFile();
  
  public abstract boolean isVirtual();
  
  public abstract long lastModified();
  
  public abstract long length();
  
  @NonNull
  public abstract DocumentFile[] listFiles();
  
  public abstract boolean renameTo(@NonNull String paramString);
}

/* Location:
 * Qualified Name:     androidx.documentfile.provider.DocumentFile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */