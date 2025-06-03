.class public final Lx0/L$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/x$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Li0/g$a;

.field public b:Lx0/F$a;

.field public c:Lp0/A;

.field public d:LB0/m;

.field public e:I


# direct methods
.method public constructor <init>(Li0/g$a;LF0/x;)V
    .locals 1

    .line 1
    new-instance v0, Lx0/M;

    invoke-direct {v0, p2}, Lx0/M;-><init>(LF0/x;)V

    invoke-direct {p0, p1, v0}, Lx0/L$b;-><init>(Li0/g$a;Lx0/F$a;)V

    return-void
.end method

.method public constructor <init>(Li0/g$a;Lx0/F$a;)V
    .locals 6

    .line 2
    new-instance v3, Lp0/l;

    invoke-direct {v3}, Lp0/l;-><init>()V

    new-instance v4, LB0/k;

    invoke-direct {v4}, LB0/k;-><init>()V

    const/high16 v5, 0x100000

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lx0/L$b;-><init>(Li0/g$a;Lx0/F$a;Lp0/A;LB0/m;I)V

    return-void
.end method

.method public constructor <init>(Li0/g$a;Lx0/F$a;Lp0/A;LB0/m;I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/L$b;->a:Li0/g$a;

    iput-object p2, p0, Lx0/L$b;->b:Lx0/F$a;

    iput-object p3, p0, Lx0/L$b;->c:Lp0/A;

    iput-object p4, p0, Lx0/L$b;->d:LB0/m;

    iput p5, p0, Lx0/L$b;->e:I

    return-void
.end method

.method public static synthetic a(LF0/x;Ll0/y1;)Lx0/F;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lx0/L$b;->c(LF0/x;Ll0/y1;)Lx0/F;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(LF0/x;Ll0/y1;)Lx0/F;
    .locals 0

    .line 1
    new-instance p1, Lx0/d;

    .line 2
    .line 3
    invoke-direct {p1, p0}, Lx0/d;-><init>(LF0/x;)V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method


# virtual methods
.method public b(Ld0/u;)Lx0/L;
    .locals 9

    .line 1
    iget-object v0, p1, Ld0/u;->b:Ld0/u$h;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lx0/L;

    .line 7
    .line 8
    iget-object v3, p0, Lx0/L$b;->a:Li0/g$a;

    .line 9
    .line 10
    iget-object v4, p0, Lx0/L$b;->b:Lx0/F$a;

    .line 11
    .line 12
    iget-object v1, p0, Lx0/L$b;->c:Lp0/A;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Lp0/A;->a(Ld0/u;)Lp0/x;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    iget-object v6, p0, Lx0/L$b;->d:LB0/m;

    .line 19
    .line 20
    iget v7, p0, Lx0/L$b;->e:I

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    move-object v1, v0

    .line 24
    move-object v2, p1

    .line 25
    invoke-direct/range {v1 .. v8}, Lx0/L;-><init>(Ld0/u;Li0/g$a;Lx0/F$a;Lp0/x;LB0/m;ILx0/L$a;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
