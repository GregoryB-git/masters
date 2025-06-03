package r0;

import B0.p.a;
import X2.B;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import d0.A;
import d0.m;
import d0.m.b;
import d0.q;
import d0.q.b;
import d0.x;
import d0.x.b;
import d0.z;
import g0.G;
import g0.M;
import g0.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q0.t;
import q0.t.b;

public final class i
  implements p.a
{
  public static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
  public static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
  public static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
  public static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
  public static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
  public static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
  public static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
  public static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
  public static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
  public static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
  public static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
  public static final Pattern L = Pattern.compile("IV=([^,.*]+)");
  public static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
  public static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
  public static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
  public static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
  public static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
  public static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
  public static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
  public static final Pattern T = c("AUTOSELECT");
  public static final Pattern U = c("DEFAULT");
  public static final Pattern V = c("FORCED");
  public static final Pattern W = c("INDEPENDENT");
  public static final Pattern X = c("GAP");
  public static final Pattern Y = c("PRECISE");
  public static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");
  public static final Pattern a0 = Pattern.compile("IMPORT=\"(.+?)\"");
  public static final Pattern b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
  public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
  public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
  public static final Pattern e = Pattern.compile("AUDIO=\"(.+?)\"");
  public static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");
  public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
  public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
  public static final Pattern i = Pattern.compile("CHANNELS=\"(.+?)\"");
  public static final Pattern j = Pattern.compile("CODECS=\"(.+?)\"");
  public static final Pattern k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
  public static final Pattern l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
  public static final Pattern m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
  public static final Pattern n = Pattern.compile("DURATION=([\\d\\.]+)\\b");
  public static final Pattern o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
  public static final Pattern p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
  public static final Pattern q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
  public static final Pattern r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
  public static final Pattern s = c("CAN-SKIP-DATERANGES");
  public static final Pattern t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
  public static final Pattern u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
  public static final Pattern v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
  public static final Pattern w = c("CAN-BLOCK-RELOAD");
  public static final Pattern x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
  public static final Pattern y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
  public static final Pattern z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
  public final g a;
  public final f b;
  
  public i()
  {
    this(g.n, null);
  }
  
  public i(g paramg, f paramf)
  {
    a = paramg;
    b = paramf;
  }
  
  public static long A(String paramString, Pattern paramPattern)
  {
    return new BigDecimal(z(paramString, paramPattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
  }
  
  public static String B(String paramString, Map paramMap)
  {
    Matcher localMatcher = b0.matcher(paramString);
    StringBuffer localStringBuffer = new StringBuffer();
    while (localMatcher.find())
    {
      paramString = localMatcher.group(1);
      if (paramMap.containsKey(paramString)) {
        localMatcher.appendReplacement(localStringBuffer, Matcher.quoteReplacement((String)paramMap.get(paramString)));
      }
    }
    localMatcher.appendTail(localStringBuffer);
    return localStringBuffer.toString();
  }
  
  public static int C(BufferedReader paramBufferedReader, boolean paramBoolean, int paramInt)
  {
    while ((paramInt != -1) && (Character.isWhitespace(paramInt)) && ((paramBoolean) || (!M.C0(paramInt)))) {
      paramInt = paramBufferedReader.read();
    }
    return paramInt;
  }
  
  public static boolean b(BufferedReader paramBufferedReader)
  {
    int i1 = paramBufferedReader.read();
    int i2 = i1;
    if (i1 == 239) {
      if ((paramBufferedReader.read() == 187) && (paramBufferedReader.read() == 191)) {
        i2 = paramBufferedReader.read();
      } else {
        return false;
      }
    }
    i1 = C(paramBufferedReader, true, i2);
    for (i2 = 0; i2 < 7; i2++)
    {
      if (i1 != "#EXTM3U".charAt(i2)) {
        return false;
      }
      i1 = paramBufferedReader.read();
    }
    return M.C0(C(paramBufferedReader, false, i1));
  }
  
  public static Pattern c(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("=(");
    localStringBuilder.append("NO");
    localStringBuilder.append("|");
    localStringBuilder.append("YES");
    localStringBuilder.append(")");
    return Pattern.compile(localStringBuilder.toString());
  }
  
  public static m d(String paramString, m.b[] paramArrayOfb)
  {
    m.b[] arrayOfb = new m.b[paramArrayOfb.length];
    for (int i1 = 0; i1 < paramArrayOfb.length; i1++) {
      arrayOfb[i1] = paramArrayOfb[i1].b(null);
    }
    return new m(paramString, arrayOfb);
  }
  
  public static String e(long paramLong, String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    if (paramString2 != null) {
      return paramString2;
    }
    return Long.toHexString(paramLong);
  }
  
  public static g.b f(ArrayList paramArrayList, String paramString)
  {
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      g.b localb = (g.b)paramArrayList.get(i1);
      if (paramString.equals(d)) {
        return localb;
      }
    }
    return null;
  }
  
  public static g.b g(ArrayList paramArrayList, String paramString)
  {
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      g.b localb = (g.b)paramArrayList.get(i1);
      if (paramString.equals(e)) {
        return localb;
      }
    }
    return null;
  }
  
  public static g.b h(ArrayList paramArrayList, String paramString)
  {
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      g.b localb = (g.b)paramArrayList.get(i1);
      if (paramString.equals(c)) {
        return localb;
      }
    }
    return null;
  }
  
  public static double j(String paramString, Pattern paramPattern)
  {
    return Double.parseDouble(z(paramString, paramPattern, Collections.emptyMap()));
  }
  
  public static m.b k(String paramString1, String paramString2, Map paramMap)
  {
    String str = u(paramString1, J, "1", paramMap);
    if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(paramString2))
    {
      paramString1 = z(paramString1, K, paramMap);
      return new m.b(d0.g.d, "video/mp4", Base64.decode(paramString1.substring(paramString1.indexOf(',')), 0));
    }
    if ("com.widevine".equals(paramString2)) {
      return new m.b(d0.g.d, "hls", M.r0(paramString1));
    }
    if (("com.microsoft.playready".equals(paramString2)) && ("1".equals(str)))
    {
      paramString1 = z(paramString1, K, paramMap);
      paramString2 = Base64.decode(paramString1.substring(paramString1.indexOf(',')), 0);
      paramString1 = d0.g.e;
      return new m.b(paramString1, "video/mp4", Z0.o.a(paramString1, paramString2));
    }
    return null;
  }
  
  public static String l(String paramString)
  {
    if ((!"SAMPLE-AES-CENC".equals(paramString)) && (!"SAMPLE-AES-CTR".equals(paramString))) {
      paramString = "cbcs";
    } else {
      paramString = "cenc";
    }
    return paramString;
  }
  
  public static int m(String paramString, Pattern paramPattern)
  {
    return Integer.parseInt(z(paramString, paramPattern, Collections.emptyMap()));
  }
  
  public static long n(String paramString, Pattern paramPattern)
  {
    return Long.parseLong(z(paramString, paramPattern, Collections.emptyMap()));
  }
  
  public static f o(g paramg, f paramf, b paramb, String paramString)
  {
    Object localObject1 = paramg;
    Object localObject2 = paramf;
    boolean bool1 = c;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject3 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject4 = new ArrayList();
    f.f localf = new f.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
    TreeMap localTreeMap = new TreeMap();
    int i1 = 0;
    String str1 = "";
    int i2 = 0;
    int i4 = i2;
    int i6 = i4;
    int i9 = i6;
    int i11 = i9;
    int i13 = i11;
    int i15 = i13;
    int i17 = i15;
    String str2 = str1;
    Object localObject5 = null;
    long l1 = -9223372036854775807L;
    long l2 = 0L;
    long l3 = 0L;
    int i19 = 1;
    long l4 = -9223372036854775807L;
    long l5 = -9223372036854775807L;
    Object localObject6 = null;
    long l6 = 0L;
    Object localObject7 = null;
    long l7 = 0L;
    long l8 = -1L;
    Object localObject8 = null;
    Object localObject9 = null;
    long l9 = 0L;
    long l10 = 0L;
    Object localObject10 = null;
    long l11 = 0L;
    long l12 = 0L;
    f.b localb = null;
    int i20 = i11;
    i11 = i19;
    boolean bool4 = i6;
    i19 = i4;
    i4 = i1;
    i6 = i2;
    label628:
    int i12;
    label773:
    int i5;
    boolean bool5;
    int i16;
    label1110:
    label1118:
    label1319:
    int i10;
    label1572:
    label1575:
    boolean bool3;
    label1787:
    int i8;
    while (paramb.a())
    {
      Object localObject11 = paramb.b();
      if (((String)localObject11).startsWith("#EXT")) {
        ((List)localObject4).add(localObject11);
      }
      int i7;
      if (((String)localObject11).startsWith("#EXT-X-PLAYLIST-TYPE"))
      {
        localObject11 = z((String)localObject11, q, localHashMap1);
        if ("VOD".equals(localObject11)) {
          i6 = 1;
        } else if ("EVENT".equals(localObject11)) {
          i7 = 2;
        }
      }
      else
      {
        int i18;
        if (((String)localObject11).equals("#EXT-X-I-FRAMES-ONLY"))
        {
          i18 = 1;
        }
        else if (((String)localObject11).startsWith("#EXT-X-START"))
        {
          l1 = (j((String)localObject11, C) * 1000000.0D);
          i19 = q((String)localObject11, Y, i4);
        }
        else if (((String)localObject11).startsWith("#EXT-X-SERVER-CONTROL"))
        {
          localf = y((String)localObject11);
        }
        else if (((String)localObject11).startsWith("#EXT-X-PART-INF"))
        {
          l5 = (j((String)localObject11, o) * 1000000.0D);
        }
        else
        {
          long l13;
          long l14;
          if (((String)localObject11).startsWith("#EXT-X-MAP"))
          {
            localObject10 = z((String)localObject11, K, localHashMap1);
            localObject11 = v((String)localObject11, E, localHashMap1);
            l13 = l6;
            if (localObject11 != null)
            {
              localObject11 = M.b1((String)localObject11, "@");
              l14 = Long.parseLong(localObject11[i4]);
              l13 = l6;
              l8 = l14;
              if (localObject11.length > 1)
              {
                l13 = Long.parseLong(localObject11[1]);
                l8 = l14;
              }
            }
            i2 = l8 < -1L;
            if (i2 == 0) {
              l13 = 0L;
            }
            if ((localObject5 == null) || (localObject8 == null)) {
              throw A.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
            }
            localObject10 = new f.d((String)localObject10, l13, l8, (String)localObject5, (String)localObject8);
            l6 = l13;
            if (i2 != 0) {
              l6 = l13 + l8;
            }
            l8 = -1L;
          }
          else
          {
            if (((String)localObject11).startsWith("#EXT-X-TARGETDURATION")) {
              l4 = 1000000L * m((String)localObject11, m);
            }
            int i3;
            for (;;)
            {
              i4 = 0;
              break;
              if (((String)localObject11).startsWith("#EXT-X-MEDIA-SEQUENCE"))
              {
                l10 = n((String)localObject11, x);
                l3 = l10;
              }
              else if (((String)localObject11).startsWith("#EXT-X-VERSION"))
              {
                i12 = m((String)localObject11, p);
              }
              else
              {
                if (((String)localObject11).startsWith("#EXT-X-DEFINE"))
                {
                  localObject2 = v((String)localObject11, a0, localHashMap1);
                  if (localObject2 != null)
                  {
                    localObject1 = (String)l.get(localObject2);
                    if (localObject1 == null) {
                      break label773;
                    }
                  }
                  else
                  {
                    localObject2 = z((String)localObject11, P, localHashMap1);
                    localObject1 = z((String)localObject11, Z, localHashMap1);
                  }
                  localHashMap1.put(localObject2, localObject1);
                  break label2800;
                }
                if (((String)localObject11).startsWith("#EXTINF"))
                {
                  l11 = A((String)localObject11, y);
                  str2 = u((String)localObject11, z, str1, localHashMap1);
                }
                else
                {
                  if (!((String)localObject11).startsWith("#EXT-X-SKIP")) {
                    break label1118;
                  }
                  i5 = m((String)localObject11, t);
                  if ((localObject2 != null) && (localArrayList1.isEmpty())) {
                    bool5 = true;
                  } else {
                    bool5 = false;
                  }
                  a.f(bool5);
                  i3 = (int)(l3 - ik);
                  i5 += i3;
                  if ((i3 < 0) || (i5 > r.size())) {
                    break label1110;
                  }
                  while (i3 < i5)
                  {
                    localObject1 = (f.d)r.get(i3);
                    localObject7 = localObject1;
                    if (l3 != k) {
                      localObject7 = ((f.d)localObject1).e(l9, j - i9 + r);
                    }
                    localArrayList1.add(localObject7);
                    l9 += q;
                    l7 = x;
                    if (l7 != -1L) {
                      l6 = w + l7;
                    }
                    i16 = r;
                    localObject10 = p;
                    localObject1 = t;
                    localObject5 = u;
                    localObject2 = v;
                    if ((localObject2 == null) || (!((String)localObject2).equals(Long.toHexString(l10)))) {
                      localObject8 = v;
                    }
                    l10 += 1L;
                    i3++;
                    localObject2 = paramf;
                    localObject7 = localObject1;
                    l7 = l9;
                  }
                  localObject1 = paramg;
                  localObject2 = paramf;
                }
              }
            }
            throw new a();
            localObject2 = localObject4;
            if (((String)localObject11).startsWith("#EXT-X-KEY"))
            {
              localObject8 = z((String)localObject11, H, localHashMap1);
              localObject5 = u((String)localObject11, I, "identity", localHashMap1);
              if ("NONE".equals(localObject8))
              {
                localTreeMap.clear();
                localObject1 = null;
              }
              for (;;)
              {
                localObject8 = null;
                localObject7 = null;
                break;
                localObject1 = v((String)localObject11, L, localHashMap1);
                if ("identity".equals(localObject5))
                {
                  localObject4 = localObject9;
                  if ("AES-128".equals(localObject8))
                  {
                    localObject8 = z((String)localObject11, K, localHashMap1);
                    break;
                  }
                }
                do
                {
                  localObject8 = null;
                  localObject9 = localObject4;
                  break;
                  if (localObject9 == null) {
                    localObject8 = l((String)localObject8);
                  } else {
                    localObject8 = localObject9;
                  }
                  localObject9 = k((String)localObject11, (String)localObject5, localHashMap1);
                  localObject4 = localObject8;
                } while (localObject9 == null);
                localTreeMap.put(localObject5, localObject9);
                localObject9 = localObject8;
              }
              localObject4 = localObject1;
              i5 = i16;
              localObject5 = localObject8;
              i16 = i5;
              localObject8 = localObject4;
            }
            int i14;
            Object localObject12;
            label2073:
            String str3;
            for (;;)
            {
              localObject11 = paramf;
              localObject1 = paramg;
              localObject4 = localObject2;
              localObject2 = localObject11;
              break label628;
              if (((String)localObject11).startsWith("#EXT-X-BYTERANGE"))
              {
                localObject4 = M.b1(z((String)localObject11, D, localHashMap1), "@");
                l14 = Long.parseLong(localObject4[0]);
                l13 = l2;
                l8 = l14;
                i5 = i16;
                if (localObject4.length > 1)
                {
                  l6 = Long.parseLong(localObject4[1]);
                  i5 = i16;
                  l8 = l14;
                  l13 = l2;
                }
              }
              for (;;)
              {
                l2 = l13;
                localObject4 = localObject8;
                break label1319;
                if (((String)localObject11).startsWith("#EXT-X-DISCONTINUITY-SEQUENCE"))
                {
                  i10 = Integer.parseInt(((String)localObject11).substring(((String)localObject11).indexOf(':') + 1));
                  localObject1 = paramg;
                  localObject4 = paramf;
                  localObject11 = localObject8;
                  localObject8 = localObject2;
                  i5 = 0;
                  bool4 = true;
                  localObject2 = localObject4;
                  localObject4 = localObject8;
                  localObject8 = localObject11;
                  break;
                }
                if (((String)localObject11).equals("#EXT-X-DISCONTINUITY"))
                {
                  i5 = i16 + 1;
                  l13 = l2;
                }
                else
                {
                  if (!((String)localObject11).startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                    break label1575;
                  }
                  if (l2 != 0L) {
                    break label1572;
                  }
                  l13 = M.J0(M.Q0(((String)localObject11).substring(((String)localObject11).indexOf(':') + 1))) - l9;
                  i5 = i16;
                }
              }
              do
              {
                for (;;)
                {
                  break label773;
                  if (((String)localObject11).equals("#EXT-X-GAP"))
                  {
                    localObject1 = paramg;
                    localObject4 = paramf;
                    localObject11 = localObject8;
                    localObject8 = localObject2;
                    i5 = 0;
                    i14 = 1;
                    localObject2 = localObject4;
                    localObject4 = localObject8;
                    localObject8 = localObject11;
                    break;
                  }
                  if (((String)localObject11).equals("#EXT-X-INDEPENDENT-SEGMENTS"))
                  {
                    localObject1 = paramg;
                    localObject4 = paramf;
                    localObject11 = localObject8;
                    localObject8 = localObject2;
                    i5 = 0;
                    bool1 = true;
                    localObject2 = localObject4;
                    localObject4 = localObject8;
                    localObject8 = localObject11;
                    break;
                  }
                  if (((String)localObject11).equals("#EXT-X-ENDLIST"))
                  {
                    localObject1 = paramg;
                    localObject4 = paramf;
                    localObject11 = localObject8;
                    localObject8 = localObject2;
                    i5 = 0;
                    bool3 = true;
                    localObject2 = localObject4;
                    localObject4 = localObject8;
                    localObject8 = localObject11;
                    break;
                  }
                  if (!((String)localObject11).startsWith("#EXT-X-RENDITION-REPORT")) {
                    break label1787;
                  }
                  l13 = t((String)localObject11, A, -1L);
                  i5 = s((String)localObject11, B, -1);
                  localArrayList2.add(new f.c(Uri.parse(G.e(paramString, z((String)localObject11, K, localHashMap1))), l13, i5));
                }
                i5 = i7;
                localObject1 = localObject9;
                if (!((String)localObject11).startsWith("#EXT-X-PRELOAD-HINT")) {
                  break label2073;
                }
              } while (localb != null);
              while (!"PART".equals(z((String)localObject11, N, localHashMap1))) {}
              localObject4 = z((String)localObject11, K, localHashMap1);
              l13 = t((String)localObject11, F, -1L);
              l14 = t((String)localObject11, G, -1L);
              localObject12 = e(l10, (String)localObject5, (String)localObject8);
              localObject11 = localObject6;
              localObject9 = localObject7;
              if (localObject7 == null)
              {
                localObject11 = localObject6;
                localObject9 = localObject7;
                if (!localTreeMap.isEmpty())
                {
                  localObject7 = (m.b[])localTreeMap.values().toArray(new m.b[0]);
                  localObject9 = new m((String)localObject1, (m.b[])localObject7);
                  localObject11 = localObject6;
                  if (localObject6 == null) {
                    localObject11 = d((String)localObject1, (m.b[])localObject7);
                  }
                }
              }
              i8 = l13 < -1L;
              if ((i8 == 0) || (l14 != -1L))
              {
                if (i8 == 0) {
                  l13 = 0L;
                }
                localb = new f.b((String)localObject4, (f.d)localObject10, 0L, i16, l7, (m)localObject9, (String)localObject5, (String)localObject12, l13, l14, false, false, true);
              }
              localObject6 = paramg;
              localObject4 = paramf;
              localObject7 = localObject2;
              localObject12 = localObject1;
              localObject1 = localObject6;
              localObject2 = localObject4;
              i8 = i5;
              localObject4 = localObject7;
              localObject6 = localObject11;
              localObject7 = localObject9;
              localObject9 = localObject12;
              break label628;
              l13 = l10;
              if (!((String)localObject11).startsWith("#EXT-X-PART")) {
                break label2428;
              }
              str3 = e(l13, (String)localObject5, (String)localObject8);
              localObject12 = z((String)localObject11, K, localHashMap1);
              long l15 = (j((String)localObject11, n) * 1000000.0D);
              int i21 = q((String)localObject11, W, false);
              if ((bool1) && (((List)localObject3).isEmpty())) {
                i8 = 1;
              } else {
                i8 = 0;
              }
              bool5 = q((String)localObject11, X, false);
              localObject9 = v((String)localObject11, E, localHashMap1);
              if (localObject9 != null)
              {
                localObject9 = M.b1((String)localObject9, "@");
                l14 = Long.parseLong(localObject9[0]);
                i3 = localObject9.length;
                l10 = l12;
                if (i3 > 1) {
                  l10 = Long.parseLong(localObject9[1]);
                }
              }
              else
              {
                l14 = -1L;
                l10 = l12;
              }
              boolean bool2 = l14 < -1L;
              if (!bool2) {
                l10 = 0L;
              }
              localObject4 = localObject6;
              localObject9 = localObject7;
              if (localObject7 == null)
              {
                localObject4 = localObject6;
                localObject9 = localObject7;
                if (!localTreeMap.isEmpty())
                {
                  localObject7 = (m.b[])localTreeMap.values().toArray(new m.b[0]);
                  localObject9 = new m((String)localObject1, (m.b[])localObject7);
                  localObject4 = localObject6;
                  if (localObject6 == null) {
                    localObject4 = d((String)localObject1, (m.b[])localObject7);
                  }
                }
              }
              ((List)localObject3).add(new f.b((String)localObject12, (f.d)localObject10, l15, i16, l7, (m)localObject9, (String)localObject5, str3, l10, l14, bool5, i21 | i8, false));
              l7 += l15;
              l12 = l10;
              if (bool2) {
                l12 = l10 + l14;
              }
              l10 = l13;
              i8 = i5;
              localObject6 = localObject4;
              localObject7 = localObject9;
              localObject9 = localObject1;
            }
            label2428:
            if (!((String)localObject11).startsWith("#"))
            {
              localObject12 = e(l13, (String)localObject5, (String)localObject8);
              l13 += 1L;
              str3 = B((String)localObject11, localHashMap1);
              localObject9 = (f.d)localHashMap2.get(str3);
              i8 = l8 < -1L;
              if (i8 == 0)
              {
                l6 = 0L;
                localObject4 = localObject9;
              }
              else
              {
                localObject4 = localObject9;
                if (i18 != 0)
                {
                  localObject4 = localObject9;
                  if (localObject10 == null)
                  {
                    localObject4 = localObject9;
                    if (localObject9 == null)
                    {
                      localObject4 = new f.d(str3, 0L, l6, null, null);
                      localHashMap2.put(str3, localObject4);
                    }
                  }
                }
              }
              if ((localObject7 == null) && (!localTreeMap.isEmpty()))
              {
                m.b[] arrayOfb = (m.b[])localTreeMap.values().toArray(new m.b[0]);
                localObject11 = new m((String)localObject1, arrayOfb);
                localObject9 = localObject11;
                localObject7 = localObject6;
                if (localObject6 == null)
                {
                  localObject7 = d((String)localObject1, arrayOfb);
                  localObject9 = localObject11;
                }
              }
              else
              {
                localObject9 = localObject7;
                localObject7 = localObject6;
              }
              if (localObject10 != null) {
                localObject4 = localObject10;
              }
              localArrayList1.add(new f.d(str3, (f.d)localObject4, str2, l11, i16, l9, (m)localObject9, (String)localObject5, (String)localObject12, l6, l8, i14, (List)localObject3));
              l7 = l9 + l11;
              localObject6 = new ArrayList();
              l10 = l6;
              if (i8 != 0) {
                l10 = l6 + l8;
              }
              l6 = l10;
              localObject3 = paramg;
              i14 = 0;
              localObject11 = localObject8;
              localObject8 = localObject9;
              str2 = str1;
              l9 = l7;
              i8 = i5;
              localObject4 = localObject2;
              l8 = -1L;
              l11 = 0L;
              localObject9 = localObject1;
              l10 = l13;
              localObject2 = paramf;
              i5 = i14;
              localObject1 = localObject3;
              localObject3 = localObject6;
              localObject6 = localObject7;
              localObject7 = localObject8;
              localObject8 = localObject11;
            }
            else
            {
              label2800:
              localObject1 = paramg;
              i5 = 0;
              localObject2 = paramf;
            }
          }
        }
      }
    }
    paramf = new HashMap();
    while (i5 < localArrayList2.size())
    {
      paramb = (f.c)localArrayList2.get(i5);
      l8 = b;
      l6 = l8;
      if (l8 == -1L) {
        l6 = l3 + localArrayList1.size() - ((List)localObject3).isEmpty();
      }
      i16 = c;
      if (i16 == -1) {
        if (l5 != -9223372036854775807L)
        {
          if (((List)localObject3).isEmpty()) {
            paramg = dA;
          } else {
            paramg = (g)localObject3;
          }
          i16 = paramg.size() - 1;
        }
        else {}
      }
      paramg = a;
      paramf.put(paramg, new f.c(paramg, l6, i16));
      i5++;
    }
    if (localb != null) {
      ((List)localObject3).add(localb);
    }
    if (l2 != 0L) {
      bool5 = true;
    } else {
      bool5 = false;
    }
    return new f(i8, paramString, (List)localObject4, l1, i19, l2, bool4, i10, l3, i12, l4, l5, bool1, bool3, bool5, (m)localObject6, localArrayList1, (List)localObject3, localf, paramf);
  }
  
  public static g p(b paramb, String paramString)
  {
    Object localObject1 = new HashMap();
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject2 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject3 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    Object localObject4 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    ArrayList localArrayList5 = new ArrayList();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3;
    Object localObject5;
    label316:
    label440:
    Object localObject8;
    String str1;
    Object localObject10;
    Object localObject11;
    label731:
    for (;;)
    {
      bool3 = paramb.a();
      localObject5 = "application/x-mpegURL";
      if (!bool3) {
        break label742;
      }
      localObject5 = paramb.b();
      if (((String)localObject5).startsWith("#EXT")) {
        localArrayList5.add(localObject5);
      }
      boolean bool4 = ((String)localObject5).startsWith("#EXT-X-I-FRAME-STREAM-INF");
      if (((String)localObject5).startsWith("#EXT-X-DEFINE")) {
        localHashMap.put(z((String)localObject5, P, localHashMap), z((String)localObject5, Z, localHashMap));
      }
      for (;;)
      {
        break;
        if (((String)localObject5).equals("#EXT-X-INDEPENDENT-SEGMENTS"))
        {
          bool1 = true;
          break;
        }
        if (((String)localObject5).startsWith("#EXT-X-MEDIA"))
        {
          ((ArrayList)localObject4).add(localObject5);
        }
        else if (((String)localObject5).startsWith("#EXT-X-SESSION-KEY"))
        {
          localObject6 = k((String)localObject5, u((String)localObject5, I, "identity", localHashMap), localHashMap);
          if (localObject6 != null) {
            localArrayList4.add(new m(l(z((String)localObject5, H, localHashMap)), new m.b[] { localObject6 }));
          }
        }
        else
        {
          if ((((String)localObject5).startsWith("#EXT-X-STREAM-INF")) || (bool4)) {
            break label316;
          }
        }
      }
      break label731;
      bool3 = ((String)localObject5).contains("CLOSED-CAPTIONS=NONE");
      int i1;
      if (bool4) {
        i1 = 16384;
      } else {
        i1 = 0;
      }
      int i2 = m((String)localObject5, h);
      int i3 = s((String)localObject5, c, -1);
      localObject6 = v((String)localObject5, j, localHashMap);
      localObject7 = v((String)localObject5, k, localHashMap);
      if (localObject7 != null)
      {
        localObject7 = M.b1((String)localObject7, "x");
        i4 = Integer.parseInt(localObject7[0]);
        i5 = Integer.parseInt(localObject7[1]);
        if ((i4 > 0) && (i5 > 0)) {
          break label440;
        }
        i5 = -1;
        i4 = -1;
      }
      else
      {
        i4 = -1;
        i5 = -1;
      }
      localObject7 = v((String)localObject5, l, localHashMap);
      if (localObject7 != null) {}
      for (float f1 = Float.parseFloat((String)localObject7);; f1 = -1.0F) {
        break;
      }
      localObject8 = v((String)localObject5, d, localHashMap);
      str1 = v((String)localObject5, e, localHashMap);
      localObject9 = v((String)localObject5, f, localHashMap);
      localObject10 = v((String)localObject5, g, localHashMap);
      if (bool4) {}
      for (localObject5 = z((String)localObject5, K, localHashMap);; localObject5 = B(paramb.b(), localHashMap))
      {
        localObject11 = G.f(paramString, (String)localObject5);
        break;
        if (!paramb.a()) {
          break label734;
        }
      }
      localArrayList1.add(new g.b((Uri)localObject11, new q.b().Z(localArrayList1.size()).Q("application/x-mpegURL").O((String)localObject6).M(i3).j0(i2).v0(i4).Y(i5).X(f1).m0(i1).K(), (String)localObject8, str1, (String)localObject9, (String)localObject10));
      localObject6 = localObject1;
      localObject7 = (ArrayList)((HashMap)localObject6).get(localObject11);
      localObject5 = localObject7;
      if (localObject7 == null)
      {
        localObject5 = new ArrayList();
        ((HashMap)localObject6).put(localObject11, localObject5);
      }
      ((ArrayList)localObject5).add(new t.b(i3, i2, (String)localObject8, str1, (String)localObject9, (String)localObject10));
      bool2 |= bool3;
    }
    label734:
    throw A.c("#EXT-X-STREAM-INF must be followed by another line", null);
    label742:
    paramb = (b)localObject3;
    localObject3 = localObject4;
    Object localObject9 = new ArrayList();
    Object localObject7 = new HashSet();
    for (int i4 = 0; i4 < localArrayList1.size(); i4++)
    {
      localObject6 = (g.b)localArrayList1.get(i4);
      if (((HashSet)localObject7).add(a))
      {
        if (b.k == null) {
          bool3 = true;
        } else {
          bool3 = false;
        }
        a.f(bool3);
        localObject4 = new x(new x.b[] { new t(null, null, (List)a.e((ArrayList)((HashMap)localObject1).get(a))) });
        ((ArrayList)localObject9).add(((g.b)localObject6).a(b.a().h0((x)localObject4).K()));
      }
    }
    localObject4 = null;
    Object localObject6 = localObject4;
    int i5 = 0;
    localObject1 = localObject3;
    localObject3 = localObject2;
    localObject2 = paramb;
    paramb = (b)localObject6;
    while (i5 < ((ArrayList)localObject1).size())
    {
      localObject7 = (String)((ArrayList)localObject1).get(i5);
      localObject11 = z((String)localObject7, Q, localHashMap);
      str1 = z((String)localObject7, P, localHashMap);
      localObject8 = new q.b();
      localObject6 = new StringBuilder();
      ((StringBuilder)localObject6).append((String)localObject11);
      ((StringBuilder)localObject6).append(":");
      ((StringBuilder)localObject6).append(str1);
      localObject10 = ((q.b)localObject8).a0(((StringBuilder)localObject6).toString()).c0(str1).Q((String)localObject5).q0(x((String)localObject7)).m0(w((String)localObject7, localHashMap)).e0(v((String)localObject7, O, localHashMap));
      localObject6 = v((String)localObject7, K, localHashMap);
      if (localObject6 == null) {
        localObject6 = null;
      } else {
        localObject6 = G.f(paramString, (String)localObject6);
      }
      localObject8 = localObject1;
      x localx = new x(new x.b[] { new t((String)localObject11, str1, Collections.emptyList()) });
      localObject1 = z((String)localObject7, M, localHashMap);
      ((String)localObject1).hashCode();
      switch (((String)localObject1).hashCode())
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
              i4 = -1;
              break;
            } while (!((String)localObject1).equals("VIDEO"));
            i4 = 3;
            break;
          } while (!((String)localObject1).equals("AUDIO"));
          i4 = 2;
          break;
        } while (!((String)localObject1).equals("CLOSED-CAPTIONS"));
        i4 = 1;
        break;
      } while (!((String)localObject1).equals("SUBTITLES"));
      i4 = 0;
      switch (i4)
      {
      default: 
      case 3: 
      case 2: 
        for (;;)
        {
          break;
          localObject1 = h(localArrayList1, (String)localObject11);
          if (localObject1 != null)
          {
            localObject7 = b;
            localObject1 = M.Q(j, 2);
            ((q.b)localObject10).O((String)localObject1).o0(z.g((String)localObject1)).v0(t).Y(u).X(v);
          }
          if (localObject6 != null)
          {
            ((q.b)localObject10).h0(localx);
            ((ArrayList)localObject3).add(new g.a((Uri)localObject6, ((q.b)localObject10).K(), (String)localObject11, str1));
            continue;
            g.b localb = f(localArrayList1, (String)localObject11);
            if (localb != null)
            {
              localObject1 = M.Q(b.j, 1);
              ((q.b)localObject10).O((String)localObject1);
              localObject1 = z.g((String)localObject1);
            }
            else
            {
              localObject1 = null;
            }
            String str2 = v((String)localObject7, i, localHashMap);
            if (str2 != null)
            {
              ((q.b)localObject10).N(Integer.parseInt(M.c1(str2, "/")[0]));
              localObject7 = localObject1;
              if ("audio/eac3".equals(localObject1))
              {
                localObject7 = localObject1;
                if (str2.endsWith("/JOC"))
                {
                  ((q.b)localObject10).O("ec+3");
                  localObject7 = "audio/eac3-joc";
                }
              }
            }
            else
            {
              localObject7 = localObject1;
            }
            ((q.b)localObject10).o0((String)localObject7);
            if (localObject6 != null)
            {
              ((q.b)localObject10).h0(localx);
              localArrayList2.add(new g.a((Uri)localObject6, ((q.b)localObject10).K(), (String)localObject11, str1));
              localObject1 = localObject4;
            }
            else
            {
              localObject1 = localObject4;
              if (localb != null)
              {
                paramb = ((q.b)localObject10).K();
                localObject1 = localObject4;
              }
            }
            localObject4 = localObject1;
          }
        }
      }
      for (;;)
      {
        break label1830;
        localObject1 = z((String)localObject7, S, localHashMap);
        if (((String)localObject1).startsWith("CC"))
        {
          i4 = Integer.parseInt(((String)localObject1).substring(2));
          localObject6 = "application/cea-608";
        }
        else
        {
          i4 = Integer.parseInt(((String)localObject1).substring(7));
          localObject6 = "application/cea-708";
        }
        localObject1 = localObject4;
        if (localObject4 == null) {
          localObject1 = new ArrayList();
        }
        ((q.b)localObject10).o0((String)localObject6).L(i4);
        ((List)localObject1).add(((q.b)localObject10).K());
        break;
        localObject1 = paramb;
        paramb = g(localArrayList1, (String)localObject11);
        if (paramb != null)
        {
          paramb = M.Q(b.j, 3);
          ((q.b)localObject10).O(paramb);
          paramb = z.g(paramb);
        }
        else
        {
          paramb = null;
        }
        localObject7 = paramb;
        if (paramb == null) {
          localObject7 = "text/vtt";
        }
        ((q.b)localObject10).o0((String)localObject7).h0(localx);
        if (localObject6 != null)
        {
          ((ArrayList)localObject2).add(new g.a((Uri)localObject6, ((q.b)localObject10).K(), (String)localObject11, str1));
          paramb = (b)localObject1;
        }
        else
        {
          g0.o.h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
          paramb = (b)localObject1;
        }
      }
      label1830:
      i5++;
      localObject1 = localObject8;
    }
    if (bool2) {
      localObject4 = Collections.emptyList();
    }
    return new g(paramString, localArrayList5, (List)localObject9, (List)localObject3, localArrayList2, (List)localObject2, localArrayList3, paramb, (List)localObject4, bool1, localHashMap, localArrayList4);
  }
  
  public static boolean q(String paramString, Pattern paramPattern, boolean paramBoolean)
  {
    paramString = paramPattern.matcher(paramString);
    if (paramString.find()) {
      return "YES".equals(paramString.group(1));
    }
    return paramBoolean;
  }
  
  public static double r(String paramString, Pattern paramPattern, double paramDouble)
  {
    paramString = paramPattern.matcher(paramString);
    if (paramString.find()) {
      return Double.parseDouble((String)a.e(paramString.group(1)));
    }
    return paramDouble;
  }
  
  public static int s(String paramString, Pattern paramPattern, int paramInt)
  {
    paramString = paramPattern.matcher(paramString);
    if (paramString.find()) {
      return Integer.parseInt((String)a.e(paramString.group(1)));
    }
    return paramInt;
  }
  
  public static long t(String paramString, Pattern paramPattern, long paramLong)
  {
    paramString = paramPattern.matcher(paramString);
    if (paramString.find()) {
      return Long.parseLong((String)a.e(paramString.group(1)));
    }
    return paramLong;
  }
  
  public static String u(String paramString1, Pattern paramPattern, String paramString2, Map paramMap)
  {
    paramString1 = paramPattern.matcher(paramString1);
    if (paramString1.find()) {
      paramString2 = (String)a.e(paramString1.group(1));
    }
    paramString1 = paramString2;
    if (!paramMap.isEmpty()) {
      if (paramString2 == null) {
        paramString1 = paramString2;
      } else {
        paramString1 = B(paramString2, paramMap);
      }
    }
    return paramString1;
  }
  
  public static String v(String paramString, Pattern paramPattern, Map paramMap)
  {
    return u(paramString, paramPattern, null, paramMap);
  }
  
  public static int w(String paramString, Map paramMap)
  {
    paramString = v(paramString, R, paramMap);
    boolean bool = TextUtils.isEmpty(paramString);
    int i1 = 0;
    if (bool) {
      return 0;
    }
    paramString = M.b1(paramString, ",");
    if (M.s(paramString, "public.accessibility.describes-video")) {
      i1 = 512;
    }
    int i2 = i1;
    if (M.s(paramString, "public.accessibility.transcribes-spoken-dialog")) {
      i2 = i1 | 0x1000;
    }
    i1 = i2;
    if (M.s(paramString, "public.accessibility.describes-music-and-sound")) {
      i1 = i2 | 0x400;
    }
    i2 = i1;
    if (M.s(paramString, "public.easy-to-read")) {
      i2 = i1 | 0x2000;
    }
    return i2;
  }
  
  public static int x(String paramString)
  {
    boolean bool1 = q(paramString, U, false);
    boolean bool2 = bool1;
    int i2;
    if (q(paramString, V, false)) {
      i2 = bool1 | true;
    }
    bool1 = i2;
    int i1;
    if (q(paramString, T, false)) {
      i1 = i2 | 0x4;
    }
    return i1;
  }
  
  public static f.f y(String paramString)
  {
    double d1 = r(paramString, r, -9.223372036854776E18D);
    long l1 = -9223372036854775807L;
    long l2;
    if (d1 == -9.223372036854776E18D) {
      l2 = -9223372036854775807L;
    } else {
      l2 = (d1 * 1000000.0D);
    }
    boolean bool = q(paramString, s, false);
    d1 = r(paramString, u, -9.223372036854776E18D);
    long l3;
    if (d1 == -9.223372036854776E18D) {
      l3 = -9223372036854775807L;
    } else {
      l3 = (d1 * 1000000.0D);
    }
    d1 = r(paramString, v, -9.223372036854776E18D);
    if (d1 != -9.223372036854776E18D) {
      for (;;)
      {
        l1 = (d1 * 1000000.0D);
      }
    }
    return new f.f(l2, bool, l3, l1, q(paramString, w, false));
  }
  
  public static String z(String paramString, Pattern paramPattern, Map paramMap)
  {
    paramMap = v(paramString, paramPattern, paramMap);
    if (paramMap != null) {
      return paramMap;
    }
    paramMap = new StringBuilder();
    paramMap.append("Couldn't match ");
    paramMap.append(paramPattern.pattern());
    paramMap.append(" in ");
    paramMap.append(paramString);
    throw A.c(paramMap.toString(), null);
  }
  
  public h i(Uri paramUri, InputStream paramInputStream)
  {
    paramInputStream = new BufferedReader(new InputStreamReader(paramInputStream));
    ArrayDeque localArrayDeque = new ArrayDeque();
    try
    {
      if (b(paramInputStream))
      {
        do
        {
          localObject = paramInputStream.readLine();
          if (localObject == null) {
            break;
          }
          localObject = ((String)localObject).trim();
        } while (((String)localObject).isEmpty());
        if (((String)localObject).startsWith("#EXT-X-STREAM-INF"))
        {
          localArrayDeque.add(localObject);
          localObject = new r0/i$b;
          ((b)localObject).<init>(localArrayDeque, paramInputStream);
          paramUri = p((b)localObject, paramUri.toString());
          M.m(paramInputStream);
          return paramUri;
        }
      }
    }
    finally
    {
      for (;;)
      {
        Object localObject;
        break;
        if ((!((String)localObject).startsWith("#EXT-X-TARGETDURATION")) && (!((String)localObject).startsWith("#EXT-X-MEDIA-SEQUENCE")) && (!((String)localObject).startsWith("#EXTINF")) && (!((String)localObject).startsWith("#EXT-X-KEY")) && (!((String)localObject).startsWith("#EXT-X-BYTERANGE")) && (!((String)localObject).equals("#EXT-X-DISCONTINUITY")) && (!((String)localObject).equals("#EXT-X-DISCONTINUITY-SEQUENCE")) && (!((String)localObject).equals("#EXT-X-ENDLIST")))
        {
          localArrayDeque.add(localObject);
        }
        else
        {
          localArrayDeque.add(localObject);
          localObject = a;
          f localf = b;
          b localb = new r0/i$b;
          localb.<init>(localArrayDeque, paramInputStream);
          paramUri = o((g)localObject, localf, localb, paramUri.toString());
          M.m(paramInputStream);
          return paramUri;
          M.m(paramInputStream);
          throw A.c("Failed to parse the playlist, could not identify any tags.", null);
          throw A.c("Input does not start with the #EXTM3U header.", null);
        }
      }
      M.m(paramInputStream);
    }
  }
  
  public static final class a
    extends IOException
  {}
  
  public static class b
  {
    public final BufferedReader a;
    public final Queue b;
    public String c;
    
    public b(Queue paramQueue, BufferedReader paramBufferedReader)
    {
      b = paramQueue;
      a = paramBufferedReader;
    }
    
    public boolean a()
    {
      if (c != null) {
        return true;
      }
      if (!b.isEmpty())
      {
        c = ((String)a.e((String)b.poll()));
        return true;
      }
      String str;
      do
      {
        str = a.readLine();
        c = str;
        if (str == null) {
          break;
        }
        str = str.trim();
        c = str;
      } while (str.isEmpty());
      return true;
      return false;
    }
    
    public String b()
    {
      if (a())
      {
        String str = c;
        c = null;
        return str;
      }
      throw new NoSuchElementException();
    }
  }
}

/* Location:
 * Qualified Name:     r0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */