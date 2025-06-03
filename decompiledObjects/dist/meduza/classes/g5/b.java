package g5;

import a4.d;
import a4.d.b;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import b.a0;
import f;
import g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import k4.h;
import k4.k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import t5.f0.a;
import t5.m;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.e0;

public final class b
  implements f0.a<a>
{
  public final XmlPullParserFactory a;
  
  public b()
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
  
  public final Object a(Uri paramUri, m paramm)
  {
    try
    {
      XmlPullParser localXmlPullParser = a.newPullParser();
      localXmlPullParser.setInput(paramm, null);
      paramm = new g5/b$e;
      paramm.<init>(paramUri.toString());
      paramUri = (a)paramm.e(localXmlPullParser);
      return paramUri;
    }
    catch (XmlPullParserException paramUri)
    {
      throw a1.b(null, paramUri);
    }
  }
  
  public static abstract class a
  {
    public final String a;
    public final String b;
    public final a c;
    public final LinkedList d;
    
    public a(a parama, String paramString1, String paramString2)
    {
      c = parama;
      a = paramString1;
      b = paramString2;
      d = new LinkedList();
    }
    
    public static int g(XmlPullParser paramXmlPullParser, String paramString)
    {
      paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
      if (paramXmlPullParser != null) {
        try
        {
          int i = Integer.parseInt(paramXmlPullParser);
          return i;
        }
        catch (NumberFormatException paramXmlPullParser)
        {
          throw a1.b(null, paramXmlPullParser);
        }
      }
      return -1;
    }
    
    public static long h(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
    {
      paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
      if (paramXmlPullParser != null) {
        try
        {
          paramLong = Long.parseLong(paramXmlPullParser);
          return paramLong;
        }
        catch (NumberFormatException paramXmlPullParser)
        {
          throw a1.b(null, paramXmlPullParser);
        }
      }
      return paramLong;
    }
    
    public static int i(XmlPullParser paramXmlPullParser, String paramString)
    {
      paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
      if (paramXmlPullParser != null) {
        try
        {
          int i = Integer.parseInt(paramXmlPullParser);
          return i;
        }
        catch (NumberFormatException paramXmlPullParser)
        {
          throw a1.b(null, paramXmlPullParser);
        }
      }
      throw new b.b(paramString);
    }
    
    public void a(Object paramObject) {}
    
    public abstract Object b();
    
    public final Object c(String paramString)
    {
      for (int i = 0; i < d.size(); i++)
      {
        localObject = (Pair)d.get(i);
        if (((String)first).equals(paramString)) {
          return second;
        }
      }
      Object localObject = c;
      if (localObject == null) {
        paramString = null;
      } else {
        paramString = ((a)localObject).c(paramString);
      }
      return paramString;
    }
    
    public boolean d(String paramString)
    {
      return false;
    }
    
    public final Object e(XmlPullParser paramXmlPullParser)
    {
      int i = 0;
      int k;
      for (int j = 0;; j = k)
      {
        k = paramXmlPullParser.getEventType();
        Object localObject = null;
        if (k == 1) {
          break;
        }
        int m;
        if (k != 2)
        {
          if (k != 3)
          {
            if (k != 4)
            {
              m = i;
              k = j;
            }
            else
            {
              m = i;
              k = j;
              if (i != 0)
              {
                m = i;
                k = j;
                if (j == 0)
                {
                  k(paramXmlPullParser);
                  m = i;
                  k = j;
                }
              }
            }
          }
          else
          {
            m = i;
            k = j;
            if (i != 0) {
              if (j > 0)
              {
                k = j - 1;
                m = i;
              }
              else
              {
                localObject = paramXmlPullParser.getName();
                f(paramXmlPullParser);
                m = i;
                k = j;
                if (!d((String)localObject)) {
                  return b();
                }
              }
            }
          }
        }
        else
        {
          String str1 = paramXmlPullParser.getName();
          if (b.equals(str1))
          {
            j(paramXmlPullParser);
            m = 1;
            k = j;
          }
          else
          {
            m = i;
            k = j;
            if (i != 0) {
              if (j > 0)
              {
                k = j + 1;
                m = i;
              }
              else if (d(str1))
              {
                j(paramXmlPullParser);
                m = i;
                k = j;
              }
              else
              {
                String str2 = a;
                if ("QualityLevel".equals(str1)) {
                  localObject = new b.d(this, str2);
                } else if ("Protection".equals(str1)) {
                  localObject = new b.c(this, str2);
                } else if ("StreamIndex".equals(str1)) {
                  localObject = new b.f(this, str2);
                }
                if (localObject == null)
                {
                  k = 1;
                  m = i;
                }
                else
                {
                  a(((a)localObject).e(paramXmlPullParser));
                  k = j;
                  m = i;
                }
              }
            }
          }
        }
        paramXmlPullParser.next();
        i = m;
      }
      return null;
    }
    
    public void f(XmlPullParser paramXmlPullParser) {}
    
    public abstract void j(XmlPullParser paramXmlPullParser);
    
    public void k(XmlPullParser paramXmlPullParser) {}
    
    public final void l(Object paramObject, String paramString)
    {
      d.add(Pair.create(paramString, paramObject));
    }
  }
  
  public static final class b
    extends a1
  {
    public b(String paramString)
    {
      super(null, true, 4);
    }
  }
  
  public static final class c
    extends b.a
  {
    public boolean e;
    public UUID f;
    public byte[] g;
    
    public c(b.a parama, String paramString)
    {
      super(paramString, "Protection");
    }
    
    public final Object b()
    {
      UUID localUUID = f;
      byte[] arrayOfByte1 = h.a(localUUID, null, g);
      byte[] arrayOfByte2 = g;
      Object localObject = new StringBuilder();
      for (int i = 0; i < arrayOfByte2.length; i += 2) {
        ((StringBuilder)localObject).append((char)arrayOfByte2[i]);
      }
      localObject = ((StringBuilder)localObject).toString();
      localObject = Base64.decode(((String)localObject).substring(((String)localObject).indexOf("<KID>") + 5, ((String)localObject).indexOf("</KID>")), 0);
      i = localObject[0];
      localObject[0] = ((byte)localObject[3]);
      localObject[3] = ((byte)i);
      i = localObject[1];
      localObject[1] = ((byte)localObject[2]);
      localObject[2] = ((byte)i);
      i = localObject[4];
      localObject[4] = ((byte)localObject[5]);
      localObject[5] = ((byte)i);
      i = localObject[6];
      localObject[6] = ((byte)localObject[7]);
      localObject[7] = ((byte)i);
      return new a.a(localUUID, arrayOfByte1, new k[] { new k(true, null, 8, (byte[])localObject, 0, 0, null) });
    }
    
    public final boolean d(String paramString)
    {
      return "ProtectionHeader".equals(paramString);
    }
    
    public final void f(XmlPullParser paramXmlPullParser)
    {
      if ("ProtectionHeader".equals(paramXmlPullParser.getName())) {
        e = false;
      }
    }
    
    public final void j(XmlPullParser paramXmlPullParser)
    {
      if ("ProtectionHeader".equals(paramXmlPullParser.getName()))
      {
        e = true;
        String str = paramXmlPullParser.getAttributeValue(null, "SystemID");
        paramXmlPullParser = str;
        if (str.charAt(0) == '{')
        {
          paramXmlPullParser = str;
          if (str.charAt(str.length() - 1) == '}') {
            paramXmlPullParser = str.substring(1, str.length() - 1);
          }
        }
        f = UUID.fromString(paramXmlPullParser);
      }
    }
    
    public final void k(XmlPullParser paramXmlPullParser)
    {
      if (e) {
        g = Base64.decode(paramXmlPullParser.getText(), 0);
      }
    }
  }
  
  public static final class d
    extends b.a
  {
    public i0 e;
    
    public d(b.a parama, String paramString)
    {
      super(paramString, "QualityLevel");
    }
    
    public static ArrayList m(String paramString)
    {
      ArrayList localArrayList1 = new ArrayList();
      if (!TextUtils.isEmpty(paramString))
      {
        int i = e0.a;
        int j = paramString.length() / 2;
        byte[] arrayOfByte1 = new byte[j];
        int k;
        int m;
        for (i = 0; i < j; i++)
        {
          k = i * 2;
          m = Character.digit(paramString.charAt(k), 16);
          arrayOfByte1[i] = ((byte)(byte)(Character.digit(paramString.charAt(k + 1), 16) + (m << 4)));
        }
        if (j + 0 <= 4)
        {
          i = 0;
        }
        else
        {
          for (i = 0;; i++)
          {
            paramString = a0.f0;
            if (i >= 4) {
              break label130;
            }
            if (arrayOfByte1[(0 + i)] != paramString[i]) {
              break;
            }
          }
          label130:
          i = 1;
        }
        if (i == 0)
        {
          paramString = null;
        }
        else
        {
          ArrayList localArrayList2 = new ArrayList();
          m = 0;
          label225:
          label244:
          do
          {
            localArrayList2.add(Integer.valueOf(m));
            for (i = m + 4; i <= j - 4; i++)
            {
              if (j - i <= 4)
              {
                m = 0;
              }
              else
              {
                for (m = 0;; m++)
                {
                  paramString = a0.f0;
                  if (m >= 4) {
                    break label225;
                  }
                  if (arrayOfByte1[(i + m)] != paramString[m]) {
                    break;
                  }
                }
                m = 1;
              }
              if (m != 0) {
                break label244;
              }
            }
            i = -1;
            m = i;
          } while (i != -1);
          paramString = new byte[localArrayList2.size()][];
          for (i = 0; i < localArrayList2.size(); i++)
          {
            k = ((Integer)localArrayList2.get(i)).intValue();
            if (i < localArrayList2.size() - 1) {
              m = ((Integer)localArrayList2.get(i + 1)).intValue();
            } else {
              m = j;
            }
            m -= k;
            byte[] arrayOfByte2 = new byte[m];
            System.arraycopy(arrayOfByte1, k, arrayOfByte2, 0, m);
            paramString[i] = arrayOfByte2;
          }
        }
        if (paramString == null) {
          localArrayList1.add(arrayOfByte1);
        } else {
          Collections.addAll(localArrayList1, paramString);
        }
      }
      return localArrayList1;
    }
    
    public final Object b()
    {
      return e;
    }
    
    public final void j(XmlPullParser paramXmlPullParser)
    {
      i0.a locala = new i0.a();
      Object localObject1 = paramXmlPullParser.getAttributeValue(null, "FourCC");
      if (localObject1 != null)
      {
        if ((!((String)localObject1).equalsIgnoreCase("H264")) && (!((String)localObject1).equalsIgnoreCase("X264")) && (!((String)localObject1).equalsIgnoreCase("AVC1")) && (!((String)localObject1).equalsIgnoreCase("DAVC")))
        {
          if ((!((String)localObject1).equalsIgnoreCase("AAC")) && (!((String)localObject1).equalsIgnoreCase("AACL")) && (!((String)localObject1).equalsIgnoreCase("AACH")) && (!((String)localObject1).equalsIgnoreCase("AACP")))
          {
            if ((!((String)localObject1).equalsIgnoreCase("TTML")) && (!((String)localObject1).equalsIgnoreCase("DFXP")))
            {
              if ((!((String)localObject1).equalsIgnoreCase("ac-3")) && (!((String)localObject1).equalsIgnoreCase("dac3")))
              {
                if ((!((String)localObject1).equalsIgnoreCase("ec-3")) && (!((String)localObject1).equalsIgnoreCase("dec3")))
                {
                  if (((String)localObject1).equalsIgnoreCase("dtsc")) {
                    localObject1 = "audio/vnd.dts";
                  } else if ((!((String)localObject1).equalsIgnoreCase("dtsh")) && (!((String)localObject1).equalsIgnoreCase("dtsl")))
                  {
                    if (((String)localObject1).equalsIgnoreCase("dtse")) {
                      localObject1 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (((String)localObject1).equalsIgnoreCase("opus")) {
                      localObject1 = "audio/opus";
                    } else {
                      localObject1 = null;
                    }
                  }
                  else {
                    localObject1 = "audio/vnd.dts.hd";
                  }
                }
                else {
                  localObject1 = "audio/eac3";
                }
              }
              else {
                localObject1 = "audio/ac3";
              }
            }
            else {
              localObject1 = "application/ttml+xml";
            }
          }
          else {
            localObject1 = "audio/mp4a-latm";
          }
        }
        else {
          localObject1 = "video/avc";
        }
        int i = ((Integer)c("Type")).intValue();
        Object localObject2;
        if (i == 2)
        {
          localObject2 = m(paramXmlPullParser.getAttributeValue(null, "CodecPrivateData"));
          j = "video/mp4";
          p = b.a.i(paramXmlPullParser, "MaxWidth");
          q = b.a.i(paramXmlPullParser, "MaxHeight");
          m = ((List)localObject2);
        }
        else
        {
          int j = 0;
          int k = 0;
          if (i == 1)
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = "audio/mp4a-latm";
            }
            int m = b.a.i(paramXmlPullParser, "Channels");
            int n = b.a.i(paramXmlPullParser, "SamplingRate");
            ArrayList localArrayList = m(paramXmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            localObject1 = localArrayList;
            if (localArrayList.isEmpty())
            {
              localObject1 = localArrayList;
              if ("audio/mp4a-latm".equals(localObject2))
              {
                j = -1;
                for (i = 0;; i++)
                {
                  localObject1 = x3.a.a;
                  if (i >= 13) {
                    break;
                  }
                  if (n == localObject1[i]) {
                    j = i;
                  }
                }
                int i1 = -1;
                i = k;
                k = i1;
                for (;;)
                {
                  localObject1 = x3.a.b;
                  if (i >= 16) {
                    break;
                  }
                  if (m == localObject1[i]) {
                    k = i;
                  }
                  i++;
                }
                if ((n != -1) && (k != -1)) {
                  localObject1 = Collections.singletonList(x3.a.a(2, j, k));
                } else {
                  throw new IllegalArgumentException(f.i("Invalid sample rate or number of channels: ", n, ", ", m));
                }
              }
            }
            j = "audio/mp4";
            x = m;
            y = n;
            m = ((List)localObject1);
            localObject1 = localObject2;
          }
          else if (i == 3)
          {
            localObject2 = (String)c("Subtype");
            i = j;
            if (localObject2 != null) {
              if (!((String)localObject2).equals("CAPT"))
              {
                if (!((String)localObject2).equals("DESC")) {
                  i = j;
                } else {
                  i = 1024;
                }
              }
              else {
                i = 64;
              }
            }
            j = "application/mp4";
            e = i;
          }
          else
          {
            j = "application/mp4";
          }
        }
        a = paramXmlPullParser.getAttributeValue(null, "Index");
        b = ((String)c("Name"));
        k = ((String)localObject1);
        f = b.a.i(paramXmlPullParser, "Bitrate");
        c = ((String)c("Language"));
        e = new i0(locala);
        return;
      }
      throw new b.b("FourCC");
    }
  }
  
  public static final class e
    extends b.a
  {
    public final LinkedList e = new LinkedList();
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public int k = -1;
    public boolean l;
    public a.a m = null;
    
    public e(String paramString)
    {
      super(paramString, "SmoothStreamingMedia");
    }
    
    public final void a(Object paramObject)
    {
      if ((paramObject instanceof a.b))
      {
        e.add((a.b)paramObject);
      }
      else if ((paramObject instanceof a.a))
      {
        boolean bool;
        if (m == null) {
          bool = true;
        } else {
          bool = false;
        }
        x6.b.H(bool);
        m = ((a.a)paramObject);
      }
    }
    
    public final Object b()
    {
      int n = e.size();
      a.b[] arrayOfb = new a.b[n];
      e.toArray(arrayOfb);
      Object localObject1 = m;
      if (localObject1 != null)
      {
        localObject1 = new d(new d.b[] { new d.b(a, null, "video/mp4", b) });
        for (i1 = 0; i1 < n; i1++)
        {
          Object localObject2 = arrayOfb[i1];
          i2 = a;
          if ((i2 == 2) || (i2 == 1))
          {
            localObject2 = j;
            for (i2 = 0; i2 < localObject2.length; i2++)
            {
              Object localObject3 = localObject2[i2];
              localObject3.getClass();
              localObject3 = new i0.a((i0)localObject3);
              n = ((d)localObject1);
              localObject2[i2] = new i0((i0.a)localObject3);
            }
          }
        }
      }
      int i2 = f;
      n = g;
      long l1 = h;
      long l2 = i;
      long l3 = j;
      int i1 = k;
      boolean bool = l;
      localObject1 = m;
      if (l2 == 0L) {
        l2 = -9223372036854775807L;
      } else {
        l2 = e0.O(l2, 1000000L, l1);
      }
      if (l3 == 0L) {
        l3 = -9223372036854775807L;
      } else {
        l3 = e0.O(l3, 1000000L, l1);
      }
      return new a(i2, n, l2, l3, i1, bool, (a.a)localObject1, arrayOfb);
    }
    
    public final void j(XmlPullParser paramXmlPullParser)
    {
      f = b.a.i(paramXmlPullParser, "MajorVersion");
      g = b.a.i(paramXmlPullParser, "MinorVersion");
      h = b.a.h(paramXmlPullParser, "TimeScale", 10000000L);
      String str = paramXmlPullParser.getAttributeValue(null, "Duration");
      if (str != null) {
        try
        {
          long l1 = Long.parseLong(str);
          i = l1;
          j = b.a.h(paramXmlPullParser, "DVRWindowLength", 0L);
          k = b.a.g(paramXmlPullParser, "LookaheadCount");
          boolean bool = false;
          paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "IsLive");
          if (paramXmlPullParser != null) {
            bool = Boolean.parseBoolean(paramXmlPullParser);
          }
          l = bool;
          l(Long.valueOf(h), "TimeScale");
          return;
        }
        catch (NumberFormatException paramXmlPullParser)
        {
          throw a1.b(null, paramXmlPullParser);
        }
      }
      throw new b.b("Duration");
    }
  }
  
  public static final class f
    extends b.a
  {
    public final String e;
    public final LinkedList f;
    public int g;
    public String h;
    public long i;
    public String j;
    public String k;
    public int l;
    public int m;
    public int n;
    public int o;
    public String p;
    public ArrayList<Long> q;
    public long r;
    
    public f(b.a parama, String paramString)
    {
      super(paramString, "StreamIndex");
      e = paramString;
      f = new LinkedList();
    }
    
    public final void a(Object paramObject)
    {
      if ((paramObject instanceof i0)) {
        f.add((i0)paramObject);
      }
    }
    
    public final Object b()
    {
      i0[] arrayOfi0 = new i0[f.size()];
      f.toArray(arrayOfi0);
      String str1 = e;
      String str2 = k;
      int i1 = g;
      String str3 = h;
      long l1 = i;
      String str4 = j;
      int i2 = l;
      int i3 = m;
      int i4 = n;
      int i5 = o;
      String str5 = p;
      ArrayList localArrayList1 = q;
      long l2 = r;
      int i6 = e0.a;
      int i9 = localArrayList1.size();
      long[] arrayOfLong = new long[i9];
      int i7 = l1 < 1000000L;
      long l3;
      if ((i7 >= 0) && (l1 % 1000000L == 0L))
      {
        l3 = l1 / 1000000L;
        i7 = 0;
      }
      while (i7 < i9)
      {
        arrayOfLong[i7] = (((Long)localArrayList1.get(i7)).longValue() / l3);
        i7++;
        continue;
        if ((i7 >= 0) || (1000000L % l1 != 0L)) {
          break label251;
        }
        l3 = 1000000L / l1;
        for (i8 = 0; i8 < i9; i8++) {
          arrayOfLong[i8] = (((Long)localArrayList1.get(i8)).longValue() * l3);
        }
      }
      ArrayList localArrayList2 = localArrayList1;
      break label304;
      label251:
      double d = 1000000L / l1;
      for (int i8 = 0;; i8++)
      {
        localArrayList2 = localArrayList1;
        if (i8 >= i9) {
          break;
        }
        arrayOfLong[i8] = ((((Long)localArrayList1.get(i8)).longValue() * d));
      }
      label304:
      return new a.b(str1, str2, i1, str3, l1, str4, i2, i3, i4, i5, str5, arrayOfi0, localArrayList2, arrayOfLong, e0.O(l2, 1000000L, l1));
    }
    
    public final boolean d(String paramString)
    {
      return "c".equals(paramString);
    }
    
    public final void j(XmlPullParser paramXmlPullParser)
    {
      boolean bool = "c".equals(paramXmlPullParser.getName());
      int i1 = 1;
      int i2 = 1;
      long l2;
      if (bool)
      {
        i1 = q.size();
        long l1 = b.a.h(paramXmlPullParser, "t", -9223372036854775807L);
        l2 = l1;
        if (l1 == -9223372036854775807L) {
          if (i1 == 0)
          {
            l2 = 0L;
          }
          else if (r != -1L)
          {
            l2 = ((Long)q.get(i1 - 1)).longValue();
            l2 = r + l2;
          }
          else
          {
            throw a1.b("Unable to infer start time", null);
          }
        }
        q.add(Long.valueOf(l2));
        r = b.a.h(paramXmlPullParser, "d", -9223372036854775807L);
        long l3 = b.a.h(paramXmlPullParser, "r", 1L);
        i1 = i2;
        if (l3 > 1L) {
          if (r != -9223372036854775807L) {
            i1 = i2;
          } else {
            throw a1.b("Repeated chunk with unspecified duration", null);
          }
        }
        for (;;)
        {
          l1 = i1;
          if (l1 >= l3) {
            break;
          }
          q.add(Long.valueOf(r * l1 + l2));
          i1++;
        }
      }
      String str = paramXmlPullParser.getAttributeValue(null, "Type");
      if (str != null)
      {
        if (!"audio".equalsIgnoreCase(str)) {
          if ("video".equalsIgnoreCase(str))
          {
            i1 = 2;
          }
          else
          {
            if (!"text".equalsIgnoreCase(str)) {
              break label526;
            }
            i1 = 3;
          }
        }
        g = i1;
        l(Integer.valueOf(i1), "Type");
        if (g == 3)
        {
          str = paramXmlPullParser.getAttributeValue(null, "Subtype");
          if (str == null) {
            throw new b.b("Subtype");
          }
        }
        else
        {
          str = paramXmlPullParser.getAttributeValue(null, "Subtype");
        }
        h = str;
        l(str, "Subtype");
        str = paramXmlPullParser.getAttributeValue(null, "Name");
        j = str;
        l(str, "Name");
        str = paramXmlPullParser.getAttributeValue(null, "Url");
        if (str != null)
        {
          k = str;
          l = b.a.g(paramXmlPullParser, "MaxWidth");
          m = b.a.g(paramXmlPullParser, "MaxHeight");
          n = b.a.g(paramXmlPullParser, "DisplayWidth");
          o = b.a.g(paramXmlPullParser, "DisplayHeight");
          str = paramXmlPullParser.getAttributeValue(null, "Language");
          p = str;
          l(str, "Language");
          l2 = b.a.g(paramXmlPullParser, "TimeScale");
          i = l2;
          if (l2 == -1L) {
            i = ((Long)c("TimeScale")).longValue();
          }
          q = new ArrayList();
          return;
        }
        throw new b.b("Url");
        label526:
        paramXmlPullParser = new StringBuilder();
        paramXmlPullParser.append("Invalid key value[");
        paramXmlPullParser.append(str);
        paramXmlPullParser.append("]");
        throw a1.b(paramXmlPullParser.toString(), null);
      }
      throw new b.b("Type");
    }
  }
}

/* Location:
 * Qualified Name:     g5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */