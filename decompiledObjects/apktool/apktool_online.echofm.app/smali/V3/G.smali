.class public LV3/G;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LV3/k;

.field public final b:LV3/F;


# direct methods
.method public constructor <init>(LV3/k;LV3/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/G;->a:LV3/k;

    .line 5
    .line 6
    iput-object p2, p0, LV3/G;->b:LV3/F;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ld4/b;La4/a;)Ld4/n;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/G;->b:LV3/F;

    .line 2
    .line 3
    iget-object v1, p0, LV3/G;->a:LV3/k;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2}, LV3/F;->c(LV3/k;Ld4/b;La4/a;)Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public b(Ld4/n;)Ld4/n;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, v0}, LV3/G;->c(Ld4/n;Ljava/util/List;)Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public c(Ld4/n;Ljava/util/List;)Ld4/n;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, LV3/G;->d(Ld4/n;Ljava/util/List;Z)Ld4/n;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public d(Ld4/n;Ljava/util/List;Z)Ld4/n;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/G;->b:LV3/F;

    .line 2
    .line 3
    iget-object v1, p0, LV3/G;->a:LV3/k;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2, p3}, LV3/F;->d(LV3/k;Ld4/n;Ljava/util/List;Z)Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public e(Ld4/n;)Ld4/n;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/G;->b:LV3/F;

    .line 2
    .line 3
    iget-object v1, p0, LV3/G;->a:LV3/k;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LV3/F;->e(LV3/k;Ld4/n;)Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public f(LV3/k;Ld4/n;Ld4/n;)Ld4/n;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/G;->b:LV3/F;

    .line 2
    .line 3
    iget-object v1, p0, LV3/G;->a:LV3/k;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2, p3}, LV3/F;->f(LV3/k;LV3/k;Ld4/n;Ld4/n;)Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public g(Ld4/n;Ld4/m;ZLd4/h;)Ld4/m;
    .locals 6

    .line 1
    iget-object v0, p0, LV3/G;->b:LV3/F;

    .line 2
    .line 3
    iget-object v1, p0, LV3/G;->a:LV3/k;

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move v4, p3

    .line 8
    move-object v5, p4

    .line 9
    invoke-virtual/range {v0 .. v5}, LV3/F;->g(LV3/k;Ld4/n;Ld4/m;ZLd4/h;)Ld4/m;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public h(Ld4/b;)LV3/G;
    .locals 2

    .line 1
    new-instance v0, LV3/G;

    .line 2
    .line 3
    iget-object v1, p0, LV3/G;->a:LV3/k;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, LV3/k;->U(Ld4/b;)LV3/k;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, LV3/G;->b:LV3/F;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, LV3/G;-><init>(LV3/k;LV3/F;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public i(LV3/k;)Ld4/n;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/G;->b:LV3/F;

    .line 2
    .line 3
    iget-object v1, p0, LV3/G;->a:LV3/k;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, LV3/k;->T(LV3/k;)LV3/k;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, LV3/F;->o(LV3/k;)Ld4/n;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
