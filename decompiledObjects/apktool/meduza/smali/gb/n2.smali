.class public final Lgb/n2;
.super Leb/n0;
.source "SourceFile"

# interfaces
.implements Leb/e0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leb/n0;",
        "Leb/e0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lgb/n2;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    return-void
.end method


# virtual methods
.method public final C(JLjava/util/concurrent/TimeUnit;)Z
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final E()Leb/n;
    .locals 1

    sget-object v0, Leb/n;->d:Leb/n;

    return-object v0
.end method

.method public final G()Leb/n0;
    .locals 2

    sget-object v0, Leb/e1;->n:Leb/e1;

    const-string v1, "OobChannel.shutdown() called"

    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    const/4 v0, 0x0

    throw v0
.end method

.method public final H()Leb/n0;
    .locals 2

    sget-object v0, Leb/e1;->n:Leb/e1;

    const-string v1, "OobChannel.shutdownNow() called"

    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    const/4 v0, 0x0

    throw v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Leb/f0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    const/4 v0, 0x0

    throw v0
.end method

.method public final v(Leb/t0;Leb/c;)Leb/e;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestT:",
            "Ljava/lang/Object;",
            "ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/t0<",
            "TRequestT;TResponseT;>;",
            "Leb/c;",
            ")",
            "Leb/e<",
            "TRequestT;TResponseT;>;"
        }
    .end annotation

    .line 1
    new-instance v7, Lgb/q;

    .line 2
    .line 3
    iget-object v0, p2, Leb/c;->b:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :cond_0
    move-object v2, v0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    move-object v0, v7

    .line 13
    move-object v1, p1

    .line 14
    move-object v3, p2

    .line 15
    invoke-direct/range {v0 .. v6}, Lgb/q;-><init>(Leb/t0;Ljava/util/concurrent/Executor;Leb/c;Lgb/r1$e;Ljava/util/concurrent/ScheduledExecutorService;Lgb/m;)V

    .line 16
    .line 17
    .line 18
    return-object v7
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
