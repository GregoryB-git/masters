.class public final Lx3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/Set;

.field public b:Lw3/a$b;

.field public c:LQ2/a;

.field public d:Lx3/c;


# direct methods
.method public constructor <init>(LQ2/a;Lw3/a$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lx3/d;->b:Lw3/a$b;

    .line 5
    .line 6
    iput-object p1, p0, Lx3/d;->c:LQ2/a;

    .line 7
    .line 8
    new-instance p1, Lx3/c;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Lx3/c;-><init>(Lx3/d;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lx3/d;->d:Lx3/c;

    .line 14
    .line 15
    iget-object p2, p0, Lx3/d;->c:LQ2/a;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, LQ2/a;->f(LQ2/a$a;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lx3/d;->a:Ljava/util/Set;

    .line 26
    .line 27
    return-void
.end method

.method public static bridge synthetic a(Lx3/d;)Lw3/a$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lx3/d;->b:Lw3/a$b;

    .line 2
    .line 3
    return-object p0
.end method
