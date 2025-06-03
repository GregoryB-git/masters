package W2;

/* loaded from: classes.dex */
public abstract class d implements n {

    public static abstract class a extends d {
        @Override // W2.n
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.b((Character) obj);
        }
    }

    public static final class b extends a {

        /* renamed from: o, reason: collision with root package name */
        public final char f6816o;

        public b(char c7) {
            this.f6816o = c7;
        }

        @Override // W2.d
        public boolean e(char c7) {
            return c7 == this.f6816o;
        }

        public String toString() {
            return "CharMatcher.is('" + d.g(this.f6816o) + "')";
        }
    }

    public static abstract class c extends a {

        /* renamed from: o, reason: collision with root package name */
        public final String f6817o;

        public c(String str) {
            this.f6817o = (String) m.j(str);
        }

        public final String toString() {
            return this.f6817o;
        }
    }

    /* renamed from: W2.d$d, reason: collision with other inner class name */
    public static final class C0115d extends c {

        /* renamed from: p, reason: collision with root package name */
        public static final d f6818p = new C0115d();

        public C0115d() {
            super("CharMatcher.none()");
        }

        @Override // W2.d
        public int c(CharSequence charSequence, int i7) {
            m.l(i7, charSequence.length());
            return -1;
        }

        @Override // W2.d
        public boolean e(char c7) {
            return false;
        }
    }

    public static d d(char c7) {
        return new b(c7);
    }

    public static d f() {
        return C0115d.f6818p;
    }

    public static String g(char c7) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c7 & 15);
            c7 = (char) (c7 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        m.l(i7, length);
        while (i7 < length) {
            if (e(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public abstract boolean e(char c7);
}
