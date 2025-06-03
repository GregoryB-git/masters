package Y;

import androidx.lifecycle.h;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.s.a;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import t.i;

public class b
  extends a
{
  public final h a;
  public final a b;
  
  public b(h paramh, t paramt)
  {
    a = paramh;
    b = a.f(paramt);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    b.e(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public void c()
  {
    b.g();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    H.b.a(a, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  public static class a
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
      android.support.v4.media.a.a(c.p(0));
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
          android.support.v4.media.a.a(c.p(0));
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
      android.support.v4.media.a.a(c.p(0));
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
}

/* Location:
 * Qualified Name:     Y.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */