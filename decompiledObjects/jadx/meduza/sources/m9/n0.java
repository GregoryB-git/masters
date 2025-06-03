package m9;

import eb.e1;
import java.util.List;
import ma.a0;

/* loaded from: classes.dex */
public abstract class n0 {

    public static final class a extends n0 {

        /* renamed from: a, reason: collision with root package name */
        public final List<Integer> f10845a;

        /* renamed from: b, reason: collision with root package name */
        public final List<Integer> f10846b;

        /* renamed from: c, reason: collision with root package name */
        public final j9.i f10847c;

        /* renamed from: d, reason: collision with root package name */
        public final j9.m f10848d;

        public a(List list, a0.c cVar, j9.i iVar, j9.m mVar) {
            this.f10845a = list;
            this.f10846b = cVar;
            this.f10847c = iVar;
            this.f10848d = mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f10845a.equals(aVar.f10845a) || !this.f10846b.equals(aVar.f10846b) || !this.f10847c.equals(aVar.f10847c)) {
                return false;
            }
            j9.m mVar = this.f10848d;
            j9.m mVar2 = aVar.f10848d;
            return mVar != null ? mVar.equals(mVar2) : mVar2 == null;
        }

        public final int hashCode() {
            int hashCode = (this.f10847c.hashCode() + ((this.f10846b.hashCode() + (this.f10845a.hashCode() * 31)) * 31)) * 31;
            j9.m mVar = this.f10848d;
            return hashCode + (mVar != null ? mVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("DocumentChange{updatedTargetIds=");
            l10.append(this.f10845a);
            l10.append(", removedTargetIds=");
            l10.append(this.f10846b);
            l10.append(", key=");
            l10.append(this.f10847c);
            l10.append(", newDocument=");
            l10.append(this.f10848d);
            l10.append('}');
            return l10.toString();
        }
    }

    public static final class b extends n0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f10849a;

        /* renamed from: b, reason: collision with root package name */
        public final k f10850b;

        public b(int i10, k kVar) {
            this.f10849a = i10;
            this.f10850b = kVar;
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("ExistenceFilterWatchChange{targetId=");
            l10.append(this.f10849a);
            l10.append(", existenceFilter=");
            l10.append(this.f10850b);
            l10.append('}');
            return l10.toString();
        }
    }

    public static final class c extends n0 {

        /* renamed from: a, reason: collision with root package name */
        public final d f10851a;

        /* renamed from: b, reason: collision with root package name */
        public final List<Integer> f10852b;

        /* renamed from: c, reason: collision with root package name */
        public final ma.h f10853c;

        /* renamed from: d, reason: collision with root package name */
        public final e1 f10854d;

        public c(d dVar, a0.c cVar, ma.h hVar, e1 e1Var) {
            x6.b.Z("Got cause for a target change that was not a removal", e1Var == null || dVar == d.Removed, new Object[0]);
            this.f10851a = dVar;
            this.f10852b = cVar;
            this.f10853c = hVar;
            if (e1Var == null || e1Var.e()) {
                this.f10854d = null;
            } else {
                this.f10854d = e1Var;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f10851a != cVar.f10851a || !this.f10852b.equals(cVar.f10852b) || !this.f10853c.equals(cVar.f10853c)) {
                return false;
            }
            e1 e1Var = this.f10854d;
            e1 e1Var2 = cVar.f10854d;
            return e1Var != null ? e1Var2 != null && e1Var.f5081a.equals(e1Var2.f5081a) : e1Var2 == null;
        }

        public final int hashCode() {
            int hashCode = (this.f10853c.hashCode() + ((this.f10852b.hashCode() + (this.f10851a.hashCode() * 31)) * 31)) * 31;
            e1 e1Var = this.f10854d;
            return hashCode + (e1Var != null ? e1Var.f5081a.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("WatchTargetChange{changeType=");
            l10.append(this.f10851a);
            l10.append(", targetIds=");
            l10.append(this.f10852b);
            l10.append('}');
            return l10.toString();
        }
    }

    public enum d {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }
}
