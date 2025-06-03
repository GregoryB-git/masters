package H3;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public abstract class i
{
  public static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  
  public static String A(String paramString)
  {
    return s(paramString, "SHA-1");
  }
  
  public static String B(InputStream paramInputStream)
  {
    paramInputStream = new Scanner(paramInputStream).useDelimiter("\\A");
    if (paramInputStream.hasNext()) {
      paramInputStream = paramInputStream.next();
    } else {
      paramInputStream = "";
    }
    return paramInputStream;
  }
  
  public static long a(Context paramContext)
  {
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    ((ActivityManager)paramContext.getSystemService("activity")).getMemoryInfo(localMemoryInfo);
    return availMem;
  }
  
  public static long b(Context paramContext)
  {
    try
    {
      ActivityManager.MemoryInfo localMemoryInfo = new android/app/ActivityManager$MemoryInfo;
      localMemoryInfo.<init>();
      ((ActivityManager)paramContext.getSystemService("activity")).getMemoryInfo(localMemoryInfo);
      long l = totalMem;
      return l;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public static long c(String paramString)
  {
    paramString = new StatFs(paramString);
    long l = paramString.getBlockSize();
    return paramString.getBlockCount() * l - l * paramString.getAvailableBlocks();
  }
  
  public static boolean d(Context paramContext)
  {
    boolean bool1 = e(paramContext, "android.permission.ACCESS_NETWORK_STATE");
    boolean bool2 = true;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if ((paramContext != null) && (paramContext.isConnectedOrConnecting())) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
    }
    return bool3;
  }
  
  public static boolean e(Context paramContext, String paramString)
  {
    boolean bool;
    if (paramContext.checkCallingOrSelfPermission(paramString) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void f(Closeable paramCloseable, String paramString)
  {
    if (paramCloseable != null) {
      try
      {
        paramCloseable.close();
      }
      catch (IOException paramCloseable)
      {
        E3.f.f().e(paramString, paramCloseable);
      }
    }
  }
  
  public static void g(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      try
      {
        paramCloseable.close();
      }
      catch (RuntimeException paramCloseable)
      {
        throw paramCloseable;
      }
      return;
    }
    catch (Exception paramCloseable)
    {
      for (;;) {}
    }
  }
  
  public static String h(String... paramVarArgs)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramVarArgs != null) {
      if (paramVarArgs.length == 0)
      {
        localObject2 = localObject1;
      }
      else
      {
        localObject2 = new ArrayList();
        int i = paramVarArgs.length;
        for (int j = 0; j < i; j++)
        {
          String str = paramVarArgs[j];
          if (str != null) {
            ((List)localObject2).add(str.replace("-", "").toLowerCase(Locale.US));
          }
        }
        Collections.sort((List)localObject2);
        paramVarArgs = new StringBuilder();
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext()) {
          paramVarArgs.append((String)((Iterator)localObject2).next());
        }
        paramVarArgs = paramVarArgs.toString();
        localObject2 = localObject1;
        if (paramVarArgs.length() > 0) {
          localObject2 = A(paramVarArgs);
        }
      }
    }
    return (String)localObject2;
  }
  
  public static ActivityManager.RunningAppProcessInfo i(String paramString, Context paramContext)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (paramContext != null)
    {
      Iterator localIterator = paramContext.iterator();
      while (localIterator.hasNext())
      {
        paramContext = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        if (processName.equals(paramString)) {
          return paramContext;
        }
      }
    }
    paramString = null;
    return paramString;
  }
  
  public static boolean j(Context paramContext, String paramString, boolean paramBoolean)
  {
    if (paramContext != null)
    {
      Resources localResources = paramContext.getResources();
      if (localResources != null)
      {
        int i = q(paramContext, paramString, "bool");
        if (i > 0) {
          return localResources.getBoolean(i);
        }
        i = q(paramContext, paramString, "string");
        if (i > 0) {
          return Boolean.parseBoolean(paramContext.getString(i));
        }
      }
    }
    return paramBoolean;
  }
  
  public static List k(Context paramContext)
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    int j = q(paramContext, "com.google.firebase.crashlytics.build_ids_lib", "array");
    int k = q(paramContext, "com.google.firebase.crashlytics.build_ids_arch", "array");
    int m = q(paramContext, "com.google.firebase.crashlytics.build_ids_build_id", "array");
    if ((j != 0) && (k != 0) && (m != 0))
    {
      String[] arrayOfString1 = paramContext.getResources().getStringArray(j);
      String[] arrayOfString2 = paramContext.getResources().getStringArray(k);
      paramContext = paramContext.getResources().getStringArray(m);
      if ((arrayOfString1.length == paramContext.length) && (arrayOfString2.length == paramContext.length))
      {
        while (i < paramContext.length)
        {
          localArrayList.add(new f(arrayOfString1[i], arrayOfString2[i], paramContext[i]));
          i++;
        }
        return localArrayList;
      }
      E3.f.f().b(String.format("Lengths did not match: %d %d %d", new Object[] { Integer.valueOf(arrayOfString1.length), Integer.valueOf(arrayOfString2.length), Integer.valueOf(paramContext.length) }));
      return localArrayList;
    }
    E3.f.f().b(String.format("Could not find resources: %d %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) }));
    return localArrayList;
  }
  
  public static int l()
  {
    return a.c().ordinal();
  }
  
  public static int m()
  {
    boolean bool1 = x();
    boolean bool2 = bool1;
    int j;
    if (y()) {
      j = bool1 | true;
    }
    bool1 = j;
    int i;
    if (w()) {
      i = j | 0x4;
    }
    return i;
  }
  
  public static String n(Context paramContext)
  {
    int i = q(paramContext, "com.google.firebase.crashlytics.mapping_file_id", "string");
    int j = i;
    if (i == 0) {
      j = q(paramContext, "com.crashlytics.android.build_id", "string");
    }
    if (j != 0) {
      paramContext = paramContext.getResources().getString(j);
    } else {
      paramContext = null;
    }
    return paramContext;
  }
  
  public static boolean o(Context paramContext)
  {
    boolean bool1 = x();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (((SensorManager)paramContext.getSystemService("sensor")).getDefaultSensor(8) != null) {
      bool2 = true;
    }
    return bool2;
  }
  
  public static String p(Context paramContext)
  {
    int i = getApplicationContextgetApplicationInfoicon;
    if (i > 0) {}
    try
    {
      String str1 = paramContext.getResources().getResourcePackageName(i);
      str2 = str1;
      if (!"android".equals(str1)) {
        break label49;
      }
      str2 = paramContext.getPackageName();
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      String str2;
      label49:
      for (;;) {}
    }
    str2 = paramContext.getPackageName();
    return str2;
  }
  
  public static int q(Context paramContext, String paramString1, String paramString2)
  {
    return paramContext.getResources().getIdentifier(paramString1, paramString2, p(paramContext));
  }
  
  public static SharedPreferences r(Context paramContext)
  {
    return paramContext.getSharedPreferences("com.google.firebase.crashlytics", 0);
  }
  
  public static String s(String paramString1, String paramString2)
  {
    return t(paramString1.getBytes(), paramString2);
  }
  
  public static String t(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      localObject = MessageDigest.getInstance(paramString);
      ((MessageDigest)localObject).update(paramArrayOfByte);
      return u(((MessageDigest)localObject).digest());
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      E3.f localf = E3.f.f();
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Could not create hashing algorithm: ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(", returning empty string.");
      localf.e(((StringBuilder)localObject).toString(), paramArrayOfByte);
    }
    return "";
  }
  
  public static String u(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar1 = new char[paramArrayOfByte.length * 2];
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = paramArrayOfByte[i];
      int k = i * 2;
      char[] arrayOfChar2 = a;
      arrayOfChar1[k] = ((char)arrayOfChar2[((j & 0xFF) >>> 4)]);
      arrayOfChar1[(k + 1)] = ((char)arrayOfChar2[(j & 0xF)]);
    }
    return new String(arrayOfChar1);
  }
  
  public static boolean v(Context paramContext)
  {
    boolean bool;
    if ((getApplicationInfoflags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean w()
  {
    boolean bool;
    if ((!Debug.isDebuggerConnected()) && (!Debug.waitingForDebugger())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean x()
  {
    if (!Build.PRODUCT.contains("sdk"))
    {
      String str = Build.HARDWARE;
      if ((!str.contains("goldfish")) && (!str.contains("ranchu"))) {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public static boolean y()
  {
    boolean bool = x();
    Object localObject = Build.TAGS;
    if ((!bool) && (localObject != null) && (((String)localObject).contains("test-keys"))) {
      return true;
    }
    if (new File("/system/app/Superuser.apk").exists()) {
      return true;
    }
    localObject = new File("/system/xbin/su");
    return (!bool) && (((File)localObject).exists());
  }
  
  public static boolean z(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      boolean bool;
      if (paramString2 == null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    return paramString1.equals(paramString2);
  }
  
  public static enum a
  {
    public static final Map y;
    
    static
    {
      a locala1 = new a("X86_32", 0);
      o = locala1;
      a locala2 = new a("X86_64", 1);
      p = locala2;
      a locala3 = new a("ARM_UNKNOWN", 2);
      q = locala3;
      a locala4 = new a("PPC", 3);
      r = locala4;
      Object localObject = new a("PPC64", 4);
      s = (a)localObject;
      a locala5 = new a("ARMV6", 5);
      t = locala5;
      a locala6 = new a("ARMV7", 6);
      u = locala6;
      a locala7 = new a("UNKNOWN", 7);
      v = locala7;
      a locala8 = new a("ARMV7S", 8);
      w = locala8;
      a locala9 = new a("ARM64", 9);
      x = locala9;
      z = new a[] { locala1, locala2, locala3, locala4, localObject, locala5, locala6, locala7, locala8, locala9 };
      localObject = new HashMap(4);
      y = (Map)localObject;
      ((Map)localObject).put("armeabi-v7a", locala6);
      ((Map)localObject).put("armeabi", locala5);
      ((Map)localObject).put("arm64-v8a", locala9);
      ((Map)localObject).put("x86", locala1);
    }
    
    public static a c()
    {
      Object localObject = Build.CPU_ABI;
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        E3.f.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
        return v;
      }
      localObject = ((String)localObject).toLowerCase(Locale.US);
      a locala = (a)y.get(localObject);
      localObject = locala;
      if (locala == null) {
        localObject = v;
      }
      return (a)localObject;
    }
  }
}

/* Location:
 * Qualified Name:     H3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */