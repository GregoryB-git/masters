package d0;

import W2.c;
import android.text.TextUtils;
import g0.M;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class z
{
  public static final ArrayList a = new ArrayList();
  public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
  
  public static boolean a(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    if (paramString1 == null) {
      return false;
    }
    int i = paramString1.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1903589369: 
      if (paramString1.equals("audio/g711-mlaw")) {
        j = 10;
      }
      break;
    case 1903231877: 
      if (paramString1.equals("audio/g711-alaw")) {
        j = 9;
      }
      break;
    case 1504831518: 
      if (paramString1.equals("audio/mpeg")) {
        j = 8;
      }
      break;
    case 1504619009: 
      if (paramString1.equals("audio/flac")) {
        j = 7;
      }
      break;
    case 1504578661: 
      if (paramString1.equals("audio/eac3")) {
        j = 6;
      }
      break;
    case 187094639: 
      if (paramString1.equals("audio/raw")) {
        j = 5;
      }
      break;
    case 187078296: 
      if (paramString1.equals("audio/ac3")) {
        j = 4;
      }
      break;
    case -53558318: 
      if (paramString1.equals("audio/mp4a-latm")) {
        j = 3;
      }
      break;
    case -432837259: 
      if (paramString1.equals("audio/mpeg-L2")) {
        j = 2;
      }
      break;
    case -432837260: 
      if (paramString1.equals("audio/mpeg-L1")) {
        j = 1;
      }
      break;
    case -2123537834: 
      if (paramString1.equals("audio/eac3-joc")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return false;
    case 3: 
      if (paramString2 == null) {
        return false;
      }
      paramString1 = i(paramString2);
      if (paramString1 == null) {
        return false;
      }
      j = paramString1.a();
      boolean bool2 = bool1;
      if (j != 0)
      {
        bool2 = bool1;
        if (j != 16) {
          bool2 = true;
        }
      }
      return bool2;
    }
    return true;
  }
  
  public static boolean b(String paramString1, String paramString2)
  {
    boolean bool;
    if (d(paramString1, paramString2) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static String c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = M.d1(paramString);
    int i = paramString.length;
    for (int j = 0; j < i; j++)
    {
      String str = g(paramString[j]);
      if ((str != null) && (o(str))) {
        return str;
      }
    }
    return null;
  }
  
  public static String d(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramString1 != null) {
      if (paramString2 == null)
      {
        localObject2 = localObject1;
      }
      else
      {
        localObject2 = M.d1(paramString1);
        paramString1 = new StringBuilder();
        int i = localObject2.length;
        for (int j = 0; j < i; j++)
        {
          String str = localObject2[j];
          if (paramString2.equals(g(str)))
          {
            if (paramString1.length() > 0) {
              paramString1.append(",");
            }
            paramString1.append(str);
          }
        }
        localObject2 = localObject1;
        if (paramString1.length() > 0) {
          localObject2 = paramString1.toString();
        }
      }
    }
    return (String)localObject2;
  }
  
  public static String e(String paramString)
  {
    paramString = a;
    if (paramString.size() <= 0) {
      return null;
    }
    android.support.v4.media.a.a(paramString.get(0));
    throw null;
  }
  
  public static int f(String paramString1, String paramString2)
  {
    paramString1.hashCode();
    int i = paramString1.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1556697186: 
      if (paramString1.equals("audio/true-hd")) {
        j = 11;
      }
      break;
    case 1505942594: 
      if (paramString1.equals("audio/vnd.dts.hd")) {
        j = 10;
      }
      break;
    case 1504891608: 
      if (paramString1.equals("audio/opus")) {
        j = 9;
      }
      break;
    case 1504831518: 
      if (paramString1.equals("audio/mpeg")) {
        j = 8;
      }
      break;
    case 1504578661: 
      if (paramString1.equals("audio/eac3")) {
        j = 7;
      }
      break;
    case 550520934: 
      if (paramString1.equals("audio/vnd.dts.uhd;profile=p2")) {
        j = 6;
      }
      break;
    case 187078297: 
      if (paramString1.equals("audio/ac4")) {
        j = 5;
      }
      break;
    case 187078296: 
      if (paramString1.equals("audio/ac3")) {
        j = 4;
      }
      break;
    case -53558318: 
      if (paramString1.equals("audio/mp4a-latm")) {
        j = 3;
      }
      break;
    case -1095064472: 
      if (paramString1.equals("audio/vnd.dts")) {
        j = 2;
      }
      break;
    case -1365340241: 
      if (paramString1.equals("audio/vnd.dts.hd;profile=lbr")) {
        j = 1;
      }
      break;
    case -2123537834: 
      if (paramString1.equals("audio/eac3-joc")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return 0;
    case 11: 
      return 14;
    case 10: 
      return 8;
    case 9: 
      return 20;
    case 8: 
      return 9;
    case 7: 
      return 6;
    case 6: 
      return 30;
    case 5: 
      return 17;
    case 4: 
      return 5;
    case 3: 
      if (paramString2 == null) {
        return 0;
      }
      paramString1 = i(paramString2);
      if (paramString1 == null) {
        return 0;
      }
      return paramString1.a();
    case 2: 
      return 7;
    case 1: 
      return 8;
    }
    return 18;
  }
  
  public static String g(String paramString)
  {
    String str = null;
    if (paramString == null) {
      return null;
    }
    Object localObject = c.e(paramString.trim());
    if ((!((String)localObject).startsWith("avc1")) && (!((String)localObject).startsWith("avc3")))
    {
      if ((!((String)localObject).startsWith("hev1")) && (!((String)localObject).startsWith("hvc1")))
      {
        if ((!((String)localObject).startsWith("dvav")) && (!((String)localObject).startsWith("dva1")) && (!((String)localObject).startsWith("dvhe")) && (!((String)localObject).startsWith("dvh1")))
        {
          if (((String)localObject).startsWith("av01")) {
            return "video/av01";
          }
          if ((!((String)localObject).startsWith("vp9")) && (!((String)localObject).startsWith("vp09")))
          {
            if ((!((String)localObject).startsWith("vp8")) && (!((String)localObject).startsWith("vp08")))
            {
              if (((String)localObject).startsWith("mp4a"))
              {
                paramString = str;
                if (((String)localObject).startsWith("mp4a."))
                {
                  localObject = i((String)localObject);
                  paramString = str;
                  if (localObject != null) {
                    paramString = h(a);
                  }
                }
                str = paramString;
                if (paramString == null) {
                  str = "audio/mp4a-latm";
                }
                return str;
              }
              if (((String)localObject).startsWith("mha1")) {
                return "audio/mha1";
              }
              if (((String)localObject).startsWith("mhm1")) {
                return "audio/mhm1";
              }
              if ((!((String)localObject).startsWith("ac-3")) && (!((String)localObject).startsWith("dac3")))
              {
                if ((!((String)localObject).startsWith("ec-3")) && (!((String)localObject).startsWith("dec3")))
                {
                  if (((String)localObject).startsWith("ec+3")) {
                    return "audio/eac3-joc";
                  }
                  if ((!((String)localObject).startsWith("ac-4")) && (!((String)localObject).startsWith("dac4")))
                  {
                    if (((String)localObject).startsWith("dtsc")) {
                      return "audio/vnd.dts";
                    }
                    if (((String)localObject).startsWith("dtse")) {
                      return "audio/vnd.dts.hd;profile=lbr";
                    }
                    if ((!((String)localObject).startsWith("dtsh")) && (!((String)localObject).startsWith("dtsl")))
                    {
                      if (((String)localObject).startsWith("dtsx")) {
                        return "audio/vnd.dts.uhd;profile=p2";
                      }
                      if (((String)localObject).startsWith("opus")) {
                        return "audio/opus";
                      }
                      if (((String)localObject).startsWith("vorbis")) {
                        return "audio/vorbis";
                      }
                      if (((String)localObject).startsWith("flac")) {
                        return "audio/flac";
                      }
                      if (((String)localObject).startsWith("stpp")) {
                        return "application/ttml+xml";
                      }
                      if (((String)localObject).startsWith("wvtt")) {
                        return "text/vtt";
                      }
                      if (((String)localObject).contains("cea708")) {
                        return "application/cea-708";
                      }
                      if ((!((String)localObject).contains("eia608")) && (!((String)localObject).contains("cea608"))) {
                        return e((String)localObject);
                      }
                      return "application/cea-608";
                    }
                    return "audio/vnd.dts.hd";
                  }
                  return "audio/ac4";
                }
                return "audio/eac3";
              }
              return "audio/ac3";
            }
            return "video/x-vnd.on2.vp8";
          }
          return "video/x-vnd.on2.vp9";
        }
        return "video/dolby-vision";
      }
      return "video/hevc";
    }
    return "video/avc";
  }
  
  public static String h(int paramInt)
  {
    if (paramInt != 32)
    {
      if (paramInt != 33)
      {
        if (paramInt != 35)
        {
          if (paramInt != 64)
          {
            if (paramInt != 163) {
              if (paramInt != 177) {
                if (paramInt != 221) {
                  if (paramInt != 165) {
                    if (paramInt == 166) {}
                  }
                }
              }
            }
            switch (paramInt)
            {
            default: 
              switch (paramInt)
              {
              default: 
                return null;
              case 174: 
                return "audio/ac4";
              case 173: 
                return "audio/opus";
              case 170: 
              case 171: 
                return "audio/vnd.dts.hd";
              }
              return "audio/vnd.dts";
            case 108: 
              return "image/jpeg";
            case 106: 
              return "video/mpeg";
            case 105: 
            case 107: 
              return "audio/mpeg";
            case 96: 
            case 97: 
            case 98: 
            case 99: 
            case 100: 
            case 101: 
              return "video/mpeg2";
              return "audio/eac3";
              return "audio/ac3";
              return "audio/vorbis";
              return "video/x-vnd.on2.vp9";
              return "video/wvc1";
            }
          }
          return "audio/mp4a-latm";
        }
        return "video/hevc";
      }
      return "video/avc";
    }
    return "video/mp4v-es";
  }
  
  public static a i(String paramString)
  {
    Object localObject = b.matcher(paramString);
    boolean bool = ((Matcher)localObject).matches();
    paramString = null;
    if (!bool) {
      return null;
    }
    String str = (String)g0.a.e(((Matcher)localObject).group(1));
    localObject = ((Matcher)localObject).group(2);
    try
    {
      int i = Integer.parseInt(str, 16);
      int j;
      if (localObject != null) {
        j = Integer.parseInt((String)localObject);
      } else {
        j = 0;
      }
      paramString = new a(i, j);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    return paramString;
  }
  
  public static String j(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.indexOf('/');
    if (i == -1) {
      return null;
    }
    return paramString.substring(0, i);
  }
  
  public static int k(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return -1;
    }
    if (o(paramString)) {
      return 1;
    }
    if (s(paramString)) {
      return 2;
    }
    if (r(paramString)) {
      return 3;
    }
    if (p(paramString)) {
      return 4;
    }
    if ((!"application/id3".equals(paramString)) && (!"application/x-emsg".equals(paramString)) && (!"application/x-scte35".equals(paramString)))
    {
      if ("application/x-camera-motion".equals(paramString)) {
        return 6;
      }
      return l(paramString);
    }
    return 5;
  }
  
  public static int l(String paramString)
  {
    paramString = a;
    if (paramString.size() <= 0) {
      return -1;
    }
    android.support.v4.media.a.a(paramString.get(0));
    throw null;
  }
  
  public static int m(String paramString)
  {
    return k(g(paramString));
  }
  
  public static String n(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = M.d1(paramString);
    int i = paramString.length;
    for (int j = 0; j < i; j++)
    {
      String str = g(paramString[j]);
      if ((str != null) && (s(str))) {
        return str;
      }
    }
    return null;
  }
  
  public static boolean o(String paramString)
  {
    return "audio".equals(j(paramString));
  }
  
  public static boolean p(String paramString)
  {
    boolean bool;
    if ((!"image".equals(j(paramString))) && (!"application/x-image-uri".equals(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean q(String paramString)
  {
    boolean bool = false;
    if (paramString == null) {
      return false;
    }
    if ((paramString.startsWith("video/webm")) || (paramString.startsWith("audio/webm")) || (paramString.startsWith("application/webm")) || (paramString.startsWith("video/x-matroska")) || (paramString.startsWith("audio/x-matroska")) || (paramString.startsWith("application/x-matroska"))) {
      bool = true;
    }
    return bool;
  }
  
  public static boolean r(String paramString)
  {
    boolean bool;
    if ((!"text".equals(j(paramString))) && (!"application/x-media3-cues".equals(paramString)) && (!"application/cea-608".equals(paramString)) && (!"application/cea-708".equals(paramString)) && (!"application/x-mp4-cea-608".equals(paramString)) && (!"application/x-subrip".equals(paramString)) && (!"application/ttml+xml".equals(paramString)) && (!"application/x-quicktime-tx3g".equals(paramString)) && (!"application/x-mp4-vtt".equals(paramString)) && (!"application/x-rawcc".equals(paramString)) && (!"application/vobsub".equals(paramString)) && (!"application/pgs".equals(paramString)) && (!"application/dvbsubs".equals(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean s(String paramString)
  {
    return "video".equals(j(paramString));
  }
  
  public static String t(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = c.e(paramString);
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 187090231: 
      if (paramString.equals("audio/mp3")) {
        j = 5;
      }
      break;
    case -432836267: 
      if (paramString.equals("audio/mpeg-l2")) {
        j = 4;
      }
      break;
    case -432836268: 
      if (paramString.equals("audio/mpeg-l1")) {
        j = 3;
      }
      break;
    case -586683234: 
      if (paramString.equals("audio/x-wav")) {
        j = 2;
      }
      break;
    case -979095690: 
      if (paramString.equals("application/x-mpegurl")) {
        j = 1;
      }
      break;
    case -1007807498: 
      if (paramString.equals("audio/x-flac")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return paramString;
    case 5: 
      return "audio/mpeg";
    case 4: 
      return "audio/mpeg-L2";
    case 3: 
      return "audio/mpeg-L1";
    case 2: 
      return "audio/wav";
    case 1: 
      return "application/x-mpegURL";
    }
    return "audio/flac";
  }
  
  public static final class a
  {
    public final int a;
    public final int b;
    
    public a(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
    
    public int a()
    {
      int i = b;
      if (i != 2)
      {
        if (i != 5)
        {
          if (i != 29)
          {
            if (i != 42)
            {
              if (i != 22)
              {
                if (i != 23) {
                  return 0;
                }
                return 15;
              }
              return 1073741824;
            }
            return 16;
          }
          return 12;
        }
        return 11;
      }
      return 10;
    }
  }
}

/* Location:
 * Qualified Name:     d0.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */