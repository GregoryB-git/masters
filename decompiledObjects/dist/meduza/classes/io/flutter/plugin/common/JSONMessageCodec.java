package io.flutter.plugin.common;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class JSONMessageCodec
  implements MessageCodec<Object>
{
  public static final JSONMessageCodec INSTANCE = new JSONMessageCodec();
  
  public Object decodeMessage(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer == null) {
      return null;
    }
    try
    {
      Object localObject = StringCodec.INSTANCE.decodeMessage(paramByteBuffer);
      paramByteBuffer = new org/json/JSONTokener;
      paramByteBuffer.<init>((String)localObject);
      localObject = paramByteBuffer.nextValue();
      if (!paramByteBuffer.more()) {
        return localObject;
      }
      paramByteBuffer = new java/lang/IllegalArgumentException;
      paramByteBuffer.<init>("Invalid JSON");
      throw paramByteBuffer;
    }
    catch (JSONException paramByteBuffer)
    {
      throw new IllegalArgumentException("Invalid JSON", paramByteBuffer);
    }
  }
  
  public ByteBuffer encodeMessage(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    paramObject = JSONUtil.wrap(paramObject);
    StringCodec localStringCodec;
    if ((paramObject instanceof String)) {
      localStringCodec = StringCodec.INSTANCE;
    }
    for (paramObject = JSONObject.quote((String)paramObject);; paramObject = paramObject.toString())
    {
      return localStringCodec.encodeMessage((String)paramObject);
      localStringCodec = StringCodec.INSTANCE;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.JSONMessageCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */