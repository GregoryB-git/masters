/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.regex.MatchResult
 *  java.util.regex.Matcher
 */
package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.text.f;
import kotlin.text.g;
import l6.c;
import l6.d;

public abstract class h {
    public static final /* synthetic */ f a(Matcher matcher, CharSequence charSequence) {
        return h.c(matcher, charSequence);
    }

    public static final /* synthetic */ c b(MatchResult matchResult, int n8) {
        return h.d(matchResult, n8);
    }

    public static final f c(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new g(matcher, charSequence);
    }

    public static final c d(MatchResult matchResult, int n8) {
        return d.g(matchResult.start(n8), matchResult.end(n8));
    }
}

