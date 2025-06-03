package k1;

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
import f0.a.b;
import g0.M;
import g0.o;
import g0.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class e
{
  public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
  public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
  public static final Map c;
  public static final Map d;
  
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
  
  public static void a(SpannableStringBuilder paramSpannableStringBuilder, Set paramSet, int paramInt1, int paramInt2)
  {
    Iterator localIterator = paramSet.iterator();
    if (localIterator.hasNext())
    {
      paramSet = (String)localIterator.next();
      Map localMap = c;
      if (localMap.containsKey(paramSet)) {}
      for (paramSet = new ForegroundColorSpan(((Integer)localMap.get(paramSet)).intValue());; paramSet = new BackgroundColorSpan(((Integer)localMap.get(paramSet)).intValue()))
      {
        paramSpannableStringBuilder.setSpan(paramSet, paramInt1, paramInt2, 33);
        break;
        localMap = d;
        if (!localMap.containsKey(paramSet)) {
          break;
        }
      }
    }
  }
  
  public static void b(String paramString, SpannableStringBuilder paramSpannableStringBuilder)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 3374865: 
      if (paramString.equals("nbsp")) {
        j = 3;
      }
      break;
    case 96708: 
      if (paramString.equals("amp")) {
        j = 2;
      }
      break;
    case 3464: 
      if (paramString.equals("lt")) {
        j = 1;
      }
      break;
    case 3309: 
      if (paramString.equals("gt")) {
        j = 0;
      }
      break;
    }
    int k;
    switch (j)
    {
    default: 
      paramSpannableStringBuilder = new StringBuilder();
      paramSpannableStringBuilder.append("ignoring unsupported entity: '&");
      paramSpannableStringBuilder.append(paramString);
      paramSpannableStringBuilder.append(";'");
      o.h("WebvttCueParser", paramSpannableStringBuilder.toString());
      break;
    case 3: 
      j = 32;
      k = j;
    case 2: 
    case 1: 
    case 0: 
      for (;;)
      {
        paramSpannableStringBuilder.append(k);
        break;
        j = 38;
        k = j;
        continue;
        j = 60;
        k = j;
        continue;
        j = 62;
        k = j;
      }
    }
  }
  
  public static void c(SpannableStringBuilder paramSpannableStringBuilder, String paramString, c paramc, List paramList1, List paramList2)
  {
    int i = i(paramList2, paramString, paramc);
    ArrayList localArrayList = new ArrayList(paramList1.size());
    localArrayList.addAll(paramList1);
    Collections.sort(localArrayList, b.b());
    int j = b;
    int k = 0;
    int m = 0;
    while (k < localArrayList.size())
    {
      if ("rt".equals(cgeta))
      {
        paramc = (b)localArrayList.get(k);
        int n = g(i(paramList2, paramString, b.c(paramc)), i, 1);
        int i1 = cb - m;
        int i2 = b.d(paramc) - m;
        paramc = paramSpannableStringBuilder.subSequence(i1, i2);
        paramSpannableStringBuilder.delete(i1, i2);
        paramSpannableStringBuilder.setSpan(new f0.e(paramc.toString(), n), j, i1, 33);
        m += paramc.length();
        j = i1;
      }
      k++;
    }
  }
  
  public static void d(String paramString, c paramc, List paramList1, SpannableStringBuilder paramSpannableStringBuilder, List paramList2)
  {
    int i = b;
    int j = paramSpannableStringBuilder.length();
    String str = a;
    str.hashCode();
    int k = str.hashCode();
    int m = 0;
    int n = -1;
    switch (k)
    {
    default: 
      break;
    case 3511770: 
      if (str.equals("ruby")) {
        n = 7;
      }
      break;
    case 3314158: 
      if (str.equals("lang")) {
        n = 6;
      }
      break;
    case 118: 
      if (str.equals("v")) {
        n = 5;
      }
      break;
    case 117: 
      if (str.equals("u")) {
        n = 4;
      }
      break;
    case 105: 
      if (str.equals("i")) {
        n = 3;
      }
      break;
    case 99: 
      if (str.equals("c")) {
        n = 2;
      }
      break;
    case 98: 
      if (str.equals("b")) {
        n = 1;
      }
      break;
    case 0: 
      if (str.equals("")) {
        n = 0;
      }
      break;
    }
    switch (n)
    {
    default: 
      return;
    case 7: 
      c(paramSpannableStringBuilder, paramString, paramc, paramList1, paramList2);
      break;
    case 4: 
      paramList1 = new UnderlineSpan();
    case 3: 
    case 2: 
    case 1: 
      for (;;)
      {
        paramSpannableStringBuilder.setSpan(paramList1, i, j, 33);
        break;
        paramList1 = new StyleSpan(2);
        continue;
        a(paramSpannableStringBuilder, d, i, j);
        break;
        paramList1 = new StyleSpan(1);
      }
    }
    paramString = h(paramList2, paramString, paramc);
    for (n = m; n < paramString.size(); n++) {
      e(paramSpannableStringBuilder, getp, i, j);
    }
  }
  
  public static void e(SpannableStringBuilder paramSpannableStringBuilder, c paramc, int paramInt1, int paramInt2)
  {
    if (paramc == null) {
      return;
    }
    if (paramc.i() != -1) {
      f0.f.b(paramSpannableStringBuilder, new StyleSpan(paramc.i()), paramInt1, paramInt2, 33);
    }
    if (paramc.l()) {
      paramSpannableStringBuilder.setSpan(new StrikethroughSpan(), paramInt1, paramInt2, 33);
    }
    if (paramc.m()) {
      paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt1, paramInt2, 33);
    }
    if (paramc.k()) {
      f0.f.b(paramSpannableStringBuilder, new ForegroundColorSpan(paramc.c()), paramInt1, paramInt2, 33);
    }
    if (paramc.j()) {
      f0.f.b(paramSpannableStringBuilder, new BackgroundColorSpan(paramc.a()), paramInt1, paramInt2, 33);
    }
    if (paramc.d() != null) {
      f0.f.b(paramSpannableStringBuilder, new TypefaceSpan(paramc.d()), paramInt1, paramInt2, 33);
    }
    int i = paramc.f();
    Object localObject;
    if (i != 1) {
      if (i != 2)
      {
        if (i != 3) {
          break label245;
        }
        localObject = new RelativeSizeSpan(paramc.e() / 100.0F);
      }
    }
    for (;;)
    {
      f0.f.b(paramSpannableStringBuilder, localObject, paramInt1, paramInt2, 33);
      break;
      localObject = new RelativeSizeSpan(paramc.e());
      continue;
      localObject = new AbsoluteSizeSpan((int)paramc.e(), true);
    }
    label245:
    if (paramc.b()) {
      paramSpannableStringBuilder.setSpan(new f0.d(), paramInt1, paramInt2, 33);
    }
  }
  
  public static int f(String paramString, int paramInt)
  {
    paramInt = paramString.indexOf('>', paramInt);
    if (paramInt == -1) {
      paramInt = paramString.length();
    } else {
      paramInt++;
    }
    return paramInt;
  }
  
  public static int g(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 != -1) {
      return paramInt1;
    }
    if (paramInt2 != -1) {
      return paramInt2;
    }
    if (paramInt3 != -1) {
      return paramInt3;
    }
    throw new IllegalArgumentException();
  }
  
  public static List h(List paramList, String paramString, c paramc)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
    {
      c localc = (c)paramList.get(i);
      int j = localc.h(paramString, a, d, c);
      if (j > 0) {
        localArrayList.add(new d(j, localc));
      }
    }
    Collections.sort(localArrayList);
    return localArrayList;
  }
  
  public static int i(List paramList, String paramString, c paramc)
  {
    paramList = h(paramList, paramString, paramc);
    for (int i = 0; i < paramList.size(); i++)
    {
      paramString = getp;
      if (paramString.g() != -1) {
        return paramString.g();
      }
    }
    return -1;
  }
  
  public static String j(String paramString)
  {
    paramString = paramString.trim();
    g0.a.a(paramString.isEmpty() ^ true);
    return M.c1(paramString, "[ \\.]")[0];
  }
  
  public static boolean k(String paramString)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 3511770: 
      if (paramString.equals("ruby")) {
        j = 7;
      }
      break;
    case 3314158: 
      if (paramString.equals("lang")) {
        j = 6;
      }
      break;
    case 3650: 
      if (paramString.equals("rt")) {
        j = 5;
      }
      break;
    case 118: 
      if (paramString.equals("v")) {
        j = 4;
      }
      break;
    case 117: 
      if (paramString.equals("u")) {
        j = 3;
      }
      break;
    case 105: 
      if (paramString.equals("i")) {
        j = 2;
      }
      break;
    case 99: 
      if (paramString.equals("c")) {
        j = 1;
      }
      break;
    case 98: 
      if (paramString.equals("b")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static f0.a l(CharSequence paramCharSequence)
  {
    e locale = new e();
    c = paramCharSequence;
    return locale.g().a();
  }
  
  public static d m(z paramz, List paramList)
  {
    String str = paramz.r();
    if (str == null) {
      return null;
    }
    Object localObject1 = a;
    Object localObject2 = ((Pattern)localObject1).matcher(str);
    if (((Matcher)localObject2).matches()) {
      return n(null, (Matcher)localObject2, paramz, paramList);
    }
    localObject2 = paramz.r();
    if (localObject2 == null) {
      return null;
    }
    localObject1 = ((Pattern)localObject1).matcher((CharSequence)localObject2);
    if (((Matcher)localObject1).matches()) {
      return n(str.trim(), (Matcher)localObject1, paramz, paramList);
    }
    return null;
  }
  
  public static d n(String paramString, Matcher paramMatcher, z paramz, List paramList)
  {
    e locale = new e();
    try
    {
      a = h.d((String)g0.a.e(paramMatcher.group(1)));
      b = h.d((String)g0.a.e(paramMatcher.group(2)));
      p((String)g0.a.e(paramMatcher.group(3)), locale);
      paramMatcher = new StringBuilder();
      for (;;)
      {
        String str = paramz.r();
        if (TextUtils.isEmpty(str)) {
          break;
        }
        if (paramMatcher.length() > 0) {
          paramMatcher.append("\n");
        }
        paramMatcher.append(str.trim());
      }
      c = q(paramString, paramMatcher.toString(), paramList);
      return locale.a();
    }
    catch (NumberFormatException paramString)
    {
      paramString = new StringBuilder();
      paramString.append("Skipping cue with bad header: ");
      paramString.append(paramMatcher.group());
      o.h("WebvttCueParser", paramString.toString());
    }
    return null;
  }
  
  public static a.b o(String paramString)
  {
    e locale = new e();
    p(paramString, locale);
    return locale.g();
  }
  
  public static void p(String paramString, e parame)
  {
    paramString = b.matcher(paramString);
    while (paramString.find())
    {
      String str1 = (String)g0.a.e(paramString.group(1));
      String str2 = (String)g0.a.e(paramString.group(2));
      try
      {
        if ("line".equals(str1))
        {
          s(str2, parame);
        }
        else if ("align".equals(str1))
        {
          d = v(str2);
        }
        else if ("position".equals(str1))
        {
          u(str2, parame);
        }
        else if ("size".equals(str1))
        {
          j = h.c(str2);
        }
        else if ("vertical".equals(str1))
        {
          k = w(str2);
        }
        else
        {
          StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
          localStringBuilder1.<init>();
          localStringBuilder1.append("Unknown cue setting ");
          localStringBuilder1.append(str1);
          localStringBuilder1.append(":");
          localStringBuilder1.append(str2);
          o.h("WebvttCueParser", localStringBuilder1.toString());
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("Skipping bad cue setting: ");
        localStringBuilder2.append(paramString.group());
        o.h("WebvttCueParser", localStringBuilder2.toString());
      }
    }
  }
  
  public static SpannedString q(String paramString1, String paramString2, List paramList)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    ArrayDeque localArrayDeque = new ArrayDeque();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramString2.length())
    {
      char c1 = paramString2.charAt(i);
      int j;
      int k;
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
          int n;
          Object localObject;
          String str;
          if (j >= paramString2.length())
          {
            i = j;
          }
          else
          {
            k = paramString2.charAt(j);
            int m = 1;
            if (k == 47) {
              k = 1;
            } else {
              k = 0;
            }
            n = f(paramString2, j);
            int i1 = n - 2;
            if (paramString2.charAt(i1) == '/') {
              j = 1;
            } else {
              j = 0;
            }
            if (k != 0) {
              m = 2;
            }
            if (j == 0) {
              i1 = n - 1;
            }
            localObject = paramString2.substring(i + m, i1);
            if (((String)localObject).trim().isEmpty())
            {
              i = n;
            }
            else
            {
              str = j((String)localObject);
              if (k(str)) {
                break label231;
              }
              i = n;
            }
          }
          for (;;)
          {
            break;
            label231:
            if (k != 0)
            {
              do
              {
                if (localArrayDeque.isEmpty())
                {
                  i = n;
                  break;
                }
                localObject = (c)localArrayDeque.pop();
                d(paramString1, (c)localObject, localArrayList, localSpannableStringBuilder, paramList);
                if (!localArrayDeque.isEmpty()) {
                  localArrayList.add(new b((c)localObject, localSpannableStringBuilder.length(), null));
                } else {
                  localArrayList.clear();
                }
              } while (!a.equals(str));
              i = n;
            }
            else
            {
              i = n;
              if (j == 0)
              {
                localArrayDeque.push(c.a((String)localObject, localSpannableStringBuilder.length()));
                i = n;
              }
            }
          }
        }
      }
      else
      {
        j = i + 1;
        i = paramString2.indexOf(';', j);
        k = paramString2.indexOf(' ', j);
        if (i == -1) {
          i = k;
        } else if (k != -1) {
          i = Math.min(i, k);
        }
        if (i != -1)
        {
          b(paramString2.substring(j, i), localSpannableStringBuilder);
          if (i == k) {
            localSpannableStringBuilder.append(" ");
          }
          i++;
        }
        else
        {
          localSpannableStringBuilder.append(c1);
          i = j;
        }
      }
    }
    while (!localArrayDeque.isEmpty()) {
      d(paramString1, (c)localArrayDeque.pop(), localArrayList, localSpannableStringBuilder, paramList);
    }
    d(paramString1, c.b(), Collections.emptyList(), localSpannableStringBuilder, paramList);
    return SpannedString.valueOf(localSpannableStringBuilder);
  }
  
  public static int r(String paramString)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 109757538: 
      if (paramString.equals("start")) {
        j = 3;
      }
      break;
    case 100571: 
      if (paramString.equals("end")) {
        j = 2;
      }
      break;
    case -1074341483: 
      if (paramString.equals("middle")) {
        j = 1;
      }
      break;
    case -1364013995: 
      if (paramString.equals("center")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Invalid anchor value: ");
      localStringBuilder.append(paramString);
      o.h("WebvttCueParser", localStringBuilder.toString());
      return Integer.MIN_VALUE;
    case 3: 
      return 0;
    case 2: 
      return 2;
    }
    return 1;
  }
  
  public static void s(String paramString, e parame)
  {
    int i = paramString.indexOf(',');
    String str = paramString;
    if (i != -1)
    {
      g = r(paramString.substring(i + 1));
      str = paramString.substring(0, i);
    }
    if (str.endsWith("%"))
    {
      e = h.c(str);
      f = 0;
    }
    else
    {
      e = Integer.parseInt(str);
      f = 1;
    }
  }
  
  public static int t(String paramString)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 109757538: 
      if (paramString.equals("start")) {
        j = 5;
      }
      break;
    case 100571: 
      if (paramString.equals("end")) {
        j = 4;
      }
      break;
    case -1074341483: 
      if (paramString.equals("middle")) {
        j = 3;
      }
      break;
    case -1276788989: 
      if (paramString.equals("line-right")) {
        j = 2;
      }
      break;
    case -1364013995: 
      if (paramString.equals("center")) {
        j = 1;
      }
      break;
    case -1842484672: 
      if (paramString.equals("line-left")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Invalid anchor value: ");
      localStringBuilder.append(paramString);
      o.h("WebvttCueParser", localStringBuilder.toString());
      return Integer.MIN_VALUE;
    case 2: 
    case 4: 
      return 2;
    case 1: 
    case 3: 
      return 1;
    }
    return 0;
  }
  
  public static void u(String paramString, e parame)
  {
    int i = paramString.indexOf(',');
    String str = paramString;
    if (i != -1)
    {
      i = t(paramString.substring(i + 1));
      str = paramString.substring(0, i);
    }
    h = h.c(str);
  }
  
  public static int v(String paramString)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 109757538: 
      if (paramString.equals("start")) {
        j = 5;
      }
      break;
    case 108511772: 
      if (paramString.equals("right")) {
        j = 4;
      }
      break;
    case 3317767: 
      if (paramString.equals("left")) {
        j = 3;
      }
      break;
    case 100571: 
      if (paramString.equals("end")) {
        j = 2;
      }
      break;
    case -1074341483: 
      if (paramString.equals("middle")) {
        j = 1;
      }
      break;
    case -1364013995: 
      if (paramString.equals("center")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Invalid alignment value: ");
      localStringBuilder.append(paramString);
      o.h("WebvttCueParser", localStringBuilder.toString());
      return 2;
    case 5: 
      return 1;
    case 4: 
      return 5;
    case 3: 
      return 4;
    case 2: 
      return 3;
    }
    return 2;
  }
  
  public static int w(String paramString)
  {
    paramString.hashCode();
    if (!paramString.equals("lr"))
    {
      if (!paramString.equals("rl"))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Invalid 'vertical' value: ");
        localStringBuilder.append(paramString);
        o.h("WebvttCueParser", localStringBuilder.toString());
        return Integer.MIN_VALUE;
      }
      return 1;
    }
    return 2;
  }
  
  public static class b
  {
    public static final Comparator c = new f();
    public final e.c a;
    public final int b;
    
    public b(e.c paramc, int paramInt)
    {
      a = paramc;
      b = paramInt;
    }
  }
  
  public static final class c
  {
    public final String a;
    public final int b;
    public final String c;
    public final Set d;
    
    public c(String paramString1, int paramInt, String paramString2, Set paramSet)
    {
      b = paramInt;
      a = paramString1;
      c = paramString2;
      d = paramSet;
    }
    
    public static c a(String paramString, int paramInt)
    {
      Object localObject = paramString.trim();
      boolean bool = ((String)localObject).isEmpty();
      int i = 1;
      g0.a.a(bool ^ true);
      int j = ((String)localObject).indexOf(" ");
      if (j == -1)
      {
        paramString = "";
      }
      else
      {
        paramString = ((String)localObject).substring(j).trim();
        localObject = ((String)localObject).substring(0, j);
      }
      String[] arrayOfString = M.b1((String)localObject, "\\.");
      String str = arrayOfString[0];
      localObject = new HashSet();
      while (i < arrayOfString.length)
      {
        ((Set)localObject).add(arrayOfString[i]);
        i++;
      }
      return new c(str, paramInt, paramString, (Set)localObject);
    }
    
    public static c b()
    {
      return new c("", 0, "", Collections.emptySet());
    }
  }
  
  public static final class d
    implements Comparable
  {
    public final int o;
    public final c p;
    
    public d(int paramInt, c paramc)
    {
      o = paramInt;
      p = paramc;
    }
    
    public int c(d paramd)
    {
      return Integer.compare(o, o);
    }
  }
  
  public static final class e
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
    
    public static float b(float paramFloat, int paramInt)
    {
      boolean bool = paramFloat < -3.4028235E38F;
      if ((bool) && (paramInt == 0) && ((paramFloat < 0.0F) || (paramFloat > 1.0F))) {
        return 1.0F;
      }
      if (bool) {
        return paramFloat;
      }
      if (paramInt == 0) {
        return 1.0F;
      }
      return -3.4028235E38F;
    }
    
    public static Layout.Alignment c(int paramInt)
    {
      if (paramInt != 1) {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 4) {
              break label65;
            }
            if (paramInt != 5)
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("Unknown textAlignment: ");
              localStringBuilder.append(paramInt);
              o.h("WebvttCueParser", localStringBuilder.toString());
              return null;
            }
          }
          return Layout.Alignment.ALIGN_OPPOSITE;
        }
        else
        {
          return Layout.Alignment.ALIGN_CENTER;
        }
      }
      label65:
      return Layout.Alignment.ALIGN_NORMAL;
    }
    
    public static float d(int paramInt, float paramFloat)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt == 2) {
            return paramFloat;
          }
          throw new IllegalStateException(String.valueOf(paramInt));
        }
        if (paramFloat <= 0.5F) {
          return paramFloat * 2.0F;
        }
        return (1.0F - paramFloat) * 2.0F;
      }
      return 1.0F - paramFloat;
    }
    
    public static float e(int paramInt)
    {
      if (paramInt != 4)
      {
        if (paramInt != 5) {
          return 0.5F;
        }
        return 1.0F;
      }
      return 0.0F;
    }
    
    public static int f(int paramInt)
    {
      if (paramInt != 1)
      {
        if (paramInt != 3)
        {
          if (paramInt == 4) {
            break label24;
          }
          if (paramInt != 5) {
            return 1;
          }
        }
        return 2;
      }
      label24:
      return 0;
    }
    
    public d a()
    {
      return new d(g().a(), a, b);
    }
    
    public a.b g()
    {
      float f1 = h;
      if (f1 == -3.4028235E38F) {
        f1 = e(d);
      }
      int m = i;
      if (m == Integer.MIN_VALUE) {
        m = f(d);
      }
      a.b localb = new a.b().p(c(d)).h(b(e, f), f).i(g).k(f1).l(m).n(Math.min(j, d(m, f1))).r(k);
      CharSequence localCharSequence = c;
      if (localCharSequence != null) {
        localb.o(localCharSequence);
      }
      return localb;
    }
  }
}

/* Location:
 * Qualified Name:     k1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */