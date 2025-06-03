package androidx.media2.session;

import androidx.media2.common.Rating;
import defpackage.f;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ThumbRating implements Rating {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1131a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1132b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        return this.f1132b == thumbRating.f1132b && this.f1131a == thumbRating.f1131a;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1131a), Boolean.valueOf(this.f1132b));
    }

    public final String toString() {
        String str;
        StringBuilder l10 = f.l("ThumbRating: ");
        if (this.f1131a) {
            StringBuilder l11 = f.l("isThumbUp=");
            l11.append(this.f1132b);
            str = l11.toString();
        } else {
            str = "unrated";
        }
        l10.append(str);
        return l10.toString();
    }
}
