package y2;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g {
    public static final void a(WorkDatabase workDatabase, androidx.work.a aVar, p2.y yVar) {
        int i10;
        ec.i.e(aVar, "configuration");
        ec.i.e(yVar, "continuation");
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        ArrayList arrayList = new ArrayList(new sb.h(new p2.y[]{yVar}, true));
        int i11 = 0;
        while (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            p2.y yVar2 = (p2.y) arrayList.remove(va.a.d(arrayList));
            List<? extends o2.q> list = yVar2.f12970e;
            ec.i.d(list, "current.work");
            if (list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((o2.q) it.next()).f11746b.f16838j.a() && (i10 = i10 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i11 += i10;
            List<p2.y> list2 = yVar2.f12972h;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
        }
        if (i11 == 0) {
            return;
        }
        int A = workDatabase.u().A();
        int i12 = aVar.f1449i;
        if (A + i11 <= i12) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ");
        sb2.append(i12);
        sb2.append(";\nalready enqueued count: ");
        sb2.append(A);
        sb2.append(";\ncurrent enqueue operation count: ");
        throw new IllegalArgumentException(a0.j.m(sb2, i11, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }
}
