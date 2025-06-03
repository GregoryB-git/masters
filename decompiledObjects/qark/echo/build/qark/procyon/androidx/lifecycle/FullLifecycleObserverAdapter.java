// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

class FullLifecycleObserverAdapter implements f
{
    public final f o;
    
    @Override
    public void a(final h h, final d.b b) {
        switch (FullLifecycleObserverAdapter$a.a[b.ordinal()]) {
            default: {
                final f o = this.o;
                if (o != null) {
                    o.a(h, b);
                }
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
            case 1: {
                throw null;
            }
        }
    }
}
