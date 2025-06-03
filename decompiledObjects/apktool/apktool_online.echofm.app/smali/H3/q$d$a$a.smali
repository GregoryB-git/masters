.class public LH3/q$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH3/q$d$a;->a()LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:LH3/q$d$a;


# direct methods
.method public constructor <init>(LH3/q$d$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH3/q$d$a$a;->b:LH3/q$d$a;

    .line 2
    .line 3
    iput-object p2, p0, LH3/q$d$a$a;->a:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)LV2/j;
    .locals 0

    .line 1
    check-cast p1, LO3/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LH3/q$d$a$a;->b(LO3/d;)LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(LO3/d;)LV2/j;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string v1, "Received null app settings at app startup. Cannot send cached reports"

    .line 9
    .line 10
    invoke-virtual {p1, v1}, LE3/f;->k(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-static {v0}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object p1, p0, LH3/q$d$a$a;->b:LH3/q$d$a;

    .line 19
    .line 20
    iget-object p1, p1, LH3/q$d$a;->p:LH3/q$d;

    .line 21
    .line 22
    iget-object p1, p1, LH3/q$d;->b:LH3/q;

    .line 23
    .line 24
    invoke-static {p1}, LH3/q;->n(LH3/q;)LV2/j;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LH3/q$d$a$a;->b:LH3/q$d$a;

    .line 28
    .line 29
    iget-object p1, p1, LH3/q$d$a;->p:LH3/q$d;

    .line 30
    .line 31
    iget-object p1, p1, LH3/q$d;->b:LH3/q;

    .line 32
    .line 33
    invoke-static {p1}, LH3/q;->h(LH3/q;)LH3/V;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, p0, LH3/q$d$a$a;->a:Ljava/util/concurrent/Executor;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, LH3/V;->w(Ljava/util/concurrent/Executor;)LV2/j;

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LH3/q$d$a$a;->b:LH3/q$d$a;

    .line 43
    .line 44
    iget-object p1, p1, LH3/q$d$a;->p:LH3/q$d;

    .line 45
    .line 46
    iget-object p1, p1, LH3/q$d;->b:LH3/q;

    .line 47
    .line 48
    iget-object p1, p1, LH3/q;->r:LV2/k;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, LV2/k;->e(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0
.end method
