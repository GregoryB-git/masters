/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.h;

class FullLifecycleObserverAdapter
implements f {
    public final f o;

    @Override
    public void a(h h8, d.b b8) {
        switch (.a[b8.ordinal()]) {
            default: {
                f f8 = this.o;
                if (f8 != null) {
                    f8.a(h8, b8);
                }
                return;
            }
            case 7: {
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            }
            case 6: {
                throw null;
            }
            case 5: {
                throw null;
            }
            case 4: {
                throw null;
            }
            case 3: {
                throw null;
            }
            case 2: {
                throw null;
            }
            case 1: 
        }
        throw null;
    }

}

