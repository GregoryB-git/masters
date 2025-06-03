// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.nio.Buffer;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

public abstract class D5
{
    public static final Unsafe a;
    public static final Class b;
    public static final boolean c;
    public static final boolean d;
    public static final c e;
    public static final boolean f;
    public static final boolean g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final int v;
    public static final boolean w;
    
    static {
        final Unsafe unsafe = a = p();
        b = o3.a();
        final boolean b2 = c = A(Long.TYPE);
        final boolean b3 = d = A(Integer.TYPE);
        Object e2 = null;
        Label_0082: {
            if (unsafe != null) {
                if (b2) {
                    e2 = new a(unsafe);
                    break Label_0082;
                }
                if (b3) {
                    e2 = new b(unsafe);
                    break Label_0082;
                }
            }
            e2 = null;
        }
        e = (c)e2;
        final boolean b4 = false;
        f = (e2 != null && ((c)e2).j());
        g = (e2 != null && ((c)e2).h());
        final long n2 = h = o(byte[].class);
        i = o(boolean[].class);
        j = s(boolean[].class);
        k = o(int[].class);
        l = s(int[].class);
        m = o(long[].class);
        n = s(long[].class);
        o = o(float[].class);
        p = s(float[].class);
        q = o(double[].class);
        r = s(double[].class);
        s = o(Object[].class);
        t = s(Object[].class);
        final Field c2 = C();
        long objectFieldOffset;
        if (c2 != null && e2 != null) {
            objectFieldOffset = ((c)e2).a.objectFieldOffset(c2);
        }
        else {
            objectFieldOffset = -1L;
        }
        u = objectFieldOffset;
        v = (int)(n2 & 0x7L);
        boolean w2 = b4;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            w2 = true;
        }
        w = w2;
    }
    
    public static boolean A(final Class clazz) {
        try {
            final Class b = D5.b;
            final Class<Boolean> type = Boolean.TYPE;
            b.getMethod("peekLong", clazz, type);
            b.getMethod("pokeLong", clazz, Long.TYPE, type);
            final Class<Integer> type2 = Integer.TYPE;
            b.getMethod("pokeInt", clazz, type2, type);
            b.getMethod("peekInt", clazz, type);
            b.getMethod("pokeByte", clazz, Byte.TYPE);
            b.getMethod("peekByte", clazz);
            b.getMethod("pokeByteArray", clazz, byte[].class, type2, type2);
            b.getMethod("peekByteArray", clazz, byte[].class, type2, type2);
            return true;
        }
        finally {
            return false;
        }
    }
    
    public static Object B(final Object o, final long offset) {
        return D5.e.a.getObject(o, offset);
    }
    
    public static Field C() {
        final Field d = d(Buffer.class, "effectiveDirectAddress");
        if (d != null) {
            return d;
        }
        final Field d2 = d(Buffer.class, "address");
        if (d2 != null && d2.getType() == Long.TYPE) {
            return d2;
        }
        return null;
    }
    
    public static /* synthetic */ boolean D(final Object o, final long n) {
        return (byte)(t(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((n & 0x3L) << 3)) != 0;
    }
    
    public static /* synthetic */ boolean E(final Object o, final long n) {
        return (byte)(t(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((n & 0x3L) << 3)) != 0;
    }
    
    public static boolean F(final Object o, final long n) {
        return D5.e.k(o, n);
    }
    
    public static double a(final Object o, final long n) {
        return D5.e.a(o, n);
    }
    
    public static Object b(final Class cls) {
        try {
            return D5.a.allocateInstance(cls);
        }
        catch (InstantiationException cause) {
            throw new IllegalStateException(cause);
        }
    }
    
    public static Field d(final Class clazz, final String name) {
        try {
            return clazz.getDeclaredField(name);
        }
        finally {
            return null;
        }
    }
    
    public static void f(final Object o, final long n, final double n2) {
        D5.e.c(o, n, n2);
    }
    
    public static void g(final Object o, final long n, final float n2) {
        D5.e.d(o, n, n2);
    }
    
    public static void h(final Object o, final long n, final int n2) {
        D5.e.e(o, n, n2);
    }
    
    public static void i(final Object o, final long n, final long n2) {
        D5.e.f(o, n, n2);
    }
    
    public static void j(final Object o, final long offset, final Object x) {
        D5.e.a.putObject(o, offset, x);
    }
    
    public static /* synthetic */ void l(final Throwable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //     5: invokestatic    invokestatic   !!! ERROR
        //     8: astore_1       
        //     9: getstatic       getstatic      !!! ERROR
        //    12: astore_2       
        //    13: aload_0        
        //    14: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    17: astore_0       
        //    18: new             Ljava/lang/StringBuilder;
        //    21: dup            
        //    22: ldc_w           "platform method missing - proto runtime falling back to safer methods: "
        //    25: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    28: astore_3       
        //    29: aload_3        
        //    30: aload_0        
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: pop            
        //    35: aload_1        
        //    36: aload_2        
        //    37: ldc_w           "com.google.protobuf.UnsafeUtil"
        //    40: ldc_w           "logMissingMethod"
        //    43: aload_3        
        //    44: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    47: invokevirtual   invokevirtual  !!! ERROR
        //    50: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Invalid BootstrapMethods attribute entry: 2 additional arguments required for method java/lang/invoke/StringConcatFactory.makeConcatWithConstants, but only 1 specified.
        //     at com.strobel.assembler.ir.Error.invalidBootstrapMethodEntry(Error.java:244)
        //     at com.strobel.assembler.ir.MetadataReader.readAttributeCore(MetadataReader.java:267)
        //     at com.strobel.assembler.metadata.ClassFileReader.readAttributeCore(ClassFileReader.java:261)
        //     at com.strobel.assembler.ir.MetadataReader.inflateAttributes(MetadataReader.java:426)
        //     at com.strobel.assembler.metadata.ClassFileReader.visitAttributes(ClassFileReader.java:1134)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:439)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:377)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveType(MetadataSystem.java:129)
        //     at com.strobel.decompiler.NoRetryMetadataSystem.resolveType(DecompilerDriver.java:476)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveCore(MetadataSystem.java:81)
        //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:104)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:616)
        //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:128)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:626)
        //     at com.strobel.assembler.metadata.MethodReference.resolve(MethodReference.java:177)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2438)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:881)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void m(final byte[] array, final long n, final byte b) {
        D5.e.b(array, D5.h + n, b);
    }
    
    public static float n(final Object o, final long n) {
        return D5.e.i(o, n);
    }
    
    public static int o(final Class arrayClass) {
        if (D5.g) {
            return D5.e.a.arrayBaseOffset(arrayClass);
        }
        return -1;
    }
    
    public static Unsafe p() {
        try {
            return AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new C5());
        }
        finally {
            return null;
        }
    }
    
    public static int s(final Class arrayClass) {
        if (D5.g) {
            return D5.e.a.arrayIndexScale(arrayClass);
        }
        return -1;
    }
    
    public static int t(final Object o, final long n) {
        return D5.e.l(o, n);
    }
    
    public static void u(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int t = t(o, n2);
        final int n3 = ((int)n & 0x3) << 3;
        h(o, n2, (0xFF & b) << n3 | (t & 255 << n3));
    }
    
    public static void v(final Object o, final long n, final boolean b) {
        D5.e.g(o, n, b);
    }
    
    public static boolean w() {
        return D5.g;
    }
    
    public static long x(final Object o, final long n) {
        return D5.e.m(o, n);
    }
    
    public static void y(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int t = t(o, n2);
        final int n3 = ((int)n & 0x3) << 3;
        h(o, n2, (0xFF & b) << n3 | (t & 255 << n3));
    }
    
    public static boolean z() {
        return D5.f;
    }
    
    public static final class a extends c
    {
        public a(final Unsafe unsafe) {
            super(unsafe);
        }
        
        @Override
        public final double a(final Object o, final long n) {
            return Double.longBitsToDouble(((c)this).m(o, n));
        }
        
        @Override
        public final void b(final Object o, final long n, final byte b) {
            if (D5.w) {
                u(o, n, b);
                return;
            }
            y(o, n, b);
        }
        
        @Override
        public final void c(final Object o, final long n, final double value) {
            ((c)this).f(o, n, Double.doubleToLongBits(value));
        }
        
        @Override
        public final void d(final Object o, final long n, final float value) {
            ((c)this).e(o, n, Float.floatToIntBits(value));
        }
        
        @Override
        public final void g(final Object o, final long n, final boolean b) {
            if (D5.w) {
                u(o, n, (byte)(b ? 1 : 0));
                return;
            }
            y(o, n, (byte)(b ? 1 : 0));
        }
        
        @Override
        public final float i(final Object o, final long n) {
            return Float.intBitsToFloat(((c)this).l(o, n));
        }
        
        @Override
        public final boolean k(final Object o, final long n) {
            if (D5.w) {
                return D5.D(o, n);
            }
            return D5.E(o, n);
        }
    }
    
    public static final class b extends c
    {
        public b(final Unsafe unsafe) {
            super(unsafe);
        }
        
        @Override
        public final double a(final Object o, final long n) {
            return Double.longBitsToDouble(((c)this).m(o, n));
        }
        
        @Override
        public final void b(final Object o, final long n, final byte b) {
            if (D5.w) {
                u(o, n, b);
                return;
            }
            y(o, n, b);
        }
        
        @Override
        public final void c(final Object o, final long n, final double value) {
            ((c)this).f(o, n, Double.doubleToLongBits(value));
        }
        
        @Override
        public final void d(final Object o, final long n, final float value) {
            ((c)this).e(o, n, Float.floatToIntBits(value));
        }
        
        @Override
        public final void g(final Object o, final long n, final boolean b) {
            if (D5.w) {
                u(o, n, (byte)(b ? 1 : 0));
                return;
            }
            y(o, n, (byte)(b ? 1 : 0));
        }
        
        @Override
        public final float i(final Object o, final long n) {
            return Float.intBitsToFloat(((c)this).l(o, n));
        }
        
        @Override
        public final boolean k(final Object o, final long n) {
            if (D5.w) {
                return D5.D(o, n);
            }
            return D5.E(o, n);
        }
    }
    
    public abstract static class c
    {
        public Unsafe a;
        
        public c(final Unsafe a) {
            this.a = a;
        }
        
        public abstract double a(final Object p0, final long p1);
        
        public abstract void b(final Object p0, final long p1, final byte p2);
        
        public abstract void c(final Object p0, final long p1, final double p2);
        
        public abstract void d(final Object p0, final long p1, final float p2);
        
        public final void e(final Object o, final long offset, final int x) {
            this.a.putInt(o, offset, x);
        }
        
        public final void f(final Object o, final long offset, final long x) {
            this.a.putLong(o, offset, x);
        }
        
        public abstract void g(final Object p0, final long p1, final boolean p2);
        
        public final boolean h() {
            final Unsafe a = this.a;
            if (a == null) {
                return false;
            }
            try {
                final Class<? extends Unsafe> class1 = a.getClass();
                class1.getMethod("objectFieldOffset", Field.class);
                class1.getMethod("arrayBaseOffset", Class.class);
                class1.getMethod("arrayIndexScale", Class.class);
                final Class<Long> type = Long.TYPE;
                class1.getMethod("getInt", Object.class, type);
                class1.getMethod("putInt", Object.class, type, Integer.TYPE);
                class1.getMethod("getLong", Object.class, type);
                class1.getMethod("putLong", Object.class, type, type);
                class1.getMethod("getObject", Object.class, type);
                class1.getMethod("putObject", Object.class, type, Object.class);
                return true;
            }
            finally {
                final Throwable t;
                D5.l(t);
                return false;
            }
        }
        
        public abstract float i(final Object p0, final long p1);
        
        public final boolean j() {
            final Unsafe a = this.a;
            if (a == null) {
                return false;
            }
            try {
                final Class<? extends Unsafe> class1 = a.getClass();
                class1.getMethod("objectFieldOffset", Field.class);
                class1.getMethod("getLong", Object.class, Long.TYPE);
                return C() != null;
            }
            finally {
                final Throwable t;
                D5.l(t);
                return false;
            }
        }
        
        public abstract boolean k(final Object p0, final long p1);
        
        public final int l(final Object o, final long offset) {
            return this.a.getInt(o, offset);
        }
        
        public final long m(final Object o, final long offset) {
            return this.a.getLong(o, offset);
        }
    }
}
