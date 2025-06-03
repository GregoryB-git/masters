package M3;

import E3.f;
import H3.m;
import H3.v;
import J3.B;
import J3.B.a;
import J3.B.d;
import J3.B.e;
import J3.B.e.d;
import J3.C;
import K3.h;
import O3.d.b;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class e
{
  public static final Charset e = Charset.forName("UTF-8");
  public static final int f = 15;
  public static final h g = new h();
  public static final Comparator h = new a();
  public static final FilenameFilter i = new b();
  public final AtomicInteger a = new AtomicInteger(0);
  public final g b;
  public final O3.i c;
  public final m d;
  
  public e(g paramg, O3.i parami, m paramm)
  {
    b = paramg;
    c = parami;
    d = paramm;
  }
  
  /* Error */
  public static String A(File paramFile)
  {
    // Byte code:
    //   0: sipush 8192
    //   3: newarray <illegal type>
    //   5: astore_1
    //   6: new 73	java/io/ByteArrayOutputStream
    //   9: dup
    //   10: invokespecial 74	java/io/ByteArrayOutputStream:<init>	()V
    //   13: astore_2
    //   14: new 76	java/io/FileInputStream
    //   17: dup
    //   18: aload_0
    //   19: invokespecial 79	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   22: astore_0
    //   23: aload_0
    //   24: aload_1
    //   25: invokevirtual 83	java/io/FileInputStream:read	([B)I
    //   28: istore_3
    //   29: iload_3
    //   30: ifle +17 -> 47
    //   33: aload_2
    //   34: aload_1
    //   35: iconst_0
    //   36: iload_3
    //   37: invokevirtual 87	java/io/ByteArrayOutputStream:write	([BII)V
    //   40: goto -17 -> 23
    //   43: astore_1
    //   44: goto +24 -> 68
    //   47: new 89	java/lang/String
    //   50: dup
    //   51: aload_2
    //   52: invokevirtual 93	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   55: getstatic 34	M3/e:e	Ljava/nio/charset/Charset;
    //   58: invokespecial 96	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   61: astore_1
    //   62: aload_0
    //   63: invokevirtual 99	java/io/FileInputStream:close	()V
    //   66: aload_1
    //   67: areturn
    //   68: aload_0
    //   69: invokevirtual 99	java/io/FileInputStream:close	()V
    //   72: goto +9 -> 81
    //   75: astore_0
    //   76: aload_1
    //   77: aload_0
    //   78: invokevirtual 105	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   81: aload_1
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	paramFile	File
    //   5	30	1	arrayOfByte	byte[]
    //   43	1	1	localObject	Object
    //   61	21	1	str	String
    //   13	39	2	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   28	9	3	j	int
    // Exception table:
    //   from	to	target	type
    //   23	29	43	finally
    //   33	40	43	finally
    //   47	62	43	finally
    //   68	72	75	finally
  }
  
  /* Error */
  public static void F(File paramFile, String paramString)
  {
    // Byte code:
    //   0: new 109	java/io/OutputStreamWriter
    //   3: dup
    //   4: new 111	java/io/FileOutputStream
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 112	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   12: getstatic 34	M3/e:e	Ljava/nio/charset/Charset;
    //   15: invokespecial 115	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   18: astore_0
    //   19: aload_0
    //   20: aload_1
    //   21: invokevirtual 120	java/io/Writer:write	(Ljava/lang/String;)V
    //   24: aload_0
    //   25: invokevirtual 121	java/io/OutputStreamWriter:close	()V
    //   28: return
    //   29: astore_1
    //   30: aload_0
    //   31: invokevirtual 121	java/io/OutputStreamWriter:close	()V
    //   34: goto +9 -> 43
    //   37: astore_0
    //   38: aload_1
    //   39: aload_0
    //   40: invokevirtual 105	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
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
  
  /* Error */
  public static void G(File paramFile, String paramString, long paramLong)
  {
    // Byte code:
    //   0: new 109	java/io/OutputStreamWriter
    //   3: dup
    //   4: new 111	java/io/FileOutputStream
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 112	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   12: getstatic 34	M3/e:e	Ljava/nio/charset/Charset;
    //   15: invokespecial 115	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   18: astore 4
    //   20: aload 4
    //   22: aload_1
    //   23: invokevirtual 120	java/io/Writer:write	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: lload_2
    //   28: invokestatic 126	M3/e:h	(J)J
    //   31: invokevirtual 132	java/io/File:setLastModified	(J)Z
    //   34: pop
    //   35: aload 4
    //   37: invokevirtual 121	java/io/OutputStreamWriter:close	()V
    //   40: return
    //   41: astore_0
    //   42: aload 4
    //   44: invokevirtual 121	java/io/OutputStreamWriter:close	()V
    //   47: goto +9 -> 56
    //   50: astore_1
    //   51: aload_0
    //   52: aload_1
    //   53: invokevirtual 105	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   56: aload_0
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	paramFile	File
    //   0	58	1	paramString	String
    //   0	58	2	paramLong	long
    //   18	25	4	localOutputStreamWriter	java.io.OutputStreamWriter
    // Exception table:
    //   from	to	target	type
    //   20	35	41	finally
    //   42	47	50	finally
  }
  
  public static int f(List paramList, int paramInt)
  {
    int j = paramList.size();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      File localFile = (File)paramList.next();
      if (j <= paramInt) {
        return j;
      }
      g.s(localFile);
      j--;
    }
    return j;
  }
  
  public static long h(long paramLong)
  {
    return paramLong * 1000L;
  }
  
  public static String m(int paramInt, boolean paramBoolean)
  {
    String str1 = String.format(Locale.US, "%010d", new Object[] { Integer.valueOf(paramInt) });
    String str2;
    if (paramBoolean) {
      str2 = "_";
    } else {
      str2 = "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("event");
    localStringBuilder.append(str1);
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public static String o(String paramString)
  {
    return paramString.substring(0, f);
  }
  
  public static boolean s(String paramString)
  {
    boolean bool;
    if ((paramString.startsWith("event")) && (paramString.endsWith("_"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean t(File paramFile, String paramString)
  {
    boolean bool;
    if ((paramString.startsWith("event")) && (!paramString.endsWith("_"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static int x(File paramFile1, File paramFile2)
  {
    return o(paramFile1.getName()).compareTo(o(paramFile2.getName()));
  }
  
  public final void B(File paramFile, B.d paramd, String paramString, B.a parama)
  {
    String str = d.d(paramString);
    try
    {
      h localh = g;
      paramd = localh.F(A(paramFile)).s(paramd).p(parama).o(str);
      F(b.g(paramString), localh.G(paramd));
    }
    catch (IOException parama)
    {
      paramString = f.f();
      paramd = new StringBuilder();
      paramd.append("Could not synthesize final native report file for ");
      paramd.append(paramFile);
      paramString.l(paramd.toString(), parama);
    }
  }
  
  public final void C(String paramString, long paramLong)
  {
    Object localObject1 = b.p(paramString, i);
    if (((List)localObject1).isEmpty())
    {
      localObject1 = f.f();
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("Session ");
      ((StringBuilder)localObject3).append(paramString);
      ((StringBuilder)localObject3).append(" has no events.");
      ((f)localObject1).i(((StringBuilder)localObject3).toString());
      return;
    }
    Collections.sort((List)localObject1);
    Object localObject3 = new ArrayList();
    Iterator localIterator = ((List)localObject1).iterator();
    boolean bool1 = false;
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label220;
      }
      localObject4 = (File)localIterator.next();
      try
      {
        ((List)localObject3).add(g.h(A((File)localObject4)));
        if (!bool1)
        {
          boolean bool2 = s(((File)localObject4).getName());
          if (!bool2) {
            break;
          }
        }
      }
      catch (IOException localIOException)
      {
        break label174;
      }
      bool1 = true;
      continue;
      label174:
      f localf = f.f();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not add event to report for ");
      localStringBuilder.append(localObject4);
      localf.l(localStringBuilder.toString(), localIOException);
    }
    label220:
    if (((List)localObject3).isEmpty())
    {
      localObject2 = f.f();
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("Could not parse event files for session ");
      ((StringBuilder)localObject3).append(paramString);
      ((f)localObject2).k(((StringBuilder)localObject3).toString());
      return;
    }
    Object localObject2 = I3.i.j(paramString, b);
    Object localObject4 = d.d(paramString);
    D(b.o(paramString, "report"), (List)localObject3, paramLong, bool1, (String)localObject2, (String)localObject4);
  }
  
  public final void D(File paramFile, List paramList, long paramLong, boolean paramBoolean, String paramString1, String paramString2)
  {
    h localh;
    B.e locale;
    try
    {
      localh = g;
      paramString1 = localh.F(A(paramFile)).t(paramLong, paramBoolean, paramString1).o(paramString2).q(C.a(paramList));
      locale = paramString1.m();
      if (locale == null) {
        return;
      }
      f localf = f.f();
      paramList = new java/lang/StringBuilder;
      paramList.<init>();
      paramList.append("appQualitySessionId: ");
      paramList.append(paramString2);
      localf.b(paramList.toString());
      if (paramBoolean) {
        paramList = b.j(locale.i());
      }
    }
    catch (IOException paramString2)
    {
      break label139;
    }
    paramList = b.l(locale.i());
    F(paramList, localh.G(paramString1));
    return;
    label139:
    paramString1 = f.f();
    paramList = new StringBuilder();
    paramList.append("Could not synthesize final report file for ");
    paramList.append(paramFile);
    paramString1.l(paramList.toString(), paramString2);
  }
  
  public final int E(String paramString, int paramInt)
  {
    paramString = b.p(paramString, new c());
    Collections.sort(paramString, new d());
    return f(paramString, paramInt);
  }
  
  public final SortedSet e(String paramString)
  {
    b.b();
    SortedSet localSortedSet = p();
    if (paramString != null) {
      localSortedSet.remove(paramString);
    }
    if (localSortedSet.size() <= 8) {
      return localSortedSet;
    }
    while (localSortedSet.size() > 8)
    {
      String str = (String)localSortedSet.last();
      f localf = f.f();
      paramString = new StringBuilder();
      paramString.append("Removing session over cap: ");
      paramString.append(str);
      localf.b(paramString.toString());
      b.c(str);
      localSortedSet.remove(str);
    }
    return localSortedSet;
  }
  
  public final void g()
  {
    int j = c.b().a.b;
    Object localObject = n();
    int k = ((List)localObject).size();
    if (k <= j) {
      return;
    }
    localObject = ((List)localObject).subList(j, k).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((File)((Iterator)localObject).next()).delete();
    }
  }
  
  public void i()
  {
    j(b.m());
    j(b.k());
    j(b.h());
  }
  
  public final void j(List paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((File)paramList.next()).delete();
    }
  }
  
  public void k(String paramString, long paramLong)
  {
    Iterator localIterator = e(paramString).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramString = f.f();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Finalizing report for session ");
      localStringBuilder.append(str);
      paramString.i(localStringBuilder.toString());
      C(str, paramLong);
      b.c(str);
    }
    g();
  }
  
  public void l(String paramString, B.d paramd, B.a parama)
  {
    File localFile = b.o(paramString, "report");
    f localf = f.f();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Writing native session report for ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" to file: ");
    localStringBuilder.append(localFile);
    localf.b(localStringBuilder.toString());
    B(localFile, paramd, paramString, parama);
  }
  
  public final List n()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(b.k());
    localArrayList.addAll(b.h());
    Comparator localComparator = h;
    Collections.sort(localArrayList, localComparator);
    List localList = b.m();
    Collections.sort(localList, localComparator);
    localArrayList.addAll(localList);
    return localArrayList;
  }
  
  public SortedSet p()
  {
    return new TreeSet(b.d()).descendingSet();
  }
  
  public long q(String paramString)
  {
    return b.o(paramString, "start-time").lastModified();
  }
  
  public boolean r()
  {
    boolean bool;
    if ((b.m().isEmpty()) && (b.k().isEmpty()) && (b.h().isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public List w()
  {
    Object localObject = n();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      File localFile = (File)localIterator.next();
      try
      {
        localArrayList.add(v.a(g.F(A(localFile)), localFile.getName(), localFile));
      }
      catch (IOException localIOException)
      {
        f localf = f.f();
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Could not load report file ");
        ((StringBuilder)localObject).append(localFile);
        ((StringBuilder)localObject).append("; deleting");
        localf.l(((StringBuilder)localObject).toString(), localIOException);
        localFile.delete();
      }
    }
    return localArrayList;
  }
  
  public void y(B.e.d paramd, String paramString, boolean paramBoolean)
  {
    int j = c.b().a.a;
    Object localObject = g.i(paramd);
    paramd = m(a.getAndIncrement(), paramBoolean);
    try
    {
      F(b.o(paramString, paramd), (String)localObject);
    }
    catch (IOException localIOException)
    {
      localObject = f.f();
      paramd = new StringBuilder();
      paramd.append("Could not persist event for session ");
      paramd.append(paramString);
      ((f)localObject).l(paramd.toString(), localIOException);
    }
    E(paramString, j);
  }
  
  public void z(B paramB)
  {
    Object localObject = paramB.m();
    if (localObject == null)
    {
      f.f().b("Could not get session for report");
      return;
    }
    String str = ((B.e)localObject).i();
    try
    {
      paramB = g.G(paramB);
      F(b.o(str, "report"), paramB);
      G(b.o(str, "start-time"), "", ((B.e)localObject).l());
    }
    catch (IOException localIOException)
    {
      localObject = f.f();
      paramB = new StringBuilder();
      paramB.append("Could not persist report for session ");
      paramB.append(str);
      ((f)localObject).c(paramB.toString(), localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     M3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */