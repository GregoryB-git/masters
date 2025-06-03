package d2;

import c2.b;
import f2.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class a
  implements g
{
  public static final String c;
  public static final String d;
  public static final String e;
  public static final Set f;
  public static final a g;
  public static final a h;
  public final String a;
  public final String b;
  
  static
  {
    String str1 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    c = str1;
    String str2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
    d = str2;
    String str3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
    e = str3;
    f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[] { b.b("proto"), b.b("json") })));
    g = new a(str1, null);
    h = new a(str2, str3);
  }
  
  public a(String paramString1, String paramString2)
  {
    a = paramString1;
    b = paramString2;
  }
  
  public static a c(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new String(paramArrayOfByte, Charset.forName("UTF-8"));
    if (paramArrayOfByte.startsWith("1$"))
    {
      paramArrayOfByte = paramArrayOfByte.substring(2).split(Pattern.quote("\\"), 2);
      if (paramArrayOfByte.length == 2)
      {
        byte b1 = paramArrayOfByte[0];
        if (!b1.isEmpty())
        {
          byte b2 = paramArrayOfByte[1];
          paramArrayOfByte = b2;
          if (b2.isEmpty()) {
            paramArrayOfByte = null;
          }
          return new a(b1, paramArrayOfByte);
        }
        throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
      }
      throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
    }
    throw new IllegalArgumentException("Version marker missing from extras");
  }
  
  public Set a()
  {
    return f;
  }
  
  public byte[] b()
  {
    String str1 = b;
    if ((str1 == null) && (a == null)) {
      return null;
    }
    String str2 = a;
    String str3 = str1;
    if (str1 == null) {
      str3 = "";
    }
    return String.format("%s%s%s%s", new Object[] { "1$", str2, "\\", str3 }).getBytes(Charset.forName("UTF-8"));
  }
  
  public String d()
  {
    return "cct";
  }
  
  public String e()
  {
    return b;
  }
  
  public String f()
  {
    return a;
  }
  
  public byte[] r()
  {
    return b();
  }
}

/* Location:
 * Qualified Name:     d2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */