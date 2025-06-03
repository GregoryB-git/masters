.class public abstract Lcom/google/protobuf/h;
.super Lcom/google/protobuf/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/h$b;,
        Lcom/google/protobuf/h$c;
    }
.end annotation


# static fields
.field public static final c:Ljava/util/logging/Logger;

.field public static final d:Z


# instance fields
.field public a:Lcom/google/protobuf/i;

.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/protobuf/h;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/h;->c:Ljava/util/logging/Logger;

    invoke-static {}, Lcom/google/protobuf/k0;->E()Z

    move-result v0

    sput-boolean v0, Lcom/google/protobuf/h;->d:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/e;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/protobuf/h;-><init>()V

    return-void
.end method

.method public static A(ILcom/google/protobuf/K;Lcom/google/protobuf/Z;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/protobuf/h;->C(Lcom/google/protobuf/K;Lcom/google/protobuf/Z;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static B(Lcom/google/protobuf/K;)I
    .locals 0

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/K;->a()I

    move-result p0

    invoke-static {p0}, Lcom/google/protobuf/h;->z(I)I

    move-result p0

    return p0
.end method

.method public static C(Lcom/google/protobuf/K;Lcom/google/protobuf/Z;)I
    .locals 0

    .line 1
    check-cast p0, Lcom/google/protobuf/a;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/a;->h(Lcom/google/protobuf/Z;)I

    move-result p0

    invoke-static {p0}, Lcom/google/protobuf/h;->z(I)I

    move-result p0

    return p0
.end method

.method public static D(ILcom/google/protobuf/f;)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/protobuf/h;->O(I)I

    move-result v0

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    invoke-static {v1, p0}, Lcom/google/protobuf/h;->P(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Lcom/google/protobuf/h;->g(ILcom/google/protobuf/f;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static E(II)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/protobuf/h;->F(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static F(I)I
    .locals 0

    .line 1
    const/4 p0, 0x4

    return p0
.end method

.method public static G(IJ)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/protobuf/h;->H(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static H(J)I
    .locals 0

    .line 1
    const/16 p0, 0x8

    return p0
.end method

.method public static I(II)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/protobuf/h;->J(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static J(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->T(I)I

    move-result p0

    invoke-static {p0}, Lcom/google/protobuf/h;->Q(I)I

    move-result p0

    return p0
.end method

.method public static K(IJ)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/protobuf/h;->L(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static L(J)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/protobuf/h;->U(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/protobuf/h;->S(J)I

    move-result p0

    return p0
.end method

.method public static M(ILjava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/protobuf/h;->N(Ljava/lang/String;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static N(Ljava/lang/String;)I
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/google/protobuf/l0;->f(Ljava/lang/CharSequence;)I

    move-result p0
    :try_end_0
    .catch Lcom/google/protobuf/l0$c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lcom/google/protobuf/t;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p0, p0

    :goto_0
    invoke-static {p0}, Lcom/google/protobuf/h;->z(I)I

    move-result p0

    return p0
.end method

.method public static O(I)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/protobuf/m0;->c(II)I

    move-result p0

    invoke-static {p0}, Lcom/google/protobuf/h;->Q(I)I

    move-result p0

    return p0
.end method

.method public static P(II)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/protobuf/h;->Q(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static Q(I)I
    .locals 1

    .line 1
    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr p0, v0

    if-nez p0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0
.end method

.method public static R(IJ)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/protobuf/h;->S(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static S(J)I
    .locals 6

    .line 1
    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    cmp-long v0, p0, v2

    if-gez v0, :cond_1

    const/16 p0, 0xa

    return p0

    :cond_1
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    const/16 v0, 0x1c

    ushr-long/2addr p0, v0

    const/4 v0, 0x6

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    :goto_0
    const-wide/32 v4, -0x200000

    and-long/2addr v4, p0

    cmp-long v1, v4, v2

    if-eqz v1, :cond_3

    add-int/lit8 v0, v0, 0x2

    const/16 v1, 0xe

    ushr-long/2addr p0, v1

    :cond_3
    const-wide/16 v4, -0x4000

    and-long/2addr p0, v4

    cmp-long p0, p0, v2

    if-eqz p0, :cond_4

    add-int/lit8 v0, v0, 0x1

    :cond_4
    return v0
.end method

.method public static T(I)I
    .locals 1

    .line 1
    shl-int/lit8 v0, p0, 0x1

    shr-int/lit8 p0, p0, 0x1f

    xor-int/2addr p0, v0

    return p0
.end method

.method public static U(J)J
    .locals 3

    .line 1
    const/4 v0, 0x1

    shl-long v0, p0, v0

    const/16 v2, 0x3f

    shr-long/2addr p0, v2

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static X([B)Lcom/google/protobuf/h;
    .locals 2

    .line 1
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/google/protobuf/h;->Y([BII)Lcom/google/protobuf/h;

    move-result-object p0

    return-object p0
.end method

.method public static Y([BII)Lcom/google/protobuf/h;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/h$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/protobuf/h$b;-><init>([BII)V

    return-object v0
.end method

.method public static synthetic b()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/h;->d:Z

    return v0
.end method

.method public static d(IZ)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/protobuf/h;->e(Z)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static e(Z)I
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method

.method public static f([B)I
    .locals 0

    .line 1
    array-length p0, p0

    invoke-static {p0}, Lcom/google/protobuf/h;->z(I)I

    move-result p0

    return p0
.end method

.method public static g(ILcom/google/protobuf/f;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/protobuf/h;->h(Lcom/google/protobuf/f;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static h(Lcom/google/protobuf/f;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/f;->size()I

    move-result p0

    invoke-static {p0}, Lcom/google/protobuf/h;->z(I)I

    move-result p0

    return p0
.end method

.method public static i(ID)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/protobuf/h;->j(D)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static j(D)I
    .locals 0

    .line 1
    const/16 p0, 0x8

    return p0
.end method

.method public static k(II)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/protobuf/h;->l(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static l(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->w(I)I

    move-result p0

    return p0
.end method

.method public static m(II)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/protobuf/h;->n(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static n(I)I
    .locals 0

    .line 1
    const/4 p0, 0x4

    return p0
.end method

.method public static o(IJ)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/protobuf/h;->p(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static p(J)I
    .locals 0

    .line 1
    const/16 p0, 0x8

    return p0
.end method

.method public static q(IF)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/protobuf/h;->r(F)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static r(F)I
    .locals 0

    .line 1
    const/4 p0, 0x4

    return p0
.end method

.method public static s(ILcom/google/protobuf/K;Lcom/google/protobuf/Z;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x2

    invoke-static {p1, p2}, Lcom/google/protobuf/h;->u(Lcom/google/protobuf/K;Lcom/google/protobuf/Z;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static t(Lcom/google/protobuf/K;)I
    .locals 0

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/K;->a()I

    move-result p0

    return p0
.end method

.method public static u(Lcom/google/protobuf/K;Lcom/google/protobuf/Z;)I
    .locals 0

    .line 1
    check-cast p0, Lcom/google/protobuf/a;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/a;->h(Lcom/google/protobuf/Z;)I

    move-result p0

    return p0
.end method

.method public static v(II)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/protobuf/h;->w(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static w(I)I
    .locals 0

    .line 1
    if-ltz p0, :cond_0

    invoke-static {p0}, Lcom/google/protobuf/h;->Q(I)I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static x(IJ)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->O(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/protobuf/h;->y(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static y(J)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/protobuf/h;->S(J)I

    move-result p0

    return p0
.end method

.method public static z(I)I
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/h;->Q(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method


# virtual methods
.method public abstract A0(Lcom/google/protobuf/K;)V
.end method

.method public abstract B0(ILcom/google/protobuf/K;)V
.end method

.method public abstract C0(ILcom/google/protobuf/f;)V
.end method

.method public final D0(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/h;->l0(II)V

    return-void
.end method

.method public final E0(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/h;->m0(I)V

    return-void
.end method

.method public final F0(IJ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/h;->n0(IJ)V

    return-void
.end method

.method public final G0(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/h;->o0(J)V

    return-void
.end method

.method public final H0(II)V
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/google/protobuf/h;->T(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/h;->O0(II)V

    return-void
.end method

.method public final I0(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/h;->T(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/h;->P0(I)V

    return-void
.end method

.method public final J0(IJ)V
    .locals 0

    .line 1
    invoke-static {p2, p3}, Lcom/google/protobuf/h;->U(J)J

    move-result-wide p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/h;->Q0(IJ)V

    return-void
.end method

.method public final K0(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/google/protobuf/h;->U(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/h;->R0(J)V

    return-void
.end method

.method public abstract L0(ILjava/lang/String;)V
.end method

.method public abstract M0(Ljava/lang/String;)V
.end method

.method public abstract N0(II)V
.end method

.method public abstract O0(II)V
.end method

.method public abstract P0(I)V
.end method

.method public abstract Q0(IJ)V
.end method

.method public abstract R0(J)V
.end method

.method public final V(Ljava/lang/String;Lcom/google/protobuf/l0$c;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/protobuf/h;->c:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    invoke-virtual {v0, v1, v2, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p2, Lcom/google/protobuf/t;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :try_start_0
    array-length p2, p1

    invoke-virtual {p0, p2}, Lcom/google/protobuf/h;->P0(I)V

    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/google/protobuf/h;->a([BII)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/protobuf/h$c;

    invoke-direct {p2, p1}, Lcom/google/protobuf/h$c;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public W()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/protobuf/h;->b:Z

    return v0
.end method

.method public abstract Z()I
.end method

.method public abstract a([BII)V
.end method

.method public abstract a0(B)V
.end method

.method public abstract b0(IZ)V
.end method

.method public final c()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/h;->Z()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c0(Z)V
    .locals 0

    .line 1
    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/h;->a0(B)V

    return-void
.end method

.method public final d0([B)V
    .locals 2

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/protobuf/h;->e0([BII)V

    return-void
.end method

.method public abstract e0([BII)V
.end method

.method public abstract f0(ILcom/google/protobuf/f;)V
.end method

.method public abstract g0(Lcom/google/protobuf/f;)V
.end method

.method public final h0(ID)V
    .locals 0

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/h;->n0(IJ)V

    return-void
.end method

.method public final i0(D)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/h;->o0(J)V

    return-void
.end method

.method public final j0(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/h;->v0(II)V

    return-void
.end method

.method public final k0(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/h;->w0(I)V

    return-void
.end method

.method public abstract l0(II)V
.end method

.method public abstract m0(I)V
.end method

.method public abstract n0(IJ)V
.end method

.method public abstract o0(J)V
.end method

.method public final p0(IF)V
    .locals 0

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/h;->l0(II)V

    return-void
.end method

.method public final q0(F)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/h;->m0(I)V

    return-void
.end method

.method public final r0(ILcom/google/protobuf/K;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h;->N0(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/h;->t0(Lcom/google/protobuf/K;)V

    const/4 p2, 0x4

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/h;->N0(II)V

    return-void
.end method

.method public final s0(ILcom/google/protobuf/K;Lcom/google/protobuf/Z;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h;->N0(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/h;->u0(Lcom/google/protobuf/K;Lcom/google/protobuf/Z;)V

    const/4 p2, 0x4

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/h;->N0(II)V

    return-void
.end method

.method public final t0(Lcom/google/protobuf/K;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lcom/google/protobuf/K;->j(Lcom/google/protobuf/h;)V

    return-void
.end method

.method public final u0(Lcom/google/protobuf/K;Lcom/google/protobuf/Z;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/h;->a:Lcom/google/protobuf/i;

    invoke-interface {p2, p1, v0}, Lcom/google/protobuf/Z;->h(Ljava/lang/Object;Lcom/google/protobuf/n0;)V

    return-void
.end method

.method public abstract v0(II)V
.end method

.method public abstract w0(I)V
.end method

.method public final x0(IJ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/h;->Q0(IJ)V

    return-void
.end method

.method public final y0(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/h;->R0(J)V

    return-void
.end method

.method public abstract z0(ILcom/google/protobuf/K;Lcom/google/protobuf/Z;)V
.end method
