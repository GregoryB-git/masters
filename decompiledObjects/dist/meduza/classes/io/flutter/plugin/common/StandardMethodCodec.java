package io.flutter.plugin.common;

import io.flutter.Log;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class StandardMethodCodec
  implements MethodCodec
{
  public static final StandardMethodCodec INSTANCE = new StandardMethodCodec(StandardMessageCodec.INSTANCE);
  private final StandardMessageCodec messageCodec;
  
  public StandardMethodCodec(StandardMessageCodec paramStandardMessageCodec)
  {
    messageCodec = paramStandardMessageCodec;
  }
  
  public Object decodeEnvelope(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.order(ByteOrder.nativeOrder());
    int i = paramByteBuffer.get();
    if (i != 0)
    {
      if (i != 1) {
        break label117;
      }
    }
    else
    {
      localObject1 = messageCodec.readValue(paramByteBuffer);
      if (!paramByteBuffer.hasRemaining()) {
        return localObject1;
      }
    }
    Object localObject2 = messageCodec.readValue(paramByteBuffer);
    Object localObject1 = messageCodec.readValue(paramByteBuffer);
    Object localObject3 = messageCodec.readValue(paramByteBuffer);
    if (((localObject2 instanceof String)) && ((localObject1 == null) || ((localObject1 instanceof String))) && (!paramByteBuffer.hasRemaining())) {
      throw new FlutterException((String)localObject2, (String)localObject1, localObject3);
    }
    label117:
    throw new IllegalArgumentException("Envelope corrupted");
  }
  
  public MethodCall decodeMethodCall(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.order(ByteOrder.nativeOrder());
    Object localObject1 = messageCodec.readValue(paramByteBuffer);
    Object localObject2 = messageCodec.readValue(paramByteBuffer);
    if (((localObject1 instanceof String)) && (!paramByteBuffer.hasRemaining())) {
      return new MethodCall((String)localObject1, localObject2);
    }
    throw new IllegalArgumentException("Method call corrupted");
  }
  
  public ByteBuffer encodeErrorEnvelope(String paramString1, String paramString2, Object paramObject)
  {
    StandardMessageCodec.ExposedByteArrayOutputStream localExposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
    localExposedByteArrayOutputStream.write(1);
    messageCodec.writeValue(localExposedByteArrayOutputStream, paramString1);
    messageCodec.writeValue(localExposedByteArrayOutputStream, paramString2);
    if ((paramObject instanceof Throwable)) {
      messageCodec.writeValue(localExposedByteArrayOutputStream, Log.getStackTraceString((Throwable)paramObject));
    } else {
      messageCodec.writeValue(localExposedByteArrayOutputStream, paramObject);
    }
    paramString1 = ByteBuffer.allocateDirect(localExposedByteArrayOutputStream.size());
    paramString1.put(localExposedByteArrayOutputStream.buffer(), 0, localExposedByteArrayOutputStream.size());
    return paramString1;
  }
  
  public ByteBuffer encodeErrorEnvelopeWithStacktrace(String paramString1, String paramString2, Object paramObject, String paramString3)
  {
    StandardMessageCodec.ExposedByteArrayOutputStream localExposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
    localExposedByteArrayOutputStream.write(1);
    messageCodec.writeValue(localExposedByteArrayOutputStream, paramString1);
    messageCodec.writeValue(localExposedByteArrayOutputStream, paramString2);
    if ((paramObject instanceof Throwable)) {
      messageCodec.writeValue(localExposedByteArrayOutputStream, Log.getStackTraceString((Throwable)paramObject));
    } else {
      messageCodec.writeValue(localExposedByteArrayOutputStream, paramObject);
    }
    messageCodec.writeValue(localExposedByteArrayOutputStream, paramString3);
    paramString1 = ByteBuffer.allocateDirect(localExposedByteArrayOutputStream.size());
    paramString1.put(localExposedByteArrayOutputStream.buffer(), 0, localExposedByteArrayOutputStream.size());
    return paramString1;
  }
  
  public ByteBuffer encodeMethodCall(MethodCall paramMethodCall)
  {
    StandardMessageCodec.ExposedByteArrayOutputStream localExposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
    messageCodec.writeValue(localExposedByteArrayOutputStream, method);
    messageCodec.writeValue(localExposedByteArrayOutputStream, arguments);
    paramMethodCall = ByteBuffer.allocateDirect(localExposedByteArrayOutputStream.size());
    paramMethodCall.put(localExposedByteArrayOutputStream.buffer(), 0, localExposedByteArrayOutputStream.size());
    return paramMethodCall;
  }
  
  public ByteBuffer encodeSuccessEnvelope(Object paramObject)
  {
    StandardMessageCodec.ExposedByteArrayOutputStream localExposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
    localExposedByteArrayOutputStream.write(0);
    messageCodec.writeValue(localExposedByteArrayOutputStream, paramObject);
    paramObject = ByteBuffer.allocateDirect(localExposedByteArrayOutputStream.size());
    ((ByteBuffer)paramObject).put(localExposedByteArrayOutputStream.buffer(), 0, localExposedByteArrayOutputStream.size());
    return (ByteBuffer)paramObject;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.StandardMethodCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */