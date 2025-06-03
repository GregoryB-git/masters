package d2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.i;
import e7.b1;
import e7.j2;
import e7.k3;
import e7.k4;
import e7.l1;
import e7.o1;
import e7.r6;
import java.io.File;
import java.util.List;
import java.util.Map;
import l6.n;
import m6.m;
import ma.h;
import org.json.JSONException;
import org.json.JSONObject;
import p8.e;

public final class h0
  implements c5.c, n, k4, OnSuccessListener, i9.d
{
  public Object b;
  
  public h0(int paramInt)
  {
    b = h.b;
  }
  
  public h0(TaskCompletionSource paramTaskCompletionSource) {}
  
  public h0(e parame)
  {
    b = new File(c, "com.crashlytics.settings.json");
  }
  
  public final long a(long paramLong)
  {
    return 0L;
  }
  
  public final void accept(Object paramObject1, Object paramObject2)
  {
    Object localObject = (o6.d)paramObject1;
    paramObject1 = (TaskCompletionSource)paramObject2;
    paramObject2 = o6.c.a;
    paramObject2 = (o6.a)((com.google.android.gms.common.internal.a)localObject).getService();
    localObject = (m)b;
    Parcel localParcel = ((zaa)paramObject2).zaa();
    zac.zac(localParcel, (Parcelable)localObject);
    ((zaa)paramObject2).zad(1, localParcel);
    ((TaskCompletionSource)paramObject1).setResult(null);
  }
  
  public final long b(long paramLong1, long paramLong2)
  {
    return paramLong2;
  }
  
  public final void c(String paramString, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, Map paramMap)
  {
    paramString = (j2)b;
    int i;
    if (((paramInt == 200) || (paramInt == 204) || (paramInt == 304)) && (paramThrowable == null)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      zzjr.d("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(paramInt), paramThrowable);
    }
    else
    {
      jD.a(true);
      if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0))
      {
        paramThrowable = new String(paramArrayOfByte);
        try
        {
          Object localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>(paramThrowable);
          paramThrowable = ((JSONObject)localObject1).optString("deeplink", "");
          if (TextUtils.isEmpty(paramThrowable))
          {
            zzjv.b("Deferred Deep Link is empty.");
          }
          else
          {
            paramMap = ((JSONObject)localObject1).optString("gclid", "");
            String str = ((JSONObject)localObject1).optString("gbraid", "");
            paramArrayOfByte = ((JSONObject)localObject1).optString("gad_source", "");
            double d = ((JSONObject)localObject1).optDouble("timestamp", 0.0D);
            localObject1 = new android/os/Bundle;
            ((Bundle)localObject1).<init>();
            Object localObject2 = paramString.m();
            if (!TextUtils.isEmpty(paramThrowable))
            {
              PackageManager localPackageManager = ((q)localObject2).zza().getPackageManager();
              localObject2 = new android/content/Intent;
              ((Intent)localObject2).<init>("android.intent.action.VIEW", Uri.parse(paramThrowable));
              i = 0;
              localObject2 = localPackageManager.queryIntentActivities((Intent)localObject2, 0);
              paramInt = i;
              if (localObject2 != null)
              {
                paramInt = i;
                if (!((List)localObject2).isEmpty()) {
                  paramInt = 1;
                }
              }
            }
            else
            {
              paramInt = 0;
            }
            if (paramInt == 0)
            {
              zzjr.a(paramMap, str, paramThrowable, "Deferred Deep Link validation failed. gclid, gbraid, deep link");
            }
            else
            {
              if (!TextUtils.isEmpty(str)) {
                ((BaseBundle)localObject1).putString("gbraid", str);
              }
              if (!TextUtils.isEmpty(paramArrayOfByte)) {
                ((BaseBundle)localObject1).putString("gad_source", paramArrayOfByte);
              }
              ((BaseBundle)localObject1).putString("gclid", paramMap);
              ((BaseBundle)localObject1).putString("_cis", "ddp");
              x.Q("auto", "_cmp", (Bundle)localObject1);
              paramArrayOfByte = paramString.m();
              if ((!TextUtils.isEmpty(paramThrowable)) && (paramArrayOfByte.U(paramThrowable, d)))
              {
                paramThrowable = new android/content/Intent;
                paramThrowable.<init>("android.google.analytics.action.DEEPLINK_ACTION");
                paramArrayOfByte.zza().sendBroadcast(paramThrowable);
              }
            }
          }
        }
        catch (JSONException paramThrowable)
        {
          zzjo.c("Failed to parse the Deferred Deep Link response. exception", paramThrowable);
        }
      }
      zzjv.b("Deferred Deep Link response empty.");
    }
  }
  
  public final long d(long paramLong1, long paramLong2)
  {
    return 0L;
  }
  
  public final long e(long paramLong1, long paramLong2)
  {
    return -9223372036854775807L;
  }
  
  public final i f(long paramLong)
  {
    return (i)b;
  }
  
  public final long g(long paramLong1, long paramLong2)
  {
    return 0L;
  }
  
  public final boolean h()
  {
    return true;
  }
  
  public final long i()
  {
    return 0L;
  }
  
  public final long j(long paramLong)
  {
    return 1L;
  }
  
  public final long k(long paramLong1, long paramLong2)
  {
    return 1L;
  }
  
  /* Error */
  public final JSONObject l()
  {
    // Byte code:
    //   0: ldc_w 295
    //   3: iconst_3
    //   4: invokestatic 301	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   7: istore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: aconst_null
    //   11: astore_3
    //   12: aconst_null
    //   13: astore 4
    //   15: iload_1
    //   16: ifeq +14 -> 30
    //   19: ldc_w 295
    //   22: ldc_w 303
    //   25: aconst_null
    //   26: invokestatic 306	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   29: pop
    //   30: aload_0
    //   31: getfield 30	d2/h0:b	Ljava/lang/Object;
    //   34: checkcast 41	java/io/File
    //   37: astore 5
    //   39: aload 5
    //   41: invokevirtual 309	java/io/File:exists	()Z
    //   44: ifeq +58 -> 102
    //   47: new 311	java/io/FileInputStream
    //   50: astore 6
    //   52: aload 6
    //   54: aload 5
    //   56: invokespecial 314	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   59: aload 6
    //   61: astore_3
    //   62: aload 6
    //   64: invokestatic 319	j8/g:j	(Ljava/io/FileInputStream;)Ljava/lang/String;
    //   67: astore 5
    //   69: aload 6
    //   71: astore_3
    //   72: new 146	org/json/JSONObject
    //   75: astore 4
    //   77: aload 6
    //   79: astore_3
    //   80: aload 4
    //   82: aload 5
    //   84: invokespecial 149	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   87: aload 6
    //   89: astore_3
    //   90: aload 4
    //   92: astore 6
    //   94: goto +35 -> 129
    //   97: astore 4
    //   99: goto +50 -> 149
    //   102: ldc_w 295
    //   105: iconst_2
    //   106: invokestatic 301	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   109: ifeq +14 -> 123
    //   112: ldc_w 295
    //   115: ldc_w 321
    //   118: aconst_null
    //   119: invokestatic 323	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   122: pop
    //   123: aconst_null
    //   124: astore 6
    //   126: aload 4
    //   128: astore_3
    //   129: aload_3
    //   130: ldc_w 325
    //   133: invokestatic 328	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   136: goto +39 -> 175
    //   139: astore 6
    //   141: goto +39 -> 180
    //   144: astore 4
    //   146: aconst_null
    //   147: astore 6
    //   149: aload 6
    //   151: astore_3
    //   152: ldc_w 295
    //   155: ldc_w 330
    //   158: aload 4
    //   160: invokestatic 332	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   163: pop
    //   164: aload 6
    //   166: ldc_w 325
    //   169: invokestatic 328	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   172: aload_2
    //   173: astore 6
    //   175: aload 6
    //   177: areturn
    //   178: astore 6
    //   180: aload_3
    //   181: ldc_w 325
    //   184: invokestatic 328	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   187: aload 6
    //   189: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	190	0	this	h0
    //   7	9	1	bool	boolean
    //   9	164	2	localObject1	Object
    //   11	170	3	localObject2	Object
    //   13	78	4	localJSONObject	JSONObject
    //   97	30	4	localException1	Exception
    //   144	15	4	localException2	Exception
    //   37	46	5	localObject3	Object
    //   50	75	6	localObject4	Object
    //   139	1	6	localObject5	Object
    //   147	29	6	localObject6	Object
    //   178	10	6	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   62	69	97	java/lang/Exception
    //   72	77	97	java/lang/Exception
    //   80	87	97	java/lang/Exception
    //   30	59	139	finally
    //   102	123	139	finally
    //   30	59	144	java/lang/Exception
    //   102	123	144	java/lang/Exception
    //   62	69	178	finally
    //   72	77	178	finally
    //   80	87	178	finally
    //   152	164	178	finally
  }
  
  public final void onSuccess(Object paramObject)
  {
    paramObject = (String)paramObject;
    ((TaskCompletionSource)b).setResult(new c8.a1(null, null, (String)paramObject));
  }
  
  public final String toString()
  {
    switch (a)
    {
    default: 
      return super.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('<');
    localStringBuilder.append((String)b);
    localStringBuilder.append('>');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d2.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */