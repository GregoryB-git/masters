/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.regex.MatchResult
 *  java.util.regex.Matcher
 */
package kotlin.text;

import W5.a;
import W5.m;
import g6.l;
import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import kotlin.text.e;
import kotlin.text.f;
import kotlin.text.h;
import n6.c;

public final class g
implements f {
    public final Matcher a;
    public final CharSequence b;
    public final e c;

    public g(Matcher matcher, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter((Object)matcher, "matcher");
        Intrinsics.checkNotNullParameter((Object)charSequence, "input");
        this.a = matcher;
        this.b = charSequence;
        this.c = new e(){

            @Override
            public int a() {
                return this.c().groupCount() + 1;
            }

            @Override
            public d get(int n8) {
                l6.c c8 = h.b(this.c(), n8);
                if (c8.q() >= 0) {
                    String string2 = this.c().group(n8);
                    Intrinsics.checkNotNullExpressionValue(string2, "group(...)");
                    return new d(string2, c8);
                }
                return null;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            public Iterator iterator() {
                return c.d(m.n(m.g(this)), new l(){

                    public final d a(int n8) {
                        return this.get(n8);
                    }
                }).iterator();
            }

        };
    }

    @Override
    public e a() {
        return this.c;
    }

    public final MatchResult c() {
        return this.a;
    }

}

