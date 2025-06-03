package m5;

import android.graphics.PointF;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import h5.a.a;
import h5.g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v5.e0;
import v5.m;
import v5.u;

public final class a
  extends h5.f
{
  public static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
  public final boolean m;
  public final b n;
  public LinkedHashMap o;
  public float p = -3.4028235E38F;
  public float q = -3.4028235E38F;
  
  public a(List<byte[]> paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      m = true;
      Object localObject = e0.n((byte[])paramList.get(0));
      x6.b.q(((String)localObject).startsWith("Format:"));
      localObject = b.a((String)localObject);
      localObject.getClass();
      n = ((b)localObject);
      j(new u((byte[])paramList.get(1)), n7.d.c);
    }
    else
    {
      m = false;
      n = null;
    }
  }
  
  public static int i(long paramLong, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i = paramArrayList1.size();
    int j;
    do
    {
      j = i - 1;
      if (j < 0) {
        break;
      }
      if (((Long)paramArrayList1.get(j)).longValue() == paramLong) {
        return j;
      }
      i = j;
    } while (((Long)paramArrayList1.get(j)).longValue() >= paramLong);
    i = j + 1;
    break label70;
    i = 0;
    label70:
    paramArrayList1.add(i, Long.valueOf(paramLong));
    paramArrayList1 = new java/util/ArrayList;
    if (i == 0) {
      paramArrayList1.<init>();
    } else {
      paramArrayList1.<init>((Collection)paramArrayList2.get(i - 1));
    }
    paramArrayList2.add(i, paramArrayList1);
    return i;
  }
  
  public static long k(String paramString)
  {
    paramString = r.matcher(paramString.trim());
    if (!paramString.matches()) {
      return -9223372036854775807L;
    }
    String str = paramString.group(1);
    int i = e0.a;
    long l1 = Long.parseLong(str);
    long l2 = Long.parseLong(paramString.group(2));
    long l3 = Long.parseLong(paramString.group(3));
    return Long.parseLong(paramString.group(4)) * 10000L + (l3 * 1000000L + (l2 * 60L * 1000000L + l1 * 60L * 60L * 1000000L));
  }
  
  public final g h(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    Object localObject1 = this;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject2 = new u(paramArrayOfByte, paramInt);
    Object localObject3 = ((u)localObject2).C();
    if (localObject3 == null) {
      localObject3 = n7.d.c;
    }
    if (!m) {
      ((a)localObject1).j((u)localObject2, (Charset)localObject3);
    }
    if (m) {
      paramArrayOfByte = n;
    } else {
      paramArrayOfByte = null;
    }
    for (;;)
    {
      Object localObject4 = this;
      Object localObject5 = ((u)localObject2).h((Charset)localObject3);
      if (localObject5 == null) {
        break;
      }
      if (((String)localObject5).startsWith("Format:"))
      {
        paramArrayOfByte = b.a((String)localObject5);
      }
      else
      {
        if (((String)localObject5).startsWith("Dialogue:")) {
          if (paramArrayOfByte == null)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Skipping dialogue line before complete format: ");
            ((StringBuilder)localObject1).append((String)localObject5);
            m.f("SsaDecoder", ((StringBuilder)localObject1).toString());
          }
          else
          {
            x6.b.q(((String)localObject5).startsWith("Dialogue:"));
            Object localObject6 = ((String)localObject5).substring(9).split(",", e);
            long l1;
            long l2;
            if (localObject6.length != e)
            {
              localObject1 = new StringBuilder();
              localObject6 = "Skipping dialogue line with fewer columns than format: ";
            }
            else
            {
              l1 = k(localObject6[a]);
              if (l1 == -9223372036854775807L)
              {
                localObject1 = new StringBuilder();
              }
              else
              {
                l2 = k(localObject6[b]);
                if (l2 != -9223372036854775807L) {
                  break label326;
                }
                localObject1 = new StringBuilder();
              }
              localObject6 = "Skipping invalid timing: ";
            }
            ((StringBuilder)localObject1).append((String)localObject6);
            ((StringBuilder)localObject1).append((String)localObject5);
            m.f("SsaDecoder", ((StringBuilder)localObject1).toString());
            break label1420;
            label326:
            localObject1 = o;
            int i = -1;
            if (localObject1 != null)
            {
              paramInt = c;
              if (paramInt != -1)
              {
                localObject1 = (c)((LinkedHashMap)localObject1).get(localObject6[paramInt].trim());
                break label374;
              }
            }
            localObject1 = null;
            label374:
            Object localObject7 = localObject6[d];
            Matcher localMatcher = c.b.a.matcher((CharSequence)localObject7);
            localObject6 = null;
            for (;;)
            {
              paramBoolean = localMatcher.find();
              if (!paramBoolean) {
                break;
              }
              String str = localMatcher.group(1);
              str.getClass();
              try
              {
                localObject5 = c.b.a(str);
                if (localObject5 != null) {
                  localObject6 = localObject5;
                }
              }
              catch (RuntimeException localRuntimeException1)
              {
                label490:
                float f1;
                float f2;
                float f3;
                float f4;
                int j;
                for (;;) {}
              }
              try
              {
                localObject5 = c.b.d.matcher(str);
                if (((Matcher)localObject5).find())
                {
                  localObject5 = ((Matcher)localObject5).group(1);
                  localObject5.getClass();
                  paramInt = c.a((String)localObject5);
                }
                else
                {
                  paramInt = -1;
                }
                if (paramInt != -1) {
                  i = paramInt;
                }
              }
              catch (RuntimeException localRuntimeException2)
              {
                break label490;
              }
            }
            localObject5 = localObject3;
            localObject3 = new m5/c$b;
            localObject3 = c.b.a.matcher((CharSequence)localObject7).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
            f1 = p;
            f2 = q;
            localObject7 = new SpannableString((CharSequence)localObject3);
            localObject4 = new a.a();
            a = ((CharSequence)localObject7);
            f3 = -3.4028235E38F;
            if (localObject1 != null)
            {
              if (c != null) {
                ((SpannableString)localObject7).setSpan(new ForegroundColorSpan(c.intValue()), 0, ((SpannableString)localObject7).length(), 33);
              }
              if ((j == 3) && (d != null)) {
                ((SpannableString)localObject7).setSpan(new BackgroundColorSpan(d.intValue()), 0, ((SpannableString)localObject7).length(), 33);
              }
              f4 = e;
              if ((f4 != -3.4028235E38F) && (f2 != -3.4028235E38F))
              {
                k = (f4 / f2);
                j = 1;
              }
              paramBoolean = f;
              if ((paramBoolean) && (g))
              {
                localObject3 = new StyleSpan(3);
              }
              else if (paramBoolean)
              {
                localObject3 = new StyleSpan(1);
              }
              else
              {
                if (!g) {
                  break label801;
                }
                localObject3 = new StyleSpan(2);
              }
              ((SpannableString)localObject7).setSpan(localObject3, 0, ((SpannableString)localObject7).length(), 33);
              label801:
              if (h) {
                ((SpannableString)localObject7).setSpan(new UnderlineSpan(), 0, ((SpannableString)localObject7).length(), 33);
              }
              if (i) {
                ((SpannableString)localObject7).setSpan(new StrikethroughSpan(), 0, ((SpannableString)localObject7).length(), 33);
              }
            }
            if (i == -1) {
              if (localObject1 != null) {
                i = b;
              } else {
                i = -1;
              }
            }
            switch (i)
            {
            case 0: 
            default: 
              f.p("Unknown alignment: ", i, "SsaDecoder");
              break;
            case 3: 
            case 6: 
            case 9: 
              localObject3 = Layout.Alignment.ALIGN_OPPOSITE;
              break;
            case 2: 
            case 5: 
            case 8: 
              localObject3 = Layout.Alignment.ALIGN_CENTER;
              break;
            case 1: 
            case 4: 
            case 7: 
              localObject3 = Layout.Alignment.ALIGN_NORMAL;
              break;
            }
            localObject3 = null;
            c = ((Layout.Alignment)localObject3);
            j = Integer.MIN_VALUE;
            switch (i)
            {
            case 0: 
            default: 
              f.p("Unknown alignment: ", i, "SsaDecoder");
              break;
            case 3: 
            case 6: 
            case 9: 
              paramInt = 2;
              break;
            case 2: 
            case 5: 
            case 8: 
              paramInt = 1;
              break;
            case 1: 
            case 4: 
            case 7: 
              paramInt = 0;
              break;
            }
            paramInt = Integer.MIN_VALUE;
            i = paramInt;
            paramInt = j;
            switch (i)
            {
            case 0: 
            default: 
              f.p("Unknown alignment: ", i, "SsaDecoder");
              paramInt = j;
              break;
            case 7: 
            case 8: 
            case 9: 
              paramInt = 0;
              break;
            case 4: 
            case 5: 
            case 6: 
              paramInt = 1;
              break;
            case 1: 
            case 2: 
            case 3: 
              paramInt = 2;
            }
            g = paramInt;
            if ((localObject6 != null) && (f2 != -3.4028235E38F) && (f1 != -3.4028235E38F))
            {
              h = (x / f1);
              f2 = y / f2;
            }
            else
            {
              i = i;
              if (i != 0)
              {
                if (i != 1)
                {
                  if (i != 2) {
                    f2 = -3.4028235E38F;
                  } else {
                    f2 = 0.95F;
                  }
                }
                else {
                  f2 = 0.5F;
                }
              }
              else {
                f2 = 0.05F;
              }
              h = f2;
              if (paramInt != 0)
              {
                if (paramInt != 1)
                {
                  if (paramInt != 2) {
                    f2 = f3;
                  } else {
                    f2 = 0.95F;
                  }
                }
                else {
                  f2 = 0.5F;
                }
              }
              else {
                f2 = 0.05F;
              }
            }
            e = f2;
            f = 0;
            localObject6 = ((a.a)localObject4).a();
            paramInt = i(l1, localArrayList2, localArrayList1);
            i = i(l2, localArrayList2, localArrayList1);
            for (;;)
            {
              localObject1 = localObject5;
              localObject3 = localObject2;
              if (paramInt >= i) {
                break;
              }
              ((List)localArrayList1.get(paramInt)).add(localObject6);
              paramInt++;
            }
          }
        }
        label1420:
        localObject1 = localObject3;
        localObject3 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject1;
      }
    }
    return new d(localArrayList1, localArrayList2);
  }
  
  public final void j(u paramu, Charset paramCharset)
  {
    Object localObject1 = paramu.h(paramCharset);
    boolean bool1;
    int i;
    int j;
    if (localObject1 != null)
    {
      bool1 = "[Script Info]".equalsIgnoreCase((String)localObject1);
      i = 2;
      j = 0;
      if (!bool1) {}
    }
    for (;;)
    {
      localObject1 = paramu.h(paramCharset);
      if ((localObject1 == null) || ((c - b != 0) && (paramu.b(paramCharset) == '['))) {
        break;
      }
      localObject1 = ((String)localObject1).split(":");
      if (localObject1.length == 2)
      {
        Object localObject2 = x6.b.x0(localObject1[0].trim());
        localObject2.getClass();
        if ((((String)localObject2).equals("playresx")) || (((String)localObject2).equals("playresy")))
        {
          label1457:
          label1486:
          try
          {
            q = Float.parseFloat(localObject1[1].trim());
          }
          catch (NumberFormatException localNumberFormatException1) {}
          p = Float.parseFloat(localObject1[1].trim());
          continue;
          if ("[V4+ Styles]".equalsIgnoreCase((String)localObject1))
          {
            LinkedHashMap localLinkedHashMap = new LinkedHashMap();
            localObject1 = null;
            for (;;)
            {
              String str1 = paramu.h(paramCharset);
              if ((str1 == null) || ((c - b != 0) && (paramu.b(paramCharset) == '['))) {
                break label1486;
              }
              int i2;
              if (str1.startsWith("Format:"))
              {
                localObject2 = TextUtils.split(str1.substring(7), ",");
                int k = j;
                int i1 = -1;
                i2 = i1;
                i3 = i2;
                int i4 = i3;
                int i5 = i4;
                int i6 = i5;
                int i7 = i6;
                int i8 = i7;
                int i9 = i8;
                int i10 = i9;
                int i11 = i3;
                int i12 = i2;
                for (i2 = k; i2 < localObject2.length; i2++)
                {
                  localObject1 = x6.b.x0(localObject2[i2].trim());
                  localObject1.getClass();
                  switch (((String)localObject1).hashCode())
                  {
                  default: 
                    break;
                  case 1988365454: 
                    if (((String)localObject1).equals("outlinecolour")) {
                      i3 = 9;
                    }
                    break;
                  case 1767875043: 
                    if (((String)localObject1).equals("alignment")) {
                      i3 = 8;
                    }
                    break;
                  case 767321349: 
                    if (((String)localObject1).equals("borderstyle")) {
                      i3 = 7;
                    }
                    break;
                  case 366554320: 
                    if (((String)localObject1).equals("fontsize")) {
                      i3 = 6;
                    }
                    break;
                  case 3373707: 
                    if (((String)localObject1).equals("name")) {
                      i3 = 5;
                    }
                    break;
                  case 3029637: 
                    if (((String)localObject1).equals("bold")) {
                      i3 = 4;
                    }
                    break;
                  case -70925746: 
                    if (((String)localObject1).equals("primarycolour")) {
                      i3 = 3;
                    }
                    break;
                  case -192095652: 
                    if (((String)localObject1).equals("strikeout")) {
                      i3 = i;
                    }
                    break;
                  case -1026963764: 
                    if (((String)localObject1).equals("underline")) {
                      i3 = 1;
                    }
                    break;
                  case -1178781136: 
                    if (((String)localObject1).equals("italic")) {
                      i3 = j;
                    }
                    break;
                  }
                  i3 = -1;
                  switch (i3)
                  {
                  default: 
                    break;
                  case 9: 
                    i4 = i2;
                    break;
                  case 8: 
                    i12 = i2;
                    break;
                  case 7: 
                    i10 = i2;
                    break;
                  case 6: 
                    i5 = i2;
                    break;
                  case 5: 
                    i1 = i2;
                    break;
                  case 4: 
                    i6 = i2;
                    break;
                  case 3: 
                    i11 = i2;
                    break;
                  case 2: 
                    i9 = i2;
                    break;
                  case 1: 
                    i8 = i2;
                    break;
                  case 0: 
                    i7 = i2;
                  }
                }
                if (i1 != -1)
                {
                  localObject1 = new c.a(i1, i12, i11, i4, i5, i6, i7, i8, i9, i10, localObject2.length);
                  continue;
                }
                break;
              }
              Object localObject3;
              if (str1.startsWith("Style:")) {
                if (localObject1 == null)
                {
                  localObject2 = new StringBuilder();
                  ((StringBuilder)localObject2).append("Skipping 'Style:' line before 'Format:' line: ");
                  ((StringBuilder)localObject2).append(str1);
                  m.f("SsaDecoder", ((StringBuilder)localObject2).toString());
                }
                else
                {
                  x6.b.q(str1.startsWith("Style:"));
                  localObject3 = TextUtils.split(str1.substring(6), ",");
                  i3 = localObject3.length;
                  i2 = k;
                  if (i3 != i2)
                  {
                    localObject2 = new Object[3];
                    localObject2[j] = Integer.valueOf(i2);
                    localObject2[1] = Integer.valueOf(localObject3.length);
                    localObject2[i] = str1;
                    m.f("SsaStyle", e0.m("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", (Object[])localObject2));
                  }
                }
              }
              for (;;)
              {
                try
                {
                  str2 = localObject3[a].trim();
                  i2 = b;
                  if (i2 != -1) {
                    i2 = c.a(localObject3[i2].trim());
                  } else {
                    i2 = -1;
                  }
                  i3 = c;
                  if (i3 != -1) {
                    localObject2 = c.c(localObject3[i3].trim());
                  } else {
                    localObject2 = null;
                  }
                  i3 = d;
                  if (i3 != -1) {
                    localInteger = c.c(localObject3[i3].trim());
                  } else {
                    localInteger = null;
                  }
                  i3 = e;
                  if (i3 != -1)
                  {
                    String str3 = localObject3[i3].trim();
                    try
                    {
                      f = Float.parseFloat(str3);
                    }
                    catch (NumberFormatException localNumberFormatException2)
                    {
                      StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
                      localStringBuilder2.<init>();
                      localStringBuilder2.append("Failed to parse font size: '");
                      localStringBuilder2.append(str3);
                      localStringBuilder2.append("'");
                      m.g("SsaStyle", localStringBuilder2.toString(), localNumberFormatException2);
                    }
                  }
                  else
                  {
                    f = -3.4028235E38F;
                  }
                  i3 = f;
                  if ((i3 != -1) && (c.b(localObject3[i3].trim()))) {
                    bool1 = true;
                  } else {
                    bool1 = false;
                  }
                  i3 = g;
                  if ((i3 != -1) && (c.b(localObject3[i3].trim()))) {
                    bool2 = true;
                  } else {
                    bool2 = false;
                  }
                  i3 = h;
                  if ((i3 != -1) && (c.b(localObject3[i3].trim()))) {
                    bool3 = true;
                  } else {
                    bool3 = false;
                  }
                  i3 = i;
                  if ((i3 != -1) && (c.b(localObject3[i3].trim()))) {
                    bool4 = true;
                  } else {
                    bool4 = false;
                  }
                  i3 = j;
                  if (i3 != -1) {
                    localObject3 = localObject3[i3].trim();
                  }
                }
                catch (RuntimeException localRuntimeException)
                {
                  String str2;
                  Integer localInteger;
                  float f;
                  boolean bool2;
                  boolean bool3;
                  boolean bool4;
                  StringBuilder localStringBuilder1;
                  localObject2 = new StringBuilder();
                  ((StringBuilder)localObject2).append("Skipping malformed 'Style:' line: '");
                  ((StringBuilder)localObject2).append(str1);
                  ((StringBuilder)localObject2).append("'");
                  m.g("SsaStyle", ((StringBuilder)localObject2).toString(), localRuntimeException);
                }
                try
                {
                  j = Integer.parseInt(((String)localObject3).trim());
                  if ((j != 1) && (j != 3)) {
                    i3 = 0;
                  } else {
                    i3 = 1;
                  }
                  if (i3 != 0) {
                    i3 = j;
                  }
                }
                catch (NumberFormatException localNumberFormatException3) {}
              }
              localStringBuilder1 = new java/lang/StringBuilder;
              localStringBuilder1.<init>();
              localStringBuilder1.append("Ignoring unknown BorderStyle: ");
              localStringBuilder1.append((String)localObject3);
              m.f("SsaStyle", localStringBuilder1.toString());
              int i3 = -1;
              localObject2 = new c(str2, i2, (Integer)localObject2, localInteger, f, bool1, bool2, bool3, bool4, i3);
              break label1457;
              localObject2 = null;
              if (localObject2 != null) {
                localLinkedHashMap.put(a, localObject2);
              }
              i = 2;
              j = 0;
            }
            o = localLinkedHashMap;
            break;
          }
          if ("[V4 Styles]".equalsIgnoreCase((String)localObject1))
          {
            m.e("SsaDecoder", "[V4 Styles] are not supported");
            break;
          }
          if (!"[Events]".equalsIgnoreCase((String)localObject1)) {
            break;
          }
          return;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     m5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */