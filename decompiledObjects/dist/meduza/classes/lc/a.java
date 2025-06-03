package lc;

import ec.i;
import java.nio.charset.Charset;

public final class a
{
  public static final Charset a;
  
  static
  {
    Charset localCharset = Charset.forName("UTF-8");
    i.d(localCharset, "forName(...)");
    a = localCharset;
    i.d(Charset.forName("UTF-16"), "forName(...)");
    i.d(Charset.forName("UTF-16BE"), "forName(...)");
    i.d(Charset.forName("UTF-16LE"), "forName(...)");
    i.d(Charset.forName("US-ASCII"), "forName(...)");
    i.d(Charset.forName("ISO-8859-1"), "forName(...)");
  }
}

/* Location:
 * Qualified Name:     lc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */