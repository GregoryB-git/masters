.class public abstract Lz4/l0;
.super Lz4/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lz4/f<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final s:Lz4/t;


# direct methods
.method public constructor <init>(Lz4/t;)V
    .locals 0

    invoke-direct {p0}, Lz4/f;-><init>()V

    iput-object p1, p0, Lz4/l0;->s:Lz4/t;

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Object;Lv3/r1;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p2}, Lz4/l0;->D(Lv3/r1;)V

    return-void
.end method

.method public C(Lz4/t$b;)Lz4/t$b;
    .locals 0

    return-object p1
.end method

.method public abstract D(Lv3/r1;)V
.end method

.method public E()V
    .locals 2

    iget-object v0, p0, Lz4/l0;->s:Lz4/t;

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lz4/f;->B(Lz4/h$d;Lz4/t;)V

    return-void
.end method

.method public final f()Lv3/o0;
    .locals 1

    iget-object v0, p0, Lz4/l0;->s:Lz4/t;

    invoke-interface {v0}, Lz4/t;->f()Lv3/o0;

    move-result-object v0

    return-object v0
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Lz4/l0;->s:Lz4/t;

    invoke-interface {v0}, Lz4/t;->i()Z

    move-result v0

    return v0
.end method

.method public final j()Lv3/r1;
    .locals 1

    iget-object v0, p0, Lz4/l0;->s:Lz4/t;

    invoke-interface {v0}, Lz4/t;->j()Lv3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final t(Lt5/l0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz4/f;->r:Lt5/l0;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Lv5/e0;->l(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lz4/f;->q:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p0}, Lz4/l0;->E()V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
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
.end method

.method public final x(Ljava/lang/Object;Lz4/t$b;)Lz4/t$b;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p2}, Lz4/l0;->C(Lz4/t$b;)Lz4/t$b;

    move-result-object p1

    return-object p1
.end method

.method public final y(Ljava/lang/Object;J)J
    .locals 0

    check-cast p1, Ljava/lang/Void;

    return-wide p2
.end method

.method public final z(ILjava/lang/Object;)I
    .locals 0

    check-cast p2, Ljava/lang/Void;

    return p1
.end method
