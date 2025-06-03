package d4;

import d4.k;
import d4.n;

/* loaded from: classes.dex */
public class t extends k {

    /* renamed from: q, reason: collision with root package name */
    public final String f13325q;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13326a;

        static {
            int[] iArr = new int[n.b.values().length];
            f13326a = iArr;
            try {
                iArr[n.b.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13326a[n.b.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public t(String str, n nVar) {
        super(nVar);
        this.f13325q = str;
    }

    @Override // d4.n
    public String O(n.b bVar) {
        StringBuilder sb;
        String str;
        int i7 = a.f13326a[bVar.ordinal()];
        if (i7 == 1) {
            sb = new StringBuilder();
            sb.append(T(bVar));
            sb.append("string:");
            str = this.f13325q;
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException("Invalid hash version for string node: " + bVar);
            }
            sb = new StringBuilder();
            sb.append(T(bVar));
            sb.append("string:");
            str = Y3.m.j(this.f13325q);
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // d4.k
    public k.b S() {
        return k.b.String;
    }

    @Override // d4.k
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public int s(t tVar) {
        return this.f13325q.compareTo(tVar.f13325q);
    }

    @Override // d4.n
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public t J(n nVar) {
        return new t(this.f13325q, nVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f13325q.equals(tVar.f13325q) && this.f13303o.equals(tVar.f13303o);
    }

    @Override // d4.n
    public Object getValue() {
        return this.f13325q;
    }

    public int hashCode() {
        return this.f13325q.hashCode() + this.f13303o.hashCode();
    }
}
