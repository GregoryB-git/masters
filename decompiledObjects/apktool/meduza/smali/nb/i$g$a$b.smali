.class public final Lnb/i$g$a$b;
.super Leb/h;
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
.field public final synthetic c:Lnb/i$g$a;


# direct methods
.method public constructor <init>(Lnb/i$g$a;)V
    .locals 0

    iput-object p1, p0, Lnb/i$g$a$b;->c:Lnb/i$g$a;

    invoke-direct {p0}, Leb/h;-><init>()V

    return-void
.end method


# virtual methods
.method public final o(Leb/e1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnb/i$g$a$b;->c:Lnb/i$g$a;

    .line 2
    .line 3
    iget-object v0, v0, Lnb/i$g$a;->a:Lnb/i$a;

    .line 4
    .line 5
    invoke-virtual {p1}, Leb/e1;->e()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, v0, Lnb/i$a;->a:Lnb/i$f;

    .line 10
    .line 11
    iget-object v2, v1, Lnb/i$f;->e:Lnb/i$f$b;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iget-object v1, v1, Lnb/i$f;->f:Lnb/i$f$a;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object p1, v0, Lnb/i$a;->b:Lnb/i$a$a;

    .line 23
    .line 24
    iget-object p1, p1, Lnb/i$a$a;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p1, v0, Lnb/i$a;->b:Lnb/i$a$a;

    .line 28
    .line 29
    iget-object p1, p1, Lnb/i$a$a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 30
    .line 31
    :goto_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 32
    .line 33
    .line 34
    :goto_1
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
