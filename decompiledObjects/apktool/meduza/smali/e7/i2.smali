.class public final Le7/i2;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/FutureTask<",
        "TV;>;",
        "Ljava/lang/Comparable<",
        "Le7/i2<",
        "TV;>;>;"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final synthetic d:Le7/e2;


# direct methods
.method public constructor <init>(Le7/e2;Ljava/lang/Runnable;ZLjava/lang/String;)V
    .locals 2

    iput-object p1, p0, Le7/i2;->d:Le7/e2;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzdi;->zza()Lcom/google/android/gms/internal/measurement/zzdf;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 1
    sget-object p2, Le7/e2;->t:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Le7/i2;->a:J

    iput-object p4, p0, Le7/i2;->c:Ljava/lang/String;

    iput-boolean p3, p0, Le7/i2;->b:Z

    const-wide p2, 0x7fffffffffffffffL

    cmp-long p2, v0, p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ld2/q;->zzj()Le7/a1;

    move-result-object p1

    .line 3
    iget-object p1, p1, Le7/a1;->o:Le7/b1;

    const-string p2, "Tasks index overflow"

    .line 4
    invoke-virtual {p1, p2}, Le7/b1;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Le7/e2;Ljava/util/concurrent/Callable;Z)V
    .locals 2

    iput-object p1, p0, Le7/i2;->d:Le7/e2;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzdi;->zza()Lcom/google/android/gms/internal/measurement/zzdf;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;

    move-result-object p2

    invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 5
    sget-object p2, Le7/e2;->t:Ljava/util/concurrent/atomic/AtomicLong;

    .line 6
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Le7/i2;->a:J

    const-string p2, "Task exception on worker thread"

    iput-object p2, p0, Le7/i2;->c:Ljava/lang/String;

    iput-boolean p3, p0, Le7/i2;->b:Z

    const-wide p2, 0x7fffffffffffffffL

    cmp-long p2, v0, p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ld2/q;->zzj()Le7/a1;

    move-result-object p1

    .line 7
    iget-object p1, p1, Le7/a1;->o:Le7/b1;

    const-string p2, "Tasks index overflow"

    .line 8
    invoke-virtual {p1, p2}, Le7/b1;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 6

    .line 1
    check-cast p1, Le7/i2;

    .line 2
    .line 3
    iget-boolean v0, p0, Le7/i2;->b:Z

    .line 4
    .line 5
    iget-boolean v1, p1, Le7/i2;->b:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, -0x1

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return v3

    .line 14
    :cond_0
    return v2

    .line 15
    :cond_1
    iget-wide v0, p0, Le7/i2;->a:J

    .line 16
    .line 17
    iget-wide v4, p1, Le7/i2;->a:J

    .line 18
    .line 19
    cmp-long p1, v0, v4

    .line 20
    .line 21
    if-gez p1, :cond_2

    .line 22
    .line 23
    return v3

    .line 24
    :cond_2
    cmp-long p1, v0, v4

    .line 25
    .line 26
    if-lez p1, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    iget-object p1, p0, Le7/i2;->d:Le7/e2;

    .line 30
    .line 31
    invoke-virtual {p1}, Ld2/q;->zzj()Le7/a1;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p1, p1, Le7/a1;->p:Le7/b1;

    .line 36
    .line 37
    iget-wide v0, p0, Le7/i2;->a:J

    .line 38
    .line 39
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "Two tasks share the same index. index"

    .line 44
    .line 45
    invoke-virtual {p1, v1, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    return p1
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

.method public final setException(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le7/i2;->d:Le7/e2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 8
    .line 9
    iget-object v1, p0, Le7/i2;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1}, Ljava/util/concurrent/FutureTask;->setException(Ljava/lang/Throwable;)V

    .line 15
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
.end method
