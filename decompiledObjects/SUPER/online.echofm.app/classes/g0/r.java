package g0;

import android.media.MediaFormat;
import d0.h;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class r
{
  public static void a(MediaFormat paramMediaFormat, String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      paramMediaFormat.setByteBuffer(paramString, ByteBuffer.wrap(paramArrayOfByte));
    }
  }
  
  public static void b(MediaFormat paramMediaFormat, h paramh)
  {
    if (paramh != null)
    {
      d(paramMediaFormat, "color-transfer", c);
      d(paramMediaFormat, "color-standard", a);
      d(paramMediaFormat, "color-range", b);
      a(paramMediaFormat, "hdr-static-info", d);
    }
  }
  
  public static void c(MediaFormat paramMediaFormat, String paramString, float paramFloat)
  {
    if (paramFloat != -1.0F) {
      paramMediaFormat.setFloat(paramString, paramFloat);
    }
  }
  
  public static void d(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    if (paramInt != -1) {
      paramMediaFormat.setInteger(paramString, paramInt);
    }
  }
  
  public static void e(MediaFormat paramMediaFormat, List paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("csd-");
      localStringBuilder.append(i);
      paramMediaFormat.setByteBuffer(localStringBuilder.toString(), ByteBuffer.wrap((byte[])paramList.get(i)));
    }
  }
}

/* Location:
 * Qualified Name:     g0.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */