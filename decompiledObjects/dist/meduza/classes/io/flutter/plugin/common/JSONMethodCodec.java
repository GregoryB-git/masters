package io.flutter.plugin.common;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class JSONMethodCodec
  implements MethodCodec
{
  public static final JSONMethodCodec INSTANCE = new JSONMethodCodec();
  
  public Object decodeEnvelope(ByteBuffer paramByteBuffer)
  {
    try
    {
      paramByteBuffer = JSONMessageCodec.INSTANCE.decodeMessage(paramByteBuffer);
      if ((paramByteBuffer instanceof JSONArray))
      {
        Object localObject1 = (JSONArray)paramByteBuffer;
        if (((JSONArray)localObject1).length() == 1) {
          return unwrapNull(((JSONArray)localObject1).opt(0));
        }
        if (((JSONArray)localObject1).length() == 3)
        {
          localObject2 = ((JSONArray)localObject1).get(0);
          localObject3 = unwrapNull(((JSONArray)localObject1).opt(1));
          localObject1 = unwrapNull(((JSONArray)localObject1).opt(2));
          if (((localObject2 instanceof String)) && ((localObject3 == null) || ((localObject3 instanceof String))))
          {
            paramByteBuffer = new io/flutter/plugin/common/FlutterException;
            paramByteBuffer.<init>((String)localObject2, (String)localObject3, localObject1);
            throw paramByteBuffer;
          }
        }
      }
      Object localObject3 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Invalid envelope: ");
      ((StringBuilder)localObject2).append(paramByteBuffer);
      ((IllegalArgumentException)localObject3).<init>(((StringBuilder)localObject2).toString());
      throw ((Throwable)localObject3);
    }
    catch (JSONException paramByteBuffer)
    {
      throw new IllegalArgumentException("Invalid JSON", paramByteBuffer);
    }
  }
  
  public MethodCall decodeMethodCall(ByteBuffer paramByteBuffer)
  {
    try
    {
      paramByteBuffer = JSONMessageCodec.INSTANCE.decodeMessage(paramByteBuffer);
      if ((paramByteBuffer instanceof JSONObject))
      {
        localObject1 = (JSONObject)paramByteBuffer;
        localObject2 = ((JSONObject)localObject1).get("method");
        localObject1 = unwrapNull(((JSONObject)localObject1).opt("args"));
        if ((localObject2 instanceof String)) {
          return new MethodCall((String)localObject2, localObject1);
        }
      }
      Object localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Invalid method call: ");
      ((StringBuilder)localObject2).append(paramByteBuffer);
      ((IllegalArgumentException)localObject1).<init>(((StringBuilder)localObject2).toString());
      throw ((Throwable)localObject1);
    }
    catch (JSONException paramByteBuffer)
    {
      throw new IllegalArgumentException("Invalid JSON", paramByteBuffer);
    }
  }
  
  public ByteBuffer encodeErrorEnvelope(String paramString1, String paramString2, Object paramObject)
  {
    return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(paramString1).put(JSONUtil.wrap(paramString2)).put(JSONUtil.wrap(paramObject)));
  }
  
  public ByteBuffer encodeErrorEnvelopeWithStacktrace(String paramString1, String paramString2, Object paramObject, String paramString3)
  {
    return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(paramString1).put(JSONUtil.wrap(paramString2)).put(JSONUtil.wrap(paramObject)).put(JSONUtil.wrap(paramString3)));
  }
  
  public ByteBuffer encodeMethodCall(MethodCall paramMethodCall)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("method", method);
      localJSONObject.put("args", JSONUtil.wrap(arguments));
      paramMethodCall = JSONMessageCodec.INSTANCE.encodeMessage(localJSONObject);
      return paramMethodCall;
    }
    catch (JSONException paramMethodCall)
    {
      throw new IllegalArgumentException("Invalid JSON", paramMethodCall);
    }
  }
  
  public ByteBuffer encodeSuccessEnvelope(Object paramObject)
  {
    return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(JSONUtil.wrap(paramObject)));
  }
  
  public Object unwrapNull(Object paramObject)
  {
    Object localObject = paramObject;
    if (paramObject == JSONObject.NULL) {
      localObject = null;
    }
    return localObject;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.JSONMethodCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */