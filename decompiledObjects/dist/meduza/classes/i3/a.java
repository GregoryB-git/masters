package i3;

import b.a0;
import h3.c;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import k3.l;

public final class a
  implements l
{
  public static final String c;
  public static final Set<c> d;
  public static final a e;
  public static final a f;
  public final String a;
  public final String b;
  
  static
  {
    String str1 = a0.w("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    c = str1;
    String str2 = a0.w("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
    String str3 = a0.w("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
    d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c[] { new c("proto"), new c("json") })));
    e = new a(str1, null);
    f = new a(str2, str3);
  }
  
  public a(String paramString1, String paramString2)
  {
    a = paramString1;
    b = paramString2;
  }
  
  public static a a(byte[] paramArrayOfByte)
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
  
  public final byte[] b()
  {
    String str1 = b;
    Object localObject;
    if ((str1 == null) && (a == null))
    {
      localObject = null;
    }
    else
    {
      String str2 = a;
      localObject = str1;
      if (str1 == null) {
        localObject = "";
      }
      localObject = String.format("%s%s%s%s", new Object[] { "1$", str2, "\\", localObject }).getBytes(Charset.forName("UTF-8"));
    }
    return (byte[])localObject;
  }
}

/* Location:
 * Qualified Name:     i3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */