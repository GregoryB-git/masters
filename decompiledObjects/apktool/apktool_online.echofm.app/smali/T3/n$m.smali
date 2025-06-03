.class public LT3/n$m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT3/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "m"
.end annotation


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:LT3/n$j;

.field public c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;LT3/n$j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LT3/n$m;->a:Ljava/util/Map;

    iput-object p3, p0, LT3/n$m;->b:LT3/n$j;

    const/4 p1, 0x0

    iput-boolean p1, p0, LT3/n$m;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;LT3/n$j;LT3/n$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, LT3/n$m;-><init>(Ljava/lang/String;Ljava/util/Map;LT3/n$j;)V

    return-void
.end method

.method public static synthetic a(LT3/n$m;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, LT3/n$m;->f()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(LT3/n$m;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-virtual {p0}, LT3/n$m;->e()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(LT3/n$m;)LT3/n$j;
    .locals 0

    .line 1
    invoke-virtual {p0}, LT3/n$m;->d()LT3/n$j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final d()LT3/n$j;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$m;->b:LT3/n$j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$m;->a:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LT3/n$m;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, LT3/n$m;->c:Z

    .line 9
    .line 10
    return v0
.end method
