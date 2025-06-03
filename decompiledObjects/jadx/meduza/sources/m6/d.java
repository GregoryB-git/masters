package m6;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f10261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10262b;

    public d(String str, String str2) {
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.f10261a = str;
        this.f10262b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
