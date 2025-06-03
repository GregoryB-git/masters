package r1;

import a0.j;
import defpackage.f;
import defpackage.g;
import ec.i;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import lc.h;
import lc.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13519a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, C0204a> f13520b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<b> f13521c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<d> f13522d;

    /* renamed from: r1.a$a, reason: collision with other inner class name */
    public static final class C0204a {

        /* renamed from: a, reason: collision with root package name */
        public final String f13523a;

        /* renamed from: b, reason: collision with root package name */
        public final String f13524b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f13525c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13526d;

        /* renamed from: e, reason: collision with root package name */
        public final String f13527e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f13528g;

        /* renamed from: r1.a$a$a, reason: collision with other inner class name */
        public static final class C0205a {
            public static boolean a(String str, String str2) {
                boolean z10;
                i.e(str, "current");
                if (i.a(str, str2)) {
                    return true;
                }
                if (!(str.length() == 0)) {
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i10 < str.length()) {
                            char charAt = str.charAt(i10);
                            int i13 = i12 + 1;
                            if (i12 == 0 && charAt != '(') {
                                break;
                            }
                            if (charAt != '(') {
                                if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                                    break;
                                }
                            } else {
                                i11++;
                            }
                            i10++;
                            i12 = i13;
                        } else if (i11 == 0) {
                            z10 = true;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return i.a(k.C0(substring).toString(), str2);
            }
        }

        public C0204a(int i10, int i11, String str, String str2, String str3, boolean z10) {
            this.f13523a = str;
            this.f13524b = str2;
            this.f13525c = z10;
            this.f13526d = i10;
            this.f13527e = str3;
            this.f = i11;
            Locale locale = Locale.US;
            i.d(locale, "US");
            String upperCase = str2.toUpperCase(locale);
            i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            this.f13528g = k.o0(upperCase, "INT") ? 3 : (k.o0(upperCase, "CHAR") || k.o0(upperCase, "CLOB") || k.o0(upperCase, "TEXT")) ? 2 : k.o0(upperCase, "BLOB") ? 5 : (k.o0(upperCase, "REAL") || k.o0(upperCase, "FLOA") || k.o0(upperCase, "DOUB")) ? 4 : 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0069, code lost:
        
            r1 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof r1.a.C0204a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                int r1 = r5.f13526d
                r1.a$a r6 = (r1.a.C0204a) r6
                int r3 = r6.f13526d
                if (r1 == r3) goto L13
                return r2
            L13:
                java.lang.String r1 = r5.f13523a
                java.lang.String r3 = r6.f13523a
                boolean r1 = ec.i.a(r1, r3)
                if (r1 != 0) goto L1e
                return r2
            L1e:
                boolean r1 = r5.f13525c
                boolean r3 = r6.f13525c
                if (r1 == r3) goto L25
                return r2
            L25:
                int r1 = r5.f
                r3 = 2
                if (r1 != r0) goto L3b
                int r1 = r6.f
                if (r1 != r3) goto L3b
                java.lang.String r1 = r5.f13527e
                if (r1 == 0) goto L3b
                java.lang.String r4 = r6.f13527e
                boolean r1 = r1.a.C0204a.C0205a.a(r1, r4)
                if (r1 != 0) goto L3b
                return r2
            L3b:
                int r1 = r5.f
                if (r1 != r3) goto L50
                int r1 = r6.f
                if (r1 != r0) goto L50
                java.lang.String r1 = r6.f13527e
                if (r1 == 0) goto L50
                java.lang.String r3 = r5.f13527e
                boolean r1 = r1.a.C0204a.C0205a.a(r1, r3)
                if (r1 != 0) goto L50
                return r2
            L50:
                int r1 = r5.f
                if (r1 == 0) goto L6f
                int r3 = r6.f
                if (r1 != r3) goto L6f
                java.lang.String r1 = r5.f13527e
                if (r1 == 0) goto L65
                java.lang.String r3 = r6.f13527e
                boolean r1 = r1.a.C0204a.C0205a.a(r1, r3)
                if (r1 != 0) goto L6b
                goto L69
            L65:
                java.lang.String r1 = r6.f13527e
                if (r1 == 0) goto L6b
            L69:
                r1 = r0
                goto L6c
            L6b:
                r1 = r2
            L6c:
                if (r1 == 0) goto L6f
                return r2
            L6f:
                int r1 = r5.f13528g
                int r6 = r6.f13528g
                if (r1 != r6) goto L76
                goto L77
            L76:
                r0 = r2
            L77:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.a.C0204a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (((((this.f13523a.hashCode() * 31) + this.f13528g) * 31) + (this.f13525c ? 1231 : 1237)) * 31) + this.f13526d;
        }

        public final String toString() {
            StringBuilder l10 = f.l("Column{name='");
            l10.append(this.f13523a);
            l10.append("', type='");
            l10.append(this.f13524b);
            l10.append("', affinity='");
            l10.append(this.f13528g);
            l10.append("', notNull=");
            l10.append(this.f13525c);
            l10.append(", primaryKeyPosition=");
            l10.append(this.f13526d);
            l10.append(", defaultValue='");
            String str = this.f13527e;
            if (str == null) {
                str = "undefined";
            }
            return g.f(l10, str, "'}");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f13529a;

        /* renamed from: b, reason: collision with root package name */
        public final String f13530b;

        /* renamed from: c, reason: collision with root package name */
        public final String f13531c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f13532d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f13533e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            i.e(list, "columnNames");
            i.e(list2, "referenceColumnNames");
            this.f13529a = str;
            this.f13530b = str2;
            this.f13531c = str3;
            this.f13532d = list;
            this.f13533e = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (i.a(this.f13529a, bVar.f13529a) && i.a(this.f13530b, bVar.f13530b) && i.a(this.f13531c, bVar.f13531c) && i.a(this.f13532d, bVar.f13532d)) {
                return i.a(this.f13533e, bVar.f13533e);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13533e.hashCode() + ((this.f13532d.hashCode() + j.e(this.f13531c, j.e(this.f13530b, this.f13529a.hashCode() * 31, 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder l10 = f.l("ForeignKey{referenceTable='");
            l10.append(this.f13529a);
            l10.append("', onDelete='");
            l10.append(this.f13530b);
            l10.append(" +', onUpdate='");
            l10.append(this.f13531c);
            l10.append("', columnNames=");
            l10.append(this.f13532d);
            l10.append(", referenceColumnNames=");
            l10.append(this.f13533e);
            l10.append('}');
            return l10.toString();
        }
    }

    public static final class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        public final int f13534a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13535b;

        /* renamed from: c, reason: collision with root package name */
        public final String f13536c;

        /* renamed from: d, reason: collision with root package name */
        public final String f13537d;

        public c(String str, int i10, int i11, String str2) {
            this.f13534a = i10;
            this.f13535b = i11;
            this.f13536c = str;
            this.f13537d = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            i.e(cVar2, "other");
            int i10 = this.f13534a - cVar2.f13534a;
            return i10 == 0 ? this.f13535b - cVar2.f13535b : i10;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f13538a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13539b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f13540c;

        /* renamed from: d, reason: collision with root package name */
        public List<String> f13541d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public d(String str, boolean z10, List<String> list, List<String> list2) {
            i.e(list, "columns");
            i.e(list2, "orders");
            this.f13538a = str;
            this.f13539b = z10;
            this.f13540c = list;
            this.f13541d = list2;
            if (list2.isEmpty()) {
                int size = list.size();
                list2 = new ArrayList<>(size);
                for (int i10 = 0; i10 < size; i10++) {
                    list2.add("ASC");
                }
            }
            this.f13541d = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f13539b == dVar.f13539b && i.a(this.f13540c, dVar.f13540c) && i.a(this.f13541d, dVar.f13541d)) {
                return h.n0(this.f13538a, "index_") ? h.n0(dVar.f13538a, "index_") : i.a(this.f13538a, dVar.f13538a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13541d.hashCode() + ((this.f13540c.hashCode() + ((((h.n0(this.f13538a, "index_") ? -1184239155 : this.f13538a.hashCode()) * 31) + (this.f13539b ? 1 : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder l10 = f.l("Index{name='");
            l10.append(this.f13538a);
            l10.append("', unique=");
            l10.append(this.f13539b);
            l10.append(", columns=");
            l10.append(this.f13540c);
            l10.append(", orders=");
            l10.append(this.f13541d);
            l10.append("'}");
            return l10.toString();
        }
    }

    public a(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        i.e(abstractSet, "foreignKeys");
        this.f13519a = str;
        this.f13520b = map;
        this.f13521c = abstractSet;
        this.f13522d = abstractSet2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0336 A[Catch: all -> 0x0366, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0366, blocks: (B:54:0x0228, B:59:0x0241, B:60:0x0246, B:62:0x024c, B:65:0x0259, B:68:0x0267, B:95:0x031d, B:97:0x0336, B:106:0x0322, B:116:0x034c, B:117:0x034f, B:123:0x0350, B:70:0x0282, B:76:0x02a5, B:77:0x02b1, B:79:0x02b7, B:82:0x02be, B:85:0x02d3, B:93:0x02f7, B:112:0x0349), top: B:53:0x0228, inners: #2, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final r1.a a(u1.c r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.a.a(u1.c, java.lang.String):r1.a");
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!i.a(this.f13519a, aVar.f13519a) || !i.a(this.f13520b, aVar.f13520b) || !i.a(this.f13521c, aVar.f13521c)) {
            return false;
        }
        Set<d> set2 = this.f13522d;
        if (set2 == null || (set = aVar.f13522d) == null) {
            return true;
        }
        return i.a(set2, set);
    }

    public final int hashCode() {
        return this.f13521c.hashCode() + ((this.f13520b.hashCode() + (this.f13519a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder l10 = f.l("TableInfo{name='");
        l10.append(this.f13519a);
        l10.append("', columns=");
        l10.append(this.f13520b);
        l10.append(", foreignKeys=");
        l10.append(this.f13521c);
        l10.append(", indices=");
        l10.append(this.f13522d);
        l10.append('}');
        return l10.toString();
    }
}
