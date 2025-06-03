package M3;

import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class g
{
  public final File a;
  public final File b;
  public final File c;
  public final File d;
  public final File e;
  public final File f;
  
  public g(Context paramContext)
  {
    File localFile = paramContext.getFilesDir();
    a = localFile;
    if (v())
    {
      paramContext = new StringBuilder();
      paramContext.append(".com.google.firebase.crashlytics.files.v2");
      paramContext.append(File.pathSeparator);
      paramContext.append(u(f.a()));
      paramContext = paramContext.toString();
    }
    else
    {
      paramContext = ".com.google.firebase.crashlytics.files.v1";
    }
    paramContext = q(new File(localFile, paramContext));
    b = paramContext;
    c = q(new File(paramContext, "open-sessions"));
    d = q(new File(paramContext, "reports"));
    e = q(new File(paramContext, "priority-reports"));
    f = q(new File(paramContext, "native-reports"));
  }
  
  public static File q(File paramFile)
  {
    Object localObject1;
    Object localObject2;
    try
    {
      if (paramFile.exists())
      {
        boolean bool = paramFile.isDirectory();
        if (bool) {
          return paramFile;
        }
        localObject1 = E3.f.f();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Unexpected non-directory file: ");
        ((StringBuilder)localObject2).append(paramFile);
        ((StringBuilder)localObject2).append("; deleting file and creating new directory.");
        ((E3.f)localObject1).b(((StringBuilder)localObject2).toString());
        paramFile.delete();
      }
    }
    finally
    {
      break label121;
    }
    if (!paramFile.mkdirs())
    {
      localObject2 = E3.f.f();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("Could not create Crashlytics-specific directory: ");
      ((StringBuilder)localObject1).append(paramFile);
      ((E3.f)localObject2).d(((StringBuilder)localObject1).toString());
    }
    return paramFile;
    label121:
    throw paramFile;
  }
  
  public static File r(File paramFile)
  {
    paramFile.mkdirs();
    return paramFile;
  }
  
  public static boolean s(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++) {
        s(arrayOfFile[j]);
      }
    }
    return paramFile.delete();
  }
  
  public static List t(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      paramArrayOfObject = Collections.emptyList();
    } else {
      paramArrayOfObject = Arrays.asList(paramArrayOfObject);
    }
    return paramArrayOfObject;
  }
  
  public static String u(String paramString)
  {
    return paramString.replaceAll("[^a-zA-Z0-9.]", "_");
  }
  
  public static boolean v()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 28) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void a(File paramFile)
  {
    if ((paramFile.exists()) && (s(paramFile)))
    {
      E3.f localf = E3.f.f();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Deleted previous Crashlytics file system: ");
      localStringBuilder.append(paramFile.getPath());
      localf.b(localStringBuilder.toString());
    }
  }
  
  public void b()
  {
    a(new File(a, ".com.google.firebase.crashlytics"));
    a(new File(a, ".com.google.firebase.crashlytics-ndk"));
    if (v()) {
      a(new File(a, ".com.google.firebase.crashlytics.files.v1"));
    }
  }
  
  public boolean c(String paramString)
  {
    return s(new File(c, paramString));
  }
  
  public List d()
  {
    return t(c.list());
  }
  
  public File e(String paramString)
  {
    return new File(b, paramString);
  }
  
  public List f(FilenameFilter paramFilenameFilter)
  {
    return t(b.listFiles(paramFilenameFilter));
  }
  
  public File g(String paramString)
  {
    return new File(f, paramString);
  }
  
  public List h()
  {
    return t(f.listFiles());
  }
  
  public File i(String paramString)
  {
    return r(new File(n(paramString), "native"));
  }
  
  public File j(String paramString)
  {
    return new File(e, paramString);
  }
  
  public List k()
  {
    return t(e.listFiles());
  }
  
  public File l(String paramString)
  {
    return new File(d, paramString);
  }
  
  public List m()
  {
    return t(d.listFiles());
  }
  
  public final File n(String paramString)
  {
    return r(new File(c, paramString));
  }
  
  public File o(String paramString1, String paramString2)
  {
    return new File(n(paramString1), paramString2);
  }
  
  public List p(String paramString, FilenameFilter paramFilenameFilter)
  {
    return t(n(paramString).listFiles(paramFilenameFilter));
  }
}

/* Location:
 * Qualified Name:     M3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */