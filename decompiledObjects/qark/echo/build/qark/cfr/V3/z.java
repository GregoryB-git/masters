/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 */
package V3;

public interface z {
    public static final z a = new z(){

        @Override
        public void a(Thread thread, String string2) {
            thread.setName(string2);
        }

        @Override
        public void b(Thread thread, boolean bl) {
            thread.setDaemon(bl);
        }

        @Override
        public void c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    };

    public void a(Thread var1, String var2);

    public void b(Thread var1, boolean var2);

    public void c(Thread var1, Thread.UncaughtExceptionHandler var2);

}

