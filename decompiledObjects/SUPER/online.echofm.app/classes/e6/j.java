package e6;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public class j
  extends i
{
  public static final e h(File paramFile, f paramf)
  {
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramf, "direction");
    return new e(paramFile, paramf);
  }
  
  public static final e i(File paramFile)
  {
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    return h(paramFile, f.p);
  }
}

/* Location:
 * Qualified Name:     e6.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */