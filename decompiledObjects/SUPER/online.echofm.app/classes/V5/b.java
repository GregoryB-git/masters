package V5;

import b6.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.Intrinsics;

public class b
{
  public static void a(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    Intrinsics.checkNotNullParameter(paramThrowable1, "<this>");
    Intrinsics.checkNotNullParameter(paramThrowable2, "exception");
    if (paramThrowable1 != paramThrowable2) {
      b6.b.a.a(paramThrowable1, paramThrowable2);
    }
  }
  
  public static String b(Throwable paramThrowable)
  {
    Intrinsics.checkNotNullParameter(paramThrowable, "<this>");
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
    paramThrowable.printStackTrace(localPrintWriter);
    localPrintWriter.flush();
    paramThrowable = localStringWriter.toString();
    Intrinsics.checkNotNullExpressionValue(paramThrowable, "toString(...)");
    return paramThrowable;
  }
}

/* Location:
 * Qualified Name:     V5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */