package Q1;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class c$a
{
  public static final a a = new a();
  
  public static final c a(String paramString1, String paramString2)
  {
    return new c(paramString1, paramString2, null);
  }
  
  public static final c b(Throwable paramThrowable, c.c paramc)
  {
    Intrinsics.checkNotNullParameter(paramc, "t");
    return new c(paramThrowable, paramc, null);
  }
  
  public static final c c(JSONArray paramJSONArray)
  {
    Intrinsics.checkNotNullParameter(paramJSONArray, "features");
    return new c(paramJSONArray, null);
  }
  
  public static final c d(File paramFile)
  {
    Intrinsics.checkNotNullParameter(paramFile, "file");
    return new c(paramFile, null);
  }
}

/* Location:
 * Qualified Name:     Q1.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */