package x;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import b0.n;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import r.h;

public final class g
  extends l
{
  public static final Class<?> a;
  public static final Constructor<?> b;
  public static final Method c;
  public static final Method d;
  
  static
  {
    Object localObject1 = null;
    try
    {
      localClass1 = Class.forName("android.graphics.FontFamily");
      Constructor localConstructor = localClass1.getConstructor(new Class[0]);
      Object localObject2 = Integer.TYPE;
      localObject3 = localClass1.getMethod("addFontWeightStyle", new Class[] { ByteBuffer.class, localObject2, List.class, localObject2, Boolean.TYPE });
      localObject2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(localClass1, 1).getClass() });
      localObject1 = localConstructor;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Log.e("TypefaceCompatApi24Impl", localClassNotFoundException.getClass().getName(), localClassNotFoundException);
    Class localClass1 = null;
    Class localClass2 = localClass1;
    Object localObject3 = localClass2;
    b = (Constructor)localObject1;
    a = localClass1;
    c = (Method)localObject3;
    d = localClass2;
  }
  
  public static boolean g(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      paramBoolean = ((Boolean)c.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) })).booleanValue();
      return paramBoolean;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return false;
  }
  
  /* Error */
  public final Typeface a(Context paramContext, w.d.c paramc, android.content.res.Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: getstatic 79	x/g:b	Ljava/lang/reflect/Constructor;
    //   6: iconst_0
    //   7: anewarray 61	java/lang/Object
    //   10: invokevirtual 122	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   13: astore 6
    //   15: goto +8 -> 23
    //   18: astore 6
    //   20: aconst_null
    //   21: astore 6
    //   23: aload 6
    //   25: ifnonnull +5 -> 30
    //   28: aconst_null
    //   29: areturn
    //   30: aload_2
    //   31: getfield 127	w/d$c:a	[Lw/d$d;
    //   34: astore 7
    //   36: aload 7
    //   38: arraylength
    //   39: istore 8
    //   41: iconst_0
    //   42: istore 4
    //   44: iload 4
    //   46: iload 8
    //   48: if_icmpge +175 -> 223
    //   51: aload 7
    //   53: iload 4
    //   55: aaload
    //   56: astore 9
    //   58: aload 9
    //   60: getfield 133	w/d$d:f	I
    //   63: istore 10
    //   65: aload_1
    //   66: invokestatic 138	x/m:d	(Landroid/content/Context;)Ljava/io/File;
    //   69: astore 11
    //   71: aload 11
    //   73: ifnonnull +6 -> 79
    //   76: goto +24 -> 100
    //   79: aload 11
    //   81: aload_3
    //   82: iload 10
    //   84: invokestatic 141	x/m:b	(Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   87: istore 12
    //   89: iload 12
    //   91: ifne +14 -> 105
    //   94: aload 11
    //   96: invokevirtual 146	java/io/File:delete	()Z
    //   99: pop
    //   100: aconst_null
    //   101: astore_2
    //   102: goto +74 -> 176
    //   105: new 148	java/io/FileInputStream
    //   108: astore 13
    //   110: aload 13
    //   112: aload 11
    //   114: invokespecial 151	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   117: aload 13
    //   119: invokevirtual 155	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   122: astore_2
    //   123: aload_2
    //   124: invokevirtual 161	java/nio/channels/FileChannel:size	()J
    //   127: lstore 14
    //   129: aload_2
    //   130: getstatic 167	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   133: lconst_0
    //   134: lload 14
    //   136: invokevirtual 171	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   139: astore_2
    //   140: aload 13
    //   142: invokevirtual 174	java/io/FileInputStream:close	()V
    //   145: goto +25 -> 170
    //   148: astore_2
    //   149: aload 13
    //   151: invokevirtual 174	java/io/FileInputStream:close	()V
    //   154: goto +11 -> 165
    //   157: astore 13
    //   159: aload_2
    //   160: aload 13
    //   162: invokevirtual 180	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   165: aload_2
    //   166: athrow
    //   167: astore_2
    //   168: aconst_null
    //   169: astore_2
    //   170: aload 11
    //   172: invokevirtual 146	java/io/File:delete	()Z
    //   175: pop
    //   176: aload_2
    //   177: ifnonnull +5 -> 182
    //   180: aconst_null
    //   181: areturn
    //   182: aload 6
    //   184: aload_2
    //   185: aload 9
    //   187: getfield 182	w/d$d:e	I
    //   190: aload 9
    //   192: getfield 184	w/d$d:b	I
    //   195: aload 9
    //   197: getfield 187	w/d$d:c	Z
    //   200: invokestatic 189	x/g:g	(Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z
    //   203: ifne +5 -> 208
    //   206: aconst_null
    //   207: areturn
    //   208: iinc 4 1
    //   211: goto -167 -> 44
    //   214: astore_1
    //   215: aload 11
    //   217: invokevirtual 146	java/io/File:delete	()Z
    //   220: pop
    //   221: aload_1
    //   222: athrow
    //   223: getstatic 81	x/g:a	Ljava/lang/Class;
    //   226: iconst_1
    //   227: invokestatic 59	java/lang/reflect/Array:newInstance	(Ljava/lang/Class;I)Ljava/lang/Object;
    //   230: astore_1
    //   231: aload_1
    //   232: iconst_0
    //   233: aload 6
    //   235: invokestatic 193	java/lang/reflect/Array:set	(Ljava/lang/Object;ILjava/lang/Object;)V
    //   238: getstatic 85	x/g:d	Ljava/lang/reflect/Method;
    //   241: aconst_null
    //   242: iconst_1
    //   243: anewarray 61	java/lang/Object
    //   246: dup
    //   247: iconst_0
    //   248: aload_1
    //   249: aastore
    //   250: invokevirtual 108	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   253: checkcast 51	android/graphics/Typeface
    //   256: astore_1
    //   257: aload_1
    //   258: areturn
    //   259: astore_1
    //   260: aload 5
    //   262: astore_1
    //   263: goto -6 -> 257
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	this	g
    //   0	266	1	paramContext	Context
    //   0	266	2	paramc	w.d.c
    //   0	266	3	paramResources	android.content.res.Resources
    //   0	266	4	paramInt	int
    //   1	260	5	localObject1	Object
    //   13	1	6	localObject2	Object
    //   18	1	6	localIllegalAccessException	IllegalAccessException
    //   21	213	6	localObject3	Object
    //   34	18	7	arrayOfd	w.d.d[]
    //   39	10	8	i	int
    //   56	140	9	locald	w.d.d
    //   63	20	10	j	int
    //   69	147	11	localFile	java.io.File
    //   87	3	12	bool	boolean
    //   108	42	13	localFileInputStream	java.io.FileInputStream
    //   157	4	13	localThrowable	Throwable
    //   127	8	14	l	long
    // Exception table:
    //   from	to	target	type
    //   3	15	18	java/lang/IllegalAccessException
    //   3	15	18	java/lang/InstantiationException
    //   3	15	18	java/lang/reflect/InvocationTargetException
    //   117	140	148	finally
    //   149	154	157	finally
    //   105	117	167	java/io/IOException
    //   140	145	167	java/io/IOException
    //   159	165	167	java/io/IOException
    //   165	167	167	java/io/IOException
    //   79	89	214	finally
    //   105	117	214	finally
    //   140	145	214	finally
    //   159	165	214	finally
    //   165	167	214	finally
    //   223	257	259	java/lang/IllegalAccessException
    //   223	257	259	java/lang/reflect/InvocationTargetException
  }
  
  public final Typeface b(Context paramContext, n[] paramArrayOfn, int paramInt)
  {
    Object localObject2;
    try
    {
      Object localObject1 = b.newInstance(new Object[0]);
    }
    catch (IllegalAccessException|InstantiationException|InvocationTargetException localIllegalAccessException)
    {
      localObject2 = null;
    }
    if (localObject2 == null) {
      return null;
    }
    h localh = new h();
    int i = paramArrayOfn.length;
    for (int j = 0; j < i; j++)
    {
      n localn = paramArrayOfn[j];
      Uri localUri = a;
      ByteBuffer localByteBuffer = (ByteBuffer)localh.getOrDefault(localUri, null);
      Object localObject3 = localByteBuffer;
      if (localByteBuffer == null)
      {
        localObject3 = m.e(paramContext, localUri);
        localh.put(localUri, localObject3);
      }
      if (localObject3 == null) {
        return null;
      }
      if (!g(localObject2, (ByteBuffer)localObject3, b, c, d)) {
        return null;
      }
    }
    try
    {
      paramContext = Array.newInstance(a, 1);
      Array.set(paramContext, 0, localObject2);
      paramContext = (Typeface)d.invoke(null, new Object[] { paramContext });
    }
    catch (IllegalAccessException|InvocationTargetException paramContext)
    {
      paramContext = null;
    }
    if (paramContext == null) {
      return null;
    }
    return Typeface.create(paramContext, paramInt);
  }
}

/* Location:
 * Qualified Name:     x.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */