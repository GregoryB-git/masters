// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

public final class c extends IllegalStateException
{
    public c(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public static IllegalStateException a(final j j) {
        if (!j.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        final Exception i = j.i();
        String concat;
        if (i != null) {
            concat = "failure";
        }
        else if (j.n()) {
            concat = "result ".concat(String.valueOf(j.j()));
        }
        else if (j.l()) {
            concat = "cancellation";
        }
        else {
            concat = "unknown issue";
        }
        return new c("Complete with: ".concat(concat), i);
    }
}
