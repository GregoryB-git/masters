package u5;

import D5.j;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.plugin.editing.l;
import java.util.HashSet;
import java.util.Map;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class L implements l.a, j.b {

    /* renamed from: a, reason: collision with root package name */
    public final d[] f19864a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f19865b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final e f19866c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f19867a = 0;

        public Character a(int i7) {
            int i8;
            char c7 = (char) i7;
            if ((Integer.MIN_VALUE & i7) == 0) {
                int i9 = this.f19867a;
                if (i9 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i9, i7);
                    if (deadChar > 0) {
                        c7 = (char) deadChar;
                    }
                    i8 = 0;
                }
                return Character.valueOf(c7);
            }
            i8 = i7 & Integer.MAX_VALUE;
            int i10 = this.f19867a;
            if (i10 != 0) {
                i8 = KeyCharacterMap.getDeadChar(i10, i8);
            }
            this.f19867a = i8;
            return Character.valueOf(c7);
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final KeyEvent f19868a;

        /* renamed from: b, reason: collision with root package name */
        public int f19869b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19870c = false;

        public class a implements d.a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f19872a;

            public a() {
                this.f19872a = false;
            }

            @Override // u5.L.d.a
            public void a(boolean z7) {
                if (this.f19872a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f19872a = true;
                c cVar = c.this;
                int i7 = cVar.f19869b - 1;
                cVar.f19869b = i7;
                boolean z8 = z7 | cVar.f19870c;
                cVar.f19870c = z8;
                if (i7 != 0 || z8) {
                    return;
                }
                L.this.e(cVar.f19868a);
            }
        }

        public c(KeyEvent keyEvent) {
            this.f19869b = L.this.f19864a.length;
            this.f19868a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z7);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void a(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        E5.c getBinaryMessenger();
    }

    public L(e eVar) {
        this.f19866c = eVar;
        this.f19864a = new d[]{new K(eVar.getBinaryMessenger()), new F(new D5.i(eVar.getBinaryMessenger()))};
        new D5.j(eVar.getBinaryMessenger()).b(this);
    }

    @Override // D5.j.b
    public Map a() {
        return ((K) this.f19864a[0]).h();
    }

    @Override // io.flutter.plugin.editing.l.a
    public boolean b(KeyEvent keyEvent) {
        if (this.f19865b.remove(keyEvent)) {
            return false;
        }
        if (this.f19864a.length <= 0) {
            e(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.f19864a) {
            dVar.a(keyEvent, cVar.a());
        }
        return true;
    }

    public void d() {
        int size = this.f19865b.size();
        if (size > 0) {
            AbstractC1995b.g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    public final void e(KeyEvent keyEvent) {
        e eVar = this.f19866c;
        if (eVar == null || eVar.c(keyEvent)) {
            return;
        }
        this.f19865b.add(keyEvent);
        this.f19866c.a(keyEvent);
        if (this.f19865b.remove(keyEvent)) {
            AbstractC1995b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }
}
