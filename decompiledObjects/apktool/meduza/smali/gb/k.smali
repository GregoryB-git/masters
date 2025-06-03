.class public final Lgb/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/b3;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledExecutorService;

.field public final b:Leb/h1;

.field public final c:Lgb/j$a;

.field public d:Lgb/k0;

.field public e:Leb/h1$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lgb/k;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lgb/k;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lgb/k0$a;Ljava/util/concurrent/ScheduledExecutorService;Leb/h1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/k;->c:Lgb/j$a;

    iput-object p2, p0, Lgb/k;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lgb/k;->b:Leb/h1;

    return-void
.end method


# virtual methods
.method public final a(Lgb/c3$a;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lgb/k;->b:Leb/h1;

    .line 2
    .line 3
    invoke-virtual {v0}, Leb/h1;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgb/k;->d:Lgb/k0;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lgb/k;->c:Lgb/j$a;

    .line 11
    .line 12
    check-cast v0, Lgb/k0$a;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v0, Lgb/k0;

    .line 18
    .line 19
    invoke-direct {v0}, Lgb/k0;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lgb/k;->d:Lgb/k0;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lgb/k;->e:Leb/h1$c;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v0, v0, Leb/h1$c;->a:Leb/h1$b;

    .line 29
    .line 30
    iget-boolean v1, v0, Leb/h1$b;->c:Z

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    iget-boolean v0, v0, Leb/h1$b;->b:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_0
    if-eqz v0, :cond_2

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iget-object v0, p0, Lgb/k;->d:Lgb/k0;

    .line 45
    .line 46
    invoke-virtual {v0}, Lgb/k0;->a()J

    .line 47
    .line 48
    .line 49
    move-result-wide v7

    .line 50
    iget-object v1, p0, Lgb/k;->b:Leb/h1;

    .line 51
    .line 52
    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 53
    .line 54
    iget-object v6, p0, Lgb/k;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 55
    .line 56
    move-object v2, p1

    .line 57
    move-wide v3, v7

    .line 58
    invoke-virtual/range {v1 .. v6}, Leb/h1;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Leb/h1$c;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lgb/k;->e:Leb/h1$c;

    .line 63
    .line 64
    sget-object p1, Lgb/k;->f:Ljava/util/logging/Logger;

    .line 65
    .line 66
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 67
    .line 68
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-string v2, "Scheduling DNS resolution backoff for {0}ns"

    .line 73
    .line 74
    invoke-virtual {p1, v0, v2, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
