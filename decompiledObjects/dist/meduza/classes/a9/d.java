package a9;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public final class d
{
  public d(e parame) {}
  
  public final String a(Object paramObject)
  {
    StringWriter localStringWriter = new StringWriter();
    try
    {
      b(paramObject, localStringWriter);
      return localStringWriter.toString();
    }
    catch (IOException paramObject)
    {
      for (;;) {}
    }
  }
  
  public final void b(Object paramObject, Writer paramWriter)
  {
    e locale = a;
    paramWriter = new f(paramWriter, a, b, c, d);
    paramWriter.h(paramObject);
    paramWriter.j();
    b.flush();
  }
}

/* Location:
 * Qualified Name:     a9.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */