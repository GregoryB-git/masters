.class public LH3/q$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH3/q$b;->a()LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LH3/q$b;


# direct methods
.method public constructor <init>(LH3/q$b;Ljava/util/concurrent/Executor;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH3/q$b$a;->c:LH3/q$b;

    .line 2
    .line 3
    iput-object p2, p0, LH3/q$b$a;->a:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iput-object p3, p0, LH3/q$b$a;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)LV2/j;
    .locals 0

    .line 1
    check-cast p1, LO3/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LH3/q$b$a;->b(LO3/d;)LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(LO3/d;)LV2/j;
    .locals 4

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
    const-string v1, "Received null app settings, cannot send reports at crash time."

    .line 9
    .line 10
    invoke-virtual {p1, v1}, LE3/f;->k(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    const/4 p1, 0x2

    .line 19
    new-array p1, p1, [LV2/j;

    .line 20
    .line 21
    iget-object v1, p0, LH3/q$b$a;->c:LH3/q$b;

    .line 22
    .line 23
    iget-object v1, v1, LH3/q$b;->t:LH3/q;

    .line 24
    .line 25
    invoke-static {v1}, LH3/q;->n(LH3/q;)LV2/j;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x0

    .line 30
    aput-object v1, p1, v2

    .line 31
    .line 32
    iget-object v1, p0, LH3/q$b$a;->c:LH3/q$b;

    .line 33
    .line 34
    iget-object v1, v1, LH3/q$b;->t:LH3/q;

    .line 35
    .line 36
    invoke-static {v1}, LH3/q;->h(LH3/q;)LH3/V;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v2, p0, LH3/q$b$a;->a:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    iget-object v3, p0, LH3/q$b$a;->c:LH3/q$b;

    .line 43
    .line 44
    iget-boolean v3, v3, LH3/q$b;->s:Z

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, LH3/q$b$a;->b:Ljava/lang/String;

    .line 49
    .line 50
    :cond_1
    invoke-virtual {v1, v2, v0}, LH3/V;->x(Ljava/util/concurrent/Executor;Ljava/lang/String;)LV2/j;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const/4 v1, 0x1

    .line 55
    aput-object v0, p1, v1

    .line 56
    .line 57
    invoke-static {p1}, LV2/m;->g([LV2/j;)LV2/j;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
.end method
