package o0;

import B0.p.a;
import X2.E;
import X2.v;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import d0.A;
import d0.m;
import d0.m.b;
import d0.q;
import d0.q.b;
import d0.t;
import d0.z;
import g0.G;
import g0.M;
import g0.N;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public class d
  extends DefaultHandler
  implements p.a
{
  public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
  public static final Pattern c = Pattern.compile("CC([1-4])=.*");
  public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
  public static final int[] e = { -1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14 };
  public final XmlPullParserFactory a;
  
  public d()
  {
    try
    {
      a = XmlPullParserFactory.newInstance();
      return;
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
      throw new RuntimeException("Couldn't create XmlPullParserFactory instance", localXmlPullParserException);
    }
  }
  
  public static int D(List paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      e locale = (e)paramList.get(i);
      if ("urn:scte:dash:cc:cea-608:2015".equals(a))
      {
        Object localObject = b;
        if (localObject != null)
        {
          localObject = c.matcher((CharSequence)localObject);
          if (((Matcher)localObject).matches()) {
            return Integer.parseInt(((Matcher)localObject).group(1));
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Unable to parse CEA-608 channel number from: ");
          ((StringBuilder)localObject).append(b);
          g0.o.h("MpdParser", ((StringBuilder)localObject).toString());
        }
      }
    }
    return -1;
  }
  
  public static int E(List paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      e locale = (e)paramList.get(i);
      if ("urn:scte:dash:cc:cea-708:2015".equals(a))
      {
        Object localObject = b;
        if (localObject != null)
        {
          localObject = d.matcher((CharSequence)localObject);
          if (((Matcher)localObject).matches()) {
            return Integer.parseInt(((Matcher)localObject).group(1));
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Unable to parse CEA-708 service block number from: ");
          ((StringBuilder)localObject).append(b);
          g0.o.h("MpdParser", ((StringBuilder)localObject).toString());
        }
      }
    }
    return -1;
  }
  
  public static long H(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser == null) {
      return paramLong;
    }
    return M.Q0(paramXmlPullParser);
  }
  
  public static e I(XmlPullParser paramXmlPullParser, String paramString)
  {
    String str1 = r0(paramXmlPullParser, "schemeIdUri", "");
    String str2 = r0(paramXmlPullParser, "value", null);
    String str3 = r0(paramXmlPullParser, "id", null);
    do
    {
      paramXmlPullParser.next();
    } while (!N.d(paramXmlPullParser, paramString));
    return new e(str1, str2, str3);
  }
  
  public static int J(XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "value");
    if (paramXmlPullParser == null) {
      return -1;
    }
    paramXmlPullParser = W2.c.e(paramXmlPullParser);
    paramXmlPullParser.hashCode();
    switch (paramXmlPullParser.hashCode())
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
              i = -1;
              break;
            } while (!paramXmlPullParser.equals("fa01"));
            i = 4;
            break;
          } while (!paramXmlPullParser.equals("f801"));
          i = 3;
          break;
        } while (!paramXmlPullParser.equals("f800"));
        i = 2;
        break;
      } while (!paramXmlPullParser.equals("a000"));
      i = 1;
      break;
    } while (!paramXmlPullParser.equals("4000"));
    int i = 0;
    switch (i)
    {
    default: 
      return -1;
    case 4: 
      return 8;
    case 3: 
      return 6;
    case 2: 
      return 5;
    case 1: 
      return 2;
    }
    return 1;
  }
  
  public static int K(XmlPullParser paramXmlPullParser)
  {
    int i = -1;
    int j = U(paramXmlPullParser, "value", -1);
    int k = i;
    if (j > 0)
    {
      k = i;
      if (j < 33) {
        k = j;
      }
    }
    return k;
  }
  
  public static int L(XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "value");
    int i = -1;
    if (paramXmlPullParser == null) {
      return -1;
    }
    int j = Integer.bitCount(Integer.parseInt(paramXmlPullParser, 16));
    if (j != 0) {
      i = j;
    }
    return i;
  }
  
  public static long M(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser == null) {
      return paramLong;
    }
    return M.R0(paramXmlPullParser);
  }
  
  public static String N(List paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      e locale = (e)paramList.get(i);
      String str = a;
      if ((("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str)) && ("JOC".equals(b))) || (("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str)) && ("ec+3".equals(b)))) {
        return "audio/eac3-joc";
      }
    }
    return "audio/eac3";
  }
  
  public static float R(XmlPullParser paramXmlPullParser, String paramString, float paramFloat)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      paramFloat = Float.parseFloat(paramXmlPullParser);
    }
    return paramFloat;
  }
  
  public static float S(XmlPullParser paramXmlPullParser, float paramFloat)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "frameRate");
    float f = paramFloat;
    if (paramXmlPullParser != null)
    {
      paramXmlPullParser = b.matcher(paramXmlPullParser);
      f = paramFloat;
      if (paramXmlPullParser.matches())
      {
        int i = Integer.parseInt(paramXmlPullParser.group(1));
        paramXmlPullParser = paramXmlPullParser.group(2);
        boolean bool = TextUtils.isEmpty(paramXmlPullParser);
        paramFloat = i;
        f = paramFloat;
        if (!bool) {
          f = paramFloat / Integer.parseInt(paramXmlPullParser);
        }
      }
    }
    return f;
  }
  
  public static int U(XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      paramInt = Integer.parseInt(paramXmlPullParser);
    }
    return paramInt;
  }
  
  public static long W(List paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      e locale = (e)paramList.get(i);
      if (W2.c.a("http://dashif.org/guidelines/last-segment-number", a)) {
        return Long.parseLong(b);
      }
    }
    return -1L;
  }
  
  public static long X(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      paramLong = Long.parseLong(paramXmlPullParser);
    }
    return paramLong;
  }
  
  public static int Z(XmlPullParser paramXmlPullParser)
  {
    int i = -1;
    int j = U(paramXmlPullParser, "value", -1);
    int k = i;
    if (j >= 0)
    {
      paramXmlPullParser = e;
      k = i;
      if (j < paramXmlPullParser.length) {
        k = paramXmlPullParser[j];
      }
    }
    return k;
  }
  
  public static int p(int paramInt1, int paramInt2)
  {
    if (paramInt1 == -1) {
      return paramInt2;
    }
    if (paramInt2 == -1) {
      return paramInt1;
    }
    boolean bool;
    if (paramInt1 == paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    return paramInt1;
  }
  
  public static String q(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return paramString2;
    }
    if (paramString2 == null) {
      return paramString1;
    }
    g0.a.f(paramString1.equals(paramString2));
    return paramString1;
  }
  
  public static void r(ArrayList paramArrayList)
  {
    int i = 0;
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      localObject = (m.b)paramArrayList.get(j);
      if (d0.g.c.equals(p))
      {
        localObject = q;
        if (localObject != null)
        {
          paramArrayList.remove(j);
          break label60;
        }
      }
    }
    Object localObject = null;
    label60:
    j = i;
    if (localObject == null) {
      return;
    }
    while (j < paramArrayList.size())
    {
      m.b localb = (m.b)paramArrayList.get(j);
      if ((d0.g.b.equals(p)) && (q == null)) {
        paramArrayList.set(j, new m.b(d0.g.c, (String)localObject, r, s));
      }
      j++;
    }
  }
  
  public static String r0(XmlPullParser paramXmlPullParser, String paramString1, String paramString2)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString1);
    if (paramXmlPullParser == null) {
      paramXmlPullParser = paramString2;
    }
    return paramXmlPullParser;
  }
  
  public static void s(ArrayList paramArrayList)
  {
    for (int i = paramArrayList.size() - 1; i >= 0; i--)
    {
      m.b localb = (m.b)paramArrayList.get(i);
      if (!localb.c()) {
        for (int j = 0; j < paramArrayList.size(); j++) {
          if (((m.b)paramArrayList.get(j)).a(localb))
          {
            paramArrayList.remove(i);
            break;
          }
        }
      }
    }
  }
  
  public static String s0(XmlPullParser paramXmlPullParser, String paramString)
  {
    Object localObject1 = "";
    Object localObject2;
    do
    {
      paramXmlPullParser.next();
      if (paramXmlPullParser.getEventType() == 4)
      {
        localObject2 = paramXmlPullParser.getText();
      }
      else
      {
        w(paramXmlPullParser);
        localObject2 = localObject1;
      }
      localObject1 = localObject2;
    } while (!N.d(paramXmlPullParser, paramString));
    return (String)localObject2;
  }
  
  public static long t(long paramLong1, long paramLong2)
  {
    long l = -9223372036854775807L;
    if (paramLong2 != -9223372036854775807L) {
      paramLong1 = paramLong2;
    }
    if (paramLong1 == Long.MAX_VALUE) {
      paramLong1 = l;
    }
    return paramLong1;
  }
  
  public static String u(String paramString1, String paramString2)
  {
    if (z.o(paramString1)) {
      return z.c(paramString2);
    }
    if (z.s(paramString1)) {
      return z.n(paramString2);
    }
    if (z.r(paramString1)) {
      return paramString1;
    }
    if (z.p(paramString1)) {
      return paramString1;
    }
    if ("application/mp4".equals(paramString1))
    {
      paramString2 = z.g(paramString2);
      paramString1 = paramString2;
      if ("text/vtt".equals(paramString2)) {
        paramString1 = "application/x-mp4-vtt";
      }
      return paramString1;
    }
    return null;
  }
  
  public static void w(XmlPullParser paramXmlPullParser)
  {
    if (!N.e(paramXmlPullParser)) {
      return;
    }
    int i = 1;
    while (i != 0)
    {
      paramXmlPullParser.next();
      if (N.e(paramXmlPullParser)) {
        i++;
      } else if (N.c(paramXmlPullParser)) {
        i--;
      }
    }
  }
  
  public int A(XmlPullParser paramXmlPullParser)
  {
    String str = r0(paramXmlPullParser, "schemeIdUri", null);
    str.hashCode();
    int i = str.hashCode();
    int j = -1;
    switch (i)
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
                  i = -1;
                  break;
                } while (!str.equals("urn:dolby:dash:audio_channel_configuration:2011"));
                i = 6;
                break;
              } while (!str.equals("tag:dts.com,2018:uhd:audio_channel_configuration"));
              i = 5;
              break;
            } while (!str.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012"));
            i = 4;
            break;
          } while (!str.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration"));
          i = 3;
          break;
        } while (!str.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011"));
        i = 2;
        break;
      } while (!str.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011"));
      i = 1;
      break;
    } while (!str.equals("urn:dts:dash:audio_channel_configuration:2012"));
    i = 0;
    switch (i)
    {
    default: 
      i = j;
      break;
    case 5: 
      i = L(paramXmlPullParser);
      break;
    case 3: 
      i = Z(paramXmlPullParser);
      break;
    case 2: 
    case 6: 
      i = J(paramXmlPullParser);
      break;
    case 1: 
      i = U(paramXmlPullParser, "value", -1);
      break;
    case 0: 
    case 4: 
      i = K(paramXmlPullParser);
    }
    do
    {
      paramXmlPullParser.next();
    } while (!N.d(paramXmlPullParser, "AudioChannelConfiguration"));
    return i;
  }
  
  public long B(XmlPullParser paramXmlPullParser, long paramLong)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
    if (paramXmlPullParser == null) {
      return paramLong;
    }
    if ("INF".equals(paramXmlPullParser)) {
      return Long.MAX_VALUE;
    }
    return (Float.parseFloat(paramXmlPullParser) * 1000000.0F);
  }
  
  public List C(XmlPullParser paramXmlPullParser, List paramList, boolean paramBoolean)
  {
    int i = 0;
    String str1 = paramXmlPullParser.getAttributeValue(null, "dvb:priority");
    if (str1 != null) {
      j = Integer.parseInt(str1);
    } else if (paramBoolean) {
      j = 1;
    } else {
      j = Integer.MIN_VALUE;
    }
    str1 = paramXmlPullParser.getAttributeValue(null, "dvb:weight");
    int k;
    if (str1 != null) {
      k = Integer.parseInt(str1);
    } else {
      k = 1;
    }
    str1 = paramXmlPullParser.getAttributeValue(null, "serviceLocation");
    String str2 = s0(paramXmlPullParser, "BaseURL");
    if (G.c(str2))
    {
      paramXmlPullParser = str1;
      if (str1 == null) {
        paramXmlPullParser = str2;
      }
      return E.j(new b[] { new b(str2, paramXmlPullParser, j, k) });
    }
    ArrayList localArrayList = new ArrayList();
    int m = j;
    for (int j = i; j < paramList.size(); j++)
    {
      b localb = (b)paramList.get(j);
      String str3 = G.e(a, str2);
      if (str1 == null) {
        paramXmlPullParser = str3;
      } else {
        paramXmlPullParser = str1;
      }
      if (paramBoolean)
      {
        m = c;
        k = d;
        paramXmlPullParser = b;
      }
      localArrayList.add(new b(str3, paramXmlPullParser, m, k));
    }
    return localArrayList;
  }
  
  public Pair F(XmlPullParser paramXmlPullParser)
  {
    Object localObject1 = null;
    Object localObject2 = paramXmlPullParser.getAttributeValue(null, "schemeIdUri");
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    if (localObject2 != null)
    {
      localObject2 = W2.c.e((String)localObject2);
      ((String)localObject2).hashCode();
      int i = ((String)localObject2).hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1812765994: 
        if (((String)localObject2).equals("urn:mpeg:dash:mp4protection:2011")) {
          j = 3;
        }
        break;
      case 755418770: 
        if (((String)localObject2).equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
          j = 2;
        }
        break;
      case 489446379: 
        if (((String)localObject2).equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
          j = 1;
        }
        break;
      case -1980789791: 
        if (((String)localObject2).equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        break;
      case 3: 
        localObject3 = paramXmlPullParser.getAttributeValue(null, "value");
        localObject2 = N.b(paramXmlPullParser, "default_KID");
        if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (!"00000000-0000-0000-0000-000000000000".equals(localObject2)))
        {
          localObject4 = ((String)localObject2).split("\\s+");
          localObject2 = new UUID[localObject4.length];
          for (j = 0; j < localObject4.length; j++) {
            localObject2[j] = UUID.fromString(localObject4[j]);
          }
          localObject4 = d0.g.b;
          localObject5 = Z0.o.b((UUID)localObject4, (UUID[])localObject2, null);
          localObject2 = null;
          localObject6 = localObject3;
          localObject3 = localObject2;
          break label368;
        }
        g0.o.h("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
      }
    }
    Object localObject7;
    for (;;)
    {
      localObject4 = null;
      localObject2 = null;
      localObject7 = localObject2;
      localObject6 = localObject3;
      localObject5 = localObject2;
      localObject3 = localObject7;
      break;
      localObject2 = d0.g.d;
      for (;;)
      {
        localObject3 = null;
        localObject7 = localObject3;
        localObject4 = localObject2;
        localObject2 = localObject7;
        break;
        localObject2 = d0.g.e;
        continue;
        localObject2 = d0.g.c;
      }
      localObject3 = null;
    }
    label368:
    Object localObject8;
    label613:
    do
    {
      paramXmlPullParser.next();
      if (((N.f(paramXmlPullParser, "clearkey:Laurl")) || (N.f(paramXmlPullParser, "dashif:Laurl"))) && (paramXmlPullParser.next() == 4))
      {
        localObject8 = paramXmlPullParser.getText();
        localObject7 = localObject4;
        localObject2 = localObject5;
      }
      else if (N.f(paramXmlPullParser, "ms:laurl"))
      {
        localObject8 = paramXmlPullParser.getAttributeValue(null, "licenseUrl");
        localObject7 = localObject4;
        localObject2 = localObject5;
      }
      else if ((localObject5 == null) && (N.g(paramXmlPullParser, "pssh")) && (paramXmlPullParser.next() == 4))
      {
        localObject2 = Base64.decode(paramXmlPullParser.getText(), 0);
        localObject4 = Z0.o.f((byte[])localObject2);
        if (localObject4 == null)
        {
          g0.o.h("MpdParser", "Skipping malformed cenc:pssh data");
          localObject2 = null;
          localObject7 = localObject4;
          localObject8 = localObject3;
        }
        else
        {
          localObject7 = localObject4;
          localObject8 = localObject3;
        }
      }
      else
      {
        if (localObject5 == null)
        {
          localObject2 = d0.g.e;
          if ((((UUID)localObject2).equals(localObject4)) && (N.f(paramXmlPullParser, "mspr:pro")) && (paramXmlPullParser.next() == 4))
          {
            localObject2 = Z0.o.a((UUID)localObject2, Base64.decode(paramXmlPullParser.getText(), 0));
            localObject7 = localObject4;
            localObject8 = localObject3;
            break label613;
          }
        }
        w(paramXmlPullParser);
        localObject8 = localObject3;
        localObject2 = localObject5;
        localObject7 = localObject4;
      }
      localObject4 = localObject7;
      localObject5 = localObject2;
      localObject3 = localObject8;
    } while (!N.d(paramXmlPullParser, "ContentProtection"));
    paramXmlPullParser = (XmlPullParser)localObject1;
    if (localObject7 != null) {
      paramXmlPullParser = new m.b((UUID)localObject7, (String)localObject8, "video/mp4", (byte[])localObject2);
    }
    return Pair.create(localObject6, paramXmlPullParser);
  }
  
  public int G(XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "contentType");
    boolean bool = TextUtils.isEmpty(paramXmlPullParser);
    int i = -1;
    if (!bool) {
      if ("audio".equals(paramXmlPullParser)) {
        i = 1;
      } else if ("video".equals(paramXmlPullParser)) {
        i = 2;
      } else if ("text".equals(paramXmlPullParser)) {
        i = 3;
      } else if ("image".equals(paramXmlPullParser)) {
        i = 4;
      }
    }
    return i;
  }
  
  public Pair O(XmlPullParser paramXmlPullParser, String paramString1, String paramString2, long paramLong1, long paramLong2, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    long l1 = X(paramXmlPullParser, "id", 0L);
    long l2 = X(paramXmlPullParser, "duration", -9223372036854775807L);
    long l3 = X(paramXmlPullParser, "presentationTime", 0L);
    l2 = M.W0(l2, 1000L, paramLong1);
    paramLong1 = M.W0(l3 - paramLong2, 1000000L, paramLong1);
    String str = r0(paramXmlPullParser, "messageData", null);
    paramXmlPullParser = P(paramXmlPullParser, paramByteArrayOutputStream);
    if (str != null) {
      for (;;)
      {
        paramXmlPullParser = M.r0(str);
      }
    }
    return Pair.create(Long.valueOf(paramLong1), d(paramString1, paramString2, l1, l2, paramXmlPullParser));
  }
  
  public byte[] P(XmlPullParser paramXmlPullParser, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    paramByteArrayOutputStream.reset();
    XmlSerializer localXmlSerializer = Xml.newSerializer();
    localXmlSerializer.setOutput(paramByteArrayOutputStream, W2.e.c.name());
    for (;;)
    {
      paramXmlPullParser.nextToken();
      if (N.d(paramXmlPullParser, "Event")) {
        break;
      }
      switch (paramXmlPullParser.getEventType())
      {
      default: 
        break;
      case 10: 
        localXmlSerializer.docdecl(paramXmlPullParser.getText());
        break;
      case 9: 
        localXmlSerializer.comment(paramXmlPullParser.getText());
        break;
      case 8: 
        localXmlSerializer.processingInstruction(paramXmlPullParser.getText());
        break;
      case 7: 
        localXmlSerializer.ignorableWhitespace(paramXmlPullParser.getText());
        break;
      case 6: 
        localXmlSerializer.entityRef(paramXmlPullParser.getText());
        break;
      case 5: 
        localXmlSerializer.cdsect(paramXmlPullParser.getText());
        break;
      case 4: 
        localXmlSerializer.text(paramXmlPullParser.getText());
        break;
      case 3: 
        localXmlSerializer.endTag(paramXmlPullParser.getNamespace(), paramXmlPullParser.getName());
        break;
      case 2: 
        localXmlSerializer.startTag(paramXmlPullParser.getNamespace(), paramXmlPullParser.getName());
        for (int i = 0; i < paramXmlPullParser.getAttributeCount(); i++) {
          localXmlSerializer.attribute(paramXmlPullParser.getAttributeNamespace(i), paramXmlPullParser.getAttributeName(i), paramXmlPullParser.getAttributeValue(i));
        }
      case 1: 
        localXmlSerializer.endDocument();
        break;
      case 0: 
        localXmlSerializer.startDocument(null, Boolean.FALSE);
      }
    }
    localXmlSerializer.flush();
    return paramByteArrayOutputStream.toByteArray();
  }
  
  public f Q(XmlPullParser paramXmlPullParser)
  {
    String str1 = r0(paramXmlPullParser, "schemeIdUri", "");
    String str2 = r0(paramXmlPullParser, "value", "");
    long l1 = X(paramXmlPullParser, "timescale", 1L);
    long l2 = X(paramXmlPullParser, "presentationTimeOffset", 0L);
    ArrayList localArrayList = new ArrayList();
    Object localObject = new ByteArrayOutputStream(512);
    for (;;)
    {
      paramXmlPullParser.next();
      if (N.f(paramXmlPullParser, "Event")) {
        localArrayList.add(O(paramXmlPullParser, str1, str2, l1, l2, (ByteArrayOutputStream)localObject));
      } else {
        w(paramXmlPullParser);
      }
      if (N.d(paramXmlPullParser, "EventStream"))
      {
        paramXmlPullParser = new long[localArrayList.size()];
        localObject = new Q0.a[localArrayList.size()];
        for (int i = 0; i < localArrayList.size(); i++)
        {
          Pair localPair = (Pair)localArrayList.get(i);
          paramXmlPullParser[i] = ((Long)first).longValue();
          localObject[i] = ((Q0.a)second);
        }
        return e(str1, str2, l1, paramXmlPullParser, (Q0.a[])localObject);
      }
    }
  }
  
  public i T(XmlPullParser paramXmlPullParser)
  {
    return d0(paramXmlPullParser, "sourceURL", "range");
  }
  
  public t V(XmlPullParser paramXmlPullParser)
  {
    return new t(paramXmlPullParser.getAttributeValue(null, "lang"), s0(paramXmlPullParser, "Label"));
  }
  
  public c Y(XmlPullParser paramXmlPullParser, Uri paramUri)
  {
    Object localObject1 = this;
    boolean bool1 = ((d)localObject1).v(((d)localObject1).b0(paramXmlPullParser, "profiles", new String[0]));
    long l1 = -9223372036854775807L;
    long l2 = H(paramXmlPullParser, "availabilityStartTime", -9223372036854775807L);
    long l3 = M(paramXmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
    long l4 = M(paramXmlPullParser, "minBufferTime", -9223372036854775807L);
    Throwable localThrowable = null;
    boolean bool2 = "dynamic".equals(paramXmlPullParser.getAttributeValue(null, "type"));
    long l5;
    if (bool2) {
      l5 = M(paramXmlPullParser, "minimumUpdatePeriod", -9223372036854775807L);
    } else {
      l5 = -9223372036854775807L;
    }
    long l6;
    if (bool2) {
      l6 = M(paramXmlPullParser, "timeShiftBufferDepth", -9223372036854775807L);
    } else {
      l6 = -9223372036854775807L;
    }
    long l7;
    if (bool2) {
      l7 = M(paramXmlPullParser, "suggestedPresentationDelay", -9223372036854775807L);
    } else {
      l7 = -9223372036854775807L;
    }
    long l8 = H(paramXmlPullParser, "publishTime", -9223372036854775807L);
    long l9 = 0L;
    long l10;
    if (bool2) {
      l10 = 0L;
    } else {
      l10 = -9223372036854775807L;
    }
    Object localObject2 = paramUri.toString();
    localObject1 = paramUri.toString();
    if (bool1) {
      i = 1;
    } else {
      i = Integer.MIN_VALUE;
    }
    localObject1 = E.j(new b[] { new b((String)localObject2, (String)localObject1, i, 1) });
    localObject2 = new ArrayList();
    ArrayList localArrayList = new ArrayList();
    if (bool2) {
      l9 = -9223372036854775807L;
    }
    int i = 0;
    int j = i;
    h localh = null;
    Object localObject3 = localh;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    long l11 = l9;
    l9 = l1;
    for (;;)
    {
      Object localObject6 = this;
      paramXmlPullParser.next();
      if (N.f(paramXmlPullParser, "BaseURL"))
      {
        l1 = l10;
        int k = i;
        if (i == 0)
        {
          l1 = ((d)localObject6).B(paramXmlPullParser, l10);
          k = 1;
        }
        localArrayList.addAll(((d)localObject6).C(paramXmlPullParser, (List)localObject1, bool1));
        i = k;
        l10 = l1;
      }
      for (;;)
      {
        break;
        if (N.f(paramXmlPullParser, "ProgramInformation"))
        {
          localh = c0(paramXmlPullParser);
        }
        else if (N.f(paramXmlPullParser, "UTCTiming"))
        {
          localObject3 = w0(paramXmlPullParser);
        }
        else if (N.f(paramXmlPullParser, "Location"))
        {
          localObject4 = G.f(paramUri.toString(), paramXmlPullParser.nextText());
        }
        else if (N.f(paramXmlPullParser, "ServiceDescription"))
        {
          localObject5 = q0(paramXmlPullParser);
        }
        else
        {
          if ((N.f(paramXmlPullParser, "Period")) && (j == 0))
          {
            if (!localArrayList.isEmpty()) {
              localObject6 = localArrayList;
            } else {
              localObject6 = localObject1;
            }
            l1 = l9;
            localObject6 = a0(paramXmlPullParser, (List)localObject6, l11, l10, l2, l6, bool1);
            g localg = (g)first;
            if (b == l1)
            {
              if (bool2)
              {
                j = 1;
              }
              else
              {
                paramXmlPullParser = new StringBuilder();
                paramXmlPullParser.append("Unable to determine start of period ");
                paramXmlPullParser.append(((List)localObject2).size());
                throw A.c(paramXmlPullParser.toString(), localThrowable);
              }
            }
            else
            {
              l11 = ((Long)second).longValue();
              if (l11 == l1) {
                l11 = l1;
              } else {
                l11 = b + l11;
              }
              ((List)localObject2).add(localg);
            }
          }
          for (;;)
          {
            break;
            w(paramXmlPullParser);
          }
        }
      }
      if (N.d(paramXmlPullParser, "MPD"))
      {
        if (l3 == l9)
        {
          if (l11 != l9) {
            break label691;
          }
          if (!bool2) {
            throw A.c("Unable to determine duration of static manifest.", localThrowable);
          }
        }
        l11 = l3;
        label691:
        if (!((List)localObject2).isEmpty()) {
          return g(l2, l11, l4, bool2, l5, l6, l7, l8, localh, (o)localObject3, (l)localObject5, (Uri)localObject4, (List)localObject2);
        }
        throw A.c("No periods found.", localThrowable);
      }
    }
  }
  
  public Pair a0(XmlPullParser paramXmlPullParser, List paramList, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean)
  {
    Object localObject1 = paramXmlPullParser;
    int i = 0;
    String str = ((XmlPullParser)localObject1).getAttributeValue(null, "id");
    long l1 = M((XmlPullParser)localObject1, "start", paramLong1);
    long l2 = -9223372036854775807L;
    long l3;
    if (paramLong3 != -9223372036854775807L) {
      l3 = paramLong3 + l1;
    } else {
      l3 = -9223372036854775807L;
    }
    long l4 = M((XmlPullParser)localObject1, "duration", -9223372036854775807L);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    paramLong1 = paramLong2;
    int j = 0;
    long l5 = -9223372036854775807L;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    paramLong2 = l2;
    for (;;)
    {
      Object localObject4 = this;
      paramXmlPullParser.next();
      if (N.f((XmlPullParser)localObject1, "BaseURL"))
      {
        paramLong3 = paramLong1;
        int k = j;
        if (j == 0)
        {
          paramLong3 = ((d)localObject4).B((XmlPullParser)localObject1, paramLong1);
          k = 1;
        }
        localArrayList3.addAll(((d)localObject4).C((XmlPullParser)localObject1, paramList, paramBoolean));
        paramLong1 = paramLong3;
        j = k;
      }
      else
      {
        if (N.f((XmlPullParser)localObject1, "AdaptationSet"))
        {
          if (!localArrayList3.isEmpty()) {
            localObject1 = localArrayList3;
          } else {
            localObject1 = paramList;
          }
          localArrayList1.add(y(paramXmlPullParser, (List)localObject1, (k)localObject2, l4, paramLong1, l5, l3, paramLong4, paramBoolean));
        }
        for (;;)
        {
          break;
          paramLong2 = paramLong1;
          localObject4 = paramXmlPullParser;
          if (N.f((XmlPullParser)localObject4, "EventStream"))
          {
            localArrayList2.add(Q(paramXmlPullParser));
          }
          else
          {
            if (N.f((XmlPullParser)localObject4, "SegmentBase"))
            {
              localObject2 = j0((XmlPullParser)localObject4, null);
              i = 0;
              paramLong1 = paramLong2;
              paramLong2 = -9223372036854775807L;
              localObject1 = localObject4;
              break label486;
            }
            if (N.f((XmlPullParser)localObject4, "SegmentList"))
            {
              paramLong3 = B((XmlPullParser)localObject4, -9223372036854775807L);
              localObject1 = k0(paramXmlPullParser, null, l3, l4, paramLong2, paramLong3, paramLong4);
            }
            for (paramLong2 = paramLong3;; paramLong2 = paramLong3)
            {
              paramLong3 = -9223372036854775807L;
              i = 0;
              localObject2 = localObject1;
              localObject1 = localObject4;
              l5 = paramLong2;
              paramLong2 = paramLong3;
              break label486;
              if (!N.f((XmlPullParser)localObject4, "SegmentTemplate")) {
                break;
              }
              paramLong3 = B((XmlPullParser)localObject4, -9223372036854775807L);
              localObject1 = l0(paramXmlPullParser, null, v.Y(), l3, l4, paramLong2, paramLong3, paramLong4);
            }
            if (!N.f((XmlPullParser)localObject4, "AssetIdentifier")) {
              break label479;
            }
            localObject3 = I((XmlPullParser)localObject4, "AssetIdentifier");
          }
        }
        for (;;)
        {
          paramLong2 = -9223372036854775807L;
          i = 0;
          localObject1 = paramXmlPullParser;
          break;
          label479:
          w(paramXmlPullParser);
        }
      }
      label486:
      if (N.d((XmlPullParser)localObject1, "Period")) {
        return Pair.create(h(str, l1, localArrayList1, localArrayList2, (e)localObject3), Long.valueOf(l4));
      }
    }
  }
  
  public final long b(List paramList, long paramLong1, long paramLong2, int paramInt, long paramLong3)
  {
    if (paramInt >= 0) {
      paramInt++;
    } else {
      paramInt = (int)M.l(paramLong3 - paramLong1, paramLong2);
    }
    for (int i = 0; i < paramInt; i++)
    {
      paramList.add(m(paramLong1, paramLong2));
      paramLong1 += paramLong2;
    }
    return paramLong1;
  }
  
  public String[] b0(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser == null) {
      return paramArrayOfString;
    }
    return paramXmlPullParser.split(",");
  }
  
  public a c(long paramLong, int paramInt, List paramList1, List paramList2, List paramList3, List paramList4)
  {
    return new a(paramLong, paramInt, paramList1, paramList2, paramList3, paramList4);
  }
  
  public h c0(XmlPullParser paramXmlPullParser)
  {
    String str1 = null;
    String str2 = r0(paramXmlPullParser, "moreInformationURL", null);
    String str3 = r0(paramXmlPullParser, "lang", null);
    String str4 = null;
    String str5 = str4;
    for (;;)
    {
      paramXmlPullParser.next();
      if (N.f(paramXmlPullParser, "Title")) {
        str1 = paramXmlPullParser.nextText();
      }
      for (;;)
      {
        break;
        if (N.f(paramXmlPullParser, "Source")) {
          str4 = paramXmlPullParser.nextText();
        } else if (N.f(paramXmlPullParser, "Copyright")) {
          str5 = paramXmlPullParser.nextText();
        } else {
          w(paramXmlPullParser);
        }
      }
      if (N.d(paramXmlPullParser, "ProgramInformation")) {
        return new h(str1, str4, str5, str2, str3);
      }
    }
  }
  
  public Q0.a d(String paramString1, String paramString2, long paramLong1, long paramLong2, byte[] paramArrayOfByte)
  {
    return new Q0.a(paramString1, paramString2, paramLong2, paramLong1, paramArrayOfByte);
  }
  
  public i d0(XmlPullParser paramXmlPullParser, String paramString1, String paramString2)
  {
    paramString1 = paramXmlPullParser.getAttributeValue(null, paramString1);
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString2);
    long l1;
    long l2;
    if (paramXmlPullParser != null)
    {
      paramXmlPullParser = paramXmlPullParser.split("-");
      l1 = Long.parseLong(paramXmlPullParser[0]);
      l2 = l1;
      if (paramXmlPullParser.length == 2)
      {
        l2 = Long.parseLong(paramXmlPullParser[1]) - l1 + 1L;
        break label86;
      }
    }
    for (;;)
    {
      long l3 = -1L;
      l1 = l2;
      l2 = l3;
      break;
      l2 = 0L;
    }
    label86:
    return i(paramString1, l1, l2);
  }
  
  public f e(String paramString1, String paramString2, long paramLong, long[] paramArrayOfLong, Q0.a[] paramArrayOfa)
  {
    return new f(paramString1, paramString2, paramLong, paramArrayOfLong, paramArrayOfa);
  }
  
  public a e0(XmlPullParser paramXmlPullParser, List paramList1, String paramString1, String paramString2, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, String paramString3, List paramList2, List paramList3, List paramList4, List paramList5, k paramk, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, boolean paramBoolean)
  {
    String str1 = paramXmlPullParser.getAttributeValue(null, "id");
    int i = U(paramXmlPullParser, "bandwidth", -1);
    String str2 = r0(paramXmlPullParser, "mimeType", paramString1);
    String str3 = r0(paramXmlPullParser, "codecs", paramString2);
    int j = U(paramXmlPullParser, "width", paramInt1);
    int k = U(paramXmlPullParser, "height", paramInt2);
    paramFloat = S(paramXmlPullParser, paramFloat);
    paramInt4 = U(paramXmlPullParser, "audioSamplingRate", paramInt4);
    ArrayList localArrayList1 = new ArrayList();
    paramString2 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList(paramList4);
    paramString1 = new ArrayList(paramList5);
    ArrayList localArrayList3 = new ArrayList();
    paramInt2 = paramInt3;
    paramInt1 = 0;
    Object localObject1 = null;
    paramList4 = paramk;
    paramk = (k)localObject1;
    for (;;)
    {
      Object localObject2 = this;
      paramXmlPullParser.next();
      long l;
      if (N.f(paramXmlPullParser, "BaseURL"))
      {
        l = paramLong3;
        paramInt3 = paramInt1;
        if (paramInt1 == 0)
        {
          l = ((d)localObject2).B(paramXmlPullParser, paramLong3);
          paramInt3 = 1;
        }
        localArrayList3.addAll(((d)localObject2).C(paramXmlPullParser, paramList1, paramBoolean));
        paramInt1 = paramInt3;
        paramLong3 = l;
      }
      for (;;)
      {
        for (localObject1 = paramList4;; localObject1 = paramList4)
        {
          paramList4 = paramString2;
          paramString2 = paramString1;
          paramString1 = (String)localObject1;
          break label573;
          if (!N.f(paramXmlPullParser, "AudioChannelConfiguration")) {
            break;
          }
          paramInt2 = A(paramXmlPullParser);
        }
        if (!N.f(paramXmlPullParser, "SegmentBase")) {
          break;
        }
        paramList4 = ((d)localObject2).j0(paramXmlPullParser, (k.e)paramList4);
      }
      if (N.f(paramXmlPullParser, "SegmentList"))
      {
        paramLong4 = ((d)localObject2).B(paramXmlPullParser, paramLong4);
        paramList4 = k0(paramXmlPullParser, (k.b)paramList4, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5);
        localObject1 = paramString1;
        paramString1 = paramString2;
        paramString2 = (String)localObject1;
      }
      for (;;)
      {
        localObject1 = paramList4;
        paramList4 = paramString1;
        paramString1 = (String)localObject1;
        break label573;
        l = paramLong3;
        localObject1 = paramString1;
        String str4 = paramString2;
        ArrayList localArrayList4 = localArrayList2;
        if (N.f(paramXmlPullParser, "SegmentTemplate"))
        {
          paramLong4 = ((d)localObject2).B(paramXmlPullParser, paramLong4);
          paramList4 = l0(paramXmlPullParser, (k.c)paramList4, paramList5, paramLong1, paramLong2, l, paramLong4, paramLong5);
          break;
        }
        if (N.f(paramXmlPullParser, "ContentProtection"))
        {
          localObject1 = F(paramXmlPullParser);
          localObject2 = first;
          if (localObject2 != null) {
            paramk = (String)localObject2;
          }
          localObject1 = second;
          if (localObject1 != null) {
            localArrayList1.add((m.b)localObject1);
          }
          break;
        }
        if (N.f(paramXmlPullParser, "InbandEventStream")) {
          str4.add(I(paramXmlPullParser, "InbandEventStream"));
        } else if (N.f(paramXmlPullParser, "EssentialProperty")) {
          localArrayList4.add(I(paramXmlPullParser, "EssentialProperty"));
        } else if (N.f(paramXmlPullParser, "SupplementalProperty")) {
          ((ArrayList)localObject1).add(I(paramXmlPullParser, "SupplementalProperty"));
        } else {
          w(paramXmlPullParser);
        }
        localObject1 = paramString2;
        paramLong3 = l;
        paramString2 = paramString1;
        paramString1 = (String)localObject1;
      }
      label573:
      if (N.d(paramXmlPullParser, "Representation"))
      {
        paramXmlPullParser = f(str1, str2, j, k, paramFloat, paramInt2, paramInt4, i, paramString3, paramList2, paramList3, str3, localArrayList2, paramString2);
        if (paramString1 == null) {
          paramString1 = new k.e();
        }
        if (!localArrayList3.isEmpty()) {
          paramList1 = localArrayList3;
        }
        return new a(paramXmlPullParser, paramList1, paramString1, paramk, localArrayList1, paramList4, localArrayList2, paramString2, -1L);
      }
      localObject1 = paramList4;
      paramList4 = paramString1;
      paramString1 = paramString2;
      paramString2 = (String)localObject1;
    }
  }
  
  public q f(String paramString1, String paramString2, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, String paramString3, List paramList1, List paramList2, String paramString4, List paramList3, List paramList4)
  {
    String str1 = paramString4;
    String str2 = u(paramString2, str1);
    String str3 = str1;
    paramString4 = str2;
    if ("audio/eac3".equals(str2))
    {
      str2 = N(paramList4);
      str3 = str1;
      paramString4 = str2;
      if ("audio/eac3-joc".equals(str2))
      {
        str3 = "ec+3";
        paramString4 = str2;
      }
    }
    int i = p0(paramList1);
    int j = i0(paramList1);
    int k = f0(paramList2);
    int m = h0(paramList3);
    int n = h0(paramList4);
    paramList1 = t0(paramList3);
    paramString1 = new q.b().a0(paramString1).Q(paramString2).o0(paramString4).O(str3).j0(paramInt5).q0(i).m0(j | k | m | n).e0(paramString3);
    m = -1;
    if (paramList1 != null) {
      paramInt5 = ((Integer)first).intValue();
    } else {
      paramInt5 = -1;
    }
    paramString1 = paramString1.t0(paramInt5);
    if (paramList1 != null) {
      paramInt5 = ((Integer)second).intValue();
    } else {
      paramInt5 = -1;
    }
    paramString1 = paramString1.u0(paramInt5);
    if (z.s(paramString4))
    {
      paramString1.v0(paramInt1).Y(paramInt2).X(paramFloat);
    }
    else if (z.o(paramString4))
    {
      paramString1.N(paramInt3).p0(paramInt4);
    }
    else if (z.r(paramString4))
    {
      if ("application/cea-608".equals(paramString4))
      {
        paramInt1 = D(paramList2);
      }
      else
      {
        paramInt1 = m;
        if ("application/cea-708".equals(paramString4)) {
          paramInt1 = E(paramList2);
        }
      }
      paramString1.L(paramInt1);
    }
    else if (z.p(paramString4))
    {
      paramString1.v0(paramInt1).Y(paramInt2);
    }
    return paramString1.K();
  }
  
  public int f0(List paramList)
  {
    int i = 0;
    int k;
    for (int j = 0; i < paramList.size(); j = k)
    {
      e locale = (e)paramList.get(i);
      if (W2.c.a("urn:mpeg:dash:role:2011", a)) {}
      for (k = g0(b);; k = u0(b))
      {
        k = j | k;
        break;
        k = j;
        if (!W2.c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", a)) {
          break;
        }
      }
      i++;
    }
    return j;
  }
  
  public c g(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, long paramLong4, long paramLong5, long paramLong6, long paramLong7, h paramh, o paramo, l paraml, Uri paramUri, List paramList)
  {
    return new c(paramLong1, paramLong2, paramLong3, paramBoolean, paramLong4, paramLong5, paramLong6, paramLong7, paramh, paramo, paraml, paramUri, paramList);
  }
  
  public int g0(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1855372047: 
      if (paramString.equals("supplementary")) {
        j = 12;
      }
      break;
    case 1629013393: 
      if (paramString.equals("emergency")) {
        j = 11;
      }
      break;
    case 899152809: 
      if (paramString.equals("commentary")) {
        j = 10;
      }
      break;
    case 552573414: 
      if (paramString.equals("caption")) {
        j = 9;
      }
      break;
    case 3530173: 
      if (paramString.equals("sign")) {
        j = 8;
      }
      break;
    case 3343801: 
      if (paramString.equals("main")) {
        j = 7;
      }
      break;
    case 99825: 
      if (paramString.equals("dub")) {
        j = 6;
      }
      break;
    case -1396432756: 
      if (paramString.equals("forced-subtitle")) {
        j = 5;
      }
      break;
    case -1408024454: 
      if (paramString.equals("alternate")) {
        j = 4;
      }
      break;
    case -1574842690: 
      if (paramString.equals("forced_subtitle")) {
        j = 3;
      }
      break;
    case -1580883024: 
      if (paramString.equals("enhanced-audio-intelligibility")) {
        j = 2;
      }
      break;
    case -1724546052: 
      if (paramString.equals("description")) {
        j = 1;
      }
      break;
    case -2060497896: 
      if (paramString.equals("subtitle")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return 0;
    case 12: 
      return 4;
    case 11: 
      return 32;
    case 10: 
      return 8;
    case 9: 
      return 64;
    case 8: 
      return 256;
    case 7: 
      return 1;
    case 6: 
      return 16;
    case 4: 
      return 2;
    case 2: 
      return 2048;
    case 1: 
      return 512;
    }
    return 128;
  }
  
  public g h(String paramString, long paramLong, List paramList1, List paramList2, e parame)
  {
    return new g(paramString, paramLong, paramList1, paramList2, parame);
  }
  
  public int h0(List paramList)
  {
    int i = 0;
    int j = 0;
    while (i < paramList.size())
    {
      if (W2.c.a("http://dashif.org/guidelines/trickmode", geta)) {
        j = 16384;
      }
      i++;
    }
    return j;
  }
  
  public i i(String paramString, long paramLong1, long paramLong2)
  {
    return new i(paramString, paramLong1, paramLong2);
  }
  
  public int i0(List paramList)
  {
    int i = 0;
    int k;
    for (int j = 0; i < paramList.size(); j = k)
    {
      e locale = (e)paramList.get(i);
      k = j;
      if (W2.c.a("urn:mpeg:dash:role:2011", a)) {
        k = j | g0(b);
      }
      i++;
    }
    return j;
  }
  
  public j j(a parama, String paramString1, List paramList, String paramString2, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    q.b localb = a.a();
    if ((paramString1 != null) && (paramList.isEmpty())) {
      localb.c0(paramString1);
    } else {
      localb.d0(paramList);
    }
    paramList = d;
    paramString1 = paramList;
    if (paramList == null) {
      paramString1 = paramString2;
    }
    paramList = e;
    paramList.addAll(paramArrayList1);
    if (!paramList.isEmpty())
    {
      r(paramList);
      s(paramList);
      localb.U(new m(paramString1, paramList));
    }
    paramString1 = f;
    paramString1.addAll(paramArrayList2);
    return j.o(g, localb.K(), b, c, paramString1, h, i, null);
  }
  
  public k.e j0(XmlPullParser paramXmlPullParser, k.e parame)
  {
    long l1;
    if (parame != null) {
      l1 = b;
    } else {
      l1 = 1L;
    }
    long l2 = X(paramXmlPullParser, "timescale", l1);
    long l3 = 0L;
    if (parame != null) {
      l1 = c;
    } else {
      l1 = 0L;
    }
    long l4 = X(paramXmlPullParser, "presentationTimeOffset", l1);
    if (parame != null) {
      l1 = d;
    } else {
      l1 = 0L;
    }
    if (parame != null) {
      l3 = e;
    }
    Object localObject1 = null;
    Object localObject2 = paramXmlPullParser.getAttributeValue(null, "indexRange");
    if (localObject2 != null)
    {
      localObject2 = ((String)localObject2).split("-");
      l1 = Long.parseLong(localObject2[0]);
      l3 = Long.parseLong(localObject2[1]) - l1 + 1L;
    }
    if (parame != null) {
      localObject1 = a;
    }
    do
    {
      paramXmlPullParser.next();
      if (N.f(paramXmlPullParser, "Initialization"))
      {
        parame = T(paramXmlPullParser);
      }
      else
      {
        w(paramXmlPullParser);
        parame = (k.e)localObject1;
      }
      localObject1 = parame;
    } while (!N.d(paramXmlPullParser, "SegmentBase"));
    return n(parame, l2, l4, l1, l3);
  }
  
  public k.b k(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List paramList1, long paramLong5, List paramList2, long paramLong6, long paramLong7)
  {
    return new k.b(parami, paramLong1, paramLong2, paramLong3, paramLong4, paramList1, paramLong5, paramList2, M.J0(paramLong6), M.J0(paramLong7));
  }
  
  public k.b k0(XmlPullParser paramXmlPullParser, k.b paramb, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    long l1 = 1L;
    if (paramb != null) {
      l2 = b;
    } else {
      l2 = 1L;
    }
    long l3 = X(paramXmlPullParser, "timescale", l2);
    if (paramb != null) {
      l2 = c;
    } else {
      l2 = 0L;
    }
    long l4 = X(paramXmlPullParser, "presentationTimeOffset", l2);
    if (paramb != null) {
      l2 = e;
    } else {
      l2 = -9223372036854775807L;
    }
    long l5 = X(paramXmlPullParser, "duration", l2);
    long l2 = l1;
    if (paramb != null) {
      l2 = d;
    }
    l2 = X(paramXmlPullParser, "startNumber", l2);
    paramLong3 = t(paramLong3, paramLong4);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    do
    {
      paramXmlPullParser.next();
      if (N.f(paramXmlPullParser, "Initialization"))
      {
        localObject4 = T(paramXmlPullParser);
        localObject5 = localObject1;
        localObject6 = localObject2;
      }
      else if (N.f(paramXmlPullParser, "SegmentTimeline"))
      {
        localObject5 = m0(paramXmlPullParser, l3, paramLong2);
        localObject6 = localObject2;
        localObject4 = localObject3;
      }
      else if (N.f(paramXmlPullParser, "SegmentURL"))
      {
        localObject6 = localObject2;
        if (localObject2 == null) {
          localObject6 = new ArrayList();
        }
        ((List)localObject6).add(n0(paramXmlPullParser));
        localObject5 = localObject1;
        localObject4 = localObject3;
      }
      else
      {
        w(paramXmlPullParser);
        localObject4 = localObject3;
        localObject6 = localObject2;
        localObject5 = localObject1;
      }
      localObject1 = localObject5;
      localObject2 = localObject6;
      localObject3 = localObject4;
    } while (!N.d(paramXmlPullParser, "SegmentList"));
    localObject3 = localObject5;
    localObject2 = localObject6;
    paramXmlPullParser = (XmlPullParser)localObject4;
    if (paramb != null)
    {
      if (localObject4 == null) {
        localObject4 = a;
      }
      if (localObject5 == null) {
        localObject5 = f;
      }
      if (localObject6 != null)
      {
        localObject3 = localObject5;
        localObject2 = localObject6;
        paramXmlPullParser = (XmlPullParser)localObject4;
      }
      else
      {
        localObject2 = j;
        paramXmlPullParser = (XmlPullParser)localObject4;
        localObject3 = localObject5;
      }
    }
    return k(paramXmlPullParser, l3, l4, l2, l5, (List)localObject3, paramLong3, (List)localObject2, paramLong5, paramLong1);
  }
  
  public k.c l(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, List paramList, long paramLong6, n paramn1, n paramn2, long paramLong7, long paramLong8)
  {
    return new k.c(parami, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramList, paramLong6, paramn1, paramn2, M.J0(paramLong7), M.J0(paramLong8));
  }
  
  public k.c l0(XmlPullParser paramXmlPullParser, k.c paramc, List paramList, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    long l1 = 1L;
    if (paramc != null) {
      l2 = b;
    } else {
      l2 = 1L;
    }
    long l3 = X(paramXmlPullParser, "timescale", l2);
    if (paramc != null) {
      l2 = c;
    } else {
      l2 = 0L;
    }
    long l4 = X(paramXmlPullParser, "presentationTimeOffset", l2);
    if (paramc != null) {
      l2 = e;
    } else {
      l2 = -9223372036854775807L;
    }
    long l5 = X(paramXmlPullParser, "duration", l2);
    long l2 = l1;
    if (paramc != null) {
      l2 = d;
    }
    l2 = X(paramXmlPullParser, "startNumber", l2);
    l1 = W(paramList);
    paramLong3 = t(paramLong3, paramLong4);
    List localList1 = null;
    if (paramc != null) {
      paramList = k;
    } else {
      paramList = null;
    }
    n localn1 = v0(paramXmlPullParser, "media", paramList);
    if (paramc != null) {
      paramList = j;
    } else {
      paramList = null;
    }
    n localn2 = v0(paramXmlPullParser, "initialization", paramList);
    paramList = null;
    for (;;)
    {
      paramXmlPullParser.next();
      if (N.f(paramXmlPullParser, "Initialization")) {
        paramList = T(paramXmlPullParser);
      } else if (N.f(paramXmlPullParser, "SegmentTimeline")) {
        localList1 = m0(paramXmlPullParser, l3, paramLong2);
      } else {
        w(paramXmlPullParser);
      }
      if (N.d(paramXmlPullParser, "SegmentTemplate"))
      {
        paramXmlPullParser = localList1;
        List localList2 = paramList;
        if (paramc != null)
        {
          if (paramList == null) {
            paramList = a;
          }
          if (localList1 != null)
          {
            paramXmlPullParser = localList1;
            localList2 = paramList;
          }
          else
          {
            paramXmlPullParser = f;
            localList2 = paramList;
          }
        }
        return l(localList2, l3, l4, l2, l1, l5, paramXmlPullParser, paramLong3, localn2, localn1, paramLong5, paramLong1);
      }
    }
  }
  
  public k.d m(long paramLong1, long paramLong2)
  {
    return new k.d(paramLong1, paramLong2);
  }
  
  public List m0(XmlPullParser paramXmlPullParser, long paramLong1, long paramLong2)
  {
    ArrayList localArrayList = new ArrayList();
    long l1 = 0L;
    long l2 = -9223372036854775807L;
    int i = 0;
    int j = i;
    long l3;
    long l4;
    int k;
    int m;
    do
    {
      paramXmlPullParser.next();
      if (N.f(paramXmlPullParser, "S"))
      {
        l3 = X(paramXmlPullParser, "t", -9223372036854775807L);
        l4 = l1;
        if (i != 0) {
          l4 = b(localArrayList, l1, l2, j, l3);
        }
        if (l3 != -9223372036854775807L) {
          l1 = l3;
        } else {
          l1 = l4;
        }
        l3 = X(paramXmlPullParser, "d", -9223372036854775807L);
        k = U(paramXmlPullParser, "r", 0);
        m = 1;
        l4 = l1;
      }
      else
      {
        w(paramXmlPullParser);
        k = j;
        l3 = l2;
        l4 = l1;
        m = i;
      }
      i = m;
      l1 = l4;
      l2 = l3;
      j = k;
    } while (!N.d(paramXmlPullParser, "SegmentTimeline"));
    if (m != 0) {
      b(localArrayList, l4, l3, k, M.W0(paramLong2, paramLong1, 1000L));
    }
    return localArrayList;
  }
  
  public k.e n(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    return new k.e(parami, paramLong1, paramLong2, paramLong3, paramLong4);
  }
  
  public i n0(XmlPullParser paramXmlPullParser)
  {
    return d0(paramXmlPullParser, "media", "mediaRange");
  }
  
  public o o(String paramString1, String paramString2)
  {
    return new o(paramString1, paramString2);
  }
  
  public int o0(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    if ((!paramString.equals("forced_subtitle")) && (!paramString.equals("forced-subtitle"))) {
      return 0;
    }
    return 2;
  }
  
  public int p0(List paramList)
  {
    int i = 0;
    int k;
    for (int j = 0; i < paramList.size(); j = k)
    {
      e locale = (e)paramList.get(i);
      k = j;
      if (W2.c.a("urn:mpeg:dash:role:2011", a)) {
        k = j | o0(b);
      }
      i++;
    }
    return j;
  }
  
  public l q0(XmlPullParser paramXmlPullParser)
  {
    long l1 = -9223372036854775807L;
    long l2 = l1;
    long l3 = l2;
    float f1 = -3.4028235E38F;
    float f2 = f1;
    for (;;)
    {
      paramXmlPullParser.next();
      long l4;
      long l5;
      long l6;
      if (N.f(paramXmlPullParser, "Latency"))
      {
        l4 = X(paramXmlPullParser, "target", -9223372036854775807L);
        l5 = X(paramXmlPullParser, "min", -9223372036854775807L);
        l6 = X(paramXmlPullParser, "max", -9223372036854775807L);
      }
      for (;;)
      {
        break;
        l4 = l1;
        l5 = l2;
        l6 = l3;
        if (N.f(paramXmlPullParser, "PlaybackRate"))
        {
          f1 = R(paramXmlPullParser, "min", -3.4028235E38F);
          f2 = R(paramXmlPullParser, "max", -3.4028235E38F);
          l4 = l1;
          l5 = l2;
          l6 = l3;
        }
      }
      if (N.d(paramXmlPullParser, "ServiceDescription")) {
        return new l(l4, l5, l6, f1, f2);
      }
      l1 = l4;
      l2 = l5;
      l3 = l6;
    }
  }
  
  public Pair t0(List paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      Object localObject = (e)paramList.get(i);
      if ((W2.c.a("http://dashif.org/thumbnail_tile", a)) || (W2.c.a("http://dashif.org/guidelines/thumbnail_tile", a)))
      {
        localObject = b;
        if (localObject != null)
        {
          localObject = M.b1((String)localObject, "x");
          if (localObject.length != 2) {}
        }
      }
      try
      {
        localObject = Pair.create(Integer.valueOf(Integer.parseInt(localObject[0])), Integer.valueOf(Integer.parseInt(localObject[1])));
        return (Pair)localObject;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
    }
    return null;
  }
  
  public int u0(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    case 53: 
    default: 
      break;
    case 54: 
      if (paramString.equals("6")) {
        j = 4;
      }
      break;
    case 52: 
      if (paramString.equals("4")) {
        j = 3;
      }
      break;
    case 51: 
      if (paramString.equals("3")) {
        j = 2;
      }
      break;
    case 50: 
      if (paramString.equals("2")) {
        j = 1;
      }
      break;
    case 49: 
      if (paramString.equals("1")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return 0;
    case 4: 
      return 1;
    case 3: 
      return 8;
    case 2: 
      return 4;
    case 1: 
      return 2048;
    }
    return 512;
  }
  
  public final boolean v(String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++) {
      if (paramArrayOfString[j].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
        return true;
      }
    }
    return false;
  }
  
  public n v0(XmlPullParser paramXmlPullParser, String paramString, n paramn)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      return n.b(paramXmlPullParser);
    }
    return paramn;
  }
  
  public o w0(XmlPullParser paramXmlPullParser)
  {
    return o(paramXmlPullParser.getAttributeValue(null, "schemeIdUri"), paramXmlPullParser.getAttributeValue(null, "value"));
  }
  
  public c x(Uri paramUri, InputStream paramInputStream)
  {
    try
    {
      XmlPullParser localXmlPullParser = a.newPullParser();
      localXmlPullParser.setInput(paramInputStream, null);
      if ((localXmlPullParser.next() == 2) && ("MPD".equals(localXmlPullParser.getName()))) {
        return Y(localXmlPullParser, paramUri);
      }
    }
    catch (XmlPullParserException paramUri)
    {
      break label60;
      throw A.c("inputStream does not contain a valid media presentation description", null);
      label60:
      throw A.c(null, paramUri);
    }
  }
  
  public a y(XmlPullParser paramXmlPullParser, List paramList, k paramk, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, boolean paramBoolean)
  {
    Object localObject1 = paramXmlPullParser;
    long l1 = X((XmlPullParser)localObject1, "id", -1L);
    int i = G(paramXmlPullParser);
    String str1 = ((XmlPullParser)localObject1).getAttributeValue(null, "mimeType");
    String str2 = ((XmlPullParser)localObject1).getAttributeValue(null, "codecs");
    int j = U((XmlPullParser)localObject1, "width", -1);
    int k = U((XmlPullParser)localObject1, "height", -1);
    float f = S((XmlPullParser)localObject1, -1.0F);
    int m = U((XmlPullParser)localObject1, "audioSamplingRate", -1);
    String str3 = "lang";
    Object localObject2 = ((XmlPullParser)localObject1).getAttributeValue(null, "lang");
    String str4 = ((XmlPullParser)localObject1).getAttributeValue(null, "label");
    Object localObject3 = new ArrayList();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject4 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    ArrayList localArrayList5 = new ArrayList();
    ArrayList localArrayList6 = new ArrayList();
    ArrayList localArrayList7 = new ArrayList();
    int n = -1;
    String str5 = null;
    int i1 = 0;
    Object localObject5 = paramk;
    paramk = (k)localObject4;
    for (;;)
    {
      localObject4 = this;
      paramXmlPullParser.next();
      long l2;
      if (N.f((XmlPullParser)localObject1, "BaseURL"))
      {
        l2 = paramLong2;
        int i2 = i1;
        if (i1 == 0)
        {
          l2 = ((d)localObject4).B((XmlPullParser)localObject1, paramLong2);
          i2 = 1;
        }
        localArrayList7.addAll(((d)localObject4).C((XmlPullParser)localObject1, paramList, paramBoolean));
        paramLong2 = l2;
        i1 = i2;
      }
      for (;;)
      {
        break;
        Object localObject6;
        if (N.f((XmlPullParser)localObject1, "ContentProtection"))
        {
          localObject4 = F(paramXmlPullParser);
          localObject6 = first;
          if (localObject6 != null) {
            str5 = (String)localObject6;
          }
          localObject4 = second;
          if (localObject4 != null) {
            localArrayList1.add((m.b)localObject4);
          }
        }
        else if (N.f((XmlPullParser)localObject1, "ContentComponent"))
        {
          localObject2 = q((String)localObject2, ((XmlPullParser)localObject1).getAttributeValue(null, str3));
          i = p(i, G(paramXmlPullParser));
        }
        else
        {
          if (N.f((XmlPullParser)localObject1, "Role")) {
            localArrayList3.add(I((XmlPullParser)localObject1, "Role"));
          }
          for (;;)
          {
            break;
            if (N.f((XmlPullParser)localObject1, "AudioChannelConfiguration"))
            {
              n = A(paramXmlPullParser);
              break;
            }
            if (N.f((XmlPullParser)localObject1, "Accessibility"))
            {
              localArrayList2.add(I((XmlPullParser)localObject1, "Accessibility"));
            }
            else if (N.f((XmlPullParser)localObject1, "EssentialProperty"))
            {
              localArrayList4.add(I((XmlPullParser)localObject1, "EssentialProperty"));
            }
            else if (N.f((XmlPullParser)localObject1, "SupplementalProperty"))
            {
              localArrayList5.add(I((XmlPullParser)localObject1, "SupplementalProperty"));
            }
            else if (N.f((XmlPullParser)localObject1, "Representation"))
            {
              if (!localArrayList7.isEmpty()) {
                localObject1 = localArrayList7;
              } else {
                localObject1 = paramList;
              }
              localObject1 = e0(paramXmlPullParser, (List)localObject1, str1, str2, j, k, f, n, m, (String)localObject2, localArrayList3, localArrayList2, localArrayList4, localArrayList5, (k)localObject5, paramLong4, paramLong1, paramLong2, paramLong3, paramLong5, paramBoolean);
              i = p(i, z.k(a.n));
              localArrayList6.add(localObject1);
              localObject1 = paramXmlPullParser;
            }
            else
            {
              localObject6 = paramk;
              localObject4 = localObject2;
              localObject1 = localObject3;
              l2 = paramLong2;
              if (N.f(paramXmlPullParser, "SegmentBase"))
              {
                localObject5 = j0(paramXmlPullParser, (k.e)localObject5);
                paramLong2 = l2;
                paramk = (k)localObject6;
                localObject3 = localObject1;
                localObject1 = paramXmlPullParser;
                localObject2 = localObject4;
              }
              else
              {
                if (N.f(paramXmlPullParser, "SegmentList")) {
                  paramLong3 = B(paramXmlPullParser, paramLong3);
                }
                for (localObject5 = k0(paramXmlPullParser, (k.b)localObject5, paramLong4, paramLong1, l2, paramLong3, paramLong5);; localObject5 = l0(paramXmlPullParser, (k.c)localObject5, localArrayList5, paramLong4, paramLong1, l2, paramLong3, paramLong5))
                {
                  break;
                  if (!N.f(paramXmlPullParser, "SegmentTemplate")) {
                    break label790;
                  }
                  paramLong3 = B(paramXmlPullParser, paramLong3);
                }
                label790:
                localObject4 = paramXmlPullParser;
                if (N.f((XmlPullParser)localObject4, "InbandEventStream"))
                {
                  ((ArrayList)localObject6).add(I((XmlPullParser)localObject4, "InbandEventStream"));
                  localObject1 = localObject4;
                }
                else if (N.f((XmlPullParser)localObject4, "Label"))
                {
                  ((List)localObject1).add(V(paramXmlPullParser));
                  localObject1 = localObject4;
                }
                else
                {
                  localObject1 = localObject4;
                  if (N.e(paramXmlPullParser))
                  {
                    z(paramXmlPullParser);
                    localObject1 = localObject4;
                  }
                }
              }
            }
          }
        }
      }
      if (N.d((XmlPullParser)localObject1, "AdaptationSet"))
      {
        paramXmlPullParser = new ArrayList(localArrayList6.size());
        for (i1 = 0; i1 < localArrayList6.size(); i1++) {
          paramXmlPullParser.add(j((a)localArrayList6.get(i1), str4, (List)localObject3, str5, localArrayList1, paramk));
        }
        return c(l1, i, paramXmlPullParser, localArrayList2, localArrayList4, localArrayList5);
      }
    }
  }
  
  public void z(XmlPullParser paramXmlPullParser)
  {
    w(paramXmlPullParser);
  }
  
  public static final class a
  {
    public final q a;
    public final v b;
    public final k c;
    public final String d;
    public final ArrayList e;
    public final ArrayList f;
    public final long g;
    public final List h;
    public final List i;
    
    public a(q paramq, List paramList1, k paramk, String paramString, ArrayList paramArrayList1, ArrayList paramArrayList2, List paramList2, List paramList3, long paramLong)
    {
      a = paramq;
      b = v.U(paramList1);
      c = paramk;
      d = paramString;
      e = paramArrayList1;
      f = paramArrayList2;
      h = paramList2;
      i = paramList3;
      g = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     o0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */