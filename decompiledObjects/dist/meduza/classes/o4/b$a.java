package o4;

import android.os.HandlerThread;
import d9.p;

public final class b$a
  implements j.b
{
  public final n7.q<HandlerThread> a;
  public final n7.q<HandlerThread> b;
  
  public b$a(int paramInt)
  {
    a = localp;
    b = localq;
  }
  
  /* Error */
  public final b b(j.a parama)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 40	o4/j$a:a	Lo4/l;
    //   4: getfield 45	o4/l:a	Ljava/lang/String;
    //   7: astore_2
    //   8: aconst_null
    //   9: astore_3
    //   10: new 47	java/lang/StringBuilder
    //   13: astore 4
    //   15: aload 4
    //   17: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   20: aload 4
    //   22: ldc 50
    //   24: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: aload 4
    //   30: aload_2
    //   31: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload 4
    //   37: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 64	p2/m0:i	(Ljava/lang/String;)V
    //   43: aload_2
    //   44: invokestatic 70	android/media/MediaCodec:createByCodecName	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   47: astore_2
    //   48: new 8	o4/b
    //   51: astore 4
    //   53: aload 4
    //   55: aload_2
    //   56: aload_0
    //   57: getfield 26	o4/b$a:a	Ln7/q;
    //   60: invokeinterface 76 1 0
    //   65: checkcast 78	android/os/HandlerThread
    //   68: aload_0
    //   69: getfield 28	o4/b$a:b	Ln7/q;
    //   72: invokeinterface 76 1 0
    //   77: checkcast 78	android/os/HandlerThread
    //   80: iconst_0
    //   81: invokespecial 81	o4/b:<init>	(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;Z)V
    //   84: invokestatic 84	p2/m0:B	()V
    //   87: aload 4
    //   89: aload_1
    //   90: getfield 87	o4/j$a:b	Landroid/media/MediaFormat;
    //   93: aload_1
    //   94: getfield 91	o4/j$a:d	Landroid/view/Surface;
    //   97: aload_1
    //   98: getfield 95	o4/j$a:e	Landroid/media/MediaCrypto;
    //   101: invokestatic 99	o4/b:o	(Lo4/b;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;)V
    //   104: aload 4
    //   106: areturn
    //   107: astore_1
    //   108: aload 4
    //   110: astore_3
    //   111: goto +10 -> 121
    //   114: astore_1
    //   115: goto +6 -> 121
    //   118: astore_1
    //   119: aconst_null
    //   120: astore_2
    //   121: aload_3
    //   122: ifnonnull +14 -> 136
    //   125: aload_2
    //   126: ifnull +14 -> 140
    //   129: aload_2
    //   130: invokevirtual 102	android/media/MediaCodec:release	()V
    //   133: goto +7 -> 140
    //   136: aload_3
    //   137: invokevirtual 103	o4/b:release	()V
    //   140: aload_1
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	a
    //   0	142	1	parama	j.a
    //   7	123	2	localObject1	Object
    //   9	128	3	localObject2	Object
    //   13	96	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   84	104	107	java/lang/Exception
    //   48	84	114	java/lang/Exception
    //   10	48	118	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     o4.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */