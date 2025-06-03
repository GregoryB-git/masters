package o0;

import android.net.Uri;
import d0.C1169H;
import g0.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import v0.InterfaceC2047a;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1752c implements InterfaceC2047a {

    /* renamed from: a, reason: collision with root package name */
    public final long f18082a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18083b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18084c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18085d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18086e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18087f;

    /* renamed from: g, reason: collision with root package name */
    public final long f18088g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18089h;

    /* renamed from: i, reason: collision with root package name */
    public final o f18090i;

    /* renamed from: j, reason: collision with root package name */
    public final l f18091j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f18092k;

    /* renamed from: l, reason: collision with root package name */
    public final h f18093l;

    /* renamed from: m, reason: collision with root package name */
    public final List f18094m;

    public C1752c(long j7, long j8, long j9, boolean z7, long j10, long j11, long j12, long j13, h hVar, o oVar, l lVar, Uri uri, List list) {
        this.f18082a = j7;
        this.f18083b = j8;
        this.f18084c = j9;
        this.f18085d = z7;
        this.f18086e = j10;
        this.f18087f = j11;
        this.f18088g = j12;
        this.f18089h = j13;
        this.f18093l = hVar;
        this.f18090i = oVar;
        this.f18092k = uri;
        this.f18091j = lVar;
        this.f18094m = list == null ? Collections.emptyList() : list;
    }

    public static ArrayList c(List list, LinkedList linkedList) {
        C1169H c1169h = (C1169H) linkedList.poll();
        int i7 = c1169h.f12385o;
        ArrayList arrayList = new ArrayList();
        do {
            int i8 = c1169h.f12386p;
            C1750a c1750a = (C1750a) list.get(i8);
            List list2 = c1750a.f18074c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((j) list2.get(c1169h.f12387q));
                c1169h = (C1169H) linkedList.poll();
                if (c1169h.f12385o != i7) {
                    break;
                }
            } while (c1169h.f12386p == i8);
            arrayList.add(new C1750a(c1750a.f18072a, c1750a.f18073b, arrayList2, c1750a.f18075d, c1750a.f18076e, c1750a.f18077f));
        } while (c1169h.f12385o == i7);
        linkedList.addFirst(c1169h);
        return arrayList;
    }

    @Override // v0.InterfaceC2047a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1752c a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C1169H(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j7 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= e()) {
                break;
            }
            if (((C1169H) linkedList.peek()).f12385o != i7) {
                long f7 = f(i7);
                if (f7 != -9223372036854775807L) {
                    j7 += f7;
                }
            } else {
                g d7 = d(i7);
                arrayList.add(new g(d7.f18117a, d7.f18118b - j7, c(d7.f18119c, linkedList), d7.f18120d));
            }
            i7++;
        }
        long j8 = this.f18083b;
        return new C1752c(this.f18082a, j8 != -9223372036854775807L ? j8 - j7 : -9223372036854775807L, this.f18084c, this.f18085d, this.f18086e, this.f18087f, this.f18088g, this.f18089h, this.f18093l, this.f18090i, this.f18091j, this.f18092k, arrayList);
    }

    public final g d(int i7) {
        return (g) this.f18094m.get(i7);
    }

    public final int e() {
        return this.f18094m.size();
    }

    public final long f(int i7) {
        long j7;
        if (i7 == this.f18094m.size() - 1) {
            j7 = this.f18083b;
            if (j7 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
        } else {
            j7 = ((g) this.f18094m.get(i7 + 1)).f18118b;
        }
        return j7 - ((g) this.f18094m.get(i7)).f18118b;
    }

    public final long g(int i7) {
        return M.J0(f(i7));
    }
}
