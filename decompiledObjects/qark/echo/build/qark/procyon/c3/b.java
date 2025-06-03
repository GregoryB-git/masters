// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

import p3.C;
import p3.t;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class b implements p
{
    public final InputStream a;
    
    public b(final InputStream a) {
        this.a = a;
    }
    
    public static p b(final byte[] buf) {
        return new b(new ByteArrayInputStream(buf));
    }
    
    @Override
    public t a() {
        try {
            return t.Z(this.a, com.google.crypto.tink.shaded.protobuf.p.b());
        }
        finally {
            this.a.close();
        }
    }
    
    @Override
    public C read() {
        try {
            return C.e0(this.a, com.google.crypto.tink.shaded.protobuf.p.b());
        }
        finally {
            this.a.close();
        }
    }
}
