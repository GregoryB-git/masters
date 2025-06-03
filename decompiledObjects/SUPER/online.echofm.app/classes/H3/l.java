package H3;

import E3.f;
import M3.g;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class l
{
  public static final FilenameFilter d = new j();
  public static final Comparator e = new k();
  public final g a;
  public String b = null;
  public String c = null;
  
  public l(g paramg)
  {
    a = paramg;
  }
  
  public static void f(g paramg, String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null)) {
      try
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("aqs.");
        localStringBuilder.append(paramString2);
        paramg.o(paramString1, localStringBuilder.toString()).createNewFile();
      }
      catch (IOException paramg)
      {
        f.f().l("Failed to persist App Quality Sessions session id.", paramg);
      }
    }
  }
  
  public static String g(g paramg, String paramString)
  {
    paramg = paramg.p(paramString, d);
    if (paramg.isEmpty())
    {
      f.f().k("Unable to read App Quality Sessions session id.");
      return null;
    }
    return ((File)Collections.min(paramg, e)).getName().substring(4);
  }
  
  public String c(String paramString)
  {
    label39:
    try
    {
      if (Objects.equals(b, paramString))
      {
        paramString = c;
        return paramString;
      }
    }
    finally
    {
      break label39;
      paramString = g(a, paramString);
      return paramString;
    }
  }
  
  /* Error */
  public void h(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 34	H3/l:c	Ljava/lang/String;
    //   6: aload_1
    //   7: invokestatic 135	java/util/Objects:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   10: ifne +27 -> 37
    //   13: aload_0
    //   14: getfield 36	H3/l:a	LM3/g;
    //   17: aload_0
    //   18: getfield 32	H3/l:b	Ljava/lang/String;
    //   21: aload_1
    //   22: invokestatic 140	H3/l:f	(LM3/g;Ljava/lang/String;Ljava/lang/String;)V
    //   25: aload_0
    //   26: aload_1
    //   27: putfield 34	H3/l:c	Ljava/lang/String;
    //   30: goto +7 -> 37
    //   33: astore_1
    //   34: goto +6 -> 40
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	l
    //   0	44	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   2	30	33	finally
  }
  
  /* Error */
  public void i(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 32	H3/l:b	Ljava/lang/String;
    //   6: aload_1
    //   7: invokestatic 135	java/util/Objects:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   10: ifne +27 -> 37
    //   13: aload_0
    //   14: getfield 36	H3/l:a	LM3/g;
    //   17: aload_1
    //   18: aload_0
    //   19: getfield 34	H3/l:c	Ljava/lang/String;
    //   22: invokestatic 140	H3/l:f	(LM3/g;Ljava/lang/String;Ljava/lang/String;)V
    //   25: aload_0
    //   26: aload_1
    //   27: putfield 32	H3/l:b	Ljava/lang/String;
    //   30: goto +7 -> 37
    //   33: astore_1
    //   34: goto +6 -> 40
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	l
    //   0	44	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   2	30	33	finally
  }
}

/* Location:
 * Qualified Name:     H3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */