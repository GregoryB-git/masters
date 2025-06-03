package K3;

import J3.B;
import J3.B.a;
import J3.B.a.a;
import J3.B.a.a.a;
import J3.B.a.b;
import J3.B.b;
import J3.B.c;
import J3.B.c.a;
import J3.B.d;
import J3.B.d.a;
import J3.B.d.b;
import J3.B.d.b.a;
import J3.B.e;
import J3.B.e.a;
import J3.B.e.a.a;
import J3.B.e.b;
import J3.B.e.c;
import J3.B.e.c.a;
import J3.B.e.d;
import J3.B.e.d.a;
import J3.B.e.d.a.a;
import J3.B.e.d.a.b;
import J3.B.e.d.a.b.a;
import J3.B.e.d.a.b.a.a;
import J3.B.e.d.a.b.b;
import J3.B.e.d.a.b.c;
import J3.B.e.d.a.b.c.a;
import J3.B.e.d.a.b.d;
import J3.B.e.d.a.b.d.a;
import J3.B.e.d.a.b.e;
import J3.B.e.d.a.b.e.a;
import J3.B.e.d.a.b.e.b;
import J3.B.e.d.a.b.e.b.a;
import J3.B.e.d.b;
import J3.B.e.d.c;
import J3.B.e.d.c.a;
import J3.B.e.d.d;
import J3.B.e.d.d.a;
import J3.B.e.e;
import J3.B.e.e.a;
import J3.B.e.f;
import J3.B.e.f.a;
import J3.C;
import android.util.Base64;
import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

public class h
{
  public static final j4.a a = new l4.d().j(J3.a.a).k(true).i();
  
  public static B.d A(JsonReader paramJsonReader)
  {
    B.d.a locala = B.d.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      if (!str.equals("files"))
      {
        if (!str.equals("orgId")) {
          paramJsonReader.skipValue();
        } else {
          locala.c(paramJsonReader.nextString());
        }
      }
      else {
        locala.b(l(paramJsonReader, new d()));
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.e.e B(JsonReader paramJsonReader)
  {
    B.e.e.a locala = B.e.e.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1874684019: 
        if (str.equals("platform")) {
          j = 3;
        }
        break;
      case 351608024: 
        if (str.equals("version")) {
          j = 2;
        }
        break;
      case -293026577: 
        if (str.equals("jailbroken")) {
          j = 1;
        }
        break;
      case -911706486: 
        if (str.equals("buildVersion")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 3: 
        locala.d(paramJsonReader.nextInt());
        break;
      case 2: 
        locala.e(paramJsonReader.nextString());
        break;
      case 1: 
        locala.c(paramJsonReader.nextBoolean());
        break;
      case 0: 
        locala.b(paramJsonReader.nextString());
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B C(JsonReader paramJsonReader)
  {
    B.b localb = B.b();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1984987798: 
        if (str.equals("session")) {
          j = 10;
        }
        break;
      case 1975623094: 
        if (str.equals("displayVersion")) {
          j = 9;
        }
        break;
      case 1874684019: 
        if (str.equals("platform")) {
          j = 8;
        }
        break;
      case 1047652060: 
        if (str.equals("firebaseInstallationId")) {
          j = 7;
        }
        break;
      case 719853845: 
        if (str.equals("installationUuid")) {
          j = 6;
        }
        break;
      case 344431858: 
        if (str.equals("gmpAppId")) {
          j = 5;
        }
        break;
      case -911706486: 
        if (str.equals("buildVersion")) {
          j = 4;
        }
        break;
      case -1375141843: 
        if (str.equals("appExitInfo")) {
          j = 3;
        }
        break;
      case -1907185581: 
        if (str.equals("appQualitySessionId")) {
          j = 2;
        }
        break;
      case -1962630338: 
        if (str.equals("sdkVersion")) {
          j = 1;
        }
        break;
      case -2118372775: 
        if (str.equals("ndkPayload")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 10: 
        localb.l(D(paramJsonReader));
        break;
      case 9: 
        localb.e(paramJsonReader.nextString());
        break;
      case 8: 
        localb.j(paramJsonReader.nextInt());
        break;
      case 7: 
        localb.f(paramJsonReader.nextString());
        break;
      case 6: 
        localb.h(paramJsonReader.nextString());
        break;
      case 5: 
        localb.g(paramJsonReader.nextString());
        break;
      case 4: 
        localb.d(paramJsonReader.nextString());
        break;
      case 3: 
        localb.b(k(paramJsonReader));
        break;
      case 2: 
        localb.c(paramJsonReader.nextString());
        break;
      case 1: 
        localb.k(paramJsonReader.nextString());
        break;
      case 0: 
        localb.i(A(paramJsonReader));
      }
    }
    paramJsonReader.endObject();
    return localb.a();
  }
  
  public static B.e D(JsonReader paramJsonReader)
  {
    B.e.b localb = B.e.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 2047016109: 
        if (str.equals("generatorType")) {
          j = 11;
        }
        break;
      case 1025385094: 
        if (str.equals("crashed")) {
          j = 10;
        }
        break;
      case 286956243: 
        if (str.equals("generator")) {
          j = 9;
        }
        break;
      case 3599307: 
        if (str.equals("user")) {
          j = 8;
        }
        break;
      case 96801: 
        if (str.equals("app")) {
          j = 7;
        }
        break;
      case 3556: 
        if (str.equals("os")) {
          j = 6;
        }
        break;
      case -1291329255: 
        if (str.equals("events")) {
          j = 5;
        }
        break;
      case -1335157162: 
        if (str.equals("device")) {
          j = 4;
        }
        break;
      case -1606742899: 
        if (str.equals("endedAt")) {
          j = 3;
        }
        break;
      case -1618432855: 
        if (str.equals("identifier")) {
          j = 2;
        }
        break;
      case -1907185581: 
        if (str.equals("appQualitySessionId")) {
          j = 1;
        }
        break;
      case -2128794476: 
        if (str.equals("startedAt")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 11: 
        localb.i(paramJsonReader.nextInt());
        break;
      case 10: 
        localb.d(paramJsonReader.nextBoolean());
        break;
      case 9: 
        localb.h(paramJsonReader.nextString());
        break;
      case 8: 
        localb.n(E(paramJsonReader));
        break;
      case 7: 
        localb.b(j(paramJsonReader));
        break;
      case 6: 
        localb.l(B(paramJsonReader));
        break;
      case 5: 
        localb.g(l(paramJsonReader, new c()));
        break;
      case 4: 
        localb.e(o(paramJsonReader));
        break;
      case 3: 
        localb.f(Long.valueOf(paramJsonReader.nextLong()));
        break;
      case 2: 
        localb.k(Base64.decode(paramJsonReader.nextString(), 2));
        break;
      case 1: 
        localb.c(paramJsonReader.nextString());
        break;
      case 0: 
        localb.m(paramJsonReader.nextLong());
      }
    }
    paramJsonReader.endObject();
    return localb.a();
  }
  
  public static B.e.f E(JsonReader paramJsonReader)
  {
    B.e.f.a locala = B.e.f.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      if (!str.equals("identifier")) {
        paramJsonReader.skipValue();
      } else {
        locala.b(paramJsonReader.nextString());
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.e.a j(JsonReader paramJsonReader)
  {
    B.e.a.a locala = B.e.a.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1975623094: 
        if (str.equals("displayVersion")) {
          j = 5;
        }
        break;
      case 719853845: 
        if (str.equals("installationUuid")) {
          j = 4;
        }
        break;
      case 351608024: 
        if (str.equals("version")) {
          j = 3;
        }
        break;
      case 213652010: 
        if (str.equals("developmentPlatformVersion")) {
          j = 2;
        }
        break;
      case -519438642: 
        if (str.equals("developmentPlatform")) {
          j = 1;
        }
        break;
      case -1618432855: 
        if (str.equals("identifier")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 5: 
        locala.d(paramJsonReader.nextString());
        break;
      case 4: 
        locala.f(paramJsonReader.nextString());
        break;
      case 3: 
        locala.g(paramJsonReader.nextString());
        break;
      case 2: 
        locala.c(paramJsonReader.nextString());
        break;
      case 1: 
        locala.b(paramJsonReader.nextString());
        break;
      case 0: 
        locala.e(paramJsonReader.nextString());
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.a k(JsonReader paramJsonReader)
  {
    B.a.b localb = B.a.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 2125650548: 
        if (str.equals("importance")) {
          j = 8;
        }
        break;
      case 723857505: 
        if (str.equals("traceFile")) {
          j = 7;
        }
        break;
      case 722137681: 
        if (str.equals("reasonCode")) {
          j = 6;
        }
        break;
      case 202325402: 
        if (str.equals("processName")) {
          j = 5;
        }
        break;
      case 55126294: 
        if (str.equals("timestamp")) {
          j = 4;
        }
        break;
      case 113234: 
        if (str.equals("rss")) {
          j = 3;
        }
        break;
      case 111312: 
        if (str.equals("pss")) {
          j = 2;
        }
        break;
      case 110987: 
        if (str.equals("pid")) {
          j = 1;
        }
        break;
      case -1516200806: 
        if (str.equals("buildIdMappingForArch")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 8: 
        localb.c(paramJsonReader.nextInt());
        break;
      case 7: 
        localb.j(paramJsonReader.nextString());
        break;
      case 6: 
        localb.g(paramJsonReader.nextInt());
        break;
      case 5: 
        localb.e(paramJsonReader.nextString());
        break;
      case 4: 
        localb.i(paramJsonReader.nextLong());
        break;
      case 3: 
        localb.h(paramJsonReader.nextLong());
        break;
      case 2: 
        localb.f(paramJsonReader.nextLong());
        break;
      case 1: 
        localb.d(paramJsonReader.nextInt());
        break;
      case 0: 
        localb.b(l(paramJsonReader, new a()));
      }
    }
    paramJsonReader.endObject();
    return localb.a();
  }
  
  public static C l(JsonReader paramJsonReader, a parama)
  {
    ArrayList localArrayList = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      localArrayList.add(parama.a(paramJsonReader));
    }
    paramJsonReader.endArray();
    return C.a(localArrayList);
  }
  
  public static B.a.a m(JsonReader paramJsonReader)
  {
    B.a.a.a locala = B.a.a.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 230943785: 
        if (str.equals("buildId")) {
          j = 2;
        }
        break;
      case 3002454: 
        if (str.equals("arch")) {
          j = 1;
        }
        break;
      case -609862170: 
        if (str.equals("libraryName")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 2: 
        locala.c(paramJsonReader.nextString());
        break;
      case 1: 
        locala.b(paramJsonReader.nextString());
        break;
      case 0: 
        locala.d(paramJsonReader.nextString());
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.c n(JsonReader paramJsonReader)
  {
    B.c.a locala = B.c.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      if (!str.equals("key"))
      {
        if (!str.equals("value")) {
          paramJsonReader.skipValue();
        } else {
          locala.c(paramJsonReader.nextString());
        }
      }
      else {
        locala.b(paramJsonReader.nextString());
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.e.c o(JsonReader paramJsonReader)
  {
    B.e.c.a locala = B.e.c.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 2078953423: 
        if (str.equals("modelClass")) {
          j = 8;
        }
        break;
      case 109757585: 
        if (str.equals("state")) {
          j = 7;
        }
        break;
      case 104069929: 
        if (str.equals("model")) {
          j = 6;
        }
        break;
      case 94848180: 
        if (str.equals("cores")) {
          j = 5;
        }
        break;
      case 81784169: 
        if (str.equals("diskSpace")) {
          j = 4;
        }
        break;
      case 3002454: 
        if (str.equals("arch")) {
          j = 3;
        }
        break;
      case 112670: 
        if (str.equals("ram")) {
          j = 2;
        }
        break;
      case -1969347631: 
        if (str.equals("manufacturer")) {
          j = 1;
        }
        break;
      case -1981332476: 
        if (str.equals("simulator")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 8: 
        locala.g(paramJsonReader.nextString());
        break;
      case 7: 
        locala.j(paramJsonReader.nextInt());
        break;
      case 6: 
        locala.f(paramJsonReader.nextString());
        break;
      case 5: 
        locala.c(paramJsonReader.nextInt());
        break;
      case 4: 
        locala.d(paramJsonReader.nextLong());
        break;
      case 3: 
        locala.b(paramJsonReader.nextInt());
        break;
      case 2: 
        locala.h(paramJsonReader.nextLong());
        break;
      case 1: 
        locala.e(paramJsonReader.nextString());
        break;
      case 0: 
        locala.i(paramJsonReader.nextBoolean());
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.e.d p(JsonReader paramJsonReader)
  {
    B.e.d.b localb = B.e.d.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 55126294: 
        if (str.equals("timestamp")) {
          j = 4;
        }
        break;
      case 3575610: 
        if (str.equals("type")) {
          j = 3;
        }
        break;
      case 107332: 
        if (str.equals("log")) {
          j = 2;
        }
        break;
      case 96801: 
        if (str.equals("app")) {
          j = 1;
        }
        break;
      case -1335157162: 
        if (str.equals("device")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 4: 
        localb.e(paramJsonReader.nextLong());
        break;
      case 3: 
        localb.f(paramJsonReader.nextString());
        break;
      case 2: 
        localb.d(w(paramJsonReader));
        break;
      case 1: 
        localb.b(q(paramJsonReader));
        break;
      case 0: 
        localb.c(s(paramJsonReader));
      }
    }
    paramJsonReader.endObject();
    return localb.a();
  }
  
  public static B.e.d.a q(JsonReader paramJsonReader)
  {
    B.e.d.a.a locala = B.e.d.a.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 928737948: 
        if (str.equals("uiOrientation")) {
          j = 4;
        }
        break;
      case 555169704: 
        if (str.equals("customAttributes")) {
          j = 3;
        }
        break;
      case -80231855: 
        if (str.equals("internalKeys")) {
          j = 2;
        }
        break;
      case -1090974952: 
        if (str.equals("execution")) {
          j = 1;
        }
        break;
      case -1332194002: 
        if (str.equals("background")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 4: 
        locala.f(paramJsonReader.nextInt());
        break;
      case 3: 
        locala.c(l(paramJsonReader, new b()));
        break;
      case 2: 
        locala.e(l(paramJsonReader, new b()));
        break;
      case 1: 
        locala.d(t(paramJsonReader));
        break;
      case 0: 
        locala.b(Boolean.valueOf(paramJsonReader.nextBoolean()));
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.e.d.a.b.a r(JsonReader paramJsonReader)
  {
    B.e.d.a.b.a.a locala = B.e.d.a.b.a.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1153765347: 
        if (str.equals("baseAddress")) {
          j = 3;
        }
        break;
      case 3601339: 
        if (str.equals("uuid")) {
          j = 2;
        }
        break;
      case 3530753: 
        if (str.equals("size")) {
          j = 1;
        }
        break;
      case 3373707: 
        if (str.equals("name")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 3: 
        locala.b(paramJsonReader.nextLong());
        break;
      case 2: 
        locala.f(Base64.decode(paramJsonReader.nextString(), 2));
        break;
      case 1: 
        locala.d(paramJsonReader.nextLong());
        break;
      case 0: 
        locala.c(paramJsonReader.nextString());
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.e.d.c s(JsonReader paramJsonReader)
  {
    B.e.d.c.a locala = B.e.d.c.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1516795582: 
        if (str.equals("proximityOn")) {
          j = 5;
        }
        break;
      case 976541947: 
        if (str.equals("ramUsed")) {
          j = 4;
        }
        break;
      case 279795450: 
        if (str.equals("diskUsed")) {
          j = 3;
        }
        break;
      case -1439500848: 
        if (str.equals("orientation")) {
          j = 2;
        }
        break;
      case -1455558134: 
        if (str.equals("batteryVelocity")) {
          j = 1;
        }
        break;
      case -1708606089: 
        if (str.equals("batteryLevel")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 5: 
        locala.f(paramJsonReader.nextBoolean());
        break;
      case 4: 
        locala.g(paramJsonReader.nextLong());
        break;
      case 3: 
        locala.d(paramJsonReader.nextLong());
        break;
      case 2: 
        locala.e(paramJsonReader.nextInt());
        break;
      case 1: 
        locala.c(paramJsonReader.nextInt());
        break;
      case 0: 
        locala.b(Double.valueOf(paramJsonReader.nextDouble()));
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.e.d.a.b t(JsonReader paramJsonReader)
  {
    B.e.d.a.b.b localb = B.e.d.a.b.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1481625679: 
        if (str.equals("exception")) {
          j = 4;
        }
        break;
      case 937615455: 
        if (str.equals("binaries")) {
          j = 3;
        }
        break;
      case -902467928: 
        if (str.equals("signal")) {
          j = 2;
        }
        break;
      case -1337936983: 
        if (str.equals("threads")) {
          j = 1;
        }
        break;
      case -1375141843: 
        if (str.equals("appExitInfo")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 4: 
        localb.d(u(paramJsonReader));
        break;
      case 3: 
        localb.c(l(paramJsonReader, new f()));
        break;
      case 2: 
        localb.e(x(paramJsonReader));
        break;
      case 1: 
        localb.f(l(paramJsonReader, new e()));
        break;
      case 0: 
        localb.b(k(paramJsonReader));
      }
    }
    paramJsonReader.endObject();
    return localb.a();
  }
  
  public static B.e.d.a.b.c u(JsonReader paramJsonReader)
  {
    B.e.d.a.b.c.a locala = B.e.d.a.b.c.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 581754413: 
        if (str.equals("overflowCount")) {
          j = 4;
        }
        break;
      case 91997906: 
        if (str.equals("causedBy")) {
          j = 3;
        }
        break;
      case 3575610: 
        if (str.equals("type")) {
          j = 2;
        }
        break;
      case -934964668: 
        if (str.equals("reason")) {
          j = 1;
        }
        break;
      case -1266514778: 
        if (str.equals("frames")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 4: 
        locala.d(paramJsonReader.nextInt());
        break;
      case 3: 
        locala.b(u(paramJsonReader));
        break;
      case 2: 
        locala.f(paramJsonReader.nextString());
        break;
      case 1: 
        locala.e(paramJsonReader.nextString());
        break;
      case 0: 
        locala.c(l(paramJsonReader, new g()));
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.e.d.a.b.e.b v(JsonReader paramJsonReader)
  {
    B.e.d.a.b.e.b.a locala = B.e.d.a.b.e.b.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 2125650548: 
        if (str.equals("importance")) {
          j = 4;
        }
        break;
      case 3143036: 
        if (str.equals("file")) {
          j = 3;
        }
        break;
      case 3571: 
        if (str.equals("pc")) {
          j = 2;
        }
        break;
      case -887523944: 
        if (str.equals("symbol")) {
          j = 1;
        }
        break;
      case -1019779949: 
        if (str.equals("offset")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 4: 
        locala.c(paramJsonReader.nextInt());
        break;
      case 3: 
        locala.b(paramJsonReader.nextString());
        break;
      case 2: 
        locala.e(paramJsonReader.nextLong());
        break;
      case 1: 
        locala.f(paramJsonReader.nextString());
        break;
      case 0: 
        locala.d(paramJsonReader.nextLong());
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.e.d.d w(JsonReader paramJsonReader)
  {
    B.e.d.d.a locala = B.e.d.d.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      if (!str.equals("content")) {
        paramJsonReader.skipValue();
      } else {
        locala.b(paramJsonReader.nextString());
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.e.d.a.b.d x(JsonReader paramJsonReader)
  {
    B.e.d.a.b.d.a locala = B.e.d.a.b.d.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 3373707: 
        if (str.equals("name")) {
          j = 2;
        }
        break;
      case 3059181: 
        if (str.equals("code")) {
          j = 1;
        }
        break;
      case -1147692044: 
        if (str.equals("address")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 2: 
        locala.d(paramJsonReader.nextString());
        break;
      case 1: 
        locala.c(paramJsonReader.nextString());
        break;
      case 0: 
        locala.b(paramJsonReader.nextLong());
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.e.d.a.b.e y(JsonReader paramJsonReader)
  {
    B.e.d.a.b.e.a locala = B.e.d.a.b.e.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 2125650548: 
        if (str.equals("importance")) {
          j = 2;
        }
        break;
      case 3373707: 
        if (str.equals("name")) {
          j = 1;
        }
        break;
      case -1266514778: 
        if (str.equals("frames")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 2: 
        locala.c(paramJsonReader.nextInt());
        break;
      case 1: 
        locala.d(paramJsonReader.nextString());
        break;
      case 0: 
        locala.b(l(paramJsonReader, new g()));
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  public static B.d.b z(JsonReader paramJsonReader)
  {
    B.d.b.a locala = B.d.b.a();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      str.hashCode();
      if (!str.equals("filename"))
      {
        if (!str.equals("contents")) {
          paramJsonReader.skipValue();
        } else {
          locala.b(Base64.decode(paramJsonReader.nextString(), 2));
        }
      }
      else {
        locala.c(paramJsonReader.nextString());
      }
    }
    paramJsonReader.endObject();
    return locala.a();
  }
  
  /* Error */
  public B F(String paramString)
  {
    // Byte code:
    //   0: new 45	android/util/JsonReader
    //   3: astore_2
    //   4: new 896	java/io/StringReader
    //   7: astore_3
    //   8: aload_3
    //   9: aload_1
    //   10: invokespecial 899	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   13: aload_2
    //   14: aload_3
    //   15: invokespecial 902	android/util/JsonReader:<init>	(Ljava/io/Reader;)V
    //   18: aload_2
    //   19: invokestatic 904	K3/h:C	(Landroid/util/JsonReader;)LJ3/B;
    //   22: astore_1
    //   23: aload_2
    //   24: invokevirtual 907	android/util/JsonReader:close	()V
    //   27: aload_1
    //   28: areturn
    //   29: astore_1
    //   30: goto +19 -> 49
    //   33: astore_1
    //   34: aload_2
    //   35: invokevirtual 907	android/util/JsonReader:close	()V
    //   38: goto +9 -> 47
    //   41: astore_2
    //   42: aload_1
    //   43: aload_2
    //   44: invokevirtual 913	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   47: aload_1
    //   48: athrow
    //   49: new 915	java/io/IOException
    //   52: dup
    //   53: aload_1
    //   54: invokespecial 917	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	h
    //   0	58	1	paramString	String
    //   3	32	2	localJsonReader	JsonReader
    //   41	3	2	localThrowable	Throwable
    //   7	8	3	localStringReader	java.io.StringReader
    // Exception table:
    //   from	to	target	type
    //   0	18	29	java/lang/IllegalStateException
    //   23	27	29	java/lang/IllegalStateException
    //   42	47	29	java/lang/IllegalStateException
    //   47	49	29	java/lang/IllegalStateException
    //   18	23	33	finally
    //   34	38	41	finally
  }
  
  public String G(B paramB)
  {
    return a.a(paramB);
  }
  
  /* Error */
  public B.e.d h(String paramString)
  {
    // Byte code:
    //   0: new 45	android/util/JsonReader
    //   3: astore_2
    //   4: new 896	java/io/StringReader
    //   7: astore_3
    //   8: aload_3
    //   9: aload_1
    //   10: invokespecial 899	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   13: aload_2
    //   14: aload_3
    //   15: invokespecial 902	android/util/JsonReader:<init>	(Ljava/io/Reader;)V
    //   18: aload_2
    //   19: invokestatic 347	K3/h:p	(Landroid/util/JsonReader;)LJ3/B$e$d;
    //   22: astore_1
    //   23: aload_2
    //   24: invokevirtual 907	android/util/JsonReader:close	()V
    //   27: aload_1
    //   28: areturn
    //   29: astore_1
    //   30: goto +19 -> 49
    //   33: astore_1
    //   34: aload_2
    //   35: invokevirtual 907	android/util/JsonReader:close	()V
    //   38: goto +9 -> 47
    //   41: astore_2
    //   42: aload_1
    //   43: aload_2
    //   44: invokevirtual 913	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   47: aload_1
    //   48: athrow
    //   49: new 915	java/io/IOException
    //   52: dup
    //   53: aload_1
    //   54: invokespecial 917	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	h
    //   0	58	1	paramString	String
    //   3	32	2	localJsonReader	JsonReader
    //   41	3	2	localThrowable	Throwable
    //   7	8	3	localStringReader	java.io.StringReader
    // Exception table:
    //   from	to	target	type
    //   0	18	29	java/lang/IllegalStateException
    //   23	27	29	java/lang/IllegalStateException
    //   42	47	29	java/lang/IllegalStateException
    //   47	49	29	java/lang/IllegalStateException
    //   18	23	33	finally
    //   34	38	41	finally
  }
  
  public String i(B.e.d paramd)
  {
    return a.a(paramd);
  }
  
  public static abstract interface a
  {
    public abstract Object a(JsonReader paramJsonReader);
  }
}

/* Location:
 * Qualified Name:     K3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */