package g3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class a
  implements c
{
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
  
  public static a b(Context paramContext, String[] paramArrayOfString, String paramString, f paramf)
  {
    String[] arrayOfString = d(paramContext);
    int i = arrayOfString.length;
    int j = 0;
    for (;;)
    {
      Object localObject = null;
      if (j < i)
      {
        String str1 = arrayOfString[j];
        int k = 0;
        for (;;)
        {
          paramContext = (Context)localObject;
          if (k >= 5) {
            break;
          }
          try
          {
            paramContext = new java/io/File;
            paramContext.<init>(str1);
            paramContext = new ZipFile(paramContext, 1);
          }
          catch (IOException paramContext)
          {
            k++;
          }
        }
        if (paramContext != null) {
          for (k = 0; k < 5; k++)
          {
            int m = paramArrayOfString.length;
            for (int n = 0; n < m; n++)
            {
              String str2 = paramArrayOfString[n];
              localObject = f.l("lib");
              ((StringBuilder)localObject).append(File.separatorChar);
              ((StringBuilder)localObject).append(str2);
              ((StringBuilder)localObject).append(File.separatorChar);
              ((StringBuilder)localObject).append(paramString);
              localObject = ((StringBuilder)localObject).toString();
              paramf.getClass();
              f.d("Looking for %s in APK %s...", new Object[] { localObject, str1 });
              localObject = paramContext.getEntry((String)localObject);
              if (localObject != null) {
                return new a(paramContext, (ZipEntry)localObject);
              }
            }
          }
        }
      }
      try
      {
        paramContext.close();
        j++;
        continue;
        return null;
      }
      catch (IOException paramContext)
      {
        for (;;) {}
      }
    }
  }
  
  public static String[] c(Context paramContext, String paramString)
  {
    Object localObject1 = f.l("lib");
    ((StringBuilder)localObject1).append(File.separatorChar);
    ((StringBuilder)localObject1).append("([^\\");
    ((StringBuilder)localObject1).append(File.separatorChar);
    ((StringBuilder)localObject1).append("]*)");
    ((StringBuilder)localObject1).append(File.separatorChar);
    ((StringBuilder)localObject1).append(paramString);
    paramString = Pattern.compile(((StringBuilder)localObject1).toString());
    localObject1 = new HashSet();
    paramContext = d(paramContext);
    int i = paramContext.length;
    int j = 0;
    while (j < i)
    {
      Object localObject2 = paramContext[j];
      try
      {
        Object localObject3 = new java/util/zip/ZipFile;
        File localFile = new java/io/File;
        localFile.<init>((String)localObject2);
        ((ZipFile)localObject3).<init>(localFile, 1);
        localObject3 = ((ZipFile)localObject3).entries();
        while (((Enumeration)localObject3).hasMoreElements())
        {
          localObject2 = paramString.matcher(((ZipEntry)((Enumeration)localObject3).nextElement()).getName());
          if (((Matcher)localObject2).matches()) {
            ((HashSet)localObject1).add(((Matcher)localObject2).group(1));
          }
        }
        j++;
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
    }
    return (String[])((Set)localObject1).toArray(new String[((HashSet)localObject1).size()]);
  }
  
  public static String[] d(Context paramContext)
  {
    paramContext = paramContext.getApplicationInfo();
    String[] arrayOfString1 = splitSourceDirs;
    if ((arrayOfString1 != null) && (arrayOfString1.length != 0))
    {
      String[] arrayOfString2 = new String[arrayOfString1.length + 1];
      arrayOfString2[0] = sourceDir;
      System.arraycopy(arrayOfString1, 0, arrayOfString2, 1, arrayOfString1.length);
      return arrayOfString2;
    }
    return new String[] { sourceDir };
  }
  
  public static final class a
  {
    public ZipFile a;
    public ZipEntry b;
    
    public a(ZipFile paramZipFile, ZipEntry paramZipEntry)
    {
      a = paramZipFile;
      b = paramZipEntry;
    }
  }
}

/* Location:
 * Qualified Name:     g3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */