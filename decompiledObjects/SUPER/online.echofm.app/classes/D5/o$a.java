package D5;

import E5.j;
import E5.k.c;
import E5.k.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.b;

public class o$a
  implements k.c
{
  public o$a(o paramo) {}
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    if (o.a(a) == null) {
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
      o.a(a).q(paramj);
    case 13: 
    case 12: 
    case 11: 
    case 10: 
    case 9: 
      for (;;)
      {
        paramd.a(null);
        break;
        bool = o.a(a).r();
        paramj = new org/json/JSONObject;
        paramj.<init>();
        paramj.put("value", bool);
        for (;;)
        {
          paramd.a(paramj);
          return;
          paramj = ((JSONObject)paramj).getString("text");
          o.a(a).l(paramj);
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
          localObject = o.a(a).o(paramj);
          if (localObject == null) {
            break;
          }
          paramj = new org/json/JSONObject;
          paramj.<init>();
          paramj.put("text", localObject);
        }
        o.a(a).a();
        continue;
        bool = ((Boolean)paramj).booleanValue();
        o.a(a).f(bool);
      }
    case 8: 
      try
      {
        paramj = o.f(a, (JSONObject)paramj);
        o.a(a).s(paramj);
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
        o.a(a).k();
        break;
        o.a(a).j();
        break;
        try
        {
          paramj = o.e(a, (String)paramj);
          o.a(a).g(paramj);
          paramd.a(null);
        }
        catch (NoSuchFieldException paramj) {}catch (JSONException paramj) {}
        paramj = paramj.getMessage();
        continue;
        try
        {
          paramj = o.d(a, (JSONArray)paramj);
          o.a(a).h(paramj);
          paramd.a(null);
        }
        catch (NoSuchFieldException paramj) {}catch (JSONException paramj) {}
        paramj = paramj.getMessage();
        continue;
        try
        {
          paramj = o.c(a, (JSONObject)paramj);
          o.a(a).m(paramj);
          paramd.a(null);
        }
        catch (JSONException paramj)
        {
          paramj = paramj.getMessage();
        }
        continue;
        try
        {
          i = o.b(a, (JSONArray)paramj);
          o.a(a).p(i);
          paramd.a(null);
        }
        catch (NoSuchFieldException paramj) {}catch (JSONException paramj) {}
        paramj = paramj.getMessage();
        continue;
        try
        {
          paramj = o.g.e((String)paramj);
          o.a(a).n(paramj);
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
          o.a(a).i(paramj);
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

/* Location:
 * Qualified Name:     D5.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */