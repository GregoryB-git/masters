package androidx.media2.session;

import b2.c;

public final class HeartRatingParcelizer
{
  public static HeartRating read(c paramc)
  {
    HeartRating localHeartRating = new HeartRating();
    a = paramc.f(1, a);
    b = paramc.f(2, b);
    return localHeartRating;
  }
  
  public static void write(HeartRating paramHeartRating, c paramc)
  {
    paramc.getClass();
    paramc.z(1, a);
    paramc.z(2, b);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.HeartRatingParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */