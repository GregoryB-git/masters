package a1;

import F0.K;
import F0.W;
import F0.W.a;
import X2.v;
import d0.q;
import d0.q.b;
import d0.x;
import g0.a;
import g0.z;
import java.util.Arrays;

public final class h
  extends i
{
  public static final byte[] o = { 79, 112, 117, 115, 72, 101, 97, 100 };
  public static final byte[] p = { 79, 112, 117, 115, 84, 97, 103, 115 };
  public boolean n;
  
  public static boolean n(z paramz, byte[] paramArrayOfByte)
  {
    if (paramz.a() < paramArrayOfByte.length) {
      return false;
    }
    int i = paramz.f();
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    paramz.l(arrayOfByte, 0, paramArrayOfByte.length);
    paramz.T(i);
    return Arrays.equals(arrayOfByte, paramArrayOfByte);
  }
  
  public static boolean o(z paramz)
  {
    return n(paramz, o);
  }
  
  public long f(z paramz)
  {
    return c(K.e(paramz.e()));
  }
  
  public boolean i(z paramz, long paramLong, i.b paramb)
  {
    int i;
    if (n(paramz, o))
    {
      paramz = Arrays.copyOf(paramz.e(), paramz.g());
      i = K.c(paramz);
      paramz = K.a(paramz);
      if (a != null) {
        return true;
      }
    }
    for (paramz = new q.b().o0("audio/opus").N(i).p0(48000).b0(paramz);; paramz = a.a().h0(paramz.b(a.k)))
    {
      a = paramz.K();
      return true;
      byte[] arrayOfByte = p;
      if (!n(paramz, arrayOfByte)) {
        break;
      }
      a.h(a);
      if (n) {
        return true;
      }
      n = true;
      paramz.U(arrayOfByte.length);
      paramz = W.d(v.V(kb));
      if (paramz == null) {
        return true;
      }
    }
    a.h(a);
    return false;
  }
  
  public void l(boolean paramBoolean)
  {
    super.l(paramBoolean);
    if (paramBoolean) {
      n = false;
    }
  }
}

/* Location:
 * Qualified Name:     a1.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */