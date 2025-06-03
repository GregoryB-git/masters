.class public Lq3/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/i$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lq3/j;


# direct methods
.method public constructor <init>(Lq3/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/i$b;->a:Lq3/j;

    return-void
.end method

.method public synthetic constructor <init>(Lq3/j;Lq3/i$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lq3/i$b;-><init>(Lq3/j;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "GmsCore_OpenSSL"

    .line 2
    .line 3
    const-string v1, "AndroidOpenSSL"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lq3/i;->b([Ljava/lang/String;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    move-object v2, v1

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/security/Provider;

    .line 30
    .line 31
    :try_start_0
    iget-object v4, p0, Lq3/i$b;->a:Lq3/j;

    .line 32
    .line 33
    invoke-interface {v4, p1, v3}, Lq3/j;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    return-object p1

    .line 38
    :catch_0
    move-exception v3

    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    move-object v2, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v0, p0, Lq3/i$b;->a:Lq3/j;

    .line 44
    .line 45
    invoke-interface {v0, p1, v1}, Lq3/j;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1
.end method
