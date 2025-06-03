.class public final LY1/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/P$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY1/q;->q(LY1/u$e;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:LY1/q;

.field public final synthetic c:LY1/u$e;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;LY1/q;LY1/u$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY1/q$c;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    iput-object p2, p0, LY1/q$c;->b:LY1/q;

    .line 4
    .line 5
    iput-object p3, p0, LY1/q$c;->c:LY1/u$e;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, LY1/q$c;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "com.facebook.platform.extra.USER_ID"

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string v2, "id"

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LY1/q$c;->b:LY1/q;

    .line 19
    .line 20
    iget-object v0, p0, LY1/q$c;->c:LY1/u$e;

    .line 21
    .line 22
    iget-object v1, p0, LY1/q$c;->a:Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, LY1/q;->t(LY1/u$e;Landroid/os/Bundle;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catch_0
    move-exception p1

    .line 29
    iget-object v0, p0, LY1/q$c;->b:LY1/q;

    .line 30
    .line 31
    invoke-virtual {v0}, LY1/A;->d()LY1/u;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, LY1/u$f;->w:LY1/u$f$c;

    .line 36
    .line 37
    iget-object v2, p0, LY1/q$c;->b:LY1/q;

    .line 38
    .line 39
    invoke-virtual {v2}, LY1/A;->d()LY1/u;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, LY1/u;->o()LY1/u$e;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const/16 v6, 0x8

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    const-string v3, "Caught exception"

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-static/range {v1 .. v7}, LY1/u$f$c;->d(LY1/u$f$c;LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LY1/u$f;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v0, p1}, LY1/u;->f(LY1/u$f;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    return-void
.end method

.method public b(Lx1/o;)V
    .locals 8

    .line 1
    iget-object v0, p0, LY1/q$c;->b:LY1/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LY1/A;->d()LY1/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LY1/u$f;->w:LY1/u$f$c;

    .line 8
    .line 9
    iget-object v2, p0, LY1/q$c;->b:LY1/q;

    .line 10
    .line 11
    invoke-virtual {v2}, LY1/A;->d()LY1/u;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, LY1/u;->o()LY1/u$e;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    :goto_0
    move-object v4, p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    const/16 v6, 0x8

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    const-string v3, "Caught exception"

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-static/range {v1 .. v7}, LY1/u$f$c;->d(LY1/u$f$c;LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LY1/u$f;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p1}, LY1/u;->f(LY1/u$f;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
