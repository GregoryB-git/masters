package l;

import android.app.AlertDialog;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import v0.a;
import v0.g;

/* loaded from: classes.dex */
public final class l implements Continuation, l6.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9389a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9390b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9391c;

    public l(int i10) {
        this.f9389a = i10;
        if (i10 != 6) {
            this.f9390b = new Object();
            this.f9391c = new LinkedHashMap();
        } else {
            this.f9390b = new AtomicInteger();
            this.f9391c = new AtomicInteger();
        }
    }

    public final boolean a(x2.l lVar) {
        boolean containsKey;
        synchronized (this.f9390b) {
            containsKey = ((Map) this.f9391c).containsKey(lVar);
        }
        return containsKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l6.n
    public final void accept(Object obj, Object obj2) {
        b7.u uVar = (b7.u) this.f9391c;
        ((zzs) ((zzp) obj).getService()).zzc(new a7.b((TaskCompletionSource) obj2), uVar);
    }

    public final KeyListener b(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((v0.a) this.f9391c).f15182a.getClass();
        if (keyListener instanceof v0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new v0.e(keyListener);
    }

    public final void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f9390b).getContext().obtainStyledAttributes(attributeSet, b.a0.f1580v, i10, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            g(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        v0.a aVar = (v0.a) this.f9391c;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0246a c0246a = aVar.f15182a;
        c0246a.getClass();
        return inputConnection instanceof v0.c ? inputConnection : new v0.c(c0246a.f15183a, inputConnection, editorInfo);
    }

    public final List e(String str) {
        List u10;
        ec.i.e(str, "workSpecId");
        synchronized (this.f9390b) {
            Map map = (Map) this.f9391c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (ec.i.a(((x2.l) entry.getKey()).f16820a, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((Map) this.f9391c).remove((x2.l) it.next());
            }
            u10 = sb.q.u(linkedHashMap.values());
        }
        return u10;
    }

    public final p2.x f(x2.l lVar) {
        p2.x xVar;
        ec.i.e(lVar, "id");
        synchronized (this.f9390b) {
            xVar = (p2.x) ((Map) this.f9391c).remove(lVar);
        }
        return xVar;
    }

    public final void g(boolean z10) {
        v0.g gVar = ((v0.a) this.f9391c).f15182a.f15184b;
        if (gVar.f15204d != z10) {
            if (gVar.f15203c != null) {
                androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
                g.a aVar = gVar.f15203c;
                a10.getClass();
                p2.m0.p(aVar, "initCallback cannot be null");
                a10.f979a.writeLock().lock();
                try {
                    a10.f980b.remove(aVar);
                } finally {
                    a10.f979a.writeLock().unlock();
                }
            }
            gVar.f15204d = z10;
            if (z10) {
                v0.g.a(gVar.f15201a, androidx.emoji2.text.d.a().b());
            }
        }
    }

    public final p2.x h(x2.l lVar) {
        p2.x xVar;
        synchronized (this.f9390b) {
            Map map = (Map) this.f9391c;
            Object obj = map.get(lVar);
            if (obj == null) {
                obj = new p2.x(lVar);
                map.put(lVar, obj);
            }
            xVar = (p2.x) obj;
        }
        return xVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f9389a) {
            case 3:
                i6.c cVar = (i6.c) this.f9390b;
                Bundle bundle = (Bundle) this.f9391c;
                cVar.getClass();
                if (!task.isSuccessful()) {
                    return task;
                }
                Bundle bundle2 = (Bundle) task.getResult();
                return bundle2 != null && bundle2.containsKey("google.messenger") ? cVar.b(bundle).onSuccessTask(i6.b0.f7570a, b.a0.O) : task;
            default:
                r9.i iVar = (r9.i) this.f9390b;
                Pair pair = (Pair) this.f9391c;
                synchronized (iVar) {
                    iVar.f13829b.remove(pair);
                }
                return task;
        }
    }

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f9389a = i10;
        this.f9390b = obj;
        this.f9391c = obj2;
    }

    public l(EditText editText) {
        this.f9389a = 0;
        this.f9390b = editText;
        this.f9391c = new v0.a(editText);
    }

    public l(l6.d1 d1Var, AlertDialog alertDialog) {
        this.f9389a = 4;
        this.f9391c = d1Var;
        this.f9390b = alertDialog;
    }

    public l(p1.j jVar) {
        this.f9389a = 1;
        ec.i.e(jVar, "database");
        this.f9390b = jVar;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        ec.i.d(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f9391c = newSetFromMap;
    }
}
