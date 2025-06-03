package A;

import F.g.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.Font.Builder;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontFamily.Builder;
import android.graphics.fonts.FontStyle;
import java.io.IOException;
import z.e.c;
import z.e.d;

public class m
  extends n
{
  public static int i(FontStyle paramFontStyle1, FontStyle paramFontStyle2)
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
  
  public Typeface a(Context paramContext, e.c paramc, Resources paramResources, int paramInt)
  {
    localObject1 = null;
    for (;;)
    {
      try
      {
        e.d[] arrayOfd = paramc.a();
        int i = arrayOfd.length;
        j = 0;
        paramContext = null;
        if (j < i) {
          paramc = arrayOfd[j];
        }
      }
      catch (Exception paramContext)
      {
        int j;
        Object localObject2;
        paramContext = (Context)localObject1;
        continue;
      }
      try
      {
        localObject2 = new android/graphics/fonts/Font$Builder;
        ((Font.Builder)localObject2).<init>(paramResources, paramc.b());
        localObject2 = ((Font.Builder)localObject2).setWeight(paramc.e()).setSlant(paramc.f()).setTtcIndex(paramc.c()).setFontVariationSettings(paramc.d()).build();
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
    paramContext = paramc.setStyle(h(paramContext, paramInt).getStyle()).build();
    return paramContext;
  }
  
  /* Error */
  public Typeface b(Context paramContext, android.os.CancellationSignal paramCancellationSignal, g.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 120	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 5
    //   6: aload_3
    //   7: arraylength
    //   8: istore 6
    //   10: iconst_0
    //   11: istore 7
    //   13: aconst_null
    //   14: astore_1
    //   15: iload 7
    //   17: iload 6
    //   19: if_icmpge +168 -> 187
    //   22: aload_3
    //   23: iload 7
    //   25: aaload
    //   26: astore 8
    //   28: aload_1
    //   29: astore 9
    //   31: aload 5
    //   33: aload 8
    //   35: invokevirtual 125	F/g$b:d	()Landroid/net/Uri;
    //   38: ldc 127
    //   40: aload_2
    //   41: invokevirtual 133	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   44: astore 10
    //   46: aload 10
    //   48: ifnonnull +25 -> 73
    //   51: aload_1
    //   52: astore 9
    //   54: aload 10
    //   56: ifnull +122 -> 178
    //   59: aload_1
    //   60: astore 9
    //   62: aload 10
    //   64: invokevirtual 138	android/os/ParcelFileDescriptor:close	()V
    //   67: aload_1
    //   68: astore 9
    //   70: goto +108 -> 178
    //   73: new 39	android/graphics/fonts/Font$Builder
    //   76: astore 9
    //   78: aload 9
    //   80: aload 10
    //   82: invokespecial 141	android/graphics/fonts/Font$Builder:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   85: aload 9
    //   87: aload 8
    //   89: invokevirtual 142	F/g$b:e	()I
    //   92: invokevirtual 54	android/graphics/fonts/Font$Builder:setWeight	(I)Landroid/graphics/fonts/Font$Builder;
    //   95: aload 8
    //   97: invokevirtual 143	F/g$b:f	()Z
    //   100: invokevirtual 61	android/graphics/fonts/Font$Builder:setSlant	(I)Landroid/graphics/fonts/Font$Builder;
    //   103: aload 8
    //   105: invokevirtual 144	F/g$b:c	()I
    //   108: invokevirtual 67	android/graphics/fonts/Font$Builder:setTtcIndex	(I)Landroid/graphics/fonts/Font$Builder;
    //   111: invokevirtual 79	android/graphics/fonts/Font$Builder:build	()Landroid/graphics/fonts/Font;
    //   114: astore 9
    //   116: aload_1
    //   117: ifnonnull +25 -> 142
    //   120: new 81	android/graphics/fonts/FontFamily$Builder
    //   123: dup
    //   124: aload 9
    //   126: invokespecial 84	android/graphics/fonts/FontFamily$Builder:<init>	(Landroid/graphics/fonts/Font;)V
    //   129: astore 9
    //   131: aload 9
    //   133: astore_1
    //   134: goto -75 -> 59
    //   137: astore 8
    //   139: goto +13 -> 152
    //   142: aload_1
    //   143: aload 9
    //   145: invokevirtual 88	android/graphics/fonts/FontFamily$Builder:addFont	(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    //   148: pop
    //   149: goto -90 -> 59
    //   152: aload 10
    //   154: invokevirtual 138	android/os/ParcelFileDescriptor:close	()V
    //   157: goto +15 -> 172
    //   160: astore 10
    //   162: aload_1
    //   163: astore 9
    //   165: aload 8
    //   167: aload 10
    //   169: invokevirtual 150	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   172: aload_1
    //   173: astore 9
    //   175: aload 8
    //   177: athrow
    //   178: iinc 7 1
    //   181: aload 9
    //   183: astore_1
    //   184: goto -169 -> 15
    //   187: aload_1
    //   188: ifnonnull +5 -> 193
    //   191: aconst_null
    //   192: areturn
    //   193: aload_1
    //   194: invokevirtual 91	android/graphics/fonts/FontFamily$Builder:build	()Landroid/graphics/fonts/FontFamily;
    //   197: astore_2
    //   198: new 93	android/graphics/Typeface$CustomFallbackBuilder
    //   201: astore_1
    //   202: aload_1
    //   203: aload_2
    //   204: invokespecial 96	android/graphics/Typeface$CustomFallbackBuilder:<init>	(Landroid/graphics/fonts/FontFamily;)V
    //   207: aload_1
    //   208: aload_0
    //   209: aload_2
    //   210: iload 4
    //   212: invokevirtual 100	A/m:h	(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;
    //   215: invokevirtual 106	android/graphics/fonts/Font:getStyle	()Landroid/graphics/fonts/FontStyle;
    //   218: invokevirtual 110	android/graphics/Typeface$CustomFallbackBuilder:setStyle	(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
    //   221: invokevirtual 113	android/graphics/Typeface$CustomFallbackBuilder:build	()Landroid/graphics/Typeface;
    //   224: astore_1
    //   225: aload_1
    //   226: areturn
    //   227: astore_1
    //   228: aconst_null
    //   229: areturn
    //   230: astore_1
    //   231: goto -53 -> 178
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	m
    //   0	234	1	paramContext	Context
    //   0	234	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	234	3	paramArrayOfb	g.b[]
    //   0	234	4	paramInt	int
    //   4	28	5	localContentResolver	android.content.ContentResolver
    //   8	12	6	i	int
    //   11	168	7	j	int
    //   26	78	8	localb	g.b
    //   137	39	8	localObject1	Object
    //   29	153	9	localObject2	Object
    //   44	109	10	localParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   160	8	10	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   73	116	137	finally
    //   120	131	137	finally
    //   142	149	137	finally
    //   152	157	160	finally
    //   6	10	227	java/lang/Exception
    //   31	46	227	java/lang/Exception
    //   62	67	227	java/lang/Exception
    //   165	172	227	java/lang/Exception
    //   175	178	227	java/lang/Exception
    //   193	225	227	java/lang/Exception
    //   31	46	230	java/io/IOException
    //   62	67	230	java/io/IOException
    //   165	172	230	java/io/IOException
    //   175	178	230	java/io/IOException
  }
  
  public Typeface d(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
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
  
  public g.b g(g.b[] paramArrayOfb, int paramInt)
  {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
  
  public final Font h(FontFamily paramFontFamily, int paramInt)
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
    int i = i(localFontStyle, ((Font)localObject).getStyle());
    paramInt = j;
    for (j = i; paramInt < paramFontFamily.getSize(); j = i)
    {
      Font localFont = paramFontFamily.getFont(paramInt);
      int k = i(localFontStyle, localFont.getStyle());
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
}

/* Location:
 * Qualified Name:     A.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */