package ic;

import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements Iterable<Character> {

    /* renamed from: a, reason: collision with root package name */
    public final char f7947a;

    /* renamed from: b, reason: collision with root package name */
    public final char f7948b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7949c = 1;

    public a(char c10, char c11) {
        this.f7947a = c10;
        this.f7948b = (char) va.a.e(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new b(this.f7947a, this.f7948b, this.f7949c);
    }
}
