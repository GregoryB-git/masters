.class public LN5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/d$d;


# instance fields
.field public final a:Ls4/h;

.field public b:Lt4/a;


# direct methods
.method public constructor <init>(Ls4/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN5/j;->a:Ls4/h;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic c(LE5/d$b;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN5/j;->e(LE5/d$b;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(LE5/d$b;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "token"

    .line 7
    .line 8
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, LE5/d$b;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, LN5/j;->b:Lt4/a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, LN5/j;->b:Lt4/a;

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;LE5/d$b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, LN5/j;->d(LE5/d$b;)Lt4/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LN5/j;->b:Lt4/a;

    .line 6
    .line 7
    iget-object p2, p0, LN5/j;->a:Ls4/h;

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Ls4/h;->F(Lt4/a;)Lt4/b;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public d(LE5/d$b;)Lt4/a;
    .locals 1

    .line 1
    new-instance v0, LN5/i;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LN5/i;-><init>(LE5/d$b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
