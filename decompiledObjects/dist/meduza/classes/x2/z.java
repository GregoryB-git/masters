package x2;

import a0.j;
import android.os.Build.VERSION;
import ec.i;
import n7.w;
import o2.o.b;

public final class z
{
  /* Error */
  public static final java.util.LinkedHashSet a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 10
    //   3: invokestatic 16	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: new 18	java/util/LinkedHashSet
    //   9: dup
    //   10: invokespecial 22	java/util/LinkedHashSet:<init>	()V
    //   13: astore_1
    //   14: aload_0
    //   15: arraylength
    //   16: istore_2
    //   17: iconst_0
    //   18: istore_3
    //   19: iload_2
    //   20: ifne +8 -> 28
    //   23: iconst_1
    //   24: istore_2
    //   25: goto +5 -> 30
    //   28: iconst_0
    //   29: istore_2
    //   30: iload_2
    //   31: ifeq +5 -> 36
    //   34: aload_1
    //   35: areturn
    //   36: new 24	java/io/ByteArrayInputStream
    //   39: dup
    //   40: aload_0
    //   41: invokespecial 27	java/io/ByteArrayInputStream:<init>	([B)V
    //   44: astore_0
    //   45: new 29	java/io/ObjectInputStream
    //   48: astore 4
    //   50: aload 4
    //   52: aload_0
    //   53: invokespecial 32	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   56: aload 4
    //   58: invokevirtual 36	java/io/ObjectInputStream:readInt	()I
    //   61: istore 5
    //   63: iload_3
    //   64: istore_2
    //   65: iload_2
    //   66: iload 5
    //   68: if_icmpge +56 -> 124
    //   71: aload 4
    //   73: invokevirtual 40	java/io/ObjectInputStream:readUTF	()Ljava/lang/String;
    //   76: invokestatic 46	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   79: astore 6
    //   81: aload 4
    //   83: invokevirtual 50	java/io/ObjectInputStream:readBoolean	()Z
    //   86: istore 7
    //   88: new 52	o2/c$a
    //   91: astore 8
    //   93: aload 6
    //   95: ldc 54
    //   97: invokestatic 57	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   100: aload 8
    //   102: iload 7
    //   104: aload 6
    //   106: invokespecial 60	o2/c$a:<init>	(ZLandroid/net/Uri;)V
    //   109: aload_1
    //   110: aload 8
    //   112: invokeinterface 66 2 0
    //   117: pop
    //   118: iinc 2 1
    //   121: goto -56 -> 65
    //   124: getstatic 71	rb/h:a	Lrb/h;
    //   127: astore 8
    //   129: aload 4
    //   131: aconst_null
    //   132: invokestatic 77	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   135: goto +31 -> 166
    //   138: astore 6
    //   140: aload 6
    //   142: athrow
    //   143: astore 8
    //   145: aload 4
    //   147: aload 6
    //   149: invokestatic 77	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   152: aload 8
    //   154: athrow
    //   155: astore_1
    //   156: goto +22 -> 178
    //   159: astore 4
    //   161: aload 4
    //   163: invokevirtual 82	java/lang/Throwable:printStackTrace	()V
    //   166: getstatic 71	rb/h:a	Lrb/h;
    //   169: astore 4
    //   171: aload_0
    //   172: aconst_null
    //   173: invokestatic 77	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   176: aload_1
    //   177: areturn
    //   178: aload_1
    //   179: athrow
    //   180: astore 4
    //   182: aload_0
    //   183: aload_1
    //   184: invokestatic 77	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   187: aload 4
    //   189: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	190	0	paramArrayOfByte	byte[]
    //   13	97	1	localLinkedHashSet1	java.util.LinkedHashSet
    //   155	29	1	localLinkedHashSet2	java.util.LinkedHashSet
    //   16	103	2	i	int
    //   18	46	3	j	int
    //   48	98	4	localObjectInputStream	java.io.ObjectInputStream
    //   159	3	4	localIOException	java.io.IOException
    //   169	1	4	localh	rb.h
    //   180	8	4	localObject1	Object
    //   61	8	5	k	int
    //   79	26	6	localUri	android.net.Uri
    //   138	10	6	localThrowable	Throwable
    //   86	17	7	bool	boolean
    //   91	37	8	localObject2	Object
    //   143	10	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   56	63	138	finally
    //   71	118	138	finally
    //   124	129	138	finally
    //   140	143	143	finally
    //   45	56	155	finally
    //   129	135	155	finally
    //   145	155	155	finally
    //   161	166	155	finally
    //   166	171	155	finally
    //   45	56	159	java/io/IOException
    //   129	135	159	java/io/IOException
    //   145	155	159	java/io/IOException
    //   178	180	180	finally
  }
  
  public static final int b(int paramInt)
  {
    int i = 1;
    if (paramInt != 0) {
      if (paramInt == 1) {
        i = 2;
      } else {
        throw new IllegalArgumentException(j.h("Could not convert ", paramInt, " to BackoffPolicy"));
      }
    }
    return i;
  }
  
  public static final int c(int paramInt)
  {
    int i = 5;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if ((Build.VERSION.SDK_INT >= 30) && (paramInt == 5)) {
                return 6;
              }
              throw new IllegalArgumentException(j.h("Could not convert ", paramInt, " to NetworkType"));
            }
          }
          else {
            i = 4;
          }
        }
        else {
          i = 3;
        }
      }
      else {
        i = 2;
      }
    }
    else {
      i = 1;
    }
    return i;
  }
  
  public static final int d(int paramInt)
  {
    int i = 1;
    if (paramInt != 0) {
      if (paramInt == 1) {
        i = 2;
      } else {
        throw new IllegalArgumentException(j.h("Could not convert ", paramInt, " to OutOfQuotaPolicy"));
      }
    }
    return i;
  }
  
  public static final o.b e(int paramInt)
  {
    o.b localb;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if (paramInt == 5) {
                localb = o.b.f;
              } else {
                throw new IllegalArgumentException(j.h("Could not convert ", paramInt, " to State"));
              }
            }
            else {
              localb = o.b.e;
            }
          }
          else {
            localb = o.b.d;
          }
        }
        else {
          localb = o.b.c;
        }
      }
      else {
        localb = o.b.b;
      }
    }
    else {
      localb = o.b.a;
    }
    return localb;
  }
  
  public static final int f(o.b paramb)
  {
    i.e(paramb, "state");
    int i = paramb.ordinal();
    int j = 5;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i != 5) {
                throw new w();
              }
            }
            else {
              j = 4;
            }
          }
          else {
            j = 3;
          }
        }
        else {
          j = 2;
        }
      }
      else {
        j = 1;
      }
    }
    else {
      j = 0;
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     x2.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */