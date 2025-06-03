.class public abstract Lp1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp1/j;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final c:Lrb/g;


# direct methods
.method public constructor <init>(Lp1/j;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/p;->a:Lp1/j;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lp1/p;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lp1/p$a;

    invoke-direct {p1, p0}, Lp1/p$a;-><init>(Lp1/p;)V

    invoke-static {p1}, Lb/z;->n(Ldc/a;)Lrb/g;

    move-result-object p1

    iput-object p1, p0, Lp1/p;->c:Lrb/g;

    return-void
.end method


# virtual methods
.method public final a()Lt1/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lp1/p;->a:Lp1/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp1/j;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp1/p;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lp1/p;->c:Lrb/g;

    .line 17
    .line 18
    invoke-virtual {v0}, Lrb/g;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lt1/f;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Lp1/p;->b()Lt1/f;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    return-object v0
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

.method public final b()Lt1/f;
    .locals 3

    invoke-virtual {p0}, Lp1/p;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lp1/p;->a:Lp1/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "sql"

    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lp1/j;->a()V

    invoke-virtual {v1}, Lp1/j;->b()V

    invoke-virtual {v1}, Lp1/j;->g()Lt1/c;

    move-result-object v1

    invoke-interface {v1}, Lt1/c;->getWritableDatabase()Lt1/b;

    move-result-object v1

    invoke-interface {v1, v0}, Lt1/b;->q(Ljava/lang/String;)Lt1/f;

    move-result-object v0

    return-object v0
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public final d(Lt1/f;)V
    .locals 1

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp1/p;->c:Lrb/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Lrb/g;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lt1/f;

    .line 13
    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lp1/p;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
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
