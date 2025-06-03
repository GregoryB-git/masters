package A;

import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class i
  extends n
{
  public static Class b;
  public static Constructor c;
  public static Method d;
  public static Method e;
  public static boolean f = false;
  
  public static boolean h(Object paramObject, String paramString, int paramInt, boolean paramBoolean)
  {
    
    try
    {
      paramBoolean = ((Boolean)d.invoke(paramObject, new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).booleanValue();
      return paramBoolean;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  private static Typeface i(Object paramObject)
  {
    
    try
    {
      Object localObject = Array.newInstance(b, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)e.invoke(null, new Object[] { localObject });
      return (Typeface)paramObject;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  public static void k()
  {
    if (f) {
      return;
    }
    f = true;
    try
    {
      localClass = Class.forName("android.graphics.FontFamily");
      localObject1 = localClass.getConstructor(new Class[0]);
      localObject2 = localClass.getMethod("addFontWeightStyle", new Class[] { String.class, Integer.TYPE, Boolean.TYPE });
      Method localMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(localClass, 1).getClass() });
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Log.e("TypefaceCompatApi21Impl", localClassNotFoundException.getClass().getName(), localClassNotFoundException);
    Class localClass = null;
    Object localObject4 = null;
    Object localObject3 = localObject4;
    Object localObject2 = localObject3;
    Object localObject1 = localObject3;
    localObject3 = localObject4;
    c = (Constructor)localObject1;
    b = localClass;
    d = (Method)localObject2;
    e = (Method)localObject3;
  }
  
  private static Object l()
  {
    
    try
    {
      Object localObject = c.newInstance(new Object[0]);
      return localObject;
    }
    catch (InvocationTargetException localInvocationTargetException) {}catch (InstantiationException localInstantiationException) {}catch (IllegalAccessException localIllegalAccessException) {}
    throw new RuntimeException(localIllegalAccessException);
  }
  
  /* Error */
  public Typeface a(android.content.Context paramContext, z.e.c paramc, android.content.res.Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 139	A/i:l	()Ljava/lang/Object;
    //   3: astore 5
    //   5: aload_2
    //   6: invokevirtual 144	z/e$c:a	()[Lz/e$d;
    //   9: astore 6
    //   11: aload 6
    //   13: arraylength
    //   14: istore 7
    //   16: iconst_0
    //   17: istore 4
    //   19: iload 4
    //   21: iload 7
    //   23: if_icmpge +100 -> 123
    //   26: aload 6
    //   28: iload 4
    //   30: aaload
    //   31: astore 8
    //   33: aload_1
    //   34: invokestatic 149	A/o:e	(Landroid/content/Context;)Ljava/io/File;
    //   37: astore_2
    //   38: aload_2
    //   39: ifnonnull +5 -> 44
    //   42: aconst_null
    //   43: areturn
    //   44: aload_2
    //   45: aload_3
    //   46: aload 8
    //   48: invokevirtual 154	z/e$d:b	()I
    //   51: invokestatic 157	A/o:c	(Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   54: istore 9
    //   56: iload 9
    //   58: ifne +10 -> 68
    //   61: aload_2
    //   62: invokevirtual 162	java/io/File:delete	()Z
    //   65: pop
    //   66: aconst_null
    //   67: areturn
    //   68: aload 5
    //   70: aload_2
    //   71: invokevirtual 165	java/io/File:getPath	()Ljava/lang/String;
    //   74: aload 8
    //   76: invokevirtual 167	z/e$d:e	()I
    //   79: aload 8
    //   81: invokevirtual 169	z/e$d:f	()Z
    //   84: invokestatic 171	A/i:h	(Ljava/lang/Object;Ljava/lang/String;IZ)Z
    //   87: istore 9
    //   89: aload_2
    //   90: invokevirtual 162	java/io/File:delete	()Z
    //   93: pop
    //   94: iload 9
    //   96: ifne +5 -> 101
    //   99: aconst_null
    //   100: areturn
    //   101: iinc 4 1
    //   104: goto -85 -> 19
    //   107: astore_1
    //   108: aload_2
    //   109: invokevirtual 162	java/io/File:delete	()Z
    //   112: pop
    //   113: aload_1
    //   114: athrow
    //   115: astore_1
    //   116: aload_2
    //   117: invokevirtual 162	java/io/File:delete	()Z
    //   120: pop
    //   121: aconst_null
    //   122: areturn
    //   123: aload 5
    //   125: invokestatic 173	A/i:i	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   128: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	i
    //   0	129	1	paramContext	android.content.Context
    //   0	129	2	paramc	z.e.c
    //   0	129	3	paramResources	android.content.res.Resources
    //   0	129	4	paramInt	int
    //   3	121	5	localObject	Object
    //   9	18	6	arrayOfd	z.e.d[]
    //   14	10	7	i	int
    //   31	49	8	locald	z.e.d
    //   54	41	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   44	56	107	finally
    //   68	89	107	finally
    //   44	56	115	java/lang/RuntimeException
    //   68	89	115	java/lang/RuntimeException
  }
  
  /* Error */
  public Typeface b(android.content.Context paramContext, android.os.CancellationSignal paramCancellationSignal, F.g.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: aload_3
    //   10: iload 4
    //   12: invokevirtual 180	A/n:g	([LF/g$b;I)LF/g$b;
    //   15: astore_3
    //   16: aload_1
    //   17: invokevirtual 186	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   20: astore 5
    //   22: aload 5
    //   24: aload_3
    //   25: invokevirtual 191	F/g$b:d	()Landroid/net/Uri;
    //   28: ldc -63
    //   30: aload_2
    //   31: invokevirtual 199	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   34: astore_2
    //   35: aload_2
    //   36: ifnonnull +13 -> 49
    //   39: aload_2
    //   40: ifnull +7 -> 47
    //   43: aload_2
    //   44: invokevirtual 204	android/os/ParcelFileDescriptor:close	()V
    //   47: aconst_null
    //   48: areturn
    //   49: aload_0
    //   50: aload_2
    //   51: invokevirtual 208	A/i:j	(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
    //   54: astore_3
    //   55: aload_3
    //   56: ifnull +28 -> 84
    //   59: aload_3
    //   60: invokevirtual 211	java/io/File:canRead	()Z
    //   63: ifne +6 -> 69
    //   66: goto +18 -> 84
    //   69: aload_3
    //   70: invokestatic 215	android/graphics/Typeface:createFromFile	(Ljava/io/File;)Landroid/graphics/Typeface;
    //   73: astore_1
    //   74: aload_2
    //   75: invokevirtual 204	android/os/ParcelFileDescriptor:close	()V
    //   78: aload_1
    //   79: areturn
    //   80: astore_1
    //   81: goto +48 -> 129
    //   84: new 217	java/io/FileInputStream
    //   87: astore_3
    //   88: aload_3
    //   89: aload_2
    //   90: invokevirtual 221	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   93: invokespecial 224	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   96: aload_0
    //   97: aload_1
    //   98: aload_3
    //   99: invokespecial 227	A/n:c	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   102: astore_1
    //   103: aload_3
    //   104: invokevirtual 228	java/io/FileInputStream:close	()V
    //   107: aload_2
    //   108: invokevirtual 204	android/os/ParcelFileDescriptor:close	()V
    //   111: aload_1
    //   112: areturn
    //   113: astore_1
    //   114: aload_3
    //   115: invokevirtual 228	java/io/FileInputStream:close	()V
    //   118: goto +9 -> 127
    //   121: astore_3
    //   122: aload_1
    //   123: aload_3
    //   124: invokevirtual 233	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   127: aload_1
    //   128: athrow
    //   129: aload_2
    //   130: invokevirtual 204	android/os/ParcelFileDescriptor:close	()V
    //   133: goto +9 -> 142
    //   136: astore_2
    //   137: aload_1
    //   138: aload_2
    //   139: invokevirtual 233	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   142: aload_1
    //   143: athrow
    //   144: astore_1
    //   145: aconst_null
    //   146: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	i
    //   0	147	1	paramContext	android.content.Context
    //   0	147	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	147	3	paramArrayOfb	F.g.b[]
    //   0	147	4	paramInt	int
    //   20	3	5	localContentResolver	android.content.ContentResolver
    // Exception table:
    //   from	to	target	type
    //   49	55	80	finally
    //   59	66	80	finally
    //   69	74	80	finally
    //   84	96	80	finally
    //   103	107	80	finally
    //   122	127	80	finally
    //   127	129	80	finally
    //   96	103	113	finally
    //   114	118	121	finally
    //   129	133	136	finally
    //   22	35	144	java/io/IOException
    //   43	47	144	java/io/IOException
    //   74	78	144	java/io/IOException
    //   107	111	144	java/io/IOException
    //   137	142	144	java/io/IOException
    //   142	144	144	java/io/IOException
  }
  
  public final File j(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("/proc/self/fd/");
      localStringBuilder.append(paramParcelFileDescriptor.getFd());
      paramParcelFileDescriptor = Os.readlink(localStringBuilder.toString());
      if (OsConstants.S_ISREG(statst_mode))
      {
        paramParcelFileDescriptor = new File(paramParcelFileDescriptor);
        return paramParcelFileDescriptor;
      }
    }
    catch (ErrnoException paramParcelFileDescriptor)
    {
      for (;;) {}
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     A.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */