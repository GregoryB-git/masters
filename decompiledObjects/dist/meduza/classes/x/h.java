package x;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import w.d.c;
import w.d.d;

public class h
  extends f
{
  public final Class<?> f;
  public final Constructor<?> g;
  public final Method h;
  public final Method i;
  public final Method j;
  public final Method k;
  public final Method l;
  
  public h()
  {
    Object localObject1 = null;
    try
    {
      Class localClass = Class.forName("android.graphics.FontFamily");
      localObject3 = localClass.getConstructor(new Class[0]);
      localObject4 = m(localClass);
      localObject5 = n(localClass);
      localObject6 = localClass.getMethod("freeze", new Class[0]);
      localObject7 = localClass.getMethod("abortCreation", new Class[0]);
      localObject8 = o(localClass);
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Object localObject7 = f.l("Unable to collect necessary methods for class ");
    ((StringBuilder)localObject7).append(localClassNotFoundException.getClass().getName());
    Log.e("TypefaceCompatApi26Impl", ((StringBuilder)localObject7).toString(), localClassNotFoundException);
    Object localObject9 = null;
    Object localObject2 = localObject9;
    localObject7 = localObject2;
    Object localObject4 = localObject7;
    Object localObject8 = localObject4;
    Object localObject6 = localObject8;
    Object localObject5 = localObject8;
    Object localObject3 = localObject7;
    localObject7 = localObject2;
    localObject8 = localObject9;
    localObject2 = localObject1;
    f = ((Class)localObject2);
    g = ((Constructor)localObject3);
    h = ((Method)localObject4);
    i = ((Method)localObject5);
    j = ((Method)localObject6);
    k = ((Method)localObject7);
    l = ((Method)localObject8);
  }
  
  public static Method m(Class paramClass)
  {
    Class localClass = Integer.TYPE;
    return paramClass.getMethod("addFontFromAssetManager", new Class[] { AssetManager.class, String.class, localClass, Boolean.TYPE, localClass, localClass, localClass, FontVariationAxis[].class });
  }
  
  public static Method n(Class paramClass)
  {
    Class localClass = Integer.TYPE;
    return paramClass.getMethod("addFontFromBuffer", new Class[] { ByteBuffer.class, localClass, FontVariationAxis[].class, localClass, localClass });
  }
  
  public final Typeface a(Context paramContext, d.c paramc, Resources paramResources, int paramInt)
  {
    if (!l()) {
      return super.a(paramContext, paramc, paramResources, paramInt);
    }
    try
    {
      paramResources = g.newInstance(new Object[0]);
    }
    catch (IllegalAccessException|InstantiationException|InvocationTargetException paramResources)
    {
      paramResources = null;
    }
    if (paramResources == null) {
      return null;
    }
    paramc = a;
    int m = paramc.length;
    paramInt = 0;
    for (;;)
    {
      if (paramInt < m)
      {
        Object localObject = paramc[paramInt];
        if (i(paramContext, paramResources, a, e, b, c, FontVariationAxis.fromFontVariationSettings(d))) {}
      }
      try
      {
        k.invoke(paramResources, new Object[0]);
        return null;
        paramInt++;
        continue;
        if (!k(paramResources)) {
          return null;
        }
        return j(paramResources);
      }
      catch (IllegalAccessException|InvocationTargetException paramContext)
      {
        for (;;) {}
      }
    }
  }
  
  /* Error */
  public final Typeface b(Context paramContext, b0.n[] paramArrayOfn, int paramInt)
  {
    // Byte code:
    //   0: aload_2
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: invokevirtual 132	x/h:l	()Z
    //   12: ifne +100 -> 112
    //   15: aload_0
    //   16: iload_3
    //   17: aload_2
    //   18: invokevirtual 192	x/l:f	(I[Lb0/n;)Lb0/n;
    //   21: astore_2
    //   22: aload_1
    //   23: invokevirtual 198	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   26: astore_1
    //   27: aload_1
    //   28: aload_2
    //   29: getfield 203	b0/n:a	Landroid/net/Uri;
    //   32: ldc -51
    //   34: aconst_null
    //   35: invokevirtual 211	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   38: astore_1
    //   39: aload_1
    //   40: ifnonnull +13 -> 53
    //   43: aload_1
    //   44: ifnull +7 -> 51
    //   47: aload_1
    //   48: invokevirtual 216	android/os/ParcelFileDescriptor:close	()V
    //   51: aconst_null
    //   52: areturn
    //   53: new 218	android/graphics/Typeface$Builder
    //   56: astore 4
    //   58: aload 4
    //   60: aload_1
    //   61: invokevirtual 222	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   64: invokespecial 225	android/graphics/Typeface$Builder:<init>	(Ljava/io/FileDescriptor;)V
    //   67: aload 4
    //   69: aload_2
    //   70: getfield 227	b0/n:c	I
    //   73: invokevirtual 231	android/graphics/Typeface$Builder:setWeight	(I)Landroid/graphics/Typeface$Builder;
    //   76: aload_2
    //   77: getfield 233	b0/n:d	Z
    //   80: invokevirtual 237	android/graphics/Typeface$Builder:setItalic	(Z)Landroid/graphics/Typeface$Builder;
    //   83: invokevirtual 241	android/graphics/Typeface$Builder:build	()Landroid/graphics/Typeface;
    //   86: astore_2
    //   87: aload_1
    //   88: invokevirtual 216	android/os/ParcelFileDescriptor:close	()V
    //   91: aload_2
    //   92: areturn
    //   93: astore_2
    //   94: aload_1
    //   95: invokevirtual 216	android/os/ParcelFileDescriptor:close	()V
    //   98: goto +9 -> 107
    //   101: astore_1
    //   102: aload_2
    //   103: aload_1
    //   104: invokevirtual 247	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   107: aload_2
    //   108: athrow
    //   109: astore_1
    //   110: aconst_null
    //   111: areturn
    //   112: new 249	java/util/HashMap
    //   115: dup
    //   116: invokespecial 250	java/util/HashMap:<init>	()V
    //   119: astore 4
    //   121: aload_2
    //   122: arraylength
    //   123: istore 5
    //   125: iconst_0
    //   126: istore 6
    //   128: iload 6
    //   130: iload 5
    //   132: if_icmpge +60 -> 192
    //   135: aload_2
    //   136: iload 6
    //   138: aaload
    //   139: astore 7
    //   141: aload 7
    //   143: getfield 251	b0/n:e	I
    //   146: ifeq +6 -> 152
    //   149: goto +37 -> 186
    //   152: aload 7
    //   154: getfield 203	b0/n:a	Landroid/net/Uri;
    //   157: astore 7
    //   159: aload 4
    //   161: aload 7
    //   163: invokevirtual 254	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   166: ifeq +6 -> 172
    //   169: goto +17 -> 186
    //   172: aload 4
    //   174: aload 7
    //   176: aload_1
    //   177: aload 7
    //   179: invokestatic 259	x/m:e	(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;
    //   182: invokevirtual 263	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   185: pop
    //   186: iinc 6 1
    //   189: goto -61 -> 128
    //   192: aload 4
    //   194: invokestatic 269	java/util/Collections:unmodifiableMap	(Ljava/util/Map;)Ljava/util/Map;
    //   197: astore 4
    //   199: aload_0
    //   200: getfield 90	x/h:g	Ljava/lang/reflect/Constructor;
    //   203: iconst_0
    //   204: anewarray 62	java/lang/Object
    //   207: invokevirtual 140	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   210: astore_1
    //   211: goto +6 -> 217
    //   214: astore_1
    //   215: aconst_null
    //   216: astore_1
    //   217: aload_1
    //   218: ifnonnull +5 -> 223
    //   221: aconst_null
    //   222: areturn
    //   223: aload_2
    //   224: arraylength
    //   225: istore 8
    //   227: iconst_0
    //   228: istore 6
    //   230: iload 6
    //   232: istore 5
    //   234: iload 6
    //   236: iload 8
    //   238: if_icmpge +145 -> 383
    //   241: aload_2
    //   242: iload 6
    //   244: aaload
    //   245: astore 9
    //   247: aload 4
    //   249: aload 9
    //   251: getfield 203	b0/n:a	Landroid/net/Uri;
    //   254: invokeinterface 275 2 0
    //   259: checkcast 121	java/nio/ByteBuffer
    //   262: astore 7
    //   264: aload 7
    //   266: ifnonnull +6 -> 272
    //   269: goto +108 -> 377
    //   272: aload 9
    //   274: getfield 276	b0/n:b	I
    //   277: istore 10
    //   279: aload 9
    //   281: getfield 227	b0/n:c	I
    //   284: istore 11
    //   286: aload 9
    //   288: getfield 233	b0/n:d	Z
    //   291: istore 5
    //   293: aload_0
    //   294: getfield 94	x/h:i	Ljava/lang/reflect/Method;
    //   297: aload_1
    //   298: iconst_5
    //   299: anewarray 62	java/lang/Object
    //   302: dup
    //   303: iconst_0
    //   304: aload 7
    //   306: aastore
    //   307: dup
    //   308: iconst_1
    //   309: iload 10
    //   311: invokestatic 280	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   314: aastore
    //   315: dup
    //   316: iconst_2
    //   317: aconst_null
    //   318: aastore
    //   319: dup
    //   320: iconst_3
    //   321: iload 11
    //   323: invokestatic 280	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   326: aastore
    //   327: dup
    //   328: iconst_4
    //   329: iload 5
    //   331: invokestatic 280	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   334: aastore
    //   335: invokevirtual 178	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   338: checkcast 114	java/lang/Boolean
    //   341: invokevirtual 283	java/lang/Boolean:booleanValue	()Z
    //   344: istore 12
    //   346: goto +8 -> 354
    //   349: astore 7
    //   351: iconst_0
    //   352: istore 12
    //   354: iload 12
    //   356: ifne +18 -> 374
    //   359: aload_0
    //   360: getfield 98	x/h:k	Ljava/lang/reflect/Method;
    //   363: aload_1
    //   364: iconst_0
    //   365: anewarray 62	java/lang/Object
    //   368: invokevirtual 178	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   371: pop
    //   372: aconst_null
    //   373: areturn
    //   374: iconst_1
    //   375: istore 5
    //   377: iinc 6 1
    //   380: goto -146 -> 234
    //   383: iload 5
    //   385: ifne +18 -> 403
    //   388: aload_0
    //   389: getfield 98	x/h:k	Ljava/lang/reflect/Method;
    //   392: aload_1
    //   393: iconst_0
    //   394: anewarray 62	java/lang/Object
    //   397: invokevirtual 178	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   400: pop
    //   401: aconst_null
    //   402: areturn
    //   403: aload_0
    //   404: aload_1
    //   405: invokevirtual 181	x/h:k	(Ljava/lang/Object;)Z
    //   408: ifne +5 -> 413
    //   411: aconst_null
    //   412: areturn
    //   413: aload_0
    //   414: aload_1
    //   415: invokevirtual 184	x/h:j	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   418: astore_1
    //   419: aload_1
    //   420: ifnonnull +5 -> 425
    //   423: aconst_null
    //   424: areturn
    //   425: aload_1
    //   426: iload_3
    //   427: invokestatic 289	android/graphics/Typeface:create	(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    //   430: areturn
    //   431: astore_1
    //   432: goto -60 -> 372
    //   435: astore_1
    //   436: goto -35 -> 401
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	439	0	this	h
    //   0	439	1	paramContext	Context
    //   0	439	2	paramArrayOfn	b0.n[]
    //   0	439	3	paramInt	int
    //   56	192	4	localObject1	Object
    //   123	110	5	m	int
    //   291	39	5	n	int
    //   375	9	5	i1	int
    //   126	252	6	i2	int
    //   139	166	7	localObject2	Object
    //   349	1	7	localIllegalAccessException	IllegalAccessException
    //   225	14	8	i3	int
    //   245	42	9	localn	b0.n
    //   277	33	10	i4	int
    //   284	38	11	i5	int
    //   344	11	12	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   53	87	93	finally
    //   94	98	101	finally
    //   27	39	109	java/io/IOException
    //   47	51	109	java/io/IOException
    //   87	91	109	java/io/IOException
    //   102	107	109	java/io/IOException
    //   107	109	109	java/io/IOException
    //   199	211	214	java/lang/IllegalAccessException
    //   199	211	214	java/lang/InstantiationException
    //   199	211	214	java/lang/reflect/InvocationTargetException
    //   293	346	349	java/lang/IllegalAccessException
    //   293	346	349	java/lang/reflect/InvocationTargetException
    //   359	372	431	java/lang/IllegalAccessException
    //   359	372	431	java/lang/reflect/InvocationTargetException
    //   388	401	435	java/lang/IllegalAccessException
    //   388	401	435	java/lang/reflect/InvocationTargetException
  }
  
  public final Typeface d(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    if (!l()) {
      return super.d(paramContext, paramResources, paramInt1, paramString, paramInt2);
    }
    try
    {
      paramResources = g.newInstance(new Object[0]);
    }
    catch (IllegalAccessException|InstantiationException|InvocationTargetException paramResources)
    {
      paramResources = null;
    }
    if (paramResources == null) {
      return null;
    }
    if (!i(paramContext, paramResources, paramString, 0, -1, -1, null)) {}
    try
    {
      k.invoke(paramResources, new Object[0]);
      return null;
      if (!k(paramResources)) {
        return null;
      }
      return j(paramResources);
    }
    catch (IllegalAccessException|InvocationTargetException paramContext)
    {
      for (;;) {}
    }
  }
  
  public final boolean i(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3, FontVariationAxis[] paramArrayOfFontVariationAxis)
  {
    try
    {
      boolean bool = ((Boolean)h.invoke(paramObject, new Object[] { paramContext.getAssets(), paramString, Integer.valueOf(0), Boolean.FALSE, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramArrayOfFontVariationAxis })).booleanValue();
      return bool;
    }
    catch (IllegalAccessException|InvocationTargetException paramContext) {}
    return false;
  }
  
  public Typeface j(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(f, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)l.invoke(null, new Object[] { localObject, Integer.valueOf(-1), Integer.valueOf(-1) });
      return (Typeface)paramObject;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return null;
  }
  
  public final boolean k(Object paramObject)
  {
    try
    {
      boolean bool = ((Boolean)j.invoke(paramObject, new Object[0])).booleanValue();
      return bool;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return false;
  }
  
  public final boolean l()
  {
    if (h == null) {
      Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    }
    boolean bool;
    if (h != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Method o(Class<?> paramClass)
  {
    Class localClass = Array.newInstance(paramClass, 1).getClass();
    paramClass = Integer.TYPE;
    paramClass = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { localClass, paramClass, paramClass });
    paramClass.setAccessible(true);
    return paramClass;
  }
}

/* Location:
 * Qualified Name:     x.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */