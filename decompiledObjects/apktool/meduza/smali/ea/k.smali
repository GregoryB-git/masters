.class public final Lea/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lea/l;


# instance fields
.field public final a:Lt9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/b<",
            "Lh3/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt9/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/b<",
            "Lh3/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea/k;->a:Lt9/b;

    return-void
.end method


# virtual methods
.method public final a(Lea/y;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lea/k;->a:Lt9/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lt9/b;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lh3/i;

    .line 8
    .line 9
    new-instance v1, Lh3/c;

    .line 10
    .line 11
    const-string v2, "json"

    .line 12
    .line 13
    invoke-direct {v1, v2}, Lh3/c;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Ld;

    .line 17
    .line 18
    const/16 v3, 0xe

    .line 19
    .line 20
    invoke-direct {v2, p0, v3}, Ld;-><init>(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    const-string v3, "FIREBASE_APPQUALITY_SESSION"

    .line 24
    .line 25
    invoke-interface {v0, v3, v1, v2}, Lh3/i;->a(Ljava/lang/String;Lh3/c;Lh3/g;)Lk3/u;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Lh3/a;

    .line 30
    .line 31
    sget-object v2, Lh3/e;->a:Lh3/e;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v1, p1, v2, v3}, Lh3/a;-><init>(Ljava/lang/Object;Lh3/e;Lh3/b;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance p1, Lw3/v;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {p1, v2}, Lw3/v;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, p1}, Lk3/u;->a(Lh3/a;Lh3/j;)V

    .line 47
    .line 48
    .line 49
    return-void
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
