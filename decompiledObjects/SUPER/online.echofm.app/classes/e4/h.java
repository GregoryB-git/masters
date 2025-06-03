package e4;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

public class h
{
  public DataInputStream a = null;
  public c b = null;
  public d c = null;
  public byte[] d = new byte[112];
  public a.b e;
  public volatile boolean f = false;
  
  public h(c paramc)
  {
    b = paramc;
  }
  
  public final void a(boolean paramBoolean, byte paramByte, byte[] paramArrayOfByte)
  {
    if (paramByte == 9)
    {
      if (paramBoolean) {
        c(paramArrayOfByte);
      } else {
        throw new e("PING must not fragment across frames");
      }
    }
    else
    {
      a.b localb = e;
      if ((localb != null) && (paramByte != 0)) {
        throw new e("Failed to continue outstanding frame");
      }
      if ((localb == null) && (paramByte == 0)) {
        throw new e("Received continuing frame, but there's nothing to continue");
      }
      if (localb == null) {
        e = a.a(paramByte);
      }
      if (!e.a(paramArrayOfByte)) {
        break label151;
      }
      if (paramBoolean)
      {
        paramArrayOfByte = e.b();
        e = null;
        if (paramArrayOfByte != null) {
          c.f(paramArrayOfByte);
        } else {
          throw new e("Failed to decode whole message");
        }
      }
    }
    return;
    label151:
    throw new e("Failed to decode frame");
  }
  
  public final void b(e parame)
  {
    h();
    b.k(parame);
  }
  
  public final void c(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length <= 125)
    {
      b.m(paramArrayOfByte);
      return;
    }
    throw new e("PING frame too long");
  }
  
  public final long d(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[paramInt] << 56) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 48) + ((paramArrayOfByte[(paramInt + 2)] & 0xFF) << 40) + ((paramArrayOfByte[(paramInt + 3)] & 0xFF) << 32) + ((paramArrayOfByte[(paramInt + 4)] & 0xFF) << 24) + ((paramArrayOfByte[(paramInt + 5)] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt + 6)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 7)] & 0xFF);
  }
  
  public final int e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.readFully(paramArrayOfByte, paramInt1, paramInt2);
    return paramInt2;
  }
  
  public void f()
  {
    c = b.g();
    for (;;)
    {
      if (!f) {}
      label311:
      try
      {
        int i;
        boolean bool;
        byte b1;
        long l;
        try
        {
          i = e(d, 0, 1);
          byte[] arrayOfByte = d;
          j = arrayOfByte[0];
          if ((j & 0x80) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          if ((j & 0x70) != 0) {
            break label311;
          }
          b1 = (byte)(j & 0xF);
          j = i + e(arrayOfByte, i, 1);
          arrayOfByte = d;
          i = arrayOfByte[1];
          if (i < 126)
          {
            l = i;
          }
          else if (i == 126)
          {
            e(arrayOfByte, j, 2);
            arrayOfByte = d;
            l = (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF;
          }
        }
        catch (e locale1)
        {
          break label323;
        }
        catch (IOException localIOException)
        {
          break label331;
        }
        if (i == 127)
        {
          i = e(localIOException, j, 8);
          l = d(d, j + i - 8);
        }
        else
        {
          l = 0L;
        }
        int j = (int)l;
        localObject = new byte[j];
        e((byte[])localObject, 0, j);
        if (b1 == 8)
        {
          b.l();
          continue;
        }
        if (b1 == 10) {
          continue;
        }
        if ((b1 != 1) && (b1 != 2) && (b1 != 9) && (b1 != 0))
        {
          e locale2 = new e4/e;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Unsupported opcode: ");
          ((StringBuilder)localObject).append(b1);
          locale2.<init>(((StringBuilder)localObject).toString());
          throw locale2;
        }
        a(bool, b1, (byte[])localObject);
      }
      catch (SocketTimeoutException localSocketTimeoutException) {}
      Object localObject = new e4/e;
      ((e)localObject).<init>("Invalid frame received");
      throw ((Throwable)localObject);
      label323:
      b((e)localObject);
      continue;
      label331:
      b(new e("IO Error", (Throwable)localObject));
      continue;
      return;
    }
  }
  
  public void g(DataInputStream paramDataInputStream)
  {
    a = paramDataInputStream;
  }
  
  public void h()
  {
    f = true;
  }
}

/* Location:
 * Qualified Name:     e4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */