package D0;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import g0.a;
import g0.i;

public class o$b
  extends HandlerThread
  implements Handler.Callback
{
  public i o;
  public Handler p;
  public Error q;
  public RuntimeException r;
  public o s;
  
  public o$b()
  {
    super("ExoPlayer:PlaceholderSurface");
  }
  
  public o a(int paramInt)
  {
    start();
    p = new Handler(getLooper(), this);
    o = new i(p);
    try
    {
      localObject1 = p;
      int i = 0;
      ((Handler)localObject1).obtainMessage(1, paramInt, 0).sendToTarget();
      paramInt = i;
    }
    finally
    {
      for (;;)
      {
        try
        {
          Object localObject1;
          wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          paramInt = 1;
        }
        localObject2 = finally;
        break;
      }
      if (paramInt == 0) {
        break label108;
      }
      Thread.currentThread().interrupt();
      localObject3 = r;
      if (localObject3 != null) {
        break label139;
      }
      localObject3 = q;
      if (localObject3 != null) {
        break label137;
      }
      return (o)a.e(s);
      throw ((Throwable)localObject3);
      throw ((Throwable)localObject3);
    }
    if ((s == null) && (r == null))
    {
      localObject1 = q;
      if (localObject1 != null) {}
    }
  }
  
  public final void b(int paramInt)
  {
    a.e(o);
    o.h(paramInt);
    SurfaceTexture localSurfaceTexture = o.g();
    boolean bool;
    if (paramInt != 0) {
      bool = true;
    } else {
      bool = false;
    }
    s = new o(this, localSurfaceTexture, bool, null);
  }
  
  public void c()
  {
    a.e(p);
    p.sendEmptyMessage(2);
  }
  
  public final void d()
  {
    a.e(o);
    o.i();
  }
  
  /* Error */
  public boolean handleMessage(Message paramMessage)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 119	android/os/Message:what	I
    //   4: istore_2
    //   5: iload_2
    //   6: iconst_1
    //   7: if_icmpeq +44 -> 51
    //   10: iload_2
    //   11: iconst_2
    //   12: if_icmpeq +5 -> 17
    //   15: iconst_1
    //   16: ireturn
    //   17: aload_0
    //   18: invokevirtual 121	D0/o$b:d	()V
    //   21: aload_0
    //   22: invokevirtual 125	android/os/HandlerThread:quit	()Z
    //   25: pop
    //   26: goto +15 -> 41
    //   29: astore_1
    //   30: ldc 127
    //   32: ldc -127
    //   34: aload_1
    //   35: invokestatic 134	g0/o:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   38: goto -17 -> 21
    //   41: iconst_1
    //   42: ireturn
    //   43: astore_1
    //   44: aload_0
    //   45: invokevirtual 125	android/os/HandlerThread:quit	()Z
    //   48: pop
    //   49: aload_1
    //   50: athrow
    //   51: aload_0
    //   52: aload_1
    //   53: getfield 137	android/os/Message:arg1	I
    //   56: invokevirtual 139	D0/o$b:b	(I)V
    //   59: aload_0
    //   60: monitorenter
    //   61: aload_0
    //   62: invokevirtual 142	java/lang/Object:notify	()V
    //   65: aload_0
    //   66: monitorexit
    //   67: goto +112 -> 179
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    //   75: astore_1
    //   76: goto +110 -> 186
    //   79: astore_1
    //   80: goto +11 -> 91
    //   83: astore_3
    //   84: goto +36 -> 120
    //   87: astore_1
    //   88: goto +70 -> 158
    //   91: ldc 127
    //   93: ldc -112
    //   95: aload_1
    //   96: invokestatic 134	g0/o:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   99: aload_0
    //   100: aload_1
    //   101: putfield 69	D0/o$b:q	Ljava/lang/Error;
    //   104: aload_0
    //   105: monitorenter
    //   106: aload_0
    //   107: invokevirtual 142	java/lang/Object:notify	()V
    //   110: aload_0
    //   111: monitorexit
    //   112: goto +67 -> 179
    //   115: astore_1
    //   116: aload_0
    //   117: monitorexit
    //   118: aload_1
    //   119: athrow
    //   120: ldc 127
    //   122: ldc -112
    //   124: aload_3
    //   125: invokestatic 134	g0/o:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   128: new 146	java/lang/IllegalStateException
    //   131: astore_1
    //   132: aload_1
    //   133: aload_3
    //   134: invokespecial 149	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   137: aload_0
    //   138: aload_1
    //   139: putfield 67	D0/o$b:r	Ljava/lang/RuntimeException;
    //   142: aload_0
    //   143: monitorenter
    //   144: aload_0
    //   145: invokevirtual 142	java/lang/Object:notify	()V
    //   148: aload_0
    //   149: monitorexit
    //   150: goto +29 -> 179
    //   153: astore_1
    //   154: aload_0
    //   155: monitorexit
    //   156: aload_1
    //   157: athrow
    //   158: ldc 127
    //   160: ldc -112
    //   162: aload_1
    //   163: invokestatic 134	g0/o:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   166: aload_0
    //   167: aload_1
    //   168: putfield 67	D0/o$b:r	Ljava/lang/RuntimeException;
    //   171: aload_0
    //   172: monitorenter
    //   173: aload_0
    //   174: invokevirtual 142	java/lang/Object:notify	()V
    //   177: aload_0
    //   178: monitorexit
    //   179: iconst_1
    //   180: ireturn
    //   181: astore_1
    //   182: aload_0
    //   183: monitorexit
    //   184: aload_1
    //   185: athrow
    //   186: aload_0
    //   187: monitorenter
    //   188: aload_0
    //   189: invokevirtual 142	java/lang/Object:notify	()V
    //   192: aload_0
    //   193: monitorexit
    //   194: aload_1
    //   195: athrow
    //   196: astore_1
    //   197: aload_0
    //   198: monitorexit
    //   199: aload_1
    //   200: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	201	0	this	b
    //   0	201	1	paramMessage	Message
    //   4	9	2	i	int
    //   83	51	3	locala	g0.j.a
    // Exception table:
    //   from	to	target	type
    //   17	21	29	finally
    //   30	38	43	finally
    //   61	67	70	finally
    //   71	73	70	finally
    //   51	59	75	finally
    //   91	104	75	finally
    //   120	142	75	finally
    //   158	171	75	finally
    //   51	59	79	java/lang/Error
    //   51	59	83	g0/j$a
    //   51	59	87	java/lang/RuntimeException
    //   106	112	115	finally
    //   116	118	115	finally
    //   144	150	153	finally
    //   154	156	153	finally
    //   173	179	181	finally
    //   182	184	181	finally
    //   188	194	196	finally
    //   197	199	196	finally
  }
}

/* Location:
 * Qualified Name:     D0.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */