.class public final Lp1/n;
.super Lb1/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lb1/t<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final synthetic k:I


# instance fields
.field public final a:Lp1/j;

.field public final b:Ll/l;

.field public final c:Z

.field public final d:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final e:Lp1/m;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final i:Lb/m;

.field public final j:Lu/a;


# direct methods
.method public constructor <init>(Lp1/j;Ll/l;Lx2/v;[Ljava/lang/String;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lb1/t;-><init>()V

    iput-object p1, p0, Lp1/n;->a:Lp1/j;

    iput-object p2, p0, Lp1/n;->b:Ll/l;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp1/n;->c:Z

    iput-object p3, p0, Lp1/n;->d:Ljava/util/concurrent/Callable;

    new-instance p2, Lp1/m;

    invoke-direct {p2, p4, p0}, Lp1/m;-><init>([Ljava/lang/String;Lp1/n;)V

    iput-object p2, p0, Lp1/n;->e:Lp1/m;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lp1/n;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lp1/n;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lp1/n;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lb/m;

    const/4 p2, 0x6

    invoke-direct {p1, p0, p2}, Lb/m;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lp1/n;->i:Lb/m;

    new-instance p1, Lu/a;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, Lu/a;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lp1/n;->j:Lu/a;

    return-void
.end method


# virtual methods
.method public final onActive()V
    .locals 2

    .line 1
    invoke-super {p0}, Lb1/t;->onActive()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lp1/n;->b:Ll/l;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, v0, Ll/l;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Lp1/n;->c:Z

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lp1/n;->a:Lp1/j;

    .line 22
    .line 23
    iget-object v0, v0, Lp1/j;->c:Lp1/q;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v0, "internalTransactionExecutor"

    .line 29
    .line 30
    invoke-static {v0}, Lec/i;->i(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :cond_1
    iget-object v0, p0, Lp1/n;->a:Lp1/j;

    .line 35
    .line 36
    iget-object v0, v0, Lp1/j;->b:Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    :goto_0
    iget-object v1, p0, Lp1/n;->i:Lb/m;

    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    const-string v0, "internalQueryExecutor"

    .line 47
    .line 48
    invoke-static {v0}, Lec/i;->i(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v1
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

.method public final onInactive()V
    .locals 1

    invoke-super {p0}, Lb1/t;->onInactive()V

    iget-object v0, p0, Lp1/n;->b:Ll/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Ll/l;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
