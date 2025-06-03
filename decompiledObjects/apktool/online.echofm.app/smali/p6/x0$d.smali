.class public final Lp6/x0$d;
.super Lu6/q$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp6/x0;->A(Ljava/lang/Object;Lp6/C0;Lp6/w0;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lp6/x0;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu6/q;Lp6/x0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lp6/x0$d;->d:Lp6/x0;

    .line 2
    .line 3
    iput-object p3, p0, Lp6/x0$d;->e:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lu6/q$a;-><init>(Lu6/q;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu6/q;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp6/x0$d;->f(Lu6/q;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public f(Lu6/q;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p1, p0, Lp6/x0$d;->d:Lp6/x0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lp6/x0;->b0()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lp6/x0$d;->e:Ljava/lang/Object;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Lu6/p;->a()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    return-object p1
.end method
