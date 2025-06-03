package j8;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import m8.f0.e.d.a.b.a;
import m8.o;
import m8.p;
import m8.s.a;
import m8.u;
import m8.u.a;
import r8.f;
import r8.h;
import s8.c;

public final class t
{
  public static final HashMap f;
  public static final String g = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] { "19.4.0" });
  public final Context a;
  public final a0 b;
  public final a c;
  public final c d;
  public final h e;
  
  static
  {
    HashMap localHashMap = new HashMap();
    f = localHashMap;
    g.k(5, localHashMap, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
    localHashMap.put("x86_64", Integer.valueOf(1));
  }
  
  public t(Context paramContext, a0 parama0, a parama, s8.a parama1, f paramf)
  {
    a = paramContext;
    b = parama0;
    c = parama;
    d = parama1;
    e = paramf;
  }
  
  public static p c(z5.j paramj, int paramInt)
  {
    String str1 = (String)b;
    String str2 = a;
    Object localObject = (StackTraceElement[])c;
    int i = 0;
    int j = 0;
    if (localObject == null) {
      localObject = new StackTraceElement[0];
    }
    z5.j localj = (z5.j)d;
    if (paramInt >= 8)
    {
      paramj = localj;
      for (;;)
      {
        i = j;
        if (paramj == null) {
          break;
        }
        paramj = (z5.j)d;
        j++;
      }
    }
    if (str1 != null)
    {
      localObject = d((StackTraceElement[])localObject, 4);
      if (localObject != null)
      {
        j = (byte)(0x0 | 0x1);
        if ((localj != null) && (i == 0)) {
          paramj = c(localj, paramInt + 1);
        } else {
          paramj = null;
        }
        if (j == 1) {
          return new p(str1, str2, (List)localObject, paramj, i);
        }
        paramj = new StringBuilder();
        if ((j & 0x1) == 0) {
          paramj.append(" overflowCount");
        }
        throw new IllegalStateException(a0.j.l("Missing required properties:", paramj));
      }
      throw new NullPointerException("Null frames");
    }
    throw new NullPointerException("Null type");
  }
  
  public static List d(StackTraceElement[] paramArrayOfStackTraceElement, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfStackTraceElement.length;
    int j = 0;
    while (j < i)
    {
      StackTraceElement localStackTraceElement = paramArrayOfStackTraceElement[j];
      s.a locala = new s.a();
      e = paramInt;
      f = ((byte)(byte)(f | 0x4));
      boolean bool = localStackTraceElement.isNativeMethod();
      long l1 = 0L;
      long l2;
      if (bool) {
        l2 = Math.max(localStackTraceElement.getLineNumber(), 0L);
      } else {
        l2 = 0L;
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(localStackTraceElement.getClassName());
      ((StringBuilder)localObject).append(".");
      ((StringBuilder)localObject).append(localStackTraceElement.getMethodName());
      localObject = ((StringBuilder)localObject).toString();
      String str = localStackTraceElement.getFileName();
      long l3 = l1;
      if (!localStackTraceElement.isNativeMethod())
      {
        l3 = l1;
        if (localStackTraceElement.getLineNumber() > 0) {
          l3 = localStackTraceElement.getLineNumber();
        }
      }
      a = l2;
      int k = (byte)(f | 0x1);
      f = ((byte)k);
      if (localObject != null)
      {
        b = ((String)localObject);
        c = str;
        d = l3;
        f = ((byte)(byte)(k | 0x2));
        localArrayList.add(locala.a());
        j++;
      }
      else
      {
        throw new NullPointerException("Null symbol");
      }
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  public final List<f0.e.d.a.b.a> a()
  {
    int i = (byte)((byte)(0x0 | 0x1) | 0x2);
    Object localObject1 = c;
    Object localObject2 = e;
    if (localObject2 != null)
    {
      localObject1 = b;
      if (i == 3) {
        return Collections.singletonList(new o(0L, 0L, (String)localObject2, (String)localObject1));
      }
      localObject2 = new StringBuilder();
      if ((i & 0x1) == 0) {
        ((StringBuilder)localObject2).append(" baseAddress");
      }
      if ((i & 0x2) == 0) {
        ((StringBuilder)localObject2).append(" size");
      }
      throw new IllegalStateException(a0.j.l("Missing required properties:", (StringBuilder)localObject2));
    }
    throw new NullPointerException("Null name");
  }
  
  public final u b(int paramInt)
  {
    Object localObject1 = a;
    Double localDouble = null;
    boolean bool = false;
    try
    {
      localObject4 = new android/content/IntentFilter;
      ((IntentFilter)localObject4).<init>("android.intent.action.BATTERY_CHANGED");
      localObject1 = ((Context)localObject1).registerReceiver(null, (IntentFilter)localObject4);
      if (localObject1 != null)
      {
        i = ((Intent)localObject1).getIntExtra("status", -1);
        if ((i == -1) || ((i != 2) && (i != 5))) {
          i = 0;
        } else {
          i = 1;
        }
        try
        {
          int j = ((Intent)localObject1).getIntExtra("level", -1);
          int k = ((Intent)localObject1).getIntExtra("scale", -1);
          m = i;
          if (j == -1) {
            break label162;
          }
          if (k == -1)
          {
            m = i;
            break label162;
          }
          localObject1 = Float.valueOf(j / k);
        }
        catch (IllegalStateException localIllegalStateException1)
        {
          break label147;
        }
      }
      Object localObject2 = null;
      i = 0;
    }
    catch (IllegalStateException localIllegalStateException2)
    {
      i = 0;
      label147:
      Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", localIllegalStateException2);
      int m = i;
      label162:
      localObject3 = null;
      i = m;
    }
    if (localObject3 != null) {
      localDouble = Double.valueOf(((Float)localObject3).doubleValue());
    }
    if ((i != 0) && (localObject3 != null))
    {
      if (((Float)localObject3).floatValue() < 0.99D) {
        i = 2;
      } else {
        i = 3;
      }
    }
    else {
      i = 1;
    }
    Object localObject3 = a;
    if ((!g.g()) && (((SensorManager)((Context)localObject3).getSystemService("sensor")).getDefaultSensor(8) != null)) {
      bool = true;
    }
    long l1 = g.a(a);
    localObject3 = a;
    Object localObject4 = new ActivityManager.MemoryInfo();
    ((ActivityManager)((Context)localObject3).getSystemService("activity")).getMemoryInfo((ActivityManager.MemoryInfo)localObject4);
    l1 -= availMem;
    if (l1 <= 0L) {
      l1 = 0L;
    }
    localObject3 = new StatFs(Environment.getDataDirectory().getPath());
    long l2 = ((StatFs)localObject3).getBlockSize();
    long l3 = ((StatFs)localObject3).getBlockCount();
    long l4 = ((StatFs)localObject3).getAvailableBlocks();
    localObject3 = new u.a();
    a = localDouble;
    b = i;
    int i = (byte)(g | 0x1);
    c = bool;
    i = (byte)(i | 0x2);
    d = paramInt;
    paramInt = (byte)(i | 0x4);
    e = l1;
    paramInt = (byte)(paramInt | 0x8);
    f = (l3 * l2 - l2 * l4);
    g = ((byte)(byte)(paramInt | 0x10));
    return ((u.a)localObject3).a();
  }
}

/* Location:
 * Qualified Name:     j8.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */