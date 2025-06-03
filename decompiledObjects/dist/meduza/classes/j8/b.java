package j8;

import f;
import java.io.File;
import m8.f0;

public final class b
  extends u
{
  public final f0 a;
  public final String b;
  public final File c;
  
  public b(m8.b paramb, String paramString, File paramFile)
  {
    a = paramb;
    if (paramString != null)
    {
      b = paramString;
      if (paramFile != null)
      {
        c = paramFile;
        return;
      }
      throw new NullPointerException("Null reportFile");
    }
    throw new NullPointerException("Null sessionId");
  }
  
  public final f0 a()
  {
    return a;
  }
  
  public final File b()
  {
    return c;
  }
  
  public final String c()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof u))
    {
      paramObject = (u)paramObject;
      if ((!a.equals(((u)paramObject).a())) || (!b.equals(((u)paramObject).c())) || (!c.equals(((u)paramObject).b()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("CrashlyticsReportWithSessionId{report=");
    localStringBuilder.append(a);
    localStringBuilder.append(", sessionId=");
    localStringBuilder.append(b);
    localStringBuilder.append(", reportFile=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j8.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */