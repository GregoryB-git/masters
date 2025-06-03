package h1;

import X2.v;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import c1.t;
import c1.t.b;
import f0.a.b;
import g0.g;
import g0.o;
import g0.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
  implements t
{
  public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
  public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
  public final StringBuilder a = new StringBuilder();
  public final ArrayList b = new ArrayList();
  public final z c = new z();
  
  private Charset f(z paramz)
  {
    paramz = paramz.O();
    if (paramz == null) {
      paramz = W2.e.c;
    }
    return paramz;
  }
  
  public static float g(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt == 2) {
          return 0.92F;
        }
        throw new IllegalArgumentException();
      }
      return 0.5F;
    }
    return 0.08F;
  }
  
  public static long h(Matcher paramMatcher, int paramInt)
  {
    String str = paramMatcher.group(paramInt + 1);
    if (str != null) {
      l1 = Long.parseLong(str) * 3600000L;
    } else {
      l1 = 0L;
    }
    long l2 = l1 + Long.parseLong((String)g0.a.e(paramMatcher.group(paramInt + 2))) * 60000L + Long.parseLong((String)g0.a.e(paramMatcher.group(paramInt + 3))) * 1000L;
    paramMatcher = paramMatcher.group(paramInt + 4);
    long l1 = l2;
    if (paramMatcher != null) {
      l1 = l2 + Long.parseLong(paramMatcher);
    }
    return l1 * 1000L;
  }
  
  public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, t.b paramb, g paramg)
  {
    Object localObject1 = paramg;
    Object localObject2 = "SubripParser";
    c.R(paramArrayOfByte, paramInt1 + paramInt2);
    c.T(paramInt1);
    Charset localCharset = f(c);
    ArrayList localArrayList;
    if ((a != -9223372036854775807L) && (b))
    {
      localArrayList = new ArrayList();
      paramArrayOfByte = (byte[])localObject2;
    }
    else
    {
      localArrayList = null;
      paramArrayOfByte = (byte[])localObject2;
    }
    for (;;)
    {
      localObject2 = c.s(localCharset);
      if ((localObject2 == null) || (((String)localObject2).length() != 0)) {}
      try
      {
        Integer.parseInt((String)localObject2);
        localObject2 = c.s(localCharset);
        if (localObject2 == null)
        {
          o.h(paramArrayOfByte, "Unexpected end");
          break;
        }
        Object localObject3 = d.matcher((CharSequence)localObject2);
        if (((Matcher)localObject3).matches())
        {
          long l1 = h((Matcher)localObject3, 1);
          long l2 = h((Matcher)localObject3, 6);
          localObject1 = a;
          paramInt1 = 0;
          ((StringBuilder)localObject1).setLength(0);
          b.clear();
          for (localObject1 = c.s(localCharset); !TextUtils.isEmpty((CharSequence)localObject1); localObject1 = c.s(localCharset))
          {
            if (a.length() > 0) {
              a.append("<br>");
            }
            a.append(i((String)localObject1, b));
          }
          localObject2 = Html.fromHtml(a.toString());
          while (paramInt1 < b.size())
          {
            localObject1 = (String)b.get(paramInt1);
            if (((String)localObject1).matches("\\{\\\\an[1-9]\\}")) {
              break label321;
            }
            paramInt1++;
          }
          localObject1 = null;
          label321:
          long l3 = a;
          if ((l3 != -9223372036854775807L) && (l1 < l3))
          {
            if (localArrayList != null) {
              localArrayList.add(new c1.e(v.Z(e((Spanned)localObject2, (String)localObject1)), l1, l2 - l1));
            }
          }
          else {
            paramg.accept(new c1.e(v.Z(e((Spanned)localObject2, (String)localObject1)), l1, l2 - l1));
          }
          localObject1 = paramg;
          continue;
        }
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("Skipping invalid timing: ");
        ((StringBuilder)localObject3).append((String)localObject2);
        localObject2 = ((StringBuilder)localObject3).toString();
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Skipping invalid index: ");
          localStringBuilder.append((String)localObject2);
          localObject2 = localStringBuilder.toString();
        }
        if (localArrayList == null) {
          return;
        }
        paramArrayOfByte = localArrayList.iterator();
        while (paramArrayOfByte.hasNext()) {
          ((g)localObject1).accept((c1.e)paramArrayOfByte.next());
        }
      }
      o.h(paramArrayOfByte, (String)localObject2);
    }
  }
  
  public int d()
  {
    return 1;
  }
  
  public final f0.a e(Spanned paramSpanned, String paramString)
  {
    paramSpanned = new a.b().o(paramSpanned);
    if (paramString == null) {
      return paramSpanned.a();
    }
    switch (paramString.hashCode())
    {
    default: 
      break;
    case -685620462: 
      if (paramString.equals("{\\an9}")) {
        i = 5;
      }
      break;
    case -685620493: 
      if (paramString.equals("{\\an8}")) {
        i = 8;
      }
      break;
    case -685620524: 
      if (paramString.equals("{\\an7}")) {
        i = 2;
      }
      break;
    case -685620555: 
      if (paramString.equals("{\\an6}")) {
        i = 4;
      }
      break;
    case -685620586: 
      if (paramString.equals("{\\an5}")) {
        i = 7;
      }
      break;
    case -685620617: 
      if (paramString.equals("{\\an4}")) {
        i = 1;
      }
      break;
    case -685620648: 
      if (paramString.equals("{\\an3}")) {
        i = 3;
      }
      break;
    case -685620679: 
      if (paramString.equals("{\\an2}")) {
        i = 6;
      }
      break;
    case -685620710: 
      if (paramString.equals("{\\an1}")) {
        i = 0;
      }
      break;
    }
    int i = -1;
    if ((i != 0) && (i != 1) && (i != 2))
    {
      if ((i != 3) && (i != 4) && (i != 5)) {
        paramSpanned.l(1);
      } else {
        paramSpanned.l(2);
      }
    }
    else {
      paramSpanned.l(0);
    }
    switch (paramString.hashCode())
    {
    default: 
      break;
    case -685620462: 
      if (paramString.equals("{\\an9}")) {
        i = 5;
      }
      break;
    case -685620493: 
      if (paramString.equals("{\\an8}")) {
        i = 4;
      }
      break;
    case -685620524: 
      if (paramString.equals("{\\an7}")) {
        i = 3;
      }
      break;
    case -685620555: 
      if (paramString.equals("{\\an6}")) {
        i = 8;
      }
      break;
    case -685620586: 
      if (paramString.equals("{\\an5}")) {
        i = 7;
      }
      break;
    case -685620617: 
      if (paramString.equals("{\\an4}")) {
        i = 6;
      }
      break;
    case -685620648: 
      if (paramString.equals("{\\an3}")) {
        i = 2;
      }
      break;
    case -685620679: 
      if (paramString.equals("{\\an2}")) {
        i = 1;
      }
      break;
    case -685620710: 
      if (paramString.equals("{\\an1}")) {
        i = 0;
      }
      break;
    }
    i = -1;
    if ((i != 0) && (i != 1) && (i != 2))
    {
      if ((i != 3) && (i != 4) && (i != 5)) {
        paramSpanned.i(1);
      } else {
        paramSpanned.i(0);
      }
    }
    else {
      paramSpanned.i(2);
    }
    return paramSpanned.k(g(paramSpanned.d())).h(g(paramSpanned.c()), 0).a();
  }
  
  public final String i(String paramString, ArrayList paramArrayList)
  {
    String str = paramString.trim();
    paramString = new StringBuilder(str);
    Matcher localMatcher = e.matcher(str);
    int i = 0;
    while (localMatcher.find())
    {
      str = localMatcher.group();
      paramArrayList.add(str);
      int j = localMatcher.start() - i;
      int k = str.length();
      paramString.replace(j, j + k, "");
      i += k;
    }
    return paramString.toString();
  }
}

/* Location:
 * Qualified Name:     h1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */