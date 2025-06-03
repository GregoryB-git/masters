package androidx.media2.common;

import b2.c;

public final class VideoSizeParcelizer
{
  public static VideoSize read(c paramc)
  {
    VideoSize localVideoSize = new VideoSize();
    a = paramc.o(a, 1);
    b = paramc.o(b, 2);
    return localVideoSize;
  }
  
  public static void write(VideoSize paramVideoSize, c paramc)
  {
    paramc.getClass();
    paramc.I(a, 1);
    paramc.I(b, 2);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.VideoSizeParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */