package n3;

import c3.C0833k;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: n3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727c {

    /* renamed from: a, reason: collision with root package name */
    public final C1725a f17947a;

    /* renamed from: b, reason: collision with root package name */
    public final List f17948b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f17949c;

    /* renamed from: n3.c$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f17950a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public C1725a f17951b = C1725a.f17944b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f17952c = null;

        public b a(C0833k c0833k, int i7, String str, String str2) {
            ArrayList arrayList = this.f17950a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new C0241c(c0833k, i7, str, str2));
            return this;
        }

        public C1727c b() {
            if (this.f17950a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f17952c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            C1727c c1727c = new C1727c(this.f17951b, Collections.unmodifiableList(this.f17950a), this.f17952c);
            this.f17950a = null;
            return c1727c;
        }

        public final boolean c(int i7) {
            Iterator it = this.f17950a.iterator();
            while (it.hasNext()) {
                if (((C0241c) it.next()).a() == i7) {
                    return true;
                }
            }
            return false;
        }

        public b d(C1725a c1725a) {
            if (this.f17950a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f17951b = c1725a;
            return this;
        }

        public b e(int i7) {
            if (this.f17950a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f17952c = Integer.valueOf(i7);
            return this;
        }
    }

    /* renamed from: n3.c$c, reason: collision with other inner class name */
    public static final class C0241c {

        /* renamed from: a, reason: collision with root package name */
        public final C0833k f17953a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17954b;

        /* renamed from: c, reason: collision with root package name */
        public final String f17955c;

        /* renamed from: d, reason: collision with root package name */
        public final String f17956d;

        public C0241c(C0833k c0833k, int i7, String str, String str2) {
            this.f17953a = c0833k;
            this.f17954b = i7;
            this.f17955c = str;
            this.f17956d = str2;
        }

        public int a() {
            return this.f17954b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0241c)) {
                return false;
            }
            C0241c c0241c = (C0241c) obj;
            return this.f17953a == c0241c.f17953a && this.f17954b == c0241c.f17954b && this.f17955c.equals(c0241c.f17955c) && this.f17956d.equals(c0241c.f17956d);
        }

        public int hashCode() {
            return Objects.hash(this.f17953a, Integer.valueOf(this.f17954b), this.f17955c, this.f17956d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f17953a, Integer.valueOf(this.f17954b), this.f17955c, this.f17956d);
        }
    }

    public C1727c(C1725a c1725a, List list, Integer num) {
        this.f17947a = c1725a;
        this.f17948b = list;
        this.f17949c = num;
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1727c)) {
            return false;
        }
        C1727c c1727c = (C1727c) obj;
        return this.f17947a.equals(c1727c.f17947a) && this.f17948b.equals(c1727c.f17948b) && Objects.equals(this.f17949c, c1727c.f17949c);
    }

    public int hashCode() {
        return Objects.hash(this.f17947a, this.f17948b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f17947a, this.f17948b, this.f17949c);
    }
}
