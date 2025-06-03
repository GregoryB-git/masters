.class public Lm5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/d$b;


# instance fields
.field public a:LE5/d$b;


# direct methods
.method public constructor <init>(LE5/c;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE5/d;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, LE5/d;-><init>(LE5/c;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lm5/e$a;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lm5/e$a;-><init>(Lm5/e;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, LE5/d;->d(LE5/d$d;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic d(Lm5/e;LE5/d$b;)LE5/d$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lm5/e;->a:LE5/d$b;

    .line 2
    .line 3
    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/e;->a:LE5/d$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, LE5/d$b;->a(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/e;->a:LE5/d$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, LE5/d$b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/e;->a:LE5/d$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LE5/d$b;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
