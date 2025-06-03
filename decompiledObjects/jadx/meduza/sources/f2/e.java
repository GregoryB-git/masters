package f2;

import dc.l;
import java.util.ArrayList;
import java.util.Collection;
import n7.w;
import sb.k;
import sb.s;

/* loaded from: classes.dex */
public final class e<T> extends g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f5312a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5313b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5314c;

    /* renamed from: d, reason: collision with root package name */
    public final f f5315d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5316e;
    public final j f;

    /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/String;Ljava/lang/String;Lf2/f;Ljava/lang/Object;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Object obj, String str, String str2, f fVar, int i10) {
        Collection collection;
        ec.i.e(obj, "value");
        ec.i.e(str, "tag");
        ec.i.e(fVar, "logger");
        a0.j.p(i10, "verificationMode");
        this.f5312a = obj;
        this.f5313b = str;
        this.f5314c = str2;
        this.f5315d = fVar;
        this.f5316e = i10;
        j jVar = new j(g.b(obj, str2));
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        ec.i.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (!(length >= 0)) {
            throw new IllegalArgumentException(a0.j.h("Requested element count ", length, " is less than zero.").toString());
        }
        if (length == 0) {
            collection = s.f14324a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = k.r(stackTrace);
            } else if (length == 1) {
                collection = va.a.f(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i11 = length2 - length; i11 < length2; i11++) {
                    arrayList.add(stackTrace[i11]);
                }
                collection = arrayList;
            }
        }
        jVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f = jVar;
    }

    @Override // f2.g
    public final T a() {
        int c10 = q0.g.c(this.f5316e);
        if (c10 == 0) {
            throw this.f;
        }
        if (c10 == 1) {
            this.f5315d.c(this.f5313b, g.b(this.f5312a, this.f5314c));
            return null;
        }
        if (c10 == 2) {
            return null;
        }
        throw new w();
    }

    @Override // f2.g
    public final g<T> c(String str, l<? super T, Boolean> lVar) {
        ec.i.e(lVar, "condition");
        return this;
    }
}
