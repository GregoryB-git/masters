package io.flutter.plugins.urllauncher;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

class Messages$UrlLauncherApiCodec
  extends StandardMessageCodec
{
  public static final UrlLauncherApiCodec INSTANCE = new UrlLauncherApiCodec();
  
  public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
  {
    if (paramByte != Byte.MIN_VALUE)
    {
      if (paramByte != -127) {
        return super.readValueOfType(paramByte, paramByteBuffer);
      }
      return Messages.WebViewOptions.fromList((ArrayList)readValue(paramByteBuffer));
    }
    return Messages.BrowserOptions.fromList((ArrayList)readValue(paramByteBuffer));
  }
  
  public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
  {
    if ((paramObject instanceof Messages.BrowserOptions)) {
      paramByteArrayOutputStream.write(128);
    }
    for (paramObject = ((Messages.BrowserOptions)paramObject).toList();; paramObject = ((Messages.WebViewOptions)paramObject).toList())
    {
      writeValue(paramByteArrayOutputStream, paramObject);
      return;
      if (!(paramObject instanceof Messages.WebViewOptions)) {
        break;
      }
      paramByteArrayOutputStream.write(129);
    }
    super.writeValue(paramByteArrayOutputStream, paramObject);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.Messages.UrlLauncherApiCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */