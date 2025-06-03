/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.LinkedList
 *  java.util.List
 */
package o0;

import android.net.Uri;
import d0.H;
import g0.M;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import o0.a;
import o0.g;
import o0.h;
import o0.j;
import o0.l;
import o0.o;

public class c
implements v0.a {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final o i;
    public final l j;
    public final Uri k;
    public final h l;
    public final List m;

    public c(long l8, long l9, long l10, boolean bl, long l11, long l12, long l13, long l14, h h8, o o8, l l15, Uri uri, List list) {
        this.a = l8;
        this.b = l9;
        this.c = l10;
        this.d = bl;
        this.e = l11;
        this.f = l12;
        this.g = l13;
        this.h = l14;
        this.l = h8;
        this.i = o8;
        this.k = uri;
        this.j = l15;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.m = list;
    }

    public static ArrayList c(List list, LinkedList linkedList) {
        H h8;
        H h9 = (H)linkedList.poll();
        int n8 = h9.o;
        ArrayList arrayList = new ArrayList();
        do {
            int n9 = h9.p;
            a a8 = (a)list.get(n9);
            List list2 = a8.c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((Object)((j)list2.get(h9.q)));
                h8 = (H)linkedList.poll();
                if (h8.o != n8) break;
                h9 = h8;
            } while (h8.p == n9);
            arrayList.add((Object)new a(a8.a, a8.b, (List)arrayList2, a8.d, a8.e, a8.f));
            h9 = h8;
        } while (h8.o == n8);
        linkedList.addFirst((Object)h8);
        return arrayList;
    }

    public final c b(List list) {
        long l8;
        long l9;
        list = new LinkedList((Collection)list);
        Collections.sort((List)list);
        list.add((Object)new H(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long l10 = 0L;
        int n8 = 0;
        do {
            int n9 = this.e();
            l9 = -9223372036854775807L;
            if (n8 >= n9) break;
            if (((H)list.peek()).o != n8) {
                l8 = this.f(n8);
                l9 = l10;
                if (l8 != -9223372036854775807L) {
                    l9 = l10 + l8;
                }
            } else {
                g g8 = this.d(n8);
                ArrayList arrayList2 = c.c(g8.c, (LinkedList)list);
                arrayList.add((Object)new g(g8.a, g8.b - l10, (List)arrayList2, g8.d));
                l9 = l10;
            }
            ++n8;
            l10 = l9;
        } while (true);
        l8 = this.b;
        if (l8 != -9223372036854775807L) {
            l9 = l8 - l10;
        }
        return new c(this.a, l9, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, (List)arrayList);
    }

    public final g d(int n8) {
        return (g)this.m.get(n8);
    }

    public final int e() {
        return this.m.size();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long f(int n8) {
        long l8;
        if (n8 == this.m.size() - 1) {
            long l9;
            l8 = l9 = this.b;
            if (l9 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            do {
                return l8 - ((g)this.m.get((int)n8)).b;
                break;
            } while (true);
        }
        l8 = ((g)this.m.get((int)(n8 + 1))).b;
        return l8 - ((g)this.m.get((int)n8)).b;
    }

    public final long g(int n8) {
        return M.J0(this.f(n8));
    }
}

