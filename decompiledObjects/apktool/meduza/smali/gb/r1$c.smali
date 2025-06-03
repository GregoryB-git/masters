.class public final Lgb/r1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgb/r1;


# direct methods
.method public constructor <init>(Lgb/r1;)V
    .locals 0

    iput-object p1, p0, Lgb/r1$c;->a:Lgb/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-object p1, Lgb/r1;->e0:Ljava/util/logging/Logger;

    .line 2
    .line 3
    sget-object v0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 4
    .line 5
    const-string v1, "["

    .line 6
    .line 7
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lgb/r1$c;->a:Lgb/r1;

    .line 12
    .line 13
    iget-object v2, v2, Lgb/r1;->b:Leb/f0;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, "] Uncaught exception in the SynchronizationContext. Panic!"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1, v0, v1, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lgb/r1$c;->a:Lgb/r1;

    .line 31
    .line 32
    iget-boolean v0, p1, Lgb/r1;->A:Z

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p1, Lgb/r1;->A:Z

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lgb/r1;->L(Z)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p1, v0}, Lgb/r1;->Q(Z)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lgb/v1;

    .line 48
    .line 49
    invoke-direct {v0, p2}, Lgb/v1;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p1, Lgb/r1;->z:Leb/k0$j;

    .line 53
    .line 54
    iget-object p2, p1, Lgb/r1;->F:Lgb/f0;

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Lgb/f0;->i(Leb/k0$j;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p1, Lgb/r1;->R:Lgb/r1$m;

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-virtual {p2, v0}, Lgb/r1$m;->D(Leb/d0;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p1, Lgb/r1;->P:Lgb/n;

    .line 66
    .line 67
    sget-object v0, Leb/d$a;->d:Leb/d$a;

    .line 68
    .line 69
    const-string v1, "PANIC! Entering TRANSIENT_FAILURE"

    .line 70
    .line 71
    invoke-virtual {p2, v0, v1}, Lgb/n;->a(Leb/d$a;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p1, Lgb/r1;->s:Lgb/y;

    .line 75
    .line 76
    sget-object p2, Leb/n;->c:Leb/n;

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Lgb/y;->a(Leb/n;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    return-void
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
