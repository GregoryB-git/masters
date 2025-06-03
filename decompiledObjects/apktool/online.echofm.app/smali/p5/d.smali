.class public Lp5/d;
.super Lp5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp5/d$a;
    }
.end annotation


# instance fields
.field public final a:Lp5/d$a;

.field public final b:LE5/j;


# direct methods
.method public constructor <init>(LE5/j;LE5/k$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp5/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp5/d;->b:LE5/j;

    .line 5
    .line 6
    new-instance p1, Lp5/d$a;

    .line 7
    .line 8
    invoke-direct {p1, p0, p2}, Lp5/d$a;-><init>(Lp5/d;LE5/k$d;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lp5/d;->a:Lp5/d$a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/d;->b:LE5/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/d;->b:LE5/j;

    .line 2
    .line 3
    iget-object v0, v0, LE5/j;->a:Ljava/lang/String;

    .line 4
    .line 5
    return-object v0
.end method

.method public j(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/d;->b:LE5/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE5/j;->c(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public o()Lp5/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/d;->a:Lp5/d$a;

    .line 2
    .line 3
    return-object v0
.end method
