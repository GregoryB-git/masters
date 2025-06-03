.class public LQ3/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LV3/m;

.field public b:LV3/k;


# direct methods
.method public constructor <init>(LV3/m;LV3/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ3/n;->a:LV3/m;

    .line 5
    .line 6
    iput-object p2, p0, LQ3/n;->b:LV3/k;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(LQ3/n;)LV3/k;
    .locals 0

    .line 1
    iget-object p0, p0, LQ3/n;->b:LV3/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(LQ3/n;)LV3/m;
    .locals 0

    .line 1
    iget-object p0, p0, LQ3/n;->a:LV3/m;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public c()LV2/j;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, LQ3/n;->d(LQ3/e$e;)LV2/j;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public final d(LQ3/e$e;)LV2/j;
    .locals 2

    .line 1
    invoke-static {p1}, LY3/m;->l(LQ3/e$e;)LY3/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LQ3/n;->a:LV3/m;

    .line 6
    .line 7
    new-instance v1, LQ3/n$c;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, LQ3/n$c;-><init>(LQ3/n;LY3/g;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, LY3/g;->a()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, LV2/j;

    .line 20
    .line 21
    return-object p1
.end method

.method public final e(Ljava/lang/Object;Ld4/n;LQ3/e$e;)LV2/j;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/n;->b:LV3/k;

    .line 2
    .line 3
    invoke-static {v0}, LY3/n;->l(LV3/k;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQ3/n;->b:LV3/k;

    .line 7
    .line 8
    invoke-static {v0, p1}, LV3/C;->g(LV3/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LZ3/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LY3/n;->k(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, Ld4/o;->b(Ljava/lang/Object;Ld4/n;)Ld4/n;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p3}, LY3/m;->l(LQ3/e$e;)LY3/g;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-object p3, p0, LQ3/n;->a:LV3/m;

    .line 27
    .line 28
    new-instance v0, LQ3/n$a;

    .line 29
    .line 30
    invoke-direct {v0, p0, p1, p2}, LQ3/n$a;-><init>(LQ3/n;Ld4/n;LY3/g;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, v0}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, LY3/g;->a()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, LV2/j;

    .line 41
    .line 42
    return-object p1
.end method

.method public f(Ljava/lang/Object;)LV2/j;
    .locals 2

    .line 1
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, p1, v0, v1}, LQ3/n;->e(Ljava/lang/Object;Ld4/n;LQ3/e$e;)LV2/j;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public g(Ljava/lang/Object;D)LV2/j;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/n;->b:LV3/k;

    .line 2
    .line 3
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {v0, p2}, Ld4/r;->c(LV3/k;Ljava/lang/Object;)Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const/4 p3, 0x0

    .line 12
    invoke-virtual {p0, p1, p2, p3}, LQ3/n;->e(Ljava/lang/Object;Ld4/n;LQ3/e$e;)LV2/j;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public h(Ljava/lang/Object;Ljava/lang/String;)LV2/j;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/n;->b:LV3/k;

    .line 2
    .line 3
    invoke-static {v0, p2}, Ld4/r;->c(LV3/k;Ljava/lang/Object;)Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, p2, v0}, LQ3/n;->e(Ljava/lang/Object;Ld4/n;LQ3/e$e;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public i(Ljava/util/Map;)LV2/j;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LQ3/n;->j(Ljava/util/Map;LQ3/e$e;)LV2/j;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public final j(Ljava/util/Map;LQ3/e$e;)LV2/j;
    .locals 3

    .line 1
    iget-object v0, p0, LQ3/n;->b:LV3/k;

    .line 2
    .line 3
    invoke-static {v0, p1}, LY3/n;->e(LV3/k;Ljava/util/Map;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p2}, LY3/m;->l(LQ3/e$e;)LY3/g;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-object v1, p0, LQ3/n;->a:LV3/m;

    .line 12
    .line 13
    new-instance v2, LQ3/n$b;

    .line 14
    .line 15
    invoke-direct {v2, p0, v0, p2, p1}, LQ3/n$b;-><init>(LQ3/n;Ljava/util/Map;LY3/g;Ljava/util/Map;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, LY3/g;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, LV2/j;

    .line 26
    .line 27
    return-object p1
.end method
