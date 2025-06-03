package androidx.media2.session;

import b2.c;

/* loaded from: classes.dex */
public final class ThumbRatingParcelizer {
    public static ThumbRating read(c cVar) {
        ThumbRating thumbRating = new ThumbRating();
        thumbRating.f1131a = cVar.f(1, thumbRating.f1131a);
        thumbRating.f1132b = cVar.f(2, thumbRating.f1132b);
        return thumbRating;
    }

    public static void write(ThumbRating thumbRating, c cVar) {
        cVar.getClass();
        cVar.z(1, thumbRating.f1131a);
        cVar.z(2, thumbRating.f1132b);
    }
}
