.class public final LE4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU5/a;


# instance fields
.field public final a:LE4/a;


# direct methods
.method public constructor <init>(LE4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE4/f;->a:LE4/a;

    .line 5
    .line 6
    return-void
.end method

.method public static a(LE4/a;)LE4/f;
    .locals 1

    .line 1
    new-instance v0, LE4/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE4/f;-><init>(LE4/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static c(LE4/a;)Lcom/google/firebase/perf/config/RemoteConfigManager;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE4/a;->e()Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lq5/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public b()Lcom/google/firebase/perf/config/RemoteConfigManager;
    .locals 1

    .line 1
    iget-object v0, p0, LE4/f;->a:LE4/a;

    .line 2
    .line 3
    invoke-static {v0}, LE4/f;->c(LE4/a;)Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE4/f;->b()Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
