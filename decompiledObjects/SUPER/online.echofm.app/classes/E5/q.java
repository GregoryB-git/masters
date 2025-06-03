package E5;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import t5.b;

public final class q
  implements l
{
  public static final q b = new q(p.a);
  public final p a;
  
  public q(p paramp)
  {
    a = paramp;
  }
  
  public ByteBuffer a(Object paramObject)
  {
    p.a locala = new p.a();
    locala.write(0);
    a.p(locala, paramObject);
    paramObject = ByteBuffer.allocateDirect(locala.size());
    ((ByteBuffer)paramObject).put(locala.a(), 0, locala.size());
    return (ByteBuffer)paramObject;
  }
  
  public ByteBuffer b(String paramString1, String paramString2, Object paramObject, String paramString3)
  {
    p.a locala = new p.a();
    locala.write(1);
    a.p(locala, paramString1);
    a.p(locala, paramString2);
    if ((paramObject instanceof Throwable)) {
      a.p(locala, b.d((Throwable)paramObject));
    } else {
      a.p(locala, paramObject);
    }
    a.p(locala, paramString3);
    paramString1 = ByteBuffer.allocateDirect(locala.size());
    paramString1.put(locala.a(), 0, locala.size());
    return paramString1;
  }
  
  public ByteBuffer c(j paramj)
  {
    p.a locala = new p.a();
    a.p(locala, a);
    a.p(locala, b);
    paramj = ByteBuffer.allocateDirect(locala.size());
    paramj.put(locala.a(), 0, locala.size());
    return paramj;
  }
  
  public ByteBuffer d(String paramString1, String paramString2, Object paramObject)
  {
    p.a locala = new p.a();
    locala.write(1);
    a.p(locala, paramString1);
    a.p(locala, paramString2);
    if ((paramObject instanceof Throwable)) {
      a.p(locala, b.d((Throwable)paramObject));
    } else {
      a.p(locala, paramObject);
    }
    paramString1 = ByteBuffer.allocateDirect(locala.size());
    paramString1.put(locala.a(), 0, locala.size());
    return paramString1;
  }
  
  public j e(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.order(ByteOrder.nativeOrder());
    Object localObject1 = a.f(paramByteBuffer);
    Object localObject2 = a.f(paramByteBuffer);
    if (((localObject1 instanceof String)) && (!paramByteBuffer.hasRemaining())) {
      return new j((String)localObject1, localObject2);
    }
    throw new IllegalArgumentException("Method call corrupted");
  }
  
  public Object f(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.order(ByteOrder.nativeOrder());
    int i = paramByteBuffer.get();
    if (i != 0)
    {
      if (i != 1) {
        break label118;
      }
    }
    else
    {
      localObject1 = a.f(paramByteBuffer);
      if (!paramByteBuffer.hasRemaining()) {
        return localObject1;
      }
    }
    Object localObject1 = a.f(paramByteBuffer);
    Object localObject2 = a.f(paramByteBuffer);
    Object localObject3 = a.f(paramByteBuffer);
    if (((localObject1 instanceof String)) && ((localObject2 == null) || ((localObject2 instanceof String))) && (!paramByteBuffer.hasRemaining())) {
      throw new e((String)localObject1, (String)localObject2, localObject3);
    }
    label118:
    throw new IllegalArgumentException("Envelope corrupted");
  }
}

/* Location:
 * Qualified Name:     E5.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */