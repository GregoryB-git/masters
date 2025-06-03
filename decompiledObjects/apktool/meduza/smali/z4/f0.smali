.class public final Lz4/f0;
.super Lz4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz4/f0$b;,
        Lz4/f0$a;
    }
.end annotation


# static fields
.field public static final r:Lv3/i0;

.field public static final s:Lv3/o0;

.field public static final t:[B


# instance fields
.field public final p:J

.field public final q:Lv3/o0;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lv3/i0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "audio/raw"

    .line 7
    .line 8
    iput-object v1, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iput v1, v0, Lv3/i0$a;->x:I

    .line 12
    .line 13
    const v2, 0xac44

    .line 14
    .line 15
    .line 16
    iput v2, v0, Lv3/i0$a;->y:I

    .line 17
    .line 18
    iput v1, v0, Lv3/i0$a;->z:I

    .line 19
    .line 20
    invoke-virtual {v0}, Lv3/i0$a;->a()Lv3/i0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lz4/f0;->r:Lv3/i0;

    .line 25
    .line 26
    new-instance v2, Lv3/o0$a;

    .line 27
    .line 28
    invoke-direct {v2}, Lv3/o0$a;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v3, "SilenceMediaSource"

    .line 32
    .line 33
    iput-object v3, v2, Lv3/o0$a;->a:Ljava/lang/String;

    .line 34
    .line 35
    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 36
    .line 37
    iput-object v3, v2, Lv3/o0$a;->b:Landroid/net/Uri;

    .line 38
    .line 39
    iget-object v0, v0, Lv3/i0;->t:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v0, v2, Lv3/o0$a;->c:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v2}, Lv3/o0$a;->a()Lv3/o0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lz4/f0;->s:Lv3/o0;

    .line 48
    .line 49
    invoke-static {v1, v1}, Lv5/e0;->w(II)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    mul-int/lit16 v0, v0, 0x400

    .line 54
    .line 55
    new-array v0, v0, [B

    .line 56
    .line 57
    sput-object v0, Lz4/f0;->t:[B

    .line 58
    .line 59
    return-void
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

.method public constructor <init>(JLv3/o0;)V
    .locals 2

    invoke-direct {p0}, Lz4/a;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx6/b;->q(Z)V

    iput-wide p1, p0, Lz4/f0;->p:J

    iput-object p3, p0, Lz4/f0;->q:Lv3/o0;

    return-void
.end method


# virtual methods
.method public final f()Lv3/o0;
    .locals 1

    iget-object v0, p0, Lz4/f0;->q:Lv3/o0;

    return-object v0
.end method

.method public final g(Lz4/r;)V
    .locals 0

    return-void
.end method

.method public final h()V
    .locals 0

    return-void
.end method

.method public final o(Lz4/t$b;Lt5/b;J)Lz4/r;
    .locals 0

    new-instance p1, Lz4/f0$a;

    iget-wide p2, p0, Lz4/f0;->p:J

    invoke-direct {p1, p2, p3}, Lz4/f0$a;-><init>(J)V

    return-object p1
.end method

.method public final t(Lt5/l0;)V
    .locals 6

    new-instance p1, Lz4/g0;

    iget-wide v1, p0, Lz4/f0;->p:J

    iget-object v5, p0, Lz4/f0;->q:Lv3/o0;

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lz4/g0;-><init>(JZZLv3/o0;)V

    invoke-virtual {p0, p1}, Lz4/a;->v(Lv3/r1;)V

    return-void
.end method

.method public final w()V
    .locals 0

    return-void
.end method
