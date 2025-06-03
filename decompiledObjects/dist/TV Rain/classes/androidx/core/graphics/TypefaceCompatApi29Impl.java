package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.Font.Builder;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontFamily.Builder;
import android.graphics.fonts.FontStyle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat.FontInfo;
import c;
import java.io.IOException;
import java.io.InputStream;

@RequiresApi(29)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class TypefaceCompatApi29Impl
  extends TypefaceCompatBaseImpl
{
  private Font findBaseFont(@NonNull FontFamily paramFontFamily, int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      i = 700;
    } else {
      i = 400;
    }
    int j = 1;
    if ((paramInt & 0x2) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    FontStyle localFontStyle = new FontStyle(i, paramInt);
    Object localObject = paramFontFamily.getFont(0);
    int i = getMatchScore(localFontStyle, ((Font)localObject).getStyle());
    paramInt = j;
    for (j = i; paramInt < paramFontFamily.getSize(); j = i)
    {
      Font localFont = paramFontFamily.getFont(paramInt);
      int k = getMatchScore(localFontStyle, localFont.getStyle());
      i = j;
      if (k < j)
      {
        localObject = localFont;
        i = k;
      }
      paramInt++;
    }
    return (Font)localObject;
  }
  
  private static int getMatchScore(@NonNull FontStyle paramFontStyle1, @NonNull FontStyle paramFontStyle2)
  {
    int i = Math.abs(paramFontStyle1.getWeight() - paramFontStyle2.getWeight()) / 100;
    int j;
    if (paramFontStyle1.getSlant() == paramFontStyle2.getSlant()) {
      j = 0;
    } else {
      j = 2;
    }
    return i + j;
  }
  
  @Nullable
  public Typeface createFromFontFamilyFilesResourceEntry(Context paramContext, FontResourcesParserCompat.FontFamilyFilesResourceEntry paramFontFamilyFilesResourceEntry, Resources paramResources, int paramInt)
  {
    localObject1 = null;
    for (;;)
    {
      try
      {
        FontResourcesParserCompat.FontFileResourceEntry[] arrayOfFontFileResourceEntry = paramFontFamilyFilesResourceEntry.getEntries();
        int i = arrayOfFontFileResourceEntry.length;
        paramContext = null;
        j = 0;
        if (j < i) {
          paramFontFamilyFilesResourceEntry = arrayOfFontFileResourceEntry[j];
        }
      }
      catch (Exception paramContext)
      {
        int j;
        Object localObject2;
        int k;
        paramContext = (Context)localObject1;
        continue;
      }
      try
      {
        localObject2 = new android/graphics/fonts/Font$Builder;
        ((Font.Builder)localObject2).<init>(paramResources, paramFontFamilyFilesResourceEntry.getResourceId());
        localObject2 = ((Font.Builder)localObject2).setWeight(paramFontFamilyFilesResourceEntry.getWeight());
        if (paramFontFamilyFilesResourceEntry.isItalic()) {
          k = 1;
        } else {
          k = 0;
        }
        localObject2 = ((Font.Builder)localObject2).setSlant(k).setTtcIndex(paramFontFamilyFilesResourceEntry.getTtcIndex()).setFontVariationSettings(paramFontFamilyFilesResourceEntry.getVariationSettings()).build();
        if (paramContext == null)
        {
          paramFontFamilyFilesResourceEntry = new android/graphics/fonts/FontFamily$Builder;
          paramFontFamilyFilesResourceEntry.<init>((Font)localObject2);
          paramContext = paramFontFamilyFilesResourceEntry;
        }
        else
        {
          paramContext.addFont((Font)localObject2);
        }
        j++;
      }
      catch (IOException paramFontFamilyFilesResourceEntry) {}
    }
    if (paramContext == null) {
      return null;
    }
    paramContext = paramContext.build();
    paramFontFamilyFilesResourceEntry = new android/graphics/Typeface$CustomFallbackBuilder;
    paramFontFamilyFilesResourceEntry.<init>(paramContext);
    paramContext = paramFontFamilyFilesResourceEntry.setStyle(findBaseFont(paramContext, paramInt).getStyle()).build();
    return paramContext;
  }
  
  /* Error */
  @Nullable
  public Typeface createFromFontInfo(Context paramContext, @Nullable android.os.CancellationSignal paramCancellationSignal, @NonNull FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 144	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 5
    //   6: aload_3
    //   7: arraylength
    //   8: istore 6
    //   10: aconst_null
    //   11: astore_1
    //   12: iconst_0
    //   13: istore 7
    //   15: iload 7
    //   17: iload 6
    //   19: if_icmpge +183 -> 202
    //   22: aload_3
    //   23: iload 7
    //   25: aaload
    //   26: astore 8
    //   28: aload_1
    //   29: astore 9
    //   31: aload 5
    //   33: aload 8
    //   35: invokevirtual 150	androidx/core/provider/FontsContractCompat$FontInfo:getUri	()Landroid/net/Uri;
    //   38: ldc -104
    //   40: aload_2
    //   41: invokevirtual 158	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   44: astore 10
    //   46: aload 10
    //   48: ifnonnull +25 -> 73
    //   51: aload_1
    //   52: astore 9
    //   54: aload 10
    //   56: ifnull +137 -> 193
    //   59: aload_1
    //   60: astore 9
    //   62: aload 10
    //   64: invokevirtual 163	android/os/ParcelFileDescriptor:close	()V
    //   67: aload_1
    //   68: astore 9
    //   70: goto +123 -> 193
    //   73: new 71	android/graphics/fonts/Font$Builder
    //   76: astore 9
    //   78: aload 9
    //   80: aload 10
    //   82: invokespecial 166	android/graphics/fonts/Font$Builder:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   85: aload 9
    //   87: aload 8
    //   89: invokevirtual 167	androidx/core/provider/FontsContractCompat$FontInfo:getWeight	()I
    //   92: invokevirtual 84	android/graphics/fonts/Font$Builder:setWeight	(I)Landroid/graphics/fonts/Font$Builder;
    //   95: astore 9
    //   97: aload 8
    //   99: invokevirtual 168	androidx/core/provider/FontsContractCompat$FontInfo:isItalic	()Z
    //   102: ifeq +9 -> 111
    //   105: iconst_1
    //   106: istore 11
    //   108: goto +6 -> 114
    //   111: iconst_0
    //   112: istore 11
    //   114: aload 9
    //   116: iload 11
    //   118: invokevirtual 91	android/graphics/fonts/Font$Builder:setSlant	(I)Landroid/graphics/fonts/Font$Builder;
    //   121: aload 8
    //   123: invokevirtual 169	androidx/core/provider/FontsContractCompat$FontInfo:getTtcIndex	()I
    //   126: invokevirtual 97	android/graphics/fonts/Font$Builder:setTtcIndex	(I)Landroid/graphics/fonts/Font$Builder;
    //   129: invokevirtual 109	android/graphics/fonts/Font$Builder:build	()Landroid/graphics/fonts/Font;
    //   132: astore 9
    //   134: aload_1
    //   135: ifnonnull +20 -> 155
    //   138: new 111	android/graphics/fonts/FontFamily$Builder
    //   141: dup
    //   142: aload 9
    //   144: invokespecial 114	android/graphics/fonts/FontFamily$Builder:<init>	(Landroid/graphics/fonts/Font;)V
    //   147: astore 9
    //   149: aload 9
    //   151: astore_1
    //   152: goto -93 -> 59
    //   155: aload_1
    //   156: aload 9
    //   158: invokevirtual 118	android/graphics/fonts/FontFamily$Builder:addFont	(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    //   161: pop
    //   162: goto -103 -> 59
    //   165: astore 8
    //   167: aload 10
    //   169: invokevirtual 163	android/os/ParcelFileDescriptor:close	()V
    //   172: goto +15 -> 187
    //   175: astore 10
    //   177: aload_1
    //   178: astore 9
    //   180: aload 8
    //   182: aload 10
    //   184: invokevirtual 175	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   187: aload_1
    //   188: astore 9
    //   190: aload 8
    //   192: athrow
    //   193: iinc 7 1
    //   196: aload 9
    //   198: astore_1
    //   199: goto -184 -> 15
    //   202: aload_1
    //   203: ifnonnull +5 -> 208
    //   206: aconst_null
    //   207: areturn
    //   208: aload_1
    //   209: invokevirtual 121	android/graphics/fonts/FontFamily$Builder:build	()Landroid/graphics/fonts/FontFamily;
    //   212: astore_1
    //   213: new 123	android/graphics/Typeface$CustomFallbackBuilder
    //   216: astore_2
    //   217: aload_2
    //   218: aload_1
    //   219: invokespecial 126	android/graphics/Typeface$CustomFallbackBuilder:<init>	(Landroid/graphics/fonts/FontFamily;)V
    //   222: aload_2
    //   223: aload_0
    //   224: aload_1
    //   225: iload 4
    //   227: invokespecial 128	androidx/core/graphics/TypefaceCompatApi29Impl:findBaseFont	(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;
    //   230: invokevirtual 35	android/graphics/fonts/Font:getStyle	()Landroid/graphics/fonts/FontStyle;
    //   233: invokevirtual 132	android/graphics/Typeface$CustomFallbackBuilder:setStyle	(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
    //   236: invokevirtual 135	android/graphics/Typeface$CustomFallbackBuilder:build	()Landroid/graphics/Typeface;
    //   239: astore_1
    //   240: aload_1
    //   241: areturn
    //   242: astore_1
    //   243: aconst_null
    //   244: areturn
    //   245: astore_1
    //   246: goto -53 -> 193
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	249	0	this	TypefaceCompatApi29Impl
    //   0	249	1	paramContext	Context
    //   0	249	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	249	3	paramArrayOfFontInfo	FontsContractCompat.FontInfo[]
    //   0	249	4	paramInt	int
    //   4	28	5	localContentResolver	android.content.ContentResolver
    //   8	12	6	i	int
    //   13	181	7	j	int
    //   26	96	8	localFontInfo	FontsContractCompat.FontInfo
    //   165	26	8	localObject1	Object
    //   29	168	9	localObject2	Object
    //   44	124	10	localParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   175	8	10	localThrowable	Throwable
    //   106	11	11	k	int
    // Exception table:
    //   from	to	target	type
    //   73	105	165	finally
    //   114	134	165	finally
    //   138	149	165	finally
    //   155	162	165	finally
    //   167	172	175	finally
    //   6	10	242	java/lang/Exception
    //   31	46	242	java/lang/Exception
    //   62	67	242	java/lang/Exception
    //   180	187	242	java/lang/Exception
    //   190	193	242	java/lang/Exception
    //   208	240	242	java/lang/Exception
    //   31	46	245	java/io/IOException
    //   62	67	245	java/io/IOException
    //   180	187	245	java/io/IOException
    //   190	193	245	java/io/IOException
  }
  
  public Typeface createFromInputStream(Context paramContext, InputStream paramInputStream)
  {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
  
  @Nullable
  public Typeface createFromResourcesFontFile(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    try
    {
      paramContext = new android/graphics/fonts/Font$Builder;
      paramContext.<init>(paramResources, paramInt1);
      paramContext = paramContext.build();
      paramResources = new android/graphics/fonts/FontFamily$Builder;
      paramResources.<init>(paramContext);
      paramResources = paramResources.build();
      paramString = new android/graphics/Typeface$CustomFallbackBuilder;
      paramString.<init>(paramResources);
      paramContext = paramString.setStyle(paramContext.getStyle()).build();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  @NonNull
  public Typeface createWeightStyle(@NonNull Context paramContext, @NonNull Typeface paramTypeface, int paramInt, boolean paramBoolean)
  {
    return c.d(paramTypeface, paramInt, paramBoolean);
  }
  
  public FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.TypefaceCompatApi29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */