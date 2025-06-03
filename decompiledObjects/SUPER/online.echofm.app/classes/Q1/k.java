package Q1;

import O1.P;
import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.F.b;
import x1.F.c;

public final class k
{
  public static final k a = new k();
  
  public static final boolean d(String paramString)
  {
    File localFile = f();
    if ((localFile != null) && (paramString != null)) {
      return new File(localFile, paramString).delete();
    }
    return false;
  }
  
  public static final String e(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return null;
    }
    if (paramThrowable.getCause() == null) {
      paramThrowable = paramThrowable.toString();
    } else {
      paramThrowable = String.valueOf(paramThrowable.getCause());
    }
    return paramThrowable;
  }
  
  public static final File f()
  {
    File localFile1 = new File(B.l().getCacheDir(), "instrument");
    File localFile2 = localFile1;
    if (!localFile1.exists()) {
      if (localFile1.mkdirs()) {
        localFile2 = localFile1;
      } else {
        localFile2 = null;
      }
    }
    return localFile2;
  }
  
  public static final String g(Thread paramThread)
  {
    Intrinsics.checkNotNullParameter(paramThread, "thread");
    paramThread = paramThread.getStackTrace();
    JSONArray localJSONArray = new JSONArray();
    Intrinsics.checkNotNullExpressionValue(paramThread, "stackTrace");
    int i = paramThread.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = paramThread[j];
      j++;
      localJSONArray.put(((StackTraceElement)localObject).toString());
    }
    return localJSONArray.toString();
  }
  
  public static final String h(Throwable paramThrowable)
  {
    Object localObject = null;
    if (paramThrowable == null) {
      return null;
    }
    JSONArray localJSONArray = new JSONArray();
    while ((paramThrowable != null) && (paramThrowable != localObject))
    {
      localObject = paramThrowable.getStackTrace();
      Intrinsics.checkNotNullExpressionValue(localObject, "t.stackTrace");
      int i = localObject.length;
      int j = 0;
      while (j < i)
      {
        localThrowable = localObject[j];
        j++;
        localJSONArray.put(localThrowable.toString());
      }
      Throwable localThrowable = paramThrowable.getCause();
      localObject = paramThrowable;
      paramThrowable = localThrowable;
    }
    return localJSONArray.toString();
  }
  
  public static final boolean i(StackTraceElement paramStackTraceElement)
  {
    Intrinsics.checkNotNullParameter(paramStackTraceElement, "element");
    String str = paramStackTraceElement.getClassName();
    Intrinsics.checkNotNullExpressionValue(str, "element.className");
    boolean bool = false;
    if (!kotlin.text.i.s(str, "com.facebook", false, 2, null))
    {
      paramStackTraceElement = paramStackTraceElement.getClassName();
      Intrinsics.checkNotNullExpressionValue(paramStackTraceElement, "element.className");
      if (!kotlin.text.i.s(paramStackTraceElement, "com.meta", false, 2, null)) {}
    }
    else
    {
      bool = true;
    }
    return bool;
  }
  
  public static final boolean j(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return false;
    }
    Object localObject1 = null;
    while ((paramThrowable != null) && (paramThrowable != localObject1))
    {
      localObject1 = paramThrowable.getStackTrace();
      Intrinsics.checkNotNullExpressionValue(localObject1, "t.stackTrace");
      int i = localObject1.length;
      int j = 0;
      while (j < i)
      {
        localObject2 = localObject1[j];
        j++;
        Intrinsics.checkNotNullExpressionValue(localObject2, "element");
        if (i((StackTraceElement)localObject2)) {
          return true;
        }
      }
      Object localObject2 = paramThrowable.getCause();
      localObject1 = paramThrowable;
      paramThrowable = (Throwable)localObject2;
    }
    return false;
  }
  
  public static final boolean k(Thread paramThread)
  {
    if (paramThread != null)
    {
      paramThread = paramThread.getStackTrace();
      if (paramThread != null)
      {
        int i = paramThread.length;
        for (int j = 0; j < i; j++)
        {
          Object localObject = paramThread[j];
          Intrinsics.checkNotNullExpressionValue(localObject, "element");
          if (i((StackTraceElement)localObject))
          {
            String str = ((StackTraceElement)localObject).getClassName();
            Intrinsics.checkNotNullExpressionValue(str, "element.className");
            if (!kotlin.text.i.s(str, "com.facebook.appevents.codeless", false, 2, null))
            {
              str = ((StackTraceElement)localObject).getClassName();
              Intrinsics.checkNotNullExpressionValue(str, "element.className");
              if (!kotlin.text.i.s(str, "com.facebook.appevents.suggestedevents", false, 2, null)) {}
            }
            else
            {
              str = ((StackTraceElement)localObject).getMethodName();
              Intrinsics.checkNotNullExpressionValue(str, "element.methodName");
              if (kotlin.text.i.s(str, "onClick", false, 2, null)) {
                continue;
              }
              str = ((StackTraceElement)localObject).getMethodName();
              Intrinsics.checkNotNullExpressionValue(str, "element.methodName");
              if (kotlin.text.i.s(str, "onItemClick", false, 2, null)) {
                continue;
              }
              localObject = ((StackTraceElement)localObject).getMethodName();
              Intrinsics.checkNotNullExpressionValue(localObject, "element.methodName");
              if (kotlin.text.i.s((String)localObject, "onTouch", false, 2, null)) {
                continue;
              }
            }
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public static final File[] l()
  {
    Object localObject = f();
    if (localObject == null) {
      return new File[0];
    }
    File[] arrayOfFile = ((File)localObject).listFiles(new i());
    localObject = arrayOfFile;
    if (arrayOfFile == null) {
      localObject = new File[0];
    }
    return (File[])localObject;
  }
  
  public static final boolean m(File paramFile, String paramString)
  {
    Intrinsics.checkNotNullExpressionValue(paramString, "name");
    paramFile = x.a;
    paramFile = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[] { "anr_log_" }, 1));
    Intrinsics.checkNotNullExpressionValue(paramFile, "java.lang.String.format(format, *args)");
    return new Regex(paramFile).b(paramString);
  }
  
  public static final File[] n()
  {
    Object localObject = f();
    if (localObject == null) {
      return new File[0];
    }
    File[] arrayOfFile = ((File)localObject).listFiles(new j());
    localObject = arrayOfFile;
    if (arrayOfFile == null) {
      localObject = new File[0];
    }
    return (File[])localObject;
  }
  
  public static final boolean o(File paramFile, String paramString)
  {
    Intrinsics.checkNotNullExpressionValue(paramString, "name");
    paramFile = x.a;
    paramFile = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[] { "analysis_log_" }, 1));
    Intrinsics.checkNotNullExpressionValue(paramFile, "java.lang.String.format(format, *args)");
    return new Regex(paramFile).b(paramString);
  }
  
  public static final File[] p()
  {
    Object localObject = f();
    if (localObject == null) {
      return new File[0];
    }
    File[] arrayOfFile = ((File)localObject).listFiles(new h());
    localObject = arrayOfFile;
    if (arrayOfFile == null) {
      localObject = new File[0];
    }
    return (File[])localObject;
  }
  
  public static final boolean q(File paramFile, String paramString)
  {
    Intrinsics.checkNotNullExpressionValue(paramString, "name");
    paramFile = x.a;
    paramFile = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[] { "crash_log_", "shield_log_", "thread_check_log_" }, 3));
    Intrinsics.checkNotNullExpressionValue(paramFile, "java.lang.String.format(format, *args)");
    return new Regex(paramFile).b(paramString);
  }
  
  public static final JSONObject r(String paramString, boolean paramBoolean)
  {
    Object localObject = f();
    if ((localObject != null) && (paramString != null))
    {
      localObject = new File((File)localObject, paramString);
      try
      {
        FileInputStream localFileInputStream = new java/io/FileInputStream;
        localFileInputStream.<init>((File)localObject);
        localObject = new JSONObject(P.s0(localFileInputStream));
        return (JSONObject)localObject;
      }
      catch (Exception localException)
      {
        if (paramBoolean) {
          d(paramString);
        }
      }
    }
    return null;
  }
  
  public static final void s(String paramString, JSONArray paramJSONArray, F.b paramb)
  {
    Intrinsics.checkNotNullParameter(paramJSONArray, "reports");
    if (paramJSONArray.length() == 0) {
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(paramString, paramJSONArray.toString());
      paramJSONArray = P.C();
      if (paramJSONArray != null)
      {
        Iterator localIterator = paramJSONArray.keys();
        while (localIterator.hasNext())
        {
          paramString = (String)localIterator.next();
          localJSONObject.put(paramString, paramJSONArray.get(paramString));
        }
      }
      paramString = F.n;
      paramJSONArray = x.a;
      paramJSONArray = String.format("%s/instruments", Arrays.copyOf(new Object[] { B.m() }, 1));
      Intrinsics.checkNotNullExpressionValue(paramJSONArray, "java.lang.String.format(format, *args)");
      paramString.A(null, paramJSONArray, localJSONObject, paramb).l();
      return;
    }
    catch (JSONException paramString)
    {
      for (;;) {}
    }
  }
  
  public static final void t(String paramString1, String paramString2)
  {
    File localFile = f();
    if ((localFile != null) && (paramString1 != null) && (paramString2 != null)) {
      localFile = new File(localFile, paramString1);
    }
    try
    {
      paramString1 = new java/io/FileOutputStream;
      paramString1.<init>(localFile);
      paramString2 = paramString2.getBytes(b.b);
      Intrinsics.checkNotNullExpressionValue(paramString2, "(this as java.lang.String).getBytes(charset)");
      paramString1.write(paramString2);
      paramString1.close();
      return;
    }
    catch (Exception paramString1)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     Q1.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */