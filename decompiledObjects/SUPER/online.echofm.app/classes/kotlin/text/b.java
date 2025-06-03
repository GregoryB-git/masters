package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

public final class b
{
  public static final b a = new b();
  public static final Charset b;
  public static final Charset c;
  public static final Charset d;
  public static final Charset e;
  public static final Charset f;
  public static final Charset g;
  
  static
  {
    Charset localCharset = Charset.forName("UTF-8");
    Intrinsics.checkNotNullExpressionValue(localCharset, "forName(...)");
    b = localCharset;
    localCharset = Charset.forName("UTF-16");
    Intrinsics.checkNotNullExpressionValue(localCharset, "forName(...)");
    c = localCharset;
    localCharset = Charset.forName("UTF-16BE");
    Intrinsics.checkNotNullExpressionValue(localCharset, "forName(...)");
    d = localCharset;
    localCharset = Charset.forName("UTF-16LE");
    Intrinsics.checkNotNullExpressionValue(localCharset, "forName(...)");
    e = localCharset;
    localCharset = Charset.forName("US-ASCII");
    Intrinsics.checkNotNullExpressionValue(localCharset, "forName(...)");
    f = localCharset;
    localCharset = Charset.forName("ISO-8859-1");
    Intrinsics.checkNotNullExpressionValue(localCharset, "forName(...)");
    g = localCharset;
  }
}

/* Location:
 * Qualified Name:     kotlin.text.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */