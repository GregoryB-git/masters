package u5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import v5.a;
import v5.e0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, i> f15030a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<String> f15031b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f15032c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f15033d = new SparseBooleanArray();

    /* renamed from: e, reason: collision with root package name */
    public c f15034e;
    public c f;

    public static final class a implements c {

        /* renamed from: e, reason: collision with root package name */
        public static final String[] f15035e = {"id", Constants.KEY, "metadata"};

        /* renamed from: a, reason: collision with root package name */
        public final y3.b f15036a;

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<i> f15037b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        public String f15038c;

        /* renamed from: d, reason: collision with root package name */
        public String f15039d;

        public a(y3.c cVar) {
            this.f15036a = cVar;
        }

        @Override // u5.j.c
        public final void a(HashMap<String, i> hashMap) {
            try {
                SQLiteDatabase writableDatabase = this.f15036a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    j(writableDatabase);
                    Iterator<i> it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f15037b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new y3.a(e10);
            }
        }

        @Override // u5.j.c
        public final void b(i iVar, boolean z10) {
            if (z10) {
                this.f15037b.delete(iVar.f15023a);
            } else {
                this.f15037b.put(iVar.f15023a, null);
            }
        }

        @Override // u5.j.c
        public final boolean c() {
            try {
                SQLiteDatabase readableDatabase = this.f15036a.getReadableDatabase();
                String str = this.f15038c;
                str.getClass();
                return y3.e.a(readableDatabase, 1, str) != -1;
            } catch (SQLException e10) {
                throw new y3.a(e10);
            }
        }

        @Override // u5.j.c
        public final void d(HashMap<String, i> hashMap) {
            if (this.f15037b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f15036a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.f15037b.size(); i10++) {
                    try {
                        i valueAt = this.f15037b.valueAt(i10);
                        if (valueAt == null) {
                            int keyAt = this.f15037b.keyAt(i10);
                            String str = this.f15039d;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                        } else {
                            i(writableDatabase, valueAt);
                        }
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f15037b.clear();
            } catch (SQLException e10) {
                throw new y3.a(e10);
            }
        }

        @Override // u5.j.c
        public final void e(long j10) {
            String hexString = Long.toHexString(j10);
            this.f15038c = hexString;
            this.f15039d = defpackage.g.d("ExoPlayerCacheIndex", hexString);
        }

        @Override // u5.j.c
        public final void f(i iVar) {
            this.f15037b.put(iVar.f15023a, iVar);
        }

        @Override // u5.j.c
        public final void g(HashMap<String, i> hashMap, SparseArray<String> sparseArray) {
            x6.b.H(this.f15037b.size() == 0);
            try {
                SQLiteDatabase readableDatabase = this.f15036a.getReadableDatabase();
                String str = this.f15038c;
                str.getClass();
                if (y3.e.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = this.f15036a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        j(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                SQLiteDatabase readableDatabase2 = this.f15036a.getReadableDatabase();
                String str2 = this.f15039d;
                str2.getClass();
                Cursor query = readableDatabase2.query(str2, f15035e, null, null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        int i10 = query.getInt(0);
                        String string = query.getString(1);
                        string.getClass();
                        hashMap.put(string, new i(i10, string, j.a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                        sparseArray.put(i10, string);
                    } finally {
                    }
                }
                query.close();
            } catch (SQLiteException e10) {
                hashMap.clear();
                sparseArray.clear();
                throw new y3.a(e10);
            }
        }

        @Override // u5.j.c
        public final void h() {
            y3.b bVar = this.f15036a;
            String str = this.f15038c;
            str.getClass();
            try {
                String str2 = "ExoPlayerCacheIndex" + str;
                SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    int i10 = y3.e.f17425a;
                    try {
                        int i11 = e0.f15881a;
                        if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                            writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                        writableDatabase.setTransactionSuccessful();
                    } catch (SQLException e10) {
                        throw new y3.a(e10);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e11) {
                throw new y3.a(e11);
            }
        }

        public final void i(SQLiteDatabase sQLiteDatabase, i iVar) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            j.b(iVar.f15027e, new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(iVar.f15023a));
            contentValues.put(Constants.KEY, iVar.f15024b);
            contentValues.put("metadata", byteArray);
            String str = this.f15039d;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        public final void j(SQLiteDatabase sQLiteDatabase) {
            String str = this.f15038c;
            str.getClass();
            y3.e.b(sQLiteDatabase, 1, str);
            String str2 = this.f15039d;
            str2.getClass();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f15039d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f15040a = false;

        /* renamed from: b, reason: collision with root package name */
        public final Cipher f15041b = null;

        /* renamed from: c, reason: collision with root package name */
        public final SecretKeySpec f15042c = null;

        /* renamed from: d, reason: collision with root package name */
        public final SecureRandom f15043d = null;

        /* renamed from: e, reason: collision with root package name */
        public final v5.a f15044e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public o f15045g;

        public b(File file) {
            this.f15044e = new v5.a(file);
        }

        public static int i(i iVar, int i10) {
            int hashCode = iVar.f15024b.hashCode() + (iVar.f15023a * 31);
            if (i10 >= 2) {
                return (hashCode * 31) + iVar.f15027e.hashCode();
            }
            long d10 = defpackage.f.d(iVar.f15027e);
            return (hashCode * 31) + ((int) (d10 ^ (d10 >>> 32)));
        }

        public static i j(int i10, DataInputStream dataInputStream) {
            m a10;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i10 < 2) {
                long readLong = dataInputStream.readLong();
                l lVar = new l();
                Long valueOf = Long.valueOf(readLong);
                HashMap hashMap = lVar.f15046a;
                valueOf.getClass();
                hashMap.put("exo_len", valueOf);
                lVar.f15047b.remove("exo_len");
                a10 = m.f15048c.a(lVar);
            } else {
                a10 = j.a(dataInputStream);
            }
            return new i(readInt, readUTF, a10);
        }

        @Override // u5.j.c
        public final void a(HashMap<String, i> hashMap) {
            DataOutputStream dataOutputStream;
            o oVar;
            try {
                a.C0250a b10 = this.f15044e.b();
                o oVar2 = this.f15045g;
                if (oVar2 == null) {
                    this.f15045g = new o(b10);
                } else {
                    oVar2.f(b10);
                }
                oVar = this.f15045g;
                dataOutputStream = new DataOutputStream(oVar);
            } catch (Throwable th) {
                th = th;
                dataOutputStream = null;
            }
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.f15040a ? 1 : 0);
                if (this.f15040a) {
                    byte[] bArr = new byte[16];
                    SecureRandom secureRandom = this.f15043d;
                    int i10 = e0.f15881a;
                    secureRandom.nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.f15041b.init(1, this.f15042c, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(oVar, this.f15041b));
                    } catch (InvalidAlgorithmParameterException e10) {
                        e = e10;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e11) {
                        e = e11;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(hashMap.size());
                int i11 = 0;
                for (i iVar : hashMap.values()) {
                    dataOutputStream.writeInt(iVar.f15023a);
                    dataOutputStream.writeUTF(iVar.f15024b);
                    j.b(iVar.f15027e, dataOutputStream);
                    i11 += i(iVar, 2);
                }
                dataOutputStream.writeInt(i11);
                v5.a aVar = this.f15044e;
                aVar.getClass();
                dataOutputStream.close();
                aVar.f15862b.delete();
                int i12 = e0.f15881a;
                this.f = false;
            } catch (Throwable th2) {
                th = th2;
                e0.g(dataOutputStream);
                throw th;
            }
        }

        @Override // u5.j.c
        public final void b(i iVar, boolean z10) {
            this.f = true;
        }

        @Override // u5.j.c
        public final boolean c() {
            v5.a aVar = this.f15044e;
            return aVar.f15861a.exists() || aVar.f15862b.exists();
        }

        @Override // u5.j.c
        public final void d(HashMap<String, i> hashMap) {
            if (this.f) {
                a(hashMap);
            }
        }

        @Override // u5.j.c
        public final void e(long j10) {
        }

        @Override // u5.j.c
        public final void f(i iVar) {
            this.f = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
        @Override // u5.j.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(java.util.HashMap<java.lang.String, u5.i> r11, android.util.SparseArray<java.lang.String> r12) {
            /*
                Method dump skipped, instructions count: 223
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: u5.j.b.g(java.util.HashMap, android.util.SparseArray):void");
        }

        @Override // u5.j.c
        public final void h() {
            v5.a aVar = this.f15044e;
            aVar.f15861a.delete();
            aVar.f15862b.delete();
        }
    }

    public interface c {
        void a(HashMap<String, i> hashMap);

        void b(i iVar, boolean z10);

        boolean c();

        void d(HashMap<String, i> hashMap);

        void e(long j10);

        void f(i iVar);

        void g(HashMap<String, i> hashMap, SparseArray<String> sparseArray);

        void h();
    }

    public j(y3.c cVar, File file) {
        a aVar = new a(cVar);
        b bVar = new b(new File(file, "cached_content_index.exi"));
        this.f15034e = aVar;
        this.f = bVar;
    }

    public static m a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < readInt; i10++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                throw new IOException(defpackage.f.h("Invalid value size: ", readInt2));
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = e0.f;
            int i11 = 0;
            while (i11 != readInt2) {
                int i12 = i11 + min;
                bArr = Arrays.copyOf(bArr, i12);
                dataInputStream.readFully(bArr, i11, min);
                min = Math.min(readInt2 - i12, 10485760);
                i11 = i12;
            }
            hashMap.put(readUTF, bArr);
        }
        return new m(hashMap);
    }

    public static void b(m mVar, DataOutputStream dataOutputStream) {
        Set<Map.Entry<String, byte[]>> entrySet = mVar.f15050b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry<String, byte[]> entry : entrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public final i c(String str) {
        return this.f15030a.get(str);
    }

    public final i d(String str) {
        i iVar = this.f15030a.get(str);
        if (iVar != null) {
            return iVar;
        }
        SparseArray<String> sparseArray = this.f15031b;
        int size = sparseArray.size();
        int i10 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            keyAt = i10;
        }
        i iVar2 = new i(keyAt, str, m.f15048c);
        this.f15030a.put(str, iVar2);
        this.f15031b.put(keyAt, str);
        this.f15033d.put(keyAt, true);
        this.f15034e.f(iVar2);
        return iVar2;
    }

    public final void e(long j10) {
        c cVar;
        this.f15034e.e(j10);
        c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.e(j10);
        }
        if (this.f15034e.c() || (cVar = this.f) == null || !cVar.c()) {
            this.f15034e.g(this.f15030a, this.f15031b);
        } else {
            this.f.g(this.f15030a, this.f15031b);
            this.f15034e.a(this.f15030a);
        }
        c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.h();
            this.f = null;
        }
    }

    public final void f(String str) {
        i iVar = this.f15030a.get(str);
        if (iVar != null && iVar.f15025c.isEmpty() && iVar.f15026d.isEmpty()) {
            this.f15030a.remove(str);
            int i10 = iVar.f15023a;
            boolean z10 = this.f15033d.get(i10);
            this.f15034e.b(iVar, z10);
            SparseArray<String> sparseArray = this.f15031b;
            if (z10) {
                sparseArray.remove(i10);
                this.f15033d.delete(i10);
            } else {
                sparseArray.put(i10, null);
                this.f15032c.put(i10, true);
            }
        }
    }

    public final void g() {
        this.f15034e.d(this.f15030a);
        int size = this.f15032c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15031b.remove(this.f15032c.keyAt(i10));
        }
        this.f15032c.clear();
        this.f15033d.clear();
    }
}
