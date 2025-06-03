package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import z2;

@RequiresApi(26)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TypefaceCompatApi26Impl
  extends TypefaceCompatApi21Impl
{
  private static final String ABORT_CREATION_METHOD = "abortCreation";
  private static final String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
  private static final String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
  private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
  private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
  private static final String FREEZE_METHOD = "freeze";
  private static final int RESOLVE_BY_FONT_TABLE = -1;
  private static final String TAG = "TypefaceCompatApi26Impl";
  public final Method mAbortCreation;
  public final Method mAddFontFromAssetManager;
  public final Method mAddFontFromBuffer;
  public final Method mCreateFromFamiliesWithDefault;
  public final Class<?> mFontFamily;
  public final Constructor<?> mFontFamilyCtor;
  public final Method mFreeze;
  
  public TypefaceCompatApi26Impl()
  {
    Object localObject1 = null;
    try
    {
      Class localClass = obtainFontFamily();
      localObject3 = obtainFontFamilyCtor(localClass);
      localObject4 = obtainAddFontFromAssetManagerMethod(localClass);
      localObject5 = obtainAddFontFromBufferMethod(localClass);
      localObject6 = obtainFreezeMethod(localClass);
      localObject7 = obtainAbortCreationMethod(localClass);
      localObject8 = obtainCreateFromFamiliesWithDefaultMethod(localClass);
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Object localObject3 = z2.t("Unable to collect necessary methods for class ");
    ((StringBuilder)localObject3).append(localClassNotFoundException.getClass().getName());
    Log.e("TypefaceCompatApi26Impl", ((StringBuilder)localObject3).toString(), localClassNotFoundException);
    Object localObject9 = null;
    Object localObject2 = localObject9;
    localObject3 = localObject2;
    Object localObject8 = localObject3;
    Object localObject6 = localObject8;
    Object localObject7 = localObject6;
    Object localObject5 = localObject8;
    Object localObject4 = localObject3;
    localObject3 = localObject2;
    localObject8 = localObject9;
    localObject2 = localObject1;
    mFontFamily = ((Class)localObject2);
    mFontFamilyCtor = ((Constructor)localObject3);
    mAddFontFromAssetManager = ((Method)localObject4);
    mAddFontFromBuffer = ((Method)localObject5);
    mFreeze = ((Method)localObject6);
    mAbortCreation = ((Method)localObject7);
    mCreateFromFamiliesWithDefault = ((Method)localObject8);
  }
  
  private void abortCreation(Object paramObject)
  {
    try
    {
      mAbortCreation.invoke(paramObject, new Object[0]);
      return;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject)
    {
      for (;;) {}
    }
  }
  
  private boolean addFontFromAssetManager(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3, @Nullable FontVariationAxis[] paramArrayOfFontVariationAxis)
  {
    try
    {
      boolean bool = ((Boolean)mAddFontFromAssetManager.invoke(paramObject, new Object[] { paramContext.getAssets(), paramString, Integer.valueOf(0), Boolean.FALSE, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramArrayOfFontVariationAxis })).booleanValue();
      return bool;
    }
    catch (IllegalAccessException|InvocationTargetException paramContext) {}
    return false;
  }
  
  private boolean addFontFromBuffer(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      boolean bool = ((Boolean)mAddFontFromBuffer.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) })).booleanValue();
      return bool;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return false;
  }
  
  private boolean freeze(Object paramObject)
  {
    try
    {
      boolean bool = ((Boolean)mFreeze.invoke(paramObject, new Object[0])).booleanValue();
      return bool;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return false;
  }
  
  private boolean isFontFamilyPrivateAPIAvailable()
  {
    if (mAddFontFromAssetManager == null) {
      Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    }
    boolean bool;
    if (mAddFontFromAssetManager != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  private Object newFamily()
  {
    try
    {
      Object localObject = mFontFamilyCtor.newInstance(new Object[0]);
      return localObject;
    }
    catch (IllegalAccessException|InstantiationException|InvocationTargetException localIllegalAccessException) {}
    return null;
  }
  
  @Nullable
  public Typeface createFromFamiliesWithDefault(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(mFontFamily, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)mCreateFromFamiliesWithDefault.invoke(null, new Object[] { localObject, Integer.valueOf(-1), Integer.valueOf(-1) });
      return (Typeface)paramObject;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return null;
  }
  
  @Nullable
  public Typeface createFromFontFamilyFilesResourceEntry(Context paramContext, FontResourcesParserCompat.FontFamilyFilesResourceEntry paramFontFamilyFilesResourceEntry, Resources paramResources, int paramInt)
  {
    if (!isFontFamilyPrivateAPIAvailable()) {
      return super.createFromFontFamilyFilesResourceEntry(paramContext, paramFontFamilyFilesResourceEntry, paramResources, paramInt);
    }
    paramResources = newFamily();
    if (paramResources == null) {
      return null;
    }
    for (paramFontFamilyFilesResourceEntry : paramFontFamilyFilesResourceEntry.getEntries()) {
      if (!addFontFromAssetManager(paramContext, paramResources, paramFontFamilyFilesResourceEntry.getFileName(), paramFontFamilyFilesResourceEntry.getTtcIndex(), paramFontFamilyFilesResourceEntry.getWeight(), paramFontFamilyFilesResourceEntry.isItalic(), FontVariationAxis.fromFontVariationSettings(paramFontFamilyFilesResourceEntry.getVariationSettings())))
      {
        abortCreation(paramResources);
        return null;
      }
    }
    if (!freeze(paramResources)) {
      return null;
    }
    return createFromFamiliesWithDefault(paramResources);
  }
  
  /* Error */
  @Nullable
  public Typeface createFromFontInfo(Context paramContext, @Nullable android.os.CancellationSignal paramCancellationSignal, @NonNull androidx.core.provider.FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: invokespecial 199	androidx/core/graphics/TypefaceCompatApi26Impl:isFontFamilyPrivateAPIAvailable	()Z
    //   12: ifne +99 -> 111
    //   15: aload_0
    //   16: aload_3
    //   17: iload 4
    //   19: invokevirtual 252	androidx/core/graphics/TypefaceCompatBaseImpl:findBestInfo	([Landroidx/core/provider/FontsContractCompat$FontInfo;I)Landroidx/core/provider/FontsContractCompat$FontInfo;
    //   22: astore_3
    //   23: aload_1
    //   24: invokevirtual 256	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   27: astore_1
    //   28: aload_1
    //   29: aload_3
    //   30: invokevirtual 262	androidx/core/provider/FontsContractCompat$FontInfo:getUri	()Landroid/net/Uri;
    //   33: ldc_w 264
    //   36: aload_2
    //   37: invokevirtual 270	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   40: astore_1
    //   41: aload_1
    //   42: ifnonnull +13 -> 55
    //   45: aload_1
    //   46: ifnull +7 -> 53
    //   49: aload_1
    //   50: invokevirtual 275	android/os/ParcelFileDescriptor:close	()V
    //   53: aconst_null
    //   54: areturn
    //   55: new 277	android/graphics/Typeface$Builder
    //   58: astore_2
    //   59: aload_2
    //   60: aload_1
    //   61: invokevirtual 281	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   64: invokespecial 284	android/graphics/Typeface$Builder:<init>	(Ljava/io/FileDescriptor;)V
    //   67: aload_2
    //   68: aload_3
    //   69: invokevirtual 285	androidx/core/provider/FontsContractCompat$FontInfo:getWeight	()I
    //   72: invokevirtual 289	android/graphics/Typeface$Builder:setWeight	(I)Landroid/graphics/Typeface$Builder;
    //   75: aload_3
    //   76: invokevirtual 290	androidx/core/provider/FontsContractCompat$FontInfo:isItalic	()Z
    //   79: invokevirtual 294	android/graphics/Typeface$Builder:setItalic	(Z)Landroid/graphics/Typeface$Builder;
    //   82: invokevirtual 298	android/graphics/Typeface$Builder:build	()Landroid/graphics/Typeface;
    //   85: astore_2
    //   86: aload_1
    //   87: invokevirtual 275	android/os/ParcelFileDescriptor:close	()V
    //   90: aload_2
    //   91: areturn
    //   92: astore_2
    //   93: aload_1
    //   94: invokevirtual 275	android/os/ParcelFileDescriptor:close	()V
    //   97: goto +9 -> 106
    //   100: astore_1
    //   101: aload_2
    //   102: aload_1
    //   103: invokevirtual 304	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   106: aload_2
    //   107: athrow
    //   108: astore_1
    //   109: aconst_null
    //   110: areturn
    //   111: aload_1
    //   112: aload_3
    //   113: aload_2
    //   114: invokestatic 310	androidx/core/graphics/TypefaceCompatUtil:readFontInfoIntoByteBuffer	(Landroid/content/Context;[Landroidx/core/provider/FontsContractCompat$FontInfo;Landroid/os/CancellationSignal;)Ljava/util/Map;
    //   117: astore 5
    //   119: aload_0
    //   120: invokespecial 203	androidx/core/graphics/TypefaceCompatApi26Impl:newFamily	()Ljava/lang/Object;
    //   123: astore 6
    //   125: aload 6
    //   127: ifnonnull +5 -> 132
    //   130: aconst_null
    //   131: areturn
    //   132: aload_3
    //   133: arraylength
    //   134: istore 7
    //   136: iconst_0
    //   137: istore 8
    //   139: iconst_0
    //   140: istore 9
    //   142: iload 9
    //   144: iload 7
    //   146: if_icmpge +69 -> 215
    //   149: aload_3
    //   150: iload 9
    //   152: aaload
    //   153: astore_1
    //   154: aload 5
    //   156: aload_1
    //   157: invokevirtual 262	androidx/core/provider/FontsContractCompat$FontInfo:getUri	()Landroid/net/Uri;
    //   160: invokeinterface 316 2 0
    //   165: checkcast 318	java/nio/ByteBuffer
    //   168: astore_2
    //   169: aload_2
    //   170: ifnonnull +6 -> 176
    //   173: goto +36 -> 209
    //   176: aload_0
    //   177: aload 6
    //   179: aload_2
    //   180: aload_1
    //   181: invokevirtual 319	androidx/core/provider/FontsContractCompat$FontInfo:getTtcIndex	()I
    //   184: aload_1
    //   185: invokevirtual 285	androidx/core/provider/FontsContractCompat$FontInfo:getWeight	()I
    //   188: aload_1
    //   189: invokevirtual 290	androidx/core/provider/FontsContractCompat$FontInfo:isItalic	()Z
    //   192: invokespecial 321	androidx/core/graphics/TypefaceCompatApi26Impl:addFontFromBuffer	(Ljava/lang/Object;Ljava/nio/ByteBuffer;III)Z
    //   195: ifne +11 -> 206
    //   198: aload_0
    //   199: aload 6
    //   201: invokespecial 237	androidx/core/graphics/TypefaceCompatApi26Impl:abortCreation	(Ljava/lang/Object;)V
    //   204: aconst_null
    //   205: areturn
    //   206: iconst_1
    //   207: istore 8
    //   209: iinc 9 1
    //   212: goto -70 -> 142
    //   215: iload 8
    //   217: ifne +11 -> 228
    //   220: aload_0
    //   221: aload 6
    //   223: invokespecial 237	androidx/core/graphics/TypefaceCompatApi26Impl:abortCreation	(Ljava/lang/Object;)V
    //   226: aconst_null
    //   227: areturn
    //   228: aload_0
    //   229: aload 6
    //   231: invokespecial 239	androidx/core/graphics/TypefaceCompatApi26Impl:freeze	(Ljava/lang/Object;)Z
    //   234: ifne +5 -> 239
    //   237: aconst_null
    //   238: areturn
    //   239: aload_0
    //   240: aload 6
    //   242: invokevirtual 241	androidx/core/graphics/TypefaceCompatApi26Impl:createFromFamiliesWithDefault	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   245: astore_1
    //   246: aload_1
    //   247: ifnonnull +5 -> 252
    //   250: aconst_null
    //   251: areturn
    //   252: aload_1
    //   253: iload 4
    //   255: invokestatic 325	android/graphics/Typeface:create	(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    //   258: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	this	TypefaceCompatApi26Impl
    //   0	259	1	paramContext	Context
    //   0	259	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	259	3	paramArrayOfFontInfo	androidx.core.provider.FontsContractCompat.FontInfo[]
    //   0	259	4	paramInt	int
    //   117	38	5	localMap	java.util.Map
    //   123	118	6	localObject	Object
    //   134	13	7	i	int
    //   137	79	8	j	int
    //   140	70	9	k	int
    // Exception table:
    //   from	to	target	type
    //   55	86	92	finally
    //   93	97	100	finally
    //   28	41	108	java/io/IOException
    //   49	53	108	java/io/IOException
    //   86	90	108	java/io/IOException
    //   101	106	108	java/io/IOException
    //   106	108	108	java/io/IOException
  }
  
  @Nullable
  public Typeface createFromResourcesFontFile(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    if (!isFontFamilyPrivateAPIAvailable()) {
      return super.createFromResourcesFontFile(paramContext, paramResources, paramInt1, paramString, paramInt2);
    }
    paramResources = newFamily();
    if (paramResources == null) {
      return null;
    }
    if (!addFontFromAssetManager(paramContext, paramResources, paramString, 0, -1, -1, null))
    {
      abortCreation(paramResources);
      return null;
    }
    if (!freeze(paramResources)) {
      return null;
    }
    return createFromFamiliesWithDefault(paramResources);
  }
  
  @NonNull
  public Typeface createWeightStyle(@NonNull Context paramContext, @NonNull Typeface paramTypeface, int paramInt, boolean paramBoolean)
  {
    Object localObject1;
    try
    {
      Typeface localTypeface = WeightTypefaceApi26.createWeightStyle(paramTypeface, paramInt, paramBoolean);
    }
    catch (RuntimeException localRuntimeException)
    {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = super.createWeightStyle(paramContext, paramTypeface, paramInt, paramBoolean);
    }
    return (Typeface)localObject2;
  }
  
  public Method obtainAbortCreationMethod(Class<?> paramClass)
    throws NoSuchMethodException
  {
    return paramClass.getMethod("abortCreation", new Class[0]);
  }
  
  public Method obtainAddFontFromAssetManagerMethod(Class<?> paramClass)
    throws NoSuchMethodException
  {
    Class localClass = Integer.TYPE;
    return paramClass.getMethod("addFontFromAssetManager", new Class[] { AssetManager.class, String.class, localClass, Boolean.TYPE, localClass, localClass, localClass, FontVariationAxis[].class });
  }
  
  public Method obtainAddFontFromBufferMethod(Class<?> paramClass)
    throws NoSuchMethodException
  {
    Class localClass = Integer.TYPE;
    return paramClass.getMethod("addFontFromBuffer", new Class[] { ByteBuffer.class, localClass, FontVariationAxis[].class, localClass, localClass });
  }
  
  public Method obtainCreateFromFamiliesWithDefaultMethod(Class<?> paramClass)
    throws NoSuchMethodException
  {
    paramClass = Array.newInstance(paramClass, 1).getClass();
    Class localClass = Integer.TYPE;
    paramClass = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { paramClass, localClass, localClass });
    paramClass.setAccessible(true);
    return paramClass;
  }
  
  public Class<?> obtainFontFamily()
    throws ClassNotFoundException
  {
    return Class.forName("android.graphics.FontFamily");
  }
  
  public Constructor<?> obtainFontFamilyCtor(Class<?> paramClass)
    throws NoSuchMethodException
  {
    return paramClass.getConstructor(new Class[0]);
  }
  
  public Method obtainFreezeMethod(Class<?> paramClass)
    throws NoSuchMethodException
  {
    return paramClass.getMethod("freeze", new Class[0]);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.TypefaceCompatApi26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */