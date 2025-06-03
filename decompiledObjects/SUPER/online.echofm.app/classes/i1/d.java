package i1;

import android.text.Layout.Alignment;
import c1.i;
import c1.k;
import c1.m;
import c1.t;
import c1.t.b;
import g0.M;
import g0.N;
import g0.a;
import g0.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class d
  implements t
{
  public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
  public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
  public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
  public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
  public static final Pattern f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
  public static final Pattern g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
  public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
  public static final a i = new a(30.0F, 1, 1);
  public final XmlPullParserFactory a;
  
  public d()
  {
    try
    {
      XmlPullParserFactory localXmlPullParserFactory = XmlPullParserFactory.newInstance();
      a = localXmlPullParserFactory;
      localXmlPullParserFactory.setNamespaceAware(true);
      return;
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
      throw new RuntimeException("Couldn't create XmlPullParserFactory instance", localXmlPullParserException);
    }
  }
  
  public static g e(g paramg)
  {
    g localg = paramg;
    if (paramg == null) {
      localg = new g();
    }
    return localg;
  }
  
  public static boolean f(String paramString)
  {
    boolean bool;
    if ((!paramString.equals("tt")) && (!paramString.equals("head")) && (!paramString.equals("body")) && (!paramString.equals("div")) && (!paramString.equals("p")) && (!paramString.equals("span")) && (!paramString.equals("br")) && (!paramString.equals("style")) && (!paramString.equals("styling")) && (!paramString.equals("layout")) && (!paramString.equals("region")) && (!paramString.equals("metadata")) && (!paramString.equals("image")) && (!paramString.equals("data")) && (!paramString.equals("information"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static Layout.Alignment g(String paramString)
  {
    paramString = W2.c.e(paramString);
    paramString.hashCode();
    int j = paramString.hashCode();
    int k = -1;
    switch (j)
    {
    default: 
      break;
    case 109757538: 
      if (paramString.equals("start")) {
        k = 4;
      }
      break;
    case 108511772: 
      if (paramString.equals("right")) {
        k = 3;
      }
      break;
    case 3317767: 
      if (paramString.equals("left")) {
        k = 2;
      }
      break;
    case 100571: 
      if (paramString.equals("end")) {
        k = 1;
      }
      break;
    case -1364013995: 
      if (paramString.equals("center")) {
        k = 0;
      }
      break;
    }
    switch (k)
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
  
  public static int h(XmlPullParser paramXmlPullParser, int paramInt)
  {
    String str = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
    if (str == null) {
      return paramInt;
    }
    paramXmlPullParser = h.matcher(str);
    if (!paramXmlPullParser.matches()) {
      paramXmlPullParser = new StringBuilder();
    }
    for (;;)
    {
      paramXmlPullParser.append("Ignoring malformed cell resolution: ");
      paramXmlPullParser.append(str);
      o.h("TtmlParser", paramXmlPullParser.toString());
      return paramInt;
      boolean bool = true;
      try
      {
        int j = Integer.parseInt((String)a.e(paramXmlPullParser.group(1)));
        int k = Integer.parseInt((String)a.e(paramXmlPullParser.group(2)));
        if ((j == 0) || (k == 0)) {
          bool = false;
        }
        paramXmlPullParser = new java/lang/StringBuilder;
        paramXmlPullParser.<init>();
        paramXmlPullParser.append("Invalid cell resolution ");
        paramXmlPullParser.append(j);
        paramXmlPullParser.append(" ");
        paramXmlPullParser.append(k);
        a.b(bool, paramXmlPullParser.toString());
        return k;
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        paramXmlPullParser = new StringBuilder();
      }
    }
  }
  
  public static void i(String paramString, g paramg)
  {
    Object localObject = M.b1(paramString, "\\s+");
    if (localObject.length == 1)
    {
      localObject = d.matcher(paramString);
    }
    else
    {
      if (localObject.length != 2) {
        break label325;
      }
      localObject = d.matcher(localObject[1]);
      o.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
    }
    if (((Matcher)localObject).matches())
    {
      paramString = (String)a.e(((Matcher)localObject).group(3));
      paramString.hashCode();
      int j = paramString.hashCode();
      int k = -1;
      switch (j)
      {
      default: 
        break;
      case 3592: 
        if (paramString.equals("px")) {
          k = 2;
        }
        break;
      case 3240: 
        if (paramString.equals("em")) {
          k = 1;
        }
        break;
      case 37: 
        if (paramString.equals("%")) {
          k = 0;
        }
        break;
      }
      switch (k)
      {
      default: 
        paramg = new StringBuilder();
        paramg.append("Invalid unit for fontSize: '");
        paramg.append(paramString);
        paramg.append("'.");
        throw new m(paramg.toString());
      case 2: 
        paramg.z(1);
        break;
      case 1: 
        paramg.z(2);
        break;
      case 0: 
        paramg.z(3);
      }
      paramg.y(Float.parseFloat((String)a.e(((Matcher)localObject).group(1))));
      return;
    }
    paramg = new StringBuilder();
    paramg.append("Invalid expression for fontSize: '");
    paramg.append(paramString);
    paramg.append("'.");
    throw new m(paramg.toString());
    label325:
    paramString = new StringBuilder();
    paramString.append("Invalid number of entries for fontSize: ");
    paramString.append(localObject.length);
    paramString.append(".");
    throw new m(paramString.toString());
  }
  
  public static a j(XmlPullParser paramXmlPullParser)
  {
    Object localObject = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
    int j;
    if (localObject != null) {
      j = Integer.parseInt((String)localObject);
    } else {
      j = 30;
    }
    localObject = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
    float f1;
    if (localObject != null)
    {
      localObject = M.b1((String)localObject, " ");
      boolean bool;
      if (localObject.length == 2) {
        bool = true;
      } else {
        bool = false;
      }
      a.b(bool, "frameRateMultiplier doesn't have 2 parts");
      f1 = Integer.parseInt(localObject[0]) / Integer.parseInt(localObject[1]);
    }
    else
    {
      f1 = 1.0F;
    }
    localObject = i;
    int k = b;
    String str = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
    if (str != null) {
      k = Integer.parseInt(str);
    }
    int m = c;
    paramXmlPullParser = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
    if (paramXmlPullParser != null) {
      m = Integer.parseInt(paramXmlPullParser);
    }
    return new a(j * f1, k, m);
  }
  
  public static Map k(XmlPullParser paramXmlPullParser, Map paramMap1, int paramInt, b paramb, Map paramMap2, Map paramMap3)
  {
    do
    {
      paramXmlPullParser.next();
      Object localObject2;
      if (N.f(paramXmlPullParser, "style"))
      {
        Object localObject1 = N.a(paramXmlPullParser, "style");
        localObject2 = p(paramXmlPullParser, new g());
        if (localObject1 != null)
        {
          localObject1 = q((String)localObject1);
          int j = localObject1.length;
          for (int k = 0; k < j; k++) {
            ((g)localObject2).a((g)paramMap1.get(localObject1[k]));
          }
        }
        localObject1 = ((g)localObject2).g();
        if (localObject1 != null) {
          paramMap1.put(localObject1, localObject2);
        }
      }
      else if (N.f(paramXmlPullParser, "region"))
      {
        localObject2 = n(paramXmlPullParser, paramInt, paramb);
        if (localObject2 != null) {
          paramMap2.put(a, localObject2);
        }
      }
      else if (N.f(paramXmlPullParser, "metadata"))
      {
        l(paramXmlPullParser, paramMap3);
      }
    } while (!N.d(paramXmlPullParser, "head"));
    return paramMap1;
  }
  
  public static void l(XmlPullParser paramXmlPullParser, Map paramMap)
  {
    do
    {
      paramXmlPullParser.next();
      if (N.f(paramXmlPullParser, "image"))
      {
        String str = N.a(paramXmlPullParser, "id");
        if (str != null) {
          paramMap.put(str, paramXmlPullParser.nextText());
        }
      }
    } while (!N.d(paramXmlPullParser, "metadata"));
  }
  
  public static c m(XmlPullParser paramXmlPullParser, c paramc, Map paramMap, a parama)
  {
    int j = paramXmlPullParser.getAttributeCount();
    g localg = p(paramXmlPullParser, null);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    Object localObject3 = "";
    int k = 0;
    long l1 = -9223372036854775807L;
    long l2 = -9223372036854775807L;
    long l4;
    long l5;
    long l6;
    for (long l3 = -9223372036854775807L; k < j; l3 = l6)
    {
      Object localObject4 = paramXmlPullParser.getAttributeName(k);
      Object localObject5 = paramXmlPullParser.getAttributeValue(k);
      ((String)localObject4).hashCode();
      switch (((String)localObject4).hashCode())
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
                  m = -1;
                  break;
                } while (!((String)localObject4).equals("backgroundImage"));
                m = 5;
                break;
              } while (!((String)localObject4).equals("style"));
              m = 4;
              break;
            } while (!((String)localObject4).equals("begin"));
            m = 3;
            break;
          } while (!((String)localObject4).equals("end"));
          m = 2;
          break;
        } while (!((String)localObject4).equals("dur"));
        m = 1;
        break;
      } while (!((String)localObject4).equals("region"));
      int m = 0;
      Object localObject6;
      switch (m)
      {
      default: 
        localObject6 = localObject1;
        localObject4 = localObject2;
        l4 = l1;
        l5 = l2;
        l6 = l3;
        break;
      case 5: 
        localObject6 = localObject1;
        localObject4 = localObject2;
        l4 = l1;
        l5 = l2;
        l6 = l3;
        if (((String)localObject5).startsWith("#"))
        {
          localObject4 = ((String)localObject5).substring(1);
          l6 = l3;
          l5 = l2;
          l4 = l1;
          localObject6 = localObject1;
        }
        break;
      }
      for (;;)
      {
        break;
        localObject5 = q((String)localObject5);
        localObject6 = localObject1;
        localObject4 = localObject2;
        l4 = l1;
        l5 = l2;
        l6 = l3;
        if (localObject5.length > 0)
        {
          localObject6 = localObject5;
          localObject4 = localObject2;
          l4 = l1;
          l5 = l2;
          l6 = l3;
          continue;
          l4 = r((String)localObject5, parama);
          localObject6 = localObject1;
          localObject4 = localObject2;
          l5 = l2;
          l6 = l3;
          continue;
          l5 = r((String)localObject5, parama);
          localObject6 = localObject1;
          localObject4 = localObject2;
          l4 = l1;
          l6 = l3;
          continue;
          l6 = r((String)localObject5, parama);
          localObject6 = localObject1;
          localObject4 = localObject2;
          l4 = l1;
          l5 = l2;
          continue;
          localObject6 = localObject1;
          localObject4 = localObject2;
          l4 = l1;
          l5 = l2;
          l6 = l3;
          if (paramMap.containsKey(localObject5))
          {
            localObject3 = localObject5;
            l6 = l3;
            l5 = l2;
            l4 = l1;
            localObject4 = localObject2;
            localObject6 = localObject1;
          }
        }
      }
      k++;
      localObject1 = localObject6;
      localObject2 = localObject4;
      l1 = l4;
      l2 = l5;
    }
    if (paramc != null)
    {
      long l7 = d;
      l4 = l1;
      l5 = l2;
      if (l7 != -9223372036854775807L)
      {
        l6 = l1;
        if (l1 != -9223372036854775807L) {
          l6 = l1 + l7;
        }
        l4 = l6;
        l5 = l2;
        if (l2 != -9223372036854775807L)
        {
          l5 = l2 + l7;
          l4 = l6;
        }
      }
    }
    for (;;)
    {
      break;
      l4 = l1;
      l5 = l2;
    }
    if (l5 == -9223372036854775807L) {
      if (l3 != -9223372036854775807L)
      {
        l1 = l4 + l3;
      }
      else if (paramc != null)
      {
        l1 = e;
        if (l1 != -9223372036854775807L) {
          break label742;
        }
      }
    }
    l1 = l5;
    label742:
    return c.c(paramXmlPullParser.getName(), l4, l1, localg, (String[])localObject1, (String)localObject3, (String)localObject2, paramc);
  }
  
  public static e n(XmlPullParser paramXmlPullParser, int paramInt, b paramb)
  {
    String str1 = N.a(paramXmlPullParser, "id");
    if (str1 == null) {
      return null;
    }
    String str2 = N.a(paramXmlPullParser, "origin");
    Object localObject1;
    Object localObject2;
    Matcher localMatcher2;
    boolean bool;
    String str3;
    float f1;
    float f2;
    if (str2 != null)
    {
      localObject1 = f;
      Matcher localMatcher1 = ((Pattern)localObject1).matcher(str2);
      localObject2 = g;
      localMatcher2 = ((Pattern)localObject2).matcher(str2);
      bool = localMatcher1.matches();
      str3 = "Ignoring region with malformed origin: ";
      if (bool)
      {
        try
        {
          f1 = Float.parseFloat((String)a.e(localMatcher1.group(1))) / 100.0F;
          f2 = Float.parseFloat((String)a.e(localMatcher1.group(2)));
          f2 /= 100.0F;
        }
        catch (NumberFormatException paramXmlPullParser)
        {
          paramXmlPullParser = new StringBuilder();
          paramb = str3;
        }
        paramXmlPullParser.append(paramb);
        label140:
        paramXmlPullParser.append(str2);
      }
    }
    for (paramXmlPullParser = paramXmlPullParser.toString();; paramXmlPullParser = "Ignoring region without an origin")
    {
      o.h("TtmlParser", paramXmlPullParser);
      return null;
      if (localMatcher2.matches()) {
        if (paramb == null)
        {
          paramXmlPullParser = new StringBuilder();
          label180:
          paramXmlPullParser.append("Ignoring region with missing tts:extent: ");
          break label140;
        }
      }
      for (;;)
      {
        try
        {
          int j = Integer.parseInt((String)a.e(localMatcher2.group(1)));
          int k = Integer.parseInt((String)a.e(localMatcher2.group(2)));
          f1 = j / a;
          f2 = k;
          j = b;
          f2 /= j;
          str3 = N.a(paramXmlPullParser, "extent");
          if (str3 != null)
          {
            localObject1 = ((Pattern)localObject1).matcher(str3);
            localObject2 = ((Pattern)localObject2).matcher(str3);
            bool = ((Matcher)localObject1).matches();
            str3 = "Ignoring region with malformed extent: ";
            float f3;
            float f4;
            if (bool)
            {
              try
              {
                f3 = Float.parseFloat((String)a.e(((Matcher)localObject1).group(1))) / 100.0F;
                f4 = Float.parseFloat((String)a.e(((Matcher)localObject1).group(2)));
                f4 /= 100.0F;
              }
              catch (NumberFormatException paramXmlPullParser)
              {
                paramXmlPullParser = new StringBuilder();
                paramb = str3;
              }
              break;
            }
            if (((Matcher)localObject2).matches())
            {
              if (paramb == null)
              {
                paramXmlPullParser = new StringBuilder();
                break label180;
              }
              try
              {
                k = Integer.parseInt((String)a.e(((Matcher)localObject2).group(1)));
                j = Integer.parseInt((String)a.e(((Matcher)localObject2).group(2)));
                f3 = k / a;
                f4 = j;
                j = b;
                f4 /= j;
                paramb = N.a(paramXmlPullParser, "displayAlign");
                k = 0;
                if (paramb != null)
                {
                  paramb = W2.c.e(paramb);
                  paramb.hashCode();
                  if (!paramb.equals("center"))
                  {
                    if (paramb.equals("after"))
                    {
                      f2 += f4;
                      j = 2;
                      continue;
                    }
                  }
                  else
                  {
                    f2 += f4 / 2.0F;
                    j = 1;
                    continue;
                  }
                }
                j = 0;
                float f5 = 1.0F / paramInt;
                paramXmlPullParser = N.a(paramXmlPullParser, "writingMode");
                if (paramXmlPullParser != null)
                {
                  paramXmlPullParser = W2.c.e(paramXmlPullParser);
                  paramXmlPullParser.hashCode();
                  switch (paramXmlPullParser.hashCode())
                  {
                  default: 
                    paramInt = -1;
                    break;
                  case 3553576: 
                    if (!paramXmlPullParser.equals("tbrl")) {
                      continue;
                    }
                    paramInt = 2;
                    break;
                  case 3553396: 
                    if (!paramXmlPullParser.equals("tblr")) {
                      continue;
                    }
                    paramInt = 1;
                    break;
                  }
                  paramInt = k;
                  if (!paramXmlPullParser.equals("tb")) {
                    continue;
                  }
                  switch (paramInt)
                  {
                  default: 
                    break;
                  case 2: 
                    paramInt = 1;
                    break;
                  case 0: 
                  case 1: 
                    paramInt = 2;
                    break;
                  }
                }
                paramInt = Integer.MIN_VALUE;
                return new e(str1, f1, f2, 0, j, f3, f4, 1, f5, paramInt);
              }
              catch (NumberFormatException paramXmlPullParser)
              {
                paramXmlPullParser = new StringBuilder();
                paramb = str3;
              }
              break;
            }
            paramXmlPullParser = new StringBuilder();
            paramb = "Ignoring region with unsupported extent: ";
            paramXmlPullParser.append(paramb);
            break label140;
          }
          paramXmlPullParser = "Ignoring region without an extent";
        }
        catch (NumberFormatException paramXmlPullParser)
        {
          paramXmlPullParser = new StringBuilder();
          paramb = str3;
        }
        break;
        paramXmlPullParser = new StringBuilder();
        paramb = "Ignoring region with unsupported origin: ";
      }
    }
  }
  
  public static float o(String paramString)
  {
    Object localObject = e.matcher(paramString);
    if (!((Matcher)localObject).matches())
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid value for shear: ");
      ((StringBuilder)localObject).append(paramString);
      o.h("TtmlParser", ((StringBuilder)localObject).toString());
      return Float.MAX_VALUE;
    }
    try
    {
      float f1 = Math.min(100.0F, Math.max(-100.0F, Float.parseFloat((String)a.e(((Matcher)localObject).group(1)))));
      return f1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to parse shear: ");
      ((StringBuilder)localObject).append(paramString);
      o.i("TtmlParser", ((StringBuilder)localObject).toString(), localNumberFormatException);
    }
    return Float.MAX_VALUE;
  }
  
  public static g p(XmlPullParser paramXmlPullParser, g paramg)
  {
    int j = paramXmlPullParser.getAttributeCount();
    int k = 0;
    Object localObject2;
    for (g localg = paramg; k < j; localObject2 = paramg)
    {
      String str1 = paramXmlPullParser.getAttributeValue(k);
      paramg = paramXmlPullParser.getAttributeName(k);
      paramg.hashCode();
      int m = paramg.hashCode();
      int n = 5;
      int i1 = -1;
      switch (m)
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
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    m = -1;
                                    break;
                                  } while (!paramg.equals("multiRowAlign"));
                                  m = 14;
                                  break;
                                } while (!paramg.equals("backgroundColor"));
                                m = 13;
                                break;
                              } while (!paramg.equals("rubyPosition"));
                              m = 12;
                              break;
                            } while (!paramg.equals("textEmphasis"));
                            m = 11;
                            break;
                          } while (!paramg.equals("fontSize"));
                          m = 10;
                          break;
                        } while (!paramg.equals("textCombine"));
                        m = 9;
                        break;
                      } while (!paramg.equals("shear"));
                      m = 8;
                      break;
                    } while (!paramg.equals("color"));
                    m = 7;
                    break;
                  } while (!paramg.equals("ruby"));
                  m = 6;
                  break;
                } while (!paramg.equals("id"));
                m = 5;
                break;
              } while (!paramg.equals("fontWeight"));
              m = 4;
              break;
            } while (!paramg.equals("textDecoration"));
            m = 3;
            break;
          } while (!paramg.equals("textAlign"));
          m = 2;
          break;
        } while (!paramg.equals("fontFamily"));
        m = 1;
        break;
      } while (!paramg.equals("fontStyle"));
      m = 0;
      Object localObject1;
      String str2;
      StringBuilder localStringBuilder;
      switch (m)
      {
      default: 
        paramg = localg;
        break;
      case 14: 
        paramg = e(localg).D(g(str1));
        break;
      case 13: 
        paramg = e(localg);
        try
        {
          paramg.u(g0.e.c(str1));
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          localObject1 = new StringBuilder();
          str2 = "Failed parsing background value: ";
        }
      case 12: 
        paramg = W2.c.e(str1);
        paramg.hashCode();
        if (!paramg.equals("before"))
        {
          if (!paramg.equals("after")) {
            paramg = (g)localObject1;
          } else {
            paramg = e((g)localObject1).E(2);
          }
        }
        else {
          paramg = e((g)localObject1).E(1);
        }
        break;
      case 11: 
        paramg = e((g)localObject1).J(b.a(str1));
        break;
      case 10: 
        paramg = (g)localObject1;
        try
        {
          localObject1 = e((g)localObject1);
          paramg = (g)localObject1;
          i(str1, (g)localObject1);
          paramg = (g)localObject1;
        }
        catch (m localm)
        {
          localStringBuilder = new StringBuilder();
          str2 = "Failed parsing fontSize value: ";
        }
      case 9: 
      case 8: 
      case 7: 
        for (;;)
        {
          localStringBuilder.append(str2);
          localStringBuilder.append(str1);
          o.h("TtmlParser", localStringBuilder.toString());
          break;
          paramg = W2.c.e(str1);
          paramg.hashCode();
          if (!paramg.equals("all"))
          {
            if (!paramg.equals("none"))
            {
              paramg = localStringBuilder;
              break;
            }
            paramg = e(localStringBuilder).I(false);
            break;
          }
          paramg = e(localStringBuilder).I(true);
          break;
          paramg = e(localStringBuilder).G(o(str1));
          break;
          paramg = e(localStringBuilder);
          try
          {
            paramg.w(g0.e.c(str1));
          }
          catch (IllegalArgumentException localIllegalArgumentException2)
          {
            localObject2 = new StringBuilder();
            str2 = "Failed parsing color value: ";
          }
        }
      case 6: 
        paramg = W2.c.e(str1);
        paramg.hashCode();
        switch (paramg.hashCode())
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
                  m = -1;
                  break;
                  m = n;
                  if (paramg.equals("text")) {
                    break;
                  }
                } while ((goto 960) || (!paramg.equals("base")));
                m = 4;
                break;
              } while (!paramg.equals("textContainer"));
              m = 3;
              break;
            } while (!paramg.equals("delimiter"));
            m = 2;
            break;
          } while (!paramg.equals("container"));
          m = 1;
          break;
        } while (!paramg.equals("baseContainer"));
        m = 0;
        switch (m)
        {
        default: 
          paramg = (g)localObject2;
          break;
        case 3: 
        case 5: 
          paramg = e((g)localObject2).F(3);
          break;
        case 2: 
          paramg = e((g)localObject2).F(4);
          break;
        case 1: 
          paramg = e((g)localObject2).F(1);
          break;
        case 0: 
        case 4: 
          paramg = e((g)localObject2).F(2);
        }
        break;
      case 5: 
        paramg = (g)localObject2;
        if (!"style".equals(paramXmlPullParser.getName())) {
          break label1518;
        }
        paramg = e((g)localObject2).A(str1);
        break;
      case 4: 
        paramg = e((g)localObject2).v("bold".equalsIgnoreCase(str1));
        break;
      case 3: 
        paramg = W2.c.e(str1);
        paramg.hashCode();
        switch (paramg.hashCode())
        {
        default: 
          m = i1;
          break;
        case 1679736913: 
          if (!paramg.equals("linethrough")) {
            m = i1;
          } else {
            m = 3;
          }
          break;
        case 913457136: 
          if (!paramg.equals("nolinethrough")) {
            m = i1;
          } else {
            m = 2;
          }
          break;
        case -1026963764: 
          if (!paramg.equals("underline")) {
            m = i1;
          } else {
            m = 1;
          }
          break;
        case -1461280213: 
          if (!paramg.equals("nounderline")) {
            m = i1;
          } else {
            m = 0;
          }
          break;
        }
        switch (m)
        {
        default: 
          paramg = (g)localObject2;
          break;
        case 3: 
          paramg = e((g)localObject2).C(true);
          break;
        case 2: 
          paramg = e((g)localObject2).C(false);
          break;
        case 1: 
          paramg = e((g)localObject2).K(true);
          break;
        case 0: 
          paramg = e((g)localObject2).K(false);
        }
        break;
      case 2: 
        paramg = e((g)localObject2).H(g(str1));
        break;
      case 1: 
        paramg = e((g)localObject2).x(str1);
        break;
      }
      paramg = e((g)localObject2).B("italic".equalsIgnoreCase(str1));
      label1518:
      k++;
    }
    return (g)localObject2;
  }
  
  public static String[] q(String paramString)
  {
    paramString = paramString.trim();
    if (paramString.isEmpty()) {
      paramString = new String[0];
    } else {
      paramString = M.b1(paramString, "\\s+");
    }
    return paramString;
  }
  
  public static long r(String paramString, a parama)
  {
    Matcher localMatcher = b.matcher(paramString);
    boolean bool = localMatcher.matches();
    int j = 4;
    double d5;
    double d6;
    if (bool)
    {
      double d1 = Long.parseLong((String)a.e(localMatcher.group(1))) * 3600L;
      double d2 = Long.parseLong((String)a.e(localMatcher.group(2))) * 60L;
      double d3 = Long.parseLong((String)a.e(localMatcher.group(3)));
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
    localMatcher = c.matcher(paramString);
    if (localMatcher.matches())
    {
      d6 = Double.parseDouble((String)a.e(localMatcher.group(1)));
      paramString = (String)a.e(localMatcher.group(2));
      paramString.hashCode();
      switch (paramString.hashCode())
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
              j = -1;
              break;
              if (paramString.equals("ms")) {
                break;
              }
            } while ((goto 288) || (!paramString.equals("t")));
            j = 3;
            break;
          } while (!paramString.equals("m"));
          j = 2;
          break;
        } while (!paramString.equals("h"));
        j = 1;
        break;
      } while (!paramString.equals("f"));
      j = 0;
      switch (j)
      {
      default: 
        d5 = d6;
        break;
      case 4: 
        d5 = 1000.0D;
      case 3: 
      case 2: 
      case 1: 
      case 0: 
        for (;;)
        {
          d5 = d6 / d5;
          break;
          d5 = c;
          continue;
          for (d5 = 60.0D;; d5 = 3600.0D)
          {
            d5 = d6 * d5;
            break;
          }
          d5 = a;
        }
      }
      return (d5 * 1000000.0D);
    }
    parama = new StringBuilder();
    parama.append("Malformed time expression: ");
    parama.append(paramString);
    throw new m(parama.toString());
  }
  
  public static b s(XmlPullParser paramXmlPullParser)
  {
    String str1 = N.a(paramXmlPullParser, "extent");
    if (str1 == null) {
      return null;
    }
    paramXmlPullParser = g.matcher(str1);
    String str2;
    if (!paramXmlPullParser.matches())
    {
      paramXmlPullParser = new StringBuilder();
      str2 = "Ignoring non-pixel tts extent: ";
    }
    for (;;)
    {
      paramXmlPullParser.append(str2);
      paramXmlPullParser.append(str1);
      o.h("TtmlParser", paramXmlPullParser.toString());
      return null;
      try
      {
        paramXmlPullParser = new b(Integer.parseInt((String)a.e(paramXmlPullParser.group(1))), Integer.parseInt((String)a.e(paramXmlPullParser.group(2))));
        return paramXmlPullParser;
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        paramXmlPullParser = new StringBuilder();
        str2 = "Ignoring malformed tts extent: ";
      }
    }
  }
  
  public k a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject2;
    for (;;)
    {
      XmlPullParser localXmlPullParser;
      HashMap localHashMap1;
      HashMap localHashMap2;
      HashMap localHashMap3;
      ArrayDeque localArrayDeque;
      Object localObject3;
      Object localObject4;
      try
      {
        localXmlPullParser = a.newPullParser();
        localHashMap1 = new java/util/HashMap;
        localHashMap1.<init>();
        localHashMap2 = new java/util/HashMap;
        localHashMap2.<init>();
        localHashMap3 = new java/util/HashMap;
        localHashMap3.<init>();
        localObject1 = new i1/e;
        ((e)localObject1).<init>("");
        localHashMap2.put("", localObject1);
        localObject1 = new java/io/ByteArrayInputStream;
        ((ByteArrayInputStream)localObject1).<init>(paramArrayOfByte, paramInt1, paramInt2);
        paramArrayOfByte = null;
        localXmlPullParser.setInput((InputStream)localObject1, null);
        localArrayDeque = new java/util/ArrayDeque;
        localArrayDeque.<init>();
        j = localXmlPullParser.getEventType();
        localObject1 = i;
        localObject2 = null;
        paramInt2 = 0;
        k = 15;
        if (j == 1) {
          break;
        }
        localObject3 = (c)localArrayDeque.peek();
        if (paramInt2 != 0) {
          break label537;
        }
        localObject4 = localXmlPullParser.getName();
        if (j != 2) {
          break label396;
        }
        if ("tt".equals(localObject4))
        {
          localObject1 = j(localXmlPullParser);
          paramInt1 = h(localXmlPullParser, 15);
          paramArrayOfByte = s(localXmlPullParser);
        }
      }
      catch (IOException paramArrayOfByte)
      {
        break label655;
      }
      catch (XmlPullParserException paramArrayOfByte)
      {
        break label667;
      }
      paramInt1 = k;
      continue;
      boolean bool = f((String)localObject4);
      int m;
      Object localObject5;
      byte[] arrayOfByte;
      if (!bool)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append("Ignoring unsupported tag: ");
        ((StringBuilder)localObject3).append(localXmlPullParser.getName());
        o.f("TtmlParser", ((StringBuilder)localObject3).toString());
        paramInt2++;
        localObject3 = paramArrayOfByte;
        localObject4 = localObject1;
        m = paramInt1;
        localObject5 = localObject2;
        paramInt1 = paramInt2;
      }
      else
      {
        if ("head".equals(localObject4))
        {
          k(localXmlPullParser, localHashMap1, paramInt1, paramArrayOfByte, localHashMap2, localHashMap3);
          k = paramInt2;
        }
        else
        {
          try
          {
            localObject4 = m(localXmlPullParser, (c)localObject3, localHashMap2, (a)localObject1);
            localArrayDeque.push(localObject4);
            k = paramInt2;
            if (localObject3 != null)
            {
              ((c)localObject3).a((c)localObject4);
              k = paramInt2;
            }
          }
          catch (m localm) {}
        }
        for (;;)
        {
          arrayOfByte = paramArrayOfByte;
          localObject4 = localObject1;
          m = paramInt1;
          localObject5 = localObject2;
          paramInt1 = k;
          break;
          o.i("TtmlParser", "Suppressing parser error", arrayOfByte);
          k = paramInt2 + 1;
        }
        label396:
        if (j == 4)
        {
          ((c)a.e(arrayOfByte)).a(c.d(localXmlPullParser.getText()));
          arrayOfByte = paramArrayOfByte;
          localObject4 = localObject1;
          m = k;
          localObject5 = localObject2;
          paramInt1 = paramInt2;
        }
        else
        {
          arrayOfByte = paramArrayOfByte;
          localObject4 = localObject1;
          m = k;
          localObject5 = localObject2;
          paramInt1 = paramInt2;
          if (j == 3)
          {
            if (localXmlPullParser.getName().equals("tt"))
            {
              localObject2 = new i1/h;
              ((h)localObject2).<init>((c)a.e((c)localArrayDeque.peek()), localHashMap1, localHashMap2, localHashMap3);
            }
            localArrayDeque.pop();
            arrayOfByte = paramArrayOfByte;
            localObject4 = localObject1;
            m = k;
            localObject5 = localObject2;
            paramInt1 = paramInt2;
            break label607;
            label537:
            if (j == 2)
            {
              paramInt1 = paramInt2 + 1;
              arrayOfByte = paramArrayOfByte;
              localObject4 = localObject1;
              m = k;
              localObject5 = localObject2;
            }
            else
            {
              arrayOfByte = paramArrayOfByte;
              localObject4 = localObject1;
              m = k;
              localObject5 = localObject2;
              paramInt1 = paramInt2;
              if (j == 3)
              {
                paramInt1 = paramInt2 - 1;
                localObject5 = localObject2;
                m = k;
                localObject4 = localObject1;
                arrayOfByte = paramArrayOfByte;
              }
            }
          }
        }
      }
      label607:
      localXmlPullParser.next();
      int j = localXmlPullParser.getEventType();
      paramArrayOfByte = arrayOfByte;
      Object localObject1 = localObject4;
      int k = m;
      localObject2 = localObject5;
      paramInt2 = paramInt1;
    }
    paramArrayOfByte = (k)a.e(localObject2);
    return paramArrayOfByte;
    label655:
    throw new IllegalStateException("Unexpected error when reading input.", paramArrayOfByte);
    label667:
    throw new IllegalStateException("Unable to decode source", paramArrayOfByte);
  }
  
  public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, t.b paramb, g0.g paramg)
  {
    i.c(a(paramArrayOfByte, paramInt1, paramInt2), paramb, paramg);
  }
  
  public int d()
  {
    return 1;
  }
  
  public static final class a
  {
    public final float a;
    public final int b;
    public final int c;
    
    public a(float paramFloat, int paramInt1, int paramInt2)
    {
      a = paramFloat;
      b = paramInt1;
      c = paramInt2;
    }
  }
  
  public static final class b
  {
    public final int a;
    public final int b;
    
    public b(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     i1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */