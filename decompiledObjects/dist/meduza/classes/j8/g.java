package j8;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Scanner;

public final class g
{
  public static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  
  public static long a(Context paramContext)
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
  
  public static void b(Closeable paramCloseable, String paramString)
  {
    if (paramCloseable != null) {
      try
      {
        paramCloseable.close();
      }
      catch (IOException paramCloseable)
      {
        Log.e("FirebaseCrashlytics", paramString, paramCloseable);
      }
    }
  }
  
  public static int c()
  {
    boolean bool1 = g();
    boolean bool2 = bool1;
    int i;
    if (h()) {
      i = bool1 | true;
    }
    if ((!Debug.isDebuggerConnected()) && (!Debug.waitingForDebugger())) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    int j = i;
    if (bool1) {
      j = i | 0x4;
    }
    return j;
  }
  
  public static String d(Context paramContext)
  {
    int i = e(paramContext, "com.google.firebase.crashlytics.mapping_file_id", "string");
    int j = i;
    if (i == 0) {
      j = e(paramContext, "com.crashlytics.android.build_id", "string");
    }
    if (j != 0) {
      paramContext = paramContext.getResources().getString(j);
    } else {
      paramContext = null;
    }
    return paramContext;
  }
  
  public static int e(Context paramContext, String paramString1, String paramString2)
  {
    Resources localResources = paramContext.getResources();
    int i = getApplicationContextgetApplicationInfoicon;
    if (i > 0) {}
    try
    {
      String str1 = paramContext.getResources().getResourcePackageName(i);
      str2 = str1;
      if (!"android".equals(str1)) {
        break label62;
      }
      str2 = paramContext.getPackageName();
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      String str2;
      for (;;) {}
    }
    str2 = paramContext.getPackageName();
    label62:
    return localResources.getIdentifier(paramString1, paramString2, str2);
  }
  
  public static String f(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar1 = new char[paramArrayOfByte.length * 2];
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      int k = i * 2;
      char[] arrayOfChar2 = a;
      arrayOfChar1[k] = ((char)arrayOfChar2[(j >>> 4)]);
      arrayOfChar1[(k + 1)] = ((char)arrayOfChar2[(j & 0xF)]);
    }
    return new String(arrayOfChar1);
  }
  
  public static boolean g()
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
  
  public static boolean h()
  {
    boolean bool = g();
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
  
  public static String i(String paramString)
  {
    paramString = paramString.getBytes();
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      localMessageDigest.update(paramString);
      paramString = f(localMessageDigest.digest());
    }
    catch (NoSuchAlgorithmException paramString)
    {
      Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", paramString);
      paramString = "";
    }
    return paramString;
  }
  
  public static String j(FileInputStream paramFileInputStream)
  {
    paramFileInputStream = new Scanner(paramFileInputStream).useDelimiter("\\A");
    if (paramFileInputStream.hasNext()) {
      paramFileInputStream = paramFileInputStream.next();
    } else {
      paramFileInputStream = "";
    }
    return paramFileInputStream;
  }
  
  public static enum a
  {
    public static final HashMap b;
    
    static
    {
      a locala1 = new a("X86_32", 0);
      a locala2 = new a("X86_64", 1);
      a locala3 = new a("ARM_UNKNOWN", 2);
      a locala4 = new a("PPC", 3);
      a locala5 = new a("PPC64", 4);
      a locala6 = new a("ARMV6", 5);
      a locala7 = new a("ARMV7", 6);
      Object localObject = new a("UNKNOWN", 7);
      a = (a)localObject;
      a locala8 = new a("ARMV7S", 8);
      a locala9 = new a("ARM64", 9);
      c = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7, localObject, locala8, locala9 };
      localObject = new HashMap(4);
      b = (HashMap)localObject;
      ((HashMap)localObject).put("armeabi-v7a", locala7);
      ((HashMap)localObject).put("armeabi", locala6);
      ((HashMap)localObject).put("arm64-v8a", locala9);
      ((HashMap)localObject).put("x86", locala1);
    }
    
    public a() {}
  }
}

/* Location:
 * Qualified Name:     j8.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */