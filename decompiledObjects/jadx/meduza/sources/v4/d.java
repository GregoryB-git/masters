package v4;

import com.google.android.exoplayer2.ui.b;
import g9.l;
import j9.i;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m8.f0;
import r5.f;
import v3.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15858a;

    public /* synthetic */ d(int i10) {
        this.f15858a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15858a) {
            case 1:
                d5.b bVar = (d5.b) obj;
                d5.b bVar2 = (d5.b) obj2;
                int compare = Integer.compare(bVar.f3449c, bVar2.f3449c);
                return compare != 0 ? compare : bVar.f3448b.compareTo(bVar2.f3448b);
            case 2:
                return ((i0) obj2).f15453p - ((i0) obj).f15453p;
            case 3:
                return ((f.g) ((List) obj).get(0)).compareTo((f.g) ((List) obj2).get(0));
            case 4:
                return ((f.a) Collections.max((List) obj)).compareTo((f.a) Collections.max((List) obj2));
            case 5:
                return f.i.i((f.i) obj, (f.i) obj2);
            case 6:
                b.C0040b c0040b = (b.C0040b) obj;
                b.C0040b c0040b2 = (b.C0040b) obj2;
                int compare2 = Integer.compare(c0040b2.f2730b, c0040b.f2730b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compareTo = c0040b.f2731c.compareTo(c0040b2.f2731c);
                return compareTo != 0 ? compareTo : c0040b.f2732d.compareTo(c0040b2.f2732d);
            case 7:
                return ((f0.c) obj).a().compareTo(((f0.c) obj2).a());
            case 8:
                return ((i) obj).compareTo((i) obj2);
            default:
                return ((l) obj).f6013c.compareTo(((l) obj2).f6013c);
        }
    }
}
