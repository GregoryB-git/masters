package H3;

import J3.B;
import java.io.File;

public final class b
  extends v
{
  public final B a;
  public final String b;
  public final File c;
  
  public b(B paramB, String paramString, File paramFile)
  {
    if (paramB != null)
    {
      a = paramB;
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
    throw new NullPointerException("Null report");
  }
  
  public B b()
  {
    return a;
  }
  
  public File c()
  {
    return c;
  }
  
  public String d()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof v))
    {
      paramObject = (v)paramObject;
      if ((!a.equals(((v)paramObject).b())) || (!b.equals(((v)paramObject).d())) || (!c.equals(((v)paramObject).c()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CrashlyticsReportWithSessionId{report=");
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
 * Qualified Name:     H3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */