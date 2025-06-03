package a0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f12a;

    public m(Object obj) {
        this.f12a = (LocaleList) obj;
    }

    @Override // a0.l
    public final String a() {
        return this.f12a.toLanguageTags();
    }

    @Override // a0.l
    public final Object b() {
        return this.f12a;
    }

    public final boolean equals(Object obj) {
        return this.f12a.equals(((l) obj).b());
    }

    @Override // a0.l
    public final Locale get(int i10) {
        return this.f12a.get(i10);
    }

    public final int hashCode() {
        return this.f12a.hashCode();
    }

    @Override // a0.l
    public final boolean isEmpty() {
        return this.f12a.isEmpty();
    }

    @Override // a0.l
    public final int size() {
        return this.f12a.size();
    }

    public final String toString() {
        return this.f12a.toString();
    }
}
