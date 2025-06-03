.class public final Lgb/r1$m$a;
.super Le9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/r1$m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lgb/r1$m;


# direct methods
.method public constructor <init>(Lgb/r1$m;)V
    .locals 0

    iput-object p1, p0, Lgb/r1$m$a;->b:Lgb/r1$m;

    invoke-direct {p0}, Le9/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgb/r1$m$a;->b:Lgb/r1$m;

    iget-object v0, v0, Lgb/r1$m;->c:Ljava/lang/String;

    return-object v0
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
    iget-object v0, p0, Lgb/r1$m$a;->b:Lgb/r1$m;

    .line 4
    .line 5
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 6
    .line 7
    sget-object v1, Lgb/r1;->e0:Ljava/util/logging/Logger;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, p2, Leb/c;->b:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lgb/r1;->i:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    move-object v2, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    :goto_0
    iget-object v0, p0, Lgb/r1$m$a;->b:Lgb/r1$m;

    .line 22
    .line 23
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 24
    .line 25
    iget-object v4, v0, Lgb/r1;->c0:Lgb/r1$e;

    .line 26
    .line 27
    iget-boolean v0, v0, Lgb/r1;->K:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iget-object v0, p0, Lgb/r1$m$a;->b:Lgb/r1$m;

    .line 34
    .line 35
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 36
    .line 37
    iget-object v0, v0, Lgb/r1;->g:Lgb/l;

    .line 38
    .line 39
    invoke-virtual {v0}, Lgb/l;->p0()Ljava/util/concurrent/ScheduledExecutorService;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_1
    move-object v5, v0

    .line 44
    iget-object v0, p0, Lgb/r1$m$a;->b:Lgb/r1$m;

    .line 45
    .line 46
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 47
    .line 48
    iget-object v6, v0, Lgb/r1;->N:Lgb/m;

    .line 49
    .line 50
    move-object v0, v7

    .line 51
    move-object v1, p1

    .line 52
    move-object v3, p2

    .line 53
    invoke-direct/range {v0 .. v6}, Lgb/q;-><init>(Leb/t0;Ljava/util/concurrent/Executor;Leb/c;Lgb/r1$e;Ljava/util/concurrent/ScheduledExecutorService;Lgb/m;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lgb/r1$m$a;->b:Lgb/r1$m;

    .line 57
    .line 58
    iget-object p1, p1, Lgb/r1$m;->e:Lgb/r1;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    iput-boolean p1, v7, Lgb/q;->q:Z

    .line 65
    .line 66
    iget-object p1, p0, Lgb/r1$m$a;->b:Lgb/r1$m;

    .line 67
    .line 68
    iget-object p1, p1, Lgb/r1$m;->e:Lgb/r1;

    .line 69
    .line 70
    iget-object p2, p1, Lgb/r1;->o:Leb/s;

    .line 71
    .line 72
    iput-object p2, v7, Lgb/q;->r:Leb/s;

    .line 73
    .line 74
    iget-object p1, p1, Lgb/r1;->p:Leb/m;

    .line 75
    .line 76
    iput-object p1, v7, Lgb/q;->s:Leb/m;

    .line 77
    .line 78
    return-object v7
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
