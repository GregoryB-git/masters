package lc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f9844a;

    public d(String str) {
        Pattern compile = Pattern.compile(str);
        ec.i.d(compile, "compile(...)");
        this.f9844a = compile;
    }

    public final List a(String str) {
        int i10 = 0;
        k.x0(0);
        Matcher matcher = this.f9844a.matcher(str);
        if (!matcher.find()) {
            return va.a.f(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(str.subSequence(i10, matcher.start()).toString());
            i10 = matcher.end();
        } while (matcher.find());
        arrayList.add(str.subSequence(i10, str.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String pattern = this.f9844a.toString();
        ec.i.d(pattern, "toString(...)");
        return pattern;
    }
}
