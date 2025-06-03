package androidx.documentfile.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import z2;

class RawDocumentFile
  extends DocumentFile
{
  private File mFile;
  
  public RawDocumentFile(@Nullable DocumentFile paramDocumentFile, File paramFile)
  {
    super(paramDocumentFile);
    mFile = paramFile;
  }
  
  private static boolean deleteContents(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    boolean bool1 = true;
    boolean bool2 = true;
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      for (int j = 0;; j++)
      {
        bool1 = bool2;
        if (j >= i) {
          break;
        }
        paramFile = arrayOfFile[j];
        bool1 = bool2;
        if (paramFile.isDirectory()) {
          bool1 = bool2 & deleteContents(paramFile);
        }
        bool2 = bool1;
        if (!paramFile.delete())
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Failed to delete ");
          localStringBuilder.append(paramFile);
          Log.w("DocumentFile", localStringBuilder.toString());
          bool2 = false;
        }
      }
    }
    return bool1;
  }
  
  private static String getTypeForName(String paramString)
  {
    int i = paramString.lastIndexOf('.');
    if (i >= 0)
    {
      paramString = paramString.substring(i + 1).toLowerCase();
      paramString = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
      if (paramString != null) {
        return paramString;
      }
    }
    return "application/octet-stream";
  }
  
  public boolean canRead()
  {
    return mFile.canRead();
  }
  
  public boolean canWrite()
  {
    return mFile.canWrite();
  }
  
  @Nullable
  public DocumentFile createDirectory(String paramString)
  {
    paramString = new File(mFile, paramString);
    if ((!paramString.isDirectory()) && (!paramString.mkdir())) {
      return null;
    }
    return new RawDocumentFile(this, paramString);
  }
  
  @Nullable
  public DocumentFile createFile(String paramString1, String paramString2)
  {
    String str = MimeTypeMap.getSingleton().getExtensionFromMimeType(paramString1);
    paramString1 = paramString2;
    if (str != null) {
      paramString1 = z2.p(paramString2, ".", str);
    }
    paramString1 = new File(mFile, paramString1);
    try
    {
      paramString1.createNewFile();
      paramString1 = new RawDocumentFile(this, paramString1);
      return paramString1;
    }
    catch (IOException paramString2)
    {
      paramString1 = new StringBuilder();
      paramString1.append("Failed to createFile: ");
      paramString1.append(paramString2);
      Log.w("DocumentFile", paramString1.toString());
    }
    return null;
  }
  
  public boolean delete()
  {
    deleteContents(mFile);
    return mFile.delete();
  }
  
  public boolean exists()
  {
    return mFile.exists();
  }
  
  public String getName()
  {
    return mFile.getName();
  }
  
  @Nullable
  public String getType()
  {
    if (mFile.isDirectory()) {
      return null;
    }
    return getTypeForName(mFile.getName());
  }
  
  public Uri getUri()
  {
    return Uri.fromFile(mFile);
  }
  
  public boolean isDirectory()
  {
    return mFile.isDirectory();
  }
  
  public boolean isFile()
  {
    return mFile.isFile();
  }
  
  public boolean isVirtual()
  {
    return false;
  }
  
  public long lastModified()
  {
    return mFile.lastModified();
  }
  
  public long length()
  {
    return mFile.length();
  }
  
  public DocumentFile[] listFiles()
  {
    ArrayList localArrayList = new ArrayList();
    File[] arrayOfFile = mFile.listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++) {
        localArrayList.add(new RawDocumentFile(this, arrayOfFile[j]));
      }
    }
    return (DocumentFile[])localArrayList.toArray(new DocumentFile[localArrayList.size()]);
  }
  
  public boolean renameTo(String paramString)
  {
    paramString = new File(mFile.getParentFile(), paramString);
    if (mFile.renameTo(paramString))
    {
      mFile = paramString;
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.documentfile.provider.RawDocumentFile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */