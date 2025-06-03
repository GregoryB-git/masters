// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s3;

import A2.n;

public abstract class l extends Exception
{
    public l() {
    }
    
    public l(final String message) {
        n.f(message, "Detail message must not be empty");
        super(message);
    }
    
    public l(final String message, final Throwable cause) {
        n.f(message, "Detail message must not be empty");
        super(message, cause);
    }
}
