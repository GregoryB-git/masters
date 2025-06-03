package D5;

import E5.g;
import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.b;
import w5.a;

public class o
{
  public final k a;
  public h b;
  public final k.c c;
  
  public o(a parama)
  {
    a locala = new a();
    c = locala;
    parama = new k(parama, "flutter/platform", g.a);
    a = parama;
    parama.e(locala);
  }
  
  public final c g(JSONObject paramJSONObject)
  {
    int i = paramJSONObject.getInt("primaryColor");
    int j = i;
    if (i != 0) {
      j = i | 0xFF000000;
    }
    return new c(j, paramJSONObject.getString("label"));
  }
  
  public final int h(JSONArray paramJSONArray)
  {
    int i = 0;
    int j = i;
    int m;
    for (int k = j; i < paramJSONArray.length(); k = m)
    {
      f localf = f.e(paramJSONArray.getString(i));
      m = b.a[localf.ordinal()];
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m == 4) {
              j |= 0x8;
            }
          }
          else {
            j |= 0x2;
          }
        }
        else {
          j |= 0x4;
        }
      }
      else {
        j |= 0x1;
      }
      m = k;
      if (k == 0) {
        m = j;
      }
      i++;
    }
    if (j != 0)
    {
      i = 9;
      switch (j)
      {
      default: 
        break;
      case 15: 
        return 13;
      case 11: 
        return 2;
      case 10: 
        return 11;
      case 8: 
        return 8;
      case 5: 
        i = 12;
      case 4: 
        return i;
      case 3: 
      case 6: 
      case 7: 
      case 9: 
      case 12: 
      case 13: 
      case 14: 
        if (k != 2)
        {
          if (k != 4)
          {
            if (k != 8) {
              return 1;
            }
            return 8;
          }
          return 9;
        }
        break;
      }
      return 0;
    }
    return -1;
  }
  
  public final j i(JSONObject paramJSONObject)
  {
    boolean bool = paramJSONObject.isNull("statusBarColor");
    Boolean localBoolean1 = null;
    Integer localInteger1;
    if (!bool) {
      localInteger1 = Integer.valueOf(paramJSONObject.getInt("statusBarColor"));
    } else {
      localInteger1 = null;
    }
    d locald1;
    if (!paramJSONObject.isNull("statusBarIconBrightness")) {
      locald1 = d.e(paramJSONObject.getString("statusBarIconBrightness"));
    } else {
      locald1 = null;
    }
    Boolean localBoolean2;
    if (!paramJSONObject.isNull("systemStatusBarContrastEnforced")) {
      localBoolean2 = Boolean.valueOf(paramJSONObject.getBoolean("systemStatusBarContrastEnforced"));
    } else {
      localBoolean2 = null;
    }
    Integer localInteger2;
    if (!paramJSONObject.isNull("systemNavigationBarColor")) {
      localInteger2 = Integer.valueOf(paramJSONObject.getInt("systemNavigationBarColor"));
    } else {
      localInteger2 = null;
    }
    d locald2;
    if (!paramJSONObject.isNull("systemNavigationBarIconBrightness")) {
      locald2 = d.e(paramJSONObject.getString("systemNavigationBarIconBrightness"));
    } else {
      locald2 = null;
    }
    Integer localInteger3;
    if (!paramJSONObject.isNull("systemNavigationBarDividerColor")) {
      localInteger3 = Integer.valueOf(paramJSONObject.getInt("systemNavigationBarDividerColor"));
    } else {
      localInteger3 = null;
    }
    if (!paramJSONObject.isNull("systemNavigationBarContrastEnforced")) {
      localBoolean1 = Boolean.valueOf(paramJSONObject.getBoolean("systemNavigationBarContrastEnforced"));
    }
    return new j(localInteger1, locald1, localBoolean2, localInteger2, locald2, localInteger3, localBoolean1);
  }
  
  public final k j(String paramString)
  {
    paramString = k.e(paramString);
    int i = b.c[paramString.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            return k.s;
          }
          return k.s;
        }
        return k.r;
      }
      return k.q;
    }
    return k.p;
  }
  
  public final List k(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramJSONArray.length(); i++)
    {
      l locall = l.e(paramJSONArray.getString(i));
      int j = b.b[locall.ordinal()];
      if (j != 1)
      {
        if (j != 2) {}
      }
      else {
        for (locall = l.q;; locall = l.p)
        {
          localArrayList.add(locall);
          break;
        }
      }
    }
    return localArrayList;
  }
  
  public void l(h paramh)
  {
    b = paramh;
  }
  
  public void m(boolean paramBoolean)
  {
    b.f("PlatformChannel", "Sending 'systemUIChange' message.");
    a.c("SystemChrome.systemUIChange", Arrays.asList(new Boolean[] { Boolean.valueOf(paramBoolean) }));
  }
  
  public class a
    implements k.c
  {
    public a() {}
    
    public void onMethodCall(j paramj, k.d paramd)
    {
      if (o.a(o.this) == null) {
        return;
      }
      String str = a;
      paramj = b;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Received '");
      localStringBuilder.append(str);
      localStringBuilder.append("' message.");
      b.f("PlatformChannel", localStringBuilder.toString());
      try
      {
        switch (str.hashCode())
        {
        }
      }
      catch (JSONException localJSONException)
      {
        break label1114;
      }
      boolean bool;
      if (str.equals("SystemChrome.setPreferredOrientations"))
      {
        i = 2;
        break label444;
        if (localJSONException.equals("SystemChrome.setEnabledSystemUIOverlays"))
        {
          i = 4;
          break label444;
          if (localJSONException.equals("Clipboard.getData"))
          {
            i = 11;
            break label444;
            if (localJSONException.equals("SystemChrome.setSystemUIOverlayStyle"))
            {
              i = 8;
              break label444;
              if (localJSONException.equals("SystemChrome.setEnabledSystemUIMode"))
              {
                i = 5;
                break label444;
                if (localJSONException.equals("Clipboard.hasStrings"))
                {
                  i = 13;
                  break label444;
                  if (localJSONException.equals("SystemChrome.restoreSystemUIOverlays"))
                  {
                    i = 7;
                    break label444;
                    if (localJSONException.equals("SystemSound.play"))
                    {
                      i = 0;
                      break label444;
                      if (localJSONException.equals("HapticFeedback.vibrate"))
                      {
                        i = 1;
                        break label444;
                        if (localJSONException.equals("SystemChrome.setApplicationSwitcherDescription"))
                        {
                          i = 3;
                          break label444;
                          if (localJSONException.equals("SystemChrome.setSystemUIChangeListener"))
                          {
                            i = 6;
                            break label444;
                            if (localJSONException.equals("Clipboard.setData"))
                            {
                              i = 12;
                              break label444;
                              if (localJSONException.equals("SystemNavigator.pop"))
                              {
                                i = 10;
                                break label444;
                                if (localJSONException.equals("Share.invoke"))
                                {
                                  i = 14;
                                  break label444;
                                  bool = localJSONException.equals("SystemNavigator.setFrameworkHandlesBack");
                                  if (bool)
                                  {
                                    i = 9;
                                    break label444;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      int i = -1;
      label444:
      Object localObject;
      switch (i)
      {
      default: 
        paramd.c();
        break;
      case 14: 
        paramj = (String)paramj;
        o.a(o.this).q(paramj);
      case 13: 
      case 12: 
      case 11: 
      case 10: 
      case 9: 
        for (;;)
        {
          paramd.a(null);
          break;
          bool = o.a(o.this).r();
          paramj = new org/json/JSONObject;
          paramj.<init>();
          paramj.put("value", bool);
          for (;;)
          {
            paramd.a(paramj);
            return;
            paramj = ((JSONObject)paramj).getString("text");
            o.a(o.this).l(paramj);
            break;
            localObject = (String)paramj;
            if (localObject != null) {
              try
              {
                paramj = o.e.e((String)localObject);
              }
              catch (NoSuchFieldException paramj)
              {
                paramj = new java/lang/StringBuilder;
                paramj.<init>();
                paramj.append("No such clipboard content format: ");
                paramj.append((String)localObject);
                paramd.b("error", paramj.toString(), null);
              }
            } else {
              paramj = null;
            }
            localObject = o.a(o.this).o(paramj);
            if (localObject == null) {
              break;
            }
            paramj = new org/json/JSONObject;
            paramj.<init>();
            paramj.put("text", localObject);
          }
          o.a(o.this).a();
          continue;
          bool = ((Boolean)paramj).booleanValue();
          o.a(o.this).f(bool);
        }
      case 8: 
        try
        {
          paramj = o.f(o.this, (JSONObject)paramj);
          o.a(o.this).s(paramj);
          paramd.a(null);
        }
        catch (NoSuchFieldException paramj) {}catch (JSONException paramj) {}
        paramj = paramj.getMessage();
      case 7: 
      case 6: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
      case 1: 
      case 0: 
        for (;;)
        {
          paramd.b("error", paramj, null);
          return;
          o.a(o.this).k();
          break;
          o.a(o.this).j();
          break;
          try
          {
            paramj = o.e(o.this, (String)paramj);
            o.a(o.this).g(paramj);
            paramd.a(null);
          }
          catch (NoSuchFieldException paramj) {}catch (JSONException paramj) {}
          paramj = paramj.getMessage();
          continue;
          try
          {
            paramj = o.d(o.this, (JSONArray)paramj);
            o.a(o.this).h(paramj);
            paramd.a(null);
          }
          catch (NoSuchFieldException paramj) {}catch (JSONException paramj) {}
          paramj = paramj.getMessage();
          continue;
          try
          {
            paramj = o.c(o.this, (JSONObject)paramj);
            o.a(o.this).m(paramj);
            paramd.a(null);
          }
          catch (JSONException paramj)
          {
            paramj = paramj.getMessage();
          }
          continue;
          try
          {
            i = o.b(o.this, (JSONArray)paramj);
            o.a(o.this).p(i);
            paramd.a(null);
          }
          catch (NoSuchFieldException paramj) {}catch (JSONException paramj) {}
          paramj = paramj.getMessage();
          continue;
          try
          {
            paramj = o.g.e((String)paramj);
            o.a(o.this).n(paramj);
            paramd.a(null);
          }
          catch (NoSuchFieldException paramj)
          {
            paramj = paramj.getMessage();
          }
          continue;
          try
          {
            paramj = o.i.e((String)paramj);
            o.a(o.this).i(paramj);
            paramd.a(null);
          }
          catch (NoSuchFieldException paramj)
          {
            paramj = paramj.getMessage();
          }
        }
        label1114:
        paramj = new StringBuilder();
        paramj.append("JSON error: ");
        paramj.append(((Throwable)localObject).getMessage());
        paramd.b("error", paramj.toString(), null);
      }
    }
  }
  
  public static class c
  {
    public final int a;
    public final String b;
    
    public c(int paramInt, String paramString)
    {
      a = paramInt;
      b = paramString;
    }
  }
  
  public static enum d
  {
    public String o;
    
    public d(String paramString1)
    {
      o = paramString1;
    }
    
    public static d e(String paramString)
    {
      for (d locald : ) {
        if (o.equals(paramString)) {
          return locald;
        }
      }
      ??? = new StringBuilder();
      ((StringBuilder)???).append("No such Brightness: ");
      ((StringBuilder)???).append(paramString);
      throw new NoSuchFieldException(((StringBuilder)???).toString());
    }
  }
  
  public static enum e
  {
    public String o;
    
    public e(String paramString1)
    {
      o = paramString1;
    }
    
    public static e e(String paramString)
    {
      for (localObject : ) {
        if (o.equals(paramString)) {
          return (e)localObject;
        }
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("No such ClipboardContentFormat: ");
      ((StringBuilder)localObject).append(paramString);
      throw new NoSuchFieldException(((StringBuilder)localObject).toString());
    }
  }
  
  public static enum f
  {
    public String o;
    
    public f(String paramString1)
    {
      o = paramString1;
    }
    
    public static f e(String paramString)
    {
      for (f localf : ) {
        if (o.equals(paramString)) {
          return localf;
        }
      }
      ??? = new StringBuilder();
      ((StringBuilder)???).append("No such DeviceOrientation: ");
      ((StringBuilder)???).append(paramString);
      throw new NoSuchFieldException(((StringBuilder)???).toString());
    }
  }
  
  public static enum g
  {
    public final String o;
    
    public g(String paramString1)
    {
      o = paramString1;
    }
    
    public static g e(String paramString)
    {
      for (g localg : )
      {
        String str = o;
        if (((str == null) && (paramString == null)) || ((str != null) && (str.equals(paramString)))) {
          return localg;
        }
      }
      ??? = new StringBuilder();
      ((StringBuilder)???).append("No such HapticFeedbackType: ");
      ((StringBuilder)???).append(paramString);
      throw new NoSuchFieldException(((StringBuilder)???).toString());
    }
  }
  
  public static abstract interface h
  {
    public abstract void a();
    
    public abstract void f(boolean paramBoolean);
    
    public abstract void g(o.k paramk);
    
    public abstract void h(List paramList);
    
    public abstract void i(o.i parami);
    
    public abstract void j();
    
    public abstract void k();
    
    public abstract void l(String paramString);
    
    public abstract void m(o.c paramc);
    
    public abstract void n(o.g paramg);
    
    public abstract CharSequence o(o.e parame);
    
    public abstract void p(int paramInt);
    
    public abstract void q(String paramString);
    
    public abstract boolean r();
    
    public abstract void s(o.j paramj);
  }
  
  public static enum i
  {
    public final String o;
    
    public i(String paramString1)
    {
      o = paramString1;
    }
    
    public static i e(String paramString)
    {
      for (localObject : ) {
        if (o.equals(paramString)) {
          return (i)localObject;
        }
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("No such SoundType: ");
      ((StringBuilder)localObject).append(paramString);
      throw new NoSuchFieldException(((StringBuilder)localObject).toString());
    }
  }
  
  public static class j
  {
    public final Integer a;
    public final o.d b;
    public final Boolean c;
    public final Integer d;
    public final o.d e;
    public final Integer f;
    public final Boolean g;
    
    public j(Integer paramInteger1, o.d paramd1, Boolean paramBoolean1, Integer paramInteger2, o.d paramd2, Integer paramInteger3, Boolean paramBoolean2)
    {
      a = paramInteger1;
      b = paramd1;
      c = paramBoolean1;
      d = paramInteger2;
      e = paramd2;
      f = paramInteger3;
      g = paramBoolean2;
    }
  }
  
  public static enum k
  {
    public String o;
    
    public k(String paramString1)
    {
      o = paramString1;
    }
    
    public static k e(String paramString)
    {
      for (localObject : ) {
        if (o.equals(paramString)) {
          return (k)localObject;
        }
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("No such SystemUiMode: ");
      ((StringBuilder)localObject).append(paramString);
      throw new NoSuchFieldException(((StringBuilder)localObject).toString());
    }
  }
  
  public static enum l
  {
    public String o;
    
    public l(String paramString1)
    {
      o = paramString1;
    }
    
    public static l e(String paramString)
    {
      for (l locall : ) {
        if (o.equals(paramString)) {
          return locall;
        }
      }
      ??? = new StringBuilder();
      ((StringBuilder)???).append("No such SystemUiOverlay: ");
      ((StringBuilder)???).append(paramString);
      throw new NoSuchFieldException(((StringBuilder)???).toString());
    }
  }
}

/* Location:
 * Qualified Name:     D5.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */