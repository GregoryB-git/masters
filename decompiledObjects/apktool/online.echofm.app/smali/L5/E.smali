.class public LL5/E;
.super LL5/c;
.source "SourceFile"

# interfaces
.implements LQ3/s;


# direct methods
.method public constructor <init>(LE5/d$b;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, LL5/c;-><init>(LE5/d$b;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LQ3/c;)V
    .locals 3

    .line 1
    invoke-static {p1}, LL5/y;->a(LQ3/c;)LL5/y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LL5/c;->a:LE5/d$b;

    .line 6
    .line 7
    invoke-virtual {p1}, LL5/y;->e()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, LL5/y;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p1}, LL5/y;->d()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {v0, v1, v2, p1}, LE5/d$b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public b(LQ3/b;)V
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, p1, v1}, LL5/c;->h(Ljava/lang/String;LQ3/b;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
