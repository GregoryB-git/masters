package a2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import y.a;
import y.a.a;

public final class b
  extends e
  implements Animatable
{
  public b b;
  public Context c;
  public final a d;
  
  public b()
  {
    this(null);
  }
  
  public b(Context paramContext)
  {
    a locala = new a();
    d = locala;
    c = paramContext;
    b = new b(locala);
  }
  
  public final void applyTheme(Resources.Theme paramTheme)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      a.a.a(localDrawable, paramTheme);
    }
  }
  
  public final boolean canApplyTheme()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return a.a.b(localDrawable);
    }
    return false;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.draw(paramCanvas);
      return;
    }
    b.a.draw(paramCanvas);
    if (b.b.isStarted()) {
      invalidateSelf();
    }
  }
  
  public final int getAlpha()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getAlpha();
    }
    return b.a.getAlpha();
  }
  
  public final int getChangingConfigurations()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getChangingConfigurations();
    }
    int i = super.getChangingConfigurations();
    b.getClass();
    return i | 0x0;
  }
  
  public final ColorFilter getColorFilter()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return a.a.c(localDrawable);
    }
    return b.a.getColorFilter();
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if ((a != null) && (Build.VERSION.SDK_INT >= 24)) {
      return new c(a.getConstantState());
    }
    return null;
  }
  
  public final int getIntrinsicHeight()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicHeight();
    }
    return b.a.getIntrinsicHeight();
  }
  
  public final int getIntrinsicWidth()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicWidth();
    }
    return b.a.getIntrinsicWidth();
  }
  
  public final int getOpacity()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getOpacity();
    }
    return b.a.getOpacity();
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  /* Error */
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 44	a2/e:a	Landroid/graphics/drawable/Drawable;
    //   4: astore 5
    //   6: aload 5
    //   8: ifnull +14 -> 22
    //   11: aload 5
    //   13: aload_1
    //   14: aload_2
    //   15: aload_3
    //   16: aload 4
    //   18: invokestatic 135	y/a$a:d	(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    //   21: return
    //   22: aload_2
    //   23: invokeinterface 140 1 0
    //   28: istore 6
    //   30: aload_2
    //   31: invokeinterface 143 1 0
    //   36: istore 7
    //   38: iload 6
    //   40: iconst_1
    //   41: if_icmpeq +753 -> 794
    //   44: aload_2
    //   45: invokeinterface 143 1 0
    //   50: iload 7
    //   52: iconst_1
    //   53: iadd
    //   54: if_icmpge +9 -> 63
    //   57: iload 6
    //   59: iconst_3
    //   60: if_icmpeq +734 -> 794
    //   63: iload 6
    //   65: iconst_2
    //   66: if_icmpne +717 -> 783
    //   69: aload_2
    //   70: invokeinterface 147 1 0
    //   75: astore 8
    //   77: ldc -107
    //   79: aload 8
    //   81: invokevirtual 155	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   84: istore 9
    //   86: aconst_null
    //   87: astore 10
    //   89: aconst_null
    //   90: astore 11
    //   92: aconst_null
    //   93: astore 5
    //   95: iload 9
    //   97: ifeq +248 -> 345
    //   100: aload_1
    //   101: aload 4
    //   103: aload_3
    //   104: getstatic 161	a2/a:e	[I
    //   107: invokestatic 167	w/k:f	(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   110: astore 8
    //   112: aload 8
    //   114: iconst_0
    //   115: iconst_0
    //   116: invokevirtual 173	android/content/res/TypedArray:getResourceId	(II)I
    //   119: istore 6
    //   121: iload 6
    //   123: ifeq +214 -> 337
    //   126: getstatic 177	a2/f:r	Landroid/graphics/PorterDuff$Mode;
    //   129: astore 5
    //   131: getstatic 106	android/os/Build$VERSION:SDK_INT	I
    //   134: bipush 24
    //   136: if_icmplt +49 -> 185
    //   139: new 65	a2/f
    //   142: dup
    //   143: invokespecial 178	a2/f:<init>	()V
    //   146: astore 5
    //   148: getstatic 183	w/f:a	Ljava/lang/ThreadLocal;
    //   151: astore 10
    //   153: aload 5
    //   155: aload_1
    //   156: iload 6
    //   158: aload 4
    //   160: invokestatic 188	w/f$a:a	(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    //   163: putfield 44	a2/e:a	Landroid/graphics/drawable/Drawable;
    //   166: new 190	a2/f$h
    //   169: dup
    //   170: aload 5
    //   172: getfield 44	a2/e:a	Landroid/graphics/drawable/Drawable;
    //   175: invokevirtual 108	android/graphics/drawable/Drawable:getConstantState	()Landroid/graphics/drawable/Drawable$ConstantState;
    //   178: invokespecial 191	a2/f$h:<init>	(Landroid/graphics/drawable/Drawable$ConstantState;)V
    //   181: pop
    //   182: goto +111 -> 293
    //   185: aload_1
    //   186: iload 6
    //   188: invokevirtual 197	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
    //   191: astore 10
    //   193: aload 10
    //   195: invokestatic 203	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   198: astore 11
    //   200: aload 10
    //   202: invokeinterface 206 1 0
    //   207: istore 6
    //   209: iload 6
    //   211: iconst_2
    //   212: if_icmpeq +12 -> 224
    //   215: iload 6
    //   217: iconst_1
    //   218: if_icmpeq +6 -> 224
    //   221: goto -21 -> 200
    //   224: iload 6
    //   226: iconst_2
    //   227: if_icmpne +38 -> 265
    //   230: new 65	a2/f
    //   233: astore 5
    //   235: aload 5
    //   237: invokespecial 178	a2/f:<init>	()V
    //   240: aload 5
    //   242: aload_1
    //   243: aload 10
    //   245: aload 11
    //   247: aload 4
    //   249: invokevirtual 207	a2/f:inflate	(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    //   252: goto +41 -> 293
    //   255: astore 5
    //   257: goto +23 -> 280
    //   260: astore 5
    //   262: goto +18 -> 280
    //   265: new 130	org/xmlpull/v1/XmlPullParserException
    //   268: astore 5
    //   270: aload 5
    //   272: ldc -47
    //   274: invokespecial 212	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   277: aload 5
    //   279: athrow
    //   280: ldc -42
    //   282: ldc -40
    //   284: aload 5
    //   286: invokestatic 221	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   289: pop
    //   290: aconst_null
    //   291: astore 5
    //   293: aload 5
    //   295: iconst_0
    //   296: putfield 224	a2/f:f	Z
    //   299: aload 5
    //   301: aload_0
    //   302: getfield 31	a2/b:d	La2/b$a;
    //   305: invokevirtual 228	android/graphics/drawable/Drawable:setCallback	(Landroid/graphics/drawable/Drawable$Callback;)V
    //   308: aload_0
    //   309: getfield 38	a2/b:b	La2/b$b;
    //   312: getfield 63	a2/b$b:a	La2/f;
    //   315: astore 10
    //   317: aload 10
    //   319: ifnull +9 -> 328
    //   322: aload 10
    //   324: aconst_null
    //   325: invokevirtual 228	android/graphics/drawable/Drawable:setCallback	(Landroid/graphics/drawable/Drawable$Callback;)V
    //   328: aload_0
    //   329: getfield 38	a2/b:b	La2/b$b;
    //   332: aload 5
    //   334: putfield 63	a2/b$b:a	La2/f;
    //   337: aload 8
    //   339: invokevirtual 231	android/content/res/TypedArray:recycle	()V
    //   342: goto +441 -> 783
    //   345: ldc -23
    //   347: aload 8
    //   349: invokevirtual 155	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   352: ifeq +431 -> 783
    //   355: aload_1
    //   356: aload_3
    //   357: getstatic 235	a2/a:f	[I
    //   360: invokevirtual 239	android/content/res/Resources:obtainAttributes	(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   363: astore 12
    //   365: aload 12
    //   367: iconst_0
    //   368: invokevirtual 243	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   371: astore 13
    //   373: aload 12
    //   375: iconst_1
    //   376: iconst_0
    //   377: invokevirtual 173	android/content/res/TypedArray:getResourceId	(II)I
    //   380: istore 6
    //   382: iload 6
    //   384: ifeq +394 -> 778
    //   387: aload_0
    //   388: getfield 33	a2/b:c	Landroid/content/Context;
    //   391: astore 14
    //   393: aload 14
    //   395: ifnull +367 -> 762
    //   398: getstatic 106	android/os/Build$VERSION:SDK_INT	I
    //   401: bipush 24
    //   403: if_icmplt +15 -> 418
    //   406: aload 14
    //   408: iload 6
    //   410: invokestatic 249	android/animation/AnimatorInflater:loadAnimator	(Landroid/content/Context;I)Landroid/animation/Animator;
    //   413: astore 5
    //   415: goto +53 -> 468
    //   418: aload 14
    //   420: invokevirtual 255	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   423: astore 15
    //   425: aload 14
    //   427: invokevirtual 259	android/content/Context:getTheme	()Landroid/content/res/Resources$Theme;
    //   430: astore 16
    //   432: aload 15
    //   434: iload 6
    //   436: invokevirtual 262	android/content/res/Resources:getAnimation	(I)Landroid/content/res/XmlResourceParser;
    //   439: astore 8
    //   441: aload 14
    //   443: aload 15
    //   445: aload 16
    //   447: aload 8
    //   449: aload 8
    //   451: invokestatic 203	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   454: aconst_null
    //   455: iconst_0
    //   456: invokestatic 267	a2/c:a	(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;I)Landroid/animation/Animator;
    //   459: astore 5
    //   461: aload 8
    //   463: invokeinterface 272 1 0
    //   468: aload 5
    //   470: aload_0
    //   471: getfield 38	a2/b:b	La2/b$b;
    //   474: getfield 63	a2/b$b:a	La2/f;
    //   477: getfield 275	a2/f:b	La2/f$g;
    //   480: getfield 280	a2/f$g:b	La2/f$f;
    //   483: getfield 286	a2/f$f:o	Lr/b;
    //   486: aload 13
    //   488: aconst_null
    //   489: invokevirtual 292	r/h:getOrDefault	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   492: invokevirtual 298	android/animation/Animator:setTarget	(Ljava/lang/Object;)V
    //   495: aload_0
    //   496: getfield 38	a2/b:b	La2/b$b;
    //   499: astore 8
    //   501: aload 8
    //   503: getfield 301	a2/b$b:c	Ljava/util/ArrayList;
    //   506: ifnonnull +29 -> 535
    //   509: aload 8
    //   511: new 303	java/util/ArrayList
    //   514: dup
    //   515: invokespecial 304	java/util/ArrayList:<init>	()V
    //   518: putfield 301	a2/b$b:c	Ljava/util/ArrayList;
    //   521: aload_0
    //   522: getfield 38	a2/b:b	La2/b$b;
    //   525: new 306	r/b
    //   528: dup
    //   529: invokespecial 307	r/b:<init>	()V
    //   532: putfield 309	a2/b$b:d	Lr/b;
    //   535: aload_0
    //   536: getfield 38	a2/b:b	La2/b$b;
    //   539: getfield 301	a2/b$b:c	Ljava/util/ArrayList;
    //   542: aload 5
    //   544: invokevirtual 312	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   547: pop
    //   548: aload_0
    //   549: getfield 38	a2/b:b	La2/b$b;
    //   552: getfield 309	a2/b$b:d	Lr/b;
    //   555: aload 5
    //   557: aload 13
    //   559: invokevirtual 315	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   562: pop
    //   563: goto +215 -> 778
    //   566: astore_1
    //   567: aload 8
    //   569: astore 5
    //   571: goto +177 -> 748
    //   574: astore_2
    //   575: aload 8
    //   577: astore_1
    //   578: goto +18 -> 596
    //   581: astore_2
    //   582: aload 8
    //   584: astore_1
    //   585: goto +89 -> 674
    //   588: astore_1
    //   589: goto +159 -> 748
    //   592: astore_2
    //   593: aload 10
    //   595: astore_1
    //   596: aload_1
    //   597: astore 5
    //   599: new 317	android/content/res/Resources$NotFoundException
    //   602: astore 4
    //   604: aload_1
    //   605: astore 5
    //   607: new 319	java/lang/StringBuilder
    //   610: astore_3
    //   611: aload_1
    //   612: astore 5
    //   614: aload_3
    //   615: invokespecial 320	java/lang/StringBuilder:<init>	()V
    //   618: aload_1
    //   619: astore 5
    //   621: aload_3
    //   622: ldc_w 322
    //   625: invokevirtual 326	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   628: pop
    //   629: aload_1
    //   630: astore 5
    //   632: aload_3
    //   633: iload 6
    //   635: invokestatic 331	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   638: invokevirtual 326	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   641: pop
    //   642: aload_1
    //   643: astore 5
    //   645: aload 4
    //   647: aload_3
    //   648: invokevirtual 334	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   651: invokespecial 335	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   654: aload_1
    //   655: astore 5
    //   657: aload 4
    //   659: aload_2
    //   660: invokevirtual 341	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   663: pop
    //   664: aload_1
    //   665: astore 5
    //   667: aload 4
    //   669: athrow
    //   670: astore_2
    //   671: aload 11
    //   673: astore_1
    //   674: aload_1
    //   675: astore 5
    //   677: new 317	android/content/res/Resources$NotFoundException
    //   680: astore 4
    //   682: aload_1
    //   683: astore 5
    //   685: new 319	java/lang/StringBuilder
    //   688: astore_3
    //   689: aload_1
    //   690: astore 5
    //   692: aload_3
    //   693: invokespecial 320	java/lang/StringBuilder:<init>	()V
    //   696: aload_1
    //   697: astore 5
    //   699: aload_3
    //   700: ldc_w 322
    //   703: invokevirtual 326	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   706: pop
    //   707: aload_1
    //   708: astore 5
    //   710: aload_3
    //   711: iload 6
    //   713: invokestatic 331	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   716: invokevirtual 326	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   719: pop
    //   720: aload_1
    //   721: astore 5
    //   723: aload 4
    //   725: aload_3
    //   726: invokevirtual 334	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   729: invokespecial 335	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   732: aload_1
    //   733: astore 5
    //   735: aload 4
    //   737: aload_2
    //   738: invokevirtual 341	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   741: pop
    //   742: aload_1
    //   743: astore 5
    //   745: aload 4
    //   747: athrow
    //   748: aload 5
    //   750: ifnull +10 -> 760
    //   753: aload 5
    //   755: invokeinterface 272 1 0
    //   760: aload_1
    //   761: athrow
    //   762: aload 12
    //   764: invokevirtual 231	android/content/res/TypedArray:recycle	()V
    //   767: new 343	java/lang/IllegalStateException
    //   770: dup
    //   771: ldc_w 345
    //   774: invokespecial 346	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   777: athrow
    //   778: aload 12
    //   780: invokevirtual 231	android/content/res/TypedArray:recycle	()V
    //   783: aload_2
    //   784: invokeinterface 206 1 0
    //   789: istore 6
    //   791: goto -753 -> 38
    //   794: aload_0
    //   795: getfield 38	a2/b:b	La2/b$b;
    //   798: astore_1
    //   799: aload_1
    //   800: getfield 69	a2/b$b:b	Landroid/animation/AnimatorSet;
    //   803: ifnonnull +14 -> 817
    //   806: aload_1
    //   807: new 71	android/animation/AnimatorSet
    //   810: dup
    //   811: invokespecial 347	android/animation/AnimatorSet:<init>	()V
    //   814: putfield 69	a2/b$b:b	Landroid/animation/AnimatorSet;
    //   817: aload_1
    //   818: getfield 69	a2/b$b:b	Landroid/animation/AnimatorSet;
    //   821: aload_1
    //   822: getfield 301	a2/b$b:c	Ljava/util/ArrayList;
    //   825: invokevirtual 351	android/animation/AnimatorSet:playTogether	(Ljava/util/Collection;)V
    //   828: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	829	0	this	b
    //   0	829	1	paramResources	Resources
    //   0	829	2	paramXmlPullParser	XmlPullParser
    //   0	829	3	paramAttributeSet	AttributeSet
    //   0	829	4	paramTheme	Resources.Theme
    //   4	237	5	localObject1	Object
    //   255	1	5	localIOException	java.io.IOException
    //   260	1	5	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   268	486	5	localObject2	Object
    //   28	762	6	i	int
    //   36	18	7	j	int
    //   75	508	8	localObject3	Object
    //   84	12	9	bool	boolean
    //   87	507	10	localObject4	Object
    //   90	582	11	localAttributeSet	AttributeSet
    //   363	416	12	localTypedArray	android.content.res.TypedArray
    //   371	187	13	str	String
    //   391	51	14	localContext	Context
    //   423	21	15	localResources	Resources
    //   430	16	16	localTheme	Resources.Theme
    // Exception table:
    //   from	to	target	type
    //   185	200	255	java/io/IOException
    //   200	209	255	java/io/IOException
    //   230	252	255	java/io/IOException
    //   265	280	255	java/io/IOException
    //   185	200	260	org/xmlpull/v1/XmlPullParserException
    //   200	209	260	org/xmlpull/v1/XmlPullParserException
    //   230	252	260	org/xmlpull/v1/XmlPullParserException
    //   265	280	260	org/xmlpull/v1/XmlPullParserException
    //   441	461	566	finally
    //   441	461	574	java/io/IOException
    //   441	461	581	org/xmlpull/v1/XmlPullParserException
    //   432	441	588	finally
    //   599	604	588	finally
    //   607	611	588	finally
    //   614	618	588	finally
    //   621	629	588	finally
    //   632	642	588	finally
    //   645	654	588	finally
    //   657	664	588	finally
    //   667	670	588	finally
    //   677	682	588	finally
    //   685	689	588	finally
    //   692	696	588	finally
    //   699	707	588	finally
    //   710	720	588	finally
    //   723	732	588	finally
    //   735	742	588	finally
    //   745	748	588	finally
    //   432	441	592	java/io/IOException
    //   432	441	670	org/xmlpull/v1/XmlPullParserException
  }
  
  public final boolean isAutoMirrored()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.isAutoMirrored();
    }
    return b.a.isAutoMirrored();
  }
  
  public final boolean isRunning()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return ((AnimatedVectorDrawable)localDrawable).isRunning();
    }
    return b.b.isRunning();
  }
  
  public final boolean isStateful()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.isStateful();
    }
    return b.a.isStateful();
  }
  
  public final Drawable mutate()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      localDrawable.mutate();
    }
    return this;
  }
  
  public final void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.setBounds(paramRect);
      return;
    }
    b.a.setBounds(paramRect);
  }
  
  public final boolean onLevelChange(int paramInt)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    return b.a.setLevel(paramInt);
  }
  
  public final boolean onStateChange(int[] paramArrayOfInt)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.setState(paramArrayOfInt);
    }
    return b.a.setState(paramArrayOfInt);
  }
  
  public final void setAlpha(int paramInt)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.setAlpha(paramInt);
      return;
    }
    b.a.setAlpha(paramInt);
  }
  
  public final void setAutoMirrored(boolean paramBoolean)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.setAutoMirrored(paramBoolean);
      return;
    }
    b.a.setAutoMirrored(paramBoolean);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.setColorFilter(paramColorFilter);
      return;
    }
    b.a.setColorFilter(paramColorFilter);
  }
  
  public final void setTint(int paramInt)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      a.a(localDrawable, paramInt);
      return;
    }
    b.a.setTint(paramInt);
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      a.b(localDrawable, paramColorStateList);
      return;
    }
    b.a.setTintList(paramColorStateList);
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      a.c(localDrawable, paramMode);
      return;
    }
    b.a.setTintMode(paramMode);
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    b.a.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public final void start()
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      ((AnimatedVectorDrawable)localDrawable).start();
      return;
    }
    if (b.b.isStarted()) {
      return;
    }
    b.b.start();
    invalidateSelf();
  }
  
  public final void stop()
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      ((AnimatedVectorDrawable)localDrawable).stop();
      return;
    }
    b.b.end();
  }
  
  public final class a
    implements Drawable.Callback
  {
    public a() {}
    
    public final void invalidateDrawable(Drawable paramDrawable)
    {
      invalidateSelf();
    }
    
    public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
    {
      scheduleSelf(paramRunnable, paramLong);
    }
    
    public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
    {
      unscheduleSelf(paramRunnable);
    }
  }
  
  public static final class b
    extends Drawable.ConstantState
  {
    public f a;
    public AnimatorSet b;
    public ArrayList<Animator> c;
    public r.b<Animator, String> d;
    
    public b(b.a parama) {}
    
    public final int getChangingConfigurations()
    {
      return 0;
    }
    
    public final Drawable newDrawable()
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
  }
  
  public static final class c
    extends Drawable.ConstantState
  {
    public final Drawable.ConstantState a;
    
    public c(Drawable.ConstantState paramConstantState)
    {
      a = paramConstantState;
    }
    
    public final boolean canApplyTheme()
    {
      return a.canApplyTheme();
    }
    
    public final int getChangingConfigurations()
    {
      return a.getChangingConfigurations();
    }
    
    public final Drawable newDrawable()
    {
      b localb = new b();
      Drawable localDrawable = a.newDrawable();
      a = localDrawable;
      localDrawable.setCallback(d);
      return localb;
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      b localb = new b();
      paramResources = a.newDrawable(paramResources);
      a = paramResources;
      paramResources.setCallback(d);
      return localb;
    }
    
    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      b localb = new b();
      paramResources = a.newDrawable(paramResources, paramTheme);
      a = paramResources;
      paramResources.setCallback(d);
      return localb;
    }
  }
}

/* Location:
 * Qualified Name:     a2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */