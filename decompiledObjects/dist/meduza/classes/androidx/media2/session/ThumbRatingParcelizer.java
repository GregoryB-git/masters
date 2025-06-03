package androidx.media2.session;

import b2.c;

public final class ThumbRatingParcelizer
{
  public static ThumbRating read(c paramc)
  {
    ThumbRating localThumbRating = new ThumbRating();
    a = paramc.f(1, a);
    b = paramc.f(2, b);
    return localThumbRating;
  }
  
  public static void write(ThumbRating paramThumbRating, c paramc)
  {
    paramc.getClass();
    paramc.z(1, a);
    paramc.z(2, b);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.ThumbRatingParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */