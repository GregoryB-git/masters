package ic;

import ec.i;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public c(char c10, char c11) {
        super(c10, c11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (i.f(this.f7947a, this.f7948b) > 0) {
                c cVar = (c) obj;
                if (i.f(cVar.f7947a, cVar.f7948b) > 0) {
                    return true;
                }
            }
            c cVar2 = (c) obj;
            if (this.f7947a == cVar2.f7947a && this.f7948b == cVar2.f7948b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (i.f(this.f7947a, this.f7948b) > 0) {
            return -1;
        }
        return (this.f7947a * 31) + this.f7948b;
    }

    public final String toString() {
        return this.f7947a + ".." + this.f7948b;
    }
}
