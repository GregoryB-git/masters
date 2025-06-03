package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import xc.f;
import xc.h;
import xc.i;
import xc.y;
import xc.z;

/* loaded from: classes.dex */
final class Http2Reader implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f12599e = Logger.getLogger(Http2.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final h f12600a;

    /* renamed from: b, reason: collision with root package name */
    public final ContinuationSource f12601b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12602c;

    /* renamed from: d, reason: collision with root package name */
    public final Hpack.Reader f12603d;

    public static final class ContinuationSource implements y {

        /* renamed from: a, reason: collision with root package name */
        public final h f12604a;

        /* renamed from: b, reason: collision with root package name */
        public int f12605b;

        /* renamed from: c, reason: collision with root package name */
        public byte f12606c;

        /* renamed from: d, reason: collision with root package name */
        public int f12607d;

        /* renamed from: e, reason: collision with root package name */
        public int f12608e;
        public short f;

        public ContinuationSource(h hVar) {
            this.f12604a = hVar;
        }

        @Override // xc.y
        public final z c() {
            return this.f12604a.c();
        }

        @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // xc.y
        public final long e0(f fVar, long j10) {
            int i10;
            int readInt;
            do {
                int i11 = this.f12608e;
                if (i11 != 0) {
                    long e02 = this.f12604a.e0(fVar, Math.min(j10, i11));
                    if (e02 == -1) {
                        return -1L;
                    }
                    this.f12608e = (int) (this.f12608e - e02);
                    return e02;
                }
                this.f12604a.skip(this.f);
                this.f = (short) 0;
                if ((this.f12606c & 4) != 0) {
                    return -1L;
                }
                i10 = this.f12607d;
                h hVar = this.f12604a;
                Logger logger = Http2Reader.f12599e;
                int readByte = (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
                this.f12608e = readByte;
                this.f12605b = readByte;
                byte readByte2 = (byte) (this.f12604a.readByte() & 255);
                this.f12606c = (byte) (this.f12604a.readByte() & 255);
                Logger logger2 = Http2Reader.f12599e;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.a(true, this.f12607d, this.f12605b, readByte2, this.f12606c));
                }
                readInt = this.f12604a.readInt() & Integer.MAX_VALUE;
                this.f12607d = readInt;
                if (readByte2 != 9) {
                    Http2.b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte2));
                    throw null;
                }
            } while (readInt == i10);
            Http2.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }
    }

    public interface Handler {
        void a();

        void b(int i10, int i11, h hVar, boolean z10);

        void c();

        void d(int i10, long j10);

        void e(int i10, int i11, boolean z10);

        void f(Settings settings);

        void g(int i10, ErrorCode errorCode);

        void h(int i10, ArrayList arrayList);

        void i(int i10, i iVar);

        void j(int i10, ArrayList arrayList, boolean z10);
    }

    public Http2Reader(h hVar, boolean z10) {
        this.f12600a = hVar;
        this.f12602c = z10;
        ContinuationSource continuationSource = new ContinuationSource(hVar);
        this.f12601b = continuationSource;
        this.f12603d = new Hpack.Reader(continuationSource);
    }

    public static int f(int i10, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        Http2.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
        throw null;
    }

    public final void C(Handler handler) {
        if (this.f12602c) {
            if (g(true, handler)) {
                return;
            }
            Http2.b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        h hVar = this.f12600a;
        i iVar = Http2.f12530a;
        i l10 = hVar.l(iVar.f17260a.length);
        Logger logger = f12599e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.l("<< CONNECTION %s", l10.l()));
        }
        if (iVar.equals(l10)) {
            return;
        }
        Http2.b("Expected a connection header but was %s", l10.t());
        throw null;
    }

    public final ArrayList H(int i10, short s10, byte b10, int i11) {
        ContinuationSource continuationSource = this.f12601b;
        continuationSource.f12608e = i10;
        continuationSource.f12605b = i10;
        continuationSource.f = s10;
        continuationSource.f12606c = b10;
        continuationSource.f12607d = i11;
        Hpack.Reader reader = this.f12603d;
        while (!reader.f12516b.v()) {
            int readByte = reader.f12516b.readByte() & 255;
            if (readByte == 128) {
                throw new IOException("index == 0");
            }
            boolean z10 = false;
            if ((readByte & 128) == 128) {
                int e10 = reader.e(readByte, 127) - 1;
                if (e10 >= 0 && e10 <= Hpack.f12513a.length - 1) {
                    z10 = true;
                }
                if (!z10) {
                    int length = reader.f + 1 + (e10 - Hpack.f12513a.length);
                    if (length >= 0) {
                        Header[] headerArr = reader.f12519e;
                        if (length < headerArr.length) {
                            reader.f12515a.add(headerArr[length]);
                        }
                    }
                    StringBuilder l10 = defpackage.f.l("Header index too large ");
                    l10.append(e10 + 1);
                    throw new IOException(l10.toString());
                }
                reader.f12515a.add(Hpack.f12513a[e10]);
            } else if (readByte == 64) {
                i d10 = reader.d();
                Hpack.a(d10);
                reader.c(new Header(d10, reader.d()));
            } else if ((readByte & 64) == 64) {
                reader.c(new Header(reader.b(reader.e(readByte, 63) - 1), reader.d()));
            } else if ((readByte & 32) == 32) {
                int e11 = reader.e(readByte, 31);
                reader.f12518d = e11;
                if (e11 < 0 || e11 > reader.f12517c) {
                    StringBuilder l11 = defpackage.f.l("Invalid dynamic table size update ");
                    l11.append(reader.f12518d);
                    throw new IOException(l11.toString());
                }
                int i12 = reader.f12521h;
                if (e11 < i12) {
                    if (e11 == 0) {
                        Arrays.fill(reader.f12519e, (Object) null);
                        reader.f = reader.f12519e.length - 1;
                        reader.f12520g = 0;
                        reader.f12521h = 0;
                    } else {
                        reader.a(i12 - e11);
                    }
                }
            } else if (readByte == 16 || readByte == 0) {
                i d11 = reader.d();
                Hpack.a(d11);
                reader.f12515a.add(new Header(d11, reader.d()));
            } else {
                reader.f12515a.add(new Header(reader.b(reader.e(readByte, 15) - 1), reader.d()));
            }
        }
        Hpack.Reader reader2 = this.f12603d;
        reader2.getClass();
        ArrayList arrayList = new ArrayList(reader2.f12515a);
        reader2.f12515a.clear();
        return arrayList;
    }

    public final void I(Handler handler, int i10) {
        this.f12600a.readInt();
        this.f12600a.readByte();
        handler.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12600a.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(boolean z10, Handler handler) {
        ErrorCode errorCode;
        ErrorCode errorCode2;
        try {
            this.f12600a.u0(9L);
            h hVar = this.f12600a;
            int readByte = (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
            if (readByte < 0 || readByte > 16384) {
                Http2.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(readByte));
                throw null;
            }
            byte readByte2 = (byte) (this.f12600a.readByte() & 255);
            if (z10 && readByte2 != 4) {
                Http2.b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte2));
                throw null;
            }
            byte readByte3 = (byte) (this.f12600a.readByte() & 255);
            int readInt = this.f12600a.readInt() & Integer.MAX_VALUE;
            Logger logger = f12599e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.a(true, readInt, readByte, readByte2, readByte3));
            }
            switch (readByte2) {
                case 0:
                    if (readInt == 0) {
                        Http2.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z11 = (readByte3 & 1) != 0;
                    if (((readByte3 & 32) != 0) == true) {
                        Http2.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    short readByte4 = (readByte3 & 8) != 0 ? (short) (this.f12600a.readByte() & 255) : (short) 0;
                    handler.b(readInt, f(readByte, readByte3, readByte4), this.f12600a, z11);
                    this.f12600a.skip(readByte4);
                    return true;
                case 1:
                    if (readInt == 0) {
                        Http2.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z12 = (readByte3 & 1) != 0;
                    short readByte5 = (readByte3 & 8) != 0 ? (short) (this.f12600a.readByte() & 255) : (short) 0;
                    if ((readByte3 & 32) != 0) {
                        I(handler, readInt);
                        readByte -= 5;
                    }
                    handler.j(readInt, H(f(readByte, readByte3, readByte5), readByte5, readByte3, readInt), z12);
                    return true;
                case 2:
                    if (readByte != 5) {
                        Http2.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(readByte));
                        throw null;
                    }
                    if (readInt != 0) {
                        I(handler, readInt);
                        return true;
                    }
                    Http2.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                    throw null;
                case 3:
                    if (readByte != 4) {
                        Http2.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(readByte));
                        throw null;
                    }
                    if (readInt == 0) {
                        Http2.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int readInt2 = this.f12600a.readInt();
                    ErrorCode[] values = ErrorCode.values();
                    int length = values.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            errorCode = values[i10];
                            if (errorCode.f12504a != readInt2) {
                                i10++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode != null) {
                        handler.g(readInt, errorCode);
                        return true;
                    }
                    Http2.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                    throw null;
                case 4:
                    if (readInt != 0) {
                        Http2.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((readByte3 & 1) != 0) {
                        if (readByte != 0) {
                            Http2.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            throw null;
                        }
                        handler.a();
                    } else {
                        if (readByte % 6 != 0) {
                            Http2.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(readByte));
                            throw null;
                        }
                        Settings settings = new Settings();
                        for (int i11 = 0; i11 < readByte; i11 += 6) {
                            int readShort = this.f12600a.readShort() & 65535;
                            int readInt3 = this.f12600a.readInt();
                            if (readShort != 2) {
                                if (readShort == 3) {
                                    readShort = 4;
                                } else if (readShort == 4) {
                                    readShort = 7;
                                    if (readInt3 < 0) {
                                        Http2.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        throw null;
                                    }
                                } else if (readShort == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                    Http2.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt3));
                                    throw null;
                                }
                            } else if (readInt3 != 0 && readInt3 != 1) {
                                Http2.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                throw null;
                            }
                            settings.b(readShort, readInt3);
                        }
                        handler.f(settings);
                    }
                    return true;
                case 5:
                    if (readInt == 0) {
                        Http2.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    }
                    short readByte6 = (readByte3 & 8) != 0 ? (short) (this.f12600a.readByte() & 255) : (short) 0;
                    handler.h(this.f12600a.readInt() & Integer.MAX_VALUE, H(f(readByte - 4, readByte3, readByte6), readByte6, readByte3, readInt));
                    return true;
                case 6:
                    if (readByte != 8) {
                        Http2.b("TYPE_PING length != 8: %s", Integer.valueOf(readByte));
                        throw null;
                    }
                    if (readInt == 0) {
                        handler.e(this.f12600a.readInt(), this.f12600a.readInt(), (readByte3 & 1) != 0);
                        return true;
                    }
                    Http2.b("TYPE_PING streamId != 0", new Object[0]);
                    throw null;
                case 7:
                    if (readByte < 8) {
                        Http2.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(readByte));
                        throw null;
                    }
                    if (readInt != 0) {
                        Http2.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int readInt4 = this.f12600a.readInt();
                    int readInt5 = this.f12600a.readInt();
                    int i12 = readByte - 8;
                    ErrorCode[] values2 = ErrorCode.values();
                    int length2 = values2.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length2) {
                            errorCode2 = values2[i13];
                            if (errorCode2.f12504a != readInt5) {
                                i13++;
                            }
                        } else {
                            errorCode2 = null;
                        }
                    }
                    if (errorCode2 == null) {
                        Http2.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt5));
                        throw null;
                    }
                    i iVar = i.f17259d;
                    if (i12 > 0) {
                        iVar = this.f12600a.l(i12);
                    }
                    handler.i(readInt4, iVar);
                    return true;
                case 8:
                    if (readByte != 4) {
                        Http2.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(readByte));
                        throw null;
                    }
                    long readInt6 = this.f12600a.readInt() & 2147483647L;
                    if (readInt6 != 0) {
                        handler.d(readInt, readInt6);
                        return true;
                    }
                    Http2.b("windowSizeIncrement was 0", Long.valueOf(readInt6));
                    throw null;
                default:
                    this.f12600a.skip(readByte);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
