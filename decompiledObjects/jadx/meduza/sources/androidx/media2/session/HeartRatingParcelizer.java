package androidx.media2.session;

import b2.c;

/* loaded from: classes.dex */
public final class HeartRatingParcelizer {
    public static HeartRating read(c cVar) {
        HeartRating heartRating = new HeartRating();
        heartRating.f1078a = cVar.f(1, heartRating.f1078a);
        heartRating.f1079b = cVar.f(2, heartRating.f1079b);
        return heartRating;
    }

    public static void write(HeartRating heartRating, c cVar) {
        cVar.getClass();
        cVar.z(1, heartRating.f1078a);
        cVar.z(2, heartRating.f1079b);
    }
}
