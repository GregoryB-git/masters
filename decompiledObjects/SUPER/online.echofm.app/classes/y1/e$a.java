package y1;

import G1.g;
import O1.P;
import V5.t;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import x1.o;

public final class e$a
{
  public final String c(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      Charset localCharset = Charset.forName("UTF-8");
      Intrinsics.checkNotNullExpressionValue(localCharset, "Charset.forName(charsetName)");
      if (paramString != null)
      {
        paramString = paramString.getBytes(localCharset);
        Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.String).getBytes(charset)");
        localMessageDigest.update(paramString, 0, paramString.length);
        paramString = localMessageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(paramString, "digest.digest()");
        return g.c(paramString);
      }
    }
    catch (UnsupportedEncodingException paramString)
    {
      break label78;
    }
    catch (NoSuchAlgorithmException paramString) {}
    paramString = new java/lang/NullPointerException;
    paramString.<init>("null cannot be cast to non-null type java.lang.String");
    throw paramString;
    label78:
    P.i0("Failed to generate checksum: ", paramString);
    return "1";
    P.i0("Failed to generate checksum: ", paramString);
    return "0";
  }
  
  public final void d(String paramString)
  {
    if ((paramString != null) && (paramString.length() != 0) && (paramString.length() <= 40)) {
      synchronized (e.a())
      {
        boolean bool = e.a().contains(paramString);
        t localt = t.a;
        if (!bool)
        {
          if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").b(paramString)) {
            synchronized (e.a())
            {
              e.a().add(paramString);
            }
          }
          ??? = x.a;
          paramString = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[] { paramString }, 1));
          Intrinsics.checkNotNullExpressionValue(paramString, "java.lang.String.format(format, *args)");
          throw new o(paramString);
        }
        return;
      }
    }
    ??? = paramString;
    if (paramString == null) {
      ??? = "<None Provided>";
    }
    paramString = x.a;
    paramString = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[] { ???, Integer.valueOf(40) }, 2));
    Intrinsics.checkNotNullExpressionValue(paramString, "java.lang.String.format(locale, format, *args)");
    throw new o(paramString);
  }
}

/* Location:
 * Qualified Name:     y1.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */