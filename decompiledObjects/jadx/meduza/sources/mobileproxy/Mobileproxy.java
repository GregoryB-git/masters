package mobileproxy;

import go.Seq;

/* loaded from: classes.dex */
public abstract class Mobileproxy {

    public static final class proxyLogWriter implements Seq.Proxy, LogWriter {
        private final int refnum;

        public proxyLogWriter(int i10) {
            this.refnum = i10;
            Seq.trackGoRef(i10, this);
        }

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // mobileproxy.LogWriter
        public native long writeString(String str);
    }

    static {
        Seq.touch();
        _init();
    }

    private Mobileproxy() {
    }

    private static native void _init();

    public static native StringList newListFromLines(String str);

    public static native StreamDialer newSmartStreamDialer(StringList stringList, String str, LogWriter logWriter);

    public static native LogWriter newStderrLogWriter();

    public static native StreamDialer newStreamDialerFromConfig(String str);

    public static native Proxy runProxy(String str, StreamDialer streamDialer);

    public static void touch() {
    }
}
