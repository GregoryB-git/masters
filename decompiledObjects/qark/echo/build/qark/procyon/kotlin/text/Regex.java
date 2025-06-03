// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import W5.m;
import java.util.ArrayList;
import l6.d;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.g;
import java.util.regex.Pattern;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata
public final class Regex implements Serializable
{
    public static final a p;
    public final Pattern o;
    
    static {
        p = new a(null);
    }
    
    public Regex(@NotNull final String regex) {
        Intrinsics.checkNotNullParameter(regex, "pattern");
        final Pattern compile = Pattern.compile(regex);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        this(compile);
    }
    
    public Regex(final Pattern o) {
        Intrinsics.checkNotNullParameter(o, "nativePattern");
        this.o = o;
    }
    
    private final Object writeReplace() {
        final String pattern = this.o.pattern();
        Intrinsics.checkNotNullExpressionValue(pattern, "pattern(...)");
        return new b(pattern, this.o.flags());
    }
    
    public final f a(final CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        final Matcher matcher = this.o.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return h.a(matcher, input);
    }
    
    public final boolean b(final CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.o.matcher(input).matches();
    }
    
    public final List c(final CharSequence input, int n) {
        Intrinsics.checkNotNullParameter(input, "input");
        s.S(n);
        final Matcher matcher = this.o.matcher(input);
        if (n != 1 && matcher.find()) {
            int b = 10;
            if (n > 0) {
                b = d.b(n, 10);
            }
            final ArrayList list = new ArrayList<String>(b);
            final int n2 = n - 1;
            n = 0;
            int end;
            do {
                list.add(input.subSequence(n, matcher.start()).toString());
                end = matcher.end();
                if (n2 >= 0 && list.size() == n2) {
                    break;
                }
                n = end;
            } while (matcher.find());
            list.add(input.subSequence(end, input.length()).toString());
            return list;
        }
        return m.b(input.toString());
    }
    
    @NotNull
    public final String replace(@NotNull final CharSequence input, @NotNull final String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        final String replaceAll = this.o.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }
    
    @Override
    public String toString() {
        final String string = this.o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
    
    public static final class a
    {
    }
    
    public static final class b implements Serializable
    {
        public static final a q;
        private static final long serialVersionUID = 0L;
        public final String o;
        public final int p;
        
        static {
            q = new a(null);
        }
        
        public b(final String o, final int p2) {
            Intrinsics.checkNotNullParameter(o, "pattern");
            this.o = o;
            this.p = p2;
        }
        
        private final Object readResolve() {
            final Pattern compile = Pattern.compile(this.o, this.p);
            Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
            return new Regex(compile);
        }
        
        public static final class a
        {
        }
    }
}
