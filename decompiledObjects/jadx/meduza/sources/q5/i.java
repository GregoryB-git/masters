package q5;

import j9.k;
import j9.m;
import java.io.File;
import java.util.Comparator;
import n9.o;
import r5.f;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13328a;

    public /* synthetic */ i(int i10) {
        this.f13328a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13328a) {
            case 0:
                return Long.compare(((e) obj).f13300b, ((e) obj2).f13300b);
            case 1:
                return f.i.h((f.i) obj, (f.i) obj2);
            case 2:
                u5.g gVar = (u5.g) obj;
                u5.g gVar2 = (u5.g) obj2;
                long j10 = gVar.f;
                long j11 = gVar2.f;
                return j10 - j11 == 0 ? gVar.compareTo(gVar2) : j10 < j11 ? -1 : 1;
            case 3:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 4:
                return ((Long) obj2).compareTo((Long) obj);
            case 5:
                return ((j9.g) obj).getKey().compareTo(((j9.g) obj2).getKey());
            case 6:
                return k.a.g((m) obj).compareTo(k.a.g((m) obj2));
            default:
                r3.j jVar = o.f11373a;
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
