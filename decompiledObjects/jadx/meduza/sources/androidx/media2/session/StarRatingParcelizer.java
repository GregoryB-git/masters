package androidx.media2.session;

import b2.c;

/* loaded from: classes.dex */
public final class StarRatingParcelizer {
    public static StarRating read(c cVar) {
        StarRating starRating = new StarRating();
        starRating.f1129a = cVar.o(starRating.f1129a, 1);
        float f = starRating.f1130b;
        if (cVar.l(2)) {
            f = cVar.m();
        }
        starRating.f1130b = f;
        return starRating;
    }

    public static void write(StarRating starRating, c cVar) {
        cVar.getClass();
        cVar.I(starRating.f1129a, 1);
        float f = starRating.f1130b;
        cVar.y(2);
        cVar.G(f);
    }
}
