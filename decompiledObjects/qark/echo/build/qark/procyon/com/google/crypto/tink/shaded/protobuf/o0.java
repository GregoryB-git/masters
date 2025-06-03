// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.nio.Buffer;
import java.security.AccessController;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

public abstract class o0
{
    public static final Unsafe a;
    public static final Class b;
    public static final boolean c;
    public static final boolean d;
    public static final e e;
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
        a = D();
        b = com.google.crypto.tink.shaded.protobuf.d.b();
        c = o(Long.TYPE);
        d = o(Integer.TYPE);
        e = B();
        f = T();
        g = S();
        final long n2 = h = l(byte[].class);
        i = l(boolean[].class);
        j = m(boolean[].class);
        k = l(int[].class);
        l = m(int[].class);
        m = l(long[].class);
        n = m(long[].class);
        o = l(float[].class);
        p = m(float[].class);
        q = l(double[].class);
        r = m(double[].class);
        s = l(Object[].class);
        t = m(Object[].class);
        u = q(n());
        v = (int)(n2 & 0x7L);
        w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
    }
    
    public static long A(final Object o, final long n) {
        return o0.e.h(o, n);
    }
    
    public static e B() {
        final Unsafe a = o0.a;
        Object o = null;
        if (a == null) {
            return null;
        }
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return (e)new d(a);
        }
        if (o0.c) {
            return (e)new c(a);
        }
        if (o0.d) {
            o = new b(a);
        }
        return (e)o;
    }
    
    public static Object C(final Object o, final long n) {
        return o0.e.i(o, n);
    }
    
    public static Unsafe D() {
        try {
            return AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new PrivilegedExceptionAction() {
                public Unsafe a() {
                    final Field[] declaredFields = Unsafe.class.getDeclaredFields();
                    for (int length = declaredFields.length, i = 0; i < length; ++i) {
                        final Field field = declaredFields[i];
                        field.setAccessible(true);
                        final Object value = field.get(null);
                        if (Unsafe.class.isInstance(value)) {
                            return Unsafe.class.cast(value);
                        }
                    }
                    return null;
                }
            });
        }
        finally {
            return null;
        }
    }
    
    public static boolean E() {
        return o0.g;
    }
    
    public static boolean F() {
        return o0.f;
    }
    
    public static void G(final Throwable p0) {
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
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: invokespecial   java/lang/StringBuilder.<init>:()V
        //    20: astore_3       
        //    21: aload_3        
        //    22: ldc             "platform method missing - proto runtime falling back to safer methods: "
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: pop            
        //    28: aload_3        
        //    29: aload_0        
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    33: pop            
        //    34: aload_1        
        //    35: aload_2        
        //    36: aload_3        
        //    37: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    40: invokevirtual   invokevirtual  !!! ERROR
        //    43: return         
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
    
    public static void H(final Object o, final long n, final boolean b) {
        o0.e.k(o, n, b);
    }
    
    public static void I(final Object o, final long n, final boolean b) {
        L(o, n, (byte)(b ? 1 : 0));
    }
    
    public static void J(final Object o, final long n, final boolean b) {
        M(o, n, (byte)(b ? 1 : 0));
    }
    
    public static void K(final byte[] array, final long n, final byte b) {
        o0.e.l(array, o0.h + n, b);
    }
    
    public static void L(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int z = z(o, n2);
        final int n3 = ((int)n & 0x3) << 3;
        P(o, n2, (0xFF & b) << n3 | (z & 255 << n3));
    }
    
    public static void M(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int z = z(o, n2);
        final int n3 = ((int)n & 0x3) << 3;
        P(o, n2, (0xFF & b) << n3 | (z & 255 << n3));
    }
    
    public static void N(final Object o, final long n, final double n2) {
        o0.e.m(o, n, n2);
    }
    
    public static void O(final Object o, final long n, final float n2) {
        o0.e.n(o, n, n2);
    }
    
    public static void P(final Object o, final long n, final int n2) {
        o0.e.o(o, n, n2);
    }
    
    public static void Q(final Object o, final long n, final long n2) {
        o0.e.p(o, n, n2);
    }
    
    public static void R(final Object o, final long n, final Object o2) {
        o0.e.q(o, n, o2);
    }
    
    public static boolean S() {
        final e e = o0.e;
        return e != null && e.r();
    }
    
    public static boolean T() {
        final e e = o0.e;
        return e != null && e.s();
    }
    
    public static Object k(final Class cls) {
        try {
            return o0.a.allocateInstance(cls);
        }
        catch (InstantiationException cause) {
            throw new IllegalStateException(cause);
        }
    }
    
    public static int l(final Class clazz) {
        if (o0.g) {
            return o0.e.a(clazz);
        }
        return -1;
    }
    
    public static int m(final Class clazz) {
        if (o0.g) {
            return o0.e.b(clazz);
        }
        return -1;
    }
    
    public static Field n() {
        if (com.google.crypto.tink.shaded.protobuf.d.c()) {
            final Field p = p(Buffer.class, "effectiveDirectAddress");
            if (p != null) {
                return p;
            }
        }
        final Field p2 = p(Buffer.class, "address");
        if (p2 != null && p2.getType() == Long.TYPE) {
            return p2;
        }
        return null;
    }
    
    public static boolean o(final Class clazz) {
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return false;
        }
        try {
            final Class b = o0.b;
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
    
    public static Field p(final Class clazz, final String name) {
        try {
            return clazz.getDeclaredField(name);
        }
        finally {
            return null;
        }
    }
    
    public static long q(final Field field) {
        if (field != null) {
            final e e = o0.e;
            if (e != null) {
                return e.j(field);
            }
        }
        return -1L;
    }
    
    public static boolean r(final Object o, final long n) {
        return o0.e.c(o, n);
    }
    
    public static boolean s(final Object o, final long n) {
        return v(o, n) != 0;
    }
    
    public static boolean t(final Object o, final long n) {
        return w(o, n) != 0;
    }
    
    public static byte u(final byte[] array, final long n) {
        return o0.e.d(array, o0.h + n);
    }
    
    public static byte v(final Object o, final long n) {
        return (byte)(z(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((n & 0x3L) << 3) & 0xFF);
    }
    
    public static byte w(final Object o, final long n) {
        return (byte)(z(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((n & 0x3L) << 3) & 0xFF);
    }
    
    public static double x(final Object o, final long n) {
        return o0.e.e(o, n);
    }
    
    public static float y(final Object o, final long n) {
        return o0.e.f(o, n);
    }
    
    public static int z(final Object o, final long n) {
        return o0.e.g(o, n);
    }
    
    public static final class b extends e
    {
        public b(final Unsafe unsafe) {
            super(unsafe);
        }
        
        @Override
        public boolean c(final Object o, final long n) {
            if (o0.w) {
                return s(o, n);
            }
            return t(o, n);
        }
        
        @Override
        public byte d(final Object o, final long n) {
            if (o0.w) {
                return v(o, n);
            }
            return w(o, n);
        }
        
        @Override
        public double e(final Object o, final long n) {
            return Double.longBitsToDouble(((e)this).h(o, n));
        }
        
        @Override
        public float f(final Object o, final long n) {
            return Float.intBitsToFloat(((e)this).g(o, n));
        }
        
        @Override
        public void k(final Object o, final long n, final boolean b) {
            if (o0.w) {
                I(o, n, b);
                return;
            }
            J(o, n, b);
        }
        
        @Override
        public void l(final Object o, final long n, final byte b) {
            if (o0.w) {
                L(o, n, b);
                return;
            }
            M(o, n, b);
        }
        
        @Override
        public void m(final Object o, final long n, final double value) {
            ((e)this).p(o, n, Double.doubleToLongBits(value));
        }
        
        @Override
        public void n(final Object o, final long n, final float value) {
            ((e)this).o(o, n, Float.floatToIntBits(value));
        }
        
        @Override
        public boolean s() {
            return false;
        }
    }
    
    public static final class c extends e
    {
        public c(final Unsafe unsafe) {
            super(unsafe);
        }
        
        @Override
        public boolean c(final Object o, final long n) {
            if (o0.w) {
                return s(o, n);
            }
            return t(o, n);
        }
        
        @Override
        public byte d(final Object o, final long n) {
            if (o0.w) {
                return v(o, n);
            }
            return w(o, n);
        }
        
        @Override
        public double e(final Object o, final long n) {
            return Double.longBitsToDouble(((e)this).h(o, n));
        }
        
        @Override
        public float f(final Object o, final long n) {
            return Float.intBitsToFloat(((e)this).g(o, n));
        }
        
        @Override
        public void k(final Object o, final long n, final boolean b) {
            if (o0.w) {
                I(o, n, b);
                return;
            }
            J(o, n, b);
        }
        
        @Override
        public void l(final Object o, final long n, final byte b) {
            if (o0.w) {
                L(o, n, b);
                return;
            }
            M(o, n, b);
        }
        
        @Override
        public void m(final Object o, final long n, final double value) {
            ((e)this).p(o, n, Double.doubleToLongBits(value));
        }
        
        @Override
        public void n(final Object o, final long n, final float value) {
            ((e)this).o(o, n, Float.floatToIntBits(value));
        }
        
        @Override
        public boolean s() {
            return false;
        }
    }
    
    public static final class d extends e
    {
        public d(final Unsafe unsafe) {
            super(unsafe);
        }
        
        @Override
        public boolean c(final Object o, final long offset) {
            return super.a.getBoolean(o, offset);
        }
        
        @Override
        public byte d(final Object o, final long offset) {
            return super.a.getByte(o, offset);
        }
        
        @Override
        public double e(final Object o, final long offset) {
            return super.a.getDouble(o, offset);
        }
        
        @Override
        public float f(final Object o, final long offset) {
            return super.a.getFloat(o, offset);
        }
        
        @Override
        public void k(final Object o, final long offset, final boolean x) {
            super.a.putBoolean(o, offset, x);
        }
        
        @Override
        public void l(final Object o, final long offset, final byte x) {
            super.a.putByte(o, offset, x);
        }
        
        @Override
        public void m(final Object o, final long offset, final double x) {
            super.a.putDouble(o, offset, x);
        }
        
        @Override
        public void n(final Object o, final long offset, final float x) {
            super.a.putFloat(o, offset, x);
        }
        
        @Override
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                final Class<? extends Unsafe> class1 = super.a.getClass();
                final Class<Long> type = Long.TYPE;
                class1.getMethod("getByte", Object.class, type);
                class1.getMethod("putByte", Object.class, type, Byte.TYPE);
                class1.getMethod("getBoolean", Object.class, type);
                class1.getMethod("putBoolean", Object.class, type, Boolean.TYPE);
                class1.getMethod("getFloat", Object.class, type);
                class1.getMethod("putFloat", Object.class, type, Float.TYPE);
                class1.getMethod("getDouble", Object.class, type);
                class1.getMethod("putDouble", Object.class, type, Double.TYPE);
                return true;
            }
            finally {
                final Throwable t;
                G(t);
                return false;
            }
        }
        
        @Override
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                final Class<? extends Unsafe> class1 = super.a.getClass();
                final Class<Long> type = Long.TYPE;
                class1.getMethod("getByte", type);
                class1.getMethod("putByte", type, Byte.TYPE);
                class1.getMethod("getInt", type);
                class1.getMethod("putInt", type, Integer.TYPE);
                class1.getMethod("getLong", type);
                class1.getMethod("putLong", type, type);
                class1.getMethod("copyMemory", type, type, type);
                class1.getMethod("copyMemory", Object.class, type, Object.class, type, type);
                return true;
            }
            finally {
                final Throwable t;
                G(t);
                return false;
            }
        }
    }
    
    public abstract static class e
    {
        public Unsafe a;
        
        public e(final Unsafe a) {
            this.a = a;
        }
        
        public final int a(final Class arrayClass) {
            return this.a.arrayBaseOffset(arrayClass);
        }
        
        public final int b(final Class arrayClass) {
            return this.a.arrayIndexScale(arrayClass);
        }
        
        public abstract boolean c(final Object p0, final long p1);
        
        public abstract byte d(final Object p0, final long p1);
        
        public abstract double e(final Object p0, final long p1);
        
        public abstract float f(final Object p0, final long p1);
        
        public final int g(final Object o, final long offset) {
            return this.a.getInt(o, offset);
        }
        
        public final long h(final Object o, final long offset) {
            return this.a.getLong(o, offset);
        }
        
        public final Object i(final Object o, final long offset) {
            return this.a.getObject(o, offset);
        }
        
        public final long j(final Field f) {
            return this.a.objectFieldOffset(f);
        }
        
        public abstract void k(final Object p0, final long p1, final boolean p2);
        
        public abstract void l(final Object p0, final long p1, final byte p2);
        
        public abstract void m(final Object p0, final long p1, final double p2);
        
        public abstract void n(final Object p0, final long p1, final float p2);
        
        public final void o(final Object o, final long offset, final int x) {
            this.a.putInt(o, offset, x);
        }
        
        public final void p(final Object o, final long offset, final long x) {
            this.a.putLong(o, offset, x);
        }
        
        public final void q(final Object o, final long offset, final Object x) {
            this.a.putObject(o, offset, x);
        }
        
        public boolean r() {
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
                G(t);
                return false;
            }
        }
        
        public boolean s() {
            final Unsafe a = this.a;
            if (a == null) {
                return false;
            }
            try {
                final Class<? extends Unsafe> class1 = a.getClass();
                class1.getMethod("objectFieldOffset", Field.class);
                class1.getMethod("getLong", Object.class, Long.TYPE);
                return n() != null;
            }
            finally {
                final Throwable t;
                G(t);
                return false;
            }
        }
    }
}
