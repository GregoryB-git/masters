package androidx.media2.session;

import b2.c;

public final class StarRatingParcelizer
{
  public static StarRating read(c paramc)
  {
    StarRating localStarRating = new StarRating();
    a = paramc.o(a, 1);
    float f = b;
    if (paramc.l(2)) {
      f = paramc.m();
    }
    b = f;
    return localStarRating;
  }
  
  public static void write(StarRating paramStarRating, c paramc)
  {
    paramc.getClass();
    paramc.I(a, 1);
    float f = b;
    paramc.y(2);
    paramc.G(f);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.StarRatingParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */