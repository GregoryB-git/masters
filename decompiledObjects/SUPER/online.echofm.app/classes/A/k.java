package A;

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
import z.e.c;
import z.e.d;

public class k
  extends i
{
  public final Class g;
  public final Constructor h;
  public final Method i;
  public final Method j;
  public final Method k;
  public final Method l;
  public final Method m;
  
  public k()
  {
    try
    {
      localObject1 = v();
      Constructor localConstructor = w((Class)localObject1);
      localObject3 = s((Class)localObject1);
      localObject4 = t((Class)localObject1);
      localObject5 = x((Class)localObject1);
      localObject6 = r((Class)localObject1);
      localObject7 = u((Class)localObject1);
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("Unable to collect necessary methods for class ");
    ((StringBuilder)localObject3).append(localClassNotFoundException.getClass().getName());
    Log.e("TypefaceCompatApi26Impl", ((StringBuilder)localObject3).toString(), localClassNotFoundException);
    Object localObject8 = null;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject6 = localObject4;
    Object localObject7 = localObject6;
    Object localObject5 = localObject4;
    localObject4 = localObject3;
    localObject3 = localObject2;
    localObject2 = localObject1;
    localObject1 = localObject8;
    g = ((Class)localObject1);
    h = ((Constructor)localObject2);
    i = ((Method)localObject3);
    j = ((Method)localObject4);
    k = ((Method)localObject5);
    l = ((Method)localObject6);
    m = ((Method)localObject7);
  }
  
  public Typeface a(Context paramContext, e.c paramc, Resources paramResources, int paramInt)
  {
    if (!q()) {
      return super.a(paramContext, paramc, paramResources, paramInt);
    }
    paramResources = l();
    if (paramResources == null) {
      return null;
    }
    for (paramc : paramc.a()) {
      if (!n(paramContext, paramResources, paramc.a(), paramc.c(), paramc.e(), paramc.f(), FontVariationAxis.fromFontVariationSettings(paramc.d())))
      {
        m(paramResources);
        return null;
      }
    }
    if (!p(paramResources)) {
      return null;
    }
    return i(paramResources);
  }
  
  /* Error */
  public Typeface b(Context paramContext, android.os.CancellationSignal paramCancellationSignal, F.g.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: invokevirtual 98	A/k:q	()Z
    //   12: ifne +98 -> 110
    //   15: aload_0
    //   16: aload_3
    //   17: iload 4
    //   19: invokevirtual 153	A/n:g	([LF/g$b;I)LF/g$b;
    //   22: astore_3
    //   23: aload_1
    //   24: invokevirtual 159	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   27: astore_1
    //   28: aload_1
    //   29: aload_3
    //   30: invokevirtual 164	F/g$b:d	()Landroid/net/Uri;
    //   33: ldc -91
    //   35: aload_2
    //   36: invokevirtual 171	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   39: astore_1
    //   40: aload_1
    //   41: ifnonnull +13 -> 54
    //   44: aload_1
    //   45: ifnull +7 -> 52
    //   48: aload_1
    //   49: invokevirtual 176	android/os/ParcelFileDescriptor:close	()V
    //   52: aconst_null
    //   53: areturn
    //   54: new 178	android/graphics/Typeface$Builder
    //   57: astore_2
    //   58: aload_2
    //   59: aload_1
    //   60: invokevirtual 182	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   63: invokespecial 185	android/graphics/Typeface$Builder:<init>	(Ljava/io/FileDescriptor;)V
    //   66: aload_2
    //   67: aload_3
    //   68: invokevirtual 186	F/g$b:e	()I
    //   71: invokevirtual 190	android/graphics/Typeface$Builder:setWeight	(I)Landroid/graphics/Typeface$Builder;
    //   74: aload_3
    //   75: invokevirtual 191	F/g$b:f	()Z
    //   78: invokevirtual 195	android/graphics/Typeface$Builder:setItalic	(Z)Landroid/graphics/Typeface$Builder;
    //   81: invokevirtual 199	android/graphics/Typeface$Builder:build	()Landroid/graphics/Typeface;
    //   84: astore_2
    //   85: aload_1
    //   86: invokevirtual 176	android/os/ParcelFileDescriptor:close	()V
    //   89: aload_2
    //   90: areturn
    //   91: astore_2
    //   92: aload_1
    //   93: invokevirtual 176	android/os/ParcelFileDescriptor:close	()V
    //   96: goto +9 -> 105
    //   99: astore_1
    //   100: aload_2
    //   101: aload_1
    //   102: invokevirtual 205	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   105: aload_2
    //   106: athrow
    //   107: astore_1
    //   108: aconst_null
    //   109: areturn
    //   110: aload_1
    //   111: aload_3
    //   112: aload_2
    //   113: invokestatic 210	A/o:h	(Landroid/content/Context;[LF/g$b;Landroid/os/CancellationSignal;)Ljava/util/Map;
    //   116: astore_2
    //   117: aload_0
    //   118: invokevirtual 103	A/k:l	()Ljava/lang/Object;
    //   121: astore_1
    //   122: aload_1
    //   123: ifnonnull +5 -> 128
    //   126: aconst_null
    //   127: areturn
    //   128: aload_3
    //   129: arraylength
    //   130: istore 5
    //   132: iconst_0
    //   133: istore 6
    //   135: iconst_0
    //   136: istore 7
    //   138: iload 7
    //   140: iload 5
    //   142: if_icmpge +74 -> 216
    //   145: aload_3
    //   146: iload 7
    //   148: aaload
    //   149: astore 8
    //   151: aload_2
    //   152: aload 8
    //   154: invokevirtual 164	F/g$b:d	()Landroid/net/Uri;
    //   157: invokeinterface 216 2 0
    //   162: checkcast 218	java/nio/ByteBuffer
    //   165: astore 9
    //   167: aload 9
    //   169: ifnonnull +6 -> 175
    //   172: goto +38 -> 210
    //   175: aload_0
    //   176: aload_1
    //   177: aload 9
    //   179: aload 8
    //   181: invokevirtual 219	F/g$b:c	()I
    //   184: aload 8
    //   186: invokevirtual 186	F/g$b:e	()I
    //   189: aload 8
    //   191: invokevirtual 191	F/g$b:f	()Z
    //   194: invokevirtual 223	A/k:o	(Ljava/lang/Object;Ljava/nio/ByteBuffer;III)Z
    //   197: ifne +10 -> 207
    //   200: aload_0
    //   201: aload_1
    //   202: invokevirtual 137	A/k:m	(Ljava/lang/Object;)V
    //   205: aconst_null
    //   206: areturn
    //   207: iconst_1
    //   208: istore 6
    //   210: iinc 7 1
    //   213: goto -75 -> 138
    //   216: iload 6
    //   218: ifne +10 -> 228
    //   221: aload_0
    //   222: aload_1
    //   223: invokevirtual 137	A/k:m	(Ljava/lang/Object;)V
    //   226: aconst_null
    //   227: areturn
    //   228: aload_0
    //   229: aload_1
    //   230: invokevirtual 141	A/k:p	(Ljava/lang/Object;)Z
    //   233: ifne +5 -> 238
    //   236: aconst_null
    //   237: areturn
    //   238: aload_0
    //   239: aload_1
    //   240: invokevirtual 144	A/k:i	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   243: astore_1
    //   244: aload_1
    //   245: ifnonnull +5 -> 250
    //   248: aconst_null
    //   249: areturn
    //   250: aload_1
    //   251: iload 4
    //   253: invokestatic 229	android/graphics/Typeface:create	(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    //   256: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	257	0	this	k
    //   0	257	1	paramContext	Context
    //   0	257	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	257	3	paramArrayOfb	F.g.b[]
    //   0	257	4	paramInt	int
    //   130	13	5	n	int
    //   133	84	6	i1	int
    //   136	75	7	i2	int
    //   149	41	8	localb	F.g.b
    //   165	13	9	localByteBuffer	ByteBuffer
    // Exception table:
    //   from	to	target	type
    //   54	85	91	finally
    //   92	96	99	finally
    //   28	40	107	java/io/IOException
    //   48	52	107	java/io/IOException
    //   85	89	107	java/io/IOException
    //   100	105	107	java/io/IOException
    //   105	107	107	java/io/IOException
  }
  
  public Typeface d(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    if (!q()) {
      return super.d(paramContext, paramResources, paramInt1, paramString, paramInt2);
    }
    paramResources = l();
    if (paramResources == null) {
      return null;
    }
    if (!n(paramContext, paramResources, paramString, 0, -1, -1, null))
    {
      m(paramResources);
      return null;
    }
    if (!p(paramResources)) {
      return null;
    }
    return i(paramResources);
  }
  
  public Typeface i(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(g, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)m.invoke(null, new Object[] { localObject, Integer.valueOf(-1), Integer.valueOf(-1) });
      return (Typeface)paramObject;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return null;
  }
  
  public final Object l()
  {
    try
    {
      Object localObject = h.newInstance(new Object[0]);
      return localObject;
    }
    catch (IllegalAccessException|InstantiationException|InvocationTargetException localIllegalAccessException) {}
    return null;
  }
  
  public final void m(Object paramObject)
  {
    try
    {
      l.invoke(paramObject, new Object[0]);
      return;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject)
    {
      for (;;) {}
    }
  }
  
  public final boolean n(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3, FontVariationAxis[] paramArrayOfFontVariationAxis)
  {
    try
    {
      boolean bool = ((Boolean)i.invoke(paramObject, new Object[] { paramContext.getAssets(), paramString, Integer.valueOf(0), Boolean.FALSE, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramArrayOfFontVariationAxis })).booleanValue();
      return bool;
    }
    catch (IllegalAccessException|InvocationTargetException paramContext) {}
    return false;
  }
  
  public final boolean o(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      boolean bool = ((Boolean)j.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) })).booleanValue();
      return bool;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return false;
  }
  
  public final boolean p(Object paramObject)
  {
    try
    {
      boolean bool = ((Boolean)k.invoke(paramObject, new Object[0])).booleanValue();
      return bool;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return false;
  }
  
  public final boolean q()
  {
    if (i == null) {
      Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    }
    boolean bool;
    if (i != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Method r(Class paramClass)
  {
    return paramClass.getMethod("abortCreation", new Class[0]);
  }
  
  public Method s(Class paramClass)
  {
    Class localClass = Integer.TYPE;
    return paramClass.getMethod("addFontFromAssetManager", new Class[] { AssetManager.class, String.class, localClass, Boolean.TYPE, localClass, localClass, localClass, FontVariationAxis[].class });
  }
  
  public Method t(Class paramClass)
  {
    Class localClass = Integer.TYPE;
    return paramClass.getMethod("addFontFromBuffer", new Class[] { ByteBuffer.class, localClass, FontVariationAxis[].class, localClass, localClass });
  }
  
  public Method u(Class paramClass)
  {
    paramClass = Array.newInstance(paramClass, 1).getClass();
    Class localClass = Integer.TYPE;
    paramClass = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { paramClass, localClass, localClass });
    paramClass.setAccessible(true);
    return paramClass;
  }
  
  public Class v()
  {
    return Class.forName("android.graphics.FontFamily");
  }
  
  public Constructor w(Class paramClass)
  {
    return paramClass.getConstructor(new Class[0]);
  }
  
  public Method x(Class paramClass)
  {
    return paramClass.getMethod("freeze", new Class[0]);
  }
}

/* Location:
 * Qualified Name:     A.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */