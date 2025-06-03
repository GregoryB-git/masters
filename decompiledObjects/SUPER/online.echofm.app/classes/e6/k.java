package e6;

import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import n6.b;

public class k
  extends j
{
  public static boolean j(File paramFile)
  {
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    paramFile = j.i(paramFile).iterator();
    for (boolean bool = true;; bool = false)
    {
      if (!paramFile.hasNext()) {
        return bool;
      }
      File localFile = (File)paramFile.next();
      if (((localFile.delete()) || (!localFile.exists())) && (bool)) {
        break;
      }
    }
    return bool;
  }
  
  public static String k(File paramFile)
  {
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    paramFile = paramFile.getName();
    Intrinsics.checkNotNullExpressionValue(paramFile, "getName(...)");
    return i.d0(paramFile, '.', "");
  }
}

/* Location:
 * Qualified Name:     e6.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */