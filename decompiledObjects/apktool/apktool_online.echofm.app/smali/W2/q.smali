.class public final LW2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW2/q$b;,
        LW2/q$c;
    }
.end annotation


# instance fields
.field public final a:LW2/d;

.field public final b:Z

.field public final c:LW2/q$c;

.field public final d:I


# direct methods
.method public constructor <init>(LW2/q$c;)V
    .locals 3

    .line 1
    invoke-static {}, LW2/d;->f()LW2/d;

    move-result-object v0

    const v1, 0x7fffffff

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, LW2/q;-><init>(LW2/q$c;ZLW2/d;I)V

    return-void
.end method

.method public constructor <init>(LW2/q$c;ZLW2/d;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW2/q;->c:LW2/q$c;

    iput-boolean p2, p0, LW2/q;->b:Z

    iput-object p3, p0, LW2/q;->a:LW2/d;

    iput p4, p0, LW2/q;->d:I

    return-void
.end method

.method public static synthetic a(LW2/q;)LW2/d;
    .locals 0

    .line 1
    iget-object p0, p0, LW2/q;->a:LW2/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(LW2/q;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LW2/q;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(LW2/q;)I
    .locals 0

    .line 1
    iget p0, p0, LW2/q;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public static d(C)LW2/q;
    .locals 0

    .line 1
    invoke-static {p0}, LW2/d;->d(C)LW2/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LW2/q;->e(LW2/d;)LW2/q;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static e(LW2/d;)LW2/q;
    .locals 2

    .line 1
    invoke-static {p0}, LW2/m;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    new-instance v0, LW2/q;

    .line 5
    .line 6
    new-instance v1, LW2/q$a;

    .line 7
    .line 8
    invoke-direct {v1, p0}, LW2/q$a;-><init>(LW2/d;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, LW2/q;-><init>(LW2/q$c;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public f(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-static {p1}, LW2/m;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, LW2/q;->g(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public final g(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, LW2/q;->c:LW2/q$c;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, LW2/q$c;->a(LW2/q;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
