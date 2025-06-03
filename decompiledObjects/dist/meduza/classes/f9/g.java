package f9;

import android.util.Base64;
import g9.l.a;
import j9.e;
import j9.f;
import j9.o;
import j9.s;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import ka.b;
import ka.d0;
import ka.d0.a;
import ka.u;
import ka.u.a;
import m9.e0;
import ma.h;
import ma.n1;
import ma.n1.a;
import ma.w.a;
import oa.a;
import oa.a.a;
import org.json.JSONArray;
import org.json.JSONObject;
import u7.m;

public final class g
{
  public final SimpleDateFormat a;
  public final e0 b;
  
  public g(e0 parame0)
  {
    b = parame0;
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
    a = localSimpleDateFormat;
    parame0 = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
    parame0.setGregorianChange(new Date(Long.MIN_VALUE));
    localSimpleDateFormat.setCalendar(parame0);
  }
  
  public final void a(ArrayList paramArrayList, JSONObject paramJSONObject)
  {
    boolean bool = paramJSONObject.has("compositeFilter");
    int i = 0;
    if (bool)
    {
      paramJSONObject = paramJSONObject.getJSONObject("compositeFilter");
      if (paramJSONObject.getString("op").equals("AND"))
      {
        paramJSONObject = paramJSONObject.optJSONArray("filters");
        if (paramJSONObject != null) {
          while (i < paramJSONObject.length())
          {
            a(paramArrayList, paramJSONObject.getJSONObject(i));
            i++;
          }
        }
      }
      else
      {
        throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
      }
    }
    else if (paramJSONObject.has("fieldFilter"))
    {
      paramJSONObject = paramJSONObject.getJSONObject("fieldFilter");
      paramArrayList.add(g9.l.e(j9.l.t(paramJSONObject.getJSONObject("field").getString("fieldPath")), l.a.valueOf(paramJSONObject.getString("op")), f(paramJSONObject.getJSONObject("value"))));
    }
    else if (paramJSONObject.has("unaryFilter"))
    {
      paramJSONObject = paramJSONObject.getJSONObject("unaryFilter");
      l.a locala1 = l.a.e;
      l.a locala2 = l.a.d;
      j9.l locall = j9.l.t(paramJSONObject.getJSONObject("field").getString("fieldPath"));
      paramJSONObject = paramJSONObject.getString("op");
      paramJSONObject.getClass();
      paramJSONObject.hashCode();
      i = -1;
      switch (paramJSONObject.hashCode())
      {
      default: 
        break;
      case 1019893512: 
        if (paramJSONObject.equals("IS_NOT_NULL")) {
          i = 3;
        }
        break;
      case -244195494: 
        if (paramJSONObject.equals("IS_NOT_NAN")) {
          i = 2;
        }
        break;
      case -1465346180: 
        if (paramJSONObject.equals("IS_NULL")) {
          i = 1;
        }
        break;
      case -2125479834: 
        if (paramJSONObject.equals("IS_NAN")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        throw new IllegalArgumentException(g.d("Unexpected unary filter: ", paramJSONObject));
      case 3: 
        paramJSONObject = s.b;
        break;
      case 2: 
        paramJSONObject = s.a;
        paramJSONObject = g9.l.e(locall, locala1, paramJSONObject);
        break;
      case 1: 
        paramJSONObject = s.b;
        break;
      }
      paramJSONObject = s.a;
      paramJSONObject = g9.l.e(locall, locala2, paramJSONObject);
      paramArrayList.add(paramJSONObject);
    }
  }
  
  public final void b(d0.a parama, JSONObject paramJSONObject)
  {
    u.a locala = u.M();
    if (paramJSONObject != null)
    {
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        locala.p(f(paramJSONObject.getJSONObject(str)), str);
      }
    }
    parama.t(locala);
  }
  
  public final o c(String paramString)
  {
    o localo = o.t(paramString);
    e0 locale0 = b;
    locale0.getClass();
    boolean bool = e0.q(localo);
    int i = 1;
    if ((!bool) || (!localo.n(1).equals(a.a)) || (!localo.n(3).equals(a.b))) {
      i = 0;
    }
    if (i != 0) {
      return (o)localo.r();
    }
    throw new IllegalArgumentException(g.d("Resource name is not valid for current instance: ", paramString));
  }
  
  public final ArrayList d(JSONObject paramJSONObject)
  {
    ArrayList localArrayList = new ArrayList();
    paramJSONObject = paramJSONObject.optJSONArray("values");
    if (paramJSONObject != null) {
      for (int i = 0; i < paramJSONObject.length(); i++) {
        localArrayList.add(f(paramJSONObject.getJSONObject(i)));
      }
    }
    return localArrayList;
  }
  
  public final m e(Object paramObject)
  {
    long l1;
    if ((paramObject instanceof String))
    {
      String str = (String)paramObject;
      try
      {
        int i = str.indexOf('T');
        if (i != -1)
        {
          int j = str.indexOf('Z', i);
          int k = j;
          if (j == -1) {
            k = str.indexOf('+', i);
          }
          j = k;
          if (k == -1) {
            j = str.indexOf('-', i);
          }
          if (j != -1)
          {
            Object localObject1 = str.substring(0, j);
            paramObject = "";
            k = ((String)localObject1).indexOf('.');
            localObject2 = localObject1;
            if (k != -1)
            {
              localObject2 = ((String)localObject1).substring(0, k);
              paramObject = ((String)localObject1).substring(k + 1);
            }
            l1 = a.parse((String)localObject2).getTime() / 1000L;
            int m;
            if (((String)paramObject).isEmpty())
            {
              m = 0;
            }
            else
            {
              i = 0;
              k = i;
              for (;;)
              {
                m = k;
                if (i >= 9) {
                  break;
                }
                m = k * 10;
                k = m;
                if (i < ((String)paramObject).length()) {
                  if ((((String)paramObject).charAt(i) >= '0') && (((String)paramObject).charAt(i) <= '9'))
                  {
                    k = ((String)paramObject).charAt(i) - '0' + m;
                  }
                  else
                  {
                    localObject2 = new java/lang/IllegalArgumentException;
                    localObject1 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject1).<init>();
                    ((StringBuilder)localObject1).append("Invalid nanoseconds: ");
                    ((StringBuilder)localObject1).append((String)paramObject);
                    ((IllegalArgumentException)localObject2).<init>(((StringBuilder)localObject1).toString());
                    throw ((Throwable)localObject2);
                  }
                }
                i++;
              }
            }
            if (str.charAt(j) == 'Z')
            {
              if (str.length() != j + 1)
              {
                paramObject = new java/lang/IllegalArgumentException;
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                ((StringBuilder)localObject2).append("Invalid timestamp: Invalid trailing data \"");
                ((StringBuilder)localObject2).append(str.substring(j));
                ((StringBuilder)localObject2).append("\"");
                ((IllegalArgumentException)paramObject).<init>(((StringBuilder)localObject2).toString());
                throw ((Throwable)paramObject);
              }
            }
            else
            {
              paramObject = str.substring(j + 1);
              k = ((String)paramObject).indexOf(':');
              if (k == -1) {
                break label465;
              }
              localObject2 = ((String)paramObject).substring(0, k);
              paramObject = ((String)paramObject).substring(k + 1);
              long l2 = Long.parseLong((String)localObject2);
              l2 = (Long.parseLong((String)paramObject) + l2 * 60L) * 60L;
              if (str.charAt(j) == '+') {
                l1 -= l2;
              } else {
                l1 += l2;
              }
            }
            return new m(m, l1);
            label465:
            localObject2 = new java/lang/IllegalArgumentException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append("Invalid offset value: ");
            ((StringBuilder)localObject1).append((String)paramObject);
            ((IllegalArgumentException)localObject2).<init>(((StringBuilder)localObject1).toString());
            throw ((Throwable)localObject2);
          }
          localObject2 = new java/lang/IllegalArgumentException;
          paramObject = new java/lang/StringBuilder;
          ((StringBuilder)paramObject).<init>();
          ((StringBuilder)paramObject).append("Invalid timestamp: Missing valid timezone offset: ");
          ((StringBuilder)paramObject).append(str);
          ((IllegalArgumentException)localObject2).<init>(((StringBuilder)paramObject).toString());
          throw ((Throwable)localObject2);
        }
        Object localObject2 = new java/lang/IllegalArgumentException;
        paramObject = new java/lang/StringBuilder;
        ((StringBuilder)paramObject).<init>();
        ((StringBuilder)paramObject).append("Invalid timestamp: ");
        ((StringBuilder)paramObject).append(str);
        ((IllegalArgumentException)localObject2).<init>(((StringBuilder)paramObject).toString());
        throw ((Throwable)localObject2);
      }
      catch (ParseException paramObject)
      {
        throw new IllegalArgumentException("Failed to parse timestamp", (Throwable)paramObject);
      }
    }
    if ((paramObject instanceof JSONObject))
    {
      paramObject = (JSONObject)paramObject;
      l1 = ((JSONObject)paramObject).optLong("seconds");
      return new m(((JSONObject)paramObject).optInt("nanos"), l1);
    }
    throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
  }
  
  public final d0 f(JSONObject paramJSONObject)
  {
    Object localObject1 = d0.d0();
    if (paramJSONObject.has("nullValue"))
    {
      ((w.a)localObject1).m();
      d0.N((d0)b);
    }
    else
    {
      boolean bool = paramJSONObject.has("booleanValue");
      int i = 0;
      if (bool)
      {
        bool = paramJSONObject.optBoolean("booleanValue", false);
        ((w.a)localObject1).m();
        d0.O((d0)b, bool);
      }
      else if (paramJSONObject.has("integerValue"))
      {
        ((d0.a)localObject1).s(paramJSONObject.optLong("integerValue"));
      }
      else if (paramJSONObject.has("doubleValue"))
      {
        ((d0.a)localObject1).q(paramJSONObject.optDouble("doubleValue"));
      }
      else
      {
        Object localObject2;
        if (paramJSONObject.has("timestampValue"))
        {
          localObject2 = e(paramJSONObject.get("timestampValue"));
          paramJSONObject = n1.L();
          paramJSONObject.p(a);
          i = b;
          paramJSONObject.m();
          n1.H((n1)b, i);
          ((d0.a)localObject1).w(paramJSONObject);
        }
        else if (paramJSONObject.has("stringValue"))
        {
          ((d0.a)localObject1).v(paramJSONObject.optString("stringValue", ""));
        }
        else if (paramJSONObject.has("bytesValue"))
        {
          paramJSONObject = Base64.decode(paramJSONObject.getString("bytesValue"), 0);
          localObject2 = h.b;
          paramJSONObject = h.m(paramJSONObject, 0, paramJSONObject.length);
          ((w.a)localObject1).m();
          d0.I((d0)b, paramJSONObject);
        }
        else if (paramJSONObject.has("referenceValue"))
        {
          paramJSONObject = paramJSONObject.getString("referenceValue");
          ((w.a)localObject1).m();
          d0.J((d0)b, paramJSONObject);
        }
        else if (paramJSONObject.has("geoPointValue"))
        {
          paramJSONObject = paramJSONObject.getJSONObject("geoPointValue");
          localObject2 = a.L();
          double d = paramJSONObject.optDouble("latitude");
          ((w.a)localObject2).m();
          a.G((a)b, d);
          d = paramJSONObject.optDouble("longitude");
          ((w.a)localObject2).m();
          a.H((a)b, d);
          ((d0.a)localObject1).r((a.a)localObject2);
        }
        else if (paramJSONObject.has("arrayValue"))
        {
          localObject2 = paramJSONObject.getJSONObject("arrayValue").optJSONArray("values");
          paramJSONObject = b.M();
          if (localObject2 != null) {
            while (i < ((JSONArray)localObject2).length())
            {
              d0 locald0 = f(((JSONArray)localObject2).getJSONObject(i));
              paramJSONObject.m();
              b.G((b)b, locald0);
              i++;
            }
          }
          ((d0.a)localObject1).p(paramJSONObject);
        }
        else
        {
          if (!paramJSONObject.has("mapValue")) {
            break label512;
          }
          b((d0.a)localObject1, paramJSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        }
      }
    }
    return (d0)((w.a)localObject1).k();
    label512:
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Unexpected value type: ");
    ((StringBuilder)localObject1).append(paramJSONObject);
    throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
  }
}

/* Location:
 * Qualified Name:     f9.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */