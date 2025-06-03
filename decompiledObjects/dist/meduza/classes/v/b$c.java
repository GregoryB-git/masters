package v;

import android.net.Uri;
import android.net.Uri.Builder;
import g;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class b$c
  implements b.b
{
  public final String a;
  public final HashMap<String, File> b = new HashMap();
  
  public b$c(String paramString)
  {
    a = paramString;
  }
  
  public static boolean c(String paramString1, String paramString2)
  {
    paramString1 = b.access$000(paramString1);
    String str = b.access$000(paramString2);
    if (!paramString1.equals(str))
    {
      paramString2 = new StringBuilder();
      paramString2.append(str);
      paramString2.append('/');
      if (!paramString1.startsWith(paramString2.toString())) {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public final File a(Uri paramUri)
  {
    Object localObject1 = paramUri.getEncodedPath();
    int i = ((String)localObject1).indexOf('/', 1);
    Object localObject2 = Uri.decode(((String)localObject1).substring(1, i));
    localObject1 = Uri.decode(((String)localObject1).substring(i + 1));
    localObject2 = (File)b.get(localObject2);
    if (localObject2 != null)
    {
      paramUri = new File((File)localObject2, (String)localObject1);
      try
      {
        localObject1 = paramUri.getCanonicalFile();
        if (c(((File)localObject1).getPath(), ((File)localObject2).getPath())) {
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
  
  public final Uri b(File paramFile)
  {
    try
    {
      String str1 = paramFile.getCanonicalPath();
      paramFile = null;
      Iterator localIterator = b.entrySet().iterator();
      Object localObject;
      while (localIterator.hasNext())
      {
        localObject = (Map.Entry)localIterator.next();
        String str2 = ((File)((Map.Entry)localObject).getValue()).getPath();
        if ((c(str1, str2)) && ((paramFile == null) || (str2.length() > ((File)paramFile.getValue()).getPath().length()))) {
          paramFile = (File)localObject;
        }
      }
      if (paramFile != null)
      {
        localObject = ((File)paramFile.getValue()).getPath();
        boolean bool = ((String)localObject).endsWith("/");
        int i = ((String)localObject).length();
        if (!bool) {
          i++;
        }
        str1 = str1.substring(i);
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(Uri.encode((String)paramFile.getKey()));
        ((StringBuilder)localObject).append('/');
        ((StringBuilder)localObject).append(Uri.encode(str1, "/"));
        paramFile = ((StringBuilder)localObject).toString();
        return new Uri.Builder().scheme("content").authority(a).encodedPath(paramFile).build();
      }
      throw new IllegalArgumentException(g.d("Failed to find configured root that contains ", str1));
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
 * Qualified Name:     v.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */