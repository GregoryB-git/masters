/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
package B3;

import B3.F;
import B3.c;
import B3.d;
import B3.e;
import B3.r;
import B3.t;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import r4.b;

public final class G
implements e {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final e g;

    public G(c c8, e e8) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Iterator iterator = c8.g().iterator();
        while (iterator.hasNext()) {
            boolean bl;
            Object object = (r)iterator.next();
            if (object.e()) {
                bl = object.g();
                object = object.c();
                if (bl) {
                    hashSet4.add(object);
                    continue;
                }
                hashSet.add(object);
                continue;
            }
            if (object.d()) {
                hashSet3.add((Object)object.c());
                continue;
            }
            bl = object.g();
            object = object.c();
            if (bl) {
                hashSet5.add(object);
                continue;
            }
            hashSet2.add(object);
        }
        if (!c8.k().isEmpty()) {
            hashSet.add((Object)F.b(n4.c.class));
        }
        this.a = Collections.unmodifiableSet((Set)hashSet);
        this.b = Collections.unmodifiableSet((Set)hashSet2);
        this.c = Collections.unmodifiableSet((Set)hashSet3);
        this.d = Collections.unmodifiableSet((Set)hashSet4);
        this.e = Collections.unmodifiableSet((Set)hashSet5);
        this.f = c8.k();
        this.g = e8;
    }

    @Override
    public Object a(Class class_) {
        if (this.a.contains((Object)F.b(class_))) {
            Object object = this.g.a(class_);
            if (!class_.equals(n4.c.class)) {
                return object;
            }
            return new a(this.f, (n4.c)object);
        }
        throw new t(String.format((String)"Attempting to request an undeclared dependency %s.", (Object[])new Object[]{class_}));
    }

    @Override
    public b b(F f8) {
        if (this.b.contains((Object)f8)) {
            return this.g.b(f8);
        }
        throw new t(String.format((String)"Attempting to request an undeclared dependency Provider<%s>.", (Object[])new Object[]{f8}));
    }

    @Override
    public /* synthetic */ Set c(Class class_) {
        return d.f(this, class_);
    }

    @Override
    public r4.a d(F f8) {
        if (this.c.contains((Object)f8)) {
            return this.g.d(f8);
        }
        throw new t(String.format((String)"Attempting to request an undeclared dependency Deferred<%s>.", (Object[])new Object[]{f8}));
    }

    @Override
    public Set e(F f8) {
        if (this.d.contains((Object)f8)) {
            return this.g.e(f8);
        }
        throw new t(String.format((String)"Attempting to request an undeclared dependency Set<%s>.", (Object[])new Object[]{f8}));
    }

    @Override
    public b f(F f8) {
        if (this.e.contains((Object)f8)) {
            return this.g.f(f8);
        }
        throw new t(String.format((String)"Attempting to request an undeclared dependency Provider<Set<%s>>.", (Object[])new Object[]{f8}));
    }

    @Override
    public b g(Class class_) {
        return this.b(F.b(class_));
    }

    @Override
    public Object h(F f8) {
        if (this.a.contains((Object)f8)) {
            return this.g.h(f8);
        }
        throw new t(String.format((String)"Attempting to request an undeclared dependency %s.", (Object[])new Object[]{f8}));
    }

    @Override
    public r4.a i(Class class_) {
        return this.d(F.b(class_));
    }

    public static class a
    implements n4.c {
        public final Set a;
        public final n4.c b;

        public a(Set set, n4.c c8) {
            this.a = set;
            this.b = c8;
        }

        @Override
        public void a(n4.a a8) {
            if (this.a.contains((Object)a8.b())) {
                this.b.a(a8);
                return;
            }
            throw new t(String.format((String)"Attempting to publish an undeclared event %s.", (Object[])new Object[]{a8}));
        }
    }

}

