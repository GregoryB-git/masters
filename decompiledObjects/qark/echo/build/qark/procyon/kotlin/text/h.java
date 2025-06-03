// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import l6.d;
import l6.c;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

public abstract class h
{
    public static final f c(final Matcher matcher, final CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new g(matcher, charSequence);
    }
    
    public static final c d(final MatchResult matchResult, final int n) {
        return d.g(matchResult.start(n), matchResult.end(n));
    }
}
