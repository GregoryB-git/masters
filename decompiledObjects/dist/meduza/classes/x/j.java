package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.Font.Builder;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontFamily.Builder;
import android.graphics.fonts.FontStyle;
import b0.n;
import java.io.IOException;
import java.io.InputStream;
import w.d.c;
import w.d.d;

public final class j
  extends l
{
  public static Font g(FontFamily paramFontFamily, int paramInt)
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
    int i = h(localFontStyle, ((Font)localObject).getStyle());
    paramInt = j;
    while (paramInt < paramFontFamily.getSize())
    {
      Font localFont = paramFontFamily.getFont(paramInt);
      int k = h(localFontStyle, localFont.getStyle());
      j = i;
      if (k < i)
      {
        localObject = localFont;
        j = k;
      }
      paramInt++;
      i = j;
    }
    return (Font)localObject;
  }
  
  public static int h(FontStyle paramFontStyle1, FontStyle paramFontStyle2)
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
  
  public final Typeface a(Context paramContext, d.c paramc, Resources paramResources, int paramInt)
  {
    localObject1 = null;
    for (;;)
    {
      try
      {
        d.d[] arrayOfd = a;
        int i = arrayOfd.length;
        paramContext = null;
        j = 0;
        if (j < i) {
          paramc = arrayOfd[j];
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
        ((Font.Builder)localObject2).<init>(paramResources, f);
        localObject2 = ((Font.Builder)localObject2).setWeight(b);
        if (c) {
          k = 1;
        } else {
          k = 0;
        }
        localObject2 = ((Font.Builder)localObject2).setSlant(k).setTtcIndex(e).setFontVariationSettings(d).build();
        if (paramContext == null)
        {
          paramc = new android/graphics/fonts/FontFamily$Builder;
          paramc.<init>((Font)localObject2);
          paramContext = paramc;
        }
        else
        {
          paramContext.addFont((Font)localObject2);
        }
        j++;
      }
      catch (IOException paramc) {}
    }
    if (paramContext == null) {
      return null;
    }
    paramContext = paramContext.build();
    paramc = new android/graphics/Typeface$CustomFallbackBuilder;
    paramc.<init>(paramContext);
    paramContext = paramc.setStyle(g(paramContext, paramInt).getStyle()).build();
    return paramContext;
  }
  
  /* Error */
  public final Typeface b(Context paramContext, n[] paramArrayOfn, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 135	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 4
    //   6: aload_2
    //   7: arraylength
    //   8: istore 5
    //   10: aconst_null
    //   11: astore_1
    //   12: iconst_0
    //   13: istore 6
    //   15: iload 6
    //   17: iload 5
    //   19: if_icmpge +183 -> 202
    //   22: aload_2
    //   23: iload 6
    //   25: aaload
    //   26: astore 7
    //   28: aload_1
    //   29: astore 8
    //   31: aload 4
    //   33: aload 7
    //   35: getfield 140	b0/n:a	Landroid/net/Uri;
    //   38: ldc -114
    //   40: aconst_null
    //   41: invokevirtual 148	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   44: astore 9
    //   46: aload 9
    //   48: ifnonnull +14 -> 62
    //   51: aload_1
    //   52: astore 8
    //   54: aload 9
    //   56: ifnull +137 -> 193
    //   59: goto +92 -> 151
    //   62: new 61	android/graphics/fonts/Font$Builder
    //   65: astore 8
    //   67: aload 8
    //   69: aload 9
    //   71: invokespecial 151	android/graphics/fonts/Font$Builder:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   74: aload 8
    //   76: aload 7
    //   78: getfield 153	b0/n:c	I
    //   81: invokevirtual 77	android/graphics/fonts/Font$Builder:setWeight	(I)Landroid/graphics/fonts/Font$Builder;
    //   84: astore 8
    //   86: aload 7
    //   88: getfield 155	b0/n:d	Z
    //   91: ifeq +9 -> 100
    //   94: iconst_1
    //   95: istore 10
    //   97: goto +6 -> 103
    //   100: iconst_0
    //   101: istore 10
    //   103: aload 8
    //   105: iload 10
    //   107: invokevirtual 84	android/graphics/fonts/Font$Builder:setSlant	(I)Landroid/graphics/fonts/Font$Builder;
    //   110: aload 7
    //   112: getfield 156	b0/n:b	I
    //   115: invokevirtual 90	android/graphics/fonts/Font$Builder:setTtcIndex	(I)Landroid/graphics/fonts/Font$Builder;
    //   118: invokevirtual 102	android/graphics/fonts/Font$Builder:build	()Landroid/graphics/fonts/Font;
    //   121: astore 8
    //   123: aload_1
    //   124: ifnonnull +20 -> 144
    //   127: new 104	android/graphics/fonts/FontFamily$Builder
    //   130: dup
    //   131: aload 8
    //   133: invokespecial 107	android/graphics/fonts/FontFamily$Builder:<init>	(Landroid/graphics/fonts/Font;)V
    //   136: astore 8
    //   138: aload 8
    //   140: astore_1
    //   141: goto +10 -> 151
    //   144: aload_1
    //   145: aload 8
    //   147: invokevirtual 111	android/graphics/fonts/FontFamily$Builder:addFont	(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    //   150: pop
    //   151: aload_1
    //   152: astore 8
    //   154: aload 9
    //   156: invokevirtual 161	android/os/ParcelFileDescriptor:close	()V
    //   159: aload_1
    //   160: astore 8
    //   162: goto +31 -> 193
    //   165: astore 7
    //   167: aload 9
    //   169: invokevirtual 161	android/os/ParcelFileDescriptor:close	()V
    //   172: goto +15 -> 187
    //   175: astore 9
    //   177: aload_1
    //   178: astore 8
    //   180: aload 7
    //   182: aload 9
    //   184: invokevirtual 167	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   187: aload_1
    //   188: astore 8
    //   190: aload 7
    //   192: athrow
    //   193: iinc 6 1
    //   196: aload 8
    //   198: astore_1
    //   199: goto -184 -> 15
    //   202: aload_1
    //   203: ifnonnull +5 -> 208
    //   206: aconst_null
    //   207: areturn
    //   208: aload_1
    //   209: invokevirtual 114	android/graphics/fonts/FontFamily$Builder:build	()Landroid/graphics/fonts/FontFamily;
    //   212: astore_1
    //   213: new 116	android/graphics/Typeface$CustomFallbackBuilder
    //   216: astore_2
    //   217: aload_2
    //   218: aload_1
    //   219: invokespecial 119	android/graphics/Typeface$CustomFallbackBuilder:<init>	(Landroid/graphics/fonts/FontFamily;)V
    //   222: aload_2
    //   223: aload_1
    //   224: iload_3
    //   225: invokestatic 121	x/j:g	(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;
    //   228: invokevirtual 28	android/graphics/fonts/Font:getStyle	()Landroid/graphics/fonts/FontStyle;
    //   231: invokevirtual 125	android/graphics/Typeface$CustomFallbackBuilder:setStyle	(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
    //   234: invokevirtual 128	android/graphics/Typeface$CustomFallbackBuilder:build	()Landroid/graphics/Typeface;
    //   237: astore_1
    //   238: aload_1
    //   239: areturn
    //   240: astore_1
    //   241: aconst_null
    //   242: areturn
    //   243: astore_1
    //   244: goto -51 -> 193
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	this	j
    //   0	247	1	paramContext	Context
    //   0	247	2	paramArrayOfn	n[]
    //   0	247	3	paramInt	int
    //   4	28	4	localContentResolver	android.content.ContentResolver
    //   8	12	5	i	int
    //   13	181	6	j	int
    //   26	85	7	localn	n
    //   165	26	7	localObject1	Object
    //   29	168	8	localObject2	Object
    //   44	124	9	localParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   175	8	9	localThrowable	Throwable
    //   95	11	10	k	int
    // Exception table:
    //   from	to	target	type
    //   62	94	165	finally
    //   103	123	165	finally
    //   127	138	165	finally
    //   144	151	165	finally
    //   167	172	175	finally
    //   6	10	240	java/lang/Exception
    //   31	46	240	java/lang/Exception
    //   154	159	240	java/lang/Exception
    //   180	187	240	java/lang/Exception
    //   190	193	240	java/lang/Exception
    //   208	238	240	java/lang/Exception
    //   31	46	243	java/io/IOException
    //   154	159	243	java/io/IOException
    //   180	187	243	java/io/IOException
    //   190	193	243	java/io/IOException
  }
  
  public final Typeface c(Context paramContext, InputStream paramInputStream)
  {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
  
  public final Typeface d(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    try
    {
      paramContext = new android/graphics/fonts/Font$Builder;
      paramContext.<init>(paramResources, paramInt1);
      paramContext = paramContext.build();
      paramResources = new android/graphics/fonts/FontFamily$Builder;
      paramResources.<init>(paramContext);
      paramString = paramResources.build();
      paramResources = new android/graphics/Typeface$CustomFallbackBuilder;
      paramResources.<init>(paramString);
      paramContext = paramResources.setStyle(paramContext.getStyle()).build();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public final n f(int paramInt, n[] paramArrayOfn)
  {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
}

/* Location:
 * Qualified Name:     x.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */