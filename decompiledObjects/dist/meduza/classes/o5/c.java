package o5;

import a0.j;
import android.text.Layout.Alignment;
import android.text.TextUtils;
import h5.i;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o7.b0;
import o7.n0;
import o7.s0;
import o7.t0;
import o7.u0;
import o7.v0;
import o7.x;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p2.m0;
import v5.e0;
import v5.m;

public final class c
  extends h5.f
{
  public static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
  public static final Pattern o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
  public static final Pattern p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
  public static final Pattern q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
  public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
  public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
  public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
  public static final b u = new b(30.0F, 1, 1);
  public static final a v = new a(15);
  public final XmlPullParserFactory m;
  
  public c()
  {
    try
    {
      XmlPullParserFactory localXmlPullParserFactory = XmlPullParserFactory.newInstance();
      m = localXmlPullParserFactory;
      localXmlPullParserFactory.setNamespaceAware(true);
      return;
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
      throw new RuntimeException("Couldn't create XmlPullParserFactory instance", localXmlPullParserException);
    }
  }
  
  public static f i(f paramf)
  {
    f localf = paramf;
    if (paramf == null) {
      localf = new f();
    }
    return localf;
  }
  
  public static boolean j(String paramString)
  {
    boolean bool;
    if ((!paramString.equals("tt")) && (!paramString.equals("head")) && (!paramString.equals("body")) && (!paramString.equals("div")) && (!paramString.equals("p")) && (!paramString.equals("span")) && (!paramString.equals("br")) && (!paramString.equals("style")) && (!paramString.equals("styling")) && (!paramString.equals("layout")) && (!paramString.equals("region")) && (!paramString.equals("metadata")) && (!paramString.equals("image")) && (!paramString.equals("data")) && (!paramString.equals("information"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static Layout.Alignment k(String paramString)
  {
    paramString = x6.b.x0(paramString);
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 109757538: 
      if (paramString.equals("start")) {
        j = 4;
      }
      break;
    case 108511772: 
      if (paramString.equals("right")) {
        j = 3;
      }
      break;
    case 3317767: 
      if (paramString.equals("left")) {
        j = 2;
      }
      break;
    case 100571: 
      if (paramString.equals("end")) {
        j = 1;
      }
      break;
    case -1364013995: 
      if (paramString.equals("center")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return null;
    case 2: 
    case 4: 
      return Layout.Alignment.ALIGN_NORMAL;
    case 1: 
    case 3: 
      return Layout.Alignment.ALIGN_OPPOSITE;
    }
    return Layout.Alignment.ALIGN_CENTER;
  }
  
  public static a l(XmlPullParser paramXmlPullParser, a parama)
  {
    String str = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
    if (str == null) {
      return parama;
    }
    Object localObject = t.matcher(str);
    if (!((Matcher)localObject).matches()) {
      paramXmlPullParser = new StringBuilder();
    } else {
      try
      {
        paramXmlPullParser = ((Matcher)localObject).group(1);
        paramXmlPullParser.getClass();
        int i = Integer.parseInt(paramXmlPullParser);
        paramXmlPullParser = ((Matcher)localObject).group(2);
        paramXmlPullParser.getClass();
        int j = Integer.parseInt(paramXmlPullParser);
        if ((i != 0) && (j != 0)) {
          return new a(j);
        }
        localObject = new h5/i;
        paramXmlPullParser = new java/lang/StringBuilder;
        paramXmlPullParser.<init>();
        paramXmlPullParser.append("Invalid cell resolution ");
        paramXmlPullParser.append(i);
        paramXmlPullParser.append(" ");
        paramXmlPullParser.append(j);
        ((i)localObject).<init>(paramXmlPullParser.toString());
        throw ((Throwable)localObject);
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        paramXmlPullParser = new StringBuilder();
      }
    }
    paramXmlPullParser.append("Ignoring malformed cell resolution: ");
    paramXmlPullParser.append(str);
    m.f("TtmlDecoder", paramXmlPullParser.toString());
    return parama;
  }
  
  public static void m(String paramString, f paramf)
  {
    int i = e0.a;
    Object localObject = paramString.split("\\s+", -1);
    if (localObject.length == 1)
    {
      localObject = p.matcher(paramString);
    }
    else
    {
      if (localObject.length != 2) {
        break label273;
      }
      localObject = p.matcher(localObject[1]);
      m.f("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
    }
    if (((Matcher)localObject).matches())
    {
      paramString = ((Matcher)localObject).group(3);
      paramString.getClass();
      paramString.hashCode();
      i = -1;
      switch (paramString.hashCode())
      {
      default: 
        break;
      case 3592: 
        if (paramString.equals("px")) {
          i = 2;
        }
        break;
      case 3240: 
        if (paramString.equals("em")) {
          i = 1;
        }
        break;
      case 37: 
        if (paramString.equals("%")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        throw new i(g.e("Invalid unit for fontSize: '", paramString, "'."));
      case 2: 
        j = 1;
        break;
      case 1: 
        j = 2;
        break;
      case 0: 
        j = 3;
      }
      paramString = ((Matcher)localObject).group(1);
      paramString.getClass();
      k = Float.parseFloat(paramString);
      return;
    }
    throw new i(g.e("Invalid expression for fontSize: '", paramString, "'."));
    label273:
    throw new i(j.m(f.l("Invalid number of entries for fontSize: "), localObject.length, "."));
  }
  
  public static b n(XmlPullParser paramXmlPullParser)
  {
    Object localObject = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
    int i;
    if (localObject != null) {
      i = Integer.parseInt((String)localObject);
    } else {
      i = 30;
    }
    float f = 1.0F;
    localObject = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
    if (localObject != null)
    {
      j = e0.a;
      localObject = ((String)localObject).split(" ", -1);
      if (localObject.length == 2) {
        f = Integer.parseInt(localObject[0]) / Integer.parseInt(localObject[1]);
      } else {
        throw new i("frameRateMultiplier doesn't have 2 parts");
      }
    }
    b localb = u;
    int j = b;
    localObject = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
    if (localObject != null) {
      j = Integer.parseInt((String)localObject);
    }
    int k = c;
    paramXmlPullParser = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
    if (paramXmlPullParser != null) {
      k = Integer.parseInt(paramXmlPullParser);
    }
    return new b(i * f, j, k);
  }
  
  public static void o(XmlPullParser paramXmlPullParser, HashMap paramHashMap1, a parama, c paramc, HashMap paramHashMap2, HashMap paramHashMap3)
  {
    label708:
    label933:
    label941:
    do
    {
      paramXmlPullParser.next();
      boolean bool = m0.V(paramXmlPullParser, "style");
      int i = -1;
      int j = 0;
      Object localObject1;
      Object localObject5;
      int k;
      if (bool)
      {
        localObject1 = m0.G(paramXmlPullParser, "style");
        localObject5 = q(paramXmlPullParser, new f());
        if (localObject1 != null)
        {
          localObject1 = ((String)localObject1).trim();
          if (((String)localObject1).isEmpty())
          {
            localObject1 = new String[0];
          }
          else
          {
            i = e0.a;
            localObject1 = ((String)localObject1).split("\\s+", -1);
          }
          k = localObject1.length;
          for (i = j; i < k; i++) {
            ((f)localObject5).a((f)paramHashMap1.get(localObject1[i]));
          }
        }
        localObject1 = l;
        if (localObject1 != null) {
          paramHashMap1.put(localObject1, localObject5);
        }
      }
      for (;;)
      {
        break;
        Object localObject4;
        if (m0.V(paramXmlPullParser, "region"))
        {
          localObject1 = m0.G(paramXmlPullParser, "id");
          Object localObject6 = null;
          if (localObject1 == null)
          {
            localObject1 = localObject6;
          }
          else
          {
            String str = m0.G(paramXmlPullParser, "origin");
            if (str != null)
            {
              Pattern localPattern = r;
              Object localObject7 = localPattern.matcher(str);
              Object localObject8 = s;
              Object localObject9 = ((Pattern)localObject8).matcher(str);
              bool = ((Matcher)localObject7).matches();
              localObject5 = "Ignoring region with malformed origin: ";
              float f1;
              float f2;
              StringBuilder localStringBuilder;
              if (bool) {
                try
                {
                  localObject9 = ((Matcher)localObject7).group(1);
                  localObject9.getClass();
                  f1 = Float.parseFloat((String)localObject9) / 100.0F;
                  localObject9 = ((Matcher)localObject7).group(2);
                  localObject9.getClass();
                  f2 = Float.parseFloat((String)localObject9);
                  f2 /= 100.0F;
                }
                catch (NumberFormatException localNumberFormatException1)
                {
                  localStringBuilder = new StringBuilder();
                }
              }
              for (;;)
              {
                break;
                if (((Matcher)localObject9).matches())
                {
                  if (paramc == null) {
                    localStringBuilder = new StringBuilder();
                  }
                  try
                  {
                    localObject7 = ((Matcher)localObject9).group(1);
                    localObject7.getClass();
                    k = Integer.parseInt((String)localObject7);
                    localObject9 = ((Matcher)localObject9).group(2);
                    localObject9.getClass();
                    j = Integer.parseInt((String)localObject9);
                    f1 = k / a;
                    f2 = j;
                    j = b;
                    f2 /= j;
                    localObject9 = m0.G(paramXmlPullParser, "extent");
                    if (localObject9 != null)
                    {
                      localObject5 = localPattern.matcher((CharSequence)localObject9);
                      localObject8 = ((Pattern)localObject8).matcher((CharSequence)localObject9);
                      float f3;
                      float f4;
                      Object localObject2;
                      if (((Matcher)localObject5).matches())
                      {
                        try
                        {
                          localObject8 = ((Matcher)localObject5).group(1);
                          localObject8.getClass();
                          f3 = Float.parseFloat((String)localObject8) / 100.0F;
                          localObject5 = ((Matcher)localObject5).group(2);
                          localObject5.getClass();
                          f4 = Float.parseFloat((String)localObject5);
                          f4 /= 100.0F;
                        }
                        catch (NumberFormatException localNumberFormatException2)
                        {
                          localObject2 = new StringBuilder();
                          break label933;
                        }
                      }
                      else
                      {
                        if (!((Matcher)localObject8).matches()) {
                          break label941;
                        }
                        if (paramc == null)
                        {
                          localObject2 = new StringBuilder();
                          localObject5 = "Ignoring region with missing tts:extent: ";
                          break;
                        }
                      }
                      try
                      {
                        localObject5 = ((Matcher)localObject8).group(1);
                        localObject5.getClass();
                        k = Integer.parseInt((String)localObject5);
                        localObject5 = ((Matcher)localObject8).group(2);
                        localObject5.getClass();
                        j = Integer.parseInt((String)localObject5);
                        f3 = k / a;
                        f4 = j;
                        j = b;
                        f4 /= j;
                        localObject5 = m0.G(paramXmlPullParser, "displayAlign");
                        if (localObject5 != null)
                        {
                          localObject5 = x6.b.x0((String)localObject5);
                          localObject5.getClass();
                          if (!((String)localObject5).equals("center"))
                          {
                            if (((String)localObject5).equals("after"))
                            {
                              f2 += f4;
                              j = 2;
                              break label708;
                            }
                          }
                          else
                          {
                            f2 = f4 / 2.0F + f2;
                            j = 1;
                            break label708;
                          }
                        }
                        j = 0;
                        float f5 = 1.0F / a;
                        localObject5 = m0.G(paramXmlPullParser, "writingMode");
                        if (localObject5 != null)
                        {
                          localObject5 = x6.b.x0((String)localObject5);
                          localObject5.getClass();
                          switch (((String)localObject5).hashCode())
                          {
                          default: 
                            break;
                          case 3553576: 
                            if (((String)localObject5).equals("tbrl")) {
                              i = 2;
                            }
                            break;
                          case 3553396: 
                            if (((String)localObject5).equals("tblr")) {
                              i = 1;
                            }
                            break;
                          case 3694: 
                            if (((String)localObject5).equals("tb")) {
                              i = 0;
                            }
                            break;
                          }
                          switch (i)
                          {
                          default: 
                            break;
                          case 2: 
                            i = 1;
                            break;
                          case 0: 
                          case 1: 
                            i = 2;
                            break;
                          }
                        }
                        i = Integer.MIN_VALUE;
                        localObject2 = new e((String)localObject2, f1, f2, 0, j, f3, f4, 1, f5, i);
                      }
                      catch (NumberFormatException localNumberFormatException3)
                      {
                        localObject3 = new StringBuilder();
                      }
                      localObject5 = "Ignoring region with malformed extent: ";
                      continue;
                      localObject3 = new StringBuilder();
                      localObject5 = "Ignoring region with unsupported extent: ";
                      break;
                    }
                    Object localObject3 = "Ignoring region without an extent";
                  }
                  catch (NumberFormatException localNumberFormatException4)
                  {
                    localObject4 = new StringBuilder();
                  }
                }
                else
                {
                  localObject4 = new StringBuilder();
                  localObject5 = "Ignoring region with unsupported origin: ";
                }
              }
              ((StringBuilder)localObject4).append((String)localObject5);
              ((StringBuilder)localObject4).append(str);
              localObject4 = ((StringBuilder)localObject4).toString();
            }
            else
            {
              localObject4 = "Ignoring region without an origin";
            }
            m.f("TtmlDecoder", (String)localObject4);
            localObject4 = localObject6;
          }
          if (localObject4 != null) {
            paramHashMap2.put(a, localObject4);
          }
        }
        else if (m0.V(paramXmlPullParser, "metadata"))
        {
          for (;;)
          {
            paramXmlPullParser.next();
            if (m0.V(paramXmlPullParser, "image"))
            {
              localObject4 = m0.G(paramXmlPullParser, "id");
              if (localObject4 != null) {
                paramHashMap3.put(localObject4, paramXmlPullParser.nextText());
              }
            }
            if (m0.T(paramXmlPullParser, "metadata")) {
              break;
            }
          }
        }
      }
    } while (!m0.T(paramXmlPullParser, "head"));
  }
  
  public static d p(XmlPullParser paramXmlPullParser, d paramd, HashMap paramHashMap, b paramb)
  {
    int i = paramXmlPullParser.getAttributeCount();
    f localf = q(paramXmlPullParser, null);
    Object localObject1 = null;
    Object localObject2 = "";
    long l1 = -9223372036854775807L;
    long l2 = -9223372036854775807L;
    long l3 = -9223372036854775807L;
    Object localObject3 = localObject1;
    int j = 0;
    long l4;
    long l5;
    long l6;
    while (j < i)
    {
      Object localObject4 = paramXmlPullParser.getAttributeName(j);
      Object localObject5 = paramXmlPullParser.getAttributeValue(j);
      localObject4.getClass();
      switch (((String)localObject4).hashCode())
      {
      default: 
        break;
      case 1292595405: 
        if (((String)localObject4).equals("backgroundImage")) {
          k = 5;
        }
        break;
      case 109780401: 
        if (((String)localObject4).equals("style")) {
          k = 4;
        }
        break;
      case 93616297: 
        if (((String)localObject4).equals("begin")) {
          k = 3;
        }
        break;
      case 100571: 
        if (((String)localObject4).equals("end")) {
          k = 2;
        }
        break;
      case 99841: 
        if (((String)localObject4).equals("dur")) {
          k = 1;
        }
        break;
      case -934795532: 
        if (((String)localObject4).equals("region")) {
          k = 0;
        }
        break;
      }
      int k = -1;
      Object localObject6;
      if (k != 0)
      {
        if (k != 1)
        {
          if (k != 2)
          {
            if (k != 3)
            {
              if (k != 4)
              {
                if (k != 5)
                {
                  localObject6 = localObject3;
                  localObject4 = localObject1;
                  l4 = l1;
                  l5 = l2;
                  l6 = l3;
                }
                else
                {
                  localObject6 = localObject3;
                  localObject4 = localObject1;
                  l4 = l1;
                  l5 = l2;
                  l6 = l3;
                  if (((String)localObject5).startsWith("#"))
                  {
                    localObject4 = ((String)localObject5).substring(1);
                    localObject6 = localObject3;
                    l4 = l1;
                    l5 = l2;
                    l6 = l3;
                  }
                }
              }
              else
              {
                localObject4 = ((String)localObject5).trim();
                if (((String)localObject4).isEmpty())
                {
                  localObject5 = new String[0];
                }
                else
                {
                  k = e0.a;
                  localObject5 = ((String)localObject4).split("\\s+", -1);
                }
                localObject6 = localObject3;
                localObject4 = localObject1;
                l4 = l1;
                l5 = l2;
                l6 = l3;
                if (localObject5.length > 0)
                {
                  localObject6 = localObject5;
                  localObject4 = localObject1;
                  l4 = l1;
                  l5 = l2;
                  l6 = l3;
                }
              }
            }
            else
            {
              l4 = r((String)localObject5, paramb);
              localObject6 = localObject3;
              localObject4 = localObject1;
              l5 = l2;
              l6 = l3;
            }
          }
          else
          {
            l5 = r((String)localObject5, paramb);
            localObject6 = localObject3;
            localObject4 = localObject1;
            l4 = l1;
            l6 = l3;
          }
        }
        else
        {
          l6 = r((String)localObject5, paramb);
          l5 = l2;
          l4 = l1;
          localObject4 = localObject1;
          localObject6 = localObject3;
        }
      }
      else
      {
        localObject6 = localObject3;
        localObject4 = localObject1;
        l4 = l1;
        l5 = l2;
        l6 = l3;
        if (paramHashMap.containsKey(localObject5))
        {
          localObject2 = localObject5;
          l6 = l3;
          l5 = l2;
          l4 = l1;
          localObject4 = localObject1;
          localObject6 = localObject3;
        }
      }
      j++;
      localObject3 = localObject6;
      localObject1 = localObject4;
      l1 = l4;
      l2 = l5;
      l3 = l6;
    }
    if (paramd != null)
    {
      long l7 = d;
      l5 = l1;
      l4 = l2;
      if (l7 != -9223372036854775807L)
      {
        l6 = l1;
        if (l1 != -9223372036854775807L) {
          l6 = l1 + l7;
        }
        l5 = l6;
        l4 = l2;
        if (l2 != -9223372036854775807L)
        {
          l4 = l2 + l7;
          l5 = l6;
        }
      }
    }
    else
    {
      l4 = l2;
      l5 = l1;
    }
    if (l4 == -9223372036854775807L) {
      if (l3 != -9223372036854775807L)
      {
        l1 = l5 + l3;
      }
      else if (paramd != null)
      {
        l1 = e;
        if (l1 != -9223372036854775807L) {
          break label768;
        }
      }
    }
    l1 = l4;
    label768:
    return new d(paramXmlPullParser.getName(), null, l5, l1, localf, (String[])localObject3, (String)localObject2, (String)localObject1, paramd);
  }
  
  public static f q(XmlPullParser paramXmlPullParser, f paramf)
  {
    int i = paramXmlPullParser.getAttributeCount();
    int j = 0;
    label909:
    label1030:
    label1104:
    label1187:
    Object localObject3;
    for (f localf = paramf; j < i; localObject3 = paramf)
    {
      String str1 = paramXmlPullParser.getAttributeValue(j);
      paramf = paramXmlPullParser.getAttributeName(j);
      paramf.getClass();
      int k = paramf.hashCode();
      int i1 = 3;
      int i2 = -1;
      int i3 = 1;
      switch (k)
      {
      default: 
        break;
      case 1754920356: 
        if (paramf.equals("multiRowAlign")) {
          k = 14;
        }
        break;
      case 1287124693: 
        if (paramf.equals("backgroundColor")) {
          k = 13;
        }
        break;
      case 1115953443: 
        if (paramf.equals("rubyPosition")) {
          k = 12;
        }
        break;
      case 921125321: 
        if (paramf.equals("textEmphasis")) {
          k = 11;
        }
        break;
      case 365601008: 
        if (paramf.equals("fontSize")) {
          k = 10;
        }
        break;
      case 110138194: 
        if (paramf.equals("textCombine")) {
          k = 9;
        }
        break;
      case 109403361: 
        if (paramf.equals("shear")) {
          k = 8;
        }
        break;
      case 94842723: 
        if (paramf.equals("color")) {
          k = 7;
        }
        break;
      case 3511770: 
        if (paramf.equals("ruby")) {
          k = 6;
        }
        break;
      case 3355: 
        if (paramf.equals("id")) {
          k = 5;
        }
        break;
      case -734428249: 
        if (paramf.equals("fontWeight")) {
          k = 4;
        }
        break;
      case -879295043: 
        if (paramf.equals("textDecoration")) {
          k = 3;
        }
        break;
      case -1065511464: 
        if (paramf.equals("textAlign")) {
          k = 2;
        }
        break;
      case -1224696685: 
        if (paramf.equals("fontFamily")) {
          k = 1;
        }
        break;
      case -1550943582: 
        if (paramf.equals("fontStyle")) {
          k = 0;
        }
        break;
      }
      k = -1;
      Object localObject1;
      Object localObject4;
      Object localObject2;
      switch (k)
      {
      default: 
        paramf = localf;
        break;
      case 14: 
        paramf = i(localf);
        p = k(str1);
        break;
      case 13: 
        paramf = i(localf);
        try
        {
          d = v5.d.a(str1, false);
          e = true;
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          localObject1 = new StringBuilder();
          localObject4 = "Failed parsing background value: ";
        }
      case 12: 
        paramf = x6.b.x0(str1);
        paramf.getClass();
        if (!paramf.equals("before"))
        {
          if (!paramf.equals("after"))
          {
            paramf = (f)localObject1;
          }
          else
          {
            paramf = i((f)localObject1);
            n = 2;
          }
        }
        else
        {
          paramf = i((f)localObject1);
          n = 1;
        }
        break;
      case 11: 
        localObject1 = i((f)localObject1);
        paramf = b.d;
        paramf = null;
        if (str1 != null)
        {
          localObject4 = x6.b.x0(str1.trim());
          if (!((String)localObject4).isEmpty())
          {
            paramf = TextUtils.split((String)localObject4, b.d);
            k = paramf.length;
            if (k != 0)
            {
              if (k != 1) {
                paramf = x.p(paramf.length, (Object[])paramf.clone());
              } else {
                paramf = new v0(paramf[0]);
              }
            }
            else {
              paramf = n0.r;
            }
            localObject4 = (String)b0.a(new s0(u0.d(b.h, paramf)), "outside");
            k = ((String)localObject4).hashCode();
            if (k != -1392885889)
            {
              if (k != -1106037339)
              {
                if ((k == 92734940) && (((String)localObject4).equals("after")))
                {
                  k = 0;
                  break label909;
                }
              }
              else if (((String)localObject4).equals("outside"))
              {
                k = 1;
                break label909;
              }
            }
            else if (((String)localObject4).equals("before"))
            {
              k = 2;
              break label909;
            }
            k = -1;
            int i4;
            if (k != 0)
            {
              if (k != 1) {
                i4 = 1;
              } else {
                i4 = -2;
              }
            }
            else {
              i4 = 2;
            }
            localObject4 = u0.d(b.e, paramf);
            if (!((t0)localObject4).isEmpty())
            {
              paramf = (String)new s0((t0)localObject4).next();
              k = paramf.hashCode();
              if (k != 3005871)
              {
                if ((k == 3387192) && (paramf.equals("none")))
                {
                  k = 0;
                  break label1030;
                }
              }
              else if (paramf.equals("auto"))
              {
                k = i3;
                break label1030;
              }
              k = -1;
              if (k == 0) {
                i2 = 0;
              }
              paramf = new b(i2, 0, i4);
            }
            else
            {
              localObject4 = u0.d(b.g, paramf);
              paramf = u0.d(b.f, paramf);
              if ((!((t0)localObject4).isEmpty()) || (!paramf.isEmpty())) {
                break label1104;
              }
            }
            for (paramf = new b(-1, 0, i4);; paramf = new b(i2, i3, i4))
            {
              break;
              localObject4 = (String)b0.a(new s0((t0)localObject4), "filled");
              k = ((String)localObject4).hashCode();
              if (k != -1274499742)
              {
                if ((k == 3417674) && (((String)localObject4).equals("open")))
                {
                  k = 0;
                  break label1187;
                }
              }
              else if (((String)localObject4).equals("filled"))
              {
                k = 1;
                break label1187;
              }
              k = -1;
              if (k != 0) {
                i3 = 1;
              } else {
                i3 = 2;
              }
              paramf = (String)b0.a(new s0(paramf), "circle");
              k = paramf.hashCode();
              if (k != -1360216880)
              {
                if (k != -905816648)
                {
                  if (k != 99657)
                  {
                    k = i2;
                  }
                  else
                  {
                    k = i2;
                    if (paramf.equals("dot")) {
                      k = 0;
                    }
                  }
                }
                else
                {
                  k = i2;
                  if (paramf.equals("sesame")) {
                    k = 1;
                  }
                }
              }
              else
              {
                k = i2;
                if (paramf.equals("circle")) {
                  k = 2;
                }
              }
              if (k != 0)
              {
                i2 = i1;
                if (k != 1) {
                  i2 = 1;
                }
              }
              else
              {
                i2 = 2;
              }
            }
          }
        }
        r = paramf;
        paramf = (f)localObject1;
        break;
      case 10: 
        paramf = (f)localObject1;
        try
        {
          localObject1 = i((f)localObject1);
          paramf = (f)localObject1;
          m(str1, (f)localObject1);
          paramf = (f)localObject1;
        }
        catch (i locali)
        {
          localObject2 = new StringBuilder();
          localObject4 = "Failed parsing fontSize value: ";
        }
      case 9: 
        paramf = x6.b.x0(str1);
        paramf.getClass();
        if (!paramf.equals("all"))
        {
          if (!paramf.equals("none"))
          {
            paramf = (f)localObject2;
          }
          else
          {
            paramf = i((f)localObject2);
            q = 0;
          }
        }
        else
        {
          paramf = i((f)localObject2);
          q = 1;
        }
        break;
      case 8: 
        paramf = i((f)localObject2);
        localObject2 = q.matcher(str1);
        boolean bool = ((Matcher)localObject2).matches();
        float f1 = Float.MAX_VALUE;
        float f2;
        if (!bool)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Invalid value for shear: ");
          ((StringBuilder)localObject2).append(str1);
          m.f("TtmlDecoder", ((StringBuilder)localObject2).toString());
          f2 = f1;
        }
        else
        {
          try
          {
            localObject2 = ((Matcher)localObject2).group(1);
            localObject2.getClass();
            f2 = Math.min(100.0F, Math.max(-100.0F, Float.parseFloat((String)localObject2)));
          }
          catch (NumberFormatException localNumberFormatException)
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("Failed to parse shear: ");
            ((StringBuilder)localObject2).append(str1);
            m.g("TtmlDecoder", ((StringBuilder)localObject2).toString(), localNumberFormatException);
            f2 = f1;
          }
        }
        s = f2;
        break;
      case 7: 
        paramf = i((f)localObject2);
        String str2;
        try
        {
          b = v5.d.a(str1, false);
          c = true;
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          localObject3 = new StringBuilder();
          str2 = "Failed parsing color value: ";
        }
        ((StringBuilder)localObject3).append(str2);
        ((StringBuilder)localObject3).append(str1);
        m.f("TtmlDecoder", ((StringBuilder)localObject3).toString());
        break;
      case 6: 
        paramf = x6.b.x0(str1);
        paramf.getClass();
        switch (paramf.hashCode())
        {
        }
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    k = -1;
                    break;
                  } while (!paramf.equals("text"));
                  k = 5;
                  break;
                } while (!paramf.equals("base"));
                k = 4;
                break;
              } while (!paramf.equals("textContainer"));
              k = 3;
              break;
            } while (!paramf.equals("delimiter"));
            k = 2;
            break;
          } while (!paramf.equals("container"));
          k = 1;
          break;
        } while (!paramf.equals("baseContainer"));
        k = 0;
        switch (k)
        {
        default: 
          paramf = (f)localObject3;
          break;
        case 3: 
        case 5: 
          paramf = i((f)localObject3);
          m = 3;
          break;
        case 2: 
          paramf = i((f)localObject3);
          m = 4;
          break;
        case 1: 
          paramf = i((f)localObject3);
          m = 1;
          break;
        case 0: 
        case 4: 
          paramf = i((f)localObject3);
          m = 2;
        }
        break;
      case 5: 
        paramf = (f)localObject3;
        if (!"style".equals(paramXmlPullParser.getName())) {
          break label2333;
        }
        paramf = i((f)localObject3);
        l = str1;
        break;
      case 4: 
        paramf = i((f)localObject3);
        h = "bold".equalsIgnoreCase(str1);
        break;
      case 3: 
        paramf = x6.b.x0(str1);
        paramf.getClass();
        switch (paramf.hashCode())
        {
        }
        do
        {
          do
          {
            do
            {
              k = -1;
              break;
              k = i1;
              if (paramf.equals("linethrough")) {
                break;
              }
            } while ((goto 2112) || (!paramf.equals("nolinethrough")));
            k = 2;
            break;
          } while (!paramf.equals("underline"));
          k = 1;
          break;
        } while (!paramf.equals("nounderline"));
        k = 0;
        switch (k)
        {
        default: 
          paramf = (f)localObject3;
          break;
        case 3: 
          paramf = i((f)localObject3);
          f = 1;
          break;
        case 2: 
          paramf = i((f)localObject3);
          f = 0;
          break;
        case 1: 
          paramf = i((f)localObject3);
          g = 1;
          break;
        case 0: 
          paramf = i((f)localObject3);
          g = 0;
        }
        break;
      case 2: 
        paramf = i((f)localObject3);
        o = k(str1);
        break;
      case 1: 
        paramf = i((f)localObject3);
        a = str1;
        break;
      }
      paramf = i((f)localObject3);
      i = "italic".equalsIgnoreCase(str1);
      label2333:
      j++;
    }
    return (f)localObject3;
  }
  
  public static long r(String paramString, b paramb)
  {
    Matcher localMatcher = n.matcher(paramString);
    double d5;
    double d6;
    if (localMatcher.matches())
    {
      paramString = localMatcher.group(1);
      paramString.getClass();
      double d1 = Long.parseLong(paramString) * 3600L;
      paramString = localMatcher.group(2);
      paramString.getClass();
      double d2 = Long.parseLong(paramString) * 60L;
      paramString = localMatcher.group(3);
      paramString.getClass();
      double d3 = Long.parseLong(paramString);
      paramString = localMatcher.group(4);
      double d4 = 0.0D;
      if (paramString != null) {
        d5 = Double.parseDouble(paramString);
      } else {
        d5 = 0.0D;
      }
      paramString = localMatcher.group(5);
      if (paramString != null) {
        d6 = (float)Long.parseLong(paramString) / a;
      } else {
        d6 = 0.0D;
      }
      paramString = localMatcher.group(6);
      if (paramString != null) {
        d4 = Long.parseLong(paramString) / b / a;
      }
      return ((d1 + d2 + d3 + d5 + d6 + d4) * 1000000.0D);
    }
    localMatcher = o.matcher(paramString);
    if (localMatcher.matches())
    {
      paramString = localMatcher.group(1);
      paramString.getClass();
      d6 = Double.parseDouble(paramString);
      paramString = localMatcher.group(2);
      paramString.getClass();
      paramString.hashCode();
      int i = -1;
      switch (paramString.hashCode())
      {
      default: 
        break;
      case 3494: 
        if (paramString.equals("ms")) {
          i = 4;
        }
        break;
      case 116: 
        if (paramString.equals("t")) {
          i = 3;
        }
        break;
      case 109: 
        if (paramString.equals("m")) {
          i = 2;
        }
        break;
      case 104: 
        if (paramString.equals("h")) {
          i = 1;
        }
        break;
      case 102: 
        if (paramString.equals("f")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        d5 = d6;
        break;
      case 4: 
        d5 = 1000.0D;
        break;
      case 3: 
        d5 = c;
        break;
      case 2: 
        d5 = 60.0D;
        break;
      case 1: 
        d5 = 3600.0D;
        d5 = d6 * d5;
        break;
      }
      d5 = a;
      d5 = d6 / d5;
      return (d5 * 1000000.0D);
    }
    throw new i(g.d("Malformed time expression: ", paramString));
  }
  
  public static c s(XmlPullParser paramXmlPullParser)
  {
    String str = m0.G(paramXmlPullParser, "extent");
    if (str == null) {
      return null;
    }
    Object localObject = s.matcher(str);
    if (!((Matcher)localObject).matches())
    {
      paramXmlPullParser = new StringBuilder();
      localObject = "Ignoring non-pixel tts extent: ";
    }
    else
    {
      try
      {
        paramXmlPullParser = ((Matcher)localObject).group(1);
        paramXmlPullParser.getClass();
        int i = Integer.parseInt(paramXmlPullParser);
        paramXmlPullParser = ((Matcher)localObject).group(2);
        paramXmlPullParser.getClass();
        paramXmlPullParser = new c(i, Integer.parseInt(paramXmlPullParser));
        return paramXmlPullParser;
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        paramXmlPullParser = new StringBuilder();
        localObject = "Ignoring malformed tts extent: ";
      }
    }
    paramXmlPullParser.append((String)localObject);
    paramXmlPullParser.append(str);
    m.f("TtmlDecoder", paramXmlPullParser.toString());
    return null;
  }
  
  public final h5.g h(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    try
    {
      XmlPullParser localXmlPullParser = m.newPullParser();
      HashMap localHashMap1 = new java/util/HashMap;
      localHashMap1.<init>();
      HashMap localHashMap2 = new java/util/HashMap;
      localHashMap2.<init>();
      HashMap localHashMap3 = new java/util/HashMap;
      localHashMap3.<init>();
      Object localObject1 = new o5/e;
      ((e)localObject1).<init>("", -3.4028235E38F, -3.4028235E38F, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38F, -3.4028235E38F, Integer.MIN_VALUE, -3.4028235E38F, Integer.MIN_VALUE);
      localHashMap2.put("", localObject1);
      localObject1 = new java/io/ByteArrayInputStream;
      ((ByteArrayInputStream)localObject1).<init>(paramArrayOfByte, 0, paramInt);
      Object localObject2 = null;
      localXmlPullParser.setInput((InputStream)localObject1, null);
      ArrayDeque localArrayDeque = new java/util/ArrayDeque;
      localArrayDeque.<init>();
      int i = localXmlPullParser.getEventType();
      Object localObject3 = u;
      localObject1 = v;
      int j = 0;
      label389:
      label404:
      byte[] arrayOfByte;
      for (paramArrayOfByte = null; i != 1; paramArrayOfByte = arrayOfByte)
      {
        Object localObject4 = (d)localArrayDeque.peek();
        Object localObject6;
        Object localObject7;
        Object localObject5;
        if (j == 0)
        {
          localObject6 = localXmlPullParser.getName();
          if (i == 2)
          {
            if ("tt".equals(localObject6))
            {
              localObject3 = n(localXmlPullParser);
              localObject1 = l(localXmlPullParser, v);
              localObject2 = s(localXmlPullParser);
            }
            paramBoolean = j((String)localObject6);
            if (!paramBoolean)
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              ((StringBuilder)localObject4).append("Ignoring unsupported tag: ");
              ((StringBuilder)localObject4).append(localXmlPullParser.getName());
              m.e("TtmlDecoder", ((StringBuilder)localObject4).toString());
              paramInt = j + 1;
            }
            else if ("head".equals(localObject6))
            {
              o(localXmlPullParser, localHashMap1, (a)localObject1, (c)localObject2, localHashMap2, localHashMap3);
              paramInt = j;
            }
            else
            {
              try
              {
                localObject6 = p(localXmlPullParser, (d)localObject4, localHashMap2, (b)localObject3);
                localArrayDeque.push(localObject6);
                paramInt = j;
                if (localObject4 == null) {
                  break label404;
                }
                if (m == null)
                {
                  localObject7 = new java/util/ArrayList;
                  ((ArrayList)localObject7).<init>();
                  m = ((ArrayList)localObject7);
                }
              }
              catch (i locali)
              {
                break label389;
              }
              m.add(localObject6);
              paramInt = j;
              break label404;
              m.g("TtmlDecoder", "Suppressing parser error", locali);
              paramInt = j + 1;
            }
            localObject5 = localObject2;
            localObject6 = localObject3;
            localObject7 = localObject1;
            arrayOfByte = paramArrayOfByte;
          }
          else if (i == 4)
          {
            localObject5.getClass();
            localObject7 = d.a(localXmlPullParser.getText());
            if (m == null)
            {
              localObject6 = new java/util/ArrayList;
              ((ArrayList)localObject6).<init>();
              m = ((ArrayList)localObject6);
            }
            m.add(localObject7);
            localObject5 = localObject2;
            localObject6 = localObject3;
            localObject7 = localObject1;
            paramInt = j;
            arrayOfByte = paramArrayOfByte;
          }
          else
          {
            localObject5 = localObject2;
            localObject6 = localObject3;
            localObject7 = localObject1;
            paramInt = j;
            arrayOfByte = paramArrayOfByte;
            if (i == 3)
            {
              if (localXmlPullParser.getName().equals("tt"))
              {
                paramArrayOfByte = new o5/g;
                localObject5 = (d)localArrayDeque.peek();
                localObject5.getClass();
                paramArrayOfByte.<init>((d)localObject5, localHashMap1, localHashMap2, localHashMap3);
              }
              localArrayDeque.pop();
              localObject5 = localObject2;
              localObject6 = localObject3;
              localObject7 = localObject1;
              paramInt = j;
              arrayOfByte = paramArrayOfByte;
            }
          }
        }
        else if (i == 2)
        {
          paramInt = j + 1;
          localObject5 = localObject2;
          localObject6 = localObject3;
          localObject7 = localObject1;
          arrayOfByte = paramArrayOfByte;
        }
        else
        {
          localObject5 = localObject2;
          localObject6 = localObject3;
          localObject7 = localObject1;
          paramInt = j;
          arrayOfByte = paramArrayOfByte;
          if (i == 3)
          {
            paramInt = j - 1;
            arrayOfByte = paramArrayOfByte;
            localObject7 = localObject1;
            localObject6 = localObject3;
            localObject5 = localObject2;
          }
        }
        localXmlPullParser.next();
        i = localXmlPullParser.getEventType();
        localObject2 = localObject5;
        localObject3 = localObject6;
        localObject1 = localObject7;
        j = paramInt;
      }
      if (paramArrayOfByte != null) {
        return paramArrayOfByte;
      }
      paramArrayOfByte = new h5/i;
      paramArrayOfByte.<init>("No TTML subtitles found");
      throw paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new IllegalStateException("Unexpected error when reading input.", paramArrayOfByte);
    }
    catch (XmlPullParserException paramArrayOfByte)
    {
      throw new i("Unable to decode source", paramArrayOfByte);
    }
  }
  
  public static final class a
  {
    public final int a;
    
    public a(int paramInt)
    {
      a = paramInt;
    }
  }
  
  public static final class b
  {
    public final float a;
    public final int b;
    public final int c;
    
    public b(float paramFloat, int paramInt1, int paramInt2)
    {
      a = paramFloat;
      b = paramInt1;
      c = paramInt2;
    }
  }
  
  public static final class c
  {
    public final int a;
    public final int b;
    
    public c(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     o5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */