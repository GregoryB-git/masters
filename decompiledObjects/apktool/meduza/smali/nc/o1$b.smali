.class public final Lnc/o1$b;
.super Lnc/n1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnc/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final e:Lnc/o1;

.field public final f:Lnc/o1$c;

.field public final o:Lnc/p;

.field public final p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnc/o1;Lnc/o1$c;Lnc/p;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lnc/n1;-><init>()V

    iput-object p1, p0, Lnc/o1$b;->e:Lnc/o1;

    iput-object p2, p0, Lnc/o1$b;->f:Lnc/o1$c;

    iput-object p3, p0, Lnc/o1$b;->o:Lnc/p;

    iput-object p4, p0, Lnc/o1$b;->p:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lnc/o1$b;->l(Ljava/lang/Throwable;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lnc/o1$b;->e:Lnc/o1;

    .line 2
    .line 3
    iget-object v0, p0, Lnc/o1$b;->f:Lnc/o1$c;

    .line 4
    .line 5
    iget-object v1, p0, Lnc/o1$b;->o:Lnc/p;

    .line 6
    .line 7
    iget-object v2, p0, Lnc/o1$b;->p:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v3, Lnc/o1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lnc/o1;->O(Lsc/j;)Lnc/p;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1, v2}, Lnc/o1;->Y(Lnc/o1$c;Lnc/p;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1, v0, v2}, Lnc/o1;->y(Lnc/o1$c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Lnc/o1;->p(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void
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
