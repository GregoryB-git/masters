package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import b.a0;
import h.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.WeakHashMap;
import r.e;
import r.h;
import r.i;

public final class q0
{
  public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
  public static q0 i;
  public static final c j = new c();
  public WeakHashMap<Context, i<ColorStateList>> a;
  public h<String, e> b;
  public i<String> c;
  public final WeakHashMap<Context, e<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap(0);
  public TypedValue e;
  public boolean f;
  public f g;
  
  public static q0 d()
  {
    try
    {
      if (i == null)
      {
        localq0 = new l/q0;
        localq0.<init>();
        i = localq0;
        j(localq0);
      }
      q0 localq0 = i;
      return localq0;
    }
    finally {}
  }
  
  public static PorterDuffColorFilter h(int paramInt, PorterDuff.Mode paramMode)
  {
    try
    {
      c localc = j;
      localc.getClass();
      int k = (paramInt + 31) * 31;
      PorterDuffColorFilter localPorterDuffColorFilter1 = (PorterDuffColorFilter)localc.get(Integer.valueOf(paramMode.hashCode() + k));
      PorterDuffColorFilter localPorterDuffColorFilter2 = localPorterDuffColorFilter1;
      if (localPorterDuffColorFilter1 == null)
      {
        localPorterDuffColorFilter2 = new android/graphics/PorterDuffColorFilter;
        localPorterDuffColorFilter2.<init>(paramInt, paramMode);
        localc.getClass();
        paramMode = (PorterDuffColorFilter)localc.put(Integer.valueOf(paramMode.hashCode() + k), localPorterDuffColorFilter2);
      }
      return localPorterDuffColorFilter2;
    }
    finally {}
  }
  
  public static void j(q0 paramq0)
  {
    if (Build.VERSION.SDK_INT < 24)
    {
      paramq0.a("vector", new g());
      paramq0.a("animated-vector", new b());
      paramq0.a("animated-selector", new a());
      paramq0.a("drawable", new d());
    }
  }
  
  public final void a(String paramString, e parame)
  {
    if (b == null) {
      b = new h();
    }
    b.put(paramString, parame);
  }
  
  public final void b(Context paramContext, long paramLong, Drawable paramDrawable)
  {
    try
    {
      Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
      if (localConstantState != null)
      {
        e locale = (e)d.get(paramContext);
        paramDrawable = locale;
        if (locale == null)
        {
          paramDrawable = new r/e;
          paramDrawable.<init>();
          d.put(paramContext, paramDrawable);
        }
        paramContext = new java/lang/ref/WeakReference;
        paramContext.<init>(localConstantState);
        paramDrawable.e(paramContext, paramLong);
      }
      return;
    }
    finally {}
  }
  
  public final Drawable c(Context paramContext, int paramInt)
  {
    if (e == null) {
      e = new TypedValue();
    }
    TypedValue localTypedValue = e;
    paramContext.getResources().getValue(paramInt, localTypedValue, true);
    long l = assetCookie << 32 | data;
    Object localObject1 = e(paramContext, l);
    if (localObject1 != null) {
      return (Drawable)localObject1;
    }
    Object localObject2 = g;
    localObject1 = null;
    if (localObject2 != null) {
      if (paramInt == 2131230736)
      {
        localObject1 = new LayerDrawable(new Drawable[] { f(paramContext, 2131230735), f(paramContext, 2131230737) });
      }
      else
      {
        if (paramInt == 2131230771)
        {
          paramInt = 2131165243;
        }
        else if (paramInt == 2131230770)
        {
          paramInt = 2131165244;
        }
        else
        {
          if (paramInt != 2131230772) {
            break label438;
          }
          paramInt = 2131165245;
        }
        paramInt = paramContext.getResources().getDimensionPixelSize(paramInt);
        Object localObject3 = f(paramContext, 2131230783);
        Object localObject4 = f(paramContext, 2131230784);
        if (((localObject3 instanceof BitmapDrawable)) && (((Drawable)localObject3).getIntrinsicWidth() == paramInt) && (((Drawable)localObject3).getIntrinsicHeight() == paramInt))
        {
          localObject2 = (BitmapDrawable)localObject3;
          localObject1 = new BitmapDrawable(((BitmapDrawable)localObject2).getBitmap());
        }
        else
        {
          localObject1 = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
          localObject2 = new Canvas((Bitmap)localObject1);
          ((Drawable)localObject3).setBounds(0, 0, paramInt, paramInt);
          ((Drawable)localObject3).draw((Canvas)localObject2);
          localObject2 = new BitmapDrawable((Bitmap)localObject1);
          localObject1 = new BitmapDrawable((Bitmap)localObject1);
        }
        ((BitmapDrawable)localObject1).setTileModeX(Shader.TileMode.REPEAT);
        if (((localObject4 instanceof BitmapDrawable)) && (((Drawable)localObject4).getIntrinsicWidth() == paramInt) && (((Drawable)localObject4).getIntrinsicHeight() == paramInt))
        {
          localObject4 = (BitmapDrawable)localObject4;
        }
        else
        {
          Bitmap localBitmap = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
          localObject3 = new Canvas(localBitmap);
          ((Drawable)localObject4).setBounds(0, 0, paramInt, paramInt);
          ((Drawable)localObject4).draw((Canvas)localObject3);
          localObject4 = new BitmapDrawable(localBitmap);
        }
        localObject1 = new LayerDrawable(new Drawable[] { localObject2, localObject4, localObject1 });
        ((LayerDrawable)localObject1).setId(0, 16908288);
        ((LayerDrawable)localObject1).setId(1, 16908303);
        ((LayerDrawable)localObject1).setId(2, 16908301);
      }
    }
    label438:
    if (localObject1 != null)
    {
      ((Drawable)localObject1).setChangingConfigurations(changingConfigurations);
      b(paramContext, l, (Drawable)localObject1);
    }
    return (Drawable)localObject1;
  }
  
  public final Drawable e(Context paramContext, long paramLong)
  {
    try
    {
      e locale = (e)d.get(paramContext);
      if (locale == null) {
        return null;
      }
      Object localObject = (WeakReference)locale.d(null, paramLong);
      if (localObject != null)
      {
        localObject = (Drawable.ConstantState)((Reference)localObject).get();
        if (localObject != null)
        {
          paramContext = ((Drawable.ConstantState)localObject).newDrawable(paramContext.getResources());
          return paramContext;
        }
        int k = a0.k(b, d, paramLong);
        if (k >= 0)
        {
          Object[] arrayOfObject = c;
          localObject = arrayOfObject[k];
          paramContext = e.e;
          if (localObject != paramContext)
          {
            arrayOfObject[k] = paramContext;
            a = true;
          }
        }
      }
      return null;
    }
    finally {}
  }
  
  public final Drawable f(Context paramContext, int paramInt)
  {
    try
    {
      paramContext = g(paramContext, paramInt, false);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  /* Error */
  public final Drawable g(Context paramContext, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 302	l/q0:f	Z
    //   6: istore 4
    //   8: iconst_0
    //   9: istore 5
    //   11: iload 4
    //   13: ifeq +6 -> 19
    //   16: goto +65 -> 81
    //   19: aload_0
    //   20: iconst_1
    //   21: putfield 302	l/q0:f	Z
    //   24: aload_0
    //   25: aload_1
    //   26: ldc_w 303
    //   29: invokevirtual 183	l/q0:f	(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   32: astore 6
    //   34: aload 6
    //   36: ifnull +875 -> 911
    //   39: aload 6
    //   41: instanceof 305
    //   44: ifne +29 -> 73
    //   47: ldc_w 307
    //   50: aload 6
    //   52: invokevirtual 76	java/lang/Object:getClass	()Ljava/lang/Class;
    //   55: invokevirtual 313	java/lang/Class:getName	()Ljava/lang/String;
    //   58: invokevirtual 319	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   61: ifeq +6 -> 67
    //   64: goto +9 -> 73
    //   67: iconst_0
    //   68: istore 7
    //   70: goto +6 -> 76
    //   73: iconst_1
    //   74: istore 7
    //   76: iload 7
    //   78: ifeq +833 -> 911
    //   81: aload_0
    //   82: getfield 124	l/q0:b	Lr/h;
    //   85: astore 6
    //   87: aconst_null
    //   88: astore 8
    //   90: aconst_null
    //   91: astore 9
    //   93: aload 6
    //   95: ifnull +451 -> 546
    //   98: aload 6
    //   100: invokevirtual 323	r/h:isEmpty	()Z
    //   103: ifne +443 -> 546
    //   106: aload_0
    //   107: getfield 325	l/q0:c	Lr/i;
    //   110: astore 6
    //   112: aload 6
    //   114: ifnull +47 -> 161
    //   117: aload 6
    //   119: iload_2
    //   120: aconst_null
    //   121: invokevirtual 330	r/i:c	(ILjava/lang/Integer;)Ljava/lang/Object;
    //   124: checkcast 315	java/lang/String
    //   127: astore 6
    //   129: ldc_w 332
    //   132: aload 6
    //   134: invokevirtual 319	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   137: ifne +409 -> 546
    //   140: aload 6
    //   142: ifnull +35 -> 177
    //   145: aload_0
    //   146: getfield 124	l/q0:b	Lr/h;
    //   149: aload 6
    //   151: aconst_null
    //   152: invokevirtual 335	r/h:getOrDefault	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   155: ifnonnull +22 -> 177
    //   158: goto +388 -> 546
    //   161: new 327	r/i
    //   164: astore 6
    //   166: aload 6
    //   168: invokespecial 336	r/i:<init>	()V
    //   171: aload_0
    //   172: aload 6
    //   174: putfield 325	l/q0:c	Lr/i;
    //   177: aload_0
    //   178: getfield 151	l/q0:e	Landroid/util/TypedValue;
    //   181: ifnonnull +19 -> 200
    //   184: new 153	android/util/TypedValue
    //   187: astore 6
    //   189: aload 6
    //   191: invokespecial 154	android/util/TypedValue:<init>	()V
    //   194: aload_0
    //   195: aload 6
    //   197: putfield 151	l/q0:e	Landroid/util/TypedValue;
    //   200: aload_0
    //   201: getfield 151	l/q0:e	Landroid/util/TypedValue;
    //   204: astore 10
    //   206: aload_1
    //   207: invokevirtual 160	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   210: astore 11
    //   212: aload 11
    //   214: iload_2
    //   215: aload 10
    //   217: iconst_1
    //   218: invokevirtual 166	android/content/res/Resources:getValue	(ILandroid/util/TypedValue;Z)V
    //   221: aload 10
    //   223: getfield 169	android/util/TypedValue:assetCookie	I
    //   226: i2l
    //   227: bipush 32
    //   229: lshl
    //   230: aload 10
    //   232: getfield 172	android/util/TypedValue:data	I
    //   235: i2l
    //   236: lor
    //   237: lstore 12
    //   239: aload_0
    //   240: aload_1
    //   241: lload 12
    //   243: invokevirtual 175	l/q0:e	(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;
    //   246: astore 6
    //   248: aload 6
    //   250: ifnull +6 -> 256
    //   253: goto +296 -> 549
    //   256: aload 10
    //   258: getfield 340	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   261: astore 14
    //   263: aload 6
    //   265: astore 15
    //   267: aload 14
    //   269: ifnull +250 -> 519
    //   272: aload 14
    //   274: invokeinterface 345 1 0
    //   279: ldc_w 347
    //   282: invokevirtual 351	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   285: istore 4
    //   287: aload 6
    //   289: astore 15
    //   291: iload 4
    //   293: ifeq +226 -> 519
    //   296: aload 6
    //   298: astore 15
    //   300: aload 11
    //   302: iload_2
    //   303: invokevirtual 355	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
    //   306: astore 16
    //   308: aload 6
    //   310: astore 15
    //   312: aload 16
    //   314: invokestatic 361	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   317: astore 14
    //   319: aload 6
    //   321: astore 15
    //   323: aload 16
    //   325: invokeinterface 366 1 0
    //   330: istore 7
    //   332: iload 7
    //   334: iconst_2
    //   335: if_icmpeq +12 -> 347
    //   338: iload 7
    //   340: iconst_1
    //   341: if_icmpeq +6 -> 347
    //   344: goto -25 -> 319
    //   347: iload 7
    //   349: iconst_2
    //   350: if_icmpne +127 -> 477
    //   353: aload 6
    //   355: astore 15
    //   357: aload 16
    //   359: invokeinterface 367 1 0
    //   364: astore 11
    //   366: aload 6
    //   368: astore 15
    //   370: aload_0
    //   371: getfield 325	l/q0:c	Lr/i;
    //   374: iload_2
    //   375: aload 11
    //   377: invokevirtual 370	r/i:a	(ILjava/lang/Object;)V
    //   380: aload 6
    //   382: astore 15
    //   384: aload_0
    //   385: getfield 124	l/q0:b	Lr/h;
    //   388: aload 11
    //   390: aconst_null
    //   391: invokevirtual 335	r/h:getOrDefault	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   394: checkcast 18	l/q0$e
    //   397: astore 17
    //   399: aload 6
    //   401: astore 11
    //   403: aload 17
    //   405: ifnull +25 -> 430
    //   408: aload 6
    //   410: astore 15
    //   412: aload 17
    //   414: aload_1
    //   415: aload 16
    //   417: aload 14
    //   419: aload_1
    //   420: invokevirtual 374	android/content/Context:getTheme	()Landroid/content/res/Resources$Theme;
    //   423: invokeinterface 377 5 0
    //   428: astore 11
    //   430: aload 11
    //   432: astore 15
    //   434: aload 11
    //   436: ifnull +83 -> 519
    //   439: aload 11
    //   441: astore 15
    //   443: aload 11
    //   445: aload 10
    //   447: getfield 257	android/util/TypedValue:changingConfigurations	I
    //   450: invokevirtual 260	android/graphics/drawable/Drawable:setChangingConfigurations	(I)V
    //   453: aload 11
    //   455: astore 15
    //   457: aload_0
    //   458: aload_1
    //   459: lload 12
    //   461: aload 11
    //   463: invokevirtual 262	l/q0:b	(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)V
    //   466: aload 11
    //   468: astore 15
    //   470: goto +49 -> 519
    //   473: astore_1
    //   474: goto +455 -> 929
    //   477: aload 6
    //   479: astore 15
    //   481: new 379	org/xmlpull/v1/XmlPullParserException
    //   484: astore 11
    //   486: aload 6
    //   488: astore 15
    //   490: aload 11
    //   492: ldc_w 381
    //   495: invokespecial 384	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   498: aload 6
    //   500: astore 15
    //   502: aload 11
    //   504: athrow
    //   505: astore 6
    //   507: ldc_w 386
    //   510: ldc_w 388
    //   513: aload 6
    //   515: invokestatic 393	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   518: pop
    //   519: aload 15
    //   521: astore 6
    //   523: aload 15
    //   525: ifnonnull +24 -> 549
    //   528: aload_0
    //   529: getfield 325	l/q0:c	Lr/i;
    //   532: iload_2
    //   533: ldc_w 332
    //   536: invokevirtual 370	r/i:a	(ILjava/lang/Object;)V
    //   539: aload 15
    //   541: astore 6
    //   543: goto +6 -> 549
    //   546: aconst_null
    //   547: astore 6
    //   549: aload 6
    //   551: astore 11
    //   553: aload 6
    //   555: ifnonnull +11 -> 566
    //   558: aload_0
    //   559: aload_1
    //   560: iload_2
    //   561: invokevirtual 395	l/q0:c	(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   564: astore 11
    //   566: aload 11
    //   568: astore 6
    //   570: aload 11
    //   572: ifnonnull +10 -> 582
    //   575: aload_1
    //   576: iload_2
    //   577: invokestatic 400	v/a:getDrawable	(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   580: astore 6
    //   582: aload 6
    //   584: astore 11
    //   586: aload 6
    //   588: ifnull +308 -> 896
    //   591: aload_0
    //   592: aload_1
    //   593: iload_2
    //   594: invokevirtual 403	l/q0:i	(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   597: astore 11
    //   599: aload 11
    //   601: ifnull +64 -> 665
    //   604: getstatic 408	l/i0:a	[I
    //   607: astore_1
    //   608: aload 6
    //   610: invokevirtual 412	android/graphics/drawable/Drawable:mutate	()Landroid/graphics/drawable/Drawable;
    //   613: astore 6
    //   615: aload 6
    //   617: aload 11
    //   619: invokestatic 417	y/a$a:h	(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    //   622: aload_0
    //   623: getfield 177	l/q0:g	Ll/q0$f;
    //   626: ifnonnull +9 -> 635
    //   629: aload 9
    //   631: astore_1
    //   632: goto +17 -> 649
    //   635: aload 9
    //   637: astore_1
    //   638: iload_2
    //   639: ldc_w 418
    //   642: if_icmpne +7 -> 649
    //   645: getstatic 421	android/graphics/PorterDuff$Mode:MULTIPLY	Landroid/graphics/PorterDuff$Mode;
    //   648: astore_1
    //   649: aload_1
    //   650: ifnull +9 -> 659
    //   653: aload 6
    //   655: aload_1
    //   656: invokestatic 424	y/a$a:i	(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    //   659: aload 6
    //   661: astore_1
    //   662: goto +231 -> 893
    //   665: aload_0
    //   666: getfield 177	l/q0:g	Ll/q0$f;
    //   669: ifnull +200 -> 869
    //   672: iload_2
    //   673: ldc_w 425
    //   676: if_icmpne +83 -> 759
    //   679: aload 6
    //   681: checkcast 180	android/graphics/drawable/LayerDrawable
    //   684: astore 15
    //   686: aload 15
    //   688: ldc -8
    //   690: invokevirtual 429	android/graphics/drawable/LayerDrawable:findDrawableByLayerId	(I)Landroid/graphics/drawable/Drawable;
    //   693: astore 11
    //   695: aload_1
    //   696: ldc_w 430
    //   699: invokestatic 435	l/u0:c	(Landroid/content/Context;I)I
    //   702: istore 7
    //   704: getstatic 439	l/j:b	Landroid/graphics/PorterDuff$Mode;
    //   707: astore 9
    //   709: aload 11
    //   711: iload 7
    //   713: aload 9
    //   715: invokestatic 444	l/j$a:d	(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   718: aload 15
    //   720: ldc -3
    //   722: invokevirtual 429	android/graphics/drawable/LayerDrawable:findDrawableByLayerId	(I)Landroid/graphics/drawable/Drawable;
    //   725: aload_1
    //   726: ldc_w 430
    //   729: invokestatic 435	l/u0:c	(Landroid/content/Context;I)I
    //   732: aload 9
    //   734: invokestatic 444	l/j$a:d	(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   737: aload 15
    //   739: ldc -2
    //   741: invokevirtual 429	android/graphics/drawable/LayerDrawable:findDrawableByLayerId	(I)Landroid/graphics/drawable/Drawable;
    //   744: aload_1
    //   745: ldc_w 445
    //   748: invokestatic 435	l/u0:c	(Landroid/content/Context;I)I
    //   751: aload 9
    //   753: invokestatic 444	l/j$a:d	(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   756: goto +102 -> 858
    //   759: iload_2
    //   760: ldc -68
    //   762: if_icmpeq +19 -> 781
    //   765: iload_2
    //   766: ldc -66
    //   768: if_icmpeq +13 -> 781
    //   771: iload 5
    //   773: istore 7
    //   775: iload_2
    //   776: ldc -64
    //   778: if_icmpne +83 -> 861
    //   781: aload 6
    //   783: checkcast 180	android/graphics/drawable/LayerDrawable
    //   786: astore 11
    //   788: aload 11
    //   790: ldc -8
    //   792: invokevirtual 429	android/graphics/drawable/LayerDrawable:findDrawableByLayerId	(I)Landroid/graphics/drawable/Drawable;
    //   795: astore 15
    //   797: aload_1
    //   798: ldc_w 430
    //   801: invokestatic 447	l/u0:b	(Landroid/content/Context;I)I
    //   804: istore 7
    //   806: getstatic 439	l/j:b	Landroid/graphics/PorterDuff$Mode;
    //   809: astore 9
    //   811: aload 15
    //   813: iload 7
    //   815: aload 9
    //   817: invokestatic 444	l/j$a:d	(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   820: aload 11
    //   822: ldc -3
    //   824: invokevirtual 429	android/graphics/drawable/LayerDrawable:findDrawableByLayerId	(I)Landroid/graphics/drawable/Drawable;
    //   827: aload_1
    //   828: ldc_w 445
    //   831: invokestatic 435	l/u0:c	(Landroid/content/Context;I)I
    //   834: aload 9
    //   836: invokestatic 444	l/j$a:d	(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   839: aload 11
    //   841: ldc -2
    //   843: invokevirtual 429	android/graphics/drawable/LayerDrawable:findDrawableByLayerId	(I)Landroid/graphics/drawable/Drawable;
    //   846: aload_1
    //   847: ldc_w 445
    //   850: invokestatic 435	l/u0:c	(Landroid/content/Context;I)I
    //   853: aload 9
    //   855: invokestatic 444	l/j$a:d	(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   858: iconst_1
    //   859: istore 7
    //   861: iload 7
    //   863: ifeq +6 -> 869
    //   866: goto +24 -> 890
    //   869: aload_0
    //   870: aload_1
    //   871: iload_2
    //   872: aload 6
    //   874: invokevirtual 450	l/q0:k	(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z
    //   877: ifne +13 -> 890
    //   880: iload_3
    //   881: ifeq +9 -> 890
    //   884: aload 8
    //   886: astore_1
    //   887: goto +6 -> 893
    //   890: aload 6
    //   892: astore_1
    //   893: aload_1
    //   894: astore 11
    //   896: aload 11
    //   898: ifnull +8 -> 906
    //   901: aload 11
    //   903: invokestatic 453	l/i0:a	(Landroid/graphics/drawable/Drawable;)V
    //   906: aload_0
    //   907: monitorexit
    //   908: aload 11
    //   910: areturn
    //   911: aload_0
    //   912: iconst_0
    //   913: putfield 302	l/q0:f	Z
    //   916: new 455	java/lang/IllegalStateException
    //   919: astore_1
    //   920: aload_1
    //   921: ldc_w 457
    //   924: invokespecial 458	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   927: aload_1
    //   928: athrow
    //   929: aload_0
    //   930: monitorexit
    //   931: aload_1
    //   932: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	933	0	this	q0
    //   0	933	1	paramContext	Context
    //   0	933	2	paramInt	int
    //   0	933	3	paramBoolean	boolean
    //   6	286	4	bool	boolean
    //   9	763	5	k	int
    //   32	467	6	localObject1	Object
    //   505	9	6	localException	Exception
    //   521	370	6	localObject2	Object
    //   68	794	7	m	int
    //   88	797	8	localObject3	Object
    //   91	763	9	localMode	PorterDuff.Mode
    //   204	242	10	localTypedValue	TypedValue
    //   210	699	11	localObject4	Object
    //   237	223	12	l	long
    //   261	157	14	localObject5	Object
    //   265	547	15	localObject6	Object
    //   306	110	16	localXmlResourceParser	XmlResourceParser
    //   397	16	17	locale	e
    // Exception table:
    //   from	to	target	type
    //   2	8	473	finally
    //   19	34	473	finally
    //   39	64	473	finally
    //   81	87	473	finally
    //   98	112	473	finally
    //   117	140	473	finally
    //   145	158	473	finally
    //   161	177	473	finally
    //   177	200	473	finally
    //   200	248	473	finally
    //   256	263	473	finally
    //   272	287	473	finally
    //   300	308	473	finally
    //   312	319	473	finally
    //   323	332	473	finally
    //   357	366	473	finally
    //   370	380	473	finally
    //   384	399	473	finally
    //   412	430	473	finally
    //   443	453	473	finally
    //   457	466	473	finally
    //   481	486	473	finally
    //   490	498	473	finally
    //   502	505	473	finally
    //   507	519	473	finally
    //   528	539	473	finally
    //   558	566	473	finally
    //   575	582	473	finally
    //   591	599	473	finally
    //   604	629	473	finally
    //   645	649	473	finally
    //   653	659	473	finally
    //   665	672	473	finally
    //   679	756	473	finally
    //   781	858	473	finally
    //   869	880	473	finally
    //   901	906	473	finally
    //   911	929	473	finally
    //   300	308	505	java/lang/Exception
    //   312	319	505	java/lang/Exception
    //   323	332	505	java/lang/Exception
    //   357	366	505	java/lang/Exception
    //   370	380	505	java/lang/Exception
    //   384	399	505	java/lang/Exception
    //   412	430	505	java/lang/Exception
    //   443	453	505	java/lang/Exception
    //   457	466	505	java/lang/Exception
    //   481	486	505	java/lang/Exception
    //   490	498	505	java/lang/Exception
    //   502	505	505	java/lang/Exception
  }
  
  public final ColorStateList i(Context paramContext, int paramInt)
  {
    i locali;
    try
    {
      localObject1 = a;
      locali = null;
      if (localObject1 != null)
      {
        localObject1 = (i)((WeakHashMap)localObject1).get(paramContext);
        if (localObject1 != null) {
          localObject1 = (ColorStateList)((i)localObject1).c(paramInt, null);
        }
      }
    }
    finally
    {
      break label163;
    }
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = g;
      if (localObject1 == null) {
        localObject1 = locali;
      } else {
        localObject1 = ((j.a)localObject1).c(paramContext, paramInt);
      }
      if (localObject1 != null)
      {
        if (a == null)
        {
          localObject2 = new java/util/WeakHashMap;
          ((WeakHashMap)localObject2).<init>();
          a = ((WeakHashMap)localObject2);
        }
        locali = (i)a.get(paramContext);
        localObject2 = locali;
        if (locali == null)
        {
          localObject2 = new r/i;
          ((i)localObject2).<init>();
          a.put(paramContext, localObject2);
        }
        ((i)localObject2).a(paramInt, localObject1);
      }
      localObject2 = localObject1;
    }
    return (ColorStateList)localObject2;
    label163:
    throw paramContext;
  }
  
  public final boolean k(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    Object localObject1 = g;
    boolean bool1 = true;
    if (localObject1 != null)
    {
      Object localObject2 = (j.a)localObject1;
      localObject1 = j.b;
      boolean bool2 = j.a.a(a, paramInt);
      int k = 16842801;
      if (bool2)
      {
        paramInt = 2130968676;
      }
      else if (j.a.a(c, paramInt))
      {
        paramInt = 2130968674;
      }
      else if (j.a.a(d, paramInt))
      {
        localObject1 = PorterDuff.Mode.MULTIPLY;
        paramInt = k;
      }
      else
      {
        if (paramInt == 2131230757)
        {
          paramInt = 16842800;
          k = Math.round(40.8F);
          break label131;
        }
        if (paramInt != 2131230739) {
          break label137;
        }
        paramInt = k;
      }
      k = -1;
      label131:
      int m = 1;
      break label145;
      label137:
      paramInt = 0;
      m = paramInt;
      k = -1;
      label145:
      if (m != 0)
      {
        localObject2 = i0.a;
        paramDrawable = paramDrawable.mutate();
        paramInt = u0.c(paramContext, paramInt);
      }
      try
      {
        paramContext = h(paramInt, (PorterDuff.Mode)localObject1);
        paramDrawable.setColorFilter(paramContext);
        if (k != -1) {
          paramDrawable.setAlpha(k);
        }
        paramInt = 1;
      }
      finally {}
      if (paramInt != 0) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public static final class a
    implements q0.e
  {
    public final Drawable a(Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = a.g(paramContext, paramTheme, paramContext.getResources(), paramAttributeSet, paramXmlResourceParser);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", paramContext);
      }
      return null;
    }
  }
  
  public static final class b
    implements q0.e
  {
    public final Drawable a(Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        Resources localResources = paramContext.getResources();
        a2.b localb = new a2/b;
        localb.<init>(paramContext);
        localb.inflate(localResources, paramXmlResourceParser, paramAttributeSet, paramTheme);
        return localb;
      }
      catch (Exception paramContext)
      {
        Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", paramContext);
      }
      return null;
    }
  }
  
  public static final class c
    extends r.f<Integer, PorterDuffColorFilter>
  {
    public c()
    {
      super();
    }
  }
  
  public static final class d
    implements q0.e
  {
    public final Drawable a(Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      Object localObject = paramAttributeSet.getClassAttribute();
      if (localObject != null) {
        try
        {
          localObject = (Drawable)d.class.getClassLoader().loadClass((String)localObject).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
          i.b.c((Drawable)localObject, paramContext.getResources(), paramXmlResourceParser, paramAttributeSet, paramTheme);
          return (Drawable)localObject;
        }
        catch (Exception paramContext)
        {
          Log.e("DrawableDelegate", "Exception while inflating <drawable>", paramContext);
        }
      }
      return null;
    }
  }
  
  public static abstract interface e
  {
    public abstract Drawable a(Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme);
  }
  
  public static abstract interface f {}
  
  public static final class g
    implements q0.e
  {
    public final Drawable a(Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = paramContext.getResources();
        a2.f localf = new a2/f;
        localf.<init>();
        localf.inflate(paramContext, paramXmlResourceParser, paramAttributeSet, paramTheme);
        return localf;
      }
      catch (Exception paramContext)
      {
        Log.e("VdcInflateDelegate", "Exception while inflating <vector>", paramContext);
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     l.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */