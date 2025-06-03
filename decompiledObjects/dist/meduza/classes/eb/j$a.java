package eb;

import gb.j2.a;
import gb.v2.a;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class j$a
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

/* Location:
 * Qualified Name:     eb.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */