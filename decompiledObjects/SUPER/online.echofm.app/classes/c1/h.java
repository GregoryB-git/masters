package c1;

import d0.q;
import g1.b;
import i1.d;
import java.util.Objects;
import k1.g;

public final class h
  implements t.a
{
  public boolean a(q paramq)
  {
    paramq = n;
    boolean bool;
    if ((!Objects.equals(paramq, "text/x-ssa")) && (!Objects.equals(paramq, "text/vtt")) && (!Objects.equals(paramq, "application/x-mp4-vtt")) && (!Objects.equals(paramq, "application/x-subrip")) && (!Objects.equals(paramq, "application/x-quicktime-tx3g")) && (!Objects.equals(paramq, "application/pgs")) && (!Objects.equals(paramq, "application/dvbsubs")) && (!Objects.equals(paramq, "application/ttml+xml"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public t b(q paramq)
  {
    String str = n;
    if (str != null)
    {
      int i = str.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1693976202: 
        if (str.equals("application/ttml+xml")) {
          j = 7;
        }
        break;
      case 1668750253: 
        if (str.equals("application/x-subrip")) {
          j = 6;
        }
        break;
      case 822864842: 
        if (str.equals("text/x-ssa")) {
          j = 5;
        }
        break;
      case 691401887: 
        if (str.equals("application/x-quicktime-tx3g")) {
          j = 4;
        }
        break;
      case -1004728940: 
        if (str.equals("text/vtt")) {
          j = 3;
        }
        break;
      case -1026075066: 
        if (str.equals("application/x-mp4-vtt")) {
          j = 2;
        }
        break;
      case -1248334819: 
        if (str.equals("application/pgs")) {
          j = 1;
        }
        break;
      case -1351681404: 
        if (str.equals("application/dvbsubs")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        break;
      case 7: 
        return new d();
      case 6: 
        return new h1.a();
      case 5: 
        return new b(q);
      case 4: 
        return new j1.a(q);
      case 3: 
        return new g();
      case 2: 
        return new k1.a();
      case 1: 
        return new f1.a();
      case 0: 
        return new e1.a(q);
      }
    }
    paramq = new StringBuilder();
    paramq.append("Unsupported MIME type: ");
    paramq.append(str);
    throw new IllegalArgumentException(paramq.toString());
  }
  
  public int c(q paramq)
  {
    paramq = n;
    if (paramq != null)
    {
      int i = paramq.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1693976202: 
        if (paramq.equals("application/ttml+xml")) {
          j = 7;
        }
        break;
      case 1668750253: 
        if (paramq.equals("application/x-subrip")) {
          j = 6;
        }
        break;
      case 822864842: 
        if (paramq.equals("text/x-ssa")) {
          j = 5;
        }
        break;
      case 691401887: 
        if (paramq.equals("application/x-quicktime-tx3g")) {
          j = 4;
        }
        break;
      case -1004728940: 
        if (paramq.equals("text/vtt")) {
          j = 3;
        }
        break;
      case -1026075066: 
        if (paramq.equals("application/x-mp4-vtt")) {
          j = 2;
        }
        break;
      case -1248334819: 
        if (paramq.equals("application/pgs")) {
          j = 1;
        }
        break;
      case -1351681404: 
        if (paramq.equals("application/dvbsubs")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        break;
      case 5: 
      case 6: 
      case 7: 
        return 1;
      case 4: 
        return 2;
      case 3: 
        return 1;
      case 0: 
      case 1: 
      case 2: 
        return 2;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unsupported MIME type: ");
    localStringBuilder.append(paramq);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     c1.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */