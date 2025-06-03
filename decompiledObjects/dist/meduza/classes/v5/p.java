package v5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x6.b;

public final class p
{
  public static final ArrayList<a> a = new ArrayList();
  public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
  
  public static boolean a(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    if (paramString1 == null) {
      return false;
    }
    int i = -1;
    switch (paramString1.hashCode())
    {
    default: 
      break;
    case 1903589369: 
      if (paramString1.equals("audio/g711-mlaw")) {
        i = 10;
      }
      break;
    case 1903231877: 
      if (paramString1.equals("audio/g711-alaw")) {
        i = 9;
      }
      break;
    case 1504831518: 
      if (paramString1.equals("audio/mpeg")) {
        i = 8;
      }
      break;
    case 1504619009: 
      if (paramString1.equals("audio/flac")) {
        i = 7;
      }
      break;
    case 1504578661: 
      if (paramString1.equals("audio/eac3")) {
        i = 6;
      }
      break;
    case 187094639: 
      if (paramString1.equals("audio/raw")) {
        i = 5;
      }
      break;
    case 187078296: 
      if (paramString1.equals("audio/ac3")) {
        i = 4;
      }
      break;
    case -53558318: 
      if (paramString1.equals("audio/mp4a-latm")) {
        i = 3;
      }
      break;
    case -432837259: 
      if (paramString1.equals("audio/mpeg-L2")) {
        i = 2;
      }
      break;
    case -432837260: 
      if (paramString1.equals("audio/mpeg-L1")) {
        i = 1;
      }
      break;
    case -2123537834: 
      if (paramString1.equals("audio/eac3-joc")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      return false;
    case 3: 
      if (paramString2 == null) {
        return false;
      }
      paramString1 = g(paramString2);
      if (paramString1 == null) {
        return false;
      }
      i = paramString1.a();
      boolean bool2 = bool1;
      if (i != 0)
      {
        bool2 = bool1;
        if (i != 16) {
          bool2 = true;
        }
      }
      return bool2;
    }
    return true;
  }
  
  public static String b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = e0.Q(paramString);
    int i = paramString.length;
    for (int j = 0; j < i; j++)
    {
      String str = e(paramString[j]);
      if ((str != null) && (k(str))) {
        return str;
      }
    }
    return null;
  }
  
  public static String c(String paramString1, String paramString2)
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
        localObject2 = e0.Q(paramString1);
        paramString1 = new StringBuilder();
        int i = localObject2.length;
        for (int j = 0; j < i; j++)
        {
          String str = localObject2[j];
          if (paramString2.equals(e(str)))
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
  
  public static int d(String paramString1, String paramString2)
  {
    int i = paramString1.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1556697186: 
      if (paramString1.equals("audio/true-hd")) {
        j = 9;
      }
      break;
    case 1505942594: 
      if (paramString1.equals("audio/vnd.dts.hd")) {
        j = 8;
      }
      break;
    case 1504891608: 
      if (paramString1.equals("audio/opus")) {
        j = 7;
      }
      break;
    case 1504831518: 
      if (paramString1.equals("audio/mpeg")) {
        j = 6;
      }
      break;
    case 1504578661: 
      if (paramString1.equals("audio/eac3")) {
        j = 5;
      }
      break;
    case 187078297: 
      if (paramString1.equals("audio/ac4")) {
        j = 4;
      }
      break;
    case 187078296: 
      if (paramString1.equals("audio/ac3")) {
        j = 3;
      }
      break;
    case -53558318: 
      if (paramString1.equals("audio/mp4a-latm")) {
        j = 2;
      }
      break;
    case -1095064472: 
      if (paramString1.equals("audio/vnd.dts")) {
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
    case 9: 
      return 14;
    case 8: 
      return 8;
    case 7: 
      return 20;
    case 6: 
      return 9;
    case 5: 
      return 6;
    case 4: 
      return 17;
    case 3: 
      return 5;
    case 2: 
      if (paramString2 == null) {
        return 0;
      }
      paramString1 = g(paramString2);
      if (paramString1 == null) {
        return 0;
      }
      return paramString1.a();
    case 1: 
      return 7;
    }
    return 18;
  }
  
  public static String e(String paramString)
  {
    String str = null;
    if (paramString == null) {
      return null;
    }
    Object localObject = b.x0(paramString.trim());
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
                  localObject = g((String)localObject);
                  paramString = str;
                  if (localObject != null) {
                    paramString = f(a);
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
                      if ((!((String)localObject).contains("eia608")) && (!((String)localObject).contains("cea608")))
                      {
                        int i = a.size();
                        for (int j = 0; j < i; j++)
                        {
                          ((a)a.get(j)).getClass();
                          if (((String)localObject).startsWith(null)) {
                            break;
                          }
                        }
                        return null;
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
  
  public static String f(int paramInt)
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
                if (paramInt != 165) {
                  if (paramInt == 166) {}
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
  
  public static b g(String paramString)
  {
    Object localObject = b.matcher(paramString);
    if (!((Matcher)localObject).matches()) {
      return null;
    }
    paramString = ((Matcher)localObject).group(1);
    paramString.getClass();
    localObject = ((Matcher)localObject).group(2);
    int i = 0;
    try
    {
      int j = Integer.parseInt(paramString, 16);
      if (localObject != null) {
        i = Integer.parseInt((String)localObject);
      }
      return new b(j, i);
    }
    catch (NumberFormatException paramString) {}
    return null;
  }
  
  public static String h(String paramString)
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
  
  public static int i(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    int i = -1;
    if (bool) {
      return -1;
    }
    if (k(paramString)) {
      return 1;
    }
    if (m(paramString)) {
      return 2;
    }
    if (l(paramString)) {
      return 3;
    }
    if ("image".equals(h(paramString))) {
      return 4;
    }
    if ((!"application/id3".equals(paramString)) && (!"application/x-emsg".equals(paramString)) && (!"application/x-scte35".equals(paramString)))
    {
      if ("application/x-camera-motion".equals(paramString)) {
        return 6;
      }
      int j = a.size();
      int m;
      for (int k = 0;; k++)
      {
        m = i;
        if (k >= j) {
          break;
        }
        ((a)a.get(k)).getClass();
        if (paramString.equals(null))
        {
          m = 0;
          break;
        }
      }
      return m;
    }
    return 5;
  }
  
  public static String j(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = e0.Q(paramString);
    int i = paramString.length;
    for (int j = 0; j < i; j++)
    {
      String str = e(paramString[j]);
      if ((str != null) && (m(str))) {
        return str;
      }
    }
    return null;
  }
  
  public static boolean k(String paramString)
  {
    return "audio".equals(h(paramString));
  }
  
  public static boolean l(String paramString)
  {
    boolean bool;
    if ((!"text".equals(h(paramString))) && (!"application/cea-608".equals(paramString)) && (!"application/cea-708".equals(paramString)) && (!"application/x-mp4-cea-608".equals(paramString)) && (!"application/x-subrip".equals(paramString)) && (!"application/ttml+xml".equals(paramString)) && (!"application/x-quicktime-tx3g".equals(paramString)) && (!"application/x-mp4-vtt".equals(paramString)) && (!"application/x-rawcc".equals(paramString)) && (!"application/vobsub".equals(paramString)) && (!"application/pgs".equals(paramString)) && (!"application/dvbsubs".equals(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean m(String paramString)
  {
    return "video".equals(h(paramString));
  }
  
  public static final class a {}
  
  public static final class b
  {
    public final int a;
    public final int b;
    
    public b(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
    
    public final int a()
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
 * Qualified Name:     v5.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */