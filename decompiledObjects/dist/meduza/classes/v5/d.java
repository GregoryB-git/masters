package v5;

import android.graphics.Color;
import android.text.TextUtils;
import g;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x6.b;

public final class d
{
  public static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
  public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
  public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
  public static final HashMap d;
  
  static
  {
    HashMap localHashMap = new HashMap();
    d = localHashMap;
    localHashMap.put("aliceblue", Integer.valueOf(-984833));
    localHashMap.put("antiquewhite", Integer.valueOf(-332841));
    Integer localInteger1 = Integer.valueOf(-16711681);
    localHashMap.put("aqua", localInteger1);
    g.k(-8388652, localHashMap, "aquamarine", -983041, "azure", -657956, "beige", 58564, "bisque");
    g.k(-16777216, localHashMap, "black", 60365, "blanchedalmond", -16776961, "blue", -7722014, "blueviolet");
    g.k(-5952982, localHashMap, "brown", -2180985, "burlywood", -10510688, "cadetblue", -8388864, "chartreuse");
    g.k(-2987746, localHashMap, "chocolate", -32944, "coral", -10185235, "cornflowerblue", 63708, "cornsilk");
    localHashMap.put("crimson", Integer.valueOf(-2354116));
    localHashMap.put("cyan", localInteger1);
    localHashMap.put("darkblue", Integer.valueOf(-16777077));
    localHashMap.put("darkcyan", Integer.valueOf(-16741493));
    localHashMap.put("darkgoldenrod", Integer.valueOf(-4684277));
    localInteger1 = Integer.valueOf(-5658199);
    localHashMap.put("darkgray", localInteger1);
    localHashMap.put("darkgreen", Integer.valueOf(-16751616));
    localHashMap.put("darkgrey", localInteger1);
    localHashMap.put("darkkhaki", Integer.valueOf(-4343957));
    g.k(-7667573, localHashMap, "darkmagenta", -11179217, "darkolivegreen", 35840, "darkorange", -6737204, "darkorchid");
    g.k(-7667712, localHashMap, "darkred", -1468806, "darksalmon", -7357297, "darkseagreen", -12042869, "darkslateblue");
    localInteger1 = Integer.valueOf(-13676721);
    localHashMap.put("darkslategray", localInteger1);
    localHashMap.put("darkslategrey", localInteger1);
    localHashMap.put("darkturquoise", Integer.valueOf(-16724271));
    localHashMap.put("darkviolet", Integer.valueOf(-7077677));
    localHashMap.put("deeppink", Integer.valueOf(-60269));
    localHashMap.put("deepskyblue", Integer.valueOf(-16728065));
    localInteger1 = Integer.valueOf(-9868951);
    localHashMap.put("dimgray", localInteger1);
    localHashMap.put("dimgrey", localInteger1);
    g.k(-14774017, localHashMap, "dodgerblue", -5103070, "firebrick", 64240, "floralwhite", -14513374, "forestgreen");
    localInteger1 = Integer.valueOf(-65281);
    localHashMap.put("fuchsia", localInteger1);
    localHashMap.put("gainsboro", Integer.valueOf(-2302756));
    localHashMap.put("ghostwhite", Integer.valueOf(-460545));
    localHashMap.put("gold", Integer.valueOf(55040));
    localHashMap.put("goldenrod", Integer.valueOf(-2448096));
    Integer localInteger2 = Integer.valueOf(-8355712);
    localHashMap.put("gray", localInteger2);
    localHashMap.put("green", Integer.valueOf(-16744448));
    localHashMap.put("greenyellow", Integer.valueOf(-5374161));
    localHashMap.put("grey", localInteger2);
    g.k(-983056, localHashMap, "honeydew", -38476, "hotpink", -3318692, "indianred", -11861886, "indigo");
    g.k(-16, localHashMap, "ivory", -989556, "khaki", -1644806, "lavender", 61685, "lavenderblush");
    g.k(-8586240, localHashMap, "lawngreen", 64205, "lemonchiffon", -5383962, "lightblue", -1015680, "lightcoral");
    localHashMap.put("lightcyan", Integer.valueOf(-2031617));
    localHashMap.put("lightgoldenrodyellow", Integer.valueOf(-329006));
    localInteger2 = Integer.valueOf(-2894893);
    localHashMap.put("lightgray", localInteger2);
    localHashMap.put("lightgreen", Integer.valueOf(-7278960));
    localHashMap.put("lightgrey", localInteger2);
    localHashMap.put("lightpink", Integer.valueOf(46785));
    localHashMap.put("lightsalmon", Integer.valueOf(41082));
    localHashMap.put("lightseagreen", Integer.valueOf(-14634326));
    localHashMap.put("lightskyblue", Integer.valueOf(-7876870));
    localInteger2 = Integer.valueOf(-8943463);
    localHashMap.put("lightslategray", localInteger2);
    localHashMap.put("lightslategrey", localInteger2);
    localHashMap.put("lightsteelblue", Integer.valueOf(-5192482));
    localHashMap.put("lightyellow", Integer.valueOf(-32));
    localHashMap.put("lime", Integer.valueOf(-16711936));
    localHashMap.put("limegreen", Integer.valueOf(-13447886));
    localHashMap.put("linen", Integer.valueOf(-331546));
    localHashMap.put("magenta", localInteger1);
    localHashMap.put("maroon", Integer.valueOf(-8388608));
    localHashMap.put("mediumaquamarine", Integer.valueOf(-10039894));
    g.k(-16777011, localHashMap, "mediumblue", -4565549, "mediumorchid", -7114533, "mediumpurple", -12799119, "mediumseagreen");
    g.k(-8689426, localHashMap, "mediumslateblue", -16713062, "mediumspringgreen", -12004916, "mediumturquoise", -3730043, "mediumvioletred");
    g.k(-15132304, localHashMap, "midnightblue", -655366, "mintcream", 58593, "mistyrose", 58549, "moccasin");
    g.k(57005, localHashMap, "navajowhite", -16777088, "navy", -133658, "oldlace", -8355840, "olive");
    g.k(-9728477, localHashMap, "olivedrab", 42240, "orange", -47872, "orangered", -2461482, "orchid");
    g.k(-1120086, localHashMap, "palegoldenrod", -6751336, "palegreen", -5247250, "paleturquoise", -2396013, "palevioletred");
    g.k(61397, localHashMap, "papayawhip", 55993, "peachpuff", -3308225, "peru", 49355, "pink");
    g.k(-2252579, localHashMap, "plum", -5185306, "powderblue", -8388480, "purple", -10079335, "rebeccapurple");
    g.k(-65536, localHashMap, "red", -4419697, "rosybrown", -12490271, "royalblue", -7650029, "saddlebrown");
    g.k(-360334, localHashMap, "salmon", -744352, "sandybrown", -13726889, "seagreen", 62958, "seashell");
    g.k(-6270419, localHashMap, "sienna", -4144960, "silver", -7876885, "skyblue", -9807155, "slateblue");
    localInteger1 = Integer.valueOf(-9404272);
    localHashMap.put("slategray", localInteger1);
    localHashMap.put("slategrey", localInteger1);
    localHashMap.put("snow", Integer.valueOf(64250));
    localHashMap.put("springgreen", Integer.valueOf(-16711809));
    g.k(-12156236, localHashMap, "steelblue", -2968436, "tan", -16744320, "teal", -2572328, "thistle");
    g.k(-40121, localHashMap, "tomato", 0, "transparent", -12525360, "turquoise", -1146130, "violet");
    g.k(-663885, localHashMap, "wheat", -1, "white", -657931, "whitesmoke", 65280, "yellow");
    localHashMap.put("yellowgreen", Integer.valueOf(-6632142));
  }
  
