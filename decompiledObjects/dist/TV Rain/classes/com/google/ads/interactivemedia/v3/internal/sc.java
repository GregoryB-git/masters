package com.google.ads.interactivemedia.v3.internal;

import a;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class sc
  implements uy<rz>
{
  private static final Pattern A = Pattern.compile("NAME=\"(.+?)\"");
  private static final Pattern B = Pattern.compile("GROUP-ID=\"(.+?)\"");
  private static final Pattern C = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
  private static final Pattern D = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
  private static final Pattern E = b("AUTOSELECT");
  private static final Pattern F = b("DEFAULT");
  private static final Pattern G = b("FORCED");
  private static final Pattern H = Pattern.compile("VALUE=\"(.+?)\"");
  private static final Pattern I = Pattern.compile("IMPORT=\"(.+?)\"");
  private static final Pattern J = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
  private static final Pattern a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
  private static final Pattern b = Pattern.compile("VIDEO=\"(.+?)\"");
  private static final Pattern c = Pattern.compile("AUDIO=\"(.+?)\"");
  private static final Pattern d = Pattern.compile("SUBTITLES=\"(.+?)\"");
  private static final Pattern e = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
  private static final Pattern f = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
  private static final Pattern g = Pattern.compile("CHANNELS=\"(.+?)\"");
  private static final Pattern h = Pattern.compile("CODECS=\"(.+?)\"");
  private static final Pattern i = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
  private static final Pattern j = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
  private static final Pattern k = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
  private static final Pattern l = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
  private static final Pattern m = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
  private static final Pattern n = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
  private static final Pattern o = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
  private static final Pattern p = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
  private static final Pattern q = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
  private static final Pattern r = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
  private static final Pattern s = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
  private static final Pattern t = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
  private static final Pattern u = Pattern.compile("KEYFORMAT=\"(.+?)\"");
  private static final Pattern v = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
  private static final Pattern w = Pattern.compile("URI=\"(.+?)\"");
  private static final Pattern x = Pattern.compile("IV=([^,.*]+)");
  private static final Pattern y = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
  private static final Pattern z = Pattern.compile("LANGUAGE=\"(.+?)\"");
  private final rw K;
  
  public sc()
  {
    this(rw.a);
  }
  
  public sc(rw paramrw)
  {
    K = paramrw;
  }
  
  private static int a(BufferedReader paramBufferedReader, boolean paramBoolean, int paramInt)
    throws IOException
  {
    while ((paramInt != -1) && (Character.isWhitespace(paramInt)) && ((paramBoolean) || (!wl.a(paramInt)))) {
      paramInt = paramBufferedReader.read();
    }
    return paramInt;
  }
  
  private static int a(String paramString, Pattern paramPattern)
    throws ce
  {
    return Integer.parseInt(a(paramString, paramPattern, Collections.emptyMap()));
  }
  
  private static fe.a a(String paramString1, String paramString2, Map<String, String> paramMap)
    throws ce
  {
    String str = a(paramString1, v, "1", paramMap);
    if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(paramString2))
    {
      paramString1 = a(paramString1, w, paramMap);
      return new fe.a(av.d, "video/mp4", Base64.decode(paramString1.substring(paramString1.indexOf(',')), 0));
    }
    if ("com.widevine".equals(paramString2)) {
      return new fe.a(av.d, "hls", wl.c(paramString1));
    }
    if (("com.microsoft.playready".equals(paramString2)) && ("1".equals(str)))
    {
      paramString1 = a(paramString1, w, paramMap);
      paramString1 = Base64.decode(paramString1.substring(paramString1.indexOf(',')), 0);
      paramString2 = av.e;
      return new fe.a(paramString2, "video/mp4", hu.a(paramString2, null, paramString1));
    }
    return null;
  }
  
  private static String a(String paramString)
  {
    if ((!"SAMPLE-AES-CENC".equals(paramString)) && (!"SAMPLE-AES-CTR".equals(paramString))) {
      return "cbcs";
    }
    return "cenc";
  }
  
  private static String a(String paramString, Map<String, String> paramMap)
  {
    Matcher localMatcher = J.matcher(paramString);
    paramString = new StringBuffer();
    while (localMatcher.find())
    {
      String str = localMatcher.group(1);
      if (paramMap.containsKey(str)) {
        localMatcher.appendReplacement(paramString, Matcher.quoteReplacement((String)paramMap.get(str)));
      }
    }
    localMatcher.appendTail(paramString);
    return paramString.toString();
  }
  
  private static String a(String paramString1, Pattern paramPattern, String paramString2, Map<String, String> paramMap)
  {
    paramString1 = paramPattern.matcher(paramString1);
    if (paramString1.find()) {
      paramString2 = paramString1.group(1);
    }
    if ((!paramMap.isEmpty()) && (paramString2 != null)) {
      return a(paramString2, paramMap);
    }
    return paramString2;
  }
  
  private static String a(String paramString, Pattern paramPattern, Map<String, String> paramMap)
    throws ce
  {
    paramMap = a(paramString, paramPattern, null, paramMap);
    if (paramMap != null) {
      return paramMap;
    }
    paramPattern = paramPattern.pattern();
    paramMap = new StringBuilder(a.b(paramString, a.b(paramPattern, 19)));
    paramMap.append("Couldn't match ");
    paramMap.append(paramPattern);
    paramMap.append(" in ");
    paramMap.append(paramString);
    throw new ce(paramMap.toString());
  }
  
  private static boolean a(String paramString, Pattern paramPattern, boolean paramBoolean)
  {
    paramString = paramPattern.matcher(paramString);
    if (paramString.find()) {
      return paramString.group(1).equals("YES");
    }
    return false;
  }
  
  private static double b(String paramString, Pattern paramPattern)
    throws ce
  {
    return Double.parseDouble(a(paramString, paramPattern, Collections.emptyMap()));
  }
  
  private final rz b(Uri paramUri, InputStream paramInputStream)
    throws IOException
  {
    Object localObject1 = "#EXT-X-TARGETDURATION";
    Object localObject2 = "#EXT-X-STREAM-INF";
    paramInputStream = new BufferedReader(new InputStreamReader(paramInputStream));
    Object localObject3 = new ArrayDeque();
    Object localObject4 = paramInputStream;
    try
    {
      int i1 = paramInputStream.read();
      int i4 = i1;
      if (i1 == 239)
      {
        localObject4 = paramInputStream;
        if (paramInputStream.read() == 187)
        {
          localObject4 = paramInputStream;
          if (paramInputStream.read() == 191)
          {
            localObject4 = paramInputStream;
            i4 = paramInputStream.read();
            break label102;
          }
        }
        bool1 = false;
        break label173;
      }
      label102:
      localObject4 = paramInputStream;
      i1 = a(paramInputStream, true, i4);
      for (i4 = 0;; i4++)
      {
        if (i4 >= 7) {
          break label158;
        }
        localObject4 = paramInputStream;
        if (i1 != "#EXTM3U".charAt(i4)) {
          break;
        }
        localObject4 = paramInputStream;
        i1 = paramInputStream.read();
      }
      label158:
      localObject4 = paramInputStream;
      boolean bool1 = wl.a(a(paramInputStream, false, i1));
      label173:
      if (bool1)
      {
        Object localObject5;
        Object localObject7;
        Object localObject8;
        Object localObject9;
        Object localObject10;
        Object localObject11;
        Object localObject12;
        Object localObject13;
        Object localObject14;
        Object localObject15;
        Object localObject17;
        Object localObject18;
        int i5;
        for (;;)
        {
          localObject4 = paramInputStream;
          localObject5 = paramInputStream.readLine();
          if (localObject5 == null) {
            break label5052;
          }
          localObject4 = paramInputStream;
          localObject6 = ((String)localObject5).trim();
          localObject4 = paramInputStream;
          if (!((String)localObject6).isEmpty())
          {
            localObject4 = paramInputStream;
            bool1 = ((String)localObject6).startsWith((String)localObject2);
            localObject7 = "#EXT-X-DEFINE";
            localObject8 = "#EXT";
            localObject9 = "identity";
            if (bool1)
            {
              localObject4 = paramInputStream;
              ((ArrayDeque)localObject3).add(localObject6);
              localObject4 = paramInputStream;
              localObject10 = new com/google/ads/interactivemedia/v3/internal/sb;
              localObject4 = paramInputStream;
              ((sb)localObject10).<init>((Queue)localObject3, paramInputStream);
              localObject4 = paramInputStream;
              localObject11 = paramUri.toString();
              localObject4 = paramInputStream;
              localObject12 = new java/util/HashMap;
              localObject4 = paramInputStream;
              ((HashMap)localObject12).<init>();
              localObject4 = paramInputStream;
              localObject13 = new java/util/HashMap;
              localObject4 = paramInputStream;
              ((HashMap)localObject13).<init>();
              localObject4 = paramInputStream;
              localObject14 = new java/util/ArrayList;
              localObject4 = paramInputStream;
              ((ArrayList)localObject14).<init>();
              localObject4 = paramInputStream;
              localObject15 = new java/util/ArrayList;
              localObject4 = paramInputStream;
              ((ArrayList)localObject15).<init>();
              localObject4 = paramInputStream;
              localObject5 = new java/util/ArrayList;
              localObject4 = paramInputStream;
              ((ArrayList)localObject5).<init>();
              localObject4 = paramInputStream;
              localObject16 = new java/util/ArrayList;
              localObject4 = paramInputStream;
              ((ArrayList)localObject16).<init>();
              localObject4 = paramInputStream;
              localObject17 = new java/util/ArrayList;
              localObject4 = paramInputStream;
              ((ArrayList)localObject17).<init>();
              localObject4 = paramInputStream;
              localObject6 = new java/util/ArrayList;
              localObject4 = paramInputStream;
              ((ArrayList)localObject6).<init>();
              localObject4 = paramInputStream;
              localObject1 = new java/util/ArrayList;
              localObject4 = paramInputStream;
              ((ArrayList)localObject1).<init>();
              localObject4 = paramInputStream;
              localObject18 = new java/util/ArrayList;
              localObject4 = paramInputStream;
              ((ArrayList)localObject18).<init>();
              i5 = 0;
              bool1 = false;
              paramUri = paramInputStream;
            }
          }
          for (;;)
          {
            localObject4 = paramUri;
            boolean bool2 = ((sb)localObject10).a();
            i4 = -1;
            if (bool2) {
              localObject4 = paramUri;
            }
            try
            {
              paramInputStream = ((sb)localObject10).b();
              localObject4 = paramUri;
              if (paramInputStream.startsWith((String)localObject8))
              {
                localObject4 = paramUri;
                ((ArrayList)localObject18).add(paramInputStream);
              }
              localObject4 = paramUri;
              if (paramInputStream.startsWith((String)localObject7))
              {
                localObject4 = paramUri;
                ((HashMap)localObject13).put(a(paramInputStream, A, (Map)localObject13), a(paramInputStream, H, (Map)localObject13));
              }
              for (;;)
              {
                break label1136;
                localObject4 = paramUri;
                if (paramInputStream.equals("#EXT-X-INDEPENDENT-SEGMENTS"))
                {
                  bool1 = true;
                  break;
                }
                localObject4 = paramUri;
                if (paramInputStream.startsWith("#EXT-X-MEDIA"))
                {
                  localObject4 = paramUri;
                  ((ArrayList)localObject6).add(paramInputStream);
                }
                else
                {
                  localObject4 = paramUri;
                  if (paramInputStream.startsWith("#EXT-X-SESSION-KEY"))
                  {
                    localObject4 = paramUri;
                    localObject3 = a(paramInputStream, a(paramInputStream, u, (String)localObject9, (Map)localObject13), (Map)localObject13);
                    if (localObject3 != null)
                    {
                      localObject4 = paramUri;
                      localObject19 = a(a(paramInputStream, t, (Map)localObject13));
                      localObject4 = paramUri;
                      paramInputStream = new com/google/ads/interactivemedia/v3/internal/fe;
                      localObject4 = paramUri;
                      paramInputStream.<init>((String)localObject19, new fe.a[] { localObject3 });
                      localObject4 = paramUri;
                      ((ArrayList)localObject1).add(paramInputStream);
                    }
                  }
                  else
                  {
                    localObject4 = paramUri;
                    if (paramInputStream.startsWith((String)localObject2))
                    {
                      localObject4 = paramUri;
                      i6 = i5 | paramInputStream.contains("CLOSED-CAPTIONS=NONE");
                      localObject4 = paramUri;
                      i5 = a(paramInputStream, f);
                      localObject4 = paramUri;
                      localObject3 = a(paramInputStream, a, null, (Map)localObject13);
                      if (localObject3 != null)
                      {
                        localObject4 = paramUri;
                        i5 = Integer.parseInt((String)localObject3);
                      }
                      localObject4 = paramUri;
                      localObject3 = a(paramInputStream, h, null, (Map)localObject13);
                      localObject4 = paramUri;
                      localObject19 = a(paramInputStream, i, null, (Map)localObject13);
                      if (localObject19 != null)
                      {
                        localObject4 = paramUri;
                        localObject19 = ((String)localObject19).split("x");
                        localObject4 = paramUri;
                        i8 = Integer.parseInt(localObject19[0]);
                        localObject4 = paramUri;
                        i1 = Integer.parseInt(localObject19[1]);
                        if ((i8 > 0) && (i1 > 0)) {
                          i4 = i8;
                        } else {
                          i1 = -1;
                        }
                      }
                      else
                      {
                        i4 = -1;
                        i1 = i4;
                      }
                      f1 = -1.0F;
                      localObject4 = paramUri;
                      localObject19 = a(paramInputStream, j, null, (Map)localObject13);
                      if (localObject19 != null)
                      {
                        localObject4 = paramUri;
                        f1 = Float.parseFloat((String)localObject19);
                      }
                      localObject4 = paramUri;
                      localObject19 = a(paramInputStream, b, null, (Map)localObject13);
                      localObject4 = paramUri;
                      localObject20 = a(paramInputStream, c, null, (Map)localObject13);
                      localObject4 = paramUri;
                      localObject21 = a(paramInputStream, d, null, (Map)localObject13);
                      localObject4 = paramUri;
                      localObject22 = a(paramInputStream, e, null, (Map)localObject13);
                      localObject4 = paramUri;
                      localObject23 = rp.a((String)localObject11, a(((sb)localObject10).b(), (Map)localObject13));
                      localObject4 = paramUri;
                      localObject3 = bw.a(Integer.toString(((ArrayList)localObject14).size()), null, "application/x-mpegURL", null, (String)localObject3, null, i5, i4, i1, f1, null, 0, 0);
                      localObject4 = paramUri;
                      paramInputStream = new com/google/ads/interactivemedia/v3/internal/ry;
                      localObject4 = paramUri;
                      paramInputStream.<init>((Uri)localObject23, (bw)localObject3, (String)localObject19, (String)localObject20, (String)localObject21, (String)localObject22);
                      localObject4 = paramUri;
                      ((ArrayList)localObject14).add(paramInputStream);
                      localObject4 = paramUri;
                      localObject3 = (ArrayList)((HashMap)localObject12).get(localObject23);
                      paramInputStream = (InputStream)localObject3;
                      if (localObject3 == null)
                      {
                        localObject4 = paramUri;
                        paramInputStream = new java/util/ArrayList;
                        localObject4 = paramUri;
                        paramInputStream.<init>();
                        localObject4 = paramUri;
                        ((HashMap)localObject12).put(localObject23, paramInputStream);
                      }
                      localObject4 = paramUri;
                      localObject3 = new com/google/ads/interactivemedia/v3/internal/rk$a;
                      localObject4 = paramUri;
                      ((rk.a)localObject3).<init>(i5, (String)localObject19, (String)localObject20, (String)localObject21, (String)localObject22);
                      localObject4 = paramUri;
                      paramInputStream.add(localObject3);
                      i5 = i6;
                    }
                  }
                }
              }
            }
            finally
            {
              Object localObject19;
              int i6;
              int i8;
              float f1;
              Object localObject20;
              Object localObject21;
              Object localObject22;
              label1136:
              int i3;
              String str1;
              HashMap localHashMap;
              long l1;
              long l2;
              long l3;
              long l4;
              long l5;
              long l6;
              long l7;
              long l8;
              long l9;
              boolean bool4;
              int i7;
              boolean bool5;
              InputStream localInputStream;
              String str2;
              Object localObject24;
              long l10;
              long l11;
              boolean bool3;
              paramInputStream = (InputStream)localObject4;
              break label5104;
            }
          }
          localObject8 = paramUri;
          localObject4 = localObject8;
          localObject2 = new java/util/ArrayList;
          localObject4 = localObject8;
          ((ArrayList)localObject2).<init>();
          localObject4 = localObject8;
          paramUri = new java/util/HashSet;
          localObject4 = localObject8;
          paramUri.<init>();
          for (i4 = 0;; i4++)
          {
            localObject4 = localObject8;
            if (i4 >= ((ArrayList)localObject14).size()) {
              break;
            }
            localObject4 = localObject8;
            paramInputStream = (ry)((ArrayList)localObject14).get(i4);
            localObject4 = localObject8;
            if (paramUri.add(a))
            {
              localObject4 = localObject8;
              if (b.g == null) {
                bool2 = true;
              } else {
                bool2 = false;
              }
              localObject4 = localObject8;
              rp.c(bool2);
              localObject4 = localObject8;
              localObject7 = new com/google/ads/interactivemedia/v3/internal/rk;
              localObject4 = localObject8;
              ((rk)localObject7).<init>(null, null, (List)((HashMap)localObject12).get(a));
              localObject4 = localObject8;
              localObject3 = b;
              localObject4 = localObject8;
              localObject9 = new com/google/ads/interactivemedia/v3/internal/kd;
              localObject4 = localObject8;
              ((kd)localObject9).<init>(new kd.a[] { localObject7 });
              localObject4 = localObject8;
              localObject7 = ((bw)localObject3).a((kd)localObject9);
              localObject4 = localObject8;
              localObject9 = new com/google/ads/interactivemedia/v3/internal/ry;
              localObject4 = localObject8;
              ((ry)localObject9).<init>(a, (bw)localObject7, c, d, e, f);
              localObject4 = localObject8;
              ((ArrayList)localObject2).add(localObject9);
            }
          }
          paramUri = null;
          i6 = 0;
          paramInputStream = null;
          localObject7 = localObject5;
          localObject9 = localObject6;
          for (;;)
          {
            localObject4 = localObject8;
            if (i6 >= ((ArrayList)localObject9).size()) {
              break;
            }
            localObject4 = localObject8;
            localObject22 = (String)((ArrayList)localObject9).get(i6);
            localObject4 = localObject8;
            localObject10 = a((String)localObject22, B, (Map)localObject13);
            localObject4 = localObject8;
            localObject12 = a((String)localObject22, A, (Map)localObject13);
            localObject4 = localObject8;
            localObject5 = a((String)localObject22, w, null, (Map)localObject13);
            if (localObject5 == null)
            {
              localObject5 = null;
            }
            else
            {
              localObject4 = localObject8;
              localObject5 = rp.a((String)localObject11, (String)localObject5);
            }
            localObject4 = localObject8;
            localObject21 = a((String)localObject22, z, null, (Map)localObject13);
            localObject4 = localObject8;
            int i2 = a((String)localObject22, F, false);
            i4 = i2;
            localObject4 = localObject8;
            if (a((String)localObject22, G, false)) {
              i4 = i2 | 0x2;
            }
            i8 = i4;
            localObject4 = localObject8;
            if (a((String)localObject22, E, false)) {
              i8 = i4 | 0x4;
            }
            localObject4 = localObject8;
            localObject6 = a((String)localObject22, C, null, (Map)localObject13);
            localObject4 = localObject8;
            if (TextUtils.isEmpty((CharSequence)localObject6))
            {
              i2 = 0;
            }
            else
            {
              localObject4 = localObject8;
              localObject6 = wl.a((String)localObject6, ",");
              localObject4 = localObject8;
              if (wl.a((Object[])localObject6, "public.accessibility.describes-video")) {
                i3 = 512;
              } else {
                i3 = 0;
              }
              i4 = i3;
              localObject4 = localObject8;
              if (wl.a((Object[])localObject6, "public.accessibility.transcribes-spoken-dialog")) {
                i4 = i3 | 0x1000;
              }
              i3 = i4;
              localObject4 = localObject8;
              if (wl.a((Object[])localObject6, "public.accessibility.describes-music-and-sound")) {
                i3 = i4 | 0x400;
              }
              localObject4 = localObject8;
              if (wl.a((Object[])localObject6, "public.easy-to-read")) {
                i3 |= 0x2000;
              }
            }
            localObject4 = localObject8;
            int i9 = String.valueOf(localObject10).length();
            localObject4 = localObject8;
            i4 = String.valueOf(localObject12).length();
            localObject4 = localObject8;
            localObject6 = new java/lang/StringBuilder;
            localObject4 = localObject8;
            ((StringBuilder)localObject6).<init>(i9 + 1 + i4);
            localObject4 = localObject8;
            ((StringBuilder)localObject6).append((String)localObject10);
            localObject4 = localObject8;
            ((StringBuilder)localObject6).append(":");
            localObject4 = localObject8;
            ((StringBuilder)localObject6).append((String)localObject12);
            localObject4 = localObject8;
            localObject19 = ((StringBuilder)localObject6).toString();
            localObject4 = localObject8;
            localObject20 = new com/google/ads/interactivemedia/v3/internal/kd;
            localObject4 = localObject8;
            localObject6 = new com/google/ads/interactivemedia/v3/internal/rk;
            localObject4 = localObject8;
            ((rk)localObject6).<init>((String)localObject10, (String)localObject12, Collections.emptyList());
            localObject4 = localObject8;
            ((kd)localObject20).<init>(new kd.a[] { localObject6 });
            localObject4 = localObject8;
            localObject6 = a((String)localObject22, y, (Map)localObject13);
            localObject4 = localObject8;
            switch (((String)localObject6).hashCode())
            {
            default: 
              break;
            case 81665115: 
              localObject4 = localObject8;
              if (((String)localObject6).equals("VIDEO")) {
                i4 = 0;
              }
              break;
            case 62628790: 
              localObject4 = localObject8;
              if (((String)localObject6).equals("AUDIO")) {
                i4 = 1;
              }
              break;
            case -333210994: 
              localObject4 = localObject8;
              if (((String)localObject6).equals("CLOSED-CAPTIONS")) {
                i4 = 3;
              }
              break;
            case -959297733: 
              localObject4 = localObject8;
              if (((String)localObject6).equals("SUBTITLES")) {
                i4 = 2;
              }
              break;
            }
            i4 = -1;
            if (i4 != 0)
            {
              if (i4 != 1) {
                if (i4 != 2)
                {
                  if (i4 != 3) {
                    break label2795;
                  }
                  localObject4 = localObject8;
                  localObject5 = a((String)localObject22, D, (Map)localObject13);
                  localObject4 = localObject8;
                  if (((String)localObject5).startsWith("CC"))
                  {
                    localObject4 = localObject8;
                    i4 = Integer.parseInt(((String)localObject5).substring(2));
                    localObject6 = "application/cea-608";
                  }
                  else
                  {
                    localObject4 = localObject8;
                    i4 = Integer.parseInt(((String)localObject5).substring(7));
                    localObject6 = "application/cea-708";
                  }
                  localObject5 = paramUri;
                  if (paramUri == null)
                  {
                    localObject4 = localObject8;
                    localObject5 = new java/util/ArrayList;
                    localObject4 = localObject8;
                    ((ArrayList)localObject5).<init>();
                  }
                  localObject4 = localObject8;
                  ((List)localObject5).add(bw.a((String)localObject19, (String)localObject12, null, (String)localObject6, null, -1, i8, i3, (String)localObject21, i4));
                  paramUri = (Uri)localObject5;
                }
              }
              for (;;)
              {
                break;
                localObject4 = localObject8;
                localObject3 = bw.a((String)localObject19, (String)localObject12, "application/x-mpegURL", "text/vtt", null, -1, i8, i3, (String)localObject21).a((kd)localObject20);
                localObject4 = localObject8;
                localObject6 = new com/google/ads/interactivemedia/v3/internal/rv;
                localObject4 = localObject8;
                ((rv)localObject6).<init>((Uri)localObject5, (bw)localObject3, (String)localObject10, (String)localObject12);
                localObject4 = localObject8;
                ((ArrayList)localObject16).add(localObject6);
                break;
                for (i4 = 0;; i4++)
                {
                  localObject4 = localObject8;
                  if (i4 >= ((ArrayList)localObject14).size()) {
                    break;
                  }
                  localObject4 = localObject8;
                  localObject6 = (ry)((ArrayList)localObject14).get(i4);
                  localObject4 = localObject8;
                  if (((String)localObject10).equals(d)) {
                    break label2361;
                  }
                }
                localObject6 = null;
                label2361:
                if (localObject6 != null)
                {
                  localObject4 = localObject8;
                  localObject6 = wl.a(b.f, 1);
                }
                else
                {
                  localObject6 = null;
                }
                if (localObject6 != null)
                {
                  localObject4 = localObject8;
                  localObject3 = vs.f((String)localObject6);
                }
                else
                {
                  localObject3 = null;
                }
                localObject4 = localObject8;
                localObject22 = a((String)localObject22, g, null, (Map)localObject13);
                if (localObject22 != null)
                {
                  localObject4 = localObject8;
                  i4 = Integer.parseInt(wl.b(localObject22, "/")[0]);
                }
                else
                {
                  i4 = -1;
                }
                localObject4 = localObject8;
                localObject6 = bw.a((String)localObject19, (String)localObject12, "application/x-mpegURL", (String)localObject3, (String)localObject6, null, -1, i4, -1, null, i8, i3, (String)localObject21);
                if (localObject5 != null) {
                  break label2502;
                }
                paramInputStream = (InputStream)localObject6;
              }
              label2502:
              localObject4 = localObject8;
              localObject3 = new com/google/ads/interactivemedia/v3/internal/rv;
              localObject4 = localObject8;
              ((rv)localObject3).<init>((Uri)localObject5, ((bw)localObject6).a((kd)localObject20), (String)localObject10, (String)localObject12);
              localObject4 = localObject8;
              ((ArrayList)localObject7).add(localObject3);
            }
            else
            {
              for (i4 = 0;; i4++)
              {
                localObject4 = localObject8;
                if (i4 >= ((ArrayList)localObject14).size()) {
                  break;
                }
                localObject4 = localObject8;
                localObject6 = (ry)((ArrayList)localObject14).get(i4);
                localObject4 = localObject8;
                if (((String)localObject10).equals(c)) {
                  break label2610;
                }
              }
              localObject6 = null;
              label2610:
              if (localObject6 != null)
              {
                localObject4 = localObject8;
                localObject3 = b;
                localObject4 = localObject8;
                localObject6 = wl.a(f, 2);
                localObject4 = localObject8;
                i9 = n;
                localObject4 = localObject8;
                i4 = o;
                localObject4 = localObject8;
                f1 = p;
              }
              else
              {
                f1 = -1.0F;
                i9 = -1;
                i4 = i9;
                localObject6 = null;
              }
              if (localObject6 != null)
              {
                localObject4 = localObject8;
                localObject3 = vs.f((String)localObject6);
              }
              else
              {
                localObject3 = null;
              }
              localObject4 = localObject8;
              localObject3 = bw.a((String)localObject19, (String)localObject12, "application/x-mpegURL", (String)localObject3, (String)localObject6, null, -1, i9, i4, f1, null, i8, i3).a((kd)localObject20);
              if (localObject5 != null)
              {
                localObject4 = localObject8;
                localObject6 = new com/google/ads/interactivemedia/v3/internal/rv;
                localObject4 = localObject8;
                ((rv)localObject6).<init>((Uri)localObject5, (bw)localObject3, (String)localObject10, (String)localObject12);
                localObject4 = localObject8;
                ((ArrayList)localObject15).add(localObject6);
              }
            }
            label2795:
            i6++;
          }
          if (i5 != 0)
          {
            localObject4 = localObject8;
            paramUri = Collections.emptyList();
          }
          localObject4 = localObject8;
          paramUri = new rw((String)localObject11, (List)localObject18, (List)localObject2, (List)localObject15, (List)localObject7, (List)localObject16, (List)localObject17, paramInputStream, paramUri, bool1, (Map)localObject13, (List)localObject1);
          wl.a((Closeable)localObject8);
          return paramUri;
          localObject5 = "#EXT-X-DEFINE";
          localObject8 = "#EXT";
          localObject20 = "identity";
          localObject4 = paramInputStream;
          bool1 = ((String)localObject6).startsWith("#EXT-X-TARGETDURATION");
          localObject7 = "#EXT-X-ENDLIST";
          localObject18 = "#EXTINF";
          localObject15 = "#EXT-X-MEDIA-SEQUENCE";
          if (bool1) {
            break;
          }
          localObject4 = paramInputStream;
          if (((String)localObject6).startsWith("#EXT-X-MEDIA-SEQUENCE")) {
            break;
          }
          localObject4 = paramInputStream;
          if (((String)localObject6).startsWith("#EXTINF")) {
            break;
          }
          localObject4 = paramInputStream;
          if (((String)localObject6).startsWith("#EXT-X-KEY")) {
            break;
          }
          localObject4 = paramInputStream;
          if (((String)localObject6).startsWith("#EXT-X-BYTERANGE")) {
            break;
          }
          localObject4 = paramInputStream;
          if (((String)localObject6).equals("#EXT-X-DISCONTINUITY")) {
            break;
          }
          localObject4 = paramInputStream;
          if (((String)localObject6).equals("#EXT-X-DISCONTINUITY-SEQUENCE")) {
            break;
          }
          localObject4 = paramInputStream;
          if (((String)localObject6).equals("#EXT-X-ENDLIST")) {
            break;
          }
          localObject4 = paramInputStream;
          ((ArrayDeque)localObject3).add(localObject6);
        }
        localObject4 = paramInputStream;
        ((ArrayDeque)localObject3).add(localObject6);
        localObject4 = paramInputStream;
        Object localObject16 = K;
        localObject4 = paramInputStream;
        Object localObject6 = new com/google/ads/interactivemedia/v3/internal/sb;
        try
        {
          ((sb)localObject6).<init>((Queue)localObject3, paramInputStream);
          str1 = paramUri.toString();
          bool1 = p;
          localHashMap = new java/util/HashMap;
          localHashMap.<init>();
          paramUri = new java/util/ArrayList;
          paramUri.<init>();
          localObject9 = new java/util/ArrayList;
          ((ArrayList)localObject9).<init>();
          localObject17 = new java/util/TreeMap;
          ((TreeMap)localObject17).<init>();
          localObject4 = "";
          localObject12 = "";
          l1 = -9223372036854775807L;
          l2 = l1;
          l3 = -1L;
          l4 = 0L;
          l5 = l4;
          l6 = l5;
          l7 = l6;
          l8 = l7;
          l9 = l8;
          localObject11 = null;
          localObject2 = null;
          localObject13 = null;
          localObject14 = null;
          bool2 = false;
          localObject21 = null;
          i4 = 0;
          i5 = 0;
          bool4 = false;
          i7 = 0;
          i3 = 1;
          bool5 = false;
          localInputStream = paramInputStream;
          localObject3 = null;
          paramInputStream = (InputStream)localObject5;
          localObject5 = localObject9;
        }
        finally
        {
          try
          {
            while (((sb)localObject6).a())
            {
              localObject23 = localInputStream;
              str2 = ((sb)localObject6).b();
              localObject23 = localInputStream;
              if (str2.startsWith((String)localObject8))
              {
                localObject23 = localInputStream;
                ((ArrayList)localObject5).add(str2);
              }
              localObject24 = localObject8;
              localObject23 = localInputStream;
              if (str2.startsWith("#EXT-X-PLAYLIST-TYPE"))
              {
                localObject23 = localInputStream;
                localObject8 = a(str2, m, localHashMap);
                localObject23 = localInputStream;
                if ("VOD".equals(localObject8))
                {
                  i5 = 1;
                  localObject8 = localObject24;
                  continue;
                }
                localObject23 = localInputStream;
                if ("EVENT".equals(localObject8)) {
                  i5 = 2;
                }
              }
              else
              {
                localObject23 = localInputStream;
                if (!str2.startsWith("#EXT-X-START")) {
                  break label3374;
                }
                localObject23 = localInputStream;
                l1 = (b(str2, q) * 1000000.0D);
              }
              localObject8 = localObject24;
              continue;
              label3374:
              localObject23 = localInputStream;
              if (str2.startsWith("#EXT-X-MAP"))
              {
                localObject23 = localInputStream;
                localObject8 = a(str2, w, localHashMap);
                localObject23 = localInputStream;
                localObject9 = a(str2, s, null, localHashMap);
                if (localObject9 != null)
                {
                  localObject23 = localInputStream;
                  localObject9 = ((String)localObject9).split("@");
                  localObject23 = localInputStream;
                  l3 = Long.parseLong(localObject9[0]);
                  localObject23 = localInputStream;
                  if (localObject9.length > 1)
                  {
                    localObject23 = localInputStream;
                    l4 = Long.parseLong(localObject9[1]);
                  }
                }
                if ((localObject11 != null) && (localObject2 == null))
                {
                  localObject23 = localInputStream;
                  paramUri = new com/google/ads/interactivemedia/v3/internal/ce;
                  localObject23 = localInputStream;
                  paramUri.<init>("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                  localObject23 = localInputStream;
                  throw paramUri;
                }
                localObject23 = localInputStream;
                localObject21 = new sa((String)localObject8, l4, l3, (String)localObject11, (String)localObject2);
                l3 = -1L;
                l4 = 0L;
              }
              else
              {
                localObject9 = localObject7;
                localObject22 = localObject5;
                localObject23 = localInputStream;
                if (!str2.startsWith((String)localObject1)) {
                  break label3600;
                }
                localObject23 = localInputStream;
                l2 = a(str2, k) * 1000000L;
              }
              for (;;)
              {
                localObject8 = localObject24;
                break;
                label3600:
                localObject23 = localInputStream;
                if (str2.startsWith((String)localObject15))
                {
                  localObject23 = localInputStream;
                  l5 = Long.parseLong(a(str2, n, Collections.emptyMap()));
                  l7 = l5;
                }
                else
                {
                  localObject23 = localInputStream;
                  if (str2.startsWith("#EXT-X-VERSION"))
                  {
                    localObject23 = localInputStream;
                    i3 = a(str2, l);
                  }
                  else
                  {
                    localObject23 = localInputStream;
                    if (str2.startsWith(paramInputStream))
                    {
                      localObject23 = localInputStream;
                      localObject5 = a(str2, I, null, localHashMap);
                      if (localObject5 != null)
                      {
                        localObject23 = localInputStream;
                        localObject8 = (String)h.get(localObject5);
                        if (localObject8 != null)
                        {
                          localObject23 = localInputStream;
                          localHashMap.put(localObject5, localObject8);
                        }
                      }
                      for (;;)
                      {
                        break;
                        localObject23 = localInputStream;
                        localHashMap.put(a(str2, A, localHashMap), a(str2, H, localHashMap));
                      }
                    }
                    localObject23 = localInputStream;
                    if (!str2.startsWith((String)localObject18)) {
                      break label3842;
                    }
                    localObject23 = localInputStream;
                    l9 = (b(str2, o) * 1000000.0D);
                    localObject23 = localInputStream;
                    localObject12 = a(str2, p, (String)localObject4, localHashMap);
                    localObject5 = localObject22;
                  }
                }
              }
              label3842:
              localObject5 = localObject1;
              localObject8 = localObject18;
              localObject23 = localInputStream;
              if (str2.startsWith("#EXT-X-KEY"))
              {
                localObject23 = localInputStream;
                localObject10 = a(str2, t, localHashMap);
                localObject23 = localInputStream;
                localObject2 = u;
                localObject7 = localObject20;
                localObject23 = localInputStream;
                localObject11 = a(str2, (Pattern)localObject2, (String)localObject7, localHashMap);
                localObject2 = paramInputStream;
                localObject23 = localInputStream;
                if ("NONE".equals(localObject10))
                {
                  localObject23 = localInputStream;
                  ((TreeMap)localObject17).clear();
                  localObject1 = paramUri;
                  paramUri = (Uri)localObject5;
                  localObject7 = localObject2;
                  paramInputStream = (InputStream)localObject9;
                  localObject11 = null;
                  localObject2 = null;
                  localObject13 = null;
                  localObject5 = localObject8;
                  localObject8 = localObject1;
                  break label4947;
                }
                localObject23 = localInputStream;
                localObject18 = a(str2, x, null, localHashMap);
                localObject23 = localInputStream;
                if (((String)localObject7).equals(localObject11))
                {
                  localObject7 = localObject3;
                  localObject1 = localObject13;
                  localObject23 = localInputStream;
                  if ("AES-128".equals(localObject10))
                  {
                    localObject23 = localInputStream;
                    localObject7 = a(str2, w, localHashMap);
                    localObject1 = localObject18;
                    i8 = i4;
                    l10 = l6;
                    break label4381;
                  }
                }
                else
                {
                  paramInputStream = (InputStream)localObject3;
                  if (localObject3 == null)
                  {
                    localObject23 = localInputStream;
                    paramInputStream = a((String)localObject10);
                  }
                  localObject23 = localInputStream;
                  localObject3 = a(str2, (String)localObject11, localHashMap);
                  localObject7 = paramInputStream;
                  localObject1 = localObject13;
                  if (localObject3 != null)
                  {
                    localObject23 = localInputStream;
                    ((TreeMap)localObject17).put(localObject11, localObject3);
                    localObject1 = null;
                    localObject7 = paramInputStream;
                  }
                }
                localObject11 = paramUri;
                paramUri = (Uri)localObject5;
                localObject13 = localObject2;
                paramInputStream = (InputStream)localObject9;
                localObject2 = null;
                localObject5 = localObject8;
                localObject3 = localObject7;
                localObject8 = localObject11;
                localObject11 = localObject2;
                localObject2 = localObject18;
                localObject7 = localObject13;
                localObject13 = localObject1;
                break label4947;
              }
              else
              {
                localObject10 = localObject4;
                localObject19 = paramInputStream;
                localObject23 = localInputStream;
                if (str2.startsWith("#EXT-X-BYTERANGE"))
                {
                  localObject23 = localInputStream;
                  localObject18 = a(str2, r, localHashMap).split("@");
                  localObject23 = localInputStream;
                  l11 = Long.parseLong(localObject18[0]);
                  localObject7 = localObject11;
                  localObject1 = localObject2;
                  i8 = i4;
                  l10 = l6;
                  l3 = l11;
                  localObject23 = localInputStream;
                  if (localObject18.length > 1)
                  {
                    localObject23 = localInputStream;
                    l4 = Long.parseLong(localObject18[1]);
                    localObject7 = localObject11;
                    localObject1 = localObject2;
                    i8 = i4;
                    l10 = l6;
                    l3 = l11;
                  }
                }
                else
                {
                  localObject23 = localInputStream;
                  if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE"))
                  {
                    localObject23 = localInputStream;
                    i7 = Integer.parseInt(str2.substring(str2.indexOf(':') + 1));
                    localObject1 = paramUri;
                    paramUri = (Uri)localObject5;
                    localObject7 = localObject19;
                    paramInputStream = (InputStream)localObject9;
                    localObject4 = localObject10;
                    bool4 = true;
                    localObject5 = localObject8;
                    localObject8 = localObject1;
                    break label4947;
                  }
                  localObject23 = localInputStream;
                  if (!str2.equals("#EXT-X-DISCONTINUITY")) {
                    break label4421;
                  }
                  i8 = i4 + 1;
                  l10 = l6;
                  localObject1 = localObject2;
                  localObject7 = localObject11;
                }
              }
              for (;;)
              {
                label4381:
                l6 = l10;
                i4 = i8;
                localObject2 = localObject1;
                localObject11 = localObject7;
                localObject7 = paramUri;
                paramUri = (Uri)localObject5;
                localObject1 = paramInputStream;
                paramInputStream = (InputStream)localObject9;
                localObject5 = localObject8;
                localObject8 = localObject7;
                localObject7 = localObject1;
                break label4947;
                label4421:
                localObject23 = localInputStream;
                if (!str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                  break label4489;
                }
                if (l6 != 0L) {
                  break;
                }
                localObject23 = localInputStream;
                l10 = av.b(wl.g(str2.substring(str2.indexOf(':') + 1))) - l8;
                localObject7 = localObject11;
                localObject1 = localObject2;
                i8 = i4;
              }
              for (;;)
              {
                break label4930;
                label4489:
                localObject23 = localInputStream;
                if (str2.equals("#EXT-X-GAP"))
                {
                  bool2 = true;
                  break;
                }
                localObject23 = localInputStream;
                if (str2.equals("#EXT-X-INDEPENDENT-SEGMENTS"))
                {
                  bool1 = true;
                  break;
                }
                localObject23 = localInputStream;
                if (str2.equals(localObject9))
                {
                  localObject7 = paramUri;
                  bool5 = true;
                  localObject4 = localObject10;
                  paramInputStream = (InputStream)localObject9;
                  paramUri = (Uri)localObject5;
                  localObject9 = localObject19;
                  localObject5 = localObject8;
                  localObject8 = localObject7;
                  break label4951;
                }
                localObject23 = localInputStream;
                if (!str2.startsWith("#"))
                {
                  if (localObject11 == null)
                  {
                    paramInputStream = null;
                  }
                  else if (localObject2 != null)
                  {
                    paramInputStream = (InputStream)localObject2;
                  }
                  else
                  {
                    localObject23 = localInputStream;
                    paramInputStream = Long.toHexString(l5);
                  }
                  bool3 = l3 < -1L;
                  if (!bool3) {
                    l4 = 0L;
                  }
                  if (localObject13 == null)
                  {
                    localObject23 = localInputStream;
                    if (!((AbstractMap)localObject17).isEmpty())
                    {
                      localObject23 = localInputStream;
                      localObject1 = (fe.a[])((TreeMap)localObject17).values().toArray(new fe.a[0]);
                      localObject23 = localInputStream;
                      localObject4 = new com/google/ads/interactivemedia/v3/internal/fe;
                      localObject23 = localInputStream;
                      ((fe)localObject4).<init>((String)localObject3, (fe.a[])localObject1);
                      if (localObject14 == null)
                      {
                        localObject23 = localInputStream;
                        localObject18 = new fe.a[localObject1.length];
                        for (i8 = 0;; i8++)
                        {
                          localObject23 = localInputStream;
                          if (i8 >= localObject1.length) {
                            break;
                          }
                          localObject23 = localInputStream;
                          localObject18[i8] = localObject1[i8].a(null);
                        }
                        localObject23 = localInputStream;
                        localObject1 = new com/google/ads/interactivemedia/v3/internal/fe;
                        localObject23 = localInputStream;
                        ((fe)localObject1).<init>((String)localObject3, (fe.a[])localObject18);
                        localObject13 = localObject4;
                        localObject4 = localObject1;
                        break label4795;
                      }
                      localObject13 = localObject4;
                    }
                  }
                  localObject4 = localObject14;
                  label4795:
                  localObject23 = localInputStream;
                  localObject1 = new com/google/ads/interactivemedia/v3/internal/sa;
                  localObject23 = localInputStream;
                  ((sa)localObject1).<init>(a(str2, localHashMap), (sa)localObject21, (String)localObject12, l9, i4, l8, (fe)localObject13, (String)localObject11, paramInputStream, l4, l3, bool2);
                  localObject23 = localInputStream;
                  paramUri.add(localObject1);
                  l8 += l9;
                  l9 = l4;
                  if (bool3) {
                    l9 = l4 + l3;
                  }
                  l4 = l9;
                  localObject14 = localObject4;
                  localObject1 = paramUri;
                  paramUri = (Uri)localObject5;
                  l3 = -1L;
                  l9 = 0L;
                  paramInputStream = (InputStream)localObject7;
                  localObject4 = localObject10;
                  localObject12 = localObject4;
                  l5 += 1L;
                  bool2 = false;
                  localObject5 = localObject8;
                  localObject8 = localObject1;
                  localObject7 = localObject19;
                  break label4947;
                }
              }
              label4930:
              localObject8 = paramUri;
              localObject5 = localObject18;
              paramUri = (Uri)localObject1;
              localObject1 = paramInputStream;
              paramInputStream = (InputStream)localObject7;
              localObject7 = localObject1;
              label4947:
              localObject9 = localObject7;
              label4951:
              localObject1 = paramUri;
              localObject7 = paramInputStream;
              localObject18 = localObject5;
              paramUri = (Uri)localObject8;
              localObject5 = localObject22;
              paramInputStream = (InputStream)localObject9;
              localObject8 = localObject24;
            }
            if (l6 != 0L) {
              bool2 = true;
            } else {
              bool2 = false;
            }
            localObject23 = localInputStream;
            paramUri = new rx(i5, str1, (List)localObject5, l1, l6, bool4, i7, l7, i3, l2, bool1, bool5, bool2, (fe)localObject14, paramUri);
            wl.a(localInputStream);
            return paramUri;
          }
          finally
          {
            paramInputStream = (InputStream)localObject23;
            break label5104;
          }
          paramUri = finally;
          break label5104;
        }
        localObject23 = localInputStream;
        label5052:
        wl.a(paramInputStream);
        throw new ce("Failed to parse the playlist, could not identify any tags.");
      }
      localObject23 = paramInputStream;
      localObject4 = new com/google/ads/interactivemedia/v3/internal/oh;
      localObject23 = paramInputStream;
      ((oh)localObject4).<init>("Input does not start with the #EXTM3U header.", paramUri);
      localObject23 = paramInputStream;
      throw ((Throwable)localObject4);
    }
    finally
    {
      Object localObject23;
      paramInputStream = (InputStream)localObject4;
    }
    label5104:
    wl.a(paramInputStream);
    throw paramUri;
  }
  
  private static Pattern b(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(a.b(paramString, 9));
    localStringBuilder.append(paramString);
    localStringBuilder.append("=(NO");
    localStringBuilder.append("|YES");
    localStringBuilder.append(")");
    return Pattern.compile(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.sc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */