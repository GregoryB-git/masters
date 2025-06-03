package e6;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n6.b;
import n6.c;

public abstract class m
{
  public static final long a(Reader paramReader, Writer paramWriter, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramReader, "<this>");
    Intrinsics.checkNotNullParameter(paramWriter, "out");
    char[] arrayOfChar = new char[paramInt];
    paramInt = paramReader.read(arrayOfChar);
    long l = 0L;
    while (paramInt >= 0)
    {
      paramWriter.write(arrayOfChar, 0, paramInt);
      l += paramInt;
      paramInt = paramReader.read(arrayOfChar);
    }
    return l;
  }
  
  /* Error */
  public static final void c(Reader paramReader, g6.l paraml)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 10
    //   3: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 39
    //   9: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: instanceof 41
    //   16: ifeq +11 -> 27
    //   19: aload_0
    //   20: checkcast 41	java/io/BufferedReader
    //   23: astore_0
    //   24: goto +15 -> 39
    //   27: new 41	java/io/BufferedReader
    //   30: dup
    //   31: aload_0
    //   32: sipush 8192
    //   35: invokespecial 45	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   38: astore_0
    //   39: aload_0
    //   40: invokestatic 49	e6/m:d	(Ljava/io/BufferedReader;)Ln6/b;
    //   43: invokeinterface 55 1 0
    //   48: astore_2
    //   49: aload_2
    //   50: invokeinterface 61 1 0
    //   55: ifeq +23 -> 78
    //   58: aload_1
    //   59: aload_2
    //   60: invokeinterface 65 1 0
    //   65: invokeinterface 71 2 0
    //   70: pop
    //   71: goto -22 -> 49
    //   74: astore_2
    //   75: goto +13 -> 88
    //   78: getstatic 76	V5/t:a	LV5/t;
    //   81: astore_1
    //   82: aload_0
    //   83: aconst_null
    //   84: invokestatic 81	e6/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   87: return
    //   88: aload_2
    //   89: athrow
    //   90: astore_1
    //   91: aload_0
    //   92: aload_2
    //   93: invokestatic 81	e6/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	paramReader	Reader
    //   0	98	1	paraml	g6.l
    //   48	12	2	localIterator	java.util.Iterator
    //   74	19	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   39	49	74	finally
    //   49	71	74	finally
    //   78	82	74	finally
    //   88	90	90	finally
  }
  
  public static final b d(BufferedReader paramBufferedReader)
  {
    Intrinsics.checkNotNullParameter(paramBufferedReader, "<this>");
    return c.b(new l(paramBufferedReader));
  }
  
  public static final List e(Reader paramReader)
  {
    Intrinsics.checkNotNullParameter(paramReader, "<this>");
    ArrayList localArrayList = new ArrayList();
    c(paramReader, new a(localArrayList));
    return localArrayList;
  }
  
  public static final String f(Reader paramReader)
  {
    Intrinsics.checkNotNullParameter(paramReader, "<this>");
    StringWriter localStringWriter = new StringWriter();
    b(paramReader, localStringWriter, 0, 2, null);
    paramReader = localStringWriter.toString();
    Intrinsics.checkNotNullExpressionValue(paramReader, "toString(...)");
    return paramReader;
  }
  
  public static final class a
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public a(ArrayList paramArrayList)
    {
      super();
    }
    
    public final void a(String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "it");
      o.add(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     e6.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */