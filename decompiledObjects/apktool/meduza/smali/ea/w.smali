.class public final Lea/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lea/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lea/w$c;,
        Lea/w$d;
    }
.end annotation


# static fields
.field public static final e:Lea/w$c;

.field public static final f:Lq0/c;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lub/h;

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lea/p;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lea/w$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lea/w$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lea/w$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lea/w;->e:Lea/w$c;

    .line 7
    .line 8
    sget-object v0, Lea/u;->a:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v1, Lp0/a;

    .line 11
    .line 12
    sget-object v2, Lea/w$b;->a:Lea/w$b;

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lp0/a;-><init>(Ldc/l;)V

    .line 15
    .line 16
    .line 17
    const/16 v2, 0xc

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lp2/m0;->Y(Ljava/lang/String;Lp0/a;I)Lq0/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lea/w;->f:Lq0/c;

    .line 24
    .line 25
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>(Landroid/content/Context;Lub/h;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lea/w;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lea/w;->b:Lub/h;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lea/w;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    sget-object v0, Lea/w;->e:Lea/w$c;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v0, Lea/w;->f:Lq0/c;

    .line 21
    .line 22
    sget-object v1, Lea/w$c;->a:[Ljc/h;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aget-object v1, v1, v2

    .line 26
    .line 27
    invoke-virtual {v0, p1, v1}, Lq0/c;->a(Ljava/lang/Object;Ljc/h;)Lr0/b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lr0/b;->getData()Lqc/e;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v0, Lea/w$e;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, v1}, Lea/w$e;-><init>(Lub/e;)V

    .line 39
    .line 40
    .line 41
    new-instance v2, Lqc/i;

    .line 42
    .line 43
    invoke-direct {v2, p1, v0}, Lqc/i;-><init>(Lqc/e;Lea/w$e;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Lea/w$f;

    .line 47
    .line 48
    invoke-direct {p1, v2, p0}, Lea/w$f;-><init>(Lqc/i;Lea/w;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lea/w;->d:Lea/w$f;

    .line 52
    .line 53
    invoke-static {p2}, Lnc/e0;->a(Lub/h;)Lsc/d;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance p2, Lea/w$a;

    .line 58
    .line 59
    invoke-direct {p2, p0, v1}, Lea/w$a;-><init>(Lea/w;Lub/e;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x3

    .line 63
    invoke-static {p1, v1, p2, v0}, Lx6/b;->g0(Lnc/d0;Ltc/b;Ldc/p;I)Lnc/z1;

    .line 64
    .line 65
    .line 66
    return-void
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


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lea/w;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lea/p;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lea/p;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lea/w;->b:Lub/h;

    invoke-static {v0}, Lnc/e0;->a(Lub/h;)Lsc/d;

    move-result-object v0

    new-instance v1, Lea/w$g;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lea/w$g;-><init>(Lea/w;Ljava/lang/String;Lub/e;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v1, p1}, Lx6/b;->g0(Lnc/d0;Ltc/b;Ldc/p;I)Lnc/z1;

    return-void
.end method
