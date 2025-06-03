.class public LV3/x$f;
.super LS3/h$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/x;->w(LW3/d;LY3/d;Ld4/n;LV3/G;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ld4/n;

.field public final synthetic b:LV3/G;

.field public final synthetic c:LW3/d;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:LV3/x;


# direct methods
.method public constructor <init>(LV3/x;Ld4/n;LV3/G;LW3/d;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/x$f;->e:LV3/x;

    .line 2
    .line 3
    iput-object p2, p0, LV3/x$f;->a:Ld4/n;

    .line 4
    .line 5
    iput-object p3, p0, LV3/x$f;->b:LV3/G;

    .line 6
    .line 7
    iput-object p4, p0, LV3/x$f;->c:LW3/d;

    .line 8
    .line 9
    iput-object p5, p0, LV3/x$f;->d:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {p0}, LS3/h$b;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ld4/b;

    .line 2
    .line 3
    check-cast p2, LY3/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LV3/x$f;->b(Ld4/b;LY3/d;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Ld4/b;LY3/d;)V
    .locals 4

    .line 1
    iget-object v0, p0, LV3/x$f;->a:Ld4/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, LV3/x$f;->b:LV3/G;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, LV3/G;->h(Ld4/b;)LV3/G;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, LV3/x$f;->c:LW3/d;

    .line 18
    .line 19
    invoke-virtual {v2, p1}, LW3/d;->d(Ld4/b;)LW3/d;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, LV3/x$f;->d:Ljava/util/List;

    .line 26
    .line 27
    iget-object v3, p0, LV3/x$f;->e:LV3/x;

    .line 28
    .line 29
    invoke-static {v3, p1, p2, v0, v1}, LV3/x;->i(LV3/x;LW3/d;LY3/d;Ld4/n;LV3/G;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {v2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method
