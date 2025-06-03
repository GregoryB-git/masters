import ec.i;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class j
  extends StandardMessageCodec
{
  public final Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
  {
    i.e(paramByteBuffer, "buffer");
    Object localObject1 = null;
    Object localObject2 = null;
    if (paramByte == -127)
    {
      paramByteBuffer = readValue(paramByteBuffer);
      if ((paramByteBuffer instanceof List)) {
        paramByteBuffer = (List)paramByteBuffer;
      } else {
        paramByteBuffer = null;
      }
      if (paramByteBuffer != null) {
        localObject2 = new b((Boolean)paramByteBuffer.get(0));
      }
      return localObject2;
    }
    if (paramByte == -126)
    {
      paramByteBuffer = readValue(paramByteBuffer);
      if ((paramByteBuffer instanceof List)) {
        paramByteBuffer = (List)paramByteBuffer;
      } else {
        paramByteBuffer = null;
      }
      localObject2 = localObject1;
      if (paramByteBuffer != null) {
        localObject2 = new a((Boolean)paramByteBuffer.get(0));
      }
      return localObject2;
    }
    return super.readValueOfType(paramByte, paramByteBuffer);
  }
  
  public final void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
  {
    i.e(paramByteArrayOutputStream, "stream");
    if ((paramObject instanceof b))
    {
      paramByteArrayOutputStream.write(129);
      paramObject = va.a.f(a);
    }
    else
    {
      if (!(paramObject instanceof a)) {
        break label68;
      }
      paramByteArrayOutputStream.write(130);
      paramObject = va.a.f(a);
    }
    writeValue(paramByteArrayOutputStream, paramObject);
    return;
    label68:
    super.writeValue(paramByteArrayOutputStream, paramObject);
  }
}

/* Location:
 * Qualified Name:     j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */