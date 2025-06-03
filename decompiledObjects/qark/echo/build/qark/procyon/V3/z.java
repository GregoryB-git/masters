// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

public interface z
{
    public static final z a = new z() {
        @Override
        public void a(final Thread thread, final String name) {
            thread.setName(name);
        }
        
        @Override
        public void b(final Thread thread, final boolean daemon) {
            thread.setDaemon(daemon);
        }
        
        @Override
        public void c(final Thread thread, final Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    };
    
    void a(final Thread p0, final String p1);
    
    void b(final Thread p0, final boolean p1);
    
    void c(final Thread p0, final Thread.UncaughtExceptionHandler p1);
}
