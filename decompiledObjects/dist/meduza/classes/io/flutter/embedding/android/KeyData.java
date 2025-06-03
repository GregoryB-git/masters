package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class KeyData
{
  private static final int BYTES_PER_FIELD = 8;
  public static final String CHANNEL = "flutter/keydata";
  private static final int FIELD_COUNT = 6;
  private static final String TAG = "KeyData";
  public String character;
  public DeviceType deviceType;
  public long logicalKey;
  public long physicalKey;
  public boolean synthesized;
  public long timestamp;
  public Type type;
  
  public KeyData() {}
  
  public KeyData(ByteBuffer paramByteBuffer)
  {
    long l = paramByteBuffer.getLong();
    timestamp = paramByteBuffer.getLong();
    type = Type.fromLong(paramByteBuffer.getLong());
    physicalKey = paramByteBuffer.getLong();
    logicalKey = paramByteBuffer.getLong();
    boolean bool;
    if (paramByteBuffer.getLong() != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    synthesized = bool;
    deviceType = DeviceType.fromLong(paramByteBuffer.getLong());
    if (paramByteBuffer.remaining() == l)
    {
      character = null;
      if (l != 0L)
      {
        int i = (int)l;
        byte[] arrayOfByte = new byte[i];
        paramByteBuffer.get(arrayOfByte, 0, i);
        try
        {
          paramByteBuffer = new java/lang/String;
          paramByteBuffer.<init>(arrayOfByte, "UTF-8");
          character = paramByteBuffer;
        }
        catch (UnsupportedEncodingException paramByteBuffer)
        {
          throw new AssertionError("UTF-8 unsupported");
        }
      }
      return;
    }
    throw new AssertionError(String.format("Unexpected char length: charSize is %d while buffer has position %d, capacity %d, limit %d", new Object[] { Long.valueOf(l), Integer.valueOf(paramByteBuffer.position()), Integer.valueOf(paramByteBuffer.capacity()), Integer.valueOf(paramByteBuffer.limit()) }));
  }
  
  public ByteBuffer toBytes()
  {
    try
    {
      Object localObject = character;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((String)localObject).getBytes("UTF-8");
      }
      int i;
      if (localObject == null) {
        i = 0;
      } else {
        i = localObject.length;
      }
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(i + 56);
      localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      localByteBuffer.putLong(i);
      localByteBuffer.putLong(timestamp);
      localByteBuffer.putLong(type.getValue());
      localByteBuffer.putLong(physicalKey);
      localByteBuffer.putLong(logicalKey);
      long l;
      if (synthesized) {
        l = 1L;
      } else {
        l = 0L;
      }
      localByteBuffer.putLong(l);
      localByteBuffer.putLong(deviceType.getValue());
      if (localObject != null) {
        localByteBuffer.put((byte[])localObject);
      }
      return localByteBuffer;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError("UTF-8 not supported");
    }
  }
  
  public static enum DeviceType
  {
    private final long value;
    
    static
    {
      kDirectionalPad = new DeviceType("kDirectionalPad", 1, 1L);
      kGamepad = new DeviceType("kGamepad", 2, 2L);
      kJoystick = new DeviceType("kJoystick", 3, 3L);
      kHdmi = new DeviceType("kHdmi", 4, 4L);
    }
    
    private DeviceType(long paramLong)
    {
      value = paramLong;
    }
    
    public static DeviceType fromLong(long paramLong)
    {
      int i = (int)paramLong;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 4) {
                return kHdmi;
              }
              throw new AssertionError("Unexpected DeviceType value");
            }
            return kJoystick;
          }
          return kGamepad;
        }
        return kDirectionalPad;
      }
      return kKeyboard;
    }
    
    public long getValue()
    {
      return value;
    }
  }
  
  public static enum Type
  {
    private long value;
    
    static
    {
      kRepeat = new Type("kRepeat", 2, 2L);
    }
    
    private Type(long paramLong)
    {
      value = paramLong;
    }
    
    public static Type fromLong(long paramLong)
    {
      int i = (int)paramLong;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i == 2) {
            return kRepeat;
          }
          throw new AssertionError("Unexpected Type value");
        }
        return kUp;
      }
      return kDown;
    }
    
    public long getValue()
    {
      return value;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */