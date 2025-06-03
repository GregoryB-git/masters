package u5;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public long f19832a;

    /* renamed from: b, reason: collision with root package name */
    public b f19833b;

    /* renamed from: c, reason: collision with root package name */
    public long f19834c;

    /* renamed from: d, reason: collision with root package name */
    public long f19835d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19836e;

    /* renamed from: f, reason: collision with root package name */
    public a f19837f;

    /* renamed from: g, reason: collision with root package name */
    public String f19838g;

    public enum a {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);


        /* renamed from: o, reason: collision with root package name */
        public final long f19845o;

        a(long j7) {
            this.f19845o = j7;
        }

        public long e() {
            return this.f19845o;
        }
    }

    public enum b {
        kDown(0),
        kUp(1),
        kRepeat(2);


        /* renamed from: o, reason: collision with root package name */
        public long f19850o;

        b(long j7) {
            this.f19850o = j7;
        }

        public long e() {
            return this.f19850o;
        }
    }

    public ByteBuffer a() {
        try {
            String str = this.f19838g;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.f19832a);
            allocateDirect.putLong(this.f19833b.e());
            allocateDirect.putLong(this.f19834c);
            allocateDirect.putLong(this.f19835d);
            allocateDirect.putLong(this.f19836e ? 1L : 0L);
            allocateDirect.putLong(this.f19837f.e());
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
