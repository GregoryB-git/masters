package H0;

import X2.v;
import d0.q;
import d0.q.b;
import g0.M;
import g0.o;
import g0.z;

public final class g
  implements a
{
  public final q a;
  
  public g(q paramq)
  {
    a = paramq;
  }
  
  public static String b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1196444237: 
    case 1735420525: 
      return "video/mjpeg";
    case 859066445: 
      return "video/mp43";
    case 842289229: 
      return "video/mp42";
    case 826496577: 
    case 828601953: 
    case 875967048: 
      return "video/avc";
    }
    return "video/mp4v-es";
  }
  
  public static String c(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 85)
      {
        if (paramInt != 255)
        {
          if (paramInt != 8192)
          {
            if (paramInt != 8193) {
              return null;
            }
            return "audio/vnd.dts";
          }
          return "audio/ac3";
        }
        return "audio/mp4a-latm";
      }
      return "audio/mpeg";
    }
    return "audio/raw";
  }
  
  public static a d(z paramz)
  {
    paramz.U(4);
    int i = paramz.t();
    int j = paramz.t();
    paramz.U(4);
    int k = paramz.t();
    paramz = b(k);
    if (paramz == null)
    {
      paramz = new StringBuilder();
      paramz.append("Ignoring track with unsupported compression ");
      paramz.append(k);
      o.h("StreamFormatChunk", paramz.toString());
      return null;
    }
    q.b localb = new q.b();
    localb.v0(i).Y(j).o0(paramz);
    return new g(localb.K());
  }
  
  public static a e(int paramInt, z paramz)
  {
    if (paramInt == 2) {
      return d(paramz);
    }
    if (paramInt == 1) {
      return f(paramz);
    }
    paramz = new StringBuilder();
    paramz.append("Ignoring strf box for unsupported track type: ");
    paramz.append(M.p0(paramInt));
    o.h("StreamFormatChunk", paramz.toString());
    return null;
  }
  
  public static a f(z paramz)
  {
    int i = paramz.y();
    String str = c(i);
    if (str == null)
    {
      paramz = new StringBuilder();
      paramz.append("Ignoring track with unsupported format tag ");
      paramz.append(i);
      o.h("StreamFormatChunk", paramz.toString());
      return null;
    }
    int j = paramz.y();
    int k = paramz.t();
    paramz.U(6);
    int m = M.e0(paramz.y());
    if (paramz.a() > 0) {
      i = paramz.y();
    } else {
      i = 0;
    }
    byte[] arrayOfByte = new byte[i];
    paramz.l(arrayOfByte, 0, i);
    paramz = new q.b();
    paramz.o0(str).N(j).p0(k);
    if (("audio/raw".equals(str)) && (m != 0)) {
      paramz.i0(m);
    }
    if (("audio/mp4a-latm".equals(str)) && (i > 0)) {
      paramz.b0(v.Z(arrayOfByte));
    }
    return new g(paramz.K());
  }
  
  public int a()
  {
    return 1718776947;
  }
}

/* Location:
 * Qualified Name:     H0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */