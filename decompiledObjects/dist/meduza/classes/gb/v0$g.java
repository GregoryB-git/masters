package gb;

import eb.e1;
import f;
import g;

public enum v0$g
{
  public static final g[] d;
  public final int a;
  public final e1 b;
  
  static
  {
    Object localObject1 = e1.n;
    Object localObject2 = new g("NO_ERROR", 0, 0, (e1)localObject1);
    e1 locale1 = e1.m;
    g localg1 = new g("PROTOCOL_ERROR", 1, 1, locale1);
    g localg2 = new g("INTERNAL_ERROR", 2, 2, locale1);
    c = localg2;
    e = new g[] { localObject2, localg1, localg2, new g("FLOW_CONTROL_ERROR", 3, 3, locale1), new g("SETTINGS_TIMEOUT", 4, 4, locale1), new g("STREAM_CLOSED", 5, 5, locale1), new g("FRAME_SIZE_ERROR", 6, 6, locale1), new g("REFUSED_STREAM", 7, 7, (e1)localObject1), new g("CANCEL", 8, 8, e1.f), new g("COMPRESSION_ERROR", 9, 9, locale1), new g("CONNECT_ERROR", 10, 10, locale1), new g("ENHANCE_YOUR_CALM", 11, 11, e1.k.g("Bandwidth exhausted")), new g("INADEQUATE_SECURITY", 12, 12, e1.i.g("Permission denied as protocol is not secure enough to call")), new g("HTTP_1_1_REQUIRED", 13, 13, e1.g) };
    localObject1 = values();
    localObject2 = new g[(int)length1a + 1];
    int i = localObject1.length;
    for (int j = 0; j < i; j++)
    {
      locale1 = localObject1[j];
      localObject2[((int)a)] = locale1;
    }
    d = (g[])localObject2;
  }
  
  public v0$g(int paramInt, e1 parame1)
  {
    a = paramInt;
    ??? = f.l("HTTP/2 error code: ");
    ((StringBuilder)???).append(name());
    String str = ((StringBuilder)???).toString();
    ??? = str;
    if (b != null) {
      ??? = g.f(g.g(str, " ("), b, ")");
    }
    b = parame1.g((String)???);
  }
}

/* Location:
 * Qualified Name:     gb.v0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */