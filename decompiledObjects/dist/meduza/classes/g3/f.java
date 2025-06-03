package g3;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;

public final class f
{
  public final HashSet a = new HashSet();
  public final d b;
  public final c c;
  
  public f()
  {
    b = localg;
    c = locala;
  }
  
  public static void d(String paramString, Object... paramVarArgs)
  {
    String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public final File a(Context paramContext, String paramString1, String paramString2)
  {
    paramString1 = ((g)b).a(paramString1);
    int i;
    if ((paramString2 != null) && (paramString2.length() != 0)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0) {
      return new File(paramContext.getDir("lib", 0), paramString1);
    }
    return new File(paramContext.getDir("lib", 0), g.e(paramString1, ".", paramString2));
  }
  
  public final void b(Context paramContext)
  {
    if (paramContext != null)
    {
      int i;
      if ("flutter".length() == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        d("Beginning load of %s...", new Object[] { "flutter" });
        c(paramContext, "flutter", null);
        return;
      }
      throw new IllegalArgumentException("Given library is either null or empty");
    }
    throw new IllegalArgumentException("Given context is null");
  }
  
  /* Error */
  public final void c(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 25	g3/f:a	Ljava/util/HashSet;
    //   4: aload_2
    //   5: invokevirtual 104	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   8: ifeq +17 -> 25
    //   11: ldc 106
    //   13: iconst_1
    //   14: anewarray 4	java/lang/Object
    //   17: dup
    //   18: iconst_0
    //   19: aload_2
    //   20: aastore
    //   21: invokestatic 80	g3/f:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   24: return
    //   25: aload_0
    //   26: getfield 27	g3/f:b	Lg3/d;
    //   29: checkcast 14	g3/g
    //   32: invokevirtual 110	java/lang/Object:getClass	()Ljava/lang/Class;
    //   35: pop
    //   36: aload_2
    //   37: invokestatic 115	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   40: aload_0
    //   41: getfield 25	g3/f:a	Ljava/util/HashSet;
    //   44: aload_2
    //   45: invokevirtual 118	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   48: pop
    //   49: ldc 120
    //   51: iconst_2
    //   52: anewarray 4	java/lang/Object
    //   55: dup
    //   56: iconst_0
    //   57: aload_2
    //   58: aastore
    //   59: dup
    //   60: iconst_1
    //   61: aload_3
    //   62: aastore
    //   63: invokestatic 80	g3/f:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   66: return
    //   67: astore 4
    //   69: ldc 122
    //   71: iconst_1
    //   72: anewarray 4	java/lang/Object
    //   75: dup
    //   76: iconst_0
    //   77: aload 4
    //   79: invokestatic 128	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   82: aastore
    //   83: invokestatic 80	g3/f:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   86: ldc -126
    //   88: iconst_2
    //   89: anewarray 4	java/lang/Object
    //   92: dup
    //   93: iconst_0
    //   94: aload_2
    //   95: aastore
    //   96: dup
    //   97: iconst_1
    //   98: aload_3
    //   99: aastore
    //   100: invokestatic 80	g3/f:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: aload_0
    //   104: aload_1
    //   105: aload_2
    //   106: aload_3
    //   107: invokevirtual 132	g3/f:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   110: astore 5
    //   112: aload 5
    //   114: invokevirtual 136	java/io/File:exists	()Z
    //   117: ifeq +6 -> 123
    //   120: goto +501 -> 621
    //   123: aload_1
    //   124: ldc 56
    //   126: iconst_0
    //   127: invokevirtual 62	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   130: astore 6
    //   132: aload_0
    //   133: aload_1
    //   134: aload_2
    //   135: aload_3
    //   136: invokevirtual 132	g3/f:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   139: astore 4
    //   141: aload 6
    //   143: new 138	g3/e
    //   146: dup
    //   147: aload_0
    //   148: getfield 27	g3/f:b	Lg3/d;
    //   151: checkcast 14	g3/g
    //   154: aload_2
    //   155: invokevirtual 48	g3/g:a	(Ljava/lang/String;)Ljava/lang/String;
    //   158: invokespecial 139	g3/e:<init>	(Ljava/lang/String;)V
    //   161: invokevirtual 143	java/io/File:listFiles	(Ljava/io/FilenameFilter;)[Ljava/io/File;
    //   164: astore 6
    //   166: aload 6
    //   168: ifnonnull +6 -> 174
    //   171: goto +53 -> 224
    //   174: aload 6
    //   176: arraylength
    //   177: istore 7
    //   179: iconst_0
    //   180: istore 8
    //   182: iload 8
    //   184: iload 7
    //   186: if_icmpge +38 -> 224
    //   189: aload 6
    //   191: iload 8
    //   193: aaload
    //   194: astore 9
    //   196: aload 9
    //   198: invokevirtual 147	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   201: aload 4
    //   203: invokevirtual 147	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   206: invokevirtual 150	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   209: ifne +9 -> 218
    //   212: aload 9
    //   214: invokevirtual 153	java/io/File:delete	()Z
    //   217: pop
    //   218: iinc 8 1
    //   221: goto -39 -> 182
    //   224: aload_0
    //   225: getfield 29	g3/f:c	Lg3/c;
    //   228: astore 6
    //   230: aload_0
    //   231: getfield 27	g3/f:b	Lg3/d;
    //   234: checkcast 14	g3/g
    //   237: invokevirtual 110	java/lang/Object:getClass	()Ljava/lang/Class;
    //   240: pop
    //   241: getstatic 159	android/os/Build:SUPPORTED_ABIS	[Ljava/lang/String;
    //   244: astore 4
    //   246: aload 4
    //   248: arraylength
    //   249: ifle +6 -> 255
    //   252: goto +71 -> 323
    //   255: getstatic 163	android/os/Build:CPU_ABI2	Ljava/lang/String;
    //   258: astore 4
    //   260: aload 4
    //   262: ifnull +20 -> 282
    //   265: aload 4
    //   267: invokevirtual 52	java/lang/String:length	()I
    //   270: ifne +6 -> 276
    //   273: goto +9 -> 282
    //   276: iconst_0
    //   277: istore 8
    //   279: goto +6 -> 285
    //   282: iconst_1
    //   283: istore 8
    //   285: iload 8
    //   287: ifne +23 -> 310
    //   290: iconst_2
    //   291: anewarray 40	java/lang/String
    //   294: dup
    //   295: iconst_0
    //   296: getstatic 166	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload 4
    //   304: aastore
    //   305: astore 4
    //   307: goto +16 -> 323
    //   310: iconst_1
    //   311: anewarray 40	java/lang/String
    //   314: astore 4
    //   316: aload 4
    //   318: iconst_0
    //   319: getstatic 166	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   322: aastore
    //   323: aload_0
    //   324: getfield 27	g3/f:b	Lg3/d;
    //   327: checkcast 14	g3/g
    //   330: aload_2
    //   331: invokevirtual 48	g3/g:a	(Ljava/lang/String;)Ljava/lang/String;
    //   334: astore 9
    //   336: aload 6
    //   338: checkcast 18	g3/a
    //   341: invokevirtual 110	java/lang/Object:getClass	()Ljava/lang/Class;
    //   344: pop
    //   345: aload_1
    //   346: aload 4
    //   348: aload 9
    //   350: aload_0
    //   351: invokestatic 169	g3/a:b	(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Lg3/f;)Lg3/a$a;
    //   354: astore 6
    //   356: aload 6
    //   358: ifnull +315 -> 673
    //   361: iconst_0
    //   362: istore 8
    //   364: iload 8
    //   366: iconst_5
    //   367: if_icmpge +240 -> 607
    //   370: ldc -85
    //   372: iconst_1
    //   373: anewarray 4	java/lang/Object
    //   376: dup
    //   377: iconst_0
    //   378: aload 9
    //   380: aastore
    //   381: invokestatic 80	g3/f:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   384: aload 5
    //   386: invokevirtual 136	java/io/File:exists	()Z
    //   389: ifne +18 -> 407
    //   392: aload 5
    //   394: invokevirtual 174	java/io/File:createNewFile	()Z
    //   397: istore 10
    //   399: iload 10
    //   401: ifne +6 -> 407
    //   404: goto +197 -> 601
    //   407: aload 6
    //   409: getfield 179	g3/a$a:a	Ljava/util/zip/ZipFile;
    //   412: aload 6
    //   414: getfield 182	g3/a$a:b	Ljava/util/zip/ZipEntry;
    //   417: invokevirtual 188	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   420: astore_1
    //   421: new 190	java/io/FileOutputStream
    //   424: astore 4
    //   426: aload 4
    //   428: aload 5
    //   430: invokespecial 193	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   433: sipush 4096
    //   436: newarray <illegal type>
    //   438: astore 11
    //   440: lconst_0
    //   441: lstore 12
    //   443: aload_1
    //   444: aload 11
    //   446: invokevirtual 199	java/io/InputStream:read	([B)I
    //   449: istore 7
    //   451: iload 7
    //   453: iconst_m1
    //   454: if_icmpne +83 -> 537
    //   457: aload 4
    //   459: invokevirtual 204	java/io/OutputStream:flush	()V
    //   462: aload 4
    //   464: invokevirtual 208	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   467: invokevirtual 213	java/io/FileDescriptor:sync	()V
    //   470: aload 5
    //   472: invokevirtual 216	java/io/File:length	()J
    //   475: lstore 14
    //   477: lload 12
    //   479: lload 14
    //   481: lcmp
    //   482: ifeq +6 -> 488
    //   485: goto +107 -> 592
    //   488: aload_1
    //   489: invokestatic 219	g3/a:a	(Ljava/io/Closeable;)V
    //   492: aload 4
    //   494: invokestatic 219	g3/a:a	(Ljava/io/Closeable;)V
    //   497: aload 5
    //   499: iconst_1
    //   500: iconst_0
    //   501: invokevirtual 223	java/io/File:setReadable	(ZZ)Z
    //   504: pop
    //   505: aload 5
    //   507: iconst_1
    //   508: iconst_0
    //   509: invokevirtual 226	java/io/File:setExecutable	(ZZ)Z
    //   512: pop
    //   513: aload 5
    //   515: iconst_1
    //   516: invokevirtual 230	java/io/File:setWritable	(Z)Z
    //   519: pop
    //   520: aload 6
    //   522: getfield 179	g3/a$a:a	Ljava/util/zip/ZipFile;
    //   525: astore_1
    //   526: aload_1
    //   527: ifnull +94 -> 621
    //   530: goto +87 -> 617
    //   533: astore_1
    //   534: goto +177 -> 711
    //   537: aload 4
    //   539: aload 11
    //   541: iconst_0
    //   542: iload 7
    //   544: invokevirtual 234	java/io/OutputStream:write	([BII)V
    //   547: lload 12
    //   549: iload 7
    //   551: i2l
    //   552: ladd
    //   553: lstore 12
    //   555: goto -112 -> 443
    //   558: astore_2
    //   559: aload 4
    //   561: astore_3
    //   562: goto +6 -> 568
    //   565: astore_2
    //   566: aconst_null
    //   567: astore_3
    //   568: goto +8 -> 576
    //   571: astore_2
    //   572: aconst_null
    //   573: astore_1
    //   574: aconst_null
    //   575: astore_3
    //   576: aload_1
    //   577: invokestatic 219	g3/a:a	(Ljava/io/Closeable;)V
    //   580: aload_3
    //   581: invokestatic 219	g3/a:a	(Ljava/io/Closeable;)V
    //   584: aload_2
    //   585: athrow
    //   586: astore_1
    //   587: aconst_null
    //   588: astore_1
    //   589: aconst_null
    //   590: astore 4
    //   592: aload_1
    //   593: invokestatic 219	g3/a:a	(Ljava/io/Closeable;)V
    //   596: aload 4
    //   598: invokestatic 219	g3/a:a	(Ljava/io/Closeable;)V
    //   601: iinc 8 1
    //   604: goto -240 -> 364
    //   607: aload 6
    //   609: getfield 179	g3/a$a:a	Ljava/util/zip/ZipFile;
    //   612: astore_1
    //   613: aload_1
    //   614: ifnull +7 -> 621
    //   617: aload_1
    //   618: invokevirtual 237	java/util/zip/ZipFile:close	()V
    //   621: aload_0
    //   622: getfield 27	g3/f:b	Lg3/d;
    //   625: astore_1
    //   626: aload 5
    //   628: invokevirtual 147	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   631: astore 4
    //   633: aload_1
    //   634: checkcast 14	g3/g
    //   637: invokevirtual 110	java/lang/Object:getClass	()Ljava/lang/Class;
    //   640: pop
    //   641: aload 4
    //   643: invokestatic 240	java/lang/System:load	(Ljava/lang/String;)V
    //   646: aload_0
    //   647: getfield 25	g3/f:a	Ljava/util/HashSet;
    //   650: aload_2
    //   651: invokevirtual 118	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   654: pop
    //   655: ldc -14
    //   657: iconst_2
    //   658: anewarray 4	java/lang/Object
    //   661: dup
    //   662: iconst_0
    //   663: aload_2
    //   664: aastore
    //   665: dup
    //   666: iconst_1
    //   667: aload_3
    //   668: aastore
    //   669: invokestatic 80	g3/f:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   672: return
    //   673: aload_1
    //   674: aload 9
    //   676: invokestatic 245	g3/a:c	(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
    //   679: astore_1
    //   680: goto +16 -> 696
    //   683: astore_2
    //   684: iconst_1
    //   685: anewarray 40	java/lang/String
    //   688: astore_1
    //   689: aload_1
    //   690: iconst_0
    //   691: aload_2
    //   692: invokevirtual 248	java/lang/Object:toString	()Ljava/lang/String;
    //   695: aastore
    //   696: new 250	g3/b
    //   699: astore_2
    //   700: aload_2
    //   701: aload 9
    //   703: aload 4
    //   705: aload_1
    //   706: invokespecial 253	g3/b:<init>	(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V
    //   709: aload_2
    //   710: athrow
    //   711: aload 6
    //   713: astore_2
    //   714: goto +6 -> 720
    //   717: astore_1
    //   718: aconst_null
    //   719: astore_2
    //   720: aload_2
    //   721: ifnull +16 -> 737
    //   724: aload_2
    //   725: getfield 179	g3/a$a:a	Ljava/util/zip/ZipFile;
    //   728: astore_2
    //   729: aload_2
    //   730: ifnull +7 -> 737
    //   733: aload_2
    //   734: invokevirtual 237	java/util/zip/ZipFile:close	()V
    //   737: aload_1
    //   738: athrow
    //   739: astore_1
    //   740: goto -139 -> 601
    //   743: astore 4
    //   745: goto -156 -> 589
    //   748: astore 11
    //   750: goto -158 -> 592
    //   753: astore_1
    //   754: goto -133 -> 621
    //   757: astore_2
    //   758: goto -21 -> 737
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	761	0	this	f
    //   0	761	1	paramContext	Context
    //   0	761	2	paramString1	String
    //   0	761	3	paramString2	String
    //   67	11	4	localUnsatisfiedLinkError	UnsatisfiedLinkError
    //   139	565	4	localObject1	Object
    //   743	1	4	localFileNotFoundException1	java.io.FileNotFoundException
    //   110	517	5	localFile	File
    //   130	582	6	localObject2	Object
    //   177	373	7	i	int
    //   180	422	8	j	int
    //   194	508	9	str	String
    //   397	3	10	bool	boolean
    //   438	102	11	arrayOfByte	byte[]
    //   748	1	11	localFileNotFoundException2	java.io.FileNotFoundException
    //   441	113	12	l1	long
    //   475	5	14	l2	long
    // Exception table:
    //   from	to	target	type
    //   25	66	67	java/lang/UnsatisfiedLinkError
    //   370	384	533	finally
    //   384	399	533	finally
    //   488	520	533	finally
    //   576	586	533	finally
    //   592	601	533	finally
    //   673	680	533	finally
    //   684	696	533	finally
    //   696	711	533	finally
    //   433	440	558	finally
    //   443	451	558	finally
    //   457	477	558	finally
    //   537	547	558	finally
    //   421	433	565	finally
    //   407	421	571	finally
    //   407	421	586	java/io/FileNotFoundException
    //   407	421	586	java/io/IOException
    //   673	680	683	java/lang/Exception
    //   345	356	717	finally
    //   384	399	739	java/io/IOException
    //   421	433	743	java/io/FileNotFoundException
    //   421	433	743	java/io/IOException
    //   433	440	748	java/io/FileNotFoundException
    //   433	440	748	java/io/IOException
    //   443	451	748	java/io/FileNotFoundException
    //   443	451	748	java/io/IOException
    //   457	477	748	java/io/FileNotFoundException
    //   457	477	748	java/io/IOException
    //   537	547	748	java/io/FileNotFoundException
    //   537	547	748	java/io/IOException
    //   520	526	753	java/io/IOException
    //   607	613	753	java/io/IOException
    //   617	621	753	java/io/IOException
    //   724	729	757	java/io/IOException
    //   733	737	757	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     g3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */