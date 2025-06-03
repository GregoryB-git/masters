package com.google.android.exoplayer2.metadata.emsg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class EventMessageEncoder
{
  private final ByteArrayOutputStream byteArrayOutputStream;
  private final DataOutputStream dataOutputStream;
  
  public EventMessageEncoder()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(512);
    byteArrayOutputStream = localByteArrayOutputStream;
    dataOutputStream = new DataOutputStream(localByteArrayOutputStream);
  }
  
  private static void writeNullTerminatedString(DataOutputStream paramDataOutputStream, String paramString)
    throws IOException
  {
    paramDataOutputStream.writeBytes(paramString);
    paramDataOutputStream.writeByte(0);
  }
  
  private static void writeUnsignedInt(DataOutputStream paramDataOutputStream, long paramLong)
    throws IOException
  {
    paramDataOutputStream.writeByte((int)(paramLong >>> 24) & 0xFF);
    paramDataOutputStream.writeByte((int)(paramLong >>> 16) & 0xFF);
    paramDataOutputStream.writeByte((int)(paramLong >>> 8) & 0xFF);
    paramDataOutputStream.writeByte((int)paramLong & 0xFF);
  }
  
  @Nullable
  public byte[] encode(EventMessage paramEventMessage, long paramLong)
  {
    boolean bool;
    if (paramLong >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    byteArrayOutputStream.reset();
    try
    {
      writeNullTerminatedString(dataOutputStream, schemeIdUri);
      String str = value;
      if (str == null) {
        str = "";
      }
      writeNullTerminatedString(dataOutputStream, str);
      writeUnsignedInt(dataOutputStream, paramLong);
      long l = Util.scaleLargeTimestamp(presentationTimeUs, paramLong, 1000000L);
      writeUnsignedInt(dataOutputStream, l);
      paramLong = Util.scaleLargeTimestamp(durationMs, paramLong, 1000L);
      writeUnsignedInt(dataOutputStream, paramLong);
      writeUnsignedInt(dataOutputStream, id);
      dataOutputStream.write(messageData);
      dataOutputStream.flush();
      paramEventMessage = byteArrayOutputStream.toByteArray();
      return paramEventMessage;
    }
    catch (IOException paramEventMessage)
    {
      throw new RuntimeException(paramEventMessage);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */