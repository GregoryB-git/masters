.class public LR3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/A;


# instance fields
.field public final a:Lr4/a;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Lr4/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR3/d;->a:Lr4/a;

    .line 5
    .line 6
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LR3/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    new-instance v0, LR3/a;

    .line 14
    .line 15
    invoke-direct {v0, p0}, LR3/a;-><init>(LR3/d;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Lr4/a;->a(Lr4/a$a;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static synthetic c(LR3/d;Lr4/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LR3/d;->f(Lr4/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Ljava/util/concurrent/ExecutorService;LV3/A$b;Lr4/b;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LR3/d;->e(Ljava/util/concurrent/ExecutorService;LV3/A$b;Lr4/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Ljava/util/concurrent/ExecutorService;LV3/A$b;Lr4/b;)V
    .locals 0

    .line 1
    invoke-interface {p2}, Lr4/b;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p2, LR3/c;

    .line 9
    .line 10
    invoke-direct {p2, p0, p1}, LR3/c;-><init>(Ljava/util/concurrent/ExecutorService;LV3/A$b;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0
.end method


# virtual methods
.method public a(ZLV3/A$a;)V
    .locals 0

    .line 1
    iget-object p1, p0, LR3/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-interface {p2, p1}, LV3/A$a;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public b(Ljava/util/concurrent/ExecutorService;LV3/A$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LR3/d;->a:Lr4/a;

    .line 2
    .line 3
    new-instance v1, LR3/b;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, LR3/b;-><init>(Ljava/util/concurrent/ExecutorService;LV3/A$b;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lr4/a;->a(Lr4/a$a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final synthetic f(Lr4/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR3/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-interface {p1}, Lr4/b;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
