.class public final Lhb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lgb/h$a;


# direct methods
.method public constructor <init>(Lgb/h$a;)V
    .locals 0

    iput-object p1, p0, Lhb/f;->a:Lgb/h$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lhb/f;->a:Lgb/h$a;

    .line 2
    .line 3
    iget-wide v1, v0, Lgb/h$a;->a:J

    .line 4
    .line 5
    const-wide/16 v3, 0x2

    .line 6
    .line 7
    mul-long/2addr v3, v1

    .line 8
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    iget-object v3, v0, Lgb/h$a;->b:Lgb/h;

    .line 13
    .line 14
    iget-object v3, v3, Lgb/h;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 15
    .line 16
    iget-wide v4, v0, Lgb/h$a;->a:J

    .line 17
    .line 18
    invoke-virtual {v3, v4, v5, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    sget-object v3, Lgb/h;->c:Ljava/util/logging/Logger;

    .line 25
    .line 26
    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    new-array v5, v5, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    iget-object v0, v0, Lgb/h$a;->b:Lgb/h;

    .line 33
    .line 34
    iget-object v0, v0, Lgb/h;->a:Ljava/lang/String;

    .line 35
    .line 36
    aput-object v0, v5, v6

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    aput-object v1, v5, v0

    .line 44
    .line 45
    const-string v0, "Increased {0} to {1}"

    .line 46
    .line 47
    invoke-virtual {v3, v4, v0, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
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
