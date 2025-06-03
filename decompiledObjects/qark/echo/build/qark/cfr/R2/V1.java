/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteFullException
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  java.io.File
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 */
package R2;

import R2.B;
import R2.C;
import R2.C3;
import R2.D4;
import R2.G1;
import R2.G2;
import R2.I;
import R2.N2;
import R2.R5;
import R2.S1;
import R2.S5;
import R2.U1;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.e;
import R2.f;
import R2.f1;
import R2.g;
import R2.l2;
import R2.l5;
import R2.m3;
import R2.v4;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.io.File;
import java.util.List;

public final class V1
extends f1 {
    public final U1 c;
    public boolean d;

    public V1(N2 n22) {
        super(n22);
        this.c = new U1(this, this.a(), "google_app_measurement_local.db");
    }

    /*
     * Exception decompiling
     */
    public static long B(SQLiteDatabase var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SIMPLE_IF_TAKEN]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    private final boolean L() {
        return this.a().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override
    public final boolean A() {
        return false;
    }

    /*
     * Exception decompiling
     */
    public final List C(int var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[TRYBLOCK]], but top level block is 17[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean D(int var1_1, byte[] var2_2) {
        this.n();
        if (this.d) {
            return false;
        }
        var14_6 = new ContentValues();
        var14_6.put("type", Integer.valueOf((int)var1_1));
        var14_6.put("entry", (byte[])var2_2);
        var4_7 = 0;
        var3_8 = 5;
        do {
            block35 : {
                if (var4_7 >= 5) {
                    this.j().K().a("Failed to write entry to local database");
                    return false;
                }
                var9_10 = null;
                var13_24 = null;
                var12_23 = null;
                var10_16 = null;
                var11_20 = null;
                var2_2 = this.K();
                if (var2_2 != null) break block35;
                var10_16 = var11_20;
                var9_10 = var2_2;
                this.d = true;
                if (var2_2 == null) return false;
                var2_2.close();
                return false;
            }
            var10_16 = var11_20;
            var9_10 = var2_2;
            var2_2.beginTransaction();
            var10_16 = var11_20;
            var9_10 = var2_2;
            var11_20 = var2_2.rawQuery("select count(1) from messages", null);
            if (var11_20 == null) ** GOTO lbl-1000
            if (var11_20.moveToFirst()) {
                var5_9 = var11_20.getLong(0);
            } else lbl-1000: // 2 sources:
            {
                var5_9 = 0L;
            }
            if (var5_9 < 100000L) ** GOTO lbl59
            this.j().G().a("Data loss, local db full");
            var5_9 = 100001L - var5_9;
            try {
                var7_25 = var2_2.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString((long)var5_9)});
                if (var7_25 == var5_9) ** GOTO lbl59
                this.j().G().d("Different delete count than expected in local db. expected, received, difference", var5_9, var7_25, var5_9 - var7_25);
                ** GOTO lbl59
            }
            catch (Throwable var10_17) {
                block41 : {
                    block42 : {
                        block43 : {
                            block38 : {
                                block40 : {
                                    block36 : {
                                        block39 : {
                                            block37 : {
                                                var9_10 = var2_2;
                                                break block41;
                                                catch (SQLiteException var9_12) {
                                                    ** GOTO lbl85
                                                }
                                                catch (SQLiteFullException var9_13) {
                                                    var12_23 = var11_20;
                                                    var11_20 = var9_13;
                                                    break block36;
                                                }
lbl59: // 3 sources:
                                                var2_2.insertOrThrow("messages", null, var14_6);
                                                var2_2.setTransactionSuccessful();
                                                var2_2.endTransaction();
                                                if (var11_20 != null) {
                                                    var11_20.close();
                                                }
                                                var2_2.close();
                                                return true;
                                                catch (Throwable var2_4) {
                                                    var9_10 = null;
                                                    break;
                                                }
                                                catch (SQLiteException var10_18) {
                                                    var2_2 = null;
                                                    break block37;
                                                }
                                                catch (SQLiteFullException var11_22) {
                                                    var2_2 = null;
                                                    break block36;
                                                }
                                                catch (SQLiteDatabaseLockedException var2_5) {}
                                                var2_2 = null;
                                                var11_20 = var13_24;
                                                break block38;
                                                catch (SQLiteDatabaseLockedException var9_14) {
                                                    break block38;
                                                }
                                                catch (Throwable var2_3) {
                                                    break;
                                                }
                                                catch (SQLiteException var9_11) {
                                                    var11_20 = null;
lbl85: // 2 sources:
                                                    var10_16 = var9_10;
                                                    var9_10 = var2_2;
                                                    var2_2 = var11_20;
                                                    break block37;
                                                }
                                                catch (SQLiteFullException var11_21) {
                                                    break block36;
                                                }
                                            }
                                            if (var9_10 == null) ** GOTO lbl96
                                            try {
                                                if (var9_10.inTransaction()) {
                                                    var9_10.endTransaction();
                                                }
lbl96: // 4 sources:
                                                this.j().G().b("Error writing entry to local database", (Object)var10_16);
                                                this.d = true;
                                                if (var2_2 == null) break block39;
                                            }
                                            catch (Throwable var10_19) {
                                                var11_20 = var2_2;
                                            }
                                            var2_2.close();
                                        }
                                        var1_1 = var3_8;
                                        if (var9_10 != null) {
                                            var9_10.close();
                                            var1_1 = var3_8;
                                        }
                                        break block42;
                                    }
                                    var10_16 = var12_23;
                                    var9_10 = var2_2;
                                    {
                                        this.j().G().b("Error writing entry; local database full", (Object)var11_20);
                                        var10_16 = var12_23;
                                        var9_10 = var2_2;
                                        this.d = true;
                                        if (var12_23 == null) break block40;
                                    }
                                    var12_23.close();
                                }
                                var1_1 = var3_8;
                                if (var2_2 == null) break block42;
                                var1_1 = var3_8;
                                break block43;
                                catch (SQLiteDatabaseLockedException var9_15) {
                                    var11_20 = var13_24;
                                }
                            }
                            var5_9 = var3_8;
                            var10_16 = var11_20;
                            var9_10 = var2_2;
                            {
                                SystemClock.sleep((long)var5_9);
                            }
                            var3_8 += 20;
                            if (var11_20 != null) {
                                var11_20.close();
                            }
                            var1_1 = var3_8;
                            if (var2_2 == null) break block42;
                            var1_1 = var3_8;
                        }
                        var2_2.close();
                    }
                    ++var4_7;
                    var3_8 = var1_1;
                    continue;
                }
                var2_2 = var10_16;
                var10_16 = var11_20;
            }
            break;
        } while (true);
        if (var10_16 != null) {
            var10_16.close();
        }
        if (var9_10 == null) throw var2_2;
        var9_10.close();
        throw var2_2;
    }

    public final boolean E(e arrby) {
        this.k();
        arrby = S5.p0((Parcelable)arrby);
        if (arrby.length > 131072) {
            this.j().I().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return this.D(2, arrby);
    }

    public final boolean F(I arrby) {
        Parcel parcel = Parcel.obtain();
        arrby.writeToParcel(parcel, 0);
        arrby = parcel.marshall();
        parcel.recycle();
        if (arrby.length > 131072) {
            this.j().I().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return this.D(0, arrby);
    }

    public final boolean G(R5 arrby) {
        Parcel parcel = Parcel.obtain();
        arrby.writeToParcel(parcel, 0);
        arrby = parcel.marshall();
        parcel.recycle();
        if (arrby.length > 131072) {
            this.j().I().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return this.D(1, arrby);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void H() {
        SQLiteDatabase sQLiteDatabase;
        this.n();
        try {
            sQLiteDatabase = this.K();
            if (sQLiteDatabase == null) return;
        }
        catch (SQLiteException sQLiteException) {}
        int n8 = sQLiteDatabase.delete("messages", null, null);
        if (n8 <= 0) return;
        this.j().K().b("Reset local analytics data. records", n8);
        return;
        this.j().G().b("Error resetting local analytics data. error", (Object)sQLiteException);
    }

    public final boolean I() {
        return this.D(3, new byte[0]);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean J() {
        this.n();
        if (this.d) {
            return false;
        }
        if (!this.L()) {
            return false;
        }
        var2_1 = 5;
        var3_2 = 0;
        do {
            block18 : {
                block19 : {
                    block17 : {
                        block16 : {
                            if (var3_2 >= 5) {
                                this.j().L().a("Error deleting app launch break from local database in reasonable time");
                                return false;
                            }
                            var5_6 = null;
                            var6_9 = null;
                            var7_11 = null;
                            var4_4 = null;
                            var8_12 = this.K();
                            if (var8_12 != null) break block16;
                            var4_4 = var8_12;
                            var5_6 = var8_12;
                            var6_9 = var8_12;
                            var7_11 = var8_12;
                            this.d = true;
                            if (var8_12 == null) return false;
                            var8_12.close();
                            return false;
                        }
                        var4_4 = var8_12;
                        var5_6 = var8_12;
                        var6_9 = var8_12;
                        var7_11 = var8_12;
                        try {
                            var8_12.beginTransaction();
                            var4_4 = var8_12;
                            var5_6 = var8_12;
                            var6_9 = var8_12;
                            var7_11 = var8_12;
                            var8_12.delete("messages", "type == ?", new String[]{Integer.toString((int)3)});
                            var4_4 = var8_12;
                            var5_6 = var8_12;
                            var6_9 = var8_12;
                            var7_11 = var8_12;
                            var8_12.setTransactionSuccessful();
                            var4_4 = var8_12;
                            var5_6 = var8_12;
                            var6_9 = var8_12;
                            var7_11 = var8_12;
                            var8_12.endTransaction();
                        }
                        catch (Throwable var5_7) {
                            ** GOTO lbl80
                        }
                        catch (SQLiteException var6_10) {
                            break block17;
                        }
                        catch (SQLiteFullException var5_8) {
                            ** GOTO lbl71
                        }
                        var8_12.close();
                        return true;
                    }
                    if (var5_6 == null) ** GOTO lbl63
                    var4_4 = var5_6;
                    {
                        if (var5_6.inTransaction()) {
                            var4_4 = var5_6;
                            var5_6.endTransaction();
                        }
lbl63: // 4 sources:
                        var4_4 = var5_6;
                        this.j().G().b("Error deleting app launch break from local database", (Object)var6_10);
                        var4_4 = var5_6;
                        this.d = true;
                        var1_3 = var2_1;
                        if (var5_6 == null) break block18;
                        var1_3 = var2_1;
                        break block19;
lbl71: // 1 sources:
                        var4_4 = var6_9;
                        {
                            this.j().G().b("Error deleting app launch break from local database", (Object)var5_8);
                            var4_4 = var6_9;
                            this.d = true;
                            var1_3 = var2_1;
                            if (var6_9 == null) break block18;
                            var1_3 = var2_1;
                            var5_6 = var6_9;
                            break block19;
                        }
lbl80: // 1 sources:
                        if (var4_4 == null) throw var5_7;
                        var4_4.close();
                        throw var5_7;
                        catch (SQLiteDatabaseLockedException var4_5) {}
                        var4_4 = var7_11;
                        SystemClock.sleep((long)var2_1);
                    }
                    var1_3 = var2_1 += 20;
                    if (var7_11 == null) break block18;
                    var5_6 = var7_11;
                    var1_3 = var2_1;
                }
                var5_6.close();
            }
            ++var3_2;
            var2_1 = var1_3;
        } while (true);
    }

    public final SQLiteDatabase K() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase = this.c.getWritableDatabase();
        if (sQLiteDatabase == null) {
            this.d = true;
            return null;
        }
        return sQLiteDatabase;
    }
}

