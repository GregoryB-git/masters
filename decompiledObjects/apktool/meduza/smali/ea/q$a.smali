.class public final Lea/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lea/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lu9/d;Lub/e;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu9/d;",
            "Lub/e<",
            "-",
            "Lea/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lea/q$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lea/q$a$a;

    iget v1, v0, Lea/q$a$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lea/q$a$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lea/q$a$a;

    invoke-direct {v0, p0, p2}, Lea/q$a$a;-><init>(Lea/q$a;Lub/e;)V

    :goto_0
    iget-object p2, v0, Lea/q$a$a;->b:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lea/q$a$a;->d:I

    const-string v3, ""

    const-string v4, "InstallationId"

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lea/q$a$a;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p2

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lea/q$a$a;->a:Ljava/lang/Object;

    check-cast p1, Lu9/d;

    :try_start_1
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    :try_start_2
    invoke-interface {p1}, Lu9/d;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    const-string v2, "firebaseInstallations.getToken(false)"

    invoke-static {p2, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v0, Lea/q$a$a;->a:Ljava/lang/Object;

    iput v6, v0, Lea/q$a$a;->d:I

    invoke-static {p2, v0}, Lwc/c;->a(Lcom/google/android/gms/tasks/Task;Lea/q$a$a;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p2, Lu9/h;

    invoke-virtual {p2}, Lu9/h;->a()Ljava/lang/String;

    move-result-object p2

    const-string v2, "{\n          firebaseInst\u2026).await().token\n        }"

    invoke-static {p2, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p2

    const-string v2, "Error getting authentication token."

    invoke-static {v4, v2, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object p2, v3

    :goto_2
    :try_start_3
    invoke-interface {p1}, Lu9/d;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v2, "firebaseInstallations.id"

    invoke-static {p1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, v0, Lea/q$a$a;->a:Ljava/lang/Object;

    iput v5, v0, Lea/q$a$a;->d:I

    invoke-static {p1, v0}, Lwc/c;->a(Lcom/google/android/gms/tasks/Task;Lea/q$a$a;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    :try_start_4
    const-string v0, "{\n          firebaseInst\u2026ions.id.await()\n        }"

    invoke-static {p2, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-object v3, p2

    goto :goto_5

    :catch_2
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_4
    const-string v0, "Error getting Firebase installation id ."

    invoke-static {v4, v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_5
    new-instance p2, Lea/q;

    invoke-direct {p2, v3, p1}, Lea/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method
