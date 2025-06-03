package e4;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1265a {

    /* renamed from: e4.a$a, reason: collision with other inner class name */
    public static class C0199a implements b {

        /* renamed from: b, reason: collision with root package name */
        public int f13952b = 0;

        /* renamed from: a, reason: collision with root package name */
        public List f13951a = new ArrayList();

        @Override // e4.AbstractC1265a.b
        public boolean a(byte[] bArr) {
            this.f13951a.add(bArr);
            this.f13952b += bArr.length;
            return true;
        }

        @Override // e4.AbstractC1265a.b
        public C1271g b() {
            byte[] bArr = new byte[this.f13952b];
            int i7 = 0;
            for (int i8 = 0; i8 < this.f13951a.size(); i8++) {
                byte[] bArr2 = (byte[]) this.f13951a.get(i8);
                System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
                i7 += bArr2.length;
            }
            return new C1271g(bArr);
        }
    }

    /* renamed from: e4.a$b */
    public interface b {
        boolean a(byte[] bArr);

        C1271g b();
    }

    /* renamed from: e4.a$c */
    public static class c implements b {

        /* renamed from: c, reason: collision with root package name */
        public static ThreadLocal f13953c = new C0200a();

        /* renamed from: d, reason: collision with root package name */
        public static ThreadLocal f13954d = new b();

        /* renamed from: a, reason: collision with root package name */
        public StringBuilder f13955a = new StringBuilder();

        /* renamed from: b, reason: collision with root package name */
        public ByteBuffer f13956b;

        /* renamed from: e4.a$c$a, reason: collision with other inner class name */
        public class C0200a extends ThreadLocal {
            @Override // java.lang.ThreadLocal
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CharsetDecoder initialValue() {
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                newDecoder.onMalformedInput(codingErrorAction);
                newDecoder.onUnmappableCharacter(codingErrorAction);
                return newDecoder;
            }
        }

        /* renamed from: e4.a$c$b */
        public class b extends ThreadLocal {
            @Override // java.lang.ThreadLocal
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CharsetEncoder initialValue() {
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                newEncoder.onMalformedInput(codingErrorAction);
                newEncoder.onUnmappableCharacter(codingErrorAction);
                return newEncoder;
            }
        }

        @Override // e4.AbstractC1265a.b
        public boolean a(byte[] bArr) {
            String c7 = c(bArr);
            if (c7 == null) {
                return false;
            }
            this.f13955a.append(c7);
            return true;
        }

        @Override // e4.AbstractC1265a.b
        public C1271g b() {
            if (this.f13956b != null) {
                return null;
            }
            return new C1271g(this.f13955a.toString());
        }

        public final String c(byte[] bArr) {
            try {
                return ((CharsetDecoder) f13953c.get()).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException unused) {
                return null;
            }
        }
    }

    public static b a(byte b7) {
        return b7 == 2 ? new C0199a() : new c();
    }
}
