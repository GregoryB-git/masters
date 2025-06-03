package io.flutter.plugins.sharedpreferences;

import ec.i;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

final class SharedPreferencesAsyncApiCodec
  extends StandardMessageCodec
{
  public static final SharedPreferencesAsyncApiCodec INSTANCE = new SharedPreferencesAsyncApiCodec();
  
  public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
  {
    i.e(paramByteBuffer, "buffer");
    if (paramByte == Byte.MIN_VALUE)
    {
      paramByteBuffer = readValue(paramByteBuffer);
      boolean bool = paramByteBuffer instanceof List;
      SharedPreferencesPigeonOptions localSharedPreferencesPigeonOptions = null;
      if (bool) {
        paramByteBuffer = (List)paramByteBuffer;
      } else {
        paramByteBuffer = null;
      }
      if (paramByteBuffer != null) {
        localSharedPreferencesPigeonOptions = SharedPreferencesPigeonOptions.Companion.fromList(paramByteBuffer);
      }
      return localSharedPreferencesPigeonOptions;
    }
    return super.readValueOfType(paramByte, paramByteBuffer);
  }
  
  public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
  {
    i.e(paramByteArrayOutputStream, "stream");
    if ((paramObject instanceof SharedPreferencesPigeonOptions))
    {
      paramByteArrayOutputStream.write(128);
      writeValue(paramByteArrayOutputStream, ((SharedPreferencesPigeonOptions)paramObject).toList());
    }
    else
    {
      super.writeValue(paramByteArrayOutputStream, paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApiCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */