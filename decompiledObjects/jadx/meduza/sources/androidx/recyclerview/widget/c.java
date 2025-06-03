package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<RecyclerView.v> f1303e = new ArrayList<>();
    public ArrayList<RecyclerView.v> f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<b> f1304g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<a> f1305h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.v>> f1306i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<ArrayList<b>> f1307j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<ArrayList<a>> f1308k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<RecyclerView.v> f1309l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<RecyclerView.v> f1310m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<RecyclerView.v> f1311n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<RecyclerView.v> f1312o = new ArrayList<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.v f1313a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.v f1314b;

        public a() {
            throw null;
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("ChangeInfo{oldHolder=");
            l10.append(this.f1313a);
            l10.append(", newHolder=");
            l10.append(this.f1314b);
            l10.append(", fromX=");
            l10.append(0);
            l10.append(", fromY=");
            l10.append(0);
            l10.append(", toX=");
            l10.append(0);
            l10.append(", toY=");
            l10.append(0);
            l10.append('}');
            return l10.toString();
        }
    }

    public static class b {
        public b() {
            throw null;
        }
    }

    public static void e(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        ((RecyclerView.v) arrayList.get(size)).getClass();
        throw null;
    }

    public static void f(a aVar, RecyclerView.v vVar) {
        if (aVar.f1314b == vVar) {
            aVar.f1314b = null;
        } else if (aVar.f1313a != vVar) {
            return;
        } else {
            aVar.f1313a = null;
        }
        vVar.getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void c() {
        ArrayList<RecyclerView.v> arrayList;
        int size;
        ArrayList<b> arrayList2;
        int size2;
        int size3 = this.f1304g.size() - 1;
        if (size3 >= 0) {
            this.f1304g.get(size3).getClass();
            throw null;
        }
        int size4 = this.f1303e.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a(this.f1303e.get(size4));
            this.f1303e.remove(size4);
        }
        int size5 = this.f.size() - 1;
        if (size5 >= 0) {
            this.f.get(size5).getClass();
            throw null;
        }
        int size6 = this.f1305h.size();
        while (true) {
            size6--;
            if (size6 < 0) {
                break;
            }
            a aVar = this.f1305h.get(size6);
            RecyclerView.v vVar = aVar.f1313a;
            if (vVar != null) {
                f(aVar, vVar);
            }
            RecyclerView.v vVar2 = aVar.f1314b;
            if (vVar2 != null) {
                f(aVar, vVar2);
            }
        }
        this.f1305h.clear();
        if (d()) {
            int size7 = this.f1307j.size();
            do {
                size7--;
                if (size7 < 0) {
                    int size8 = this.f1306i.size();
                    do {
                        size8--;
                        if (size8 >= 0) {
                            arrayList = this.f1306i.get(size8);
                            size = arrayList.size() - 1;
                        } else {
                            int size9 = this.f1308k.size();
                            while (true) {
                                size9--;
                                if (size9 < 0) {
                                    e(this.f1311n);
                                    e(this.f1310m);
                                    e(this.f1309l);
                                    e(this.f1312o);
                                    b();
                                    return;
                                }
                                ArrayList<a> arrayList3 = this.f1308k.get(size9);
                                int size10 = arrayList3.size();
                                while (true) {
                                    size10--;
                                    if (size10 >= 0) {
                                        a aVar2 = arrayList3.get(size10);
                                        RecyclerView.v vVar3 = aVar2.f1313a;
                                        if (vVar3 != null) {
                                            f(aVar2, vVar3);
                                        }
                                        RecyclerView.v vVar4 = aVar2.f1314b;
                                        if (vVar4 != null) {
                                            f(aVar2, vVar4);
                                        }
                                        if (arrayList3.isEmpty()) {
                                            this.f1308k.remove(arrayList3);
                                        }
                                    }
                                }
                            }
                        }
                    } while (size < 0);
                    arrayList.get(size).getClass();
                    throw null;
                }
                arrayList2 = this.f1307j.get(size7);
                size2 = arrayList2.size() - 1;
            } while (size2 < 0);
            arrayList2.get(size2).getClass();
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final boolean d() {
        return (this.f.isEmpty() && this.f1305h.isEmpty() && this.f1304g.isEmpty() && this.f1303e.isEmpty() && this.f1310m.isEmpty() && this.f1311n.isEmpty() && this.f1309l.isEmpty() && this.f1312o.isEmpty() && this.f1307j.isEmpty() && this.f1306i.isEmpty() && this.f1308k.isEmpty()) ? false : true;
    }
}
