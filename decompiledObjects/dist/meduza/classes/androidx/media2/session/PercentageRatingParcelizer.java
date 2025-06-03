package androidx.media2.session;

import b2.c;

public final class PercentageRatingParcelizer
{
  public static PercentageRating read(c paramc)
  {
    PercentageRating localPercentageRating = new PercentageRating();
    float f = a;
    if (paramc.l(1)) {
      f = paramc.m();
    }
    a = f;
    return localPercentageRating;
  }
  
  public static void write(PercentageRating paramPercentageRating, c paramc)
  {
    paramc.getClass();
    float f = a;
    paramc.y(1);
    paramc.G(f);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.PercentageRatingParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */