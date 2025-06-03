package x;

import android.graphics.Typeface;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class f
  extends l
{
  public static Class<?> a;
  public static Constructor<?> b;
  public static Method c;
  public static Method d;
  public static boolean e = false;
  
  public static boolean g(Object paramObject, String paramString, int paramInt, boolean paramBoolean)
  {
    
    try
    {
      paramBoolean = ((Boolean)c.invoke(paramObject, new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).booleanValue();
      return paramBoolean;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  public static void h()
  {
    if (e) {
      return;
    }
    e = true;
    Object localObject1 = null;
    try
    {
      localObject2 = Class.forName("android.graphics.FontFamily");
      localConstructor1 = ((Class)localObject2).getConstructor(new Class[0]);
      localObject3 = ((Class)localObject2).getMethod("addFontWeightStyle", new Class[] { String.class, Integer.TYPE, Boolean.TYPE });
      Method localMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance((Class)localObject2, 1).getClass() });
      localObject1 = localConstructor1;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Log.e("TypefaceCompatApi21Impl", localClassNotFoundException.getClass().getName(), localClassNotFoundException);
    Constructor localConstructor1 = null;
    Constructor localConstructor2 = localConstructor1;
    Object localObject3 = localConstructor2;
    Object localObject2 = localConstructor2;
    localConstructor2 = localConstructor1;
    b = (Constructor)localObject1;
    a = (Class)localObject2;
    c = (Method)localObject3;
    d = localConstructor2;
  }
  
  /* Error */
  public Typeface a(android.content.Context paramContext, w.d.c paramc, android.content.res.Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 30	x/f:h	()V
    //   3: getstatic 117	x/f:b	Ljava/lang/reflect/Constructor;
    //   6: iconst_0
    //   7: anewarray 34	java/lang/Object
    //   10: invokevirtual 129	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   13: astore 5
    //   15: aload_2
    //   16: getfield 134	w/d$c:a	[Lw/d$d;
    //   19: astore 6
    //   21: aload 6
    //   23: arraylength
    //   24: istore 7
    //   26: iconst_0
    //   27: istore 4
    //   29: iload 4
    //   31: iload 7
    //   33: if_icmpge +100 -> 133
    //   36: aload 6
    //   38: iload 4
    //   40: aaload
    //   41: astore 8
    //   43: aload_1
    //   44: invokestatic 139	x/m:d	(Landroid/content/Context;)Ljava/io/File;
    //   47: astore_2
    //   48: aload_2
    //   49: ifnonnull +5 -> 54
    //   52: aconst_null
    //   53: areturn
    //   54: aload_2
    //   55: aload_3
    //   56: aload 8
    //   58: getfield 145	w/d$d:f	I
    //   61: invokestatic 148	x/m:b	(Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   64: istore 9
    //   66: iload 9
    //   68: ifne +10 -> 78
    //   71: aload_2
    //   72: invokevirtual 153	java/io/File:delete	()Z
    //   75: pop
    //   76: aconst_null
    //   77: areturn
    //   78: aload 5
    //   80: aload_2
    //   81: invokevirtual 156	java/io/File:getPath	()Ljava/lang/String;
    //   84: aload 8
    //   86: getfield 158	w/d$d:b	I
    //   89: aload 8
    //   91: getfield 160	w/d$d:c	Z
    //   94: invokestatic 162	x/f:g	(Ljava/lang/Object;Ljava/lang/String;IZ)Z
    //   97: istore 9
    //   99: aload_2
    //   100: invokevirtual 153	java/io/File:delete	()Z
    //   103: pop
    //   104: iload 9
    //   106: ifne +5 -> 111
    //   109: aconst_null
    //   110: areturn
    //   111: iinc 4 1
    //   114: goto -85 -> 29
    //   117: astore_1
    //   118: aload_2
    //   119: invokevirtual 153	java/io/File:delete	()Z
    //   122: pop
    //   123: aload_1
    //   124: athrow
    //   125: astore_1
    //   126: aload_2
    //   127: invokevirtual 153	java/io/File:delete	()Z
    //   130: pop
    //   131: aconst_null
    //   132: areturn
    //   133: invokestatic 30	x/f:h	()V
    //   136: getstatic 119	x/f:a	Ljava/lang/Class;
    //   139: iconst_1
    //   140: invokestatic 100	java/lang/reflect/Array:newInstance	(Ljava/lang/Class;I)Ljava/lang/Object;
    //   143: astore_1
    //   144: aload_1
    //   145: iconst_0
    //   146: aload 5
    //   148: invokestatic 166	java/lang/reflect/Array:set	(Ljava/lang/Object;ILjava/lang/Object;)V
    //   151: getstatic 121	x/f:d	Ljava/lang/reflect/Method;
    //   154: aconst_null
    //   155: iconst_1
    //   156: anewarray 34	java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: aload_1
    //   162: aastore
    //   163: invokevirtual 51	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   166: checkcast 92	android/graphics/Typeface
    //   169: astore_1
    //   170: aload_1
    //   171: areturn
    //   172: astore_1
    //   173: goto +4 -> 177
    //   176: astore_1
    //   177: new 57	java/lang/RuntimeException
    //   180: dup
    //   181: aload_1
    //   182: invokespecial 60	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   185: athrow
    //   186: astore_1
    //   187: goto +8 -> 195
    //   190: astore_1
    //   191: goto +4 -> 195
    //   194: astore_1
    //   195: new 57	java/lang/RuntimeException
    //   198: dup
    //   199: aload_1
    //   200: invokespecial 60	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   203: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	this	f
    //   0	204	1	paramContext	android.content.Context
    //   0	204	2	paramc	w.d.c
    //   0	204	3	paramResources	android.content.res.Resources
    //   0	204	4	paramInt	int
    //   13	134	5	localObject	Object
    //   19	18	6	arrayOfd	w.d.d[]
    //   24	10	7	i	int
    //   41	49	8	locald	w.d.d
    //   64	41	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   54	66	117	finally
    //   78	99	117	finally
    //   54	66	125	java/lang/RuntimeException
    //   78	99	125	java/lang/RuntimeException
    //   136	170	172	java/lang/reflect/InvocationTargetException
    //   136	170	176	java/lang/IllegalAccessException
    //   3	15	186	java/lang/reflect/InvocationTargetException
    //   3	15	190	java/lang/InstantiationException
    //   3	15	194	java/lang/IllegalAccessException
  }
  
  /* Error */
  public Typeface b(android.content.Context paramContext, b0.n[] paramArrayOfn, int paramInt)
  {
    // Byte code:
    //   0: aload_2
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: iload_3
    //   10: aload_2
    //   11: invokevirtual 174	x/l:f	(I[Lb0/n;)Lb0/n;
    //   14: astore_2
    //   15: aload_1
    //   16: invokevirtual 180	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   19: astore 4
    //   21: aload 4
    //   23: aload_2
    //   24: getfield 185	b0/n:a	Landroid/net/Uri;
    //   27: ldc -69
    //   29: aconst_null
    //   30: invokevirtual 193	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   33: astore 4
    //   35: aload 4
    //   37: ifnonnull +15 -> 52
    //   40: aload 4
    //   42: ifnull +8 -> 50
    //   45: aload 4
    //   47: invokevirtual 198	android/os/ParcelFileDescriptor:close	()V
    //   50: aconst_null
    //   51: areturn
    //   52: new 200	java/lang/StringBuilder
    //   55: astore_2
    //   56: aload_2
    //   57: invokespecial 201	java/lang/StringBuilder:<init>	()V
    //   60: aload_2
    //   61: ldc -53
    //   63: invokevirtual 207	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: aload_2
    //   68: aload 4
    //   70: invokevirtual 211	android/os/ParcelFileDescriptor:getFd	()I
    //   73: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: aload_2
    //   78: invokevirtual 217	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: invokestatic 223	android/system/Os:readlink	(Ljava/lang/String;)Ljava/lang/String;
    //   84: astore 5
    //   86: aload 5
    //   88: invokestatic 227	android/system/Os:stat	(Ljava/lang/String;)Landroid/system/StructStat;
    //   91: getfield 232	android/system/StructStat:st_mode	I
    //   94: invokestatic 238	android/system/OsConstants:S_ISREG	(I)Z
    //   97: ifeq +20 -> 117
    //   100: new 150	java/io/File
    //   103: astore_2
    //   104: aload_2
    //   105: aload 5
    //   107: invokespecial 241	java/io/File:<init>	(Ljava/lang/String;)V
    //   110: goto +9 -> 119
    //   113: astore_1
    //   114: goto +78 -> 192
    //   117: aconst_null
    //   118: astore_2
    //   119: aload_2
    //   120: ifnull +25 -> 145
    //   123: aload_2
    //   124: invokevirtual 244	java/io/File:canRead	()Z
    //   127: ifne +6 -> 133
    //   130: goto +15 -> 145
    //   133: aload_2
    //   134: invokestatic 248	android/graphics/Typeface:createFromFile	(Ljava/io/File;)Landroid/graphics/Typeface;
    //   137: astore_1
    //   138: aload 4
    //   140: invokevirtual 198	android/os/ParcelFileDescriptor:close	()V
    //   143: aload_1
    //   144: areturn
    //   145: new 250	java/io/FileInputStream
    //   148: astore_2
    //   149: aload_2
    //   150: aload 4
    //   152: invokevirtual 254	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   155: invokespecial 257	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   158: aload_0
    //   159: aload_1
    //   160: aload_2
    //   161: invokevirtual 260	x/l:c	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   164: astore_1
    //   165: aload_2
    //   166: invokevirtual 261	java/io/FileInputStream:close	()V
    //   169: aload 4
    //   171: invokevirtual 198	android/os/ParcelFileDescriptor:close	()V
    //   174: aload_1
    //   175: areturn
    //   176: astore_1
    //   177: aload_2
    //   178: invokevirtual 261	java/io/FileInputStream:close	()V
    //   181: goto +9 -> 190
    //   184: astore_2
    //   185: aload_1
    //   186: aload_2
    //   187: invokevirtual 266	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   190: aload_1
    //   191: athrow
    //   192: aload 4
    //   194: invokevirtual 198	android/os/ParcelFileDescriptor:close	()V
    //   197: goto +9 -> 206
    //   200: astore_2
    //   201: aload_1
    //   202: aload_2
    //   203: invokevirtual 266	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   206: aload_1
    //   207: athrow
    //   208: astore_1
    //   209: aconst_null
    //   210: areturn
    //   211: astore_2
    //   212: goto -95 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	this	f
    //   0	215	1	paramContext	android.content.Context
    //   0	215	2	paramArrayOfn	b0.n[]
    //   0	215	3	paramInt	int
    //   19	174	4	localObject	Object
    //   84	22	5	str	String
    // Exception table:
    //   from	to	target	type
    //   52	110	113	finally
    //   123	130	113	finally
    //   133	138	113	finally
    //   145	158	113	finally
    //   165	169	113	finally
    //   185	190	113	finally
    //   190	192	113	finally
    //   158	165	176	finally
    //   177	181	184	finally
    //   192	197	200	finally
    //   21	35	208	java/io/IOException
    //   45	50	208	java/io/IOException
    //   138	143	208	java/io/IOException
    //   169	174	208	java/io/IOException
    //   201	206	208	java/io/IOException
    //   206	208	208	java/io/IOException
    //   52	110	211	android/system/ErrnoException
  }
}

/* Location:
 * Qualified Name:     x.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */