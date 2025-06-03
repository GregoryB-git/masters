package d5;

import a4.d.b;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.h.a;
import o7.c0;
import o7.l0;
import o7.t;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p2.m0;
import t5.f0.a;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.d0;
import v5.e0;
import v5.p;

public final class d
  extends DefaultHandler
  implements f0.a<c>
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
  
  public static long b(ArrayList paramArrayList, long paramLong1, long paramLong2, int paramInt, long paramLong3)
  {
    if (paramInt >= 0)
    {
      paramInt++;
    }
    else
    {
      paramInt = e0.a;
      paramInt = (int)((paramLong3 - paramLong1 + paramLong2 - 1L) / paramLong2);
    }
    for (int i = 0; i < paramInt; i++)
    {
      paramArrayList.add(new k.d(paramLong1, paramLong2));
      paramLong1 += paramLong2;
    }
    return paramLong1;
  }
  
  public static void c(XmlPullParser paramXmlPullParser)
  {
    if (!m0.U(paramXmlPullParser)) {
      return;
    }
    int i = 1;
    while (i != 0)
    {
      paramXmlPullParser.next();
      if (m0.U(paramXmlPullParser))
      {
        i++;
      }
      else
      {
        int j;
        if (paramXmlPullParser.getEventType() == 3) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0) {
          i--;
        }
      }
    }
  }
  
  public static int d(XmlPullParser paramXmlPullParser)
  {
    String str = paramXmlPullParser.getAttributeValue(null, "schemeIdUri");
    Object localObject = str;
    if (str == null) {
      localObject = null;
    }
    localObject.getClass();
    int i = ((String)localObject).hashCode();
    int j = 6;
    int k = -1;
    int m = 0;
    switch (i)
    {
    default: 
      break;
    case 2036691300: 
      if (((String)localObject).equals("urn:dolby:dash:audio_channel_configuration:2011")) {
        i = 6;
      }
      break;
    case 312179081: 
      if (((String)localObject).equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
        i = 5;
      }
      break;
    case -79006963: 
      if (((String)localObject).equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
        i = 4;
      }
      break;
    case -986633423: 
      if (((String)localObject).equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
        i = 3;
      }
      break;
    case -1138141449: 
      if (((String)localObject).equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
        i = 2;
      }
      break;
    case -1352850286: 
      if (((String)localObject).equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
        i = 1;
      }
      break;
    case -2128649360: 
      if (((String)localObject).equals("urn:dts:dash:audio_channel_configuration:2012")) {
        i = 0;
      }
      break;
    }
    i = -1;
    switch (i)
    {
    default: 
      i = k;
      break;
    case 5: 
      localObject = paramXmlPullParser.getAttributeValue(null, "value");
      if (localObject == null)
      {
        i = k;
      }
      else
      {
        j = Integer.bitCount(Integer.parseInt((String)localObject, 16));
        i = j;
        if (j == 0) {
          i = k;
        }
      }
      break;
    }
    for (;;)
    {
      break;
      j = l(paramXmlPullParser, "value", -1);
      i = k;
      if (j < 0) {
        break;
      }
      localObject = e;
      i = k;
      if (j >= localObject.length) {
        break;
      }
      i = localObject[j];
      break;
      localObject = paramXmlPullParser.getAttributeValue(null, "value");
      if (localObject != null)
      {
        localObject = x6.b.x0((String)localObject);
        localObject.getClass();
        switch (((String)localObject).hashCode())
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
                k = -1;
                break;
              } while (!((String)localObject).equals("fa01"));
              k = 3;
              break;
            } while (!((String)localObject).equals("f801"));
            k = 2;
            break;
          } while (!((String)localObject).equals("a000"));
          k = 1;
          break;
          k = m;
        } while (!((String)localObject).equals("4000"));
        i = j;
      }
      switch (k)
      {
      default: 
        i = -1;
        break;
      case 3: 
        i = 8;
        break;
      case 1: 
        i = 2;
        break;
      case 0: 
        i = 1;
      }
      break;
      i = l(paramXmlPullParser, "value", -1);
      break;
      j = l(paramXmlPullParser, "value", -1);
      i = k;
      if (j <= 0) {
        break;
      }
      i = k;
      if (j >= 33) {
        break;
      }
      i = j;
    }
    do
    {
      paramXmlPullParser.next();
    } while (!m0.T(paramXmlPullParser, "AudioChannelConfiguration"));
    return i;
  }
  
  public static long e(XmlPullParser paramXmlPullParser, long paramLong)
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
  
  public static ArrayList f(XmlPullParser paramXmlPullParser, List paramList, boolean paramBoolean)
  {
    Object localObject1 = paramXmlPullParser.getAttributeValue(null, "dvb:priority");
    int i;
    if (localObject1 != null) {
      i = Integer.parseInt((String)localObject1);
    } else if (paramBoolean) {
      i = 1;
    } else {
      i = Integer.MIN_VALUE;
    }
    localObject1 = paramXmlPullParser.getAttributeValue(null, "dvb:weight");
    int j;
    if (localObject1 != null) {
      j = Integer.parseInt((String)localObject1);
    } else {
      j = 1;
    }
    String str = paramXmlPullParser.getAttributeValue(null, "serviceLocation");
    Object localObject2 = "";
    do
    {
      paramXmlPullParser.next();
      if (paramXmlPullParser.getEventType() == 4)
      {
        localObject1 = paramXmlPullParser.getText();
      }
      else
      {
        c(paramXmlPullParser);
        localObject1 = localObject2;
      }
      localObject2 = localObject1;
    } while (!m0.T(paramXmlPullParser, "BaseURL"));
    int k = 0;
    if ((localObject1 != null) && (d0.a(localObject1)[0] != -1)) {
      m = 1;
    } else {
      m = 0;
    }
    if (m != 0)
    {
      paramXmlPullParser = str;
      if (str == null) {
        paramXmlPullParser = (XmlPullParser)localObject1;
      }
      return c0.c(new b[] { new b((String)localObject1, paramXmlPullParser, i, j) });
    }
    ArrayList localArrayList = new ArrayList();
    int m = k;
    k = i;
    while (m < paramList.size())
    {
      b localb = (b)paramList.get(m);
      localObject2 = d0.c(a, (String)localObject1);
      if (str == null) {
        paramXmlPullParser = (XmlPullParser)localObject2;
      } else {
        paramXmlPullParser = str;
      }
      i = j;
      if (paramBoolean)
      {
        k = c;
        i = d;
        paramXmlPullParser = b;
      }
      localArrayList.add(new b((String)localObject2, paramXmlPullParser, k, i));
      m++;
      j = i;
    }
    return localArrayList;
  }
  
  public static Pair g(XmlPullParser paramXmlPullParser)
  {
    Object localObject1 = null;
    Object localObject2 = paramXmlPullParser.getAttributeValue(null, "schemeIdUri");
    int i;
    label267:
    Object localObject5;
    if (localObject2 != null)
    {
      localObject2 = x6.b.x0((String)localObject2);
      localObject2.getClass();
      switch (((String)localObject2).hashCode())
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
              i = -1;
              break;
            } while (!((String)localObject2).equals("urn:mpeg:dash:mp4protection:2011"));
            i = 3;
            break;
          } while (!((String)localObject2).equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"));
          i = 2;
          break;
        } while (!((String)localObject2).equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"));
        i = 1;
        break;
      } while (!((String)localObject2).equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"));
      i = 0;
      switch (i)
      {
      default: 
        break;
      case 3: 
        localObject3 = paramXmlPullParser.getAttributeValue(null, "value");
        int j = paramXmlPullParser.getAttributeCount();
        for (i = 0; i < j; i++)
        {
          localObject2 = paramXmlPullParser.getAttributeName(i);
          int k = ((String)localObject2).indexOf(':');
          if (k != -1) {
            localObject2 = ((String)localObject2).substring(k + 1);
          }
          if (((String)localObject2).equals("default_KID"))
          {
            localObject4 = paramXmlPullParser.getAttributeValue(i);
            break label267;
          }
        }
        localObject4 = null;
        localObject2 = localObject3;
        if (TextUtils.isEmpty((CharSequence)localObject4)) {
          break label382;
        }
        localObject2 = localObject3;
        if ("00000000-0000-0000-0000-000000000000".equals(localObject4)) {
          break label382;
        }
        localObject4 = ((String)localObject4).split("\\s+");
        localObject2 = new UUID[localObject4.length];
        for (i = 0; i < localObject4.length; i++) {
          localObject2[i] = UUID.fromString(localObject4[i]);
        }
        localObject5 = v3.h.b;
        localObject6 = k4.h.a((UUID)localObject5, (UUID[])localObject2, null);
        localObject4 = null;
        break;
      case 2: 
        localObject2 = v3.h.d;
        break;
      case 1: 
        localObject2 = v3.h.e;
        break;
      case 0: 
        localObject2 = v3.h.c;
      }
      localObject5 = localObject2;
      localObject2 = null;
    }
    else
    {
      localObject2 = null;
      label382:
      localObject5 = null;
    }
    Object localObject6 = null;
    Object localObject4 = localObject6;
    Object localObject3 = localObject2;
    Object localObject7;
    Object localObject8;
    label531:
    label699:
    do
    {
      paramXmlPullParser.next();
      if ((m0.V(paramXmlPullParser, "clearkey:Laurl")) && (paramXmlPullParser.next() == 4))
      {
        localObject7 = paramXmlPullParser.getText();
        localObject8 = localObject5;
        localObject2 = localObject6;
      }
      else if (m0.V(paramXmlPullParser, "ms:laurl"))
      {
        localObject7 = paramXmlPullParser.getAttributeValue(null, "licenseUrl");
        localObject8 = localObject5;
        localObject2 = localObject6;
      }
      else
      {
        if (localObject6 == null)
        {
          if (m0.U(paramXmlPullParser))
          {
            localObject2 = paramXmlPullParser.getName();
            i = ((String)localObject2).indexOf(':');
            if (i != -1) {
              localObject2 = ((String)localObject2).substring(i + 1);
            }
            if (((String)localObject2).equals("pssh"))
            {
              i = 1;
              break label531;
            }
          }
          i = 0;
          if ((i != 0) && (paramXmlPullParser.next() == 4))
          {
            localObject5 = Base64.decode(paramXmlPullParser.getText(), 0);
            localObject2 = k4.h.b((byte[])localObject5);
            if (localObject2 == null) {
              localObject2 = null;
            } else {
              localObject2 = a;
            }
            if (localObject2 == null)
            {
              v5.m.f("MpdParser", "Skipping malformed cenc:pssh data");
              localObject5 = null;
              localObject8 = localObject2;
              localObject2 = localObject5;
              localObject7 = localObject4;
              break label699;
            }
            localObject8 = localObject2;
            localObject2 = localObject5;
            localObject7 = localObject4;
            break label699;
          }
        }
        if (localObject6 == null)
        {
          localObject2 = v3.h.e;
          if ((((UUID)localObject2).equals(localObject5)) && (m0.V(paramXmlPullParser, "mspr:pro")) && (paramXmlPullParser.next() == 4))
          {
            localObject2 = k4.h.a((UUID)localObject2, null, Base64.decode(paramXmlPullParser.getText(), 0));
            localObject8 = localObject5;
            localObject7 = localObject4;
            break label699;
          }
        }
        c(paramXmlPullParser);
        localObject7 = localObject4;
        localObject2 = localObject6;
        localObject8 = localObject5;
      }
      localObject5 = localObject8;
      localObject6 = localObject2;
      localObject4 = localObject7;
    } while (!m0.T(paramXmlPullParser, "ContentProtection"));
    paramXmlPullParser = (XmlPullParser)localObject1;
    if (localObject8 != null) {
      paramXmlPullParser = new d.b((UUID)localObject8, (String)localObject7, "video/mp4", (byte[])localObject2);
    }
    return Pair.create(localObject3, paramXmlPullParser);
  }
  
  public static int h(XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "contentType");
    if (!TextUtils.isEmpty(paramXmlPullParser))
    {
      if ("audio".equals(paramXmlPullParser)) {
        return 1;
      }
      if ("video".equals(paramXmlPullParser)) {
        return 2;
      }
      if ("text".equals(paramXmlPullParser)) {
        return 3;
      }
      if ("image".equals(paramXmlPullParser)) {
        return 4;
      }
    }
    int i = -1;
    return i;
  }
  
  public static e i(XmlPullParser paramXmlPullParser, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = paramXmlPullParser.getAttributeValue(null, "schemeIdUri");
    Object localObject3 = localObject2;
    if (localObject2 == null) {
      localObject3 = "";
    }
    String str = paramXmlPullParser.getAttributeValue(null, "value");
    localObject2 = str;
    if (str == null) {
      localObject2 = null;
    }
    str = paramXmlPullParser.getAttributeValue(null, "id");
    if (str != null) {
      localObject1 = str;
    }
    do
    {
      paramXmlPullParser.next();
    } while (!m0.T(paramXmlPullParser, paramString));
    return new e((String)localObject3, (String)localObject2, (String)localObject1);
  }
  
  public static long j(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
  {
    paramString = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramString == null) {
      return paramLong;
    }
    paramXmlPullParser = e0.h.matcher(paramString);
    if (paramXmlPullParser.matches())
    {
      boolean bool = TextUtils.isEmpty(paramXmlPullParser.group(1));
      paramString = paramXmlPullParser.group(3);
      double d1 = 0.0D;
      double d2;
      if (paramString != null) {
        d2 = Double.parseDouble(paramString) * 3.1556908E7D;
      } else {
        d2 = 0.0D;
      }
      paramString = paramXmlPullParser.group(5);
      double d3;
      if (paramString != null) {
        d3 = Double.parseDouble(paramString) * 2629739.0D;
      } else {
        d3 = 0.0D;
      }
      paramString = paramXmlPullParser.group(7);
      double d4;
      if (paramString != null) {
        d4 = Double.parseDouble(paramString) * 86400.0D;
      } else {
        d4 = 0.0D;
      }
      paramString = paramXmlPullParser.group(10);
      double d5;
      if (paramString != null) {
        d5 = Double.parseDouble(paramString) * 3600.0D;
      } else {
        d5 = 0.0D;
      }
      paramString = paramXmlPullParser.group(12);
      double d6;
      if (paramString != null) {
        d6 = Double.parseDouble(paramString) * 60.0D;
      } else {
        d6 = 0.0D;
      }
      paramXmlPullParser = paramXmlPullParser.group(14);
      if (paramXmlPullParser != null) {
        d1 = Double.parseDouble(paramXmlPullParser);
      }
      long l = ((d2 + d3 + d4 + d5 + d6 + d1) * 1000.0D);
      paramLong = l;
      if ((true ^ bool)) {
        paramLong = -l;
      }
    }
    else
    {
      paramLong = (Double.parseDouble(paramString) * 3600.0D * 1000.0D);
    }
    return paramLong;
  }
  
  public static float k(XmlPullParser paramXmlPullParser, float paramFloat)
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
  
  public static int l(XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      paramInt = Integer.parseInt(paramXmlPullParser);
    }
    return paramInt;
  }
  
  public static long m(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      paramLong = Long.parseLong(paramXmlPullParser);
    }
    return paramLong;
  }
  
  public static c n(XmlPullParser paramXmlPullParser, Uri paramUri)
  {
    Object localObject1 = paramXmlPullParser;
    Object localObject2 = new String[0];
    Object localObject3 = ((XmlPullParser)localObject1).getAttributeValue(null, "profiles");
    if (localObject3 != null) {
      localObject2 = ((String)localObject3).split(",");
    }
    int i = localObject2.length;
    boolean bool1;
    for (int j = 0;; j++)
    {
      bool1 = true;
      if (j >= i) {
        break;
      }
      if (localObject2[j].startsWith("urn:dvb:dash:profile:dvb-dash:"))
      {
        bool2 = true;
        break label81;
      }
    }
    boolean bool2 = false;
    label81:
    localObject2 = ((XmlPullParser)localObject1).getAttributeValue(null, "availabilityStartTime");
    long l1 = -9223372036854775807L;
    long l2;
    if (localObject2 == null) {
      l2 = -9223372036854775807L;
    } else {
      l2 = e0.L((String)localObject2);
    }
    long l3 = j((XmlPullParser)localObject1, "mediaPresentationDuration", -9223372036854775807L);
    long l4 = j((XmlPullParser)localObject1, "minBufferTime", -9223372036854775807L);
    boolean bool3 = "dynamic".equals(((XmlPullParser)localObject1).getAttributeValue(null, "type"));
    long l5;
    if (bool3) {
      l5 = j((XmlPullParser)localObject1, "minimumUpdatePeriod", -9223372036854775807L);
    } else {
      l5 = -9223372036854775807L;
    }
    long l6;
    if (bool3) {
      l6 = j((XmlPullParser)localObject1, "timeShiftBufferDepth", -9223372036854775807L);
    } else {
      l6 = -9223372036854775807L;
    }
    long l7;
    if (bool3) {
      l7 = j((XmlPullParser)localObject1, "suggestedPresentationDelay", -9223372036854775807L);
    } else {
      l7 = -9223372036854775807L;
    }
    localObject2 = ((XmlPullParser)localObject1).getAttributeValue(null, "publishTime");
    long l8;
    if (localObject2 == null) {
      l8 = -9223372036854775807L;
    } else {
      l8 = e0.L((String)localObject2);
    }
    long l9;
    if (bool3) {
      l9 = 0L;
    } else {
      l9 = -9223372036854775807L;
    }
    localObject1 = paramUri.toString();
    localObject2 = paramUri.toString();
    if (bool2) {
      j = 1;
    } else {
      j = Integer.MIN_VALUE;
    }
    ArrayList localArrayList1 = c0.c(new b[] { new b((String)localObject1, (String)localObject2, j, 1) });
    localObject1 = new ArrayList();
    localObject2 = new ArrayList();
    if (!bool3) {
      l1 = 0L;
    }
    boolean bool4 = false;
    int k = bool4;
    h localh = null;
    Object localObject4 = localh;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    long l10 = l1;
    for (;;)
    {
      localObject3 = paramXmlPullParser;
      Object localObject7 = null;
      paramXmlPullParser.next();
      Object localObject8 = "BaseURL";
      boolean bool5;
      Object localObject9;
      Object localObject10;
      Object localObject11;
      Object localObject12;
      Object localObject14;
      Object localObject15;
      Object localObject16;
      if (m0.V((XmlPullParser)localObject3, "BaseURL"))
      {
        l1 = l9;
        bool5 = bool4;
        if (!bool4)
        {
          l1 = e((XmlPullParser)localObject3, l9);
          bool5 = bool1;
        }
        ((ArrayList)localObject2).addAll(f((XmlPullParser)localObject3, localArrayList1, bool2));
        l9 = l1;
        bool4 = bool5;
      }
      else
      {
        bool5 = m0.V((XmlPullParser)localObject3, "ProgramInformation");
        localObject9 = "lang";
        if (bool5)
        {
          localObject10 = ((XmlPullParser)localObject3).getAttributeValue(null, "moreInformationURL");
          if (localObject10 == null) {
            localObject10 = null;
          }
          localObject11 = ((XmlPullParser)localObject3).getAttributeValue(null, "lang");
          if (localObject11 == null) {
            localObject11 = null;
          }
          localObject12 = null;
          localObject13 = localObject12;
          do
          {
            paramXmlPullParser.next();
            if (m0.V((XmlPullParser)localObject3, "Title"))
            {
              localObject14 = paramXmlPullParser.nextText();
              localObject15 = localObject12;
              localObject16 = localObject13;
            }
            else if (m0.V((XmlPullParser)localObject3, "Source"))
            {
              localObject15 = paramXmlPullParser.nextText();
              localObject14 = localObject7;
              localObject16 = localObject13;
            }
            else if (m0.V((XmlPullParser)localObject3, "Copyright"))
            {
              localObject16 = paramXmlPullParser.nextText();
              localObject15 = localObject12;
              localObject14 = localObject7;
            }
            else
            {
              c(paramXmlPullParser);
              localObject16 = localObject13;
              localObject14 = localObject7;
              localObject15 = localObject12;
            }
            localObject12 = localObject15;
            localObject7 = localObject14;
            localObject13 = localObject16;
          } while (!m0.T((XmlPullParser)localObject3, "ProgramInformation"));
          localh = new h((String)localObject14, (String)localObject15, (String)localObject16, (String)localObject10, (String)localObject11);
        }
        else
        {
          bool5 = m0.V((XmlPullParser)localObject3, "UTCTiming");
          localObject12 = "value";
          if (bool5)
          {
            localObject4 = new n(0, ((XmlPullParser)localObject3).getAttributeValue(null, "schemeIdUri"), ((XmlPullParser)localObject3).getAttributeValue(null, "value"));
          }
          else
          {
            if (!m0.V((XmlPullParser)localObject3, "Location")) {
              break label784;
            }
            localObject5 = d0.d(paramUri.toString(), paramXmlPullParser.nextText());
          }
        }
      }
      l1 = -9223372036854775807L;
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      break label8193;
      label784:
      long l12;
      float f1;
      float f2;
      long l13;
      if (m0.V((XmlPullParser)localObject3, "ServiceDescription"))
      {
        l11 = -9223372036854775807L;
        l1 = -9223372036854775807L;
        l12 = -9223372036854775807L;
        f1 = -3.4028235E38F;
        f2 = -3.4028235E38F;
        l13 = l9;
        l9 = l11;
        for (;;)
        {
          paramXmlPullParser.next();
          if (m0.V((XmlPullParser)localObject3, "Latency"))
          {
            l9 = m((XmlPullParser)localObject3, "target", -9223372036854775807L);
            l1 = m((XmlPullParser)localObject3, "min", -9223372036854775807L);
            l12 = m((XmlPullParser)localObject3, "max", -9223372036854775807L);
          }
          else if (m0.V((XmlPullParser)localObject3, "PlaybackRate"))
          {
            localObject10 = ((XmlPullParser)localObject3).getAttributeValue(null, "min");
            if (localObject10 == null) {
              f1 = -3.4028235E38F;
            } else {
              f1 = Float.parseFloat((String)localObject10);
            }
            localObject10 = ((XmlPullParser)localObject3).getAttributeValue(null, "max");
            if (localObject10 == null) {
              f2 = -3.4028235E38F;
            } else {
              f2 = Float.parseFloat((String)localObject10);
            }
          }
          if (m0.T((XmlPullParser)localObject3, "ServiceDescription"))
          {
            localObject6 = new l(l9, l1, l12, f1, f2);
            l1 = -9223372036854775807L;
            bool1 = true;
            localObject3 = localObject2;
            localObject2 = localObject1;
            localObject1 = localObject3;
            l9 = l13;
            break;
          }
        }
      }
      long l11 = l9;
      Object localObject13 = "Period";
      if ((m0.V((XmlPullParser)localObject3, "Period")) && (k == 0))
      {
        if (!((ArrayList)localObject2).isEmpty()) {
          localObject10 = localObject2;
        } else {
          localObject10 = localArrayList1;
        }
        Object localObject17 = "id";
        String str1 = ((XmlPullParser)localObject3).getAttributeValue(null, "id");
        long l14 = j((XmlPullParser)localObject3, "start", l10);
        localObject14 = "schemeIdUri";
        long l15;
        if (l2 != -9223372036854775807L) {
          l15 = l2 + l14;
        } else {
          l15 = -9223372036854775807L;
        }
        long l16 = j((XmlPullParser)localObject3, "duration", -9223372036854775807L);
        localObject11 = "duration";
        Object localObject18 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        ArrayList localArrayList3 = new ArrayList();
        int m = 0;
        Object localObject19 = null;
        l1 = -9223372036854775807L;
        l13 = l11;
        localObject15 = localObject1;
        localObject7 = localObject2;
        localObject2 = localObject12;
        localObject1 = localObject14;
        for (;;)
        {
          paramXmlPullParser.next();
          Object localObject21;
          if (m0.V((XmlPullParser)localObject3, (String)localObject8))
          {
            l9 = l13;
            j = m;
            if (m == 0)
            {
              l9 = e((XmlPullParser)localObject3, l13);
              j = 1;
            }
            localArrayList3.addAll(f((XmlPullParser)localObject3, (List)localObject10, bool2));
            bool1 = true;
            localObject14 = localObject11;
            localObject20 = localObject15;
            localObject12 = localObject18;
            localObject21 = localObject3;
            localObject3 = localObject13;
            l13 = l9;
            localObject11 = localObject2;
            localObject13 = localObject17;
            localObject15 = localObject1;
            localObject16 = localObject19;
            localObject2 = localObject20;
            localObject1 = localObject7;
            l9 = l10;
          }
          else
          {
            bool1 = m0.V((XmlPullParser)localObject3, "AdaptationSet");
            Object localObject22 = "SegmentTemplate";
            Object localObject23;
            Object localObject26;
            Object localObject35;
            Object localObject39;
            long l17;
            label2023:
            label2242:
            label2245:
            label2275:
            long l18;
            long l19;
            if (bool1)
            {
              bool1 = localArrayList3.isEmpty();
              localObject21 = "AdaptationSet";
              if (!bool1) {
                localObject12 = localArrayList3;
              } else {
                localObject12 = localObject10;
              }
              int n = l((XmlPullParser)localObject3, (String)localObject17, -1);
              j = h(paramXmlPullParser);
              localObject23 = "mimeType";
              String str2 = ((XmlPullParser)localObject3).getAttributeValue(null, "mimeType");
              l9 = l10;
              Object localObject24 = "codecs";
              String str3 = ((XmlPullParser)localObject3).getAttributeValue(null, "codecs");
              Object localObject25 = localObject13;
              int i1 = l((XmlPullParser)localObject3, "width", -1);
              localObject20 = localObject10;
              i = l((XmlPullParser)localObject3, "height", -1);
              f1 = k((XmlPullParser)localObject3, -1.0F);
              localObject26 = localObject2;
              localObject14 = "SegmentList";
              int i2 = l((XmlPullParser)localObject3, "audioSamplingRate", -1);
              localObject16 = "SegmentBase";
              localObject2 = ((XmlPullParser)localObject3).getAttributeValue(null, (String)localObject9);
              Object localObject27 = "audioSamplingRate";
              localObject13 = ((XmlPullParser)localObject3).getAttributeValue(null, "label");
              ArrayList localArrayList4 = new ArrayList();
              localObject28 = new ArrayList();
              Object localObject29 = new ArrayList();
              Object localObject30 = new ArrayList();
              Object localObject31 = new ArrayList();
              Object localObject32 = new ArrayList();
              localObject10 = new ArrayList();
              Object localObject33 = new ArrayList();
              int i3 = -1;
              int i4 = 0;
              Object localObject34 = null;
              localObject35 = "height";
              l10 = l1;
              Object localObject36 = localObject19;
              l12 = l13;
              Object localObject37 = "width";
              Object localObject38 = paramXmlPullParser;
              localObject3 = localObject14;
              localObject39 = localObject1;
              localObject14 = localObject7;
              Object localObject40 = localObject12;
              localObject12 = localObject31;
              localObject7 = localObject24;
              localObject24 = localObject9;
              localObject1 = localObject30;
              localObject9 = localObject33;
              for (;;)
              {
                paramXmlPullParser.next();
                if (m0.V((XmlPullParser)localObject38, (String)localObject8))
                {
                  l17 = l12;
                  i5 = i4;
                  if (i4 == 0)
                  {
                    l17 = e((XmlPullParser)localObject38, l12);
                    i5 = 1;
                  }
                  ((ArrayList)localObject9).addAll(f((XmlPullParser)localObject38, (List)localObject40, bool2));
                  l12 = l17;
                  i4 = i5;
                }
                else
                {
                  if (m0.V((XmlPullParser)localObject38, "ContentProtection"))
                  {
                    localObject33 = g(paramXmlPullParser);
                    localObject30 = first;
                    if (localObject30 != null) {
                      localObject34 = (String)localObject30;
                    }
                    localObject31 = second;
                    localObject33 = localObject2;
                    i5 = j;
                    i6 = i3;
                    localObject30 = localObject34;
                    if (localObject31 != null)
                    {
                      localArrayList4.add((d.b)localObject31);
                      localObject30 = localObject34;
                      i6 = i3;
                      i5 = j;
                      localObject33 = localObject2;
                    }
                  }
                  for (;;)
                  {
                    localObject2 = localObject33;
                    j = i5;
                    i3 = i6;
                    localObject34 = localObject30;
                    break label2023;
                    l17 = l12;
                    if (!m0.V((XmlPullParser)localObject38, "ContentComponent")) {
                      break;
                    }
                    localObject33 = ((XmlPullParser)localObject38).getAttributeValue(null, (String)localObject24);
                    if (localObject2 == null) {
                      localObject2 = localObject33;
                    } else if (localObject33 != null) {
                      x6.b.H(((String)localObject2).equals(localObject33));
                    }
                    i5 = h(paramXmlPullParser);
                    if (j == -1)
                    {
                      localObject33 = localObject2;
                      i6 = i3;
                      localObject30 = localObject34;
                    }
                    else if (i5 == -1)
                    {
                      localObject33 = localObject2;
                      i5 = j;
                      i6 = i3;
                      localObject30 = localObject34;
                    }
                    else
                    {
                      if (j == i5) {
                        bool1 = true;
                      } else {
                        bool1 = false;
                      }
                      x6.b.H(bool1);
                      localObject33 = localObject2;
                      i5 = j;
                      i6 = i3;
                      localObject30 = localObject34;
                    }
                  }
                  if (m0.V((XmlPullParser)localObject38, "Role")) {
                    ((ArrayList)localObject1).add(i((XmlPullParser)localObject38, "Role"));
                  }
                }
                String str4;
                for (;;)
                {
                  break label2242;
                  str4 = "AudioChannelConfiguration";
                  if (m0.V((XmlPullParser)localObject38, "AudioChannelConfiguration"))
                  {
                    i6 = d(paramXmlPullParser);
                    localObject33 = localObject2;
                    i5 = j;
                    localObject30 = localObject34;
                    break;
                    localObject30 = localObject17;
                    localObject41 = localObject8;
                    bool5 = true;
                    localObject17 = localObject22;
                    localObject8 = localObject21;
                    localObject31 = localObject25;
                    localObject42 = localObject39;
                    localObject43 = localObject26;
                    localObject39 = localObject28;
                    localObject21 = localObject32;
                    localObject22 = localObject7;
                    bool1 = bool2;
                    localObject44 = localObject15;
                    localObject15 = localObject20;
                    localObject26 = localObject16;
                    localObject7 = localObject27;
                    localObject28 = localObject29;
                    localObject33 = localObject14;
                    bool2 = bool5;
                    localObject16 = localObject13;
                    localObject25 = localObject8;
                    localObject20 = localObject39;
                    localObject39 = localObject2;
                    localObject32 = localObject3;
                    localObject13 = localObject44;
                    localObject27 = localObject23;
                    localObject23 = localObject37;
                    localObject37 = localObject1;
                    localObject29 = localObject35;
                    localObject8 = localObject12;
                    f2 = f1;
                    localObject14 = localObject15;
                    localObject35 = localObject7;
                    localObject12 = localObject33;
                    i5 = i;
                    localObject33 = localObject36;
                    localObject2 = localObject10;
                    localObject7 = localObject41;
                    localObject10 = localObject42;
                    localObject15 = localObject43;
                    localObject3 = localObject30;
                    localObject1 = localObject31;
                    break label5859;
                  }
                  if (m0.V((XmlPullParser)localObject38, "Accessibility"))
                  {
                    ((ArrayList)localObject29).add(i((XmlPullParser)localObject38, "Accessibility"));
                  }
                  else
                  {
                    if (!m0.V((XmlPullParser)localObject38, "EssentialProperty")) {
                      break label2245;
                    }
                    ((ArrayList)localObject12).add(i((XmlPullParser)localObject38, "EssentialProperty"));
                  }
                }
                break label2275;
                localObject33 = "EssentialProperty";
                if (m0.V((XmlPullParser)localObject38, "SupplementalProperty"))
                {
                  ((ArrayList)localObject32).add(i((XmlPullParser)localObject38, "SupplementalProperty"));
                }
                else
                {
                  localObject43 = "SupplementalProperty";
                  localObject30 = localObject29;
                  Object localObject45 = localObject32;
                  bool1 = m0.V((XmlPullParser)localObject38, "Representation");
                  Object localObject46 = "Representation";
                  if (bool1)
                  {
                    if (!((ArrayList)localObject9).isEmpty()) {
                      localObject41 = localObject9;
                    } else {
                      localObject41 = localObject40;
                    }
                    String str5 = "ContentProtection";
                    localObject42 = "InbandEventStream";
                    String str6 = ((XmlPullParser)localObject38).getAttributeValue(null, (String)localObject17);
                    localObject47 = localObject1;
                    int i7 = l((XmlPullParser)localObject38, "bandwidth", -1);
                    localObject29 = ((XmlPullParser)localObject38).getAttributeValue(null, (String)localObject23);
                    if (localObject29 == null) {
                      localObject29 = str2;
                    }
                    localObject32 = ((XmlPullParser)localObject38).getAttributeValue(null, (String)localObject7);
                    if (localObject32 == null) {
                      localObject32 = str3;
                    }
                    localObject31 = localObject2;
                    int i8 = l((XmlPullParser)localObject38, (String)localObject37, i1);
                    int i9 = i1;
                    localObject48 = localObject37;
                    int i10 = l((XmlPullParser)localObject38, (String)localObject35, i);
                    f2 = k((XmlPullParser)localObject38, f1);
                    int i11 = l((XmlPullParser)localObject38, (String)localObject27, i2);
                    i5 = i2;
                    localObject49 = new ArrayList();
                    localObject50 = new ArrayList();
                    localObject51 = new ArrayList((Collection)localObject12);
                    localObject52 = new ArrayList((Collection)localObject45);
                    localObject44 = new ArrayList();
                    i6 = 0;
                    localObject2 = null;
                    i2 = i;
                    i = i3;
                    l18 = l10;
                    localObject1 = localObject36;
                    l12 = l17;
                    localObject37 = localObject35;
                    i1 = j;
                    j = i6;
                    localObject35 = localObject30;
                    localObject53 = localObject10;
                    localObject54 = localObject23;
                    localObject55 = localObject28;
                    localObject30 = localObject31;
                    localObject56 = localObject3;
                    localObject28 = localObject26;
                    localObject57 = localObject39;
                    localObject23 = localObject20;
                    localObject58 = localObject25;
                    l19 = l9;
                    localObject20 = localObject14;
                    localObject31 = localObject21;
                    localObject21 = localObject22;
                    localObject26 = localObject44;
                    localObject25 = localObject12;
                    localObject22 = localObject8;
                    localObject44 = localObject38;
                    localObject59 = localObject7;
                    localObject14 = localObject17;
                    localObject3 = localObject45;
                    localObject7 = str4;
                    l9 = l18;
                    for (;;)
                    {
                      paramXmlPullParser.next();
                      if (m0.V((XmlPullParser)localObject44, (String)localObject22))
                      {
                        l18 = l12;
                        i6 = j;
                        if (j == 0)
                        {
                          l18 = e((XmlPullParser)localObject44, l12);
                          i6 = 1;
                        }
                        ((ArrayList)localObject26).addAll(f((XmlPullParser)localObject44, (List)localObject41, bool2));
                        l12 = l18;
                        j = i6;
                      }
                      else
                      {
                        localObject12 = localObject3;
                        if (!m0.V((XmlPullParser)localObject44, (String)localObject7)) {
                          break label2739;
                        }
                        i = d(paramXmlPullParser);
                      }
                      break label2763;
                      label2739:
                      localObject10 = localObject16;
                      if (m0.V((XmlPullParser)localObject44, (String)localObject10))
                      {
                        localObject1 = r((XmlPullParser)localObject44, (k.e)localObject1);
                        label2763:
                        localObject10 = localObject7;
                        l18 = l9;
                        localObject7 = localObject2;
                        i6 = i;
                        localObject2 = localObject10;
                        l9 = l12;
                        localObject10 = localObject1;
                        localObject1 = localObject16;
                      }
                      else
                      {
                        if (m0.V((XmlPullParser)localObject44, (String)localObject56))
                        {
                          l18 = e((XmlPullParser)localObject44, l9);
                          localObject10 = s(paramXmlPullParser, (k.b)localObject1, l15, l16, l12, l18, l6);
                        }
                        else
                        {
                          localObject10 = localObject44;
                          if (!m0.V((XmlPullParser)localObject10, (String)localObject21)) {
                            break label2897;
                          }
                          l18 = e((XmlPullParser)localObject10, l9);
                          localObject10 = t(paramXmlPullParser, (k.c)localObject1, (List)localObject12, l15, l16, l12, l18, l6);
                        }
                        localObject12 = localObject2;
                        label2897:
                        do
                        {
                          l9 = l18;
                          localObject2 = localObject12;
                          localObject1 = localObject10;
                          break;
                          if (!m0.V((XmlPullParser)localObject10, str5)) {
                            break label2967;
                          }
                          localObject10 = g(paramXmlPullParser);
                          localObject12 = first;
                          if (localObject12 != null) {
                            localObject2 = (String)localObject12;
                          }
                          localObject8 = second;
                          l18 = l9;
                          localObject12 = localObject2;
                          localObject10 = localObject1;
                        } while (localObject8 == null);
                        ((ArrayList)localObject49).add((d.b)localObject8);
                        break label2994;
                        label2967:
                        localObject12 = localObject42;
                        if (m0.V((XmlPullParser)localObject10, (String)localObject12))
                        {
                          ((ArrayList)localObject50).add(i((XmlPullParser)localObject10, (String)localObject12));
                        }
                        else
                        {
                          label2994:
                          localObject12 = localObject33;
                          if (!m0.V((XmlPullParser)localObject10, (String)localObject12)) {
                            break label3034;
                          }
                          ((ArrayList)localObject51).add(i((XmlPullParser)localObject10, (String)localObject12));
                        }
                        l18 = l9;
                        localObject10 = localObject1;
                        break label3082;
                        label3034:
                        localObject12 = localObject43;
                        if (m0.V((XmlPullParser)localObject10, (String)localObject12))
                        {
                          ((ArrayList)localObject52).add(i((XmlPullParser)localObject10, (String)localObject12));
                          l18 = l9;
                          localObject10 = localObject1;
                        }
                        else
                        {
                          c(paramXmlPullParser);
                          localObject10 = localObject1;
                          l18 = l9;
                        }
                        label3082:
                        localObject1 = localObject16;
                        l9 = l12;
                        localObject12 = localObject2;
                        localObject2 = localObject7;
                        i6 = i;
                        localObject7 = localObject12;
                      }
                      localObject39 = localObject56;
                      localObject16 = localObject21;
                      localObject12 = localObject58;
                      localObject21 = localObject55;
                      localObject8 = localObject57;
                      localObject17 = localObject22;
                      localObject22 = localObject53;
                      bool1 = bool2;
                      localObject38 = localObject25;
                      i = i9;
                      localObject53 = localObject26;
                      localObject25 = localObject48;
                      localObject26 = localObject54;
                      localObject54 = localObject15;
                      localObject15 = localObject50;
                      if (m0.T((XmlPullParser)localObject44, (String)localObject46))
                      {
                        bool2 = p.k((String)localObject29);
                        localObject44 = "image";
                        if (bool2)
                        {
                          localObject2 = p.b((String)localObject32);
                        }
                        else
                        {
                          if (!p.m((String)localObject29)) {
                            break label3216;
                          }
                          localObject2 = p.j((String)localObject32);
                        }
                        break label3288;
                        label3216:
                        if ((p.l((String)localObject29)) || ("image".equals(p.h((String)localObject29))))
                        {
                          localObject2 = localObject29;
                        }
                        else if ("application/mp4".equals(localObject29))
                        {
                          localObject33 = p.e((String)localObject32);
                          localObject2 = localObject33;
                          if ("text/vtt".equals(localObject33)) {
                            localObject2 = "application/x-mp4-vtt";
                          }
                        }
                        else
                        {
                          localObject2 = null;
                        }
                        label3288:
                        localObject33 = "audio/eac3";
                        bool2 = "audio/eac3".equals(localObject2);
                        localObject42 = "ec+3";
                        if (bool2)
                        {
                          j = 0;
                          localObject2 = localObject33;
                          while (j < ((ArrayList)localObject52).size())
                          {
                            localObject33 = (e)((ArrayList)localObject52).get(j);
                            localObject43 = a;
                            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(localObject43)) {
                              if ("JOC".equals(b)) {
                                break label3400;
                              }
                            }
                            if (("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(localObject43)) && ("ec+3".equals(b)))
                            {
                              label3400:
                              localObject2 = "audio/eac3-joc";
                              break;
                            }
                            j++;
                          }
                          localObject43 = localObject15;
                          localObject15 = localObject2;
                          localObject33 = localObject43;
                          if ("audio/eac3-joc".equals(localObject2))
                          {
                            localObject15 = localObject2;
                            localObject32 = localObject42;
                            localObject33 = localObject43;
                          }
                        }
                        else
                        {
                          localObject33 = localObject15;
                          localObject15 = localObject2;
                        }
                        j = 0;
                        i9 = 0;
                        localObject2 = localObject47;
                        for (;;)
                        {
                          i12 = ((ArrayList)localObject2).size();
                          localObject42 = "urn:mpeg:dash:role:2011";
                          if (j >= i12) {
                            break;
                          }
                          localObject43 = (e)((ArrayList)localObject2).get(j);
                          i12 = i9;
                          if (x6.b.R("urn:mpeg:dash:role:2011", a))
                          {
                            localObject43 = b;
                            if ((localObject43 == null) || ((!((String)localObject43).equals("forced_subtitle")) && (!((String)localObject43).equals("forced-subtitle")))) {
                              i12 = 0;
                            } else {
                              i12 = 2;
                            }
                            i12 = i9 | i12;
                          }
                          j++;
                          i9 = i12;
                        }
                        int i13 = 0;
                        for (int i12 = 0; i13 < ((ArrayList)localObject2).size(); i12 = j)
                        {
                          localObject43 = (e)((ArrayList)localObject2).get(i13);
                          j = i12;
                          if (x6.b.R("urn:mpeg:dash:role:2011", a)) {
                            j = i12 | p(b);
                          }
                          ???++;
                        }
                        int i14 = 0;
                        i13 = 0;
                        localObject43 = localObject44;
                        while (i14 < ((ArrayList)localObject35).size())
                        {
                          localObject44 = (e)((ArrayList)localObject35).get(i14);
                          if (x6.b.R((String)localObject42, a))
                          {
                            j = p(b) | i13;
                          }
                          else
                          {
                            j = i13;
                            if (x6.b.R("urn:tva:metadata:cs:AudioPurposeCS:2007", a))
                            {
                              localObject44 = b;
                              if (localObject44 != null)
                              {
                                switch (((String)localObject44).hashCode())
                                {
                                case 53: 
                                default: 
                                  break;
                                case 54: 
                                  if (((String)localObject44).equals("6")) {
                                    j = 4;
                                  }
                                  break;
                                case 52: 
                                  if (((String)localObject44).equals("4")) {
                                    j = 3;
                                  }
                                  break;
                                case 51: 
                                  if (((String)localObject44).equals("3")) {
                                    j = 2;
                                  }
                                  break;
                                case 50: 
                                  if (((String)localObject44).equals("2")) {
                                    j = 1;
                                  }
                                  break;
                                case 49: 
                                  if (((String)localObject44).equals("1")) {
                                    j = 0;
                                  }
                                  break;
                                }
                                j = -1;
                                if (j == 0) {
                                  break label3948;
                                }
                                if (j == 1) {
                                  break label3940;
                                }
                                if (j == 2) {
                                  break label3934;
                                }
                                if (j == 3) {
                                  break label3927;
                                }
                                if (j == 4) {}
                              }
                              else
                              {
                                j = 0;
                                break label3953;
                              }
                              j = 1;
                              break label3953;
                              label3927:
                              j = 8;
                              break label3953;
                              label3934:
                              j = 4;
                              break label3953;
                              label3940:
                              j = 2048;
                              break label3953;
                              label3948:
                              j = 512;
                              label3953:
                              j |= i13;
                            }
                          }
                          ???++;
                          i13 = j;
                        }
                        i14 = q((ArrayList)localObject51);
                        int i15 = q((ArrayList)localObject52);
                        for (j = 0; j < ((ArrayList)localObject51).size(); j++)
                        {
                          localObject42 = (e)((ArrayList)localObject51).get(j);
                          if ((x6.b.R("http://dashif.org/thumbnail_tile", a)) || (x6.b.R("http://dashif.org/guidelines/thumbnail_tile", a)))
                          {
                            localObject42 = b;
                            if (localObject42 != null)
                            {
                              int i16 = e0.a;
                              localObject42 = ((String)localObject42).split("x", -1);
                              if (localObject42.length != 2) {}
                            }
                          }
                          try
                          {
                            localObject42 = Pair.create(Integer.valueOf(Integer.parseInt(localObject42[0])), Integer.valueOf(Integer.parseInt(localObject42[1])));
                          }
                          catch (NumberFormatException localNumberFormatException)
                          {
                            for (;;) {}
                          }
                        }
                        localObject42 = null;
                        bool5 = false;
                        localObject44 = new i0.a();
                        a = str6;
                        j = ((String)localObject29);
                        k = ((String)localObject15);
                        h = ((String)localObject32);
                        g = i7;
                        d = i9;
                        e = (i12 | i13 | i14 | i15);
                        c = ((String)localObject30);
                        if (localObject42 != null) {
                          j = ((Integer)first).intValue();
                        } else {
                          j = -1;
                        }
                        D = j;
                        if (localObject42 != null) {
                          j = ((Integer)second).intValue();
                        } else {
                          j = -1;
                        }
                        E = j;
                        if (p.m((String)localObject15))
                        {
                          p = i8;
                          q = i10;
                          r = f2;
                        }
                        else
                        {
                          if (!p.k((String)localObject15)) {
                            break label4311;
                          }
                          x = i6;
                          y = i11;
                        }
                        bool2 = true;
                        break label4628;
                        label4311:
                        if (p.l((String)localObject15))
                        {
                          if ("application/cea-608".equals(localObject15)) {
                            for (j = 0; j < ((ArrayList)localObject35).size(); j++)
                            {
                              localObject15 = (e)((ArrayList)localObject35).get(j);
                              if ("urn:scte:dash:cc:cea-608:2015".equals(a))
                              {
                                localObject29 = b;
                                if (localObject29 != null)
                                {
                                  localObject29 = c.matcher((CharSequence)localObject29);
                                  if (((Matcher)localObject29).matches())
                                  {
                                    j = Integer.parseInt(((Matcher)localObject29).group(1));
                                    bool2 = true;
                                    break label4588;
                                  }
                                  localObject29 = f.l("Unable to parse CEA-608 channel number from: ");
                                  ((StringBuilder)localObject29).append(b);
                                  v5.m.f("MpdParser", ((StringBuilder)localObject29).toString());
                                }
                              }
                            }
                          }
                          if ("application/cea-708".equals(localObject15)) {
                            for (j = 0; j < ((ArrayList)localObject35).size(); j++)
                            {
                              localObject15 = (e)((ArrayList)localObject35).get(j);
                              if ("urn:scte:dash:cc:cea-708:2015".equals(a))
                              {
                                localObject29 = b;
                                if (localObject29 != null)
                                {
                                  localObject29 = d.matcher((CharSequence)localObject29);
                                  if (((Matcher)localObject29).matches())
                                  {
                                    j = Integer.parseInt(((Matcher)localObject29).group(1));
                                    break label4585;
                                  }
                                  localObject29 = f.l("Unable to parse CEA-708 service block number from: ");
                                  ((StringBuilder)localObject29).append(b);
                                  v5.m.f("MpdParser", ((StringBuilder)localObject29).toString());
                                }
                              }
                            }
                          }
                          j = -1;
                          label4585:
                          bool2 = true;
                          label4588:
                          C = j;
                        }
                        else
                        {
                          if (((String)localObject43).equals(p.h((String)localObject15)))
                          {
                            p = i8;
                            q = i10;
                          }
                          bool2 = true;
                        }
                        label4628:
                        localObject15 = new i0((i0.a)localObject44);
                        if (localObject10 == null) {
                          localObject10 = new k.e();
                        }
                        if (!((ArrayList)localObject53).isEmpty()) {
                          localObject41 = localObject53;
                        }
                        localObject10 = new a((i0)localObject15, (List)localObject41, (k)localObject10, (String)localObject7, (ArrayList)localObject49, (ArrayList)localObject33, (ArrayList)localObject51, (ArrayList)localObject52);
                        j = p.i(t);
                        if (i1 != -1) {
                          for (;;)
                          {
                            if (j != -1)
                            {
                              if (i1 == j) {
                                bool5 = bool2;
                              }
                              x6.b.H(bool5);
                            }
                            j = i1;
                          }
                        }
                        ((ArrayList)localObject22).add(localObject10);
                        localObject15 = localObject22;
                        bool5 = bool2;
                        localObject29 = localObject1;
                        localObject44 = localObject39;
                        localObject51 = localObject30;
                        localObject22 = localObject59;
                        localObject30 = localObject26;
                        localObject26 = localObject2;
                        i6 = i;
                        localObject41 = localObject37;
                        localObject43 = localObject31;
                        localObject42 = localObject38;
                        localObject39 = localObject35;
                        localObject35 = localObject27;
                        i = i2;
                        bool2 = bool1;
                        localObject32 = localObject3;
                        localObject7 = localObject8;
                        localObject10 = localObject28;
                        localObject3 = localObject14;
                        localObject1 = localObject12;
                        localObject2 = localObject16;
                        break;
                      }
                      localObject44 = paramXmlPullParser;
                      localObject50 = localObject15;
                      localObject45 = localObject43;
                      localObject15 = localObject54;
                      localObject43 = localObject38;
                      localObject38 = localObject7;
                      localObject7 = localObject2;
                      l12 = l9;
                      localObject55 = localObject21;
                      localObject48 = localObject25;
                      bool2 = bool1;
                      localObject2 = localObject22;
                      localObject54 = localObject26;
                      l9 = l18;
                      localObject22 = localObject17;
                      localObject25 = localObject43;
                      localObject26 = localObject53;
                      localObject21 = localObject16;
                      localObject58 = localObject12;
                      localObject57 = localObject8;
                      localObject56 = localObject39;
                      localObject16 = localObject1;
                      localObject53 = localObject2;
                      localObject43 = localObject45;
                      i9 = i;
                      localObject2 = localObject38;
                      localObject1 = localObject10;
                      i = i6;
                    }
                  }
                  Object localObject57 = localObject17;
                  localObject54 = localObject8;
                  Object localObject58 = localObject22;
                  l19 = l9;
                  Object localObject55 = localObject25;
                  Object localObject52 = localObject39;
                  Object localObject53 = localObject26;
                  localObject31 = localObject37;
                  Object localObject48 = localObject28;
                  f2 = f1;
                  localObject32 = localObject45;
                  localObject42 = localObject12;
                  localObject38 = localObject15;
                  localObject43 = localObject21;
                  i6 = i1;
                  localObject44 = localObject20;
                  localObject49 = localObject27;
                  i5 = i2;
                  localObject41 = localObject35;
                  localObject29 = localObject30;
                  localObject33 = localObject7;
                  localObject50 = localObject14;
                  localObject30 = localObject23;
                  localObject51 = localObject2;
                  bool1 = bool2;
                  localObject46 = paramXmlPullParser;
                  localObject59 = localObject16;
                  if (m0.V((XmlPullParser)localObject46, (String)localObject59))
                  {
                    localObject36 = r((XmlPullParser)localObject46, (k.e)localObject36);
                  }
                  else
                  {
                    if (!m0.V((XmlPullParser)localObject46, (String)localObject3)) {
                      break label5272;
                    }
                    l10 = e((XmlPullParser)localObject46, l10);
                    localObject36 = s(paramXmlPullParser, (k.b)localObject36, l15, l16, l17, l10, l6);
                  }
                  localObject15 = localObject10;
                  localObject26 = localObject1;
                  localObject12 = localObject3;
                  bool5 = true;
                  localObject2 = localObject58;
                  localObject1 = localObject55;
                  localObject3 = localObject57;
                  localObject10 = localObject53;
                  localObject21 = localObject48;
                  localObject7 = localObject52;
                  localObject17 = localObject54;
                  bool2 = bool1;
                  localObject20 = localObject50;
                  localObject35 = localObject49;
                  localObject39 = localObject29;
                  localObject23 = localObject44;
                  f1 = f2;
                  localObject25 = localObject31;
                  localObject22 = localObject33;
                  localObject54 = localObject38;
                  localObject44 = localObject12;
                  localObject29 = localObject59;
                  localObject14 = localObject51;
                  localObject33 = localObject29;
                  localObject38 = localObject54;
                  localObject27 = localObject30;
                  localObject31 = localObject25;
                  localObject37 = localObject26;
                  i2 = i6;
                  localObject8 = localObject42;
                  f2 = f1;
                  localObject29 = localObject23;
                  localObject28 = localObject39;
                  localObject50 = localObject20;
                  i1 = i;
                  localObject12 = localObject36;
                  l12 = l17;
                  localObject54 = localObject17;
                  break label5412;
                  label5272:
                  Object localObject47 = localObject10;
                  Object localObject56 = localObject3;
                  localObject45 = localObject1;
                  if (m0.V((XmlPullParser)localObject46, (String)localObject58))
                  {
                    l10 = e((XmlPullParser)localObject46, l10);
                    localObject1 = (k.c)localObject36;
                    localObject2 = localObject58;
                    localObject14 = localObject51;
                    localObject12 = t(paramXmlPullParser, (k.c)localObject1, (List)localObject32, l15, l16, l17, l10, l6);
                    bool5 = true;
                    localObject1 = localObject55;
                    localObject3 = localObject57;
                    localObject10 = localObject53;
                    localObject21 = localObject48;
                    localObject7 = localObject52;
                    l12 = l17;
                    localObject15 = localObject47;
                    bool2 = bool1;
                    i1 = i;
                    localObject35 = localObject49;
                    localObject28 = localObject29;
                    localObject29 = localObject44;
                    localObject8 = localObject42;
                    i2 = i6;
                    localObject37 = localObject45;
                    localObject27 = localObject30;
                    localObject22 = localObject33;
                    localObject33 = localObject59;
                    localObject44 = localObject56;
                    label5412:
                    localObject16 = paramXmlPullParser;
                    localObject20 = localObject21;
                    localObject39 = localObject44;
                    localObject26 = localObject33;
                    i = i5;
                    localObject25 = localObject38;
                    localObject23 = localObject31;
                    localObject36 = localObject41;
                    localObject17 = localObject14;
                    localObject21 = localObject32;
                    localObject14 = localObject15;
                    l9 = l19;
                    break label5773;
                  }
                  if (m0.V((XmlPullParser)localObject46, "InbandEventStream"))
                  {
                    ((ArrayList)localObject48).add(i((XmlPullParser)localObject46, "InbandEventStream"));
                    localObject38 = localObject13;
                  }
                  else if (m0.V((XmlPullParser)localObject46, "Label"))
                  {
                    localObject38 = "";
                    do
                    {
                      paramXmlPullParser.next();
                      if (paramXmlPullParser.getEventType() == 4)
                      {
                        localObject13 = paramXmlPullParser.getText();
                      }
                      else
                      {
                        c(paramXmlPullParser);
                        localObject13 = localObject38;
                      }
                      localObject38 = localObject13;
                    } while (!m0.T((XmlPullParser)localObject46, "Label"));
                    localObject38 = localObject13;
                  }
                  else
                  {
                    localObject38 = localObject13;
                    if (m0.U(paramXmlPullParser))
                    {
                      c(paramXmlPullParser);
                      localObject38 = localObject13;
                    }
                  }
                  localObject13 = localObject38;
                  localObject38 = localObject46;
                }
                Object localObject59 = localObject22;
                Object localObject42 = localObject25;
                Object localObject41 = localObject17;
                Object localObject49 = localObject26;
                Object localObject51 = localObject39;
                Object localObject54 = localObject8;
                Object localObject44 = localObject10;
                localObject17 = localObject2;
                Object localObject50 = localObject14;
                localObject31 = localObject27;
                localObject33 = localObject20;
                localObject8 = localObject12;
                Object localObject43 = localObject21;
                localObject25 = localObject35;
                int i6 = i1;
                localObject26 = localObject1;
                localObject39 = localObject37;
                localObject27 = localObject23;
                localObject22 = localObject7;
                localObject30 = localObject15;
                int i5 = i2;
                localObject15 = localObject3;
                localObject20 = localObject28;
                bool5 = true;
                localObject2 = localObject59;
                localObject1 = localObject42;
                localObject3 = localObject41;
                localObject10 = localObject49;
                localObject7 = localObject51;
                localObject14 = localObject44;
                localObject21 = localObject32;
                localObject12 = localObject36;
                i1 = i;
                localObject35 = localObject31;
                localObject28 = localObject29;
                localObject29 = localObject33;
                f2 = f1;
                localObject36 = localObject25;
                i2 = i6;
                localObject37 = localObject26;
                localObject23 = localObject39;
                localObject25 = localObject30;
                i = i5;
                localObject26 = localObject16;
                localObject39 = localObject15;
                localObject16 = localObject38;
                label5773:
                localObject30 = localObject13;
                localObject31 = localObject17;
                localObject17 = localObject2;
                localObject15 = localObject10;
                localObject10 = localObject7;
                localObject7 = localObject54;
                localObject2 = localObject14;
                localObject33 = localObject12;
                bool1 = bool2;
                i5 = i1;
                localObject12 = localObject50;
                localObject14 = localObject29;
                localObject29 = localObject36;
                i1 = i2;
                localObject13 = localObject25;
                i2 = i;
                localObject32 = localObject39;
                localObject38 = localObject16;
                localObject39 = localObject31;
                localObject25 = localObject43;
                localObject16 = localObject30;
                bool2 = bool5;
                label5859:
                if (m0.T((XmlPullParser)localObject38, (String)localObject25))
                {
                  localObject26 = new ArrayList(((ArrayList)localObject2).size());
                  i = 0;
                  localObject17 = localObject2;
                  localObject2 = localObject16;
                  while (i < ((ArrayList)localObject17).size())
                  {
                    localObject16 = localObject17;
                    localObject25 = (a)((ArrayList)localObject16).get(i);
                    localObject17 = a;
                    localObject17.getClass();
                    localObject22 = new i0.a((i0)localObject17);
                    if (localObject2 != null) {
                      b = ((String)localObject2);
                    }
                    localObject17 = d;
                    localObject35 = localObject17;
                    if (localObject17 == null) {
                      localObject35 = localObject34;
                    }
                    localObject27 = e;
                    ((ArrayList)localObject27).addAll(localArrayList4);
                    if (!((ArrayList)localObject27).isEmpty())
                    {
                      for (i2 = 0; i2 < ((ArrayList)localObject27).size(); i2++)
                      {
                        localObject17 = (d.b)((ArrayList)localObject27).get(i2);
                        if (v3.h.c.equals(b))
                        {
                          localObject23 = c;
                          if (localObject23 != null)
                          {
                            ((ArrayList)localObject27).remove(i2);
                            break label6065;
                          }
                        }
                      }
                      localObject23 = null;
                      label6065:
                      if (localObject23 == null)
                      {
                        localObject17 = localObject16;
                        localObject39 = localObject2;
                        localObject2 = localObject39;
                        localObject16 = localObject17;
                      }
                      else
                      {
                        for (i2 = 0;; i2++)
                        {
                          localObject39 = localObject2;
                          localObject17 = localObject16;
                          if (i2 >= ((ArrayList)localObject27).size()) {
                            break;
                          }
                          localObject17 = (d.b)((ArrayList)localObject27).get(i2);
                          if ((v3.h.b.equals(b)) && (c == null)) {
                            ((ArrayList)localObject27).set(i2, new d.b(v3.h.c, (String)localObject23, d, e));
                          }
                        }
                      }
                      i1 = ((ArrayList)localObject27).size();
                      do
                      {
                        i3 = i1 - 1;
                        if (i3 < 0) {
                          break;
                        }
                        localObject39 = (d.b)((ArrayList)localObject27).get(i3);
                        if (e != null) {
                          bool5 = bool2;
                        } else {
                          bool5 = false;
                        }
                        i1 = i3;
                      } while (bool5);
                      for (i2 = 0;; i2++)
                      {
                        i1 = i3;
                        if (i2 >= ((ArrayList)localObject27).size()) {
                          break;
                        }
                        localObject17 = (d.b)((ArrayList)localObject27).get(i2);
                        if (e != null) {
                          bool5 = bool2;
                        } else {
                          bool5 = false;
                        }
                        if (bool5)
                        {
                          if (e != null) {
                            bool5 = bool2;
                          } else {
                            bool5 = false;
                          }
                          if ((!bool5) && (((d.b)localObject17).a(b)))
                          {
                            bool5 = bool2;
                            break label6335;
                          }
                        }
                        bool5 = false;
                        label6335:
                        if (bool5)
                        {
                          ((ArrayList)localObject27).remove(i3);
                          i1 = i3;
                          break;
                        }
                      }
                      n = new a4.d((String)localObject35, (ArrayList)localObject27);
                    }
                    localObject17 = f;
                    ((ArrayList)localObject17).addAll((Collection)localObject20);
                    l10 = g;
                    localObject39 = new i0((i0.a)localObject22);
                    localObject22 = b;
                    localObject35 = c;
                    localObject23 = h;
                    localObject25 = i;
                    if ((localObject35 instanceof k.e))
                    {
                      localObject17 = new j.b(l10, (i0)localObject39, (t)localObject22, (k.e)localObject35, (ArrayList)localObject17, (List)localObject23, (List)localObject25);
                    }
                    else
                    {
                      if (!(localObject35 instanceof k.a)) {
                        break label6530;
                      }
                      localObject17 = new j.a(l10, (i0)localObject39, (t)localObject22, (k.a)localObject35, (ArrayList)localObject17, (List)localObject23, (List)localObject25);
                    }
                    ((ArrayList)localObject26).add(localObject17);
                    i++;
                    localObject17 = localObject16;
                    continue;
                    label6530:
                    throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                  }
                  ((ArrayList)localObject18).add(new a(n, j, (ArrayList)localObject26, (List)localObject28, (List)localObject8, (List)localObject21));
                  localObject20 = paramXmlPullParser;
                  localObject2 = localObject11;
                  localObject16 = localObject15;
                  bool5 = bool2;
                  localObject15 = localObject20;
                  localObject11 = localObject18;
                  bool2 = bool1;
                  localObject9 = localObject24;
                  localObject8 = localObject7;
                  localObject28 = localObject10;
                  localObject20 = localObject3;
                  break;
                }
                localObject30 = localObject32;
                localObject36 = localObject16;
                localObject44 = localObject37;
                localObject41 = localObject8;
                f1 = f2;
                localObject16 = localObject14;
                localObject14 = localObject12;
                localObject32 = localObject21;
                localObject8 = localObject7;
                localObject37 = localObject10;
                localObject10 = localObject15;
                localObject7 = localObject3;
                localObject3 = localObject1;
                localObject21 = localObject25;
                localObject43 = localObject26;
                localObject15 = localObject13;
                localObject13 = localObject23;
                localObject31 = localObject28;
                localObject28 = localObject35;
                bool2 = bool1;
                localObject35 = localObject2;
                localObject26 = localObject17;
                localObject42 = localObject20;
                localObject1 = localObject44;
                localObject17 = localObject7;
                localObject2 = localObject39;
                localObject7 = localObject22;
                localObject23 = localObject27;
                localObject12 = localObject41;
                localObject22 = localObject26;
                localObject25 = localObject3;
                localObject20 = localObject16;
                localObject39 = localObject37;
                localObject26 = localObject10;
                localObject3 = localObject30;
                localObject16 = localObject43;
                localObject37 = localObject13;
                localObject27 = localObject28;
                localObject28 = localObject42;
                localObject13 = localObject36;
                i = i5;
                localObject10 = localObject35;
                localObject35 = localObject29;
                localObject29 = localObject31;
                localObject36 = localObject33;
              }
            }
            localObject12 = localObject18;
            if (m0.V((XmlPullParser)localObject3, "EventStream"))
            {
              localObject14 = ((XmlPullParser)localObject3).getAttributeValue(null, (String)localObject1);
              localObject21 = localObject14;
              if (localObject14 == null) {
                localObject21 = "";
              }
              localObject14 = ((XmlPullParser)localObject3).getAttributeValue(null, (String)localObject2);
              localObject39 = localObject14;
              if (localObject14 == null) {
                localObject39 = "";
              }
              l9 = m((XmlPullParser)localObject3, "timescale", 1L);
              l12 = 0L;
              l17 = m((XmlPullParser)localObject3, "presentationTimeOffset", 0L);
              localObject35 = new ArrayList();
              localObject23 = new ByteArrayOutputStream(512);
              localObject20 = localObject17;
              localObject14 = localObject2;
              localObject16 = localObject1;
              for (;;)
              {
                paramXmlPullParser.next();
                localObject17 = "Event";
                if (m0.V((XmlPullParser)localObject3, "Event"))
                {
                  localObject1 = localObject20;
                  l12 = m((XmlPullParser)localObject3, (String)localObject1, l12);
                  localObject2 = localObject11;
                  l19 = m((XmlPullParser)localObject3, (String)localObject2, -9223372036854775807L);
                  l18 = m((XmlPullParser)localObject3, "presentationTime", 0L);
                  l19 = e0.O(l19, 1000L, l9);
                  l18 = e0.O(l18 - l17, 1000000L, l9);
                  localObject11 = ((XmlPullParser)localObject3).getAttributeValue(null, "messageData");
                  localObject28 = localObject11;
                  if (localObject11 == null) {
                    localObject28 = null;
                  }
                  ((ByteArrayOutputStream)localObject23).reset();
                  localObject26 = Xml.newSerializer();
                  ((XmlSerializer)localObject26).setOutput((OutputStream)localObject23, n7.d.c.name());
                  for (;;)
                  {
                    paramXmlPullParser.nextToken();
                    if (m0.T((XmlPullParser)localObject3, (String)localObject17)) {
                      break;
                    }
                    switch (paramXmlPullParser.getEventType())
                    {
                    default: 
                      break;
                    case 10: 
                      ((XmlSerializer)localObject26).docdecl(paramXmlPullParser.getText());
                      break;
                    case 9: 
                      ((XmlSerializer)localObject26).comment(paramXmlPullParser.getText());
                      break;
                    case 8: 
                      ((XmlSerializer)localObject26).processingInstruction(paramXmlPullParser.getText());
                      break;
                    case 7: 
                      ((XmlSerializer)localObject26).ignorableWhitespace(paramXmlPullParser.getText());
                      break;
                    case 6: 
                      ((XmlSerializer)localObject26).entityRef(paramXmlPullParser.getText());
                      break;
                    case 5: 
                      ((XmlSerializer)localObject26).cdsect(paramXmlPullParser.getText());
                      break;
                    case 4: 
                      ((XmlSerializer)localObject26).text(paramXmlPullParser.getText());
                    case 3: 
                      for (;;)
                      {
                        localObject11 = localObject1;
                        localObject1 = localObject2;
                        localObject2 = localObject11;
                        break;
                        ((XmlSerializer)localObject26).endTag(paramXmlPullParser.getNamespace(), paramXmlPullParser.getName());
                      }
                    case 2: 
                      ((XmlSerializer)localObject26).startTag(paramXmlPullParser.getNamespace(), paramXmlPullParser.getName());
                      j = 0;
                      localObject11 = localObject2;
                      localObject20 = localObject1;
                      for (;;)
                      {
                        localObject1 = localObject20;
                        localObject2 = localObject11;
                        if (j >= paramXmlPullParser.getAttributeCount()) {
                          break;
                        }
                        ((XmlSerializer)localObject26).attribute(((XmlPullParser)localObject3).getAttributeNamespace(j), ((XmlPullParser)localObject3).getAttributeName(j), ((XmlPullParser)localObject3).getAttributeValue(j));
                        j++;
                      }
                    case 1: 
                      ((XmlSerializer)localObject26).endDocument();
                      break;
                    case 0: 
                      localObject11 = localObject1;
                      localObject1 = localObject2;
                      ((XmlSerializer)localObject26).startDocument(null, Boolean.FALSE);
                      localObject2 = localObject11;
                      localObject11 = localObject1;
                      localObject1 = localObject2;
                      localObject2 = localObject11;
                    }
                  }
                  ((XmlSerializer)localObject26).flush();
                  localObject11 = ((ByteArrayOutputStream)localObject23).toByteArray();
                  if (localObject28 != null) {
                    localObject11 = e0.B((String)localObject28);
                  }
                  ((ArrayList)localObject35).add(Pair.create(Long.valueOf(l18), new r4.a((String)localObject21, (String)localObject39, l19, l12, (byte[])localObject11)));
                  l12 = 0L;
                  localObject20 = localObject1;
                }
                else
                {
                  localObject2 = localObject11;
                  c(paramXmlPullParser);
                }
                localObject28 = localObject16;
                localObject16 = localObject14;
                localObject11 = localObject12;
                if (m0.T((XmlPullParser)localObject3, "EventStream"))
                {
                  localObject14 = new long[((ArrayList)localObject35).size()];
                  localObject12 = new r4.a[((ArrayList)localObject35).size()];
                  for (j = 0; j < ((ArrayList)localObject35).size(); j++)
                  {
                    localObject1 = (Pair)((ArrayList)localObject35).get(j);
                    localObject14[j] = ((Long)first).longValue();
                    localObject12[j] = ((r4.a)second);
                  }
                  localArrayList2.add(new f((String)localObject21, (String)localObject39, (long[])localObject14, (r4.a[])localObject12));
                  bool5 = true;
                  l9 = l10;
                  localObject1 = localObject13;
                  localObject12 = localObject7;
                  localObject14 = localObject10;
                  localObject13 = localObject15;
                  localObject15 = localObject3;
                  localObject3 = localObject28;
                  bool1 = bool5;
                  localObject21 = localObject15;
                  localObject17 = localObject16;
                  localObject28 = localObject20;
                  localObject15 = localObject3;
                  localObject16 = localObject19;
                  localObject20 = localObject11;
                  localObject3 = localObject2;
                  localObject10 = localObject14;
                  localObject7 = localObject12;
                  break;
                }
                localObject14 = localObject16;
                localObject16 = localObject28;
                localObject12 = localObject11;
                localObject11 = localObject2;
              }
            }
            localObject14 = localObject11;
            localObject11 = localObject17;
            if (m0.V((XmlPullParser)localObject3, "SegmentBase"))
            {
              localObject16 = r((XmlPullParser)localObject3, null);
              bool1 = true;
              localObject20 = localObject2;
              localObject28 = localObject1;
              l9 = l10;
              localObject1 = localObject13;
              localObject2 = localObject15;
              localObject15 = localObject28;
              localObject28 = localObject11;
              localObject11 = localObject20;
              localObject21 = localObject3;
            }
            for (;;)
            {
              localObject3 = localObject1;
              localObject13 = localObject28;
              j = m;
              localObject1 = localObject7;
              break;
              if (m0.V((XmlPullParser)localObject3, "SegmentList"))
              {
                l1 = e((XmlPullParser)localObject3, -9223372036854775807L);
                localObject19 = s(paramXmlPullParser, null, l15, l16, l13, l1, l6);
              }
              else
              {
                localObject16 = localObject3;
                if (m0.V((XmlPullParser)localObject16, (String)localObject22))
                {
                  l1 = e((XmlPullParser)localObject16, -9223372036854775807L);
                  localObject16 = t.b;
                  localObject19 = t(paramXmlPullParser, null, l0.e, l15, l16, l13, l1, l6);
                }
                else if (m0.V((XmlPullParser)localObject16, "AssetIdentifier"))
                {
                  i((XmlPullParser)localObject16, "AssetIdentifier");
                }
                else
                {
                  c(paramXmlPullParser);
                }
              }
              localObject28 = localObject1;
              localObject21 = localObject3;
              bool1 = true;
              l9 = l10;
              localObject1 = localObject13;
              localObject3 = localObject14;
              localObject13 = localObject15;
              localObject20 = localObject12;
              localObject16 = localObject19;
              localObject15 = localObject28;
              localObject28 = localObject11;
              localObject17 = localObject2;
              localObject11 = localObject17;
              localObject12 = localObject20;
              localObject2 = localObject13;
              localObject14 = localObject3;
            }
          }
          if (m0.T((XmlPullParser)localObject21, (String)localObject3))
          {
            localObject3 = Pair.create(new g(str1, l14, (ArrayList)localObject12, localArrayList2), Long.valueOf(l16));
            localObject10 = (g)first;
            if (b == -9223372036854775807L)
            {
              if (bool3)
              {
                k = bool1;
                l10 = l9;
              }
              else
              {
                paramXmlPullParser = f.l("Unable to determine start of period ");
                paramXmlPullParser.append(((ArrayList)localObject2).size());
                throw a1.b(paramXmlPullParser.toString(), null);
              }
            }
            else
            {
              l9 = ((Long)second).longValue();
              if (l9 == -9223372036854775807L) {
                l10 = -9223372036854775807L;
              } else {
                l10 = b + l9;
              }
              ((ArrayList)localObject2).add(localObject10);
            }
            l1 = -9223372036854775807L;
            l13 = l11;
            break;
          }
          localObject7 = localObject3;
          Object localObject20 = localObject11;
          Object localObject28 = localObject15;
          localObject15 = localObject2;
          localObject11 = localObject14;
          localObject14 = localObject1;
          localObject3 = localObject21;
          localObject1 = localObject28;
          localObject2 = localObject20;
          localObject17 = localObject13;
          localObject13 = localObject7;
          l10 = l9;
          localObject7 = localObject14;
          localObject18 = localObject12;
          m = j;
          localObject19 = localObject16;
        }
      }
      localObject3 = localObject2;
      localObject2 = localObject1;
      l1 = -9223372036854775807L;
      c(paramXmlPullParser);
      bool1 = true;
      l9 = l11;
      localObject1 = localObject3;
      label8193:
      if (m0.T(paramXmlPullParser, "MPD"))
      {
        l9 = l3;
        if (l3 == l1) {
          if (l10 != l1) {
            l9 = l10;
          } else if (bool3) {
            l9 = l3;
          } else {
            throw a1.b("Unable to determine duration of static manifest.", null);
          }
        }
        if (!((ArrayList)localObject2).isEmpty()) {
          return new c(l2, l9, l4, bool3, l5, l6, l7, l8, localh, (n)localObject4, (l)localObject6, (Uri)localObject5, (ArrayList)localObject2);
        }
        throw a1.b("No periods found.", null);
      }
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
  }
  
  public static i o(XmlPullParser paramXmlPullParser, String paramString1, String paramString2)
  {
    paramString1 = paramXmlPullParser.getAttributeValue(null, paramString1);
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString2);
    long l2;
    if (paramXmlPullParser != null)
    {
      paramXmlPullParser = paramXmlPullParser.split("-");
      long l1 = Long.parseLong(paramXmlPullParser[0]);
      l2 = l1;
      if (paramXmlPullParser.length == 2)
      {
        l3 = Long.parseLong(paramXmlPullParser[1]) - l1 + 1L;
        l2 = l1;
        break label72;
      }
    }
    else
    {
      l2 = 0L;
    }
    long l3 = -1L;
    label72:
    return new i(l2, l3, paramString1);
  }
  
  public static int p(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    int i = -1;
    switch (paramString.hashCode())
    {
    default: 
      break;
    case 1855372047: 
      if (paramString.equals("supplementary")) {
        i = 12;
      }
      break;
    case 1629013393: 
      if (paramString.equals("emergency")) {
        i = 11;
      }
      break;
    case 899152809: 
      if (paramString.equals("commentary")) {
        i = 10;
      }
      break;
    case 552573414: 
      if (paramString.equals("caption")) {
        i = 9;
      }
      break;
    case 3530173: 
      if (paramString.equals("sign")) {
        i = 8;
      }
      break;
    case 3343801: 
      if (paramString.equals("main")) {
        i = 7;
      }
      break;
    case 99825: 
      if (paramString.equals("dub")) {
        i = 6;
      }
      break;
    case -1396432756: 
      if (paramString.equals("forced-subtitle")) {
        i = 5;
      }
      break;
    case -1408024454: 
      if (paramString.equals("alternate")) {
        i = 4;
      }
      break;
    case -1574842690: 
      if (paramString.equals("forced_subtitle")) {
        i = 3;
      }
      break;
    case -1580883024: 
      if (paramString.equals("enhanced-audio-intelligibility")) {
        i = 2;
      }
      break;
    case -1724546052: 
      if (paramString.equals("description")) {
        i = 1;
      }
      break;
    case -2060497896: 
      if (paramString.equals("subtitle")) {
        i = 0;
      }
      break;
    }
    switch (i)
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
  
  public static int q(ArrayList paramArrayList)
  {
    int i = 0;
    int k;
    for (int j = 0; i < paramArrayList.size(); j = k)
    {
      k = j;
      if (x6.b.R("http://dashif.org/guidelines/trickmode", geta)) {
        k = j | 0x4000;
      }
      i++;
    }
    return j;
  }
  
  public static k.e r(XmlPullParser paramXmlPullParser, k.e parame)
  {
    long l1;
    if (parame != null) {
      l1 = b;
    } else {
      l1 = 1L;
    }
    long l2 = m(paramXmlPullParser, "timescale", l1);
    long l3 = 0L;
    if (parame != null) {
      l1 = c;
    } else {
      l1 = 0L;
    }
    long l4 = m(paramXmlPullParser, "presentationTimeOffset", l1);
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
      if (m0.V(paramXmlPullParser, "Initialization"))
      {
        parame = o(paramXmlPullParser, "sourceURL", "range");
      }
      else
      {
        c(paramXmlPullParser);
        parame = (k.e)localObject1;
      }
      localObject1 = parame;
    } while (!m0.T(paramXmlPullParser, "SegmentBase"));
    return new k.e(parame, l2, l4, l1, l3);
  }
  
  public static k.b s(XmlPullParser paramXmlPullParser, k.b paramb, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    long l1 = 1L;
    if (paramb != null) {
      l2 = b;
    } else {
      l2 = 1L;
    }
    long l3 = m(paramXmlPullParser, "timescale", l2);
    if (paramb != null) {
      l2 = c;
    } else {
      l2 = 0L;
    }
    long l4 = m(paramXmlPullParser, "presentationTimeOffset", l2);
    if (paramb != null) {
      l2 = e;
    } else {
      l2 = -9223372036854775807L;
    }
    long l5 = m(paramXmlPullParser, "duration", l2);
    long l2 = l1;
    if (paramb != null) {
      l2 = d;
    }
    l2 = m(paramXmlPullParser, "startNumber", l2);
    if (paramLong4 != -9223372036854775807L) {
      paramLong3 = paramLong4;
    }
    if (paramLong3 == Long.MAX_VALUE) {
      paramLong3 = -9223372036854775807L;
    }
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    Object localObject4;
    Object localObject5;
    do
    {
      paramXmlPullParser.next();
      if (m0.V(paramXmlPullParser, "Initialization"))
      {
        localObject4 = o(paramXmlPullParser, "sourceURL", "range");
        localObject5 = localObject1;
        localObject6 = localObject3;
      }
      else if (m0.V(paramXmlPullParser, "SegmentTimeline"))
      {
        localObject6 = u(paramXmlPullParser, l3, paramLong2);
        localObject5 = localObject1;
        localObject4 = localObject2;
      }
      else if (m0.V(paramXmlPullParser, "SegmentURL"))
      {
        localObject5 = localObject1;
        if (localObject1 == null) {
          localObject5 = new ArrayList();
        }
        ((List)localObject5).add(o(paramXmlPullParser, "media", "mediaRange"));
        localObject4 = localObject2;
        localObject6 = localObject3;
      }
      else
      {
        c(paramXmlPullParser);
        localObject6 = localObject3;
        localObject4 = localObject2;
        localObject5 = localObject1;
      }
      localObject1 = localObject5;
      localObject2 = localObject4;
      localObject3 = localObject6;
    } while (!m0.T(paramXmlPullParser, "SegmentList"));
    paramXmlPullParser = (XmlPullParser)localObject4;
    localObject1 = localObject6;
    if (paramb != null)
    {
      if (localObject4 == null) {
        localObject4 = a;
      }
      if (localObject6 == null) {
        localObject6 = f;
      }
      if (localObject5 != null)
      {
        paramXmlPullParser = (XmlPullParser)localObject4;
        localObject1 = localObject6;
      }
      else
      {
        paramb = j;
        paramXmlPullParser = (XmlPullParser)localObject4;
        break label392;
      }
    }
    paramb = (k.b)localObject5;
    Object localObject6 = localObject1;
    label392:
    return new k.b(paramXmlPullParser, l3, l4, l2, l5, (List)localObject6, paramLong3, paramb, e0.I(paramLong5), e0.I(paramLong1));
  }
  
  public static k.c t(XmlPullParser paramXmlPullParser, k.c paramc, List paramList, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    long l1 = 1L;
    if (paramc != null) {
      l2 = b;
    } else {
      l2 = 1L;
    }
    long l3 = m(paramXmlPullParser, "timescale", l2);
    if (paramc != null) {
      l2 = c;
    } else {
      l2 = 0L;
    }
    long l4 = m(paramXmlPullParser, "presentationTimeOffset", l2);
    if (paramc != null) {
      l2 = e;
    } else {
      l2 = -9223372036854775807L;
    }
    long l5 = m(paramXmlPullParser, "duration", l2);
    long l2 = l1;
    if (paramc != null) {
      l2 = d;
    }
    l1 = m(paramXmlPullParser, "startNumber", l2);
    Object localObject1;
    for (int i = 0; i < paramList.size(); i++)
    {
      localObject1 = (e)paramList.get(i);
      if (x6.b.R("http://dashif.org/guidelines/last-segment-number", a))
      {
        l2 = Long.parseLong(b);
        break label176;
      }
    }
    l2 = -1L;
    label176:
    if (paramLong4 != -9223372036854775807L) {
      paramLong3 = paramLong4;
    }
    if (paramLong3 == Long.MAX_VALUE) {
      paramLong3 = -9223372036854775807L;
    }
    List localList = null;
    if (paramc != null) {
      paramList = k;
    } else {
      paramList = null;
    }
    m localm1 = v(paramXmlPullParser, "media", paramList);
    if (paramc != null) {
      paramList = j;
    } else {
      paramList = null;
    }
    m localm2 = v(paramXmlPullParser, "initialization", paramList);
    Object localObject2 = null;
    do
    {
      paramXmlPullParser.next();
      if (m0.V(paramXmlPullParser, "Initialization"))
      {
        paramList = o(paramXmlPullParser, "sourceURL", "range");
        localObject1 = localObject2;
      }
      else if (m0.V(paramXmlPullParser, "SegmentTimeline"))
      {
        localObject1 = u(paramXmlPullParser, l3, paramLong2);
        paramList = localList;
      }
      else
      {
        c(paramXmlPullParser);
        localObject1 = localObject2;
        paramList = localList;
      }
      localList = paramList;
      localObject2 = localObject1;
    } while (!m0.T(paramXmlPullParser, "SegmentTemplate"));
    paramXmlPullParser = paramList;
    if (paramc != null)
    {
      if (paramList == null) {
        paramList = a;
      }
      if (localObject1 != null)
      {
        paramXmlPullParser = paramList;
      }
      else
      {
        paramc = f;
        paramXmlPullParser = paramList;
        break label393;
      }
    }
    paramc = (k.c)localObject1;
    label393:
    return new k.c(paramXmlPullParser, l3, l4, l1, l2, l5, paramc, paramLong3, localm2, localm1, e0.I(paramLong5), e0.I(paramLong1));
  }
  
  public static ArrayList u(XmlPullParser paramXmlPullParser, long paramLong1, long paramLong2)
  {
    ArrayList localArrayList = new ArrayList();
    long l1 = 0L;
    int i = 0;
    int j = i;
    long l2 = -9223372036854775807L;
    long l3;
    long l4;
    int k;
    int m;
    do
    {
      paramXmlPullParser.next();
      if (m0.V(paramXmlPullParser, "S"))
      {
        l3 = m(paramXmlPullParser, "t", -9223372036854775807L);
        l4 = l1;
        if (i != 0) {
          l4 = b(localArrayList, l1, l2, j, l3);
        }
        if (l3 != -9223372036854775807L) {
          l1 = l3;
        } else {
          l1 = l4;
        }
        l3 = m(paramXmlPullParser, "d", -9223372036854775807L);
        k = l(paramXmlPullParser, "r", 0);
        m = 1;
        l4 = l1;
      }
      else
      {
        c(paramXmlPullParser);
        k = j;
        l3 = l2;
        l4 = l1;
        m = i;
      }
      i = m;
      l1 = l4;
      l2 = l3;
      j = k;
    } while (!m0.T(paramXmlPullParser, "SegmentTimeline"));
    if (m != 0) {
      b(localArrayList, l4, l3, k, e0.O(paramLong2, paramLong1, 1000L));
    }
    return localArrayList;
  }
  
  public static m v(XmlPullParser paramXmlPullParser, String paramString, m paramm)
  {
    String str = paramXmlPullParser.getAttributeValue(null, paramString);
    if (str != null)
    {
      String[] arrayOfString1 = new String[5];
      int[] arrayOfInt = new int[4];
      String[] arrayOfString2 = new String[4];
      arrayOfString1[0] = "";
      int i = 0;
      int j = i;
      while (i < str.length())
      {
        int k = str.indexOf("$", i);
        if (k == -1)
        {
          paramXmlPullParser = new StringBuilder();
          paramXmlPullParser.append(arrayOfString1[j]);
          paramXmlPullParser.append(str.substring(i));
          arrayOfString1[j] = paramXmlPullParser.toString();
          i = str.length();
        }
        else if (k != i)
        {
          paramXmlPullParser = new StringBuilder();
          paramXmlPullParser.append(arrayOfString1[j]);
          paramXmlPullParser.append(str.substring(i, k));
          arrayOfString1[j] = paramXmlPullParser.toString();
          i = k;
        }
        else if (str.startsWith("$$", i))
        {
          arrayOfString1[j] = g.f(new StringBuilder(), arrayOfString1[j], "$");
          i += 2;
        }
        else
        {
          i++;
          k = str.indexOf("$", i);
          paramString = str.substring(i, k);
          if (paramString.equals("RepresentationID"))
          {
            arrayOfInt[j] = 1;
          }
          else
          {
            i = paramString.indexOf("%0");
            if (i != -1)
            {
              paramm = paramString.substring(i);
              paramXmlPullParser = paramm;
              if (!paramm.endsWith("d"))
              {
                paramXmlPullParser = paramm;
                if (!paramm.endsWith("x"))
                {
                  paramXmlPullParser = paramm;
                  if (!paramm.endsWith("X")) {
                    paramXmlPullParser = g.d(paramm, "d");
                  }
                }
              }
              paramString = paramString.substring(0, i);
            }
            else
            {
              paramXmlPullParser = "%01d";
            }
            paramString.getClass();
            paramString.hashCode();
            i = -1;
            switch (paramString.hashCode())
            {
            default: 
              break;
            case 38199441: 
              if (paramString.equals("Bandwidth")) {
                i = 2;
              }
              break;
            case 2606829: 
              if (paramString.equals("Time")) {
                i = 1;
              }
              break;
            case -1950496919: 
              if (paramString.equals("Number")) {
                i = 0;
              }
              break;
            }
            switch (i)
            {
            default: 
              throw new IllegalArgumentException(g.d("Invalid template: ", str));
            case 2: 
              arrayOfInt[j] = 3;
              break;
            case 1: 
              arrayOfInt[j] = 4;
              break;
            case 0: 
              arrayOfInt[j] = 2;
            }
            arrayOfString2[j] = paramXmlPullParser;
          }
          j++;
          arrayOfString1[j] = "";
          i = k + 1;
        }
      }
      return new m(arrayOfString1, arrayOfInt, arrayOfString2, j);
    }
    return paramm;
  }
  
  public final Object a(Uri paramUri, t5.m paramm)
  {
    try
    {
      XmlPullParser localXmlPullParser = a.newPullParser();
      localXmlPullParser.setInput(paramm, null);
      if ((localXmlPullParser.next() == 2) && ("MPD".equals(localXmlPullParser.getName()))) {
        return n(localXmlPullParser, paramUri);
      }
      throw a1.b("inputStream does not contain a valid media presentation description", null);
    }
    catch (XmlPullParserException paramUri)
    {
      throw a1.b(null, paramUri);
    }
  }
  
  public static final class a
  {
    public final i0 a;
    public final t<b> b;
    public final k c;
    public final String d;
    public final ArrayList<d.b> e;
    public final ArrayList<e> f;
    public final long g;
    public final List<e> h;
    public final List<e> i;
    
    public a(i0 parami0, List paramList, k paramk, String paramString, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, ArrayList paramArrayList4)
    {
      a = parami0;
      b = t.p(paramList);
      c = paramk;
      d = paramString;
      e = paramArrayList1;
      f = paramArrayList2;
      h = paramArrayList3;
      i = paramArrayList4;
      g = -1L;
    }
  }
}

/* Location:
 * Qualified Name:     d5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */