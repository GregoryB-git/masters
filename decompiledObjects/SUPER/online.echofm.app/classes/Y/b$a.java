package Y;

import android.support.v4.media.a;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.s.a;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import t.i;

public class b$a
  extends r
{
  public static final s.a e = new a();
  public i c = new i();
  public boolean d = false;
  
  public static a f(t paramt)
  {
    return (a)new s(paramt, e).a(a.class);
  }
  
  public void d()
  {
    super.d();
    if (c.o() <= 0)
    {
      c.b();
      return;
    }
    a.a(c.p(0));
    throw null;
  }
  
  public void e(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    if (c.o() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loaders:");
      paramFileDescriptor = new StringBuilder();
      paramFileDescriptor.append(paramString);
      paramFileDescriptor.append("    ");
      if (c.o() > 0)
      {
        a.a(c.p(0));
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(c.l(0));
        paramPrintWriter.print(": ");
        throw null;
      }
    }
  }
  
  public void g()
  {
    if (c.o() <= 0) {
      return;
    }
    a.a(c.p(0));
    throw null;
  }
  
  public static final class a
    implements s.a
  {
    public r a(Class paramClass)
    {
      return new b.a();
    }
  }
}

/* Location:
 * Qualified Name:     Y.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */