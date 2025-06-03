package e6;

import java.io.File;
import java.io.IOException;

public abstract class d
  extends IOException
{
  public final File o;
  public final File p;
  public final String q;
  
  public d(File paramFile1, File paramFile2, String paramString)
  {
    super(c.a(paramFile1, paramFile2, paramString));
    o = paramFile1;
    p = paramFile2;
    q = paramString;
  }
}

/* Location:
 * Qualified Name:     e6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */