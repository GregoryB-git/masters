package nc;

import android.content.ContentValues;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zznu;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpl;
import e7.h0;
import e7.l0;
import java.util.List;
import q1.a;
import u1.c;

public final class g0
  implements a, l0
{
  public static g0 b;
  
  public static final String b(Object paramObject)
  {
    return Integer.toHexString(System.identityHashCode(paramObject));
  }
  
  /* Error */
  public static final String c(ub.e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: instanceof 37
    //   4: ifeq +11 -> 15
    //   7: aload_0
    //   8: invokevirtual 41	java/lang/Object:toString	()Ljava/lang/String;
    //   11: astore_0
    //   12: goto +103 -> 115
    //   15: new 43	java/lang/StringBuilder
    //   18: astore_1
    //   19: aload_1
    //   20: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   23: aload_1
    //   24: aload_0
    //   25: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   28: pop
    //   29: aload_1
    //   30: bipush 64
    //   32: invokevirtual 51	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_1
    //   37: aload_0
    //   38: invokestatic 53	nc/g0:b	(Ljava/lang/Object;)Ljava/lang/String;
    //   41: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload_1
    //   46: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: astore_1
    //   50: goto +9 -> 59
    //   53: astore_1
    //   54: aload_1
    //   55: invokestatic 62	rb/f:a	(Ljava/lang/Throwable;)Lrb/e$a;
    //   58: astore_1
    //   59: aload_1
    //   60: invokestatic 67	rb/e:a	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   63: ifnonnull +6 -> 69
    //   66: goto +44 -> 110
    //   69: new 43	java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   76: astore_1
    //   77: aload_1
    //   78: aload_0
    //   79: invokevirtual 71	java/lang/Object:getClass	()Ljava/lang/Class;
    //   82: invokevirtual 76	java/lang/Class:getName	()Ljava/lang/String;
    //   85: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload_1
    //   90: bipush 64
    //   92: invokevirtual 51	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: aload_1
    //   97: aload_0
    //   98: invokestatic 53	nc/g0:b	(Ljava/lang/Object;)Ljava/lang/String;
    //   101: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload_1
    //   106: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   109: astore_1
    //   110: aload_1
    //   111: checkcast 78	java/lang/String
    //   114: astore_0
    //   115: aload_0
    //   116: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	parame	ub.e
    //   18	32	1	localObject1	Object
    //   53	2	1	localThrowable	Throwable
    //   58	53	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   15	50	53	finally
  }
  
  public static boolean d()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  public final void a(c paramc)
  {
    paramc.m("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
    paramc.H("WorkSpec", 3, localContentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
  }
  
  public final Object zza()
  {
    switch (a)
    {
    default: 
      break;
    case 14: 
      localList = h0.a;
      return Integer.valueOf((int)zznu.zzax());
    case 13: 
      localList = h0.a;
      return Integer.valueOf((int)zznu.zzu());
    case 12: 
      localList = h0.a;
      return Integer.valueOf((int)zznu.zzag());
    case 11: 
      localList = h0.a;
      return zznu.zzbb();
    case 10: 
      localList = h0.a;
      return Long.valueOf(zznu.zzaj());
    case 9: 
      localList = h0.a;
      return Long.valueOf(zzot.zzd());
    case 8: 
      localList = h0.a;
      return Long.valueOf(zznu.zzg());
    case 7: 
      localList = h0.a;
      return Long.valueOf(zznu.zzr());
    case 6: 
      localList = h0.a;
      return Long.valueOf(zznu.zzaa());
    case 5: 
      localList = h0.a;
      return zznu.zzbg();
    case 4: 
      localList = h0.a;
      return Integer.valueOf((int)zznu.zzar());
    case 3: 
      localList = h0.a;
      return Boolean.valueOf(zzoy.zzj());
    }
    List localList = h0.a;
    return Boolean.valueOf(zzpl.zzf());
  }
}

/* Location:
 * Qualified Name:     nc.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */