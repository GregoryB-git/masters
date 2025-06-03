package E5;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class f
  implements i
{
  public static final f a = new f();
  
  public ByteBuffer a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    paramObject = h.a(paramObject);
    r localr;
    if ((paramObject instanceof String)) {
      localr = r.b;
    }
    for (paramObject = JSONObject.quote((String)paramObject);; paramObject = paramObject.toString())
    {
      return localr.d((String)paramObject);
      localr = r.b;
    }
  }
  
  public Object b(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer == null) {
      return null;
    }
    try
    {
      Object localObject = r.b.c(paramByteBuffer);
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
}

/* Location:
 * Qualified Name:     E5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */