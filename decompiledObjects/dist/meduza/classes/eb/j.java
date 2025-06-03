package eb;

import gb.j2.a;
import gb.v2.a;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public abstract interface j
  extends l, r
{
  public static final class a
    implements j
  {
    public final String a()
    {
      return "gzip";
    }
    
    public final OutputStream b(j2.a parama)
    {
      return new GZIPOutputStream(parama);
    }
    
    public final InputStream c(v2.a parama)
    {
      return new GZIPInputStream(parama);
    }
  }
  
  public static final class b
    implements j
  {
    public static final b a = new b();
    
    public final String a()
    {
      return "identity";
    }
    
    public final OutputStream b(j2.a parama)
    {
      return parama;
    }
    
    public final InputStream c(v2.a parama)
    {
      return parama;
    }
  }
}

/* Location:
 * Qualified Name:     eb.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */