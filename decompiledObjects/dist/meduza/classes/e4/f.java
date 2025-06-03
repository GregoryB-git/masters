package e4;

import o7.l0;
import o7.t;
import o7.t.a;
import o7.t.b;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.m;
import v5.u;

public final class f
  implements a
{
  public final t<a> a;
  public final int b;
  
  public f(int paramInt, l0 paraml0)
  {
    b = paramInt;
    a = paraml0;
  }
  
  public static f b(int paramInt, u paramu)
  {
    t.a locala = new t.a();
    int i = c;
    int k;
    for (int j = -2; c - b > 8; j = k)
    {
      k = paramu.i();
      int m = paramu.i();
      m = b + m;
      paramu.F(m);
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (k == 1414744396)
      {
        localObject1 = b(paramu.i(), paramu);
      }
      else
      {
        int n;
        int i1;
        int i2;
        int i3;
        switch (k)
        {
        default: 
          break;
        case 1852994675: 
          localObject1 = new h(paramu.s(c - b));
          break;
        case 1752331379: 
          k = paramu.i();
          paramu.H(12);
          paramu.i();
          n = paramu.i();
          i1 = paramu.i();
          paramu.H(4);
          i2 = paramu.i();
          i3 = paramu.i();
          paramu.H(8);
        case 1751742049: 
        case 1718776947: 
          for (localObject1 = new d(k, n, i1, i2, i3);; localObject1 = new g(new i0((i0.a)localObject2)))
          {
            break label831;
            k = paramu.i();
            paramu.H(8);
            i1 = paramu.i();
            i2 = paramu.i();
            paramu.H(4);
            paramu.i();
            paramu.H(12);
            localObject1 = new c(k, i1, i2);
            break label831;
            if (j != 2) {
              break;
            }
            paramu.H(4);
            i1 = paramu.i();
            i2 = paramu.i();
            paramu.H(4);
            k = paramu.i();
            switch (k)
            {
            default: 
              localObject1 = null;
              break;
            case 1196444237: 
            case 1735420525: 
              localObject1 = "video/mjpeg";
              break;
            case 859066445: 
              localObject1 = "video/mp43";
              break;
            case 842289229: 
              localObject1 = "video/mp42";
              break;
            case 826496577: 
            case 828601953: 
            case 875967048: 
              localObject1 = "video/avc";
              break;
            case 808802372: 
            case 877677894: 
            case 1145656883: 
            case 1145656920: 
            case 1482049860: 
            case 1684633208: 
            case 2021026148: 
              localObject1 = "video/mp4v-es";
            }
            if (localObject1 == null)
            {
              f.p("Ignoring track with unsupported compression ", k, "StreamFormatChunk");
              break label828;
            }
            localObject2 = new i0.a();
            p = i1;
            q = i2;
            k = ((String)localObject1);
          }
          if (j == 1)
          {
            k = paramu.n();
            if (k != 1)
            {
              if (k != 85)
              {
                if (k != 255)
                {
                  if (k != 8192)
                  {
                    if (k != 8193) {
                      localObject1 = null;
                    } else {
                      localObject1 = "audio/vnd.dts";
                    }
                  }
                  else {
                    localObject1 = "audio/ac3";
                  }
                }
                else {
                  localObject1 = "audio/mp4a-latm";
                }
              }
              else {
                localObject1 = "audio/mpeg";
              }
            }
            else {
              localObject1 = "audio/raw";
            }
            if (localObject1 == null)
            {
              f.p("Ignoring track with unsupported format tag ", k, "StreamFormatChunk");
            }
            else
            {
              i1 = paramu.n();
              i2 = paramu.i();
              paramu.H(6);
              i3 = e0.v(paramu.A());
              k = paramu.n();
              localObject2 = new byte[k];
              paramu.d((byte[])localObject2, 0, k);
              localObject3 = new i0.a();
              k = ((String)localObject1);
              x = i1;
              y = i2;
              if (("audio/raw".equals(localObject1)) && (i3 != 0)) {
                z = i3;
              }
              if (("audio/mp4a-latm".equals(localObject1)) && (k > 0)) {
                m = t.t(localObject2);
              }
              localObject1 = new g(new i0((i0.a)localObject3));
              break label831;
            }
          }
          else
          {
            localObject1 = f.l("Ignoring strf box for unsupported track type: ");
            ((StringBuilder)localObject1).append(e0.A(j));
            m.f("StreamFormatChunk", ((StringBuilder)localObject1).toString());
          }
          break;
        }
        label828:
        localObject1 = null;
      }
      label831:
      k = j;
      if (localObject1 != null)
      {
        if (((a)localObject1).getType() == 1752331379)
        {
          localObject2 = (d)localObject1;
          j = a;
          if (j != 1935960438)
          {
            if (j != 1935963489)
            {
              if (j != 1937012852)
              {
                localObject3 = f.l("Found unsupported streamType fourCC: ");
                ((StringBuilder)localObject3).append(Integer.toHexString(a));
                m.f("AviStreamHeaderChunk", ((StringBuilder)localObject3).toString());
                j = -1;
              }
              else
              {
                j = 3;
              }
            }
            else {
              j = 1;
            }
          }
          else {
            j = 2;
          }
        }
        locala.c(localObject1);
        k = j;
      }
      paramu.G(m);
      paramu.F(i);
    }
    return new f(paramInt, locala.e());
  }
  
  public final <T extends a> T a(Class<T> paramClass)
  {
    t.b localb = a.r(0);
    while (localb.hasNext())
    {
      a locala = (a)localb.next();
      if (locala.getClass() == paramClass) {
        return locala;
      }
    }
    return null;
  }
  
  public final int getType()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     e4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */