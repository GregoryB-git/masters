.class public final Lx3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lw3/a$b;

.field public b:LQ2/a;

.field public c:Lx3/e;


# direct methods
.method public constructor <init>(LQ2/a;Lw3/a$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lx3/f;->a:Lw3/a$b;

    .line 5
    .line 6
    iput-object p1, p0, Lx3/f;->b:LQ2/a;

    .line 7
    .line 8
    new-instance p1, Lx3/e;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Lx3/e;-><init>(Lx3/f;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lx3/f;->c:Lx3/e;

    .line 14
    .line 15
    iget-object p2, p0, Lx3/f;->b:LQ2/a;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, LQ2/a;->f(LQ2/a$a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static bridge synthetic a(Lx3/f;)Lw3/a$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lx3/f;->a:Lw3/a$b;

    .line 2
    .line 3
    return-object p0
.end method