  public static int a(String paramString, boolean paramBoolean)
  {
    b.q(TextUtils.isEmpty(paramString) ^ true);
    String str = paramString.replace(" ", "");
    int i;
    if (str.charAt(0) == '#')
    {
      i = (int)Long.parseLong(str.substring(1), 16);
      if (str.length() == 7)
      {
        i = 0xFF000000 | i;
      }
      else
      {
        if (str.length() != 9) {
          break label84;
        }
        i = (i & 0xFF) << 24 | i >>> 8;
      }
      return i;
      label84:
      throw new IllegalArgumentException();
    }
    int j;
    if (str.startsWith("rgba"))
    {
      if (paramBoolean) {
        paramString = c;
      } else {
        paramString = b;
      }
      paramString = paramString.matcher(str);
      if (paramString.matches())
      {
        if (paramBoolean)
        {
          str = paramString.group(4);
          str.getClass();
          i = (int)(Float.parseFloat(str) * 255.0F);
        }
        else
        {
          str = paramString.group(4);
          str.getClass();
          i = Integer.parseInt(str, 10);
        }
        str = paramString.group(1);
        str.getClass();
        j = Integer.parseInt(str, 10);
        str = paramString.group(2);
        str.getClass();
        int k = Integer.parseInt(str, 10);
        paramString = paramString.group(3);
        paramString.getClass();
        return Color.argb(i, j, k, Integer.parseInt(paramString, 10));
      }
    }
    else if (str.startsWith("rgb"))
    {
      paramString = a.matcher(str);
      if (paramString.matches())
      {
        str = paramString.group(1);
        str.getClass();
        i = Integer.parseInt(str, 10);
        str = paramString.group(2);
        str.getClass();
        j = Integer.parseInt(str, 10);
        paramString = paramString.group(3);
        paramString.getClass();
        return Color.rgb(i, j, Integer.parseInt(paramString, 10));
      }
    }
    else
    {
      paramString = (Integer)d.get(b.x0(str));
      if (paramString != null) {
        return paramString.intValue();
      }
    }
    throw new IllegalArgumentException();
  }
}

/* Location:
 * Qualified Name:     v5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */