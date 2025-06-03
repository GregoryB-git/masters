package g1;

import android.graphics.PointF;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c1.t;
import c1.t.b;
import f0.a.b;
import g0.M;
import g0.g;
import g0.o;
import g0.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
  implements t
{
  public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
  public final boolean a;
  public final a b;
  public final z c = new z();
  public Map d;
  public float e = -3.4028235E38F;
  public float f = -3.4028235E38F;
  
  public b(List paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      a = true;
      String str = M.H((byte[])paramList.get(0));
      g0.a.a(str.startsWith("Format:"));
      b = ((a)g0.a.e(a.a(str)));
      k(new z((byte[])paramList.get(1)), W2.e.c);
    }
    else
    {
      a = false;
      b = null;
    }
  }
  
  public static int e(long paramLong, List paramList1, List paramList2)
  {
    for (int i = paramList1.size() - 1; i >= 0; i--)
    {
      if (((Long)paramList1.get(i)).longValue() == paramLong) {
        return i;
      }
      if (((Long)paramList1.get(i)).longValue() < paramLong)
      {
        i++;
        break label71;
      }
    }
    i = 0;
    label71:
    paramList1.add(i, Long.valueOf(paramLong));
    paramList1 = new java/util/ArrayList;
    if (i == 0) {
      paramList1.<init>();
    } else {
      paramList1.<init>((Collection)paramList2.get(i - 1));
    }
    paramList2.add(i, paramList1);
    return i;
  }
  
  public static float f(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return -3.4028235E38F;
        }
        return 0.95F;
      }
      return 0.5F;
    }
    return 0.05F;
  }
  
  public static f0.a g(String paramString, c paramc, c.b paramb, float paramFloat1, float paramFloat2)
  {
    SpannableString localSpannableString = new SpannableString(paramString);
    a.b localb = new a.b().o(localSpannableString);
    if (paramc != null)
    {
      if (c != null) {
        localSpannableString.setSpan(new ForegroundColorSpan(c.intValue()), 0, localSpannableString.length(), 33);
      }
      if ((j == 3) && (d != null)) {
        localSpannableString.setSpan(new BackgroundColorSpan(d.intValue()), 0, localSpannableString.length(), 33);
      }
      float f1 = e;
      if ((f1 != -3.4028235E38F) && (paramFloat2 != -3.4028235E38F)) {
        localb.q(f1 / paramFloat2, 1);
      }
      boolean bool = f;
      if ((bool) && (g)) {
        paramString = new StyleSpan(3);
      }
      for (;;)
      {
        localSpannableString.setSpan(paramString, 0, localSpannableString.length(), 33);
        break;
        if (bool)
        {
          paramString = new StyleSpan(1);
        }
        else
        {
          if (!g) {
            break;
          }
          paramString = new StyleSpan(2);
        }
      }
      if (h) {
        localSpannableString.setSpan(new UnderlineSpan(), 0, localSpannableString.length(), 33);
      }
      if (i) {
        localSpannableString.setSpan(new StrikethroughSpan(), 0, localSpannableString.length(), 33);
      }
    }
    int i = a;
    if (i == -1) {
      if (paramc != null) {
        i = b;
      } else {
        i = -1;
      }
    }
    localb.p(q(i)).l(p(i)).i(o(i));
    paramString = b;
    if ((paramString != null) && (paramFloat2 != -3.4028235E38F) && (paramFloat1 != -3.4028235E38F)) {
      localb.k(x / paramFloat1);
    }
    for (paramFloat1 = b.y / paramFloat2;; paramFloat1 = f(localb.c()))
    {
      localb.h(paramFloat1, 0);
      break;
      localb.k(f(localb.d()));
    }
    return localb.a();
  }
  
  public static Map m(z paramz, Charset paramCharset)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    c.a locala = null;
    for (;;)
    {
      Object localObject = paramz.s(paramCharset);
      if ((localObject == null) || ((paramz.a() != 0) && (paramz.h(paramCharset) == '['))) {
        break;
      }
      if (((String)localObject).startsWith("Format:")) {
        locala = c.a.a((String)localObject);
      } else if (((String)localObject).startsWith("Style:")) {
        if (locala == null)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Skipping 'Style:' line before 'Format:' line: ");
          localStringBuilder.append((String)localObject);
          o.h("SsaParser", localStringBuilder.toString());
        }
        else
        {
          localObject = c.b((String)localObject, locala);
          if (localObject != null) {
            localLinkedHashMap.put(a, localObject);
          }
        }
      }
    }
    return localLinkedHashMap;
  }
  
  public static long n(String paramString)
  {
    paramString = g.matcher(paramString.trim());
    if (!paramString.matches()) {
      return -9223372036854775807L;
    }
    return Long.parseLong((String)M.i(paramString.group(1))) * 3600000000L + Long.parseLong((String)M.i(paramString.group(2))) * 60000000L + Long.parseLong((String)M.i(paramString.group(3))) * 1000000L + Long.parseLong((String)M.i(paramString.group(4))) * 10000L;
  }
  
  public static int o(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown alignment: ");
      localStringBuilder.append(paramInt);
      o.h("SsaParser", localStringBuilder.toString());
      return Integer.MIN_VALUE;
    case 7: 
    case 8: 
    case 9: 
      return 0;
    case 4: 
    case 5: 
    case 6: 
      return 1;
    case 1: 
    case 2: 
    case 3: 
      return 2;
    }
    return Integer.MIN_VALUE;
  }
  
  public static int p(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown alignment: ");
      localStringBuilder.append(paramInt);
      o.h("SsaParser", localStringBuilder.toString());
      return Integer.MIN_VALUE;
    case 3: 
    case 6: 
    case 9: 
      return 2;
    case 2: 
    case 5: 
    case 8: 
      return 1;
    case 1: 
    case 4: 
    case 7: 
      return 0;
    }
    return Integer.MIN_VALUE;
  }
  
  public static Layout.Alignment q(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown alignment: ");
      localStringBuilder.append(paramInt);
      o.h("SsaParser", localStringBuilder.toString());
      return null;
    case 3: 
    case 6: 
    case 9: 
      return Layout.Alignment.ALIGN_OPPOSITE;
    case 2: 
    case 5: 
    case 8: 
      return Layout.Alignment.ALIGN_CENTER;
    case 1: 
    case 4: 
    case 7: 
      return Layout.Alignment.ALIGN_NORMAL;
    }
    return null;
  }
  
  public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, t.b paramb, g paramg)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    c.R(paramArrayOfByte, paramInt1 + paramInt2);
    c.T(paramInt1);
    paramArrayOfByte = h(c);
    if (!a) {
      k(c, paramArrayOfByte);
    }
    j(c, localArrayList1, localArrayList2, paramArrayOfByte);
    if ((a != -9223372036854775807L) && (b)) {
      paramArrayOfByte = new ArrayList();
    } else {
      paramArrayOfByte = null;
    }
    paramInt1 = 0;
    while (paramInt1 < localArrayList1.size())
    {
      List localList = (List)localArrayList1.get(paramInt1);
      if ((!localList.isEmpty()) || (paramInt1 == 0))
      {
        if (paramInt1 == localArrayList1.size() - 1) {
          break label293;
        }
        long l1 = ((Long)localArrayList2.get(paramInt1)).longValue();
        long l2 = ((Long)localArrayList2.get(paramInt1 + 1)).longValue() - ((Long)localArrayList2.get(paramInt1)).longValue();
        long l3 = a;
        if ((l3 != -9223372036854775807L) && (l1 < l3))
        {
          if (paramArrayOfByte != null) {
            paramArrayOfByte.add(new c1.e(localList, l1, l2));
          }
        }
        else {
          paramg.accept(new c1.e(localList, l1, l2));
        }
      }
      paramInt1++;
      continue;
      label293:
      throw new IllegalStateException();
    }
    if (paramArrayOfByte != null)
    {
      paramArrayOfByte = paramArrayOfByte.iterator();
      while (paramArrayOfByte.hasNext()) {
        paramg.accept((c1.e)paramArrayOfByte.next());
      }
    }
  }
  
  public int d()
  {
    return 1;
  }
  
  public final Charset h(z paramz)
  {
    paramz = paramz.O();
    if (paramz == null) {
      paramz = W2.e.c;
    }
    return paramz;
  }
  
  public final void i(String paramString, a parama, List paramList1, List paramList2)
  {
    g0.a.a(paramString.startsWith("Dialogue:"));
    Object localObject = paramString.substring(9).split(",", e);
    if (localObject.length != e)
    {
      parama = new StringBuilder();
      parama.append("Skipping dialogue line with fewer columns than format: ");
      parama.append(paramString);
      o.h("SsaParser", parama.toString());
      return;
    }
    long l1 = n(localObject[a]);
    if (l1 == -9223372036854775807L) {}
    long l2;
    for (parama = new StringBuilder();; parama = new StringBuilder())
    {
      parama.append("Skipping invalid timing: ");
      break;
      l2 = n(localObject[b]);
      if (l2 != -9223372036854775807L) {
        break label143;
      }
    }
    label143:
    paramString = d;
    if (paramString != null)
    {
      i = c;
      if (i != -1)
      {
        paramString = (c)paramString.get(localObject[i].trim());
        break label187;
      }
    }
    paramString = null;
    label187:
    parama = localObject[d];
    localObject = c.b.b(parama);
    paramString = g(c.b.d(parama).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), paramString, (c.b)localObject, e, f);
    int i = e(l1, paramList2, paramList1);
    int j = e(l2, paramList2, paramList1);
    while (i < j)
    {
      ((List)paramList1.get(i)).add(paramString);
      i++;
    }
  }
  
  public final void j(z paramz, List paramList1, List paramList2, Charset paramCharset)
  {
    a locala;
    if (a) {
      locala = b;
    } else {
      locala = null;
    }
    for (;;)
    {
      String str = paramz.s(paramCharset);
      if (str == null) {
        break;
      }
      if (str.startsWith("Format:")) {
        locala = a.a(str);
      } else if (str.startsWith("Dialogue:")) {
        if (locala == null)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Skipping dialogue line before complete format: ");
          localStringBuilder.append(str);
          o.h("SsaParser", localStringBuilder.toString());
        }
        else
        {
          i(str, locala, paramList1, paramList2);
        }
      }
    }
  }
  
  public final void k(z paramz, Charset paramCharset)
  {
    String str;
    do
    {
      for (;;)
      {
        str = paramz.s(paramCharset);
        if (str == null) {
          return;
        }
        if ("[Script Info]".equalsIgnoreCase(str))
        {
          l(paramz, paramCharset);
        }
        else if ("[V4+ Styles]".equalsIgnoreCase(str))
        {
          d = m(paramz, paramCharset);
        }
        else
        {
          if (!"[V4 Styles]".equalsIgnoreCase(str)) {
            break;
          }
          o.f("SsaParser", "[V4 Styles] are not supported");
        }
      }
    } while (!"[Events]".equalsIgnoreCase(str));
  }
  
  public final void l(z paramz, Charset paramCharset)
  {
    for (;;)
    {
      String str = paramz.s(paramCharset);
      String[] arrayOfString;
      if ((str != null) && ((paramz.a() == 0) || (paramz.h(paramCharset) != '[')))
      {
        arrayOfString = str.split(":");
        if (arrayOfString.length == 2)
        {
          str = W2.c.e(arrayOfString[0].trim());
          str.hashCode();
          if ((!str.equals("playresx")) && (!str.equals("playresy"))) {}
        }
      }
      else
      {
        try
        {
          f = Float.parseFloat(arrayOfString[1].trim());
        }
        catch (NumberFormatException localNumberFormatException) {}
        e = Float.parseFloat(arrayOfString[1].trim());
        continue;
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     g1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */