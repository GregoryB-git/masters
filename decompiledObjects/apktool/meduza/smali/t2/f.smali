.class public final Lt2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lqc/e<",
        "Lt2/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:[Lqc/e;


# direct methods
.method public constructor <init>([Lqc/e;)V
    .locals 0

    iput-object p1, p0, Lt2/f;->a:[Lqc/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(Lqc/f;Lub/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v5, p0, Lt2/f;->a:[Lqc/e;

    .line 2
    .line 3
    new-instance v2, Lt2/f$a;

    .line 4
    .line 5
    invoke-direct {v2, v5}, Lt2/f$a;-><init>([Lqc/e;)V

    .line 6
    .line 7
    .line 8
    new-instance v3, Lt2/f$b;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {v3, v0}, Lt2/f$b;-><init>(Lub/e;)V

    .line 12
    .line 13
    .line 14
    new-instance v6, Lrc/j;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    move-object v0, v6

    .line 18
    move-object v4, p1

    .line 19
    invoke-direct/range {v0 .. v5}, Lrc/j;-><init>(Lub/e;Ldc/a;Ldc/q;Lqc/f;[Lqc/e;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lrc/l;

    .line 23
    .line 24
    invoke-interface {p2}, Lub/e;->getContext()Lub/h;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {p1, p2, v0}, Lrc/l;-><init>(Lub/e;Lub/h;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p1, v6}, Lx6/b;->t0(Lsc/s;Lsc/s;Ldc/p;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    sget-object p2, Lvb/a;->a:Lvb/a;

    .line 36
    .line 37
    if-ne p1, p2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 41
    .line 42
    :goto_0
    if-ne p1, p2, :cond_1

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 46
    .line 47
    return-object p1
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
