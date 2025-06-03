.class public abstract Lma/k;
.super Lm/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lma/k$d;,
        Lma/k$a;,
        Lma/k$b;,
        Lma/k$c;
    }
.end annotation


# static fields
.field public static final c:Ljava/util/logging/Logger;

.field public static final d:Z


# instance fields
.field public b:Lma/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lma/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lma/k;->c:Ljava/util/logging/Logger;

    .line 12
    .line 13
    sget-boolean v0, Lma/t1;->e:Z

    .line 14
    .line 15
    sput-boolean v0, Lma/k;->d:Z

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x7

    invoke-direct {p0, v0}, Lm/e;-><init>(I)V

    return-void
.end method

.method public static A(I)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x8

    return p0
.end method

.method public static B(I)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x4

    return p0
.end method

.method public static C(ILma/s0;Lma/i1;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x2

    check-cast p1, Lma/a;

    invoke-virtual {p1, p2}, Lma/a;->m(Lma/i1;)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static D(II)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    invoke-static {p1}, Lma/k;->E(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static E(I)I
    .locals 0

    if-ltz p0, :cond_0

    invoke-static {p0}, Lma/k;->P(I)I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static F(IJ)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    invoke-static {p1, p2}, Lma/k;->R(J)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static G(Lma/f0;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lma/f0;->b:Lma/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lma/f0;->b:Lma/h;

    .line 6
    .line 7
    invoke-virtual {p0}, Lma/h;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lma/f0;->a:Lma/s0;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lma/f0;->a:Lma/s0;

    .line 17
    .line 18
    invoke-interface {p0}, Lma/s0;->d()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    :goto_0
    invoke-static {p0}, Lma/k;->P(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v0, p0

    .line 29
    return v0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public static H(I)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x4

    return p0
.end method

.method public static I(I)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x8

    return p0
.end method

.method public static J(II)I
    .locals 1

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    shl-int/lit8 v0, p1, 0x1

    shr-int/lit8 p1, p1, 0x1f

    xor-int/2addr p1, v0

    invoke-static {p1}, Lma/k;->P(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static K(IJ)I
    .locals 3

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    const/4 v0, 0x1

    shl-long v0, p1, v0

    const/16 v2, 0x3f

    shr-long/2addr p1, v2

    xor-long/2addr p1, v0

    invoke-static {p1, p2}, Lma/k;->R(J)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static L(ILjava/lang/String;)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    invoke-static {p1}, Lma/k;->M(Ljava/lang/String;)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static M(Ljava/lang/String;)I
    .locals 1

    :try_start_0
    invoke-static {p0}, Lma/u1;->b(Ljava/lang/CharSequence;)I

    move-result p0
    :try_end_0
    .catch Lma/u1$d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lma/a0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p0, p0

    :goto_0
    invoke-static {p0}, Lma/k;->P(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static N(I)I
    .locals 0

    shl-int/lit8 p0, p0, 0x3

    or-int/lit8 p0, p0, 0x0

    invoke-static {p0}, Lma/k;->P(I)I

    move-result p0

    return p0
.end method

.method public static O(II)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    invoke-static {p1}, Lma/k;->P(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static P(I)I
    .locals 1

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

.method public static Q(IJ)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    invoke-static {p1, p2}, Lma/k;->R(J)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static R(J)I
    .locals 6

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

    const/4 v0, 0x6

    const/16 v1, 0x1c

    ushr-long/2addr p0, v1

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

.method public static v(I)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static w(ILma/h;)I
    .locals 1

    .line 1
    invoke-static {p0}, Lma/k;->N(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, Lma/h;->size()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Lma/k;->P(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/2addr v0, p1

    .line 14
    add-int/2addr v0, p0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static x(I)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x8

    return p0
.end method

.method public static y(II)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    invoke-static {p1}, Lma/k;->E(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static z(I)I
    .locals 0

    invoke-static {p0}, Lma/k;->N(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x4

    return p0
.end method


# virtual methods
.method public final S(Ljava/lang/String;Lma/u1$d;)V
    .locals 3

    sget-object v0, Lma/k;->c:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    invoke-virtual {v0, v1, v2, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p2, Lma/a0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :try_start_0
    array-length p2, p1

    invoke-virtual {p0, p2}, Lma/k;->m0(I)V

    const/4 p2, 0x0

    array-length v0, p1

    invoke-virtual {p0, p1, p2, v0}, Lm/e;->s([BII)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lma/k$c;

    invoke-direct {p2, p1}, Lma/k$c;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    throw p2
.end method

.method public abstract T(B)V
.end method

.method public abstract U(IZ)V
.end method

.method public abstract V([BI)V
.end method

.method public abstract W(ILma/h;)V
.end method

.method public abstract X(Lma/h;)V
.end method

.method public abstract Y(II)V
.end method

.method public abstract Z(I)V
.end method

.method public abstract a0(IJ)V
.end method

.method public abstract b0(J)V
.end method

.method public abstract c0(II)V
.end method

.method public abstract d0(I)V
.end method

.method public abstract e0(ILma/s0;Lma/i1;)V
.end method

.method public abstract f0(Lma/s0;)V
.end method

.method public abstract g0(ILma/s0;)V
.end method

.method public abstract h0(ILma/h;)V
.end method

.method public abstract i0(ILjava/lang/String;)V
.end method

.method public abstract j0(Ljava/lang/String;)V
.end method

.method public abstract k0(II)V
.end method

.method public abstract l0(II)V
.end method

.method public abstract m0(I)V
.end method

.method public abstract n0(IJ)V
.end method

.method public abstract o0(J)V
.end method
