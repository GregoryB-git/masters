package f5;

import a4.d;
import a4.d.b;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import e5.o;
import e5.o.b;
import java.io.BufferedReader;
import java.io.IOException;
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
import p2.m0;
import p4.a;
import p4.a.b;
import t5.f0.a;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.d0;
import v5.e0;
import v5.p;
import x6.b;

public final class h
  implements f0.a<g>
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
  public static final Pattern T = b("AUTOSELECT");
  public static final Pattern U = b("DEFAULT");
  public static final Pattern V = b("FORCED");
  public static final Pattern W = b("INDEPENDENT");
  public static final Pattern X = b("GAP");
  public static final Pattern Y = b("PRECISE");
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
  public static final Pattern s = b("CAN-SKIP-DATERANGES");
  public static final Pattern t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
  public static final Pattern u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
  public static final Pattern v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
  public static final Pattern w = b("CAN-BLOCK-RELOAD");
  public static final Pattern x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
  public static final Pattern y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
  public static final Pattern z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
  public final f a;
  public final e b;
  
  public h(f paramf, e parame)
  {
    a = paramf;
    b = parame;
  }
  
  public static Pattern b(String paramString)
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
  
  public static d c(String paramString, d.b[] paramArrayOfb)
  {
    d.b[] arrayOfb = new d.b[paramArrayOfb.length];
    for (int i1 = 0; i1 < paramArrayOfb.length; i1++)
    {
      d.b localb = paramArrayOfb[i1];
      arrayOfb[i1] = new d.b(b, c, d, null);
    }
    return new d(paramString, true, arrayOfb);
  }
  
  public static d.b d(String paramString1, String paramString2, HashMap paramHashMap)
  {
    String str = k(paramString1, J, "1", paramHashMap);
    if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(paramString2))
    {
      paramString1 = l(paramString1, K, paramHashMap);
      return new d.b(v3.h.d, null, "video/mp4", Base64.decode(paramString1.substring(paramString1.indexOf(',')), 0));
    }
    if ("com.widevine".equals(paramString2)) {
      return new d.b(v3.h.d, null, "hls", e0.B(paramString1));
    }
    if (("com.microsoft.playready".equals(paramString2)) && ("1".equals(str)))
    {
      paramString1 = l(paramString1, K, paramHashMap);
      paramString2 = Base64.decode(paramString1.substring(paramString1.indexOf(',')), 0);
      paramString1 = v3.h.e;
      return new d.b(paramString1, null, "video/mp4", k4.h.a(paramString1, null, paramString2));
    }
    return null;
  }
  
  public static int e(String paramString, Pattern paramPattern)
  {
    return Integer.parseInt(l(paramString, paramPattern, Collections.emptyMap()));
  }
  
  public static e f(f paramf, e parame, b paramb, String paramString)
  {
    boolean bool1 = c;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Object localObject1 = new ArrayList();
    Object localObject2 = new ArrayList();
    ArrayList localArrayList = new ArrayList();
    Object localObject3 = new ArrayList();
    e.e locale = new e.e(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
    TreeMap localTreeMap = new TreeMap();
    Object localObject4 = "";
    Object localObject5 = parame;
    Object localObject6 = paramf;
    Object localObject7 = "";
    Object localObject8 = null;
    Object localObject9 = localObject8;
    Object localObject10 = localObject9;
    Object localObject11 = localObject10;
    Object localObject12 = localObject11;
    Object localObject13 = localObject12;
    long l1 = 0L;
    long l2 = l1;
    long l3 = l2;
    long l4 = l3;
    long l5 = l4;
    long l6 = l5;
    long l7 = l6;
    long l8 = l7;
    int i1 = 0;
    long l9 = -9223372036854775807L;
    boolean bool2 = false;
    boolean bool3 = false;
    int i2 = 0;
    int i3 = 1;
    long l10 = -9223372036854775807L;
    long l11 = -9223372036854775807L;
    boolean bool4 = false;
    boolean bool5 = false;
    long l12 = -1L;
    int i4 = 0;
    int i5 = 0;
    Object localObject14 = localObject13;
    while (paramb.a())
    {
      Object localObject15 = paramb.b();
      if (((String)localObject15).startsWith("#EXT")) {
        ((ArrayList)localObject3).add(localObject15);
      }
      Object localObject16;
      if (((String)localObject15).startsWith("#EXT-X-PLAYLIST-TYPE"))
      {
        localObject16 = l((String)localObject15, q, localHashMap1);
        if ("VOD".equals(localObject16)) {
          i1 = 1;
        } else if ("EVENT".equals(localObject16)) {
          i1 = 2;
        }
      }
      else if (((String)localObject15).equals("#EXT-X-I-FRAMES-ONLY"))
      {
        i5 = 1;
      }
      else if (((String)localObject15).startsWith("#EXT-X-START"))
      {
        l9 = (Double.parseDouble(l((String)localObject15, C, Collections.emptyMap())) * 1000000.0D);
        bool2 = h((String)localObject15, Y);
      }
      else
      {
        localObject16 = localObject1;
        long l13;
        boolean bool6;
        long l14;
        long l15;
        if (((String)localObject15).startsWith("#EXT-X-SERVER-CONTROL"))
        {
          double d1 = i((String)localObject15, r);
          if (d1 == -9.223372036854776E18D) {
            l13 = -9223372036854775807L;
          } else {
            l13 = (d1 * 1000000.0D);
          }
          bool6 = h((String)localObject15, s);
          d1 = i((String)localObject15, u);
          if (d1 == -9.223372036854776E18D) {
            l14 = -9223372036854775807L;
          } else {
            l14 = (d1 * 1000000.0D);
          }
          d1 = i((String)localObject15, v);
          if (d1 == -9.223372036854776E18D) {
            l15 = -9223372036854775807L;
          } else {
            l15 = (d1 * 1000000.0D);
          }
          locale = new e.e(l13, bool6, l14, l15, h((String)localObject15, w));
        }
        else
        {
          if (!((String)localObject15).startsWith("#EXT-X-PART-INF")) {
            break label593;
          }
          l11 = (Double.parseDouble(l((String)localObject15, o, Collections.emptyMap())) * 1000000.0D);
        }
        localObject1 = localObject4;
        Object localObject17 = localObject2;
        localObject2 = localObject6;
        localObject4 = localObject3;
        localObject3 = localObject16;
        localObject6 = localObject9;
        localObject9 = localObject17;
        localObject16 = localObject11;
        localObject11 = localObject1;
        label593:
        if (((String)localObject15).startsWith("#EXT-X-MAP"))
        {
          localObject1 = l((String)localObject15, K, localHashMap1);
          localObject17 = k((String)localObject15, E, null, localHashMap1);
          l13 = l3;
          if (localObject17 != null)
          {
            int i6 = e0.a;
            localObject17 = ((String)localObject17).split("@", -1);
            l14 = Long.parseLong(localObject17[0]);
            l13 = l3;
            l12 = l14;
            if (localObject17.length > 1)
            {
              l13 = Long.parseLong(localObject17[1]);
              l12 = l14;
            }
          }
          boolean bool7 = l12 < -1L;
          if (!bool7) {
            l13 = 0L;
          }
          if ((localObject10 != null) && (localObject11 == null)) {
            throw a1.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
          }
          localObject13 = new e.c(l13, l12, (String)localObject1, (String)localObject10, (String)localObject11);
          l3 = l13;
          if (bool7) {
            l3 = l13 + l12;
          }
          localObject1 = localObject16;
          l12 = -1L;
        }
        else
        {
          bool6 = ((String)localObject15).startsWith("#EXT-X-TARGETDURATION");
          localObject17 = localObject4;
          if (bool6)
          {
            l10 = e((String)localObject15, m) * 1000000L;
          }
          else if (((String)localObject15).startsWith("#EXT-X-MEDIA-SEQUENCE"))
          {
            l2 = Long.parseLong(l((String)localObject15, x, Collections.emptyMap()));
            l4 = l2;
          }
          for (localObject1 = localObject17;; localObject1 = localObject4)
          {
            localObject17 = localObject2;
            localObject4 = localObject3;
            localObject3 = localObject16;
            localObject2 = localObject6;
            localObject6 = localObject9;
            localObject9 = localObject17;
            localObject16 = localObject11;
            localObject11 = localObject1;
            break label1632;
            if (((String)localObject15).startsWith("#EXT-X-VERSION"))
            {
              i3 = e((String)localObject15, p);
              break;
            }
            if (((String)localObject15).startsWith("#EXT-X-DEFINE"))
            {
              localObject5 = k((String)localObject15, a0, null, localHashMap1);
              if (localObject5 != null)
              {
                localObject16 = (String)l.get(localObject5);
                if (localObject16 == null) {
                  break label1002;
                }
                localObject6 = localObject5;
                localObject5 = localObject16;
              }
              else
              {
                localObject6 = l((String)localObject15, P, localHashMap1);
                localObject5 = l((String)localObject15, Z, localHashMap1);
              }
              localHashMap1.put(localObject6, localObject5);
              label1002:
              break label2438;
            }
            if (!((String)localObject15).startsWith("#EXTINF")) {
              break label1073;
            }
            l7 = new BigDecimal(l((String)localObject15, y, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
            localObject7 = k((String)localObject15, z, (String)localObject17, localHashMap1);
          }
          label1073:
          int i7;
          int i9;
          if (((String)localObject15).startsWith("#EXT-X-SKIP"))
          {
            i7 = e((String)localObject15, t);
            if ((localObject5 != null) && (((ArrayList)localObject16).isEmpty())) {
              bool6 = true;
            } else {
              bool6 = false;
            }
            b.H(bool6);
            i9 = e0.a;
            i9 = (int)(l2 - k);
            int i10 = i7 + i9;
            if ((i9 >= 0) && (i10 <= r.size()))
            {
              i7 = i4;
              localObject4 = localObject11;
              localObject1 = localObject9;
              localObject11 = localObject5;
              localObject9 = localObject17;
              i4 = i10;
              while (i9 < i4)
              {
                localObject1 = (e.c)r.get(i9);
                if (l2 != k)
                {
                  i10 = j - i2 + d;
                  localObject6 = new ArrayList();
                  l5 = l6;
                  for (i7 = 0; i7 < u.size(); i7++)
                  {
                    localObject11 = (e.a)u.get(i7);
                    ((ArrayList)localObject6).add(new e.a(a, b, c, i10, l5, f, o, p, q, r, s, t, u));
                    l5 += c;
                  }
                  localObject11 = localObject3;
                  localObject3 = new e.c(a, b, t, c, i10, l6, f, o, p, q, r, s, (List)localObject6);
                }
                else
                {
                  localObject11 = localObject1;
                  localObject1 = localObject3;
                  localObject3 = localObject11;
                  localObject11 = localObject1;
                }
                ((ArrayList)localObject16).add(localObject3);
                l6 += c;
                l5 = r;
                if (l5 != -1L) {
                  l3 = q + l5;
                }
                i7 = d;
                localObject13 = b;
                localObject1 = f;
                localObject10 = o;
                localObject6 = p;
                if ((localObject6 == null) || (!((String)localObject6).equals(Long.toHexString(l4)))) {
                  localObject4 = p;
                }
                l4 += 1L;
                i9++;
                localObject3 = localObject11;
                l5 = l6;
                localObject11 = parame;
              }
              localObject6 = localObject2;
              localObject17 = localObject16;
              localObject2 = paramf;
              localObject5 = parame;
              localObject11 = localObject9;
              i4 = i7;
              localObject16 = localObject4;
              localObject9 = localObject6;
              localObject6 = localObject1;
              localObject4 = localObject3;
              localObject3 = localObject17;
              label1632:
              localObject1 = localObject3;
              localObject3 = localObject4;
              localObject17 = localObject2;
              localObject2 = localObject9;
              localObject4 = localObject11;
              localObject9 = localObject6;
              localObject11 = localObject16;
              localObject6 = localObject17;
            }
            else
            {
              throw new a();
            }
          }
          else
          {
            localObject6 = localObject2;
            Object localObject18 = localObject3;
            if (((String)localObject15).startsWith("#EXT-X-KEY"))
            {
              localObject3 = l((String)localObject15, H, localHashMap1);
              localObject10 = k((String)localObject15, I, "identity", localHashMap1);
              if ("NONE".equals(localObject3))
              {
                localTreeMap.clear();
                localObject9 = null;
                localObject10 = null;
                localObject11 = null;
              }
              else
              {
                localObject1 = k((String)localObject15, L, null, localHashMap1);
                if ("identity".equals(localObject10))
                {
                  localObject11 = localObject9;
                  localObject2 = localObject12;
                  if ("AES-128".equals(localObject3))
                  {
                    localObject10 = l((String)localObject15, K, localHashMap1);
                    localObject11 = localObject1;
                    break label2164;
                  }
                }
                else
                {
                  if (localObject12 == null)
                  {
                    if ((!"SAMPLE-AES-CENC".equals(localObject3)) && (!"SAMPLE-AES-CTR".equals(localObject3))) {
                      localObject2 = "cbcs";
                    } else {
                      localObject2 = "cenc";
                    }
                    localObject3 = localObject2;
                  }
                  else
                  {
                    localObject3 = localObject12;
                  }
                  localObject12 = d((String)localObject15, (String)localObject10, localHashMap1);
                  localObject11 = localObject9;
                  localObject2 = localObject3;
                  if (localObject12 != null)
                  {
                    localTreeMap.put(localObject10, localObject12);
                    localObject11 = null;
                    localObject2 = localObject3;
                  }
                }
                localObject10 = null;
                localObject9 = localObject11;
                localObject11 = localObject1;
                localObject12 = localObject2;
              }
            }
            else
            {
              localObject5 = localObject12;
              if (((String)localObject15).startsWith("#EXT-X-BYTERANGE"))
              {
                localObject2 = l((String)localObject15, D, localHashMap1);
                i7 = e0.a;
                localObject2 = ((String)localObject2).split("@", -1);
                l14 = Long.parseLong(localObject2[0]);
                l13 = l1;
                l12 = l14;
                i7 = i4;
                if (localObject2.length > 1)
                {
                  l3 = Long.parseLong(localObject2[1]);
                  l13 = l1;
                  l12 = l14;
                  i7 = i4;
                }
              }
              else if (((String)localObject15).startsWith("#EXT-X-DISCONTINUITY-SEQUENCE"))
              {
                i2 = Integer.parseInt(((String)localObject15).substring(((String)localObject15).indexOf(':') + 1));
                localObject1 = localObject16;
                localObject3 = localObject18;
                localObject12 = localObject5;
                localObject2 = localObject6;
                localObject4 = localObject17;
                bool3 = true;
              }
            }
            for (;;)
            {
              localObject5 = parame;
              localObject6 = paramf;
              break;
              if (((String)localObject15).equals("#EXT-X-DISCONTINUITY"))
              {
                i7 = i4 + 1;
                l13 = l1;
              }
              else
              {
                if (!((String)localObject15).startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                  break label2186;
                }
                if (l1 != 0L) {
                  break label2183;
                }
                l13 = e0.I(e0.L(((String)localObject15).substring(((String)localObject15).indexOf(':') + 1))) - l6;
                i7 = i4;
              }
              localObject12 = localObject5;
              i4 = i7;
              l1 = l13;
              label2164:
              localObject1 = localObject16;
              localObject3 = localObject18;
              localObject2 = localObject6;
              localObject6 = localObject9;
              label2183:
              label2186:
              if (((String)localObject15).equals("#EXT-X-GAP"))
              {
                localObject1 = localObject16;
                localObject3 = localObject18;
                localObject12 = localObject5;
                localObject2 = localObject6;
                localObject4 = localObject17;
                bool5 = true;
              }
              else if (((String)localObject15).equals("#EXT-X-INDEPENDENT-SEGMENTS"))
              {
                localObject1 = localObject16;
                localObject3 = localObject18;
                localObject12 = localObject5;
                localObject2 = localObject6;
                localObject4 = localObject17;
                bool1 = true;
              }
              else if (((String)localObject15).equals("#EXT-X-ENDLIST"))
              {
                localObject1 = localObject16;
                localObject3 = localObject18;
                localObject12 = localObject5;
                localObject2 = localObject6;
                localObject4 = localObject17;
                bool4 = true;
              }
              else
              {
                if (((String)localObject15).startsWith("#EXT-X-RENDITION-REPORT"))
                {
                  l13 = j((String)localObject15, A);
                  localObject6 = B.matcher((CharSequence)localObject15);
                  if (((Matcher)localObject6).find())
                  {
                    localObject6 = ((Matcher)localObject6).group(1);
                    localObject6.getClass();
                    i7 = Integer.parseInt((String)localObject6);
                  }
                  else
                  {
                    i7 = -1;
                  }
                  localArrayList.add(new e.b(Uri.parse(d0.c(paramString, l((String)localObject15, K, localHashMap1))), l13, i7));
                }
                else
                {
                  if (!((String)localObject15).startsWith("#EXT-X-PRELOAD-HINT")) {
                    break label2662;
                  }
                  if ((localObject14 == null) && ("PART".equals(l((String)localObject15, N, localHashMap1)))) {
                    break label2445;
                  }
                }
                label2438:
                l13 = l5;
                break label3408;
                label2445:
                localObject18 = l((String)localObject15, K, localHashMap1);
                l13 = j((String)localObject15, F);
                l14 = j((String)localObject15, G);
                if (localObject10 == null) {
                  localObject16 = null;
                } else if (localObject11 != null) {
                  localObject16 = localObject11;
                } else {
                  localObject16 = Long.toHexString(l4);
                }
                localObject17 = localObject8;
                localObject2 = localObject9;
                if (localObject9 == null)
                {
                  localObject17 = localObject8;
                  localObject2 = localObject9;
                  if (!localTreeMap.isEmpty())
                  {
                    localObject9 = (d.b[])localTreeMap.values().toArray(new d.b[0]);
                    localObject2 = new d((String)localObject5, true, (d.b[])localObject9);
                    localObject17 = localObject8;
                    if (localObject8 == null) {
                      localObject17 = c((String)localObject5, (d.b[])localObject9);
                    }
                  }
                }
                boolean bool8 = l13 < -1L;
                if ((!bool8) || (l14 != -1L))
                {
                  if (!bool8) {
                    l13 = 0L;
                  }
                  localObject14 = new e.a((String)localObject18, (e.c)localObject13, 0L, i4, l5, (d)localObject2, (String)localObject10, (String)localObject16, l13, l14, false, false, true);
                }
                localObject9 = localObject6;
                localObject8 = localObject17;
                break label3424;
                label2662:
                Object localObject19;
                if (((String)localObject15).startsWith("#EXT-X-PART"))
                {
                  if (localObject10 == null) {
                    localObject16 = null;
                  } else if (localObject11 != null) {
                    localObject16 = localObject11;
                  } else {
                    localObject16 = Long.toHexString(l4);
                  }
                  localObject18 = l((String)localObject15, K, localHashMap1);
                  l13 = (Double.parseDouble(l((String)localObject15, n, Collections.emptyMap())) * 1000000.0D);
                  boolean bool10 = h((String)localObject15, W);
                  if ((bool1) && (((List)localObject6).isEmpty())) {
                    bool8 = true;
                  } else {
                    bool8 = false;
                  }
                  bool6 = h((String)localObject15, X);
                  localObject17 = k((String)localObject15, E, null, localHashMap1);
                  if (localObject17 != null)
                  {
                    i9 = e0.a;
                    localObject17 = ((String)localObject17).split("@", -1);
                    l14 = Long.parseLong(localObject17[0]);
                    if (localObject17.length > 1) {
                      l8 = Long.parseLong(localObject17[1]);
                    }
                  }
                  else
                  {
                    l14 = -1L;
                  }
                  boolean bool9 = l14 < -1L;
                  if (!bool9) {
                    l8 = 0L;
                  }
                  localObject15 = localObject8;
                  localObject17 = localObject9;
                  if (localObject9 == null)
                  {
                    localObject15 = localObject8;
                    localObject17 = localObject9;
                    if (!localTreeMap.isEmpty())
                    {
                      localObject9 = (d.b[])localTreeMap.values().toArray(new d.b[0]);
                      localObject17 = new d((String)localObject5, true, (d.b[])localObject9);
                      localObject15 = localObject8;
                      if (localObject8 == null) {
                        localObject15 = c((String)localObject5, (d.b[])localObject9);
                      }
                    }
                  }
                  ((List)localObject6).add(new e.a((String)localObject18, (e.c)localObject13, l13, i4, l5, (d)localObject17, (String)localObject10, (String)localObject16, l8, l14, bool6, bool10 | bool8, false));
                  l15 = l5 + l13;
                  localObject19 = localObject15;
                  localObject18 = localObject17;
                  l13 = l15;
                  l5 = l8;
                  if (bool9)
                  {
                    l5 = l8 + l14;
                    l13 = l15;
                    localObject18 = localObject17;
                    localObject19 = localObject15;
                  }
                }
                do
                {
                  localObject8 = localObject19;
                  localObject9 = localObject18;
                  l8 = l5;
                  break;
                  localObject19 = localObject8;
                  localObject18 = localObject9;
                  l13 = l5;
                  l5 = l8;
                } while (((String)localObject15).startsWith("#"));
                if (localObject10 == null) {
                  localObject2 = null;
                } else if (localObject11 != null) {
                  localObject2 = localObject11;
                } else {
                  localObject2 = Long.toHexString(l4);
                }
                String str = m((String)localObject15, localHashMap1);
                localObject18 = (e.c)localHashMap2.get(str);
                bool8 = l12 < -1L;
                if (!bool8)
                {
                  l5 = 0L;
                  localObject19 = localObject18;
                }
                else
                {
                  localObject19 = localObject18;
                  if (i5 != 0)
                  {
                    localObject19 = localObject18;
                    if (localObject13 == null)
                    {
                      localObject19 = localObject18;
                      if (localObject18 == null)
                      {
                        localObject19 = new e.c(0L, l3, str, null, null);
                        localHashMap2.put(str, localObject19);
                      }
                    }
                  }
                  l5 = l3;
                }
                if ((localObject9 == null) && (!localTreeMap.isEmpty()))
                {
                  d.b[] arrayOfb = (d.b[])localTreeMap.values().toArray(new d.b[0]);
                  localObject15 = new d((String)localObject5, true, arrayOfb);
                  localObject9 = localObject15;
                  localObject18 = localObject8;
                  if (localObject8 == null)
                  {
                    localObject18 = c((String)localObject5, arrayOfb);
                    localObject9 = localObject15;
                  }
                }
                else
                {
                  localObject18 = localObject8;
                }
                if (localObject13 != null) {
                  localObject19 = localObject13;
                }
                ((ArrayList)localObject16).add(new e.c(str, (e.c)localObject19, (String)localObject7, l7, i4, l6, (d)localObject9, (String)localObject10, (String)localObject2, l5, l12, bool5, (List)localObject6));
                l6 += l7;
                localObject8 = new ArrayList();
                l3 = l5;
                if (bool8) {
                  l3 = l5 + l12;
                }
                localObject2 = localObject9;
                l7 = 0L;
                l4 += 1L;
                l5 = l6;
                localObject7 = localObject17;
                bool5 = false;
                l12 = -1L;
                localObject9 = localObject8;
                localObject8 = localObject18;
                break label3424;
                label3408:
                localObject6 = localObject2;
                l5 = l13;
                localObject2 = localObject9;
                localObject9 = localObject6;
                label3424:
                localObject6 = localObject2;
                localObject2 = localObject9;
                localObject9 = localObject6;
              }
            }
          }
        }
      }
    }
    parame = new HashMap();
    for (i4 = 0; i4 < localArrayList.size(); i4++)
    {
      paramb = (e.b)localArrayList.get(i4);
      l8 = b;
      l3 = l8;
      if (l8 == -1L) {
        l3 = l2 + ((ArrayList)localObject1).size() - ((List)localObject2).isEmpty();
      }
      int i8 = c;
      if (i8 == -1) {
        if (l11 != -9223372036854775807L)
        {
          if (((List)localObject2).isEmpty()) {
            paramf = Ku;
          } else {
            paramf = (f)localObject2;
          }
          i8 = paramf.size() - 1;
        }
        else {}
      }
      paramf = a;
      parame.put(paramf, new e.b(paramf, l3, i8));
    }
    if (localObject14 != null) {
      ((List)localObject2).add(localObject14);
    }
    if (l1 != 0L) {
      bool5 = true;
    } else {
      bool5 = false;
    }
    return new e(i1, paramString, (List)localObject3, l9, bool2, l1, bool3, i2, l2, i3, l10, l11, bool1, bool4, bool5, (d)localObject8, (List)localObject1, (List)localObject2, locale, parame);
  }
  
  public static f g(b paramb, String paramString)
  {
    Object localObject1 = new HashMap();
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject2 = new ArrayList();
    Object localObject3 = new ArrayList();
    Object localObject4 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject5 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3;
    Object localObject6;
    label356:
    Object localObject9;
    Object localObject10;
    Object localObject11;
    Object localObject13;
    label836:
    for (;;)
    {
      bool3 = paramb.a();
      localObject6 = "application/x-mpegURL";
      if (!bool3) {
        break label847;
      }
      localObject7 = paramb.b();
      if (((String)localObject7).startsWith("#EXT")) {
        localArrayList4.add(localObject7);
      }
      boolean bool4 = ((String)localObject7).startsWith("#EXT-X-I-FRAME-STREAM-INF");
      if (((String)localObject7).startsWith("#EXT-X-DEFINE")) {
        localHashMap.put(l((String)localObject7, P, localHashMap), l((String)localObject7, Z, localHashMap));
      }
      for (;;)
      {
        break;
        if (((String)localObject7).equals("#EXT-X-INDEPENDENT-SEGMENTS"))
        {
          bool1 = true;
        }
        else if (((String)localObject7).startsWith("#EXT-X-MEDIA"))
        {
          ((ArrayList)localObject5).add(localObject7);
        }
        else if (((String)localObject7).startsWith("#EXT-X-SESSION-KEY"))
        {
          localObject6 = d((String)localObject7, k((String)localObject7, I, "identity", localHashMap), localHashMap);
          if (localObject6 != null)
          {
            localObject7 = l((String)localObject7, H, localHashMap);
            if ((!"SAMPLE-AES-CENC".equals(localObject7)) && (!"SAMPLE-AES-CTR".equals(localObject7))) {
              localObject7 = "cbcs";
            } else {
              localObject7 = "cenc";
            }
            localArrayList3.add(new d((String)localObject7, true, new d.b[] { localObject6 }));
          }
        }
        else
        {
          if ((((String)localObject7).startsWith("#EXT-X-STREAM-INF")) || (bool4)) {
            break label356;
          }
        }
      }
      break label836;
      bool3 = ((String)localObject7).contains("CLOSED-CAPTIONS=NONE");
      if (bool4) {
        i1 = 16384;
      } else {
        i1 = 0;
      }
      int i2 = e((String)localObject7, h);
      localObject6 = c.matcher((CharSequence)localObject7);
      int i3;
      if (((Matcher)localObject6).find())
      {
        localObject6 = ((Matcher)localObject6).group(1);
        localObject6.getClass();
        i3 = Integer.parseInt((String)localObject6);
      }
      else
      {
        i3 = -1;
      }
      localObject6 = k((String)localObject7, j, null, localHashMap);
      localObject8 = k((String)localObject7, k, null, localHashMap);
      int i5;
      if (localObject8 != null)
      {
        i4 = e0.a;
        localObject8 = ((String)localObject8).split("x", -1);
        i5 = Integer.parseInt(localObject8[0]);
        int i8 = Integer.parseInt(localObject8[1]);
        if (i5 > 0)
        {
          i4 = i8;
          if (i8 > 0) {}
        }
        else
        {
          i4 = -1;
          i5 = -1;
        }
      }
      else
      {
        i5 = -1;
        i4 = -1;
      }
      localObject8 = k((String)localObject7, l, null, localHashMap);
      float f1;
      if (localObject8 != null) {
        f1 = Float.parseFloat((String)localObject8);
      } else {
        f1 = -1.0F;
      }
      localObject9 = k((String)localObject7, d, null, localHashMap);
      localObject10 = k((String)localObject7, e, null, localHashMap);
      localObject11 = k((String)localObject7, f, null, localHashMap);
      localObject12 = k((String)localObject7, g, null, localHashMap);
      if (bool4)
      {
        localObject7 = l((String)localObject7, K, localHashMap);
      }
      else
      {
        if (!paramb.a()) {
          break;
        }
        localObject7 = m(paramb.b(), localHashMap);
      }
      localObject13 = d0.d(paramString, (String)localObject7);
      localObject7 = new i0.a();
      ((i0.a)localObject7).b(localArrayList1.size());
      j = "application/x-mpegURL";
      h = ((String)localObject6);
      f = i3;
      g = i2;
      p = i5;
      q = i4;
      r = f1;
      e = i1;
      localArrayList1.add(new f.b((Uri)localObject13, new i0((i0.a)localObject7), (String)localObject9, (String)localObject10, (String)localObject11, (String)localObject12));
      localObject6 = localObject1;
      localObject8 = (ArrayList)((HashMap)localObject6).get(localObject13);
      localObject7 = localObject8;
      if (localObject8 == null)
      {
        localObject7 = new ArrayList();
        ((HashMap)localObject6).put(localObject13, localObject7);
      }
      ((ArrayList)localObject7).add(new o.b(i3, i2, (String)localObject9, (String)localObject10, (String)localObject11, (String)localObject12));
      bool2 = bool3 | bool2;
    }
    throw a1.b("#EXT-X-STREAM-INF must be followed by another line", null);
    label847:
    Object localObject7 = localObject5;
    paramb = (b)localObject2;
    localObject2 = localObject3;
    localObject5 = localObject4;
    Object localObject12 = new ArrayList();
    localObject3 = new HashSet();
    for (int i4 = 0; i4 < localArrayList1.size(); i4++)
    {
      localObject4 = (f.b)localArrayList1.get(i4);
      if (((HashSet)localObject3).add(a))
      {
        if (b.r == null) {
          bool3 = true;
        } else {
          bool3 = false;
        }
        b.H(bool3);
        localObject8 = (ArrayList)((HashMap)localObject1).get(a);
        localObject8.getClass();
        localObject8 = new a(new a.b[] { new o(null, null, (List)localObject8) });
        localObject10 = b;
        localObject10.getClass();
        localObject10 = new i0.a((i0)localObject10);
        i = ((a)localObject8);
        localObject8 = new i0((i0.a)localObject10);
        ((ArrayList)localObject12).add(new f.b(a, (i0)localObject8, c, d, e, f));
      }
    }
    localObject1 = null;
    int i1 = 0;
    Object localObject8 = null;
    localObject4 = localObject7;
    localObject3 = paramb;
    localObject7 = localObject6;
    paramb = (b)localObject8;
    while (i1 < ((ArrayList)localObject4).size())
    {
      localObject10 = (String)((ArrayList)localObject4).get(i1);
      localObject8 = l((String)localObject10, Q, localHashMap);
      localObject13 = l((String)localObject10, P, localHashMap);
      localObject9 = new i0.a();
      a = g.e((String)localObject8, ":", (String)localObject13);
      b = ((String)localObject13);
      j = ((String)localObject7);
      int i6 = h((String)localObject10, U);
      i4 = i6;
      if (h((String)localObject10, V)) {
        i4 = i6 | 0x2;
      }
      i6 = i4;
      int i7;
      if (h((String)localObject10, T)) {
        i7 = i4 | 0x4;
      }
      d = i7;
      localObject6 = k((String)localObject10, R, null, localHashMap);
      if (TextUtils.isEmpty((CharSequence)localObject6))
      {
        i7 = 0;
      }
      else
      {
        i4 = e0.a;
        localObject6 = ((String)localObject6).split(",", -1);
        if (e0.k("public.accessibility.describes-video", (Object[])localObject6)) {
          i4 = 512;
        } else {
          i4 = 0;
        }
        i7 = i4;
        if (e0.k("public.accessibility.transcribes-spoken-dialog", (Object[])localObject6)) {
          i7 = i4 | 0x1000;
        }
        i4 = i7;
        if (e0.k("public.accessibility.describes-music-and-sound", (Object[])localObject6)) {
          i4 = i7 | 0x400;
        }
        i7 = i4;
        if (e0.k("public.easy-to-read", (Object[])localObject6)) {
          i7 = i4 | 0x2000;
        }
      }
      localObject11 = localObject4;
      e = i7;
      c = k((String)localObject10, O, null, localHashMap);
      localObject4 = k((String)localObject10, K, null, localHashMap);
      if (localObject4 == null) {
        localObject4 = null;
      } else {
        localObject4 = d0.d(paramString, (String)localObject4);
      }
      a locala = new a(new a.b[] { new o((String)localObject8, (String)localObject13, Collections.emptyList()) });
      localObject6 = l((String)localObject10, M, localHashMap);
      switch (((String)localObject6).hashCode())
      {
      default: 
        break;
      case 81665115: 
        if (((String)localObject6).equals("VIDEO")) {
          i4 = 3;
        }
        break;
      case 62628790: 
        if (((String)localObject6).equals("AUDIO")) {
          i4 = 2;
        }
        break;
      case -333210994: 
        if (((String)localObject6).equals("CLOSED-CAPTIONS")) {
          i4 = 1;
        }
        break;
      case -959297733: 
        if (((String)localObject6).equals("SUBTITLES")) {
          i4 = 0;
        }
        break;
      }
      i4 = -1;
      if (i4 != 0)
      {
        if (i4 != 1)
        {
          if (i4 != 2)
          {
            if (i4 == 3)
            {
              for (i4 = 0; i4 < localArrayList1.size(); i4++)
              {
                localObject6 = (f.b)localArrayList1.get(i4);
                if (((String)localObject8).equals(c)) {
                  break label1682;
                }
              }
              localObject6 = null;
              label1682:
              if (localObject6 != null)
              {
                localObject6 = b;
                localObject8 = e0.q(2, q);
                h = ((String)localObject8);
                k = p.e((String)localObject8);
                p = y;
                q = z;
                r = A;
              }
              if (localObject4 == null) {}
            }
            else
            {
              i = locala;
              ((ArrayList)localObject3).add(new f.a((Uri)localObject4, new i0((i0.a)localObject9), (String)localObject13));
            }
            break label2307;
          }
          for (i4 = 0; i4 < localArrayList1.size(); i4++)
          {
            localObject6 = (f.b)localArrayList1.get(i4);
            if (((String)localObject8).equals(d)) {
              break label1846;
            }
          }
          localObject6 = null;
          label1846:
          localObject8 = paramb;
          if (localObject6 != null)
          {
            paramb = e0.q(1, b.q);
            h = paramb;
            paramb = p.e(paramb);
          }
          else
          {
            paramb = null;
          }
          String str = k((String)localObject10, i, null, localHashMap);
          localObject10 = paramb;
          if (str != null)
          {
            i4 = e0.a;
            x = Integer.parseInt(str.split("/", 2)[0]);
            localObject10 = paramb;
            if ("audio/eac3".equals(paramb))
            {
              localObject10 = paramb;
              if (str.endsWith("/JOC"))
              {
                h = "ec+3";
                localObject10 = "audio/eac3-joc";
              }
            }
          }
          k = ((String)localObject10);
          if (localObject4 != null)
          {
            i = locala;
            ((ArrayList)localObject2).add(new f.a((Uri)localObject4, new i0((i0.a)localObject9), (String)localObject13));
          }
          else if (localObject6 != null)
          {
            paramb = new i0((i0.a)localObject9);
            break label2147;
          }
          paramb = (b)localObject8;
          break label2307;
        }
        else
        {
          localObject4 = l((String)localObject10, S, localHashMap);
          if (((String)localObject4).startsWith("CC"))
          {
            i4 = Integer.parseInt(((String)localObject4).substring(2));
            localObject6 = "application/cea-608";
          }
          else
          {
            i4 = Integer.parseInt(((String)localObject4).substring(7));
            localObject6 = "application/cea-708";
          }
          localObject4 = localObject1;
          if (localObject1 == null) {
            localObject4 = new ArrayList();
          }
          k = ((String)localObject6);
          C = i4;
          ((List)localObject4).add(new i0((i0.a)localObject9));
          localObject1 = localObject4;
        }
      }
      else
      {
        label2147:
        localObject6 = paramb;
        for (i4 = 0; i4 < localArrayList1.size(); i4++)
        {
          paramb = (f.b)localArrayList1.get(i4);
          if (((String)localObject8).equals(e)) {
            break label2200;
          }
        }
        paramb = null;
        label2200:
        if (paramb != null)
        {
          paramb = e0.q(3, b.q);
          h = paramb;
          paramb = p.e(paramb);
        }
        else
        {
          paramb = null;
        }
        localObject8 = paramb;
        if (paramb == null) {
          localObject8 = "text/vtt";
        }
        k = ((String)localObject8);
        i = locala;
        if (localObject4 != null)
        {
          ((ArrayList)localObject5).add(new f.a((Uri)localObject4, new i0((i0.a)localObject9), (String)localObject13));
          paramb = (b)localObject6;
        }
        else
        {
          v5.m.f("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
          paramb = (b)localObject6;
        }
      }
      label2307:
      i1++;
      localObject4 = localObject11;
    }
    if (bool2) {
      localObject1 = Collections.emptyList();
    }
    return new f(paramString, localArrayList4, (List)localObject12, (List)localObject3, (List)localObject2, (List)localObject5, localArrayList2, paramb, (List)localObject1, bool1, localHashMap, localArrayList3);
  }
  
  public static boolean h(String paramString, Pattern paramPattern)
  {
    paramString = paramPattern.matcher(paramString);
    if (paramString.find()) {
      return "YES".equals(paramString.group(1));
    }
    return false;
  }
  
  public static double i(String paramString, Pattern paramPattern)
  {
    paramString = paramPattern.matcher(paramString);
    if (paramString.find())
    {
      paramString = paramString.group(1);
      paramString.getClass();
      return Double.parseDouble(paramString);
    }
    return -9.223372036854776E18D;
  }
  
  public static long j(String paramString, Pattern paramPattern)
  {
    paramString = paramPattern.matcher(paramString);
    if (paramString.find())
    {
      paramString = paramString.group(1);
      paramString.getClass();
      return Long.parseLong(paramString);
    }
    return -1L;
  }
  
  public static String k(String paramString1, Pattern paramPattern, String paramString2, Map<String, String> paramMap)
  {
    paramString1 = paramPattern.matcher(paramString1);
    if (paramString1.find())
    {
      paramString2 = paramString1.group(1);
      paramString2.getClass();
    }
    paramString1 = paramString2;
    if (!paramMap.isEmpty()) {
      if (paramString2 == null) {
        paramString1 = paramString2;
      } else {
        paramString1 = m(paramString2, paramMap);
      }
    }
    return paramString1;
  }
  
  public static String l(String paramString, Pattern paramPattern, Map<String, String> paramMap)
  {
    paramMap = k(paramString, paramPattern, null, paramMap);
    if (paramMap != null) {
      return paramMap;
    }
    paramMap = f.l("Couldn't match ");
    paramMap.append(paramPattern.pattern());
    paramMap.append(" in ");
    paramMap.append(paramString);
    throw a1.b(paramMap.toString(), null);
  }
  
  public static String m(String paramString, Map<String, String> paramMap)
  {
    paramString = b0.matcher(paramString);
    StringBuffer localStringBuffer = new StringBuffer();
    while (paramString.find())
    {
      String str = paramString.group(1);
      if (paramMap.containsKey(str)) {
        paramString.appendReplacement(localStringBuffer, Matcher.quoteReplacement((String)paramMap.get(str)));
      }
    }
    paramString.appendTail(localStringBuffer);
    return localStringBuffer.toString();
  }
  
  public final Object a(Uri paramUri, t5.m paramm)
  {
    paramm = new BufferedReader(new InputStreamReader(paramm));
    ArrayDeque localArrayDeque = new ArrayDeque();
    try
    {
      int i1 = paramm.read();
      boolean bool1 = false;
      int i2 = i1;
      if (i1 == 239)
      {
        bool2 = bool1;
        if (paramm.read() != 187) {
          break label189;
        }
        if (paramm.read() != 191)
        {
          bool2 = bool1;
          break label189;
        }
      }
      for (i2 = paramm.read(); (i2 != -1) && (Character.isWhitespace(i2)); i2 = paramm.read()) {}
      int i3;
      for (i1 = 0;; i1++)
      {
        i3 = i2;
        if (i1 >= 7) {
          break;
        }
        if (i2 != "#EXTM3U".charAt(i1))
        {
          bool2 = bool1;
          break label189;
        }
        i2 = paramm.read();
      }
      while ((i3 != -1) && (Character.isWhitespace(i3)) && (!e0.G(i3))) {
        i3 = paramm.read();
      }
      boolean bool2 = e0.G(i3);
      label189:
      if (bool2)
      {
        for (;;)
        {
          localObject = paramm.readLine();
          if (localObject == null) {
            break label418;
          }
          localObject = ((String)localObject).trim();
          if (!((String)localObject).isEmpty())
          {
            if (((String)localObject).startsWith("#EXT-X-STREAM-INF"))
            {
              localArrayDeque.add(localObject);
              localObject = new f5/h$b;
              ((b)localObject).<init>(localArrayDeque, paramm);
              paramUri = g((b)localObject, paramUri.toString());
              break label412;
            }
            if ((((String)localObject).startsWith("#EXT-X-TARGETDURATION")) || (((String)localObject).startsWith("#EXT-X-MEDIA-SEQUENCE")) || (((String)localObject).startsWith("#EXTINF")) || (((String)localObject).startsWith("#EXT-X-KEY")) || (((String)localObject).startsWith("#EXT-X-BYTERANGE")) || (((String)localObject).equals("#EXT-X-DISCONTINUITY")) || (((String)localObject).equals("#EXT-X-DISCONTINUITY-SEQUENCE")) || (((String)localObject).equals("#EXT-X-ENDLIST"))) {
              break;
            }
            localArrayDeque.add(localObject);
          }
        }
        localArrayDeque.add(localObject);
        f localf = a;
        Object localObject = b;
        b localb = new f5/h$b;
        localb.<init>(localArrayDeque, paramm);
        paramUri = f(localf, (e)localObject, localb, paramUri.toString());
        label412:
        return paramUri;
        label418:
        throw a1.b("Failed to parse the playlist, could not identify any tags.", null);
      }
      throw a1.b("Input does not start with the #EXTM3U header.", null);
    }
    finally
    {
      e0.g(paramm);
    }
  }
  
  public static final class a
    extends IOException
  {}
  
  public static final class b
  {
    public final BufferedReader a;
    public final Queue<String> b;
    public String c;
    
    public b(ArrayDeque paramArrayDeque, BufferedReader paramBufferedReader)
    {
      b = paramArrayDeque;
      a = paramBufferedReader;
    }
    
    public final boolean a()
    {
      if (c != null) {
        return true;
      }
      String str;
      if (!b.isEmpty())
      {
        str = (String)b.poll();
        str.getClass();
        c = str;
        return true;
      }
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
    
    public final String b()
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
 * Qualified Name:     f5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */