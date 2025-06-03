package n7;

/* loaded from: classes.dex */
public abstract class c implements j<Character> {

    public static abstract class a extends c {
        @Override // n7.j
        @Deprecated
        public final boolean apply(Character ch) {
            return b(ch.charValue());
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final char f11277a;

        public b(char c10) {
            this.f11277a = c10;
        }

        @Override // n7.c
        public final boolean b(char c10) {
            return c10 == this.f11277a;
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("CharMatcher.is('");
            char c10 = this.f11277a;
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            for (int i10 = 0; i10 < 4; i10++) {
                cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
            }
            l10.append(String.copyValueOf(cArr));
            l10.append("')");
            return l10.toString();
        }
    }

    /* renamed from: n7.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0171c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f11278a;

        public AbstractC0171c(String str) {
            this.f11278a = str;
        }

        public final String toString() {
            return this.f11278a;
        }
    }

    public static final class d extends AbstractC0171c {

        /* renamed from: b, reason: collision with root package name */
        public static final d f11279b = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // n7.c
        public final int a(int i10, CharSequence charSequence) {
            x6.b.D(i10, charSequence.length());
            return -1;
        }

        @Override // n7.c
        public final boolean b(char c10) {
            return false;
        }
    }

    public static final class e extends AbstractC0171c {

        /* renamed from: b, reason: collision with root package name */
        public static final int f11280b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c, reason: collision with root package name */
        public static final e f11281c = new e();

        public e() {
            super("CharMatcher.whitespace()");
        }

        @Override // n7.c
        public final boolean b(char c10) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f11280b) == c10;
        }
    }

    public int a(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        x6.b.D(i10, length);
        while (i10 < length) {
            if (b(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean b(char c10);
}
