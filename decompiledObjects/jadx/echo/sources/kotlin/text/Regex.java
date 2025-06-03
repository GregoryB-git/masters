package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public final class Regex implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final a f16234p = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public final Pattern f16235o;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* renamed from: q, reason: collision with root package name */
        public static final a f16236q = new a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final String f16237o;

        /* renamed from: p, reason: collision with root package name */
        public final int f16238p;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(String pattern, int i7) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.f16237o = pattern;
            this.f16238p = i7;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f16237o, this.f16238p);
            Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
            return new Regex(compile);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    private final Object writeReplace() {
        String pattern = this.f16235o.pattern();
        Intrinsics.checkNotNullExpressionValue(pattern, "pattern(...)");
        return new b(pattern, this.f16235o.flags());
    }

    public final f a(CharSequence input) {
        f c7;
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f16235o.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        c7 = h.c(matcher, input);
        return c7;
    }

    public final boolean b(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f16235o.matcher(input).matches();
    }

    public final List c(CharSequence input, int i7) {
        Intrinsics.checkNotNullParameter(input, "input");
        s.S(i7);
        Matcher matcher = this.f16235o.matcher(input);
        if (i7 == 1 || !matcher.find()) {
            return W5.n.b(input.toString());
        }
        ArrayList arrayList = new ArrayList(i7 > 0 ? l6.f.b(i7, 10) : 10);
        int i8 = i7 - 1;
        int i9 = 0;
        do {
            arrayList.add(input.subSequence(i9, matcher.start()).toString());
            i9 = matcher.end();
            if (i8 >= 0 && arrayList.size() == i8) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i9, input.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceAll = this.f16235o.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f16235o.toString();
        Intrinsics.checkNotNullExpressionValue(pattern, "toString(...)");
        return pattern;
    }

    public Regex(Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f16235o = nativePattern;
    }
}
