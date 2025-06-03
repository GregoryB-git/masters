package q5;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import h5.a.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l5.a;
import l5.c;
import v5.e0;
import v5.m;
import v5.u;
import x6.b;

public final class f
{
  public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
  public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
  public static final Map<String, Integer> c;
  public static final Map<String, Integer> d;
  
  static
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
    localHashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
    localHashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
    localHashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
    localHashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
    localHashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
    localHashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
    localHashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
    c = Collections.unmodifiableMap(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
    localHashMap.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
    localHashMap.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
    localHashMap.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
    localHashMap.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
    localHashMap.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
    localHashMap.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
    localHashMap.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
    d = Collections.unmodifiableMap(localHashMap);
  }
  
  public static void a(SpannableStringBuilder paramSpannableStringBuilder, b paramb, String paramString, List paramList1, List paramList2)
  {
    int i = b;
    int j = paramSpannableStringBuilder.length();
    Object localObject = a;
    localObject.getClass();
    int k = ((String)localObject).hashCode();
    if (k != 0)
    {
      if (k != 105)
      {
        if (k != 3314158)
        {
          if (k != 3511770)
          {
            if (k != 98)
            {
              if (k != 99)
              {
                if (k != 117)
                {
                  if ((k == 118) && (((String)localObject).equals("v")))
                  {
                    k = 5;
                    break label242;
                  }
                }
                else if (((String)localObject).equals("u"))
                {
                  k = 4;
                  break label242;
                }
              }
              else if (((String)localObject).equals("c"))
              {
                k = 2;
                break label242;
              }
            }
            else if (((String)localObject).equals("b"))
            {
              k = 1;
              break label242;
            }
          }
          else if (((String)localObject).equals("ruby"))
          {
            k = 7;
            break label242;
          }
        }
        else if (((String)localObject).equals("lang"))
        {
          k = 6;
          break label242;
        }
      }
      else if (((String)localObject).equals("i"))
      {
        k = 3;
        break label242;
      }
    }
    else {
      if (((String)localObject).equals("")) {
        break label239;
      }
    }
    k = -1;
    break label242;
    label239:
    k = 0;
    label242:
    int m;
    int n;
    int i1;
    int i2;
    switch (k)
    {
    default: 
      return;
    case 7: 
      m = c(paramList2, paramString, paramb);
      localObject = new ArrayList(paramList1.size());
      ((ArrayList)localObject).addAll(paramList1);
      Collections.sort((List)localObject, a.c);
      n = b;
      i1 = 0;
      i2 = 0;
    case 4: 
    case 3: 
    case 2: 
    case 1: 
      while (i1 < ((ArrayList)localObject).size())
      {
        if ("rt".equals(geta.a))
        {
          paramList1 = (a)((ArrayList)localObject).get(i1);
          k = c(paramList2, paramString, a);
          if (k == -1) {
            if (m != -1) {
              k = m;
            } else {
              k = 1;
            }
          }
          int i3 = a.b - i2;
          int i4 = b - i2;
          paramList1 = paramSpannableStringBuilder.subSequence(i3, i4);
          paramSpannableStringBuilder.delete(i3, i4);
          paramSpannableStringBuilder.setSpan(new c(paramList1.toString(), k), n, i3, 33);
          i2 = paramList1.length() + i2;
          n = i3;
        }
        i1++;
        continue;
        paramList1 = new UnderlineSpan();
        break label671;
        paramList1 = new StyleSpan(2);
        break label671;
        localObject = d.iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramList1 = (String)((Iterator)localObject).next();
          Map localMap = c;
          if (localMap.containsKey(paramList1))
          {
            paramList1 = new ForegroundColorSpan(((Integer)localMap.get(paramList1)).intValue());
          }
          else
          {
            localMap = d;
            if (!localMap.containsKey(paramList1)) {
              continue;
            }
            paramList1 = new BackgroundColorSpan(((Integer)localMap.get(paramList1)).intValue());
          }
          paramSpannableStringBuilder.setSpan(paramList1, i, j, 33);
        }
        paramList1 = new StyleSpan(1);
        label671:
        paramSpannableStringBuilder.setSpan(paramList1, i, j, 33);
      }
    }
    paramString = b(paramList2, paramString, paramb);
    for (k = 0; k < paramString.size(); k++)
    {
      paramList1 = getb;
      if (paramList1 != null)
      {
        i1 = l;
        if ((i1 == -1) && (m == -1))
        {
          i1 = -1;
        }
        else
        {
          if (i1 == 1) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          if (m == 1) {
            i2 = 2;
          } else {
            i2 = 0;
          }
          i1 = i2 | i1;
        }
        if (i1 != -1)
        {
          i1 = l;
          if ((i1 == -1) && (m == -1))
          {
            i1 = -1;
          }
          else
          {
            if (i1 == 1) {
              i1 = 1;
            } else {
              i1 = 0;
            }
            if (m == 1) {
              i2 = 2;
            } else {
              i2 = 0;
            }
            i1 |= i2;
          }
          b.d(paramSpannableStringBuilder, new StyleSpan(i1), i, j);
        }
        if (j == 1) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0) {
          paramSpannableStringBuilder.setSpan(new StrikethroughSpan(), i, j, 33);
        }
        if (k == 1) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0) {
          paramSpannableStringBuilder.setSpan(new UnderlineSpan(), i, j, 33);
        }
        if (g) {
          if (g) {
            b.d(paramSpannableStringBuilder, new ForegroundColorSpan(f), i, j);
          } else {
            throw new IllegalStateException("Font color not defined");
          }
        }
        if (i) {
          if (i) {
            b.d(paramSpannableStringBuilder, new BackgroundColorSpan(h), i, j);
          } else {
            throw new IllegalStateException("Background color not defined.");
          }
        }
        if (e != null) {
          b.d(paramSpannableStringBuilder, new TypefaceSpan(e), i, j);
        }
        i1 = n;
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3) {
              break label1157;
            }
            paramb = new RelativeSizeSpan(o / 100.0F);
          }
          else
          {
            paramb = new RelativeSizeSpan(o);
          }
        }
        else {
          paramb = new AbsoluteSizeSpan((int)o, true);
        }
        b.d(paramSpannableStringBuilder, paramb, i, j);
        label1157:
        if (q) {
          paramSpannableStringBuilder.setSpan(new a(), i, j, 33);
        }
      }
    }
  }
  
  public static ArrayList b(List paramList, String paramString, b paramb)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
    {
      d locald = (d)paramList.get(i);
      String str1 = a;
      Set localSet = d;
      String str2 = c;
      int j;
      if ((a.isEmpty()) && (b.isEmpty()) && (c.isEmpty()) && (d.isEmpty()))
      {
        boolean bool = TextUtils.isEmpty(str1);
      }
      else
      {
        j = d.a(a, 0, 1073741824, paramString);
        j = d.a(b, j, 2, str1);
        j = d.a(d, j, 4, str2);
        if ((j != -1) && (localSet.containsAll(c))) {
          j += c.size() * 4;
        } else {
          j = 0;
        }
      }
      if (j > 0) {
        localArrayList.add(new c(j, locald));
      }
    }
    Collections.sort(localArrayList);
    return localArrayList;
  }
  
  public static int c(List<d> paramList, String paramString, b paramb)
  {
    paramList = b(paramList, paramString, paramb);
    for (int i = 0; i < paramList.size(); i++)
    {
      int j = getb.p;
      if (j != -1) {
        return j;
      }
    }
    return -1;
  }
  
  public static e d(String paramString, Matcher paramMatcher, u paramu, ArrayList paramArrayList)
  {
    d locald = new d();
    try
    {
      String str = paramMatcher.group(1);
      str.getClass();
      a = h.c(str);
      str = paramMatcher.group(2);
      str.getClass();
      b = h.c(str);
      paramMatcher = paramMatcher.group(3);
      paramMatcher.getClass();
      e(paramMatcher, locald);
      paramMatcher = new StringBuilder();
      for (;;)
      {
        str = paramu.g();
        if (TextUtils.isEmpty(str)) {
          break;
        }
        if (paramMatcher.length() > 0) {
          paramMatcher.append("\n");
        }
        paramMatcher.append(str.trim());
      }
      c = f(paramString, paramMatcher.toString(), paramArrayList);
      return new e(locald.a().a(), a, b);
    }
    catch (NumberFormatException paramString)
    {
      paramString = f.l("Skipping cue with bad header: ");
      paramString.append(paramMatcher.group());
      m.f("WebvttCueParser", paramString.toString());
    }
    return null;
  }
  
  public static void e(String paramString, d paramd)
  {
    paramString = b.matcher(paramString);
    while (paramString.find())
    {
      int i = 1;
      int j = 1;
      Object localObject = paramString.group(1);
      localObject.getClass();
      String str = paramString.group(2);
      str.getClass();
      try
      {
        if ("line".equals(localObject))
        {
          g(str, paramd);
        }
        else
        {
          boolean bool = "align".equals(localObject);
          if (bool)
          {
            str.hashCode();
            i = -1;
            switch (str.hashCode())
            {
            default: 
              break;
            case 109757538: 
              if (str.equals("start")) {
                i = 5;
              }
              break;
            case 108511772: 
              if (str.equals("right")) {
                i = 4;
              }
              break;
            case 3317767: 
              if (str.equals("left")) {
                i = 3;
              }
              break;
            case 100571: 
              if (str.equals("end")) {
                i = 2;
              }
              break;
            case -1074341483: 
              if (str.equals("middle")) {
                i = 1;
              }
              break;
            case -1364013995: 
              if (str.equals("center")) {
                i = 0;
              }
              break;
            }
            switch (i)
            {
            default: 
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>();
              ((StringBuilder)localObject).append("Invalid alignment value: ");
              ((StringBuilder)localObject).append(str);
              m.f("WebvttCueParser", ((StringBuilder)localObject).toString());
              break;
            case 4: 
              j = 5;
              break;
            case 3: 
              j = 4;
              break;
            case 2: 
              j = 3;
              break;
            case 0: 
            case 1: 
              j = 2;
            }
            d = j;
          }
          else if ("position".equals(localObject))
          {
            h(str, paramd);
          }
          else if ("size".equals(localObject))
          {
            j = h.b(str);
          }
          else if ("vertical".equals(localObject))
          {
            if (!str.equals("lr"))
            {
              if (!str.equals("rl"))
              {
                localObject = new java/lang/StringBuilder;
                ((StringBuilder)localObject).<init>();
                ((StringBuilder)localObject).append("Invalid 'vertical' value: ");
                ((StringBuilder)localObject).append(str);
                m.f("WebvttCueParser", ((StringBuilder)localObject).toString());
                i = Integer.MIN_VALUE;
              }
            }
            else {
              i = 2;
            }
            k = i;
          }
          else
          {
            StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
            localStringBuilder2.<init>();
            localStringBuilder2.append("Unknown cue setting ");
            localStringBuilder2.append((String)localObject);
            localStringBuilder2.append(":");
            localStringBuilder2.append(str);
            m.f("WebvttCueParser", localStringBuilder2.toString());
          }
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        StringBuilder localStringBuilder1 = f.l("Skipping bad cue setting: ");
        localStringBuilder1.append(paramString.group());
        m.f("WebvttCueParser", localStringBuilder1.toString());
      }
    }
  }
  
  public static SpannedString f(String paramString1, String paramString2, List<d> paramList)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    ArrayDeque localArrayDeque = new ArrayDeque();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (;;)
    {
      int j = paramString2.length();
      Object localObject1 = "";
      if (i >= j) {
        break;
      }
      char c1 = paramString2.charAt(i);
      int k;
      int n;
      Object localObject3;
      if (c1 != '&')
      {
        if (c1 != '<')
        {
          localSpannableStringBuilder.append(c1);
          i++;
        }
        else
        {
          j = i + 1;
          if (j >= paramString2.length()) {
            i = j;
          }
          for (;;)
          {
            break;
            if (paramString2.charAt(j) == '/') {
              k = 1;
            } else {
              k = 0;
            }
            j = paramString2.indexOf('>', j);
            if (j == -1) {
              j = paramString2.length();
            } else {
              j++;
            }
            int m = j - 2;
            if (paramString2.charAt(m) == '/') {
              n = 1;
            } else {
              n = 0;
            }
            int i1;
            if (k != 0) {
              i1 = 2;
            } else {
              i1 = 1;
            }
            if (n == 0) {
              m = j - 1;
            }
            Object localObject2 = paramString2.substring(i + i1, m);
            if (((String)localObject2).trim().isEmpty())
            {
              i = j;
            }
            else
            {
              localObject3 = ((String)localObject2).trim();
              b.q(((String)localObject3).isEmpty() ^ true);
              i = e0.a;
              localObject3 = localObject3.split("[ \\.]", 2)[0];
              localObject3.getClass();
              i = ((String)localObject3).hashCode();
              if (i != 98)
              {
                if (i != 99)
                {
                  if (i != 105)
                  {
                    if (i != 3650)
                    {
                      if (i != 3314158)
                      {
                        if (i != 3511770)
                        {
                          if (i != 117)
                          {
                            if ((i == 118) && (((String)localObject3).equals("v")))
                            {
                              i = 4;
                              break label498;
                            }
                          }
                          else if (((String)localObject3).equals("u"))
                          {
                            i = 3;
                            break label498;
                          }
                        }
                        else if (((String)localObject3).equals("ruby"))
                        {
                          i = 7;
                          break label498;
                        }
                      }
                      else if (((String)localObject3).equals("lang"))
                      {
                        i = 6;
                        break label498;
                      }
                    }
                    else if (((String)localObject3).equals("rt"))
                    {
                      i = 5;
                      break label498;
                    }
                  }
                  else if (((String)localObject3).equals("i"))
                  {
                    i = 2;
                    break label498;
                  }
                }
                else if (((String)localObject3).equals("c"))
                {
                  i = 1;
                  break label498;
                }
              }
              else {
                if (((String)localObject3).equals("b")) {
                  break label495;
                }
              }
              i = -1;
              break label498;
              label495:
              i = 0;
              switch (i)
              {
              default: 
                i = 0;
                break;
              case 0: 
              case 1: 
              case 2: 
              case 3: 
              case 4: 
              case 5: 
              case 6: 
              case 7: 
                label498:
                i = 1;
              }
              if (i == 0)
              {
                i = j;
              }
              else if (k != 0)
              {
                do
                {
                  if (localArrayDeque.isEmpty())
                  {
                    i = j;
                    break;
                  }
                  localObject1 = (b)localArrayDeque.pop();
                  a(localSpannableStringBuilder, (b)localObject1, paramString1, localArrayList, paramList);
                  if (!localArrayDeque.isEmpty()) {
                    localArrayList.add(new a((b)localObject1, localSpannableStringBuilder.length()));
                  } else {
                    localArrayList.clear();
                  }
                } while (!a.equals(localObject3));
                i = j;
              }
              else
              {
                i = j;
                if (n == 0)
                {
                  k = localSpannableStringBuilder.length();
                  localObject3 = ((String)localObject2).trim();
                  b.q(((String)localObject3).isEmpty() ^ true);
                  i = ((String)localObject3).indexOf(" ");
                  if (i != -1)
                  {
                    localObject1 = ((String)localObject3).substring(i).trim();
                    localObject3 = ((String)localObject3).substring(0, i);
                  }
                  String[] arrayOfString = ((String)localObject3).split("\\.", -1);
                  localObject3 = arrayOfString[0];
                  localObject2 = new HashSet();
                  for (i = 1; i < arrayOfString.length; i++) {
                    ((HashSet)localObject2).add(arrayOfString[i]);
                  }
                  localArrayDeque.push(new b((String)localObject3, k, (String)localObject1, (Set)localObject2));
                  i = j;
                }
              }
            }
          }
        }
      }
      else
      {
        i++;
        j = paramString2.indexOf(';', i);
        k = paramString2.indexOf(' ', i);
        n = -1;
        if (j == -1) {
          j = k;
        } else if (k != -1) {
          j = Math.min(j, k);
        }
        if (j != -1)
        {
          localObject1 = paramString2.substring(i, j);
          localObject1.getClass();
          switch (((String)localObject1).hashCode())
          {
          default: 
            i = n;
            break;
          case 3374865: 
            if (!((String)localObject1).equals("nbsp")) {
              i = n;
            } else {
              i = 3;
            }
            break;
          case 96708: 
            if (!((String)localObject1).equals("amp")) {
              i = n;
            } else {
              i = 2;
            }
            break;
          case 3464: 
            if (!((String)localObject1).equals("lt")) {
              i = n;
            } else {
              i = 1;
            }
            break;
          case 3309: 
            if (!((String)localObject1).equals("gt")) {
              i = n;
            } else {
              i = 0;
            }
            break;
          }
          switch (i)
          {
          default: 
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("ignoring unsupported entity: '&");
            ((StringBuilder)localObject3).append((String)localObject1);
            ((StringBuilder)localObject3).append(";'");
            m.f("WebvttCueParser", ((StringBuilder)localObject3).toString());
            break;
          case 3: 
            i = 32;
            c1 = i;
            break;
          case 2: 
            i = 38;
            c1 = i;
            break;
          case 1: 
            i = 60;
            c1 = i;
            break;
          case 0: 
            i = 62;
            c1 = i;
          }
          localSpannableStringBuilder.append(c1);
          if (j == k) {
            localSpannableStringBuilder.append(" ");
          }
          i = j + 1;
        }
        else
        {
          localSpannableStringBuilder.append(c1);
        }
      }
    }
    while (!localArrayDeque.isEmpty()) {
      a(localSpannableStringBuilder, (b)localArrayDeque.pop(), paramString1, localArrayList, paramList);
    }
    a(localSpannableStringBuilder, new b("", 0, "", Collections.emptySet()), paramString1, Collections.emptyList(), paramList);
    return SpannedString.valueOf(localSpannableStringBuilder);
  }
  
  public static void g(String paramString, d paramd)
  {
    int i = paramString.indexOf(',');
    int j = -1;
    String str = paramString;
    if (i != -1)
    {
      str = paramString.substring(i + 1);
      str.getClass();
      int k = str.hashCode();
      int m = 2;
      switch (k)
      {
      default: 
        break;
      case 109757538: 
        if (str.equals("start")) {
          j = 3;
        }
        break;
      case 100571: 
        if (str.equals("end")) {
          j = 2;
        }
        break;
      case -1074341483: 
        if (str.equals("middle")) {
          j = 1;
        }
        break;
      case -1364013995: 
        if (str.equals("center")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Invalid anchor value: ");
        localStringBuilder.append(str);
        m.f("WebvttCueParser", localStringBuilder.toString());
        m = Integer.MIN_VALUE;
        break;
      case 3: 
        m = 0;
        break;
      case 0: 
      case 1: 
        m = 1;
      }
      g = m;
      str = paramString.substring(0, i);
    }
    if (str.endsWith("%"))
    {
      e = h.b(str);
      f = 0;
    }
    else
    {
      e = Integer.parseInt(str);
      f = 1;
    }
  }
  
  public static void h(String paramString, d paramd)
  {
    int i = paramString.indexOf(',');
    int j = -1;
    Object localObject = paramString;
    if (i != -1)
    {
      String str = paramString.substring(i + 1);
      str.getClass();
      int k = str.hashCode();
      int m = 2;
      switch (k)
      {
      default: 
        break;
      case 109757538: 
        if (str.equals("start")) {
          j = 5;
        }
        break;
      case 100571: 
        if (str.equals("end")) {
          j = 4;
        }
        break;
      case -1074341483: 
        if (str.equals("middle")) {
          j = 3;
        }
        break;
      case -1276788989: 
        if (str.equals("line-right")) {
          j = 2;
        }
        break;
      case -1364013995: 
        if (str.equals("center")) {
          j = 1;
        }
        break;
      case -1842484672: 
        if (str.equals("line-left")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invalid anchor value: ");
        ((StringBuilder)localObject).append(str);
        m.f("WebvttCueParser", ((StringBuilder)localObject).toString());
        m = Integer.MIN_VALUE;
        break;
      case 1: 
      case 3: 
        m = 1;
        break;
      case 0: 
      case 5: 
        m = 0;
      }
      i = m;
      localObject = paramString.substring(0, i);
    }
    h = h.b((String)localObject);
  }
  
  public static final class a
  {
    public static final b0.d c = new b0.d(2);
    public final f.b a;
    public final int b;
    
    public a(f.b paramb, int paramInt)
    {
      a = paramb;
      b = paramInt;
    }
  }
  
  public static final class b
  {
    public final String a;
    public final int b;
    public final String c;
    public final Set<String> d;
    
    public b(String paramString1, int paramInt, String paramString2, Set<String> paramSet)
    {
      b = paramInt;
      a = paramString1;
      c = paramString2;
      d = paramSet;
    }
  }
  
  public static final class c
    implements Comparable<c>
  {
    public final int a;
    public final d b;
    
    public c(int paramInt, d paramd)
    {
      a = paramInt;
      b = paramd;
    }
    
    public final int compareTo(Object paramObject)
    {
      paramObject = (c)paramObject;
      return Integer.compare(a, a);
    }
  }
  
  public static final class d
  {
    public long a = 0L;
    public long b = 0L;
    public CharSequence c;
    public int d = 2;
    public float e = -3.4028235E38F;
    public int f = 1;
    public int g = 0;
    public float h = -3.4028235E38F;
    public int i = Integer.MIN_VALUE;
    public float j = 1.0F;
    public int k = Integer.MIN_VALUE;
    
    public final a.a a()
    {
      float f1 = h;
      float f2 = -3.4028235E38F;
      if (f1 == -3.4028235E38F)
      {
        m = d;
        if (m != 4)
        {
          if (m != 5) {
            f1 = 0.5F;
          } else {
            f1 = 1.0F;
          }
        }
        else {
          f1 = 0.0F;
        }
      }
      int m = i;
      if (m == Integer.MIN_VALUE)
      {
        m = d;
        if (m != 1)
        {
          if (m != 3)
          {
            if (m == 4) {
              break label95;
            }
            if (m != 5)
            {
              m = 1;
              break label97;
            }
          }
          m = 2;
          break label97;
        }
        label95:
        m = 0;
      }
      label97:
      a.a locala = new a.a();
      int n = d;
      if (n != 1) {
        if (n != 2)
        {
          if (n != 3)
          {
            if (n == 4) {
              break label173;
            }
            if (n != 5)
            {
              f.p("Unknown textAlignment: ", n, "WebvttCueParser");
              localObject = null;
              break label178;
            }
          }
          localObject = Layout.Alignment.ALIGN_OPPOSITE;
          break label178;
        }
        else
        {
          localObject = Layout.Alignment.ALIGN_CENTER;
          break label178;
        }
      }
      label173:
      Object localObject = Layout.Alignment.ALIGN_NORMAL;
      label178:
      c = ((Layout.Alignment)localObject);
      float f3 = e;
      int i1 = f;
      boolean bool = f3 < -3.4028235E38F;
      if ((!bool) || (i1 != 0) || ((f3 >= 0.0F) && (f3 <= 1.0F)))
      {
        if (bool) {
          f2 = f3;
        } else if (i1 != 0) {}
      }
      else {
        f2 = 1.0F;
      }
      e = f2;
      f = i1;
      g = g;
      h = f1;
      i = m;
      f2 = j;
      if (m != 0)
      {
        if (m != 1)
        {
          if (m != 2) {
            throw new IllegalStateException(String.valueOf(m));
          }
        }
        else if (f1 <= 0.5F) {
          f1 *= 2.0F;
        } else {
          f1 = (1.0F - f1) * 2.0F;
        }
      }
      else {
        f1 = 1.0F - f1;
      }
      l = Math.min(f2, f1);
      p = k;
      localObject = c;
      if (localObject != null) {
        a = ((CharSequence)localObject);
      }
      return locala;
    }
  }
}

/* Location:
 * Qualified Name:     q5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */