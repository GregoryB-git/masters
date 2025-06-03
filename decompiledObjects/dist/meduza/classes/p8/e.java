package p8;

import android.content.Context;
import android.util.Log;
import f;
import j8.g;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m8.f0.e.d.a.c;

public final class e
{
  public final String a;
  public final File b;
  public final File c;
  public final File d;
  public final File e;
  public final File f;
  public final File g;
  
  public e(Context paramContext)
  {
    String str = g8.e.a.c(paramContext).c();
    a = str;
    File localFile = paramContext.getFilesDir();
    b = localFile;
    if ((str.isEmpty() ^ true))
    {
      StringBuilder localStringBuilder = f.l(".crashlytics.v3");
      localStringBuilder.append(File.separator);
      if (str.length() > 40) {
        paramContext = g.i(str);
      } else {
        paramContext = str.replaceAll("[^a-zA-Z0-9.]", "_");
      }
      localStringBuilder.append(paramContext);
      paramContext = localStringBuilder.toString();
    }
    else
    {
      paramContext = ".com.google.firebase.crashlytics.files.v1";
    }
    paramContext = new File(localFile, paramContext);
    c(paramContext);
    c = paramContext;
    localFile = new File(paramContext, "open-sessions");
    c(localFile);
    d = localFile;
    localFile = new File(paramContext, "reports");
    c(localFile);
    e = localFile;
    localFile = new File(paramContext, "priority-reports");
    c(localFile);
    f = localFile;
    paramContext = new File(paramContext, "native-reports");
    c(paramContext);
    g = paramContext;
  }
  
  public static void c(File paramFile)
  {
    try
    {
      Object localObject;
      if (paramFile.exists())
      {
        boolean bool = paramFile.isDirectory();
        if (bool) {
          return;
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Unexpected non-directory file: ");
        ((StringBuilder)localObject).append(paramFile);
        ((StringBuilder)localObject).append("; deleting file and creating new directory.");
        localObject = ((StringBuilder)localObject).toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
          Log.d("FirebaseCrashlytics", (String)localObject, null);
        }
        paramFile.delete();
      }
      if (!paramFile.mkdirs())
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Could not create Crashlytics-specific directory: ");
        ((StringBuilder)localObject).append(paramFile);
        Log.e("FirebaseCrashlytics", ((StringBuilder)localObject).toString(), null);
      }
      return;
    }
    finally {}
  }
  
  public static boolean d(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++) {
        d(arrayOfFile[j]);
      }
    }
    return paramFile.delete();
  }
  
  public static <T> List<T> e(T[] paramArrayOfT)
  {
    if (paramArrayOfT == null) {
      paramArrayOfT = Collections.emptyList();
    } else {
      paramArrayOfT = Arrays.asList(paramArrayOfT);
    }
    return paramArrayOfT;
  }
  
  public final void a(String paramString)
  {
    paramString = new File(b, paramString);
    if ((paramString.exists()) && (d(paramString)))
    {
      StringBuilder localStringBuilder = f.l("Deleted previous Crashlytics file system: ");
      localStringBuilder.append(paramString.getPath());
      paramString = localStringBuilder.toString();
      if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        Log.d("FirebaseCrashlytics", paramString, null);
      }
    }
  }
  
  public final File b(String paramString1, String paramString2)
  {
    paramString1 = new File(d, paramString1);
    paramString1.mkdirs();
    return new File(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     p8.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */