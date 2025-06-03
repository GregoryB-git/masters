package ma;

import f;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  implements s0
{
  public int memoizedHashCode = 0;
  
  public static void k(List paramList, a0.d paramd)
  {
    Object localObject = a0.a;
    paramList.getClass();
    int i;
    int j;
    if ((paramList instanceof h0))
    {
      localObject = ((h0)paramList).d();
      paramList = (h0)paramd;
      i = paramd.size();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramd = ((Iterator)localObject).next();
        if (paramd == null)
        {
          paramd = f.l("Element at index ");
          paramd.append(paramList.size() - i);
          paramd.append(" is null.");
          paramd = paramd.toString();
          j = paramList.size();
          for (;;)
          {
            j--;
            if (j < i) {
              break;
            }
            paramList.remove(j);
          }
          throw new NullPointerException(paramd);
        }
        if ((paramd instanceof h)) {
          paramList.v((h)paramd);
        } else {
          paramList.add((String)paramd);
        }
      }
    }
    if ((paramList instanceof c1))
    {
      paramd.addAll(paramList);
    }
    else
    {
      if ((paramd instanceof ArrayList))
      {
        localObject = (ArrayList)paramd;
        j = paramd.size();
        ((ArrayList)localObject).ensureCapacity(paramList.size() + j);
      }
      i = paramd.size();
      localObject = paramList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramList = ((Iterator)localObject).next();
        if (paramList == null)
        {
          paramList = f.l("Element at index ");
          paramList.append(paramd.size() - i);
          paramList.append(" is null.");
          paramList = paramList.toString();
          j = paramd.size();
          for (;;)
          {
            j--;
            if (j < i) {
              break;
            }
            paramd.remove(j);
          }
          throw new NullPointerException(paramList);
        }
        paramd.add(paramList);
      }
    }
  }
  
  private String n(String paramString)
  {
    StringBuilder localStringBuilder = f.l("Serializing ");
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append(" to a ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" threw an IOException (should never happen).");
    return localStringBuilder.toString();
  }
  
  public final h.h c()
  {
    try
    {
      int i = ((w)this).m(null);
      Object localObject1 = h.b;
      localObject1 = new byte[i];
      Object localObject2 = k.c;
      localObject2 = new ma/k$b;
      ((k.b)localObject2).<init>((byte[])localObject1, 0, i);
      ((w)this).i((k)localObject2);
      if (((k.b)localObject2).p0() == 0) {
        return new h.h((byte[])localObject1);
      }
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Did not write as much data as expected.");
      throw ((Throwable)localObject1);
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(n("ByteString"), localIOException);
    }
  }
  
  public final void g(OutputStream paramOutputStream)
  {
    w localw = (w)this;
    int i = localw.m(null);
    Logger localLogger = k.c;
    int j = i;
    if (i > 4096) {
      j = 4096;
    }
    paramOutputStream = new k.d(paramOutputStream, j);
    localw.i(paramOutputStream);
    if (g > 0) {
      paramOutputStream.u0();
    }
  }
  
  public final byte[] j()
  {
    try
    {
      int i = ((w)this).m(null);
      Object localObject1 = new byte[i];
      Object localObject2 = k.c;
      localObject2 = new ma/k$b;
      ((k.b)localObject2).<init>((byte[])localObject1, 0, i);
      ((w)this).i((k)localObject2);
      if (((k.b)localObject2).p0() == 0) {
        return (byte[])localObject1;
      }
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Did not write as much data as expected.");
      throw ((Throwable)localObject1);
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(n("byte array"), localIOException);
    }
  }
  
  int l()
  {
    throw new UnsupportedOperationException();
  }
  
  public int m(i1 parami1)
  {
    int i = l();
    int j = i;
    if (i == -1)
    {
      j = parami1.e(this);
      o(j);
    }
    return j;
  }
  
  void o(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public static abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
    implements s0.a
  {}
}

/* Location:
 * Qualified Name:     ma.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */