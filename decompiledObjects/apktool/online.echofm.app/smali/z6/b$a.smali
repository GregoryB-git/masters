.class public final Lz6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz6/b;->b(LV2/j;LV2/a;LX5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lp6/l;


# direct methods
.method public constructor <init>(Lp6/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz6/b$a;->a:Lp6/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LV2/j;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, LV2/j;->i()Ljava/lang/Exception;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, LV2/j;->l()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lz6/b$a;->a:Lp6/l;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {p1, v1, v0, v1}, Lp6/l$a;->a(Lp6/l;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lz6/b$a;->a:Lp6/l;

    .line 22
    .line 23
    sget-object v1, LV5/n;->o:LV5/n$a;

    .line 24
    .line 25
    invoke-virtual {p1}, LV2/j;->j()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, LV5/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {v0, p1}, LX5/d;->resumeWith(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object p1, p0, Lz6/b$a;->a:Lp6/l;

    .line 38
    .line 39
    sget-object v1, LV5/n;->o:LV5/n$a;

    .line 40
    .line 41
    invoke-static {v0}, LV5/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, LV5/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {p1, v0}, LX5/d;->resumeWith(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-void
.end method
