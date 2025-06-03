package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public abstract class h {
    public static final f c(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new g(matcher, charSequence);
        }
        return null;
    }

    public static final l6.c d(MatchResult matchResult, int i7) {
        l6.c g7;
        g7 = l6.f.g(matchResult.start(i7), matchResult.end(i7));
        return g7;
    }
}
