package n8;

import android.util.Base64;
import android.util.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m8.a0;
import m8.b;
import m8.b.a;
import m8.c;
import m8.c.a;
import m8.f;
import m8.f0;
import m8.f0.a;
import m8.f0.e.d.a.b;
import m8.f0.e.d.a.b.b;
import m8.f0.e.d.a.b.c;
import m8.h.a;
import m8.i;
import m8.k.a;
import m8.l;
import m8.l.a;
import m8.m;
import m8.n;
import m8.p;
import m8.q;
import m8.s;
import m8.s.a;
import m8.t;
import m8.t.a;
import m8.u.a;
import m8.y;
import m8.z.a;

public final class a
{
  public static final a9.d a;
  
  static
  {
    a9.e locale = new a9.e();
    m8.a.a.a(locale);
    d = true;
    a = new a9.d(locale);
  }
  
  public static s a(JsonReader paramJsonReader)
  {
    s.a locala = new s.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.getClass();
      int i = -1;
      switch (str.hashCode())
      {
      default: 
        break;
      case 2125650548: 
        if (str.equals("importance")) {
          i = 4;
        }
        break;
      case 3143036: 
        if (str.equals("file")) {
          i = 3;
        }
        break;
      case 3571: 
        if (str.equals("pc")) {
          i = 2;
        }
        break;
      case -887523944: 
        if (str.equals("symbol")) {
          i = 1;
        }
        break;
      case -1019779949: 
        if (str.equals("offset")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 4: 
        e = paramJsonReader.nextInt();
        f = ((byte)(byte)(f | 0x4));
        break;
      case 3: 
        c = paramJsonReader.nextString();
        break;
      case 2: 
        a = paramJsonReader.nextLong();
        f = ((byte)(byte)(f | 0x1));
        break;
      case 1: 
        str = paramJsonReader.nextString();
        if (str != null) {
          b = str;
        } else {
          throw new NullPointerException("Null symbol");
        }
        break;
      case 0: 
        d = paramJsonReader.nextLong();
        f = ((byte)(byte)(f | 0x2));
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static m8.e b(JsonReader paramJsonReader)
  {
    paramJsonReader.beginObject();
    String str1 = null;
    String str2 = null;
    while (paramJsonReader.hasNext())
    {
      String str3 = paramJsonReader.nextName();
      str3.getClass();
      if (!str3.equals("key"))
      {
        if (!str3.equals("value"))
        {
          paramJsonReader.skipValue();
        }
        else
        {
          str2 = paramJsonReader.nextString();
          if (str2 == null) {
            throw new NullPointerException("Null value");
          }
        }
      }
      else
      {
        str1 = paramJsonReader.nextString();
        if (str1 == null) {
          throw new NullPointerException("Null key");
        }
      }
    }
    paramJsonReader.endObject();
    if ((str1 != null) && (str2 != null)) {
      return new m8.e(str1, str2);
    }
    paramJsonReader = new StringBuilder();
    if (str1 == null) {
      paramJsonReader.append(" key");
    }
    if (str2 == null) {
      paramJsonReader.append(" value");
    }
    throw new IllegalStateException(a0.j.l("Missing required properties:", paramJsonReader));
  }
  
  public static c c(JsonReader paramJsonReader)
  {
    c.a locala = new c.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.getClass();
      int i = -1;
      switch (str.hashCode())
      {
      default: 
        break;
      case 2125650548: 
        if (str.equals("importance")) {
          i = 8;
        }
        break;
      case 723857505: 
        if (str.equals("traceFile")) {
          i = 7;
        }
        break;
      case 722137681: 
        if (str.equals("reasonCode")) {
          i = 6;
        }
        break;
      case 202325402: 
        if (str.equals("processName")) {
          i = 5;
        }
        break;
      case 55126294: 
        if (str.equals("timestamp")) {
          i = 4;
        }
        break;
      case 113234: 
        if (str.equals("rss")) {
          i = 3;
        }
        break;
      case 111312: 
        if (str.equals("pss")) {
          i = 2;
        }
        break;
      case 110987: 
        if (str.equals("pid")) {
          i = 1;
        }
        break;
      case -1516200806: 
        if (str.equals("buildIdMappingForArch")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 8: 
        d = paramJsonReader.nextInt();
        j = ((byte)(byte)(j | 0x4));
        break;
      case 7: 
        h = paramJsonReader.nextString();
        break;
      case 6: 
        c = paramJsonReader.nextInt();
        j = ((byte)(byte)(j | 0x2));
        break;
      case 5: 
        str = paramJsonReader.nextString();
        if (str != null) {
          b = str;
        } else {
          throw new NullPointerException("Null processName");
        }
        break;
      case 4: 
        g = paramJsonReader.nextLong();
        j = ((byte)(byte)(j | 0x20));
        break;
      case 3: 
        f = paramJsonReader.nextLong();
        j = ((byte)(byte)(0x10 | j));
        break;
      case 2: 
        e = paramJsonReader.nextLong();
        j = ((byte)(byte)(j | 0x8));
        break;
      case 1: 
        a = paramJsonReader.nextInt();
        j = ((byte)(byte)(j | 0x1));
        break;
      case 0: 
        i = d(paramJsonReader, new w3.v(16));
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static <T> List<T> d(JsonReader paramJsonReader, a<T> parama)
  {
    ArrayList localArrayList = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      localArrayList.add(parama.c(paramJsonReader));
    }
    paramJsonReader.endArray();
    return Collections.unmodifiableList(localArrayList);
  }
  
  public static l e(JsonReader paramJsonReader)
  {
    l.a locala = new l.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      Object localObject1 = paramJsonReader.nextName();
      localObject1.getClass();
      int i = ((String)localObject1).hashCode();
      int j = 3;
      int k = 4;
      switch (i)
      {
      default: 
        break;
      case 55126294: 
        if (((String)localObject1).equals("timestamp")) {
          i = 5;
        }
        break;
      case 3575610: 
        if (((String)localObject1).equals("type")) {
          i = 4;
        }
        break;
      case 107332: 
        if (((String)localObject1).equals("log")) {
          i = 3;
        }
        break;
      case 96801: 
        if (((String)localObject1).equals("app")) {
          i = 2;
        }
        break;
      case -259312414: 
        if (((String)localObject1).equals("rollouts")) {
          i = 1;
        }
        break;
      case -1335157162: 
        if (((String)localObject1).equals("device")) {
          i = 0;
        }
        break;
      }
      i = -1;
      Object localObject2;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 4)
              {
                if (i != 5)
                {
                  paramJsonReader.skipValue();
                }
                else
                {
                  a = paramJsonReader.nextLong();
                  g = ((byte)(byte)(g | 0x1));
                }
              }
              else
              {
                localObject1 = paramJsonReader.nextString();
                if (localObject1 != null) {
                  b = ((String)localObject1);
                } else {
                  throw new NullPointerException("Null type");
                }
              }
            }
            else
            {
              paramJsonReader.beginObject();
              localObject1 = null;
              while (paramJsonReader.hasNext()) {
                if (paramJsonReader.nextName().equals("content"))
                {
                  localObject1 = paramJsonReader.nextString();
                  if (localObject1 == null) {
                    throw new NullPointerException("Null content");
                  }
                }
                else
                {
                  paramJsonReader.skipValue();
                }
              }
              paramJsonReader.endObject();
              if (localObject1 != null) {
                e = new m8.v((String)localObject1);
              } else {
                throw new IllegalStateException("Missing required properties: content");
              }
            }
          }
          else
          {
            paramJsonReader.beginObject();
            int m = 0;
            localObject1 = null;
            int n = 0;
            localObject2 = null;
            t localt = null;
            List localList1 = null;
            List localList2 = null;
            Object localObject3 = null;
            while (paramJsonReader.hasNext())
            {
              Object localObject4 = paramJsonReader.nextName();
              localObject4.getClass();
              switch (((String)localObject4).hashCode())
              {
              default: 
                break;
              case 1847730860: 
                if (((String)localObject4).equals("currentProcessDetails")) {
                  i = 6;
                }
                break;
              case 928737948: 
                if (((String)localObject4).equals("uiOrientation")) {
                  i = 5;
                }
                break;
              case 555169704: 
                if (((String)localObject4).equals("customAttributes")) {
                  i = k;
                }
                break;
              case -80231855: 
                if (((String)localObject4).equals("internalKeys")) {
                  i = j;
                }
                break;
              case -1090974952: 
                if (((String)localObject4).equals("execution")) {
                  i = 2;
                }
                break;
              case -1332194002: 
                if (((String)localObject4).equals("background")) {
                  i = 1;
                }
                break;
              case -1405314732: 
                if (((String)localObject4).equals("appProcessDetails")) {
                  i = 0;
                }
                break;
              }
              i = -1;
              switch (i)
              {
              default: 
                paramJsonReader.skipValue();
                break;
              case 6: 
                localt = g(paramJsonReader);
                break;
              case 5: 
                n = paramJsonReader.nextInt();
                m = (byte)(m | 0x1);
                break;
              case 4: 
                localList1 = d(paramJsonReader, new r3.j(16));
                break;
              case 3: 
                localList2 = d(paramJsonReader, new e0.d(23));
                break;
              case 2: 
                paramJsonReader.beginObject();
                localObject3 = null;
                p localp = null;
                localObject4 = null;
                Object localObject5 = null;
                List localList3 = null;
                if (paramJsonReader.hasNext())
                {
                  String str1 = paramJsonReader.nextName();
                  str1.getClass();
                  switch (str1.hashCode())
                  {
                  default: 
                    break;
                  case 1481625679: 
                    if (str1.equals("exception")) {
                      i = k;
                    }
                    break;
                  case 937615455: 
                    if (str1.equals("binaries")) {
                      i = j;
                    }
                    break;
                  case -902467928: 
                    if (str1.equals("signal")) {
                      i = 2;
                    }
                    break;
                  case -1337936983: 
                    if (str1.equals("threads")) {
                      i = 1;
                    }
                    break;
                  case -1375141843: 
                    if (str1.equals("appExitInfo")) {
                      i = 0;
                    }
                    break;
                  }
                  i = -1;
                  switch (i)
                  {
                  default: 
                    paramJsonReader.skipValue();
                  }
                  for (;;)
                  {
                    break;
                    localp = f(paramJsonReader);
                    break;
                    localList3 = d(paramJsonReader, new e0.d(24));
                    if (localList3 != null) {
                      break;
                    }
                    throw new NullPointerException("Null binaries");
                    long l = 0L;
                    paramJsonReader.beginObject();
                    k = 0;
                    str1 = null;
                    localObject5 = null;
                    while (paramJsonReader.hasNext())
                    {
                      String str2 = paramJsonReader.nextName();
                      str2.getClass();
                      switch (str2.hashCode())
                      {
                      default: 
                        break;
                      case 3373707: 
                        if (str2.equals("name")) {
                          i = 2;
                        }
                        break;
                      case 3059181: 
                        if (str2.equals("code")) {
                          i = 1;
                        }
                        break;
                      case -1147692044: 
                        if (str2.equals("address")) {
                          i = 0;
                        }
                        break;
                      }
                      i = -1;
                      switch (i)
                      {
                      default: 
                        paramJsonReader.skipValue();
                        break;
                      case 2: 
                        str1 = paramJsonReader.nextString();
                        if (str1 == null) {
                          throw new NullPointerException("Null name");
                        }
                        break;
                      case 1: 
                        localObject5 = paramJsonReader.nextString();
                        if (localObject5 == null) {
                          throw new NullPointerException("Null code");
                        }
                        break;
                      case 0: 
                        l = paramJsonReader.nextLong();
                        k = (byte)(k | 0x1);
                      }
                    }
                    paramJsonReader.endObject();
                    if ((k == 1) && (str1 != null) && (localObject5 != null))
                    {
                      localObject5 = new q(str1, (String)localObject5, l);
                    }
                    else
                    {
                      paramJsonReader = new StringBuilder();
                      if (str1 == null) {
                        paramJsonReader.append(" name");
                      }
                      if (localObject5 == null) {
                        paramJsonReader.append(" code");
                      }
                      if ((0x1 & k) == 0) {
                        paramJsonReader.append(" address");
                      }
                      throw new IllegalStateException(a0.j.l("Missing required properties:", paramJsonReader));
                      localObject3 = d(paramJsonReader, new r3.j(17));
                      break label1393;
                      localObject4 = c(paramJsonReader);
                    }
                    j = 3;
                    k = 4;
                  }
                }
                paramJsonReader.endObject();
                if ((localObject5 != null) && (localList3 != null))
                {
                  localObject3 = new n((List)localObject3, localp, (f0.a)localObject4, (f0.e.d.a.b.c)localObject5, localList3);
                }
                else
                {
                  paramJsonReader = new StringBuilder();
                  if (localObject5 == null) {
                    paramJsonReader.append(" signal");
                  }
                  if (localList3 == null) {
                    paramJsonReader.append(" binaries");
                  }
                  throw new IllegalStateException(a0.j.l("Missing required properties:", paramJsonReader));
                }
                break;
              case 1: 
                localObject2 = Boolean.valueOf(paramJsonReader.nextBoolean());
                break;
              case 0: 
                label1393:
                localObject1 = d(paramJsonReader, new e0.e(22));
              }
              j = 3;
              k = 4;
            }
            paramJsonReader.endObject();
            if ((m == 1) && (localObject3 != null))
            {
              c = new m((f0.e.d.a.b)localObject3, localList1, localList2, (Boolean)localObject2, localt, (List)localObject1, n);
            }
            else
            {
              paramJsonReader = new StringBuilder();
              if (localObject3 == null) {
                paramJsonReader.append(" execution");
              }
              if ((0x1 & m) == 0) {
                paramJsonReader.append(" uiOrientation");
              }
              throw new IllegalStateException(a0.j.l("Missing required properties:", paramJsonReader));
            }
          }
        }
        else
        {
          paramJsonReader.beginObject();
          localObject1 = null;
          while (paramJsonReader.hasNext())
          {
            localObject2 = paramJsonReader.nextName();
            localObject2.getClass();
            if (!((String)localObject2).equals("assignments"))
            {
              paramJsonReader.skipValue();
            }
            else
            {
              localObject1 = d(paramJsonReader, new w3.v(15));
              if (localObject1 == null) {
                throw new NullPointerException("Null rolloutAssignments");
              }
            }
          }
          paramJsonReader.endObject();
          if (localObject1 != null) {
            f = new y((List)localObject1);
          } else {
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
          }
        }
      }
      else
      {
        localObject1 = new u.a();
        paramJsonReader.beginObject();
        while (paramJsonReader.hasNext())
        {
          localObject2 = paramJsonReader.nextName();
          localObject2.getClass();
          switch (((String)localObject2).hashCode())
          {
          default: 
            break;
          case 1516795582: 
            if (((String)localObject2).equals("proximityOn")) {
              i = 5;
            }
            break;
          case 976541947: 
            if (((String)localObject2).equals("ramUsed")) {
              i = 4;
            }
            break;
          case 279795450: 
            if (((String)localObject2).equals("diskUsed")) {
              i = 3;
            }
            break;
          case -1439500848: 
            if (((String)localObject2).equals("orientation")) {
              i = 2;
            }
            break;
          case -1455558134: 
            if (((String)localObject2).equals("batteryVelocity")) {
              i = 1;
            }
            break;
          case -1708606089: 
            if (((String)localObject2).equals("batteryLevel")) {
              i = 0;
            }
            break;
          }
          i = -1;
          switch (i)
          {
          default: 
            paramJsonReader.skipValue();
            break;
          case 5: 
            c = paramJsonReader.nextBoolean();
            g = ((byte)(byte)(g | 0x2));
            break;
          case 4: 
            e = paramJsonReader.nextLong();
            g = ((byte)(byte)(g | 0x8));
            break;
          case 3: 
            f = paramJsonReader.nextLong();
            g = ((byte)(byte)(g | 0x10));
            break;
          case 2: 
            d = paramJsonReader.nextInt();
            g = ((byte)(byte)(g | 0x4));
            break;
          case 1: 
            b = paramJsonReader.nextInt();
            g = ((byte)(byte)(g | 0x1));
            break;
          case 0: 
            a = Double.valueOf(paramJsonReader.nextDouble());
          }
        }
        paramJsonReader.endObject();
        d = ((u.a)localObject1).a();
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static p f(JsonReader paramJsonReader)
  {
    paramJsonReader.beginObject();
    int i = 0;
    int j = 0;
    String str1 = null;
    String str2 = str1;
    Object localObject1 = str2;
    Object localObject2 = localObject1;
    while (paramJsonReader.hasNext())
    {
      String str3 = paramJsonReader.nextName();
      str3.getClass();
      str3.hashCode();
      int k = -1;
      switch (str3.hashCode())
      {
      default: 
        break;
      case 581754413: 
        if (str3.equals("overflowCount")) {
          k = 4;
        }
        break;
      case 91997906: 
        if (str3.equals("causedBy")) {
          k = 3;
        }
        break;
      case 3575610: 
        if (str3.equals("type")) {
          k = 2;
        }
        break;
      case -934964668: 
        if (str3.equals("reason")) {
          k = 1;
        }
        break;
      case -1266514778: 
        if (str3.equals("frames")) {
          k = 0;
        }
        break;
      }
      switch (k)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 4: 
        j = paramJsonReader.nextInt();
        i = (byte)(i | 0x1);
        break;
      case 3: 
        localObject2 = f(paramJsonReader);
        break;
      case 2: 
        str1 = paramJsonReader.nextString();
        if (str1 == null) {
          throw new NullPointerException("Null type");
        }
        break;
      case 1: 
        str2 = paramJsonReader.nextString();
        break;
      case 0: 
        localObject1 = d(paramJsonReader, new w3.v(17));
        if (localObject1 == null) {
          throw new NullPointerException("Null frames");
        }
        break;
      }
    }
    paramJsonReader.endObject();
    if ((i == 1) && (str1 != null) && (localObject1 != null)) {
      return new p(str1, str2, (List)localObject1, (f0.e.d.a.b.b)localObject2, j);
    }
    paramJsonReader = new StringBuilder();
    if (str1 == null) {
      paramJsonReader.append(" type");
    }
    if (localObject1 == null) {
      paramJsonReader.append(" frames");
    }
    if ((i & 0x1) == 0) {
      paramJsonReader.append(" overflowCount");
    }
    throw new IllegalStateException(a0.j.l("Missing required properties:", paramJsonReader));
  }
  
  public static t g(JsonReader paramJsonReader)
  {
    t.a locala = new t.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.getClass();
      int i = -1;
      switch (str.hashCode())
      {
      default: 
        break;
      case 2125650548: 
        if (str.equals("importance")) {
          i = 3;
        }
        break;
      case 1694598382: 
        if (str.equals("defaultProcess")) {
          i = 2;
        }
        break;
      case 202325402: 
        if (str.equals("processName")) {
          i = 1;
        }
        break;
      case 110987: 
        if (str.equals("pid")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 3: 
        c = paramJsonReader.nextInt();
        e = ((byte)(byte)(e | 0x2));
        break;
      case 2: 
        d = paramJsonReader.nextBoolean();
        e = ((byte)(byte)(e | 0x4));
        break;
      case 1: 
        str = paramJsonReader.nextString();
        if (str != null) {
          a = str;
        } else {
          throw new NullPointerException("Null processName");
        }
        break;
      case 0: 
        b = paramJsonReader.nextInt();
        e = ((byte)(byte)(e | 0x1));
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static b h(JsonReader paramJsonReader)
  {
    Object localObject1 = f0.a;
    b.a locala = new b.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      localObject1 = paramJsonReader.nextName();
      localObject1.getClass();
      switch (((String)localObject1).hashCode())
      {
      default: 
        break;
      case 1984987798: 
        if (((String)localObject1).equals("session")) {
          i = 11;
        }
        break;
      case 1975623094: 
        if (((String)localObject1).equals("displayVersion")) {
          i = 10;
        }
        break;
      case 1874684019: 
        if (((String)localObject1).equals("platform")) {
          i = 9;
        }
        break;
      case 1047652060: 
        if (((String)localObject1).equals("firebaseInstallationId")) {
          i = 8;
        }
        break;
      case 719853845: 
        if (((String)localObject1).equals("installationUuid")) {
          i = 7;
        }
        break;
      case 344431858: 
        if (((String)localObject1).equals("gmpAppId")) {
          i = 6;
        }
        break;
      case -401988390: 
        if (((String)localObject1).equals("firebaseAuthenticationToken")) {
          i = 5;
        }
        break;
      case -911706486: 
        if (((String)localObject1).equals("buildVersion")) {
          i = 4;
        }
        break;
      case -1375141843: 
        if (((String)localObject1).equals("appExitInfo")) {
          i = 3;
        }
        break;
      case -1907185581: 
        if (((String)localObject1).equals("appQualitySessionId")) {
          i = 2;
        }
        break;
      case -1962630338: 
        if (((String)localObject1).equals("sdkVersion")) {
          i = 1;
        }
        break;
      case -2118372775: 
        if (((String)localObject1).equals("ndkPayload")) {
          i = 0;
        }
        break;
      }
      int i = -1;
      localObject1 = null;
      Object localObject2;
      Object localObject3;
      switch (i)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 11: 
        h.a locala1 = new h.a();
        f = false;
        m = ((byte)(byte)(m | 0x2));
        paramJsonReader.beginObject();
        while (paramJsonReader.hasNext())
        {
          localObject1 = paramJsonReader.nextName();
          localObject1.getClass();
          switch (((String)localObject1).hashCode())
          {
          default: 
            break;
          case 2047016109: 
            if (((String)localObject1).equals("generatorType")) {
              i = 11;
            }
            break;
          case 1025385094: 
            if (((String)localObject1).equals("crashed")) {
              i = 10;
            }
            break;
          case 286956243: 
            if (((String)localObject1).equals("generator")) {
              i = 9;
            }
            break;
          case 3599307: 
            if (((String)localObject1).equals("user")) {
              i = 8;
            }
            break;
          case 96801: 
            if (((String)localObject1).equals("app")) {
              i = 7;
            }
            break;
          case 3556: 
            if (((String)localObject1).equals("os")) {
              i = 6;
            }
            break;
          case -1291329255: 
            if (((String)localObject1).equals("events")) {
              i = 5;
            }
            break;
          case -1335157162: 
            if (((String)localObject1).equals("device")) {
              i = 4;
            }
            break;
          case -1606742899: 
            if (((String)localObject1).equals("endedAt")) {
              i = 3;
            }
            break;
          case -1618432855: 
            if (((String)localObject1).equals("identifier")) {
              i = 2;
            }
            break;
          case -1907185581: 
            if (((String)localObject1).equals("appQualitySessionId")) {
              i = 1;
            }
            break;
          case -2128794476: 
            if (((String)localObject1).equals("startedAt")) {
              i = 0;
            }
            break;
          }
          i = -1;
          switch (i)
          {
          default: 
            paramJsonReader.skipValue();
            break;
          case 11: 
            l = paramJsonReader.nextInt();
            m = ((byte)(byte)(m | 0x4));
            break;
          case 10: 
            f = paramJsonReader.nextBoolean();
            m = ((byte)(byte)(m | 0x2));
            break;
          case 9: 
            localObject1 = paramJsonReader.nextString();
            if (localObject1 != null) {
              a = ((String)localObject1);
            } else {
              throw new NullPointerException("Null generator");
            }
            break;
          case 8: 
            paramJsonReader.beginObject();
            localObject1 = null;
            while (paramJsonReader.hasNext()) {
              if (paramJsonReader.nextName().equals("identifier"))
              {
                localObject1 = paramJsonReader.nextString();
                if (localObject1 == null) {
                  throw new NullPointerException("Null identifier");
                }
              }
              else
              {
                paramJsonReader.skipValue();
              }
            }
            paramJsonReader.endObject();
            if (localObject1 != null) {
              h = new a0((String)localObject1);
            } else {
              throw new IllegalStateException("Missing required properties: identifier");
            }
            break;
          case 7: 
            paramJsonReader.beginObject();
            String str1 = null;
            localObject1 = str1;
            localObject2 = localObject1;
            localObject3 = localObject2;
            Object localObject4 = localObject3;
            Object localObject5 = localObject4;
            while (paramJsonReader.hasNext())
            {
              String str2 = paramJsonReader.nextName();
              str2.getClass();
              str2.hashCode();
              i = -1;
              switch (str2.hashCode())
              {
              default: 
                break;
              case 1975623094: 
                if (str2.equals("displayVersion")) {
                  i = 5;
                }
                break;
              case 719853845: 
                if (str2.equals("installationUuid")) {
                  i = 4;
                }
                break;
              case 351608024: 
                if (str2.equals("version")) {
                  i = 3;
                }
                break;
              case 213652010: 
                if (str2.equals("developmentPlatformVersion")) {
                  i = 2;
                }
                break;
              case -519438642: 
                if (str2.equals("developmentPlatform")) {
                  i = 1;
                }
                break;
              case -1618432855: 
                if (str2.equals("identifier")) {
                  i = 0;
                }
                break;
              }
              switch (i)
              {
              default: 
                paramJsonReader.skipValue();
                break;
              case 5: 
                localObject2 = paramJsonReader.nextString();
                break;
              case 4: 
                localObject3 = paramJsonReader.nextString();
                break;
              case 3: 
                localObject1 = paramJsonReader.nextString();
                if (localObject1 == null) {
                  throw new NullPointerException("Null version");
                }
                break;
              case 2: 
                localObject5 = paramJsonReader.nextString();
                break;
              case 1: 
                localObject4 = paramJsonReader.nextString();
                break;
              case 0: 
                str1 = paramJsonReader.nextString();
                if (str1 == null) {
                  throw new NullPointerException("Null identifier");
                }
                break;
              }
            }
            paramJsonReader.endObject();
            if ((str1 != null) && (localObject1 != null))
            {
              g = new i(str1, (String)localObject1, (String)localObject2, (String)localObject3, (String)localObject4, (String)localObject5);
            }
            else
            {
              paramJsonReader = new StringBuilder();
              if (str1 == null) {
                paramJsonReader.append(" identifier");
              }
              if (localObject1 == null) {
                paramJsonReader.append(" version");
              }
              throw new IllegalStateException(a0.j.l("Missing required properties:", paramJsonReader));
            }
            break;
          case 6: 
            localObject1 = new z.a();
            paramJsonReader.beginObject();
            while (paramJsonReader.hasNext())
            {
              localObject2 = paramJsonReader.nextName();
              localObject2.getClass();
              ((String)localObject2).hashCode();
              i = -1;
              switch (((String)localObject2).hashCode())
              {
              default: 
                break;
              case 1874684019: 
                if (((String)localObject2).equals("platform")) {
                  i = 3;
                }
                break;
              case 351608024: 
                if (((String)localObject2).equals("version")) {
                  i = 2;
                }
                break;
              case -293026577: 
                if (((String)localObject2).equals("jailbroken")) {
                  i = 1;
                }
                break;
              case -911706486: 
                if (((String)localObject2).equals("buildVersion")) {
                  i = 0;
                }
                break;
              }
              switch (i)
              {
              default: 
                paramJsonReader.skipValue();
                break;
              case 3: 
                a = paramJsonReader.nextInt();
                e = ((byte)(byte)(e | 0x1));
                break;
              case 2: 
                localObject2 = paramJsonReader.nextString();
                if (localObject2 != null) {
                  b = ((String)localObject2);
                } else {
                  throw new NullPointerException("Null version");
                }
                break;
              case 1: 
                d = paramJsonReader.nextBoolean();
                e = ((byte)(byte)(e | 0x2));
                break;
              case 0: 
                localObject2 = paramJsonReader.nextString();
                if (localObject2 != null) {
                  c = ((String)localObject2);
                } else {
                  throw new NullPointerException("Null buildVersion");
                }
                break;
              }
            }
            paramJsonReader.endObject();
            i = ((z.a)localObject1).a();
            break;
          case 5: 
            k = d(paramJsonReader, new e0.d(22));
            break;
          case 4: 
            localObject1 = new k.a();
            paramJsonReader.beginObject();
            while (paramJsonReader.hasNext())
            {
              localObject2 = paramJsonReader.nextName();
              localObject2.getClass();
              ((String)localObject2).hashCode();
              i = -1;
              switch (((String)localObject2).hashCode())
              {
              default: 
                break;
              case 2078953423: 
                if (((String)localObject2).equals("modelClass")) {
                  i = 8;
                }
                break;
              case 109757585: 
                if (((String)localObject2).equals("state")) {
                  i = 7;
                }
                break;
              case 104069929: 
                if (((String)localObject2).equals("model")) {
                  i = 6;
                }
                break;
              case 94848180: 
                if (((String)localObject2).equals("cores")) {
                  i = 5;
                }
                break;
              case 81784169: 
                if (((String)localObject2).equals("diskSpace")) {
                  i = 4;
                }
                break;
              case 3002454: 
                if (((String)localObject2).equals("arch")) {
                  i = 3;
                }
                break;
              case 112670: 
                if (((String)localObject2).equals("ram")) {
                  i = 2;
                }
                break;
              case -1969347631: 
                if (((String)localObject2).equals("manufacturer")) {
                  i = 1;
                }
                break;
              case -1981332476: 
                if (((String)localObject2).equals("simulator")) {
                  i = 0;
                }
                break;
              }
              switch (i)
              {
              default: 
                paramJsonReader.skipValue();
                break;
              case 8: 
                localObject2 = paramJsonReader.nextString();
                if (localObject2 != null) {
                  i = ((String)localObject2);
                } else {
                  throw new NullPointerException("Null modelClass");
                }
                break;
              case 7: 
                g = paramJsonReader.nextInt();
                j = ((byte)(byte)(j | 0x20));
                break;
              case 6: 
                localObject2 = paramJsonReader.nextString();
                if (localObject2 != null) {
                  b = ((String)localObject2);
                } else {
                  throw new NullPointerException("Null model");
                }
                break;
              case 5: 
                c = paramJsonReader.nextInt();
                j = ((byte)(byte)(j | 0x2));
                break;
              case 4: 
                e = paramJsonReader.nextLong();
                j = ((byte)(byte)(j | 0x8));
                break;
              case 3: 
                a = paramJsonReader.nextInt();
                j = ((byte)(byte)(j | 0x1));
                break;
              case 2: 
                d = paramJsonReader.nextLong();
                j = ((byte)(byte)(j | 0x4));
                break;
              case 1: 
                localObject2 = paramJsonReader.nextString();
                if (localObject2 != null) {
                  h = ((String)localObject2);
                } else {
                  throw new NullPointerException("Null manufacturer");
                }
                break;
              case 0: 
                f = paramJsonReader.nextBoolean();
                j = ((byte)(byte)(j | 0x10));
              }
            }
            paramJsonReader.endObject();
            j = ((k.a)localObject1).a();
            break;
          case 3: 
            e = Long.valueOf(paramJsonReader.nextLong());
            break;
          case 2: 
            b = new String(Base64.decode(paramJsonReader.nextString(), 2), f0.a);
            break;
          case 1: 
            c = paramJsonReader.nextString();
            break;
          case 0: 
            d = paramJsonReader.nextLong();
            m = ((byte)(byte)(m | 0x1));
          }
        }
        paramJsonReader.endObject();
        j = locala1.a();
        break;
      case 10: 
        localObject1 = paramJsonReader.nextString();
        if (localObject1 != null) {
          i = ((String)localObject1);
        } else {
          throw new NullPointerException("Null displayVersion");
        }
        break;
      case 9: 
        c = paramJsonReader.nextInt();
        m = ((byte)(byte)(m | 0x1));
        break;
      case 8: 
        e = paramJsonReader.nextString();
        break;
      case 7: 
        localObject1 = paramJsonReader.nextString();
        if (localObject1 != null) {
          d = ((String)localObject1);
        } else {
          throw new NullPointerException("Null installationUuid");
        }
        break;
      case 6: 
        localObject1 = paramJsonReader.nextString();
        if (localObject1 != null) {
          b = ((String)localObject1);
        } else {
          throw new NullPointerException("Null gmpAppId");
        }
        break;
      case 5: 
        f = paramJsonReader.nextString();
        break;
      case 4: 
        localObject1 = paramJsonReader.nextString();
        if (localObject1 != null) {
          h = ((String)localObject1);
        } else {
          throw new NullPointerException("Null buildVersion");
        }
        break;
      case 3: 
        l = c(paramJsonReader);
        break;
      case 2: 
        g = paramJsonReader.nextString();
        break;
      case 1: 
        localObject1 = paramJsonReader.nextString();
        if (localObject1 != null) {
          a = ((String)localObject1);
        } else {
          throw new NullPointerException("Null sdkVersion");
        }
        break;
      case 0: 
        paramJsonReader.beginObject();
        localObject2 = null;
        while (paramJsonReader.hasNext())
        {
          localObject3 = paramJsonReader.nextName();
          localObject3.getClass();
          if (!((String)localObject3).equals("files"))
          {
            if (!((String)localObject3).equals("orgId")) {
              paramJsonReader.skipValue();
            } else {
              localObject2 = paramJsonReader.nextString();
            }
          }
          else
          {
            localObject1 = d(paramJsonReader, new e0.e(21));
            if (localObject1 == null) {
              throw new NullPointerException("Null files");
            }
          }
        }
        paramJsonReader.endObject();
        if (localObject1 != null) {
          k = new f((List)localObject1, (String)localObject2);
        } else {
          throw new IllegalStateException("Missing required properties: files");
        }
        break;
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  /* Error */
  public static b i(String paramString)
  {
    // Byte code:
    //   0: new 42	android/util/JsonReader
    //   3: astore_1
    //   4: new 690	java/io/StringReader
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: invokespecial 691	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   13: aload_1
    //   14: aload_2
    //   15: invokespecial 694	android/util/JsonReader:<init>	(Ljava/io/Reader;)V
    //   18: aload_1
    //   19: invokestatic 696	n8/a:h	(Landroid/util/JsonReader;)Lm8/b;
    //   22: astore_0
    //   23: aload_1
    //   24: invokevirtual 699	android/util/JsonReader:close	()V
    //   27: aload_0
    //   28: areturn
    //   29: astore_0
    //   30: aload_1
    //   31: invokevirtual 699	android/util/JsonReader:close	()V
    //   34: goto +9 -> 43
    //   37: astore_1
    //   38: aload_0
    //   39: aload_1
    //   40: invokevirtual 705	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   43: aload_0
    //   44: athrow
    //   45: astore_0
    //   46: new 707	java/io/IOException
    //   49: dup
    //   50: aload_0
    //   51: invokespecial 709	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	paramString	String
    //   3	28	1	localJsonReader	JsonReader
    //   37	3	1	localThrowable	Throwable
    //   7	8	2	localStringReader	java.io.StringReader
    // Exception table:
    //   from	to	target	type
    //   18	23	29	finally
    //   30	34	37	finally
    //   0	18	45	java/lang/IllegalStateException
    //   23	27	45	java/lang/IllegalStateException
    //   38	43	45	java/lang/IllegalStateException
    //   43	45	45	java/lang/IllegalStateException
  }
  
  public static abstract interface a<T>
  {
    public abstract T c(JsonReader paramJsonReader);
  }
}

/* Location:
 * Qualified Name:     n8.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */