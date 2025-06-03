package p8;

import android.util.Log;
import g;
import j8.j;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import m8.f0.e.d;
import r8.c.b;
import r8.f;
import r8.h;

public final class c
{
  public static final Charset e = Charset.forName("UTF-8");
  public static final int f = 15;
  public static final n8.a g = new n8.a();
  public static final r5.c h = new r5.c(5);
  public static final a i = new a();
  public final AtomicInteger a = new AtomicInteger(0);
  public final e b;
  public final h c;
  public final j d;
  
  public c(e parame, f paramf, j paramj)
  {
    b = parame;
    c = paramf;
    d = paramj;
  }
  
  public static void a(List paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((File)paramList.next()).delete();
    }
  }
  
  /* Error */
  public static String d(File paramFile)
  {
    // Byte code:
    //   0: sipush 8192
    //   3: newarray <illegal type>
    //   5: astore_1
    //   6: new 94	java/io/ByteArrayOutputStream
    //   9: dup
    //   10: invokespecial 95	java/io/ByteArrayOutputStream:<init>	()V
    //   13: astore_2
    //   14: new 97	java/io/FileInputStream
    //   17: dup
    //   18: aload_0
    //   19: invokespecial 100	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   22: astore_0
    //   23: aload_0
    //   24: aload_1
    //   25: invokevirtual 104	java/io/FileInputStream:read	([B)I
    //   28: istore_3
    //   29: iload_3
    //   30: ifle +13 -> 43
    //   33: aload_2
    //   34: aload_1
    //   35: iconst_0
    //   36: iload_3
    //   37: invokevirtual 108	java/io/ByteArrayOutputStream:write	([BII)V
    //   40: goto -17 -> 23
    //   43: new 110	java/lang/String
    //   46: dup
    //   47: aload_2
    //   48: invokevirtual 114	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   51: getstatic 34	p8/c:e	Ljava/nio/charset/Charset;
    //   54: invokespecial 117	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   57: astore_1
    //   58: aload_0
    //   59: invokevirtual 120	java/io/FileInputStream:close	()V
    //   62: aload_1
    //   63: areturn
    //   64: astore_1
    //   65: aload_0
    //   66: invokevirtual 120	java/io/FileInputStream:close	()V
    //   69: goto +9 -> 78
    //   72: astore_0
    //   73: aload_1
    //   74: aload_0
    //   75: invokevirtual 126	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   78: aload_1
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	paramFile	File
    //   5	58	1	localObject1	Object
    //   64	15	1	localObject2	Object
    //   13	35	2	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   28	9	3	j	int
    // Exception table:
    //   from	to	target	type
    //   23	29	64	finally
    //   33	40	64	finally
    //   43	58	64	finally
    //   65	69	72	finally
  }
  
  /* Error */
  public static void e(File paramFile, String paramString)
  {
    // Byte code:
    //   0: new 129	java/io/OutputStreamWriter
    //   3: dup
    //   4: new 131	java/io/FileOutputStream
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 132	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   12: getstatic 34	p8/c:e	Ljava/nio/charset/Charset;
    //   15: invokespecial 135	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   18: astore_0
    //   19: aload_0
    //   20: aload_1
    //   21: invokevirtual 140	java/io/Writer:write	(Ljava/lang/String;)V
    //   24: aload_0
    //   25: invokevirtual 141	java/io/OutputStreamWriter:close	()V
    //   28: return
    //   29: astore_1
    //   30: aload_0
    //   31: invokevirtual 141	java/io/OutputStreamWriter:close	()V
    //   34: goto +9 -> 43
    //   37: astore_0
    //   38: aload_1
    //   39: aload_0
    //   40: invokevirtual 126	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   43: aload_1
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	paramFile	File
    //   0	45	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   19	24	29	finally
    //   30	34	37	finally
  }
  
  public final ArrayList b()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(e.e(b.f.listFiles()));
    localArrayList.addAll(e.e(b.g.listFiles()));
    r5.c localc = h;
    Collections.sort(localArrayList, localc);
    List localList = e.e(b.e.listFiles());
    Collections.sort(localList, localc);
    localArrayList.addAll(localList);
    return localArrayList;
  }
  
  public final void c(f0.e.d paramd, String paramString, boolean paramBoolean)
  {
    int j = c).b().a.a;
    g.getClass();
    String str1 = n8.a.a.a(paramd);
    int k = a.getAndIncrement();
    String str2 = String.format(Locale.US, "%010d", new Object[] { Integer.valueOf(k) });
    if (paramBoolean) {
      paramd = "_";
    } else {
      paramd = "";
    }
    paramd = g.e("event", str2, paramd);
    try
    {
      e(b.b(paramString, paramd), str1);
    }
    catch (IOException localIOException)
    {
      paramd = new StringBuilder();
      paramd.append("Could not persist event for session ");
      paramd.append(paramString);
      Log.w("FirebaseCrashlytics", paramd.toString(), localIOException);
    }
    e locale = b;
    paramd = new b();
    locale.getClass();
    paramString = new File(d, paramString);
    paramString.mkdirs();
    paramd = e.e(paramString.listFiles(paramd));
    Collections.sort(paramd, new b0.d(8));
    k = paramd.size();
    paramString = paramd.iterator();
    while (paramString.hasNext())
    {
      paramd = (File)paramString.next();
      if (k <= j) {
        break;
      }
      e.d(paramd);
      k--;
    }
  }
}

/* Location:
 * Qualified Name:     p8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */