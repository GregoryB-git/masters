.class public final Lnc/c$a;
.super Lnc/n1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnc/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# static fields
.field public static final p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _disposer:Ljava/lang/Object;

.field public final e:Lnc/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnc/k<",
            "Ljava/util/List<",
            "+TT;>;>;"
        }
    .end annotation
.end field

.field public f:Lnc/t0;

.field public final synthetic o:Lnc/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnc/c<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lnc/c$a;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_disposer"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lnc/c$a;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lnc/c;Lnc/l;)V
    .locals 0

    iput-object p1, p0, Lnc/c$a;->o:Lnc/c;

    invoke-direct {p0}, Lnc/n1;-><init>()V

    iput-object p2, p0, Lnc/c$a;->e:Lnc/k;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lnc/c$a;->l(Ljava/lang/Throwable;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lnc/c$a;->e:Lnc/k;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lnc/k;->e(Ljava/lang/Throwable;)Ld2/h0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lnc/c$a;->e:Lnc/k;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lnc/k;->n(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lnc/c$a;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lnc/c$b;

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1}, Lnc/c$b;->i()V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    sget-object p1, Lnc/c;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 31
    .line 32
    iget-object v0, p0, Lnc/c$a;->o:Lnc/c;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Lnc/c$a;->e:Lnc/k;

    .line 41
    .line 42
    iget-object v0, p0, Lnc/c$a;->o:Lnc/c;

    .line 43
    .line 44
    iget-object v0, v0, Lnc/c;->a:[Lnc/j0;

    .line 45
    .line 46
    new-instance v1, Ljava/util/ArrayList;

    .line 47
    .line 48
    array-length v2, v0

    .line 49
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    array-length v3, v0

    .line 54
    :goto_0
    if-ge v2, v3, :cond_1

    .line 55
    .line 56
    aget-object v4, v0, v2

    .line 57
    .line 58
    invoke-interface {v4}, Lnc/j0;->getCompleted()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-interface {p1, v1}, Lub/e;->resumeWith(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    :goto_1
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
