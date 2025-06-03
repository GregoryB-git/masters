package androidx.media2.session;

import androidx.media2.common.Rating;
import defpackage.f;
import java.util.Objects;

/* loaded from: classes.dex */
public final class StarRating implements Rating {

    /* renamed from: a, reason: collision with root package name */
    public int f1129a;

    /* renamed from: b, reason: collision with root package name */
    public float f1130b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.f1129a == starRating.f1129a && this.f1130b == starRating.f1130b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1129a), Float.valueOf(this.f1130b));
    }

    public final String toString() {
        String str;
        StringBuilder l10 = f.l("StarRating: maxStars=");
        l10.append(this.f1129a);
        if (this.f1130b >= 0.0f) {
            StringBuilder l11 = f.l(", starRating=");
            l11.append(this.f1130b);
            str = l11.toString();
        } else {
            str = ", unrated";
        }
        l10.append(str);
        return l10.toString();
    }
}
