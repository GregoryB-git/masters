package E0;

import d0.q;
import g0.M;
import g0.z;
import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import k0.Z0;
import k0.n;
import k0.v0;
import x0.x.b;

public final class b
  extends n
{
  public final i F = new i(1);
  public final z G = new z();
  public long H;
  public a I;
  public long J;
  
  public b()
  {
    super(6);
  }
  
  public void T()
  {
    i0();
  }
  
  public void W(long paramLong, boolean paramBoolean)
  {
    J = Long.MIN_VALUE;
    i0();
  }
  
  public int a(q paramq)
  {
    if ("application/x-camera-motion".equals(n)) {}
    for (int i = 4;; i = 0)
    {
      i = Z0.a(i);
      break;
    }
    return i;
  }
  
  public boolean c()
  {
    return p();
  }
  
  public void c0(q[] paramArrayOfq, long paramLong1, long paramLong2, x.b paramb)
  {
    H = paramLong2;
  }
  
  public String d()
  {
    return "CameraMotionRenderer";
  }
  
  public boolean e()
  {
    return true;
  }
  
  public void f(long paramLong1, long paramLong2)
  {
    while ((!p()) && (J < 100000L + paramLong1))
    {
      F.m();
      v0 localv0 = N();
      Object localObject = F;
      int i = 0;
      if ((e0(localv0, (i)localObject, 0) != -4) || (F.p())) {
        break;
      }
      paramLong2 = F.t;
      J = paramLong2;
      if (paramLong2 < P()) {
        i = 1;
      }
      if ((I != null) && (i == 0))
      {
        F.C();
        localObject = h0((ByteBuffer)M.i(F.r));
        if (localObject != null) {
          ((a)M.i(I)).a(J - H, (float[])localObject);
        }
      }
    }
  }
  
  public final float[] h0(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.remaining() != 16) {
      return null;
    }
    G.R(paramByteBuffer.array(), paramByteBuffer.limit());
    G.T(paramByteBuffer.arrayOffset() + 4);
    paramByteBuffer = new float[3];
    for (int i = 0; i < 3; i++) {
      paramByteBuffer[i] = Float.intBitsToFloat(G.t());
    }
    return paramByteBuffer;
  }
  
  public final void i0()
  {
    a locala = I;
    if (locala != null) {
      locala.h();
    }
  }
  
  public void t(int paramInt, Object paramObject)
  {
    if (paramInt == 8) {
      I = ((a)paramObject);
    } else {
      super.t(paramInt, paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     E0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */