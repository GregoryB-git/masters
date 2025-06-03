/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package kotlin.text;

import W5.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.f;
import kotlin.text.h;
import kotlin.text.s;
import l6.d;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class Regex
implements Serializable {
    public static final a p = new a(null);
    public final Pattern o;

    public Regex(@NotNull String string2) {
        Intrinsics.checkNotNullParameter(string2, "pattern");
        string2 = Pattern.compile((String)string2);
        Intrinsics.checkNotNullExpressionValue(string2, "compile(...)");
        this((Pattern)string2);
    }

    public Regex(Pattern pattern) {
        Intrinsics.checkNotNullParameter((Object)pattern, "nativePattern");
        this.o = pattern;
    }

    private final Object writeReplace() {
        String string2 = this.o.pattern();
        Intrinsics.checkNotNullExpressionValue(string2, "pattern(...)");
        return new b(string2, this.o.flags());
    }

    public final f a(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "input");
        Matcher matcher = this.o.matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue((Object)matcher, "matcher(...)");
        return h.a(matcher, charSequence);
    }

    public final boolean b(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "input");
        return this.o.matcher(charSequence).matches();
    }

    public final List c(CharSequence charSequence, int n8) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "input");
        s.S(n8);
        Matcher matcher = this.o.matcher(charSequence);
        if (n8 != 1 && matcher.find()) {
            int n9 = 10;
            if (n8 > 0) {
                n9 = d.b(n8, 10);
            }
            ArrayList arrayList = new ArrayList(n9);
            int n10 = n8 - 1;
            n8 = 0;
            do {
                arrayList.add((Object)charSequence.subSequence(n8, matcher.start()).toString());
                n9 = matcher.end();
                if (n10 >= 0 && arrayList.size() == n10) break;
                n8 = n9;
            } while (matcher.find());
            arrayList.add((Object)charSequence.subSequence(n9, charSequence.length()).toString());
            return arrayList;
        }
        return m.b(charSequence.toString());
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence, @NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "input");
        Intrinsics.checkNotNullParameter(string2, "replacement");
        charSequence = this.o.matcher(charSequence).replaceAll(string2);
        Intrinsics.checkNotNullExpressionValue((Object)charSequence, "replaceAll(...)");
        return charSequence;
    }

    public String toString() {
        String string2 = this.o.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b
    implements Serializable {
        public static final a q = new a(null);
        private static final long serialVersionUID = 0L;
        public final String o;
        public final int p;

        public b(String string2, int n8) {
            Intrinsics.checkNotNullParameter(string2, "pattern");
            this.o = string2;
            this.p = n8;
        }

        private final Object readResolve() {
            Pattern pattern = Pattern.compile((String)this.o, (int)this.p);
            Intrinsics.checkNotNullExpressionValue((Object)pattern, "compile(...)");
            return new Regex(pattern);
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }
        }

    }

}

