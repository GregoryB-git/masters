.class public final Lg9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/j0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/k$b;,
        Lg9/k$a;
    }
.end annotation


# instance fields
.field public final a:Lg9/j0;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/util/HashSet;

.field public d:Lg9/d0;


# direct methods
.method public constructor <init>(Lg9/j0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lg9/k;->c:Ljava/util/HashSet;

    sget-object v0, Lg9/d0;->a:Lg9/d0;

    iput-object v0, p0, Lg9/k;->d:Lg9/d0;

    iput-object p1, p0, Lg9/k;->a:Lg9/j0;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lg9/k;->b:Ljava/util/HashMap;

    iput-object p0, p1, Lg9/j0;->n:Lg9/j0$b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg9/s0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lg9/s0;

    .line 17
    .line 18
    iget-object v2, v1, Lg9/s0;->a:Lg9/f0;

    .line 19
    .line 20
    iget-object v3, p0, Lg9/k;->b:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lg9/k$b;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    iget-object v3, v2, Lg9/k$b;->a:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lg9/g0;

    .line 47
    .line 48
    invoke-virtual {v4, v1}, Lg9/g0;->b(Lg9/s0;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iput-object v1, v2, Lg9/k$b;->b:Lg9/s0;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    if-eqz v0, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0}, Lg9/k;->b()V

    .line 62
    .line 63
    .line 64
    :cond_4
    return-void
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

.method public final b()V
    .locals 3

    iget-object v0, p0, Lg9/k;->c:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld9/l;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v2}, Ld9/l;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V

    goto :goto_0

    :cond_0
    return-void
.end method
