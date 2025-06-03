package u;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;

public final class q$a
{
  public static AudioAttributes a(AudioAttributes.Builder paramBuilder)
  {
    return paramBuilder.build();
  }
  
  public static AudioAttributes.Builder b()
  {
    return new AudioAttributes.Builder();
  }
  
  public static AudioAttributes.Builder c(AudioAttributes.Builder paramBuilder, int paramInt)
  {
    return paramBuilder.setContentType(paramInt);
  }
  
  public static AudioAttributes.Builder d(AudioAttributes.Builder paramBuilder, int paramInt)
  {
    return paramBuilder.setLegacyStreamType(paramInt);
  }
  
  public static AudioAttributes.Builder e(AudioAttributes.Builder paramBuilder, int paramInt)
  {
    return paramBuilder.setUsage(paramInt);
  }
}

/* Location:
 * Qualified Name:     u.q.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */