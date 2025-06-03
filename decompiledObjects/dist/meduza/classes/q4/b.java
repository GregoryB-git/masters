package q4;

import g;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import v5.t;

public final class b
  extends e9.a
{
  public final p4.a i(p4.d paramd, ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get();
    Object localObject1 = null;
    paramd = (p4.d)localObject1;
    if (i == 116)
    {
      t localt = new t(paramByteBuffer.array(), paramByteBuffer.limit());
      localt.m(12);
      int j = localt.g(12);
      int k = localt.d();
      localt.m(44);
      localt.n(localt.g(12));
      localt.m(16);
      ArrayList localArrayList = new ArrayList();
      while (localt.d() < k + j - 4)
      {
        localt.m(48);
        int m = localt.g(8);
        localt.m(4);
        i = localt.g(12);
        int n = localt.d() + i;
        paramd = null;
        Object localObject3;
        for (paramByteBuffer = paramd; localt.d() < n; paramByteBuffer = (ByteBuffer)localObject3)
        {
          i = localt.g(8);
          int i1 = localt.g(8);
          int i2 = localt.d() + i1;
          Object localObject2;
          if (i == 2)
          {
            i = localt.g(16);
            localt.m(8);
            localObject2 = paramd;
            localObject3 = paramByteBuffer;
            if (i == 3)
            {
              localObject2 = paramd;
              localObject3 = paramByteBuffer;
              if (localt.d() < i2)
              {
                i = localt.g(8);
                paramd = n7.d.a;
                localObject2 = new byte[i];
                localt.i((byte[])localObject2, i);
                localObject2 = new String((byte[])localObject2, paramd);
                i1 = localt.g(8);
                for (i = 0;; i++)
                {
                  paramd = (p4.d)localObject2;
                  if (i >= i1) {
                    break;
                  }
                  localt.n(localt.g(8));
                }
              }
            }
          }
          else
          {
            localObject2 = paramd;
            localObject3 = paramByteBuffer;
            if (i == 21)
            {
              paramByteBuffer = n7.d.a;
              localObject2 = new byte[i1];
              localt.i((byte[])localObject2, i1);
              localObject3 = new String((byte[])localObject2, paramByteBuffer);
              localObject2 = paramd;
            }
          }
          localt.k(i2 * 8);
          paramd = (p4.d)localObject2;
        }
        localt.k(n * 8);
        if ((paramd != null) && (paramByteBuffer != null)) {
          localArrayList.add(new a(m, g.d(paramd, paramByteBuffer)));
        }
      }
      if (localArrayList.isEmpty()) {
        paramd = (p4.d)localObject1;
      } else {
        paramd = new p4.a(localArrayList);
      }
    }
    return paramd;
  }
}

/* Location:
 * Qualified Name:     q4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */