package F1;

import O1.P;
import O1.r;
import O1.v;
import T1.a;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.B;

public final class b
{
  public static final b a = new b();
  public static boolean b;
  public static JSONArray c;
  public static String[] d = { "event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB" };
  
  /* Error */
  public static final void a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 56	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: getstatic 19	F1/b:a	LF1/b;
    //   12: invokevirtual 59	F1/b:g	()V
    //   15: getstatic 61	F1/b:c	Lorg/json/JSONArray;
    //   18: ifnull +14 -> 32
    //   21: iconst_1
    //   22: putstatic 63	F1/b:b	Z
    //   25: goto +7 -> 32
    //   28: astore_0
    //   29: goto +4 -> 33
    //   32: return
    //   33: aload_0
    //   34: ldc 2
    //   36: invokestatic 66	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   39: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   28	6	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   9	25	28	finally
  }
  
  public static final void b(Bundle paramBundle, String paramString)
  {
    if (a.d(b.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramBundle, "params");
      Intrinsics.checkNotNullParameter(paramString, "event");
      paramBundle.putString("event", paramString);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      P localP = P.a;
      paramString = localP.I();
      String str1 = "";
      if (paramString == null) {}
      do
      {
        paramString = "";
        break;
        str2 = paramString.getLanguage();
        paramString = str2;
      } while (str2 == null);
      localStringBuilder.append(paramString);
      localStringBuilder.append('_');
      paramString = localP.I();
      if (paramString == null) {}
      do
      {
        paramString = "";
        break;
        str2 = paramString.getCountry();
        paramString = str2;
      } while (str2 == null);
      localStringBuilder.append(paramString);
      paramBundle.putString("_locale", localStringBuilder.toString());
      String str2 = localP.P();
      paramString = str2;
      if (str2 == null) {
        paramString = "";
      }
      paramBundle.putString("_appVersion", paramString);
      paramBundle.putString("_deviceOS", "ANDROID");
      paramBundle.putString("_platform", "mobile");
      str2 = Build.MODEL;
      paramString = str2;
      if (str2 == null) {
        paramString = "";
      }
      paramBundle.putString("_deviceModel", paramString);
      paramBundle.putString("_nativeAppID", B.m());
      paramString = localP.P();
      if (paramString == null) {
        paramString = str1;
      }
      paramBundle.putString("_nativeAppShortVersion", paramString);
      paramBundle.putString("_timezone", localP.D());
      paramBundle.putString("_carrier", localP.y());
      paramBundle.putString("_deviceOSTypeName", "ANDROID");
      paramBundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
      paramBundle.putLong("_remainingDiskGB", localP.w());
      return;
    }
    finally
    {
      a.b(paramBundle, b.class);
    }
  }
  
  public static final String c(JSONObject paramJSONObject)
  {
    if (a.d(b.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramJSONObject, "logic");
      paramJSONObject = paramJSONObject.keys();
      if (paramJSONObject.hasNext())
      {
        paramJSONObject = (String)paramJSONObject.next();
        return paramJSONObject;
      }
    }
    finally
    {
      break label48;
      return null;
      label48:
      a.b(paramJSONObject, b.class);
    }
    return null;
  }
  
  public static final String d(Bundle paramBundle)
  {
    if (a.d(b.class)) {
      return null;
    }
    Object localObject1;
    for (;;)
    {
      int i;
      int k;
      try
      {
        localObject1 = c;
        if (localObject1 == null) {
          break label228;
        }
        if (localObject1 == null) {
          localObject1 = null;
        } else {
          localObject1 = Integer.valueOf(((JSONArray)localObject1).length());
        }
        if ((localObject1 != null) && (((Integer)localObject1).intValue() == 0)) {
          break label228;
        }
        JSONArray localJSONArray = c;
        if (localJSONArray == null) {
          break label216;
        }
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        i = localJSONArray.length();
        if (i <= 0) {
          break;
        }
        j = 0;
        k = j + 1;
        String str = localJSONArray.optString(j);
        if (str != null)
        {
          Object localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>(str);
          long l = ((JSONObject)localObject2).optLong("id");
          if (l != 0L)
          {
            localObject2 = ((JSONObject)localObject2).optString("rule");
            if ((localObject2 != null) && (f((String)localObject2, paramBundle))) {
              ((List)localObject1).add(Long.valueOf(l));
            }
          }
        }
      }
      finally
      {
        break label231;
      }
      if (k >= i) {
        break;
      }
      int j = k;
    }
    paramBundle = new org/json/JSONArray;
    paramBundle.<init>((Collection)localObject1);
    paramBundle = paramBundle.toString();
    Intrinsics.checkNotNullExpressionValue(paramBundle, "JSONArray(res).toString()");
    return paramBundle;
    label216:
    paramBundle = new java/lang/NullPointerException;
    paramBundle.<init>("null cannot be cast to non-null type org.json.JSONArray");
    throw paramBundle;
    label228:
    return "[]";
    label231:
    a.b(paramBundle, b.class);
    return null;
  }
  
  public static final ArrayList e(JSONArray paramJSONArray)
  {
    if (a.d(b.class)) {
      return null;
    }
    if (paramJSONArray == null) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int i = paramJSONArray.length();
      if (i > 0)
      {
        int k;
        for (int j = 0;; j = k)
        {
          k = j + 1;
          localArrayList.add(paramJSONArray.get(j).toString());
          if (k >= i) {
            break;
          }
        }
      }
      label74:
      return null;
    }
    finally
    {
      break label74;
      return localArrayList;
      a.b(paramJSONArray, b.class);
    }
  }
  
  public static final boolean f(String paramString, Bundle paramBundle)
  {
    if (a.d(b.class)) {
      return false;
    }
    if ((paramString != null) && (paramBundle != null)) {
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        paramString = c((JSONObject)localObject);
        if (paramString == null) {
          return false;
        }
        localObject = ((JSONObject)localObject).get(paramString);
        i = paramString.hashCode();
        if (i != 3555) {
          if (i != 96727)
          {
            if ((i != 109267) || (!paramString.equals("not"))) {
              break label189;
            }
            return f(localObject.toString(), paramBundle) ^ true;
          }
        }
      }
      finally
      {
        Object localObject;
        int i;
        break label275;
        int k;
        if (paramString.equals("and"))
        {
          paramString = (JSONArray)localObject;
          if (paramString == null) {
            return false;
          }
          j = paramString.length();
          if (j > 0) {
            for (i = 0;; i = k)
            {
              k = i + 1;
              if (!f(paramString.get(i).toString(), paramBundle)) {
                return false;
              }
              if (k >= j) {
                break;
              }
            }
          }
          return true;
          if (paramString.equals("or")) {}
        }
        else
        {
          label189:
          localObject = (JSONObject)localObject;
          if (localObject == null) {
            return false;
          }
          return j(paramString, (JSONObject)localObject, paramBundle);
        }
        paramString = (JSONArray)localObject;
        if (paramString == null) {
          return false;
        }
        int j = paramString.length();
        if (j > 0) {
          for (i = 0;; i = k)
          {
            k = i + 1;
            boolean bool = f(paramString.get(i).toString(), paramBundle);
            if (bool) {
              return true;
            }
            if (k >= j) {
              break;
            }
          }
        }
        return false;
        label275:
        a.b(paramString, b.class);
      }
    }
    return false;
  }
  
  public static final void h(Bundle paramBundle, String paramString)
  {
    if (a.d(b.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "event");
      boolean bool = b;
      if ((bool) && (paramBundle != null)) {}
      return;
    }
    finally
    {
      try
      {
        b(paramBundle, paramString);
        paramBundle.putString("_audiencePropertyIds", d(paramBundle));
        paramBundle.putString("cs_maca", "1");
        i(paramBundle);
      }
      catch (Exception paramBundle)
      {
        for (;;) {}
      }
      paramBundle = finally;
    }
    a.b(paramBundle, b.class);
  }
  
  public static final void i(Bundle paramBundle)
  {
    if (a.d(b.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramBundle, "params");
      String[] arrayOfString = d;
      int i = arrayOfString.length;
      int j = 0;
      while (j < i)
      {
        String str = arrayOfString[j];
        j++;
        paramBundle.remove(str);
      }
      label51:
      return;
    }
    finally
    {
      break label51;
      return;
      a.b(paramBundle, b.class);
    }
  }
  
  public static final boolean j(String paramString, JSONObject paramJSONObject, Bundle paramBundle)
  {
    boolean bool1 = a.d(b.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "variable");
      Intrinsics.checkNotNullParameter(paramJSONObject, "values");
      str1 = c(paramJSONObject);
      if (str1 == null) {
        return false;
      }
      str2 = paramJSONObject.get(str1).toString();
      localArrayList = e(paramJSONObject.optJSONArray(str1));
      bool1 = Intrinsics.a(str1, "exists");
      paramJSONObject = null;
      if (bool1)
      {
        if (paramBundle == null) {
          paramString = paramJSONObject;
        } else {
          paramString = Boolean.valueOf(paramBundle.containsKey(paramString));
        }
        bool1 = Intrinsics.a(paramString, Boolean.valueOf(Boolean.parseBoolean(str2)));
        return bool1;
      }
    }
    finally
    {
      String str1;
      String str2;
      ArrayList localArrayList;
      break label1971;
      if (paramBundle == null)
      {
        paramJSONObject = null;
      }
      else
      {
        paramJSONObject = paramString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(paramJSONObject, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        paramJSONObject = paramBundle.get(paramJSONObject);
      }
      Object localObject = paramJSONObject;
      if (paramJSONObject == null)
      {
        if (paramBundle == null) {
          paramString = null;
        } else {
          paramString = paramBundle.get(paramString);
        }
        localObject = paramString;
        if (paramString == null) {
          return false;
        }
      }
      int i = str1.hashCode();
      switch (i)
      {
      default: 
        bool1 = bool2;
        break;
      case 1961112862: 
        if (!str1.equals("i_starts_with"))
        {
          bool1 = bool2;
        }
        else
        {
          paramString = localObject.toString();
          if (paramString != null)
          {
            paramJSONObject = Locale.ROOT;
            paramString = paramString.toLowerCase(paramJSONObject);
            Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
            if (str2 != null)
            {
              paramJSONObject = str2.toLowerCase(paramJSONObject);
              Intrinsics.checkNotNullExpressionValue(paramJSONObject, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
              bool1 = i.s(paramString, paramJSONObject, false, 2, null);
            }
            else
            {
              paramString = new java/lang/NullPointerException;
              paramString.<init>("null cannot be cast to non-null type java.lang.String");
              throw paramString;
            }
          }
          else
          {
            paramString = new java/lang/NullPointerException;
            paramString.<init>("null cannot be cast to non-null type java.lang.String");
            throw paramString;
          }
        }
        break;
      case 1918401035: 
        if (!str1.equals("not_contains"))
        {
          bool1 = bool2;
        }
        else
        {
          bool1 = bool2;
          if (i.v(localObject.toString(), str2, false, 2, null)) {
            break;
          }
        }
        break;
      case 1091487233: 
      case 363990325: 
      case 127966857: 
      case 127966736: 
      case 108954: 
      case 107485: 
      case 102680: 
      case 3511: 
      case 3464: 
      case 3449: 
      case 3365: 
      case 3309: 
      case 3294: 
      case 3244: 
      case 1983: 
      case 1952: 
      case 1921: 
      case 1084: 
      case 62: 
      case 61: 
      case 60: 
      case -92753547: 
      case -159812115: 
      case -327990090: 
      case -567445985: 
      case -665609109: 
      case -966353971: 
      case -969266188: 
      case -1039699439: 
      case -1179774633: 
      case -1729128927: 
        label1085:
        label1125:
        label1161:
        label1201:
        label1232:
        label1382:
        label1395:
        label1425:
        label1549:
        label1652:
        label1847:
        do
        {
          for (;;)
          {
            bool1 = true;
            break label1943;
            if (!str1.equals("i_is_not_any"))
            {
              bool1 = bool2;
              break label1943;
              if (!str1.equals("i_contains"))
              {
                bool1 = bool2;
                break label1943;
              }
              paramJSONObject = localObject.toString();
              if (paramJSONObject != null)
              {
                paramString = Locale.ROOT;
                paramJSONObject = paramJSONObject.toLowerCase(paramString);
                Intrinsics.checkNotNullExpressionValue(paramJSONObject, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                if (str2 != null)
                {
                  paramString = str2.toLowerCase(paramString);
                  Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                  bool1 = i.v(paramJSONObject, paramString, false, 2, null);
                  break label1943;
                }
                paramString = new java/lang/NullPointerException;
                paramString.<init>("null cannot be cast to non-null type java.lang.String");
                throw paramString;
              }
              paramString = new java/lang/NullPointerException;
              paramString.<init>("null cannot be cast to non-null type java.lang.String");
              throw paramString;
              if (str1.equals("i_str_in")) {
                break label1425;
              }
              bool1 = bool2;
              break label1943;
              if (!str1.equals("i_str_eq"))
              {
                bool1 = bool2;
                break label1943;
              }
              paramJSONObject = localObject.toString();
              if (paramJSONObject != null)
              {
                paramString = Locale.ROOT;
                paramJSONObject = paramJSONObject.toLowerCase(paramString);
                Intrinsics.checkNotNullExpressionValue(paramJSONObject, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                if (str2 != null)
                {
                  paramString = str2.toLowerCase(paramString);
                  Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                  bool1 = Intrinsics.a(paramJSONObject, paramString);
                  break label1943;
                }
                paramString = new java/lang/NullPointerException;
                paramString.<init>("null cannot be cast to non-null type java.lang.String");
                throw paramString;
              }
              paramString = new java/lang/NullPointerException;
              paramString.<init>("null cannot be cast to non-null type java.lang.String");
              throw paramString;
              if (!str1.equals("neq"))
              {
                bool1 = bool2;
                break label1943;
                if (!str1.equals("lte"))
                {
                  bool1 = bool2;
                  break label1943;
                  if (!str1.equals("gte"))
                  {
                    bool1 = bool2;
                    break label1943;
                    if (str1.equals("ne")) {
                      break label1125;
                    }
                    bool1 = bool2;
                    break label1943;
                    if (str1.equals("lt")) {
                      break label1232;
                    }
                    bool1 = bool2;
                    break label1943;
                    if (str1.equals("le")) {
                      break label1085;
                    }
                    bool1 = bool2;
                    break label1943;
                    if (str1.equals("in")) {
                      break label1847;
                    }
                    bool1 = bool2;
                    break label1943;
                    if (str1.equals("gt")) {
                      break label1161;
                    }
                    bool1 = bool2;
                    break label1943;
                    if (!str1.equals("ge"))
                    {
                      bool1 = bool2;
                      break label1943;
                      if (str1.equals("eq")) {
                        break label1201;
                      }
                      bool1 = bool2;
                      break label1943;
                      if (!str1.equals(">="))
                      {
                        bool1 = bool2;
                        break label1943;
                      }
                    }
                  }
                  bool1 = bool2;
                  if (Double.parseDouble(localObject.toString()) < Double.parseDouble(str2)) {
                    break label1943;
                  }
                  continue;
                  if (str1.equals("==")) {
                    break label1201;
                  }
                  bool1 = bool2;
                  break label1943;
                  if (!str1.equals("<="))
                  {
                    bool1 = bool2;
                    break label1943;
                  }
                }
                bool1 = bool2;
                if (Double.parseDouble(localObject.toString()) > Double.parseDouble(str2)) {
                  break label1943;
                }
                continue;
                if (!str1.equals("!="))
                {
                  bool1 = bool2;
                  break label1943;
                }
              }
              bool1 = bool2;
              if (Intrinsics.a(localObject.toString(), str2)) {
                break label1943;
              }
              continue;
              if (!str1.equals(">"))
              {
                bool1 = bool2;
                break label1943;
              }
              bool1 = bool2;
              if (Double.parseDouble(localObject.toString()) <= Double.parseDouble(str2)) {
                break label1943;
              }
              continue;
              if (!str1.equals("="))
              {
                bool1 = bool2;
                break label1943;
              }
              bool1 = Intrinsics.a(localObject.toString(), str2);
              break label1943;
              if (!str1.equals("<"))
              {
                bool1 = bool2;
                break label1943;
              }
              bool1 = bool2;
              if (Double.parseDouble(localObject.toString()) >= Double.parseDouble(str2)) {
                break label1943;
              }
              continue;
              if (!str1.equals("i_str_not_in"))
              {
                bool1 = bool2;
                break label1943;
              }
            }
            if (localArrayList == null) {
              return false;
            }
            if (!localArrayList.isEmpty())
            {
              paramString = localArrayList.iterator();
              do
              {
                if (!paramString.hasNext()) {
                  break;
                }
                paramJSONObject = (String)paramString.next();
                if (paramJSONObject == null) {
                  break label1395;
                }
                paramBundle = Locale.ROOT;
                paramJSONObject = paramJSONObject.toLowerCase(paramBundle);
                Intrinsics.checkNotNullExpressionValue(paramJSONObject, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                str2 = localObject.toString();
                if (str2 == null) {
                  break label1382;
                }
                paramBundle = str2.toLowerCase(paramBundle);
                Intrinsics.checkNotNullExpressionValue(paramBundle, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
              } while ((Intrinsics.a(paramJSONObject, paramBundle) ^ true));
              bool1 = bool2;
              break label1943;
              paramString = new java/lang/NullPointerException;
              paramString.<init>("null cannot be cast to non-null type java.lang.String");
              throw paramString;
              paramString = new java/lang/NullPointerException;
              paramString.<init>("null cannot be cast to non-null type java.lang.String");
              throw paramString;
              if (!str1.equals("i_is_any"))
              {
                bool1 = bool2;
                break label1943;
              }
              if (localArrayList == null) {
                return false;
              }
              if (localArrayList.isEmpty())
              {
                bool1 = bool2;
                break label1943;
              }
              paramString = localArrayList.iterator();
              do
              {
                bool1 = bool2;
                if (!paramString.hasNext()) {
                  break label1943;
                }
                paramJSONObject = (String)paramString.next();
                if (paramJSONObject == null) {
                  break label1549;
                }
                paramBundle = Locale.ROOT;
                paramJSONObject = paramJSONObject.toLowerCase(paramBundle);
                Intrinsics.checkNotNullExpressionValue(paramJSONObject, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                str2 = localObject.toString();
                if (str2 == null) {
                  break;
                }
                paramBundle = str2.toLowerCase(paramBundle);
                Intrinsics.checkNotNullExpressionValue(paramBundle, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
              } while (!Intrinsics.a(paramJSONObject, paramBundle));
              continue;
              paramString = new java/lang/NullPointerException;
              paramString.<init>("null cannot be cast to non-null type java.lang.String");
              throw paramString;
              paramString = new java/lang/NullPointerException;
              paramString.<init>("null cannot be cast to non-null type java.lang.String");
              throw paramString;
              if (!str1.equals("i_str_neq"))
              {
                bool1 = bool2;
                break label1943;
              }
              paramJSONObject = localObject.toString();
              if (paramJSONObject == null) {
                break label1652;
              }
              paramString = Locale.ROOT;
              paramJSONObject = paramJSONObject.toLowerCase(paramString);
              Intrinsics.checkNotNullExpressionValue(paramJSONObject, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
              if (str2 == null) {
                break;
              }
              paramString = str2.toLowerCase(paramString);
              Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
              bool1 = bool2;
              if (Intrinsics.a(paramJSONObject, paramString)) {
                break label1943;
              }
            }
          }
          paramString = new java/lang/NullPointerException;
          paramString.<init>("null cannot be cast to non-null type java.lang.String");
          throw paramString;
          paramString = new java/lang/NullPointerException;
          paramString.<init>("null cannot be cast to non-null type java.lang.String");
          throw paramString;
          if (!str1.equals("contains"))
          {
            bool1 = bool2;
            break;
          }
          bool1 = i.v(localObject.toString(), str2, false, 2, null);
          break;
          if (!str1.equals("is_not_any"))
          {
            bool1 = bool2;
            break;
            if (!str1.equals("regex_match"))
            {
              bool1 = bool2;
              break;
            }
            paramString = new kotlin/text/Regex;
            paramString.<init>(str2);
            bool1 = paramString.b(localObject.toString());
            break;
            if (!str1.equals("starts_with"))
            {
              bool1 = bool2;
              break;
            }
            bool1 = i.s(localObject.toString(), str2, false, 2, null);
            break;
            if (!str1.equals("not_in"))
            {
              bool1 = bool2;
              break;
            }
          }
          if (localArrayList == null) {
            return false;
          }
          for (paramString = localObject.toString();; paramString = localObject.toString())
          {
            bool1 = localArrayList.contains(paramString);
            break;
            if (!str1.equals("is_any"))
            {
              bool1 = bool2;
              break;
            }
            if (localArrayList == null) {
              return false;
            }
          }
          if (!str1.equals("i_not_contains"))
          {
            bool1 = bool2;
            break;
          }
          paramJSONObject = localObject.toString();
          if (paramJSONObject == null) {
            break label1958;
          }
          paramString = Locale.ROOT;
          paramJSONObject = paramJSONObject.toLowerCase(paramString);
          Intrinsics.checkNotNullExpressionValue(paramJSONObject, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
          if (str2 == null) {
            break label1945;
          }
          paramString = str2.toLowerCase(paramString);
          Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
          bool1 = bool2;
        } while (!i.v(paramJSONObject, paramString, false, 2, null));
      }
      label1943:
      return bool1;
      label1945:
      paramString = new java/lang/NullPointerException;
      paramString.<init>("null cannot be cast to non-null type java.lang.String");
      throw paramString;
      label1958:
      paramString = new java/lang/NullPointerException;
      paramString.<init>("null cannot be cast to non-null type java.lang.String");
      throw paramString;
      label1971:
      a.b(paramString, b.class);
    }
    return false;
  }
  
  public final void g()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Object localObject = v.a;
      localObject = v.q(B.m(), false);
      if (localObject == null) {
        return;
      }
      c = ((r)localObject).f();
      return;
    }
    finally
    {
      a.b(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     F1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */