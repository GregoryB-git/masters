.class public final Lnb/i$g$a$a;
.super Lnb/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnb/i$g$a;->a(Leb/h$b;Leb/s0;)Leb/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Leb/h;

.field public final synthetic d:Lnb/i$g$a;


# direct methods
.method public constructor <init>(Lnb/i$g$a;Leb/h;)V
    .locals 0

    iput-object p1, p0, Lnb/i$g$a$a;->d:Lnb/i$g$a;

    iput-object p2, p0, Lnb/i$g$a$a;->c:Leb/h;

    invoke-direct {p0}, Lnb/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final o(Leb/e1;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnb/i$g$a$a;->d:Lnb/i$g$a;

    .line 2
    .line 3
    iget-object v0, v0, Lnb/i$g$a;->a:Lnb/i$a;

    .line 4
    .line 5
    invoke-virtual {p1}, Leb/e1;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, v0, Lnb/i$a;->a:Lnb/i$f;

    .line 10
    .line 11
    iget-object v3, v2, Lnb/i$f;->e:Lnb/i$f$b;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    iget-object v2, v2, Lnb/i$f;->f:Lnb/i$f$a;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v0, v0, Lnb/i$a;->b:Lnb/i$a$a;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Lnb/i$a$a;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v0, v0, Lnb/i$a$a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 30
    .line 31
    .line 32
    :goto_1
    iget-object v0, p0, Lnb/i$g$a$a;->c:Leb/h;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lm/e;->o(Leb/e1;)V

    .line 35
    .line 36
    .line 37
    return-void
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
