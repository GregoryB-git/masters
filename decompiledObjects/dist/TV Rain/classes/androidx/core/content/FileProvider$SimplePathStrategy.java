package androidx.core.content;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import z2;

class FileProvider$SimplePathStrategy
  implements FileProvider.PathStrategy
{
  private final String mAuthority;
  private final HashMap<String, File> mRoots = new HashMap();
  
  public FileProvider$SimplePathStrategy(String paramString)
  {
    mAuthority = paramString;
  }
  
  public void addRoot(String paramString, File paramFile)
  {
    if (!TextUtils.isEmpty(paramString)) {
      try
      {
        File localFile = paramFile.getCanonicalFile();
        mRoots.put(paramString, localFile);
        return;
      }
      catch (IOException localIOException)
      {
        paramString = new StringBuilder();
        paramString.append("Failed to resolve canonical path for ");
        paramString.append(paramFile);
        throw new IllegalArgumentException(paramString.toString(), localIOException);
      }
    }
    throw new IllegalArgumentException("Name must not be empty");
  }
  
  public File getFileForUri(Uri paramUri)
  {
    Object localObject1 = paramUri.getEncodedPath();
    int i = ((String)localObject1).indexOf('/', 1);
    Object localObject2 = Uri.decode(((String)localObject1).substring(1, i));
    localObject1 = Uri.decode(((String)localObject1).substring(i + 1));
    localObject2 = (File)mRoots.get(localObject2);
    if (localObject2 != null)
    {
      paramUri = new File((File)localObject2, (String)localObject1);
      try
      {
        localObject1 = paramUri.getCanonicalFile();
        if (((File)localObject1).getPath().startsWith(((File)localObject2).getPath())) {
          return (File)localObject1;
        }
        throw new SecurityException("Resolved path jumped beyond configured root");
      }
      catch (IOException localIOException)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Failed to resolve canonical path for ");
        localStringBuilder.append(paramUri);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unable to find configured root for ");
    localStringBuilder.append(paramUri);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public Uri getUriForFile(File paramFile)
  {
    try
    {
      Object localObject1 = paramFile.getCanonicalPath();
      paramFile = null;
      Iterator localIterator = mRoots.entrySet().iterator();
      Object localObject2;
      while (localIterator.hasNext())
      {
        localObject2 = (Map.Entry)localIterator.next();
        String str = ((File)((Map.Entry)localObject2).getValue()).getPath();
        if ((((String)localObject1).startsWith(str)) && ((paramFile == null) || (str.length() > ((File)paramFile.getValue()).getPath().length()))) {
          paramFile = (File)localObject2;
        }
      }
      if (paramFile != null)
      {
        localObject2 = ((File)paramFile.getValue()).getPath();
        if (((String)localObject2).endsWith("/")) {
          localObject2 = ((String)localObject1).substring(((String)localObject2).length());
        } else {
          localObject2 = ((String)localObject1).substring(((String)localObject2).length() + 1);
        }
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append(Uri.encode((String)paramFile.getKey()));
        ((StringBuilder)localObject1).append('/');
        ((StringBuilder)localObject1).append(Uri.encode((String)localObject2, "/"));
        paramFile = ((StringBuilder)localObject1).toString();
        return new Uri.Builder().scheme("content").authority(mAuthority).encodedPath(paramFile).build();
      }
      throw new IllegalArgumentException(z2.o("Failed to find configured root that contains ", (String)localObject1));
    }
    catch (IOException localIOException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to resolve canonical path for ");
      localStringBuilder.append(paramFile);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.FileProvider.SimplePathStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */