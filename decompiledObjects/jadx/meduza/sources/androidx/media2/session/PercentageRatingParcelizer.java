package androidx.media2.session;

import b2.c;

/* loaded from: classes.dex */
public final class PercentageRatingParcelizer {
    public static PercentageRating read(c cVar) {
        PercentageRating percentageRating = new PercentageRating();
        float f = percentageRating.f1106a;
        if (cVar.l(1)) {
            f = cVar.m();
        }
        percentageRating.f1106a = f;
        return percentageRating;
    }

    public static void write(PercentageRating percentageRating, c cVar) {
        cVar.getClass();
        float f = percentageRating.f1106a;
        cVar.y(1);
        cVar.G(f);
    }
}
