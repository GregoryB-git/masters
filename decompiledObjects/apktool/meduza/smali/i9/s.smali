.class public final Li9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/s$a;
    }
.end annotation


# instance fields
.field public final a:Li9/s$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li9/s$a;

    invoke-direct {v0}, Li9/s$a;-><init>()V

    iput-object v0, p0, Li9/s;->a:Li9/s$a;

    return-void
.end method


# virtual methods
.method public final a(Lj9/k;)V
    .locals 0

    return-void
.end method

.method public final b(Lg9/k0;)Lj9/b;
    .locals 0

    sget-object p1, Lj9/k$a;->a:Lj9/b;

    return-object p1
.end method

.method public final c(Lj9/k;)V
    .locals 0

    return-void
.end method

.method public final d()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lj9/k;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lj9/o;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Li9/s;->a:Li9/s$a;

    .line 2
    .line 3
    iget-object v0, v0, Li9/s$a;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/util/HashSet;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    return-object v0
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

.method public final g()V
    .locals 0

    return-void
.end method

.method public final h(Lt8/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/c<",
            "Lj9/i;",
            "Lj9/g;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final i(Ljava/lang/String;)Lj9/b;
    .locals 0

    sget-object p1, Lj9/k$a;->a:Lj9/b;

    return-object p1
.end method

.method public final j(Lj9/o;)V
    .locals 1

    iget-object v0, p0, Li9/s;->a:Li9/s$a;

    invoke-virtual {v0, p1}, Li9/s$a;->a(Lj9/o;)Z

    return-void
.end method

.method public final k(Lg9/k0;)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final l(Lg9/k0;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg9/k0;",
            ")",
            "Ljava/util/List<",
            "Lj9/i;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public final m(Lg9/k0;)V
    .locals 0

    return-void
.end method

.method public final n(Ljava/lang/String;Lj9/b;)V
    .locals 0

    return-void
.end method

.method public final start()V
    .locals 0

    return-void
.end method
